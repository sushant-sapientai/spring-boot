package org.springframework.boot.context.properties;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import org.springframework.beans.BeansException;

import java.util.LinkedHashMap;

import org.springframework.aop.support.AopUtils;
import org.springframework.util.Assert;
import org.springframework.core.annotation.MergedAnnotations;

import java.util.Map;
import java.util.HashMap;

import org.springframework.context.ConfigurableApplicationContext;

import org.mockito.stubbing.Answer;

import java.lang.reflect.Method;
import java.lang.annotation.Annotation;

import org.springframework.core.ResolvableType;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.context.properties.bind.Bindable;

import java.util.function.Supplier;

import org.springframework.core.annotation.MergedAnnotation;

import org.mockito.MockedStatic;

import org.springframework.validation.annotation.Validated;
import org.springframework.boot.context.properties.bind.BindMethod;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertiesBeanSapientGeneratedTest {

	private final Bindable<?> bindTargetMock = mock(Bindable.class, "bindTarget");

	private final ApplicationContext applicationContextMock = mock(ApplicationContext.class);

	private final Bindable bindableMock = mock(Bindable.class);

	private final Bindable<Object> bindableMock2 = mock(Bindable.class);

	private final Bindable<Object> bindableMock3 = mock(Bindable.class);

	private final Bindable<Object> bindableMock4 = mock(Bindable.class);

	private final ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);

	private final ConfigurationProperties configurationPropertiesMock = mock(ConfigurationProperties.class);

	private final MergedAnnotation<Annotation> mergedAnnotationMock = mock(MergedAnnotation.class);

	private final MergedAnnotation<Annotation> mergedAnnotationMock2 = mock(MergedAnnotation.class);

	private final MergedAnnotation<Annotation> mergedAnnotationMock3 = mock(MergedAnnotation.class);

	private final MergedAnnotation<Annotation> mergedAnnotationMock4 = mock(MergedAnnotation.class);

	private final MergedAnnotation<Annotation> mergedAnnotationMock5 = mock(MergedAnnotation.class);

	private final MergedAnnotation<Annotation> mergedAnnotationMock6 = mock(MergedAnnotation.class);

	private final MergedAnnotations mergedAnnotationsMock = mock(MergedAnnotations.class);

	private final MergedAnnotations mergedAnnotationsMock2 = mock(MergedAnnotations.class);

	private final MergedAnnotations mergedAnnotationsMock3 = mock(MergedAnnotations.class);

	private final MergedAnnotations mergedAnnotationsMock4 = mock(MergedAnnotations.class);

	private final MergedAnnotations mergedAnnotationsMock5 = mock(MergedAnnotations.class);

	private final MergedAnnotations mergedAnnotationsMock6 = mock(MergedAnnotations.class);

	private final Method methodMock = mock(Method.class);

	private final ResolvableType resolvableTypeMock = mock(ResolvableType.class);

	private final Validated validatedMock = mock(Validated.class);

	//Sapient generated method id: ${13368fac-223f-37ba-a843-3c9b25e276be}, hash: 207DBF6B0C09156AEB690C0A87088DEB
	@Disabled()
	@Test()
	void getTypeTest() throws NoSuchElementException {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<MergedAnnotations> mergedAnnotations = mockStatic(MergedAnnotations.class);
			 MockedStatic<AopUtils> aopUtils = mockStatic(AopUtils.class);
			 MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			resolvableType.when(() -> ResolvableType.forMethodReturnType(methodMock)).thenReturn(resolvableTypeMock);
			mergedAnnotations.when(() -> MergedAnnotations.from(methodMock, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock);
			doReturn(mergedAnnotationMock).when(mergedAnnotationsMock).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock).isPresent();
			doReturn(mergedAnnotationMock2).when(mergedAnnotationsMock2).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock2).isPresent();
			Object object = new Object();
			aopUtils.when(() -> AopUtils.isAopProxy(object)).thenReturn(true);
			aopUtils.when(() -> AopUtils.getTargetClass(object)).thenReturn(Object.class);
			mergedAnnotations.when(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock2).thenReturn(mergedAnnotationsMock3);
			doReturn(mergedAnnotationMock3).when(mergedAnnotationsMock3).get(Annotation.class);
			doReturn(true).when(mergedAnnotationMock3).isPresent();
			doReturn(null).when(mergedAnnotationMock3).synthesize();
			ConfigurationPropertiesBean target = ConfigurationPropertiesBean.get(configurableApplicationContextMock, object, "beanName1");
			//Act Statement(s)
			Class<?> result = target.getType();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Object.class));
				resolvableType.verify(() -> ResolvableType.forMethodReturnType(methodMock), atLeast(1));
				mergedAnnotations.verify(() -> MergedAnnotations.from(methodMock, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(1));
				verify(mergedAnnotationsMock).get(Annotation.class);
				verify(mergedAnnotationMock).isPresent();
				mergedAnnotations.verify(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(2));
				verify(mergedAnnotationsMock2).get(Annotation.class);
				verify(mergedAnnotationMock2).isPresent();
				aopUtils.verify(() -> AopUtils.isAopProxy(object), atLeast(1));
				aopUtils.verify(() -> AopUtils.getTargetClass(object), atLeast(1));
				verify(mergedAnnotationsMock3).get(Annotation.class);
				verify(mergedAnnotationMock3).isPresent();
				verify(mergedAnnotationMock3).synthesize();
			});
		}
	}

	//Sapient generated method id: ${43f6554e-3df6-3d8d-8e42-81c52fff7a95}, hash: 3AD1B503D7A8A074A908BC0D5ADEE8C6
	@Disabled()
	@Test()
	void getAnnotationTest() throws NoSuchElementException {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<MergedAnnotations> mergedAnnotations = mockStatic(MergedAnnotations.class);
			 MockedStatic<AopUtils> aopUtils = mockStatic(AopUtils.class);
			 MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			resolvableType.when(() -> ResolvableType.forMethodReturnType(methodMock)).thenReturn(resolvableTypeMock);
			mergedAnnotations.when(() -> MergedAnnotations.from(methodMock, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock);
			doReturn(mergedAnnotationMock).when(mergedAnnotationsMock).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock).isPresent();
			doReturn(mergedAnnotationMock2).when(mergedAnnotationsMock2).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock2).isPresent();
			Object object = new Object();
			aopUtils.when(() -> AopUtils.isAopProxy(object)).thenReturn(true);
			aopUtils.when(() -> AopUtils.getTargetClass(object)).thenReturn(Object.class);
			mergedAnnotations.when(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock2).thenReturn(mergedAnnotationsMock3);
			doReturn(mergedAnnotationMock3).when(mergedAnnotationsMock3).get(Annotation.class);
			doReturn(true).when(mergedAnnotationMock3).isPresent();
			doReturn(null).when(mergedAnnotationMock3).synthesize();
			ConfigurationPropertiesBean target = ConfigurationPropertiesBean.get(configurableApplicationContextMock, object, "beanName1");
			doReturn(configurationPropertiesMock).when(bindTargetMock).getAnnotation(ConfigurationProperties.class);
			//Act Statement(s)
			ConfigurationProperties result = target.getAnnotation();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertiesMock));
				resolvableType.verify(() -> ResolvableType.forMethodReturnType(methodMock), atLeast(1));
				mergedAnnotations.verify(() -> MergedAnnotations.from(methodMock, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(1));
				verify(mergedAnnotationsMock).get(Annotation.class);
				verify(mergedAnnotationMock).isPresent();
				mergedAnnotations.verify(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(2));
				verify(mergedAnnotationsMock2).get(Annotation.class);
				verify(mergedAnnotationMock2).isPresent();
				aopUtils.verify(() -> AopUtils.isAopProxy(object), atLeast(1));
				aopUtils.verify(() -> AopUtils.getTargetClass(object), atLeast(1));
				verify(mergedAnnotationsMock3).get(Annotation.class);
				verify(mergedAnnotationMock3).isPresent();
				verify(mergedAnnotationMock3).synthesize();
				verify(bindTargetMock).getAnnotation(ConfigurationProperties.class);
			});
		}
	}

	//Sapient generated method id: ${79719c1b-729d-33eb-96d6-4f4edceef32f}, hash: A934852024C63DC63CE316F74F21945A
	@Disabled()
	@Test()
	void asBindTargetTest() throws NoSuchElementException {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<MergedAnnotations> mergedAnnotations = mockStatic(MergedAnnotations.class);
			 MockedStatic<AopUtils> aopUtils = mockStatic(AopUtils.class);
			 MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			resolvableType.when(() -> ResolvableType.forMethodReturnType(methodMock)).thenReturn(resolvableTypeMock);
			mergedAnnotations.when(() -> MergedAnnotations.from(methodMock, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock);
			doReturn(mergedAnnotationMock).when(mergedAnnotationsMock).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock).isPresent();
			doReturn(mergedAnnotationMock2).when(mergedAnnotationsMock2).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock2).isPresent();
			Object object = new Object();
			aopUtils.when(() -> AopUtils.isAopProxy(object)).thenReturn(true);
			aopUtils.when(() -> AopUtils.getTargetClass(object)).thenReturn(Object.class);
			mergedAnnotations.when(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock2).thenReturn(mergedAnnotationsMock3);
			doReturn(mergedAnnotationMock3).when(mergedAnnotationsMock3).get(Annotation.class);
			doReturn(true).when(mergedAnnotationMock3).isPresent();
			doReturn(null).when(mergedAnnotationMock3).synthesize();
			ConfigurationPropertiesBean target = ConfigurationPropertiesBean.get(configurableApplicationContextMock, object, "beanName1");
			//Act Statement(s)
			Bindable<?> result = target.asBindTarget();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindTargetMock));
				resolvableType.verify(() -> ResolvableType.forMethodReturnType(methodMock), atLeast(1));
				mergedAnnotations.verify(() -> MergedAnnotations.from(methodMock, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(1));
				verify(mergedAnnotationsMock).get(Annotation.class);
				verify(mergedAnnotationMock).isPresent();
				mergedAnnotations.verify(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(2));
				verify(mergedAnnotationsMock2).get(Annotation.class);
				verify(mergedAnnotationMock2).isPresent();
				aopUtils.verify(() -> AopUtils.isAopProxy(object), atLeast(1));
				aopUtils.verify(() -> AopUtils.getTargetClass(object), atLeast(1));
				verify(mergedAnnotationsMock3).get(Annotation.class);
				verify(mergedAnnotationMock3).isPresent();
				verify(mergedAnnotationMock3).synthesize();
			});
		}
	}

	//Sapient generated method id: ${70911d7e-d002-324c-a42c-245e3bbae264}, hash: 4F2C7A8E97BA6EBA9AF2D257C88AF643
	@Disabled()
	@Test()
	void getAllWhenApplicationContextInstanceOfConfigurableApplicationContext() {
		/* Branches:
		 * (applicationContext instanceof ConfigurableApplicationContext configurableContext) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(configurableApplicationContextMock, "ApplicationContext must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			Map<String, ConfigurationPropertiesBean> result = ConfigurationPropertiesBean.getAll((ApplicationContext) configurableApplicationContextMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				_assert.verify(() -> Assert.notNull(configurableApplicationContextMock, "ApplicationContext must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${5c52fa14-ad74-3141-a69e-7272698e46a4}, hash: BC9C426B593B4C5DD1258E48CD0C4263
	@Test()
	void getAllWhenPropertiesBeanIsNotNull() throws BeansException {
		/* Branches:
		 * (applicationContext instanceof ConfigurableApplicationContext configurableContext) : false
		 * (propertiesBean != null) : true  #  inside lambda$getAll$0 method
		 */
		//Arrange Statement(s)
		ConfigurationPropertiesBean configurationPropertiesBeanMock = mock(ConfigurationPropertiesBean.class);
		try (MockedStatic<ConfigurationPropertiesBean> configurationPropertiesBean = mockStatic(ConfigurationPropertiesBean.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Object object = new Object();
			Map<String, Object> stringObjectMap = new HashMap<>();
			stringObjectMap.put("return_of_getBeansWithAnnotationItem1Key1", object);
			doReturn(stringObjectMap).when(applicationContextMock).getBeansWithAnnotation(ConfigurationProperties.class);
			_assert.when(() -> Assert.notNull(applicationContextMock, "ApplicationContext must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertiesBean.when(() -> ConfigurationPropertiesBean.get(applicationContextMock, object, "return_of_getBeansWithAnnotationItem1Key1")).thenReturn(configurationPropertiesBeanMock);
			//Act Statement(s)
			Map<String, ConfigurationPropertiesBean> result = ConfigurationPropertiesBean.getAll(applicationContextMock);
			Map<String, ConfigurationPropertiesBean> stringConfigurationPropertiesBeanResultMap = new LinkedHashMap<>();
			stringConfigurationPropertiesBeanResultMap.put("return_of_getBeansWithAnnotationItem1Key1", configurationPropertiesBeanMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(stringConfigurationPropertiesBeanResultMap));
				verify(applicationContextMock, atLeast(1)).getBeansWithAnnotation(ConfigurationProperties.class);
				_assert.verify(() -> Assert.notNull(applicationContextMock, "ApplicationContext must not be null"), atLeast(1));
				configurationPropertiesBean.verify(() -> ConfigurationPropertiesBean.get(applicationContextMock, object, "return_of_getBeansWithAnnotationItem1Key1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${93524355-0c8e-3457-8cc1-489e34667617}, hash: A478B87F73818B9BF53E21A506575C06
	@Disabled()
	@Test()
	void getWhenAnnotationNotIsPresentAndAnnotationIsNullAndAnnotationsIsNullAndBindTargetIsNull4() {
		/* Branches:
		 * (applicationContext instanceof ConfigurableApplicationContext configurableContext) : false  #  inside findFactoryMethod method
		 * (factoryMethod != null) : false  #  inside createBindTarget method
		 * (factory != null) : false  #  inside findAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (element != null) : false  #  inside findMergedAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (AopUtils.isAopProxy(instance)) : false  #  inside findAnnotation method
		 * (annotation.isPresent()) : false  #  inside findAnnotation method
		 * (annotation == null) : true  #  inside findAnnotations method
		 * (annotations != null) : false  #  inside createBindTarget method
		 * (bindTarget == null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<AopUtils> aopUtils = mockStatic(AopUtils.class);
			 MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			resolvableType.when(() -> ResolvableType.forClass((Class) null)).thenReturn(resolvableTypeMock);
			Object object = new Object();
			aopUtils.when(() -> AopUtils.isAopProxy(object)).thenReturn(false);
			//Act Statement(s)
			ConfigurationPropertiesBean result = ConfigurationPropertiesBean.get(applicationContextMock, object, "beanName1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				resolvableType.verify(() -> ResolvableType.forClass((Class) null), atLeast(1));
				aopUtils.verify(() -> AopUtils.isAopProxy(object), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${d1344998-3062-3db5-8c71-2026c2a025f8}, hash: 8C48B3BA584B7CB09C2AF25990F4AD11
	@Disabled()
	@Test()
	void getWhenAnnotationIsPresentAndAnnotationIsNotNullAndValidatedIsNullAndAnnotationsIsNullAndBindTargetIsNull15() throws NoSuchElementException {
		/* Branches:
		 * (applicationContext instanceof ConfigurableApplicationContext configurableContext) : true  #  inside findFactoryMethod method
		 * (factoryMethod != null) : false  #  inside createBindTarget method
		 * (factory != null) : false  #  inside findAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (element != null) : false  #  inside findMergedAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (AopUtils.isAopProxy(instance)) : true  #  inside findAnnotation method
		 * (annotation.isPresent()) : true  #  inside findAnnotation method
		 * (annotation == null) : false  #  inside findAnnotations method
		 * (validated != null) : false  #  inside findAnnotations method
		 * (annotations != null) : false  #  inside createBindTarget method
		 * (bindTarget == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<MergedAnnotations> mergedAnnotations = mockStatic(MergedAnnotations.class);
			 MockedStatic<AopUtils> aopUtils = mockStatic(AopUtils.class);
			 MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			resolvableType.when(() -> ResolvableType.forClass((Class) null)).thenReturn(resolvableTypeMock);
			Object object = new Object();
			aopUtils.when(() -> AopUtils.isAopProxy(object)).thenReturn(true);
			aopUtils.when(() -> AopUtils.getTargetClass(object)).thenReturn(Object.class);
			doReturn(mergedAnnotationMock).when(mergedAnnotationsMock).get(Annotation.class);
			doReturn(true).when(mergedAnnotationMock).isPresent();
			doReturn(configurationPropertiesMock).when(mergedAnnotationMock).synthesize();
			mergedAnnotations.when(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock).thenReturn(mergedAnnotationsMock2);
			doReturn(mergedAnnotationMock2).when(mergedAnnotationsMock2).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock2).isPresent();
			//Act Statement(s)
			ConfigurationPropertiesBean result = ConfigurationPropertiesBean.get(configurableApplicationContextMock, object, "beanName1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				resolvableType.verify(() -> ResolvableType.forClass((Class) null), atLeast(1));
				aopUtils.verify(() -> AopUtils.isAopProxy(object), atLeast(2));
				aopUtils.verify(() -> AopUtils.getTargetClass(object), atLeast(2));
				mergedAnnotations.verify(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(2));
				verify(mergedAnnotationsMock).get(Annotation.class);
				verify(mergedAnnotationMock).isPresent();
				verify(mergedAnnotationMock).synthesize();
				verify(mergedAnnotationsMock2).get(Annotation.class);
				verify(mergedAnnotationMock2).isPresent();
			});
		}
	}

	//Sapient generated method id: ${db70bc17-83d7-32f7-b291-6e86349e9560}, hash: 31898082BE04A643D04543F2EF87B275
	@Disabled()
	@Test()
	void getWhenBindTargetGetBindMethodNotEqualsVALUE_OBJECT_BIND_METHODAndBindTargetIsNotNull() throws NoSuchElementException {
		/* Branches:
		 * (applicationContext instanceof ConfigurableApplicationContext configurableContext) : true  #  inside findFactoryMethod method
		 * (factoryMethod != null) : true  #  inside createBindTarget method
		 * (factory != null) : true  #  inside findAnnotation method
		 * (element != null) : true  #  inside findMergedAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (AopUtils.isAopProxy(instance)) : true  #  inside findAnnotation method
		 * (annotation.isPresent()) : true  #  inside findAnnotation method
		 * (annotation == null) : false  #  inside findAnnotations method
		 * (validated != null) : true  #  inside findAnnotations method
		 * (annotations != null) : true  #  inside createBindTarget method
		 * (bindTarget == null) : false
		 * (bindTarget.getBindMethod() == null) : true
		 * (factoryMethod != null) : true
		 * (bindTarget.getBindMethod() != VALUE_OBJECT_BIND_METHOD) : true
		 * (bindTarget != null) : true  #  inside create method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Bindable<Object> bindableMock5 = mock(Bindable.class);
		try (MockedStatic<BindMethodAttribute> bindMethodAttribute = mockStatic(BindMethodAttribute.class);
			 MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
			 MockedStatic<MergedAnnotations> mergedAnnotations = mockStatic(MergedAnnotations.class);
			 MockedStatic<AopUtils> aopUtils = mockStatic(AopUtils.class);
			 MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			resolvableType.when(() -> ResolvableType.forMethodReturnType(methodMock)).thenReturn(resolvableTypeMock);
			doReturn(mergedAnnotationMock).when(mergedAnnotationsMock).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock).isPresent();
			doReturn(mergedAnnotationMock2).when(mergedAnnotationsMock2).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock2).isPresent();
			Object object = new Object();
			aopUtils.when(() -> AopUtils.isAopProxy(object)).thenReturn(true);
			aopUtils.when(() -> AopUtils.getTargetClass(object)).thenReturn(Object.class);
			doReturn(mergedAnnotationMock3).when(mergedAnnotationsMock3).get(Annotation.class);
			doReturn(true).when(mergedAnnotationMock3).isPresent();
			doReturn(configurationPropertiesMock).when(mergedAnnotationMock3).synthesize();
			mergedAnnotations.when(() -> MergedAnnotations.from(methodMock, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock).thenReturn(mergedAnnotationsMock4);
			doReturn(mergedAnnotationMock4).when(mergedAnnotationsMock4).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock4).isPresent();
			doReturn(mergedAnnotationMock5).when(mergedAnnotationsMock5).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock5).isPresent();
			mergedAnnotations.when(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock2).thenReturn(mergedAnnotationsMock3).thenReturn(mergedAnnotationsMock5).thenReturn(mergedAnnotationsMock6);
			doReturn(mergedAnnotationMock6).when(mergedAnnotationsMock6).get(Annotation.class);
			doReturn(true).when(mergedAnnotationMock6).isPresent();
			doReturn(validatedMock).when(mergedAnnotationMock6).synthesize();
			bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
			Annotation[] annotationArray = new Annotation[] { configurationPropertiesMock, validatedMock };
			doReturn(bindableMock2).when(bindableMock).withAnnotations(annotationArray);
			doReturn(bindableMock3).when(bindableMock2).withBindMethod(BindMethod.JAVA_BEAN);
			doReturn(null).when(bindableMock3).getBindMethod();
			doReturn(bindableMock4).when(bindableMock3).withBindMethod(BindMethod.JAVA_BEAN);
			doReturn(BindMethod.JAVA_BEAN).when(bindableMock4).getBindMethod();
			doReturn(bindableMock5).when(bindableMock4).withExistingValue(object);
			bindMethodAttribute.when(() -> BindMethodAttribute.get(configurableApplicationContextMock, "beanName1")).thenReturn(BindMethod.JAVA_BEAN);
			//Act Statement(s)
			ConfigurationPropertiesBean result = ConfigurationPropertiesBean.get(configurableApplicationContextMock, object, "beanName1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				resolvableType.verify(() -> ResolvableType.forMethodReturnType(methodMock), atLeast(1));
				mergedAnnotations.verify(() -> MergedAnnotations.from(methodMock, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(2));
				verify(mergedAnnotationsMock).get(Annotation.class);
				verify(mergedAnnotationMock).isPresent();
				mergedAnnotations.verify(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(4));
				verify(mergedAnnotationsMock2).get(Annotation.class);
				verify(mergedAnnotationMock2).isPresent();
				aopUtils.verify(() -> AopUtils.isAopProxy(object), atLeast(2));
				aopUtils.verify(() -> AopUtils.getTargetClass(object), atLeast(2));
				verify(mergedAnnotationsMock3).get(Annotation.class);
				verify(mergedAnnotationMock3).isPresent();
				verify(mergedAnnotationMock3).synthesize();
				verify(mergedAnnotationsMock4).get(Annotation.class);
				verify(mergedAnnotationMock4).isPresent();
				verify(mergedAnnotationsMock5).get(Annotation.class);
				verify(mergedAnnotationMock5).isPresent();
				verify(mergedAnnotationsMock6).get(Annotation.class);
				verify(mergedAnnotationMock6).isPresent();
				verify(mergedAnnotationMock6).synthesize();
				bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
				verify(bindableMock).withAnnotations(annotationArray);
				verify(bindableMock2).withBindMethod(BindMethod.JAVA_BEAN);
				verify(bindableMock3).getBindMethod();
				verify(bindableMock3).withBindMethod(BindMethod.JAVA_BEAN);
				verify(bindableMock4).getBindMethod();
				verify(bindableMock4).withExistingValue(object);
				bindMethodAttribute.verify(() -> BindMethodAttribute.get(configurableApplicationContextMock, "beanName1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${887517c9-64c2-3659-842a-c08c0e93f3fc}, hash: 60FB68A3FB910DDDA2BEE8A1A484CA7C
	@Disabled()
	@Test()
	void getWhenFactoryMethodIsNotNullAndBindTargetGetBindMethodNotEqualsVALUE_OBJECT_BIND_METHODAndBindTargetIsNull() throws NoSuchElementException {
		/* Branches:
		 * (applicationContext instanceof ConfigurableApplicationContext configurableContext) : true  #  inside findFactoryMethod method
		 * (factoryMethod != null) : true  #  inside createBindTarget method
		 * (factory != null) : true  #  inside findAnnotation method
		 * (element != null) : true  #  inside findMergedAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (AopUtils.isAopProxy(instance)) : true  #  inside findAnnotation method
		 * (annotation.isPresent()) : true  #  inside findAnnotation method
		 * (annotation == null) : false  #  inside findAnnotations method
		 * (validated != null) : true  #  inside findAnnotations method
		 * (annotations != null) : true  #  inside createBindTarget method
		 * (bindTarget == null) : false
		 * (bindTarget.getBindMethod() == null) : true
		 * (factoryMethod != null) : true
		 * (bindTarget.getBindMethod() != VALUE_OBJECT_BIND_METHOD) : true
		 * (bindTarget != null) : false  #  inside create method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BindMethodAttribute> bindMethodAttribute = mockStatic(BindMethodAttribute.class);
			 MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
			 MockedStatic<MergedAnnotations> mergedAnnotations = mockStatic(MergedAnnotations.class);
			 MockedStatic<AopUtils> aopUtils = mockStatic(AopUtils.class);
			 MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			resolvableType.when(() -> ResolvableType.forMethodReturnType(methodMock)).thenReturn(resolvableTypeMock);
			doReturn(mergedAnnotationMock).when(mergedAnnotationsMock).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock).isPresent();
			doReturn(mergedAnnotationMock2).when(mergedAnnotationsMock2).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock2).isPresent();
			Object object = new Object();
			aopUtils.when(() -> AopUtils.isAopProxy(object)).thenReturn(true);
			aopUtils.when(() -> AopUtils.getTargetClass(object)).thenReturn(Object.class);
			doReturn(mergedAnnotationMock3).when(mergedAnnotationsMock3).get(Annotation.class);
			doReturn(true).when(mergedAnnotationMock3).isPresent();
			doReturn(configurationPropertiesMock).when(mergedAnnotationMock3).synthesize();
			mergedAnnotations.when(() -> MergedAnnotations.from(methodMock, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock).thenReturn(mergedAnnotationsMock4);
			doReturn(mergedAnnotationMock4).when(mergedAnnotationsMock4).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock4).isPresent();
			doReturn(mergedAnnotationMock5).when(mergedAnnotationsMock5).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock5).isPresent();
			mergedAnnotations.when(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock2).thenReturn(mergedAnnotationsMock3).thenReturn(mergedAnnotationsMock5).thenReturn(mergedAnnotationsMock6);
			doReturn(mergedAnnotationMock6).when(mergedAnnotationsMock6).get(Annotation.class);
			doReturn(true).when(mergedAnnotationMock6).isPresent();
			doReturn(validatedMock).when(mergedAnnotationMock6).synthesize();
			bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
			Annotation[] annotationArray = new Annotation[] { configurationPropertiesMock, validatedMock };
			doReturn(bindableMock2).when(bindableMock).withAnnotations(annotationArray);
			doReturn(bindableMock3).when(bindableMock2).withBindMethod(BindMethod.JAVA_BEAN);
			doReturn(null).when(bindableMock3).getBindMethod();
			doReturn(bindableMock4).when(bindableMock3).withBindMethod(BindMethod.JAVA_BEAN);
			doReturn(BindMethod.JAVA_BEAN).when(bindableMock4).getBindMethod();
			doReturn(null).when(bindableMock4).withExistingValue(object);
			bindMethodAttribute.when(() -> BindMethodAttribute.get(configurableApplicationContextMock, "beanName1")).thenReturn(BindMethod.JAVA_BEAN);
			//Act Statement(s)
			ConfigurationPropertiesBean result = ConfigurationPropertiesBean.get(configurableApplicationContextMock, object, "beanName1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				resolvableType.verify(() -> ResolvableType.forMethodReturnType(methodMock), atLeast(1));
				mergedAnnotations.verify(() -> MergedAnnotations.from(methodMock, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(2));
				verify(mergedAnnotationsMock).get(Annotation.class);
				verify(mergedAnnotationMock).isPresent();
				mergedAnnotations.verify(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(4));
				verify(mergedAnnotationsMock2).get(Annotation.class);
				verify(mergedAnnotationMock2).isPresent();
				aopUtils.verify(() -> AopUtils.isAopProxy(object), atLeast(2));
				aopUtils.verify(() -> AopUtils.getTargetClass(object), atLeast(2));
				verify(mergedAnnotationsMock3).get(Annotation.class);
				verify(mergedAnnotationMock3).isPresent();
				verify(mergedAnnotationMock3).synthesize();
				verify(mergedAnnotationsMock4).get(Annotation.class);
				verify(mergedAnnotationMock4).isPresent();
				verify(mergedAnnotationsMock5).get(Annotation.class);
				verify(mergedAnnotationMock5).isPresent();
				verify(mergedAnnotationsMock6).get(Annotation.class);
				verify(mergedAnnotationMock6).isPresent();
				verify(mergedAnnotationMock6).synthesize();
				bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
				verify(bindableMock).withAnnotations(annotationArray);
				verify(bindableMock2).withBindMethod(BindMethod.JAVA_BEAN);
				verify(bindableMock3).getBindMethod();
				verify(bindableMock3).withBindMethod(BindMethod.JAVA_BEAN);
				verify(bindableMock4).getBindMethod();
				verify(bindableMock4).withExistingValue(object);
				bindMethodAttribute.verify(() -> BindMethodAttribute.get(configurableApplicationContextMock, "beanName1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${03d84ad8-cec6-3ccf-9a0b-2be56edffe26}, hash: F4AD0A34F13FF91272B9FB7A439F64C0
	@Test()
	void forValueObjectWhenAnnotationNotIsPresentAndAnnotationIsNullAndAnnotationsIsNullAndBindTargetIThrowsNullPointerException() {
		/* Branches:
		 * (factoryMethod != null) : false  #  inside createBindTarget method
		 * (factory != null) : false  #  inside findAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (element != null) : false  #  inside findMergedAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (AopUtils.isAopProxy(instance)) : false  #  inside findAnnotation method
		 * (annotation.isPresent()) : false  #  inside findAnnotation method
		 * (annotation == null) : true  #  inside findAnnotations method
		 * (annotations != null) : false  #  inside createBindTarget method
		 * (bindTarget != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			resolvableType.when(() -> ResolvableType.forClass((Class) null)).thenReturn(resolvableTypeMock);
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			Class<?> _class = null;
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				ConfigurationPropertiesBean.forValueObject(_class, "beanName1");
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				resolvableType.verify(() -> ResolvableType.forClass((Class) null), atLeast(1));
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${b1313bb1-8a73-36f1-8092-83dbfb089f43}, hash: E2474F679932ACCCDB882FFD22F2FD1D
	@Disabled()
	@Test()
	void forValueObjectWhenValidatedIsNullAndAnnotationsIsNullAndBindTargetIsNull2ThrowsNullPointerException() throws NoSuchElementException {
		/* Branches:
		 * (factoryMethod != null) : false  #  inside createBindTarget method
		 * (factory != null) : false  #  inside findAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (element != null) : true  #  inside findMergedAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (AopUtils.isAopProxy(instance)) : false  #  inside findAnnotation method
		 * (annotation.isPresent()) : true  #  inside findAnnotation method
		 * (annotation == null) : false  #  inside findAnnotations method
		 * (validated != null) : false  #  inside findAnnotations method
		 * (annotations != null) : false  #  inside createBindTarget method
		 * (bindTarget != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<MergedAnnotations> mergedAnnotations = mockStatic(MergedAnnotations.class);
			 MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			resolvableType.when(() -> ResolvableType.forClass(Object.class)).thenReturn(resolvableTypeMock);
			doReturn(mergedAnnotationMock).when(mergedAnnotationsMock).get(Annotation.class);
			doReturn(false, true).when(mergedAnnotationMock).isPresent();
			doReturn(configurationPropertiesMock).when(mergedAnnotationMock).synthesize();
			mergedAnnotations.when(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock).thenReturn(mergedAnnotationsMock2);
			doReturn(mergedAnnotationMock2).when(mergedAnnotationsMock2).get(Annotation.class);
			doReturn(false).when(mergedAnnotationMock2).isPresent();
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				ConfigurationPropertiesBean.forValueObject(Object.class, "beanName1");
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				resolvableType.verify(() -> ResolvableType.forClass(Object.class), atLeast(1));
				mergedAnnotations.verify(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(2));
				verify(mergedAnnotationsMock).get(Annotation.class);
				verify(mergedAnnotationMock, times(2)).isPresent();
				verify(mergedAnnotationMock).synthesize();
				verify(mergedAnnotationsMock2).get(Annotation.class);
				verify(mergedAnnotationMock2, times(2)).isPresent();
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${df3a9861-4cbd-304c-accd-ffd439c79297}, hash: CA3C404536C9312BBF27EEB68F2AA2D8
	@Disabled()
	@Test()
	void forValueObjectWhenBindTargetIsNotNull() throws NoSuchElementException {
		/* Branches:
		 * (factoryMethod != null) : false  #  inside createBindTarget method
		 * (factory != null) : false  #  inside findAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (element != null) : true  #  inside findMergedAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (AopUtils.isAopProxy(instance)) : false  #  inside findAnnotation method
		 * (annotation.isPresent()) : true  #  inside findAnnotation method
		 * (annotation == null) : false  #  inside findAnnotations method
		 * (validated != null) : true  #  inside findAnnotations method
		 * (annotations != null) : true  #  inside createBindTarget method
		 * (bindTarget != null) : true
		 * (deduceBindMethod(bindTarget) == VALUE_OBJECT_BIND_METHOD) : true
		 * (bindTarget != null) : true  #  inside create method
		 */
		//Arrange Statement(s)
		Bindable bindableMock3 = mock(Bindable.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ConfigurationPropertiesBean> configurationPropertiesBean = mockStatic(ConfigurationPropertiesBean.class, CALLS_REAL_METHODS);
			 MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
			 MockedStatic<MergedAnnotations> mergedAnnotations = mockStatic(MergedAnnotations.class);
			 MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			resolvableType.when(() -> ResolvableType.forClass(Object.class)).thenReturn(resolvableTypeMock);
			doReturn(mergedAnnotationMock).when(mergedAnnotationsMock).get(Annotation.class);
			doReturn(false, true).when(mergedAnnotationMock).isPresent();
			doReturn(configurationPropertiesMock).when(mergedAnnotationMock).synthesize();
			mergedAnnotations.when(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock).thenReturn(mergedAnnotationsMock2);
			doReturn(mergedAnnotationMock2).when(mergedAnnotationsMock2).get(Annotation.class);
			doReturn(false, true).when(mergedAnnotationMock2).isPresent();
			doReturn(validatedMock).when(mergedAnnotationMock2).synthesize();
			bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
			Annotation[] annotationArray = new Annotation[] { configurationPropertiesMock, validatedMock };
			doReturn(bindableMock2).when(bindableMock).withAnnotations(annotationArray);
			doReturn(bindableMock3).when(bindableMock2).withBindMethod(BindMethod.VALUE_OBJECT);
			configurationPropertiesBean.when(() -> ConfigurationPropertiesBean.deduceBindMethod(bindableMock2)).thenReturn(BindMethod.VALUE_OBJECT);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			ConfigurationPropertiesBean result = ConfigurationPropertiesBean.forValueObject(Object.class, "beanName1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				resolvableType.verify(() -> ResolvableType.forClass(Object.class), atLeast(1));
				mergedAnnotations.verify(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(2));
				verify(mergedAnnotationsMock, atLeast(1)).get(Annotation.class);
				verify(mergedAnnotationMock, times(2)).isPresent();
				verify(mergedAnnotationMock, atLeast(1)).synthesize();
				verify(mergedAnnotationsMock2, atLeast(1)).get(Annotation.class);
				verify(mergedAnnotationMock2, times(2)).isPresent();
				verify(mergedAnnotationMock2, atLeast(1)).synthesize();
				bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
				verify(bindableMock, atLeast(1)).withAnnotations(annotationArray);
				verify(bindableMock2, atLeast(1)).withBindMethod(BindMethod.VALUE_OBJECT);
				configurationPropertiesBean.verify(() -> ConfigurationPropertiesBean.deduceBindMethod(bindableMock2), atLeast(1));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a237d700-8cc3-3ae6-a384-c70691414ff2}, hash: 39453E96CFDB31BE760934DEE95CFF69
	@Disabled()
	@Test()
	void forValueObjectWhenBindTargetIsNull() throws NoSuchElementException {
		/* Branches:
		 * (factoryMethod != null) : false  #  inside createBindTarget method
		 * (factory != null) : false  #  inside findAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (element != null) : true  #  inside findMergedAnnotation method
		 * (!annotation.isPresent()) : true  #  inside findAnnotation method
		 * (AopUtils.isAopProxy(instance)) : false  #  inside findAnnotation method
		 * (annotation.isPresent()) : true  #  inside findAnnotation method
		 * (annotation == null) : false  #  inside findAnnotations method
		 * (validated != null) : true  #  inside findAnnotations method
		 * (annotations != null) : true  #  inside createBindTarget method
		 * (bindTarget != null) : true
		 * (deduceBindMethod(bindTarget) == VALUE_OBJECT_BIND_METHOD) : true
		 * (bindTarget != null) : false  #  inside create method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<ConfigurationPropertiesBean> configurationPropertiesBean = mockStatic(ConfigurationPropertiesBean.class, CALLS_REAL_METHODS);
			 MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
			 MockedStatic<MergedAnnotations> mergedAnnotations = mockStatic(MergedAnnotations.class);
			 MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			resolvableType.when(() -> ResolvableType.forClass(Object.class)).thenReturn(resolvableTypeMock);
			doReturn(mergedAnnotationMock).when(mergedAnnotationsMock).get(Annotation.class);
			doReturn(false, true).when(mergedAnnotationMock).isPresent();
			doReturn(configurationPropertiesMock).when(mergedAnnotationMock).synthesize();
			mergedAnnotations.when(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock).thenReturn(mergedAnnotationsMock2);
			doReturn(mergedAnnotationMock2).when(mergedAnnotationsMock2).get(Annotation.class);
			doReturn(false, true).when(mergedAnnotationMock2).isPresent();
			doReturn(validatedMock).when(mergedAnnotationMock2).synthesize();
			bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
			Annotation[] annotationArray = new Annotation[] { configurationPropertiesMock, validatedMock };
			doReturn(bindableMock2).when(bindableMock).withAnnotations(annotationArray);
			doReturn(null).when(bindableMock2).withBindMethod(BindMethod.VALUE_OBJECT);
			configurationPropertiesBean.when(() -> ConfigurationPropertiesBean.deduceBindMethod(bindableMock2)).thenReturn(BindMethod.VALUE_OBJECT);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			ConfigurationPropertiesBean result = ConfigurationPropertiesBean.forValueObject(Object.class, "beanName1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				resolvableType.verify(() -> ResolvableType.forClass(Object.class), atLeast(1));
				mergedAnnotations.verify(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(2));
				verify(mergedAnnotationsMock, atLeast(1)).get(Annotation.class);
				verify(mergedAnnotationMock, times(2)).isPresent();
				verify(mergedAnnotationMock, atLeast(1)).synthesize();
				verify(mergedAnnotationsMock2, atLeast(1)).get(Annotation.class);
				verify(mergedAnnotationMock2, times(2)).isPresent();
				verify(mergedAnnotationMock2, atLeast(1)).synthesize();
				bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
				verify(bindableMock, atLeast(1)).withAnnotations(annotationArray);
				verify(bindableMock2, atLeast(1)).withBindMethod(BindMethod.VALUE_OBJECT);
				configurationPropertiesBean.verify(() -> ConfigurationPropertiesBean.deduceBindMethod(bindableMock2), atLeast(1));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${91beec94-4b36-3fb4-b0bb-7dad6b775c0d}, hash: FD6478B022EA9A753BF343A133F6CC14
	@Disabled()
	@Test()
	void deduceBindMethodWhenBindConstructorIsNotNull() {
		/* Branches:
		 * (bindConstructor != null) : true  #  inside deduceBindMethod method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: DEFAULT
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		BindMethod result = ConfigurationPropertiesBean.deduceBindMethod(Object.class);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(BindMethod.VALUE_OBJECT)));
	}

	//Sapient generated method id: ${f10ba781-66e7-3c18-8fab-d6c748dddcd6}, hash: BB2BCFDDA118B3A6827D174CC0BEAEF9
	@Test()
	void deduceBindMethodWhenBindConstructorIsNull() {
		/* Branches:
		 * (bindConstructor != null) : false  #  inside deduceBindMethod method
		 */
		//Act Statement(s)
		BindMethod result = ConfigurationPropertiesBean.deduceBindMethod(Object.class);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(BindMethod.JAVA_BEAN)));
	}

	//Sapient generated method id: ${09ff049a-d721-397c-b356-d42e6fb8f3ab}, hash: 21403AE5AADDB8C9D651DD5679966C7C
	@Disabled()
	@Test()
	void deduceBindMethod1WhenBindConstructorIsNotNull() {
		/* Branches:
		 * (bindConstructor != null) : true  #  inside deduceBindMethod method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: DEFAULT
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Bindable<Object> bindableMock = mock(Bindable.class);
		//Act Statement(s)
		BindMethod result = ConfigurationPropertiesBean.deduceBindMethod(bindableMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(BindMethod.VALUE_OBJECT)));
	}

	//Sapient generated method id: ${a1b381ac-175b-3317-8c0d-5a6003d5f0eb}, hash: D9FD6CC4883C2AF98B6CDD4FAE30C604
	@Disabled()
	@Test()
	void deduceBindMethod1WhenBindConstructorIsNull() {
		/* Branches:
		 * (bindConstructor != null) : false  #  inside deduceBindMethod method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: DEFAULT
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Bindable<Object> bindableMock = mock(Bindable.class);
		//Act Statement(s)
		BindMethod result = ConfigurationPropertiesBean.deduceBindMethod(bindableMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(BindMethod.JAVA_BEAN)));
	}
}
