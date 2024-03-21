package org.springframework.boot.context.properties;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.util.ClassUtils;

import org.mockito.MockedStatic;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.context.properties.bind.BindMethod;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertiesBeanFactoryInitializationAotProcessorSapientGeneratedTest {

	private final ConfigurableListableBeanFactory beanFactoryMock = mock(ConfigurableListableBeanFactory.class);

	private final Bindable bindableMock = mock(Bindable.class);

	private final Bindable bindableMock2 = mock(Bindable.class);

	//Sapient generated method id: ${9aaf9ba4-0b21-37e3-8723-b5242eca45cd}, hash: B97407F694FC612810194440081933F1
	@Test()
	void processAheadOfTimeWhenBeanTypeIsNullAndBindablesIsEmpty() throws NoSuchBeanDefinitionException {
		/* Branches:
		 * (for-each(beanNames)) : true
		 * (beanType != null) : false
		 * (!bindables.isEmpty()) : false
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] { "return_of_getBeanNamesForAnnotationItem1" };
		doReturn(stringArray).when(beanFactoryMock).getBeanNamesForAnnotation(ConfigurationProperties.class);
		doReturn(null).when(beanFactoryMock).getType("return_of_getBeanNamesForAnnotationItem1", false);
		ConfigurationPropertiesBeanFactoryInitializationAotProcessor target = new ConfigurationPropertiesBeanFactoryInitializationAotProcessor();
		//Act Statement(s)
		ConfigurationPropertiesBeanFactoryInitializationAotProcessor.ConfigurationPropertiesReflectionHintsContribution result = target.processAheadOfTime(beanFactoryMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(nullValue()));
			verify(beanFactoryMock).getBeanNamesForAnnotation(ConfigurationProperties.class);
			verify(beanFactoryMock).getType("return_of_getBeanNamesForAnnotationItem1", false);
		});
	}

	//Sapient generated method id: ${0ff41713-1f95-3c5a-aceb-4b8f630c04d7}, hash: FFEF9A5F1E0D57FA2A51C75E875EE2F0
	@Test()
	void processAheadOfTimeWhenBindablesNotIsEmpty() throws NoSuchBeanDefinitionException {
		/* Branches:
		 * (for-each(beanNames)) : true
		 * (beanType != null) : true
		 * (beanFactory.containsBeanDefinition(beanName)) : true
		 * (bindMethod != null) : true
		 * (!bindables.isEmpty()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.context.properties.ConfigurationPropertiesBeanFactoryInitializationAotProcessor$ConfigurationPropertiesReflectionHintsContribution
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		BeanDefinition beanDefinitionMock = mock(BeanDefinition.class);
		try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			String[] stringArray = new String[] { "return_of_getBeanNamesForAnnotationItem1" };
			doReturn(stringArray).when(beanFactoryMock).getBeanNamesForAnnotation(ConfigurationProperties.class);
			doReturn(Object.class).when(beanFactoryMock).getType("return_of_getBeanNamesForAnnotationItem1", false);
			doReturn(true).when(beanFactoryMock).containsBeanDefinition("return_of_getBeanNamesForAnnotationItem1");
			doReturn(beanDefinitionMock).when(beanFactoryMock).getBeanDefinition("return_of_getBeanNamesForAnnotationItem1");
			doReturn(BindMethod.JAVA_BEAN).when(beanDefinitionMock).getAttribute("org.springframework.boot.context.properties.bind.BindMethod");
			classUtils.when(() -> ClassUtils.getUserClass(Object.class)).thenReturn(Object.class);
			bindable.when(() -> Bindable.of(Object.class)).thenReturn(bindableMock);
			doReturn(bindableMock2).when(bindableMock).withBindMethod(BindMethod.JAVA_BEAN);
			ConfigurationPropertiesBeanFactoryInitializationAotProcessor target = new ConfigurationPropertiesBeanFactoryInitializationAotProcessor();
			//Act Statement(s)
			ConfigurationPropertiesBeanFactoryInitializationAotProcessor.ConfigurationPropertiesReflectionHintsContribution result = target.processAheadOfTime(beanFactoryMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(beanFactoryMock).getBeanNamesForAnnotation(ConfigurationProperties.class);
				verify(beanFactoryMock).getType("return_of_getBeanNamesForAnnotationItem1", false);
				verify(beanFactoryMock).containsBeanDefinition("return_of_getBeanNamesForAnnotationItem1");
				verify(beanFactoryMock).getBeanDefinition("return_of_getBeanNamesForAnnotationItem1");
				verify(beanDefinitionMock).getAttribute("org.springframework.boot.context.properties.bind.BindMethod");
				classUtils.verify(() -> ClassUtils.getUserClass(Object.class), atLeast(1));
				bindable.verify(() -> Bindable.of(Object.class), atLeast(1));
				verify(bindableMock).withBindMethod(BindMethod.JAVA_BEAN);
			});
		}
	}

	//Sapient generated method id: ${12f437b1-923a-304c-b2e1-9d45becc3d86}, hash: 697C9E7017233D1DA1AC2701ED599D00
	@Test()
	void processAheadOfTimeWhenBeanFactoryNotContainsBeanDefinitionBeanNameAndBindMethodIsNullAndBindablesNotIsEmpty() throws NoSuchBeanDefinitionException {
		/* Branches:
		 * (for-each(beanNames)) : true
		 * (beanType != null) : true
		 * (beanFactory.containsBeanDefinition(beanName)) : false
		 * (bindMethod != null) : false
		 * (!bindables.isEmpty()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.context.properties.ConfigurationPropertiesBeanFactoryInitializationAotProcessor$ConfigurationPropertiesReflectionHintsContribution
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			String[] stringArray = new String[] { "return_of_getBeanNamesForAnnotationItem1" };
			doReturn(stringArray).when(beanFactoryMock).getBeanNamesForAnnotation(ConfigurationProperties.class);
			doReturn(Object.class).when(beanFactoryMock).getType("return_of_getBeanNamesForAnnotationItem1", false);
			doReturn(false).when(beanFactoryMock).containsBeanDefinition("return_of_getBeanNamesForAnnotationItem1");
			classUtils.when(() -> ClassUtils.getUserClass(Object.class)).thenReturn(Object.class);
			bindable.when(() -> Bindable.of(Object.class)).thenReturn(bindableMock);
			doReturn(bindableMock2).when(bindableMock).withBindMethod(BindMethod.JAVA_BEAN);
			ConfigurationPropertiesBeanFactoryInitializationAotProcessor target = new ConfigurationPropertiesBeanFactoryInitializationAotProcessor();
			//Act Statement(s)
			ConfigurationPropertiesBeanFactoryInitializationAotProcessor.ConfigurationPropertiesReflectionHintsContribution result = target.processAheadOfTime(beanFactoryMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(beanFactoryMock).getBeanNamesForAnnotation(ConfigurationProperties.class);
				verify(beanFactoryMock).getType("return_of_getBeanNamesForAnnotationItem1", false);
				verify(beanFactoryMock).containsBeanDefinition("return_of_getBeanNamesForAnnotationItem1");
				classUtils.verify(() -> ClassUtils.getUserClass(Object.class), atLeast(1));
				bindable.verify(() -> Bindable.of(Object.class), atLeast(1));
				verify(bindableMock).withBindMethod(BindMethod.JAVA_BEAN);
			});
		}
	}
}
