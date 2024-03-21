package org.springframework.boot.context.config;

import org.springframework.boot.context.config.StandardConfigDataLocationResolver;

import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.boot.context.config.LocationResourceLoader;

import java.util.function.*;

import org.springframework.boot.env.*;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.util.StringUtils;

import java.util.function.Supplier;

import org.apache.commons.logging.impl.NoOpLog;

import org.springframework.boot.env.PropertySourceLoader;

import java.lang.IllegalStateException;
import java.util.Iterator;

import org.springframework.boot.logging.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.boot.context.config.StandardConfigDataResource;
import org.springframework.boot.context.config.ConfigDataLocationResolverContext;
import org.springframework.boot.logging.DeferredLogFactory;
import org.springframework.boot.context.config.*;
import org.springframework.boot.context.config.StandardConfigDataReference;

import java.util.List;
import java.lang.Class;

import org.apache.commons.logging.impl.*;

import org.springframework.boot.context.config.ConfigDataLocationNotFoundException;
import org.springframework.core.io.Resource;
import org.springframework.core.log.*;
import org.springframework.boot.context.properties.bind.*;
import org.springframework.core.io.ResourceLoader;

import java.lang.ClassLoader;

import org.springframework.core.log.LogMessage;
import org.springframework.boot.context.config.StandardConfigDataLocationResolver;

import java.lang.*;

import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.util.*;
import org.springframework.core.io.*;
import org.springframework.util.ObjectUtils;
import org.springframework.boot.context.config.ConfigDataResource;
import org.springframework.boot.context.config.Profiles;
import org.springframework.util.Assert;
import org.springframework.boot.context.config.ConfigDataLocation;
import org.springframework.core.io.support.*;

import java.util.*;
import java.util.LinkedHashSet;

import org.springframework.core.io.ResourceLoader;

import java.util.Set;
import java.util.regex.Matcher;

import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.boot.env.PropertySourceLoader;
import org.springframework.core.Ordered;

import java.util.ArrayList;

import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.regex.Pattern;

import org.apache.commons.logging.Log;

import org.springframework.core.io.Resource;
import org.springframework.boot.context.config.LocationResourceLoader.ResourceType;

import java.util.Deque;

import org.springframework.util.ObjectUtils;
import org.springframework.core.io.ClassPathResource;

import java.util.ArrayDeque;

import org.springframework.core.log.LogMessage;
import org.springframework.boot.logging.DeferredLogFactory;
import org.springframework.core.env.Environment;

import java.util.Collection;
import java.util.Arrays;
import java.io.File;

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

class StandardConfigDataLocationResolverResolveProfileSpecificEnhancedTest {

	private StandardConfigDataLocationResolver resolver;

	@Mock
	private DeferredLogFactory logFactory;

	@Mock
	private Binder binder;

	@Mock
	private ResourceLoader resourceLoader;

	@Mock
	private ConfigDataLocationResolverContext context;

	@Mock
	private ConfigDataLocation location;

	@Mock
	private Profiles profiles;

	@Mock
	private StandardConfigDataReference reference;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		resolver = new StandardConfigDataLocationResolver(logFactory, binder, resourceLoader);
	}

	@AfterEach
	void tearDown() {
		// Perform any necessary cleanup after tests
	}

	@Test
	void resolveProfileSpecific_WithValidProfiles_ShouldResolveResources() {
		// Arrange
		String[] activeProfiles = { "dev", "test" };
		when(profiles.iterator()).thenReturn(List.of(activeProfiles).iterator());
		when(location.split()).thenReturn(new ConfigDataLocation[] { location });
		when(context.getBinder()).thenReturn(binder);
		//when(binder.bind(eq(StandardConfigDataLocationResolver.CONFIG_NAME_PROPERTY), eq(String[].class))).thenReturn(BindResult.of(new String[] { "application" }));
		when(location.isOptional()).thenReturn(false);
		//when(location.getResourceLocation()).thenReturn("classpath:/config/");
		when(reference.getResourceLocation()).thenReturn("classpath:/config/application-dev.yml");
		Set<StandardConfigDataReference> references = Set.of(reference);
		//when(resolver.resolveProfileSpecific(context, location, profiles)).thenReturn(List.of(new StandardConfigDataResource(reference)));
		// Act
		List<StandardConfigDataResource> resources = resolver.resolveProfileSpecific(context, location, profiles);
		// Assert
		assertNotNull(resources);
		assertFalse(resources.isEmpty());
		assertEquals("classpath:/config/application-dev.yml", resources.get(0).getReference().getResourceLocation());
	}

	@Test
	void resolveProfileSpecific_WithNoProfiles_ShouldResolveDefaultResources() {
		// Arrange
		//when(profiles.iterator()).thenReturn(List.of().iterator());
		when(location.split()).thenReturn(new ConfigDataLocation[] { location });
		when(context.getBinder()).thenReturn(binder);
		//when(binder.bind(eq(StandardConfigDataLocationResolver.CONFIG_NAME_PROPERTY), eq(String[].class))).thenReturn(BindResult.of(new String[] { "application" }));
		when(location.isOptional()).thenReturn(false);
		//when(location.getResourceLocation()).thenReturn("classpath:/config/");
		when(reference.getResourceLocation()).thenReturn("classpath:/config/application.yml");
		Set<StandardConfigDataReference> references = Set.of(reference);
		//when(resolver.resolveProfileSpecific(context, location, profiles)).thenReturn(List.of(new StandardConfigDataResource(reference)));
		// Act
		List<StandardConfigDataResource> resources = resolver.resolveProfileSpecific(context, location, profiles);
		// Assert
		assertNotNull(resources);
		assertFalse(resources.isEmpty());
		assertEquals("classpath:/config/application.yml", resources.get(0).getReference().getResourceLocation());
	}

	@Test
	void resolveProfileSpecific_WithInvalidLocation_ShouldThrowException() {
		// Arrange
		when(profiles.iterator()).thenReturn(List.of("dev").iterator());
		when(location.split()).thenReturn(new ConfigDataLocation[] { location });
		when(location.isOptional()).thenReturn(false);
		//when(location.getResourceLocation()).thenReturn("invalid-location");
		// Act & Assert
		assertThrows(ConfigDataResourceNotFoundException.class, () -> resolver.resolveProfileSpecific(context, location, profiles));
	}
}
