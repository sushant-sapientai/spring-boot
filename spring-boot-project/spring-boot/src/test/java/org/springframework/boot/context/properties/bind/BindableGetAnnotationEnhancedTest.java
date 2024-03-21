package org.springframework.boot.context.properties.bind;

import org.springframework.boot.context.properties.bind.Bindable;

import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.BindMethod;

import java.lang.Class;
import java.util.function.*;

import org.springframework.core.ResolvableType;
import org.springframework.boot.context.properties.bind.*;

import java.util.function.Supplier;
import java.lang.*;

import org.springframework.core.style.*;

import java.lang.annotation.*;

import org.springframework.util.*;
import org.springframework.core.style.ToStringCreator;
import org.springframework.util.ObjectUtils;

import java.lang.annotation.Annotation;
import java.util.EnumSet;

import org.springframework.util.Assert;

import java.lang.Object;

import org.springframework.core.*;

import java.util.*;

import org.springframework.boot.context.properties.source.ConfigurationProperty;

import java.lang.reflect.Array;

import org.springframework.core.style.ToStringCreator;
import org.springframework.util.Assert;

import java.util.Set;
import java.util.EnumSet;
import java.util.function.Supplier;
import java.util.List;

import org.springframework.core.ResolvableType;

import java.util.Arrays;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import java.lang.annotation.Annotation;

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

public class BindableGetAnnotationEnhancedTest {

	private Bindable<?> bindable;

	private Annotation[] annotations;

	@Retention(RetentionPolicy.RUNTIME)
	private @interface TestAnnotation {
	}

	@BeforeEach
	void setUp() {
		annotations = new Annotation[] { mock(TestAnnotation.class) };
		ResolvableType mockType = mock(ResolvableType.class);
		Supplier<?> mockSupplier = mock(Supplier.class);
		//bindable = new Bindable<>(mockType, mockType, mockSupplier, annotations, null, null);
	}

	@AfterEach
	void tearDown() {
		bindable = null;
		annotations = null;
	}

	@Test
	void getAnnotation_WhenAnnotationPresent_ShouldReturnAnnotation() {
		// Arrange
		Class<TestAnnotation> annotationType = TestAnnotation.class;
		//when(annotations[0].annotationType()).thenReturn(annotationType);
		// Act
		TestAnnotation result = bindable.getAnnotation(annotationType);
		// Assert
		assertSame(annotations[0], result);
	}

	@Test
	void getAnnotation_WhenAnnotationNotPresent_ShouldReturnNull() {
		// Arrange
		Class<Retention> annotationType = Retention.class;
		// Act
		Retention result = bindable.getAnnotation(annotationType);
		// Assert
		assertNull(result);
	}
}
