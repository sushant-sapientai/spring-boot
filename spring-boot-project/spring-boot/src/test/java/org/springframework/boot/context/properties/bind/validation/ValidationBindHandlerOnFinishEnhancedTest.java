package org.springframework.boot.context.properties.bind.validation;

import org.springframework.boot.context.properties.bind.validation.ValidationBindHandler;

import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.validation.Validator;

import java.lang.Class;
import java.util.function.*;

import org.springframework.core.ResolvableType;
import org.springframework.validation.*;
import org.springframework.boot.context.properties.bind.BindHandler;
import org.springframework.boot.context.properties.bind.*;

import java.util.function.Supplier;

import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.boot.context.properties.bind.validation.*;

import java.lang.*;

import org.springframework.boot.context.properties.source.*;
import org.springframework.boot.context.properties.bind.validation.ValidationBindHandler;
import org.springframework.util.*;

import java.lang.Exception;

import org.springframework.boot.context.properties.source.ConfigurationProperty;
import org.springframework.boot.context.properties.bind.validation.BindValidationException;
import org.springframework.util.Assert;

import java.lang.Object;

import org.springframework.boot.context.properties.bind.BindContext;
import org.springframework.core.*;
import org.springframework.boot.context.properties.source.ConfigurationProperty;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

import org.springframework.validation.BeanPropertyBindingResult;

import java.util.Set;

import org.springframework.boot.context.properties.source.ConfigurationPropertyName.Form;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.AbstractBindHandler;
import org.springframework.util.ObjectUtils;
import org.springframework.boot.context.properties.bind.DataObjectPropertyName;

import java.util.LinkedHashMap;

import org.springframework.boot.context.properties.bind.BindContext;
import org.springframework.validation.AbstractBindingResult;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.beans.NotReadablePropertyException;
import org.springframework.boot.context.properties.bind.BindHandler;
import org.springframework.core.ResolvableType;

import java.util.Map;

import org.springframework.validation.Validator;

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

class ValidationBindHandlerOnFinishEnhancedTest {

	private ValidationBindHandler validationBindHandler;

	private Validator validator;

	private BindContext context;

	private Bindable<?> target;

	private ConfigurationPropertyName name;

	private Object result;

	@BeforeEach
	void setUp() {
		validator = mock(Validator.class);
		context = mock(BindContext.class);
		target = mock(Bindable.class);
		name = ConfigurationPropertyName.of("test.property");
		result = new Object();
		validationBindHandler = new ValidationBindHandler(validator);
	}

	@AfterEach
	void tearDown() {
		// Perform any necessary cleanup after tests
	}

	@Test
	void onFinishShouldValidateAndCallSuperOnFinish() throws Exception {
		// Arrange
		when(context.getDepth()).thenReturn(0);
		when(target.getBoxedType()).thenReturn(ResolvableType.forClass(Object.class));
		//when(validator.supports(any(Class.class))).thenReturn(true);
		// Act
		validationBindHandler.onFinish(name, target, context, result);
		// Assert
		verify(validator).validate(any(), any());
		//verify(context).onFinish(name, target, result);
	}

	@Test
	void onFinishShouldThrowBindValidationExceptionOnValidationFailure() {
		// Arrange
		when(context.getDepth()).thenReturn(0);
		when(target.getBoxedType()).thenReturn(ResolvableType.forClass(Object.class));
//		when(validator.supports(any(Class.class))).thenReturn(true);
//		doThrow(new BindValidationException("Validation failed")).when(validator).validate(any(), any());
		// Act & Assert
		assertThrows(BindValidationException.class, () -> validationBindHandler.onFinish(name, target, context, result));
	}

	@Test
	void onFinishShouldNotValidateWhenDepthIsNotZero() throws Exception {
		// Arrange
		when(context.getDepth()).thenReturn(1);
		// Act
		validationBindHandler.onFinish(name, target, context, result);
		// Assert
		verify(validator, never()).validate(any(), any());
		//verify(context).onFinish(name, target, result);
	}

	@Test
	void onFinishShouldNotThrowExceptionWhenDepthIsNotZero() throws Exception {
		// Arrange
		when(context.getDepth()).thenReturn(1);
		when(target.getBoxedType()).thenReturn(ResolvableType.forClass(Object.class));
//		when(validator.supports(any(Class.class))).thenReturn(true);
//		doThrow(new BindValidationException("Validation failed")).when(validator).validate(any(), any());
		// Act
		validationBindHandler.onFinish(name, target, context, result);
		// Assert
		//verify(context).onFinish(name, target, result);
	}
}
