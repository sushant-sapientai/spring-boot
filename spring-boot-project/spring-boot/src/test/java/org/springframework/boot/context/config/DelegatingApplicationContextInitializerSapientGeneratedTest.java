package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.env.ConfigurableEnvironment;

import org.mockito.stubbing.Answer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;
import org.springframework.core.GenericTypeResolver;
import org.springframework.util.Assert;

import java.util.function.Supplier;

import org.springframework.context.ApplicationContextException;

import org.mockito.MockedStatic;

import org.springframework.beans.BeanUtils;
import org.springframework.context.ConfigurableApplicationContext;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DelegatingApplicationContextInitializerSapientGeneratedTest {

	private final ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);

	private final ConfigurableApplicationContext contextMock = mock(ConfigurableApplicationContext.class);

	//Sapient generated method id: ${35f75ba5-16f0-3861-bf9e-72876a53136d}, hash: B6E08DCABDBD5C2CC4CEE161D15585B3
	@Disabled()
	@Test()
	void initializeWhenCaughtClassNotFoundExceptionThrowsApplicationContextException() throws LinkageError, ClassNotFoundException {
		/* Branches:
		 * (StringUtils.hasLength(classNames)) : true  #  inside getInitializerClasses method
		 * (for-each(StringUtils.tokenizeToStringArray(classNames, ","))) : true  #  inside getInitializerClasses method
		 * (catch-exception (ClassNotFoundException)) : true  #  inside getInitializerClass method
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class, CALLS_REAL_METHODS)) {
			doReturn(configurableEnvironmentMock).when(contextMock).getEnvironment();
			doReturn("B").when(configurableEnvironmentMock).getProperty("context.initializer.classes");
			ClassNotFoundException classNotFoundException = new ClassNotFoundException();
			classUtils.when(() -> ClassUtils.forName(eq("A"), (ClassLoader) any())).thenThrow(classNotFoundException);
			DelegatingApplicationContextInitializer target = new DelegatingApplicationContextInitializer();
			//Act Statement(s)
			final ApplicationContextException result = assertThrows(ApplicationContextException.class, () -> {
				target.initialize(contextMock);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getCause(), is(instanceOf(classNotFoundException.getClass())));
				verify(contextMock, atLeast(1)).getEnvironment();
				verify(configurableEnvironmentMock, atLeast(1)).getProperty("context.initializer.classes");
				classUtils.verify(() -> ClassUtils.forName(eq("A"), (ClassLoader) any()), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${ffe9eea1-be58-357d-980e-e5ce8b3bb69f}, hash: 5090F097C10BBC21BD9178ADA7E5AC72
	@Disabled()
	@Test()
	void initializeWhenInitializersIsNotEmpty() throws LinkageError, ClassNotFoundException {
		/* Branches:
		 * (StringUtils.hasLength(classNames)) : true  #  inside getInitializerClasses method
		 * (for-each(StringUtils.tokenizeToStringArray(classNames, ","))) : true  #  inside getInitializerClasses method
		 * (!initializerClasses.isEmpty()) : true
		 * (for-each(initializerClasses)) : true  #  inside applyInitializerClasses method
		 * (for-each(initializers)) : true  #  inside applyInitializers method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ApplicationContextInitializer applicationContextInitializerMock = mock(ApplicationContextInitializer.class);
		try (MockedStatic<BeanUtils> beanUtils = mockStatic(BeanUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<GenericTypeResolver> genericTypeResolver = mockStatic(GenericTypeResolver.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class, CALLS_REAL_METHODS)) {
			doReturn(configurableEnvironmentMock).when(contextMock).getEnvironment();
			doReturn("A").when(configurableEnvironmentMock).getProperty("context.initializer.classes");
			classUtils.when(() -> ClassUtils.forName(eq("return_of_tokenizeToStringArrayItem1"), (ClassLoader) any())).thenReturn(Object.class);
			_assert.when(() -> Assert.isAssignable(ApplicationContextInitializer.class, Object.class)).thenAnswer((Answer<Void>) invocation -> null);
			genericTypeResolver.when(() -> GenericTypeResolver.resolveTypeArgument(Object.class, ApplicationContextInitializer.class)).thenReturn(Object.class);
			_assert.when(() -> Assert.isAssignable(eq(Object.class), eq(ConfigurableApplicationContext.class), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			beanUtils.when(() -> BeanUtils.instantiateClass(Object.class)).thenReturn(applicationContextInitializerMock);
			doNothing().when(applicationContextInitializerMock).initialize(contextMock);
			DelegatingApplicationContextInitializer target = new DelegatingApplicationContextInitializer();
			//Act Statement(s)
			target.initialize(contextMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(contextMock, atLeast(1)).getEnvironment();
				verify(configurableEnvironmentMock, atLeast(1)).getProperty("context.initializer.classes");
				classUtils.verify(() -> ClassUtils.forName(eq("return_of_tokenizeToStringArrayItem1"), (ClassLoader) any()), atLeast(1));
				_assert.verify(() -> Assert.isAssignable(ApplicationContextInitializer.class, Object.class), atLeast(1));
				genericTypeResolver.verify(() -> GenericTypeResolver.resolveTypeArgument(Object.class, ApplicationContextInitializer.class), atLeast(1));
				_assert.verify(() -> Assert.isAssignable(eq(Object.class), eq(ConfigurableApplicationContext.class), (Supplier) any()), atLeast(1));
				beanUtils.verify(() -> BeanUtils.instantiateClass(Object.class), atLeast(1));
				verify(applicationContextInitializerMock, atLeast(1)).initialize(contextMock);
			});
		}
	}
}
