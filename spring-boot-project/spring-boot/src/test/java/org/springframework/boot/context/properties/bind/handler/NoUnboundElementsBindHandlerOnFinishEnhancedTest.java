package org.springframework.boot.context.properties.bind.handler;

import org.springframework.boot.context.properties.bind.handler.NoUnboundElementsBindHandler;

import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.UnboundConfigurationPropertiesException;

import java.util.function.*;

import org.springframework.boot.context.properties.source.ConfigurationPropertySource;
import org.springframework.boot.context.properties.bind.BindHandler;
import org.springframework.boot.context.properties.bind.*;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import java.lang.*;

import org.springframework.boot.context.properties.source.IterableConfigurationPropertySource;

import java.util.function.Predicate;

import org.springframework.boot.context.properties.source.*;
import org.springframework.boot.context.properties.bind.handler.*;
import org.springframework.util.*;

import java.util.Iterator;
import java.lang.Exception;
import java.util.function.Function;

import org.springframework.boot.context.properties.source.ConfigurationProperty;

import java.lang.Iterable;

import org.springframework.boot.context.properties.bind.handler.NoUnboundElementsBindHandler;
import org.springframework.util.Assert;

import java.lang.Object;

import org.springframework.boot.context.properties.bind.BindContext;

import java.util.*;

import org.springframework.boot.context.properties.source.ConfigurationProperty;
import org.springframework.boot.context.properties.bind.BindContext;
import org.springframework.boot.context.properties.source.IterableConfigurationPropertySource;

import java.util.function.Function;

import org.springframework.boot.context.properties.bind.UnboundConfigurationPropertiesException;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import java.util.Set;
import java.util.TreeSet;

import org.springframework.boot.context.properties.source.ConfigurationPropertySource;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.AbstractBindHandler;
import org.springframework.boot.context.properties.bind.BindHandler;

import java.util.HashSet;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsInstanceOf.*;
import static org.hamcrest.MatcherAssert.*;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;

import org.hamcrest.Matchers;
import org.hamcrest.core.IsInstanceOf;
import org.hamcrest.MatcherAssert;
import org.mockito.Mockito;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;
import org.mockito.MockitoAnnotations;
import org.mockito.Mock;

import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.net.*;
import java.beans.*;

import javax.net.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

class NoUnboundElementsBindHandlerOnFinishEnhancedTest {

	private NoUnboundElementsBindHandler handler;

	private BindHandler parentHandler;

	private BindContext context;

	private ConfigurationPropertyName name;

	private Bindable<?> target;

	private Object result;

	private Function<ConfigurationPropertySource, Boolean> filter;

	private IterableConfigurationPropertySource source;

	@BeforeEach
	void setUp() {
		parentHandler = mock(BindHandler.class);
		context = mock(BindContext.class);
		name = ConfigurationPropertyName.of("test");
		target = Bindable.of(Object.class);
		result = new Object();
		filter = mock(Function.class);
		source = mock(IterableConfigurationPropertySource.class);
		handler = new NoUnboundElementsBindHandler(parentHandler, filter);
	}

	@AfterEach
	void tearDown() {
		// Clean up after tests if necessary
	}

	@Test
	void onFinishWithNoUnboundElementsShouldNotThrowException() throws Exception {
		when(context.getDepth()).thenReturn(0);
		when(context.getSources()).thenReturn(Set.of(source));
		when(filter.apply(any())).thenReturn(true);
		when(source.iterator()).thenReturn(mock(Iterator.class));
		handler.onFinish(name, target, context, result);
		verify(context).getDepth();
		verify(context).getSources();
		verify(filter).apply(any());
		verify(source).iterator();
	}

	@Test
	void onFinishWithUnboundElementsShouldThrowException() {
		when(context.getDepth()).thenReturn(0);
		when(context.getSources()).thenReturn(Set.of(source));
		when(filter.apply(any())).thenReturn(true);
		ConfigurationProperty unboundProperty = mock(ConfigurationProperty.class);
		ConfigurationPropertyName unboundPropertyName = ConfigurationPropertyName.of("unbound");
		when(unboundProperty.getName()).thenReturn(unboundPropertyName);
		Iterator<ConfigurationProperty> iterator = mock(Iterator.class);
		when(iterator.hasNext()).thenReturn(true, false);
		when(iterator.next()).thenReturn(unboundProperty);
		//when(source.iterator()).thenReturn(iterator);
		Exception exception = assertThrows(UnboundConfigurationPropertiesException.class, () -> handler.onFinish(name, target, context, result));
		verify(context).getDepth();
		verify(context).getSources();
		verify(filter).apply(any());
		verify(source).iterator();
		verify(iterator, atLeastOnce()).hasNext();
		verify(iterator).next();
	}

	@Test
	void onFinishWithDepthGreaterThanZeroShouldNotCheckUnboundElements() throws Exception {
		when(context.getDepth()).thenReturn(1);
		handler.onFinish(name, target, context, result);
		verify(context).getDepth();
		verify(context, never()).getSources();
		verify(filter, never()).apply(any());
		verify(source, never()).iterator();
	}
}
