package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import org.springframework.util.StringUtils;
import org.springframework.util.Assert;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.context.ApplicationListener;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.core.env.ConfigurableEnvironment;

import org.mockito.stubbing.Answer;

import org.springframework.util.ClassUtils;
import org.springframework.context.event.SimpleApplicationEventMulticaster;

import java.util.function.Supplier;

import org.springframework.context.ApplicationContextException;

import org.mockito.MockedStatic;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DelegatingApplicationListenerSapientGeneratedTest {

	private final SimpleApplicationEventMulticaster multicasterMock = mock(SimpleApplicationEventMulticaster.class, "multicaster");

	private AutoCloseable autoCloseableMocks;

	@InjectMocks()
	private DelegatingApplicationListener target;

	@AfterEach()
	public void afterTest() throws Exception {
		if (autoCloseableMocks != null)
			autoCloseableMocks.close();
	}

	//Sapient generated method id: ${c66751b1-c2ad-3f15-a1d3-19170647806e}, hash: A3DA0D92B6BDD0D5D7FBE9F9218B3CF3
	@Test()
	void onApplicationEventWhenDelegatesIsEmpty() throws Exception {
		/* Branches:
		 * (event instanceof ApplicationEnvironmentPreparedEvent preparedEvent) : true
		 * (environment == null) : true  #  inside getListeners method
		 * (delegates.isEmpty()) : true
		 */
		//Arrange Statement(s)
		target = new DelegatingApplicationListener();
		autoCloseableMocks = MockitoAnnotations.openMocks(this);
		ConfigurableBootstrapContext configurableBootstrapContextMock = mock(ConfigurableBootstrapContext.class);
		SpringApplication springApplicationMock = mock(SpringApplication.class);
		String[] stringArray = new String[] {};
		ApplicationEnvironmentPreparedEvent applicationEnvironmentPreparedEvent = new ApplicationEnvironmentPreparedEvent(configurableBootstrapContextMock, springApplicationMock, stringArray, (ConfigurableEnvironment) null);
		//Act Statement(s)
		target.onApplicationEvent(applicationEnvironmentPreparedEvent);
	}

	//Sapient generated method id: ${a819e277-6d9b-3f2d-ada7-7e98aa1c6262}, hash: B4830639F9859BFEB01803B7D87A2F43
	@Disabled()
	@Test()
	void onApplicationEventWhenCaughtExceptionThrowsApplicationContextException() throws LinkageError, ClassNotFoundException {
		/* Branches:
		 * (event instanceof ApplicationEnvironmentPreparedEvent preparedEvent) : true
		 * (environment == null) : false  #  inside getListeners method
		 * (StringUtils.hasLength(classNames)) : true  #  inside getListeners method
		 * (for-each(StringUtils.commaDelimitedListToSet(classNames))) : true  #  inside getListeners method
		 * (catch-exception (Exception)) : true  #  inside getListeners method
		 */
		//Arrange Statement(s)
		ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class);
		ConfigurableBootstrapContext configurableBootstrapContextMock = mock(ConfigurableBootstrapContext.class);
		SpringApplication springApplicationMock = mock(SpringApplication.class);
		try (MockedStatic<BeanUtils> beanUtils = mockStatic(BeanUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class, CALLS_REAL_METHODS)) {
			doReturn("A").when(environmentMock).getProperty("context.listener.classes");
			classUtils.when(() -> ClassUtils.forName(eq("B"), (ClassLoader) any())).thenReturn(Object.class);
			_assert.when(() -> Assert.isAssignable(eq(ApplicationListener.class), eq(Object.class), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			RuntimeException runtimeException = new RuntimeException();
			beanUtils.when(() -> BeanUtils.instantiateClass(Object.class)).thenThrow(runtimeException);
			target = new DelegatingApplicationListener();
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			String[] stringArray = new String[] {};
			ApplicationEnvironmentPreparedEvent applicationEnvironmentPreparedEvent = new ApplicationEnvironmentPreparedEvent(configurableBootstrapContextMock, springApplicationMock, stringArray, environmentMock);
			//Act Statement(s)
			final ApplicationContextException result = assertThrows(ApplicationContextException.class, () -> {
				target.onApplicationEvent(applicationEnvironmentPreparedEvent);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getCause(), is(instanceOf(runtimeException.getClass())));
				verify(environmentMock, atLeast(1)).getProperty("context.listener.classes");
				classUtils.verify(() -> ClassUtils.forName(eq("B"), (ClassLoader) any()), atLeast(1));
				_assert.verify(() -> Assert.isAssignable(eq(ApplicationListener.class), eq(Object.class), (Supplier) any()), atLeast(1));
				beanUtils.verify(() -> BeanUtils.instantiateClass(Object.class), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${9d73acaf-cd99-3f3b-966e-3b4a3c115559}, hash: 64628A04D5E851DB70429226F108E089
	@Disabled()
	@Test()
	void onApplicationEventWhenThisMulticasterIsNotNull() throws LinkageError, Exception {
		/* Branches:
		 * (event instanceof ApplicationEnvironmentPreparedEvent preparedEvent) : true
		 * (environment == null) : false  #  inside getListeners method
		 * (StringUtils.hasLength(classNames)) : true  #  inside getListeners method
		 * (for-each(StringUtils.commaDelimitedListToSet(classNames))) : true  #  inside getListeners method
		 * (delegates.isEmpty()) : false
		 * (for-each(delegates)) : true
		 * (this.multicaster != null) : true
		 */
		//Arrange Statement(s)
		ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class);
		ApplicationListener applicationListenerMock = mock(ApplicationListener.class);
		ConfigurableBootstrapContext configurableBootstrapContextMock = mock(ConfigurableBootstrapContext.class);
		SpringApplication springApplicationMock = mock(SpringApplication.class);
		try (MockedStatic<AnnotationAwareOrderComparator> annotationAwareOrderComparator = mockStatic(AnnotationAwareOrderComparator.class);
			 MockedStatic<BeanUtils> beanUtils = mockStatic(BeanUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class, CALLS_REAL_METHODS)) {
			doReturn("A").when(environmentMock).getProperty("context.listener.classes");
			classUtils.when(() -> ClassUtils.forName(eq("return_of_commaDelimitedListToSetItem1"), (ClassLoader) any())).thenReturn(Object.class);
			_assert.when(() -> Assert.isAssignable(eq(ApplicationListener.class), eq(Object.class), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			beanUtils.when(() -> BeanUtils.instantiateClass(Object.class)).thenReturn(applicationListenerMock);
			annotationAwareOrderComparator.when(() -> AnnotationAwareOrderComparator.sort(anyList())).thenAnswer((Answer<Void>) invocation -> null);
			target = new DelegatingApplicationListener();
			autoCloseableMocks = MockitoAnnotations.openMocks(this);
			doNothing().when(multicasterMock).addApplicationListener(applicationListenerMock);
			String[] stringArray = new String[] {};
			ApplicationEnvironmentPreparedEvent applicationEnvironmentPreparedEvent = new ApplicationEnvironmentPreparedEvent(configurableBootstrapContextMock, springApplicationMock, stringArray, environmentMock);
			doNothing().when(multicasterMock).multicastEvent(applicationEnvironmentPreparedEvent);
			//Act Statement(s)
			target.onApplicationEvent(applicationEnvironmentPreparedEvent);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(environmentMock, atLeast(1)).getProperty("context.listener.classes");
				classUtils.verify(() -> ClassUtils.forName(eq("return_of_commaDelimitedListToSetItem1"), (ClassLoader) any()), atLeast(1));
				_assert.verify(() -> Assert.isAssignable(eq(ApplicationListener.class), eq(Object.class), (Supplier) any()), atLeast(1));
				beanUtils.verify(() -> BeanUtils.instantiateClass(Object.class), atLeast(1));
				annotationAwareOrderComparator.verify(() -> AnnotationAwareOrderComparator.sort(anyList()), atLeast(1));
				verify(multicasterMock, atLeast(1)).addApplicationListener(applicationListenerMock);
				verify(multicasterMock, atLeast(1)).multicastEvent(applicationEnvironmentPreparedEvent);
			});
		}
	}
}
