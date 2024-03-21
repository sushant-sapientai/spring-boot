package org.springframework.boot.context.properties;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanDefinitionStoreException;

import java.util.List;

import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.boot.context.properties.bind.validation.ValidationBindHandler;
import org.springframework.boot.context.properties.bind.PropertySourcesPlaceholdersResolver;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.core.env.PropertySources;
import org.springframework.beans.factory.ObjectProvider;

import java.util.ArrayList;
import java.util.function.Consumer;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.boot.context.properties.bind.BindConstructorProvider;
import org.springframework.validation.Validator;

import java.lang.annotation.Annotation;

import org.springframework.boot.context.properties.source.ConfigurationPropertySources;
import org.springframework.context.ApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.convert.ConversionService;
import org.springframework.beans.factory.BeanFactory;

import java.util.stream.Stream;

import org.springframework.boot.context.properties.bind.Bindable;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import org.springframework.boot.context.properties.bind.BindHandler;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.validation.annotation.Validated;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.atLeast;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertiesBinderSapientGeneratedTest {

	private final ApplicationContext applicationContextMock = mock(ApplicationContext.class, "applicationContext");

	private final Annotation annotationMock = mock(Annotation.class);

	private final Bindable bindableMock = mock(Bindable.class);

	private final BoundConfigurationProperties boundConfigurationPropertiesMock = mock(BoundConfigurationProperties.class);

	private final ConfigurationProperties configurationPropertiesMock = mock(ConfigurationProperties.class);

	private final Iterable iterableMock = mock(Iterable.class);

	private final ObjectProvider objectProviderMock = mock(ObjectProvider.class);

	private final ConfigurationPropertiesBean propertiesBeanMock = mock(ConfigurationPropertiesBean.class);

	private final ResolvableType resolvableTypeMock = mock(ResolvableType.class);

	private final Supplier supplierMock = mock(Supplier.class);

	private final Supplier supplierMock2 = mock(Supplier.class);

	private final Validator validatorMock = mock(Validator.class);

	//Sapient generated method id: ${5f413733-eae9-3716-8b35-15f8913f74a7}, hash: 2AC778221F83F271A104E3C33465E2B5
	@Disabled()
	@Test()
	void bindWhenGetBindHandlerAdvisorsIsNotEmptyAndThisBinderIsNullAndThisApplicationContextNotInstanceOfConfigurableApplicatio() throws BeansException {
		/* Branches:
		 * (this.configurationPropertiesValidator != null) : true  #  inside getValidators method
		 * (this.jsr303Present) : true  #  inside getValidators method
		 * (target.getAnnotation(Validated.class) != null) : true  #  inside getValidators method
		 * (this.jsr303Validator == null) : true  #  inside getJsr303Validator method
		 * (target.getValue() != null) : true  #  inside getSelfValidator method
		 * (value instanceof Validator validator) : true  #  inside getSelfValidator method
		 * (selfValidator != null) : true  #  inside getValidators method
		 * (bound != null) : true  #  inside getHandler method
		 * (annotation.ignoreInvalidFields()) : true  #  inside getBindHandler method
		 * (!annotation.ignoreUnknownFields()) : true  #  inside getBindHandler method
		 * (!validators.isEmpty()) : true  #  inside getBindHandler method
		 * (for-each(getBindHandlerAdvisors())) : true  #  inside getBindHandler method
		 * (this.binder == null) : true  #  inside getBinder method
		 * (this.applicationContext instanceof ConfigurableApplicationContext configurableContext) : false  #  inside getPropertyEditorInitializer method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type Binder, object of type PropertySourcesDeducer
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		BindHandler bindHandlerMock = mock(BindHandler.class);
		try (MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
			 MockedStatic<BoundConfigurationProperties> boundConfigurationProperties = mockStatic(BoundConfigurationProperties.class);
			 MockedStatic<ConfigurationPropertiesJsr303Validator> configurationPropertiesJsr303Validator = mockStatic(ConfigurationPropertiesJsr303Validator.class)) {
			doReturn(bindableMock).when(propertiesBeanMock).asBindTarget();
			doReturn(annotationMock).when(bindableMock).getAnnotation(Validated.class);
			doReturn(supplierMock, supplierMock2).when(bindableMock).getValue();
			doReturn(configurationPropertiesMock).when(propertiesBeanMock).getAnnotation();
			doReturn(true).when(configurationPropertiesMock).ignoreInvalidFields();
			doReturn(false).when(configurationPropertiesMock).ignoreUnknownFields();
			doReturn("return_of_prefix1").when(configurationPropertiesMock).prefix();
			doReturn(true).when(applicationContextMock).containsBean("configurationPropertiesValidator");
			doReturn(validatorMock).when(applicationContextMock).getBean("configurationPropertiesValidator", Validator.class);
			configurationPropertiesJsr303Validator.when(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock)).thenReturn(true);
			boundConfigurationProperties.when(() -> BoundConfigurationProperties.get(applicationContextMock)).thenReturn(boundConfigurationPropertiesMock);
			configurationPropertySources.when(() -> ConfigurationPropertySources.from((PropertySources) any())).thenReturn(iterableMock);
			ConfigurationPropertiesBinder target = new ConfigurationPropertiesBinder(applicationContextMock);
			doReturn(objectProviderMock).when(applicationContextMock).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
			Stream stream = Stream.empty();
			doReturn(stream).when(objectProviderMock).orderedStream();
			//Act Statement(s)
			BindResult<?> result = target.bind(propertiesBeanMock);
			PropertySourcesDeducer propertySourcesDeducer = new PropertySourcesDeducer(applicationContextMock);
			PropertySources propertySources = propertySourcesDeducer.getPropertySources();
			PropertySourcesPlaceholdersResolver propertySourcesPlaceholdersResolver = new PropertySourcesPlaceholdersResolver(propertySources);
			List<ConversionService> conversionServiceList = new ArrayList<>();
			Binder binder = new Binder(iterableMock, propertySourcesPlaceholdersResolver, conversionServiceList, (Consumer) null, (BindHandler) null, (BindConstructorProvider) null);
			BindResult bindResult = binder.bind("return_of_prefix1", bindableMock, bindHandlerMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindResult));
				verify(propertiesBeanMock).asBindTarget();
				verify(bindableMock, atLeast(1)).getAnnotation(Validated.class);
				verify(bindableMock, atLeast(2)).getValue();
				verify(propertiesBeanMock).getAnnotation();
				verify(configurationPropertiesMock).ignoreInvalidFields();
				verify(configurationPropertiesMock).ignoreUnknownFields();
				verify(configurationPropertiesMock).prefix();
				verify(applicationContextMock).containsBean("configurationPropertiesValidator");
				verify(applicationContextMock).getBean("configurationPropertiesValidator", Validator.class);
				configurationPropertiesJsr303Validator.verify(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock), atLeast(1));
				boundConfigurationProperties.verify(() -> BoundConfigurationProperties.get(applicationContextMock), atLeast(1));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.from((PropertySources) any()));
				verify(applicationContextMock).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
				verify(objectProviderMock).orderedStream();
			});
		}
	}

	//Sapient generated method id: ${9e1bd0f0-b824-31a4-a8dd-599ee376f612}, hash: 5B221BBDAC67DDC14B3B99C2521281B2
	@Disabled()
	@Test()
	void bindWhenThisBinderIsNullAndThisApplicationContextNotInstanceOfConfigurableApplicationContext12() throws BeansException {
		/* Branches:
		 * (this.configurationPropertiesValidator != null) : true  #  inside getValidators method
		 * (this.jsr303Present) : true  #  inside getValidators method
		 * (target.getAnnotation(Validated.class) != null) : true  #  inside getValidators method
		 * (this.jsr303Validator == null) : true  #  inside getJsr303Validator method
		 * (target.getValue() != null) : true  #  inside getSelfValidator method
		 * (value instanceof Validator validator) : false  #  inside getSelfValidator method
		 * (selfValidator != null) : false  #  inside getValidators method
		 * (bound != null) : false  #  inside getHandler method
		 * (annotation.ignoreInvalidFields()) : false  #  inside getBindHandler method
		 * (!annotation.ignoreUnknownFields()) : false  #  inside getBindHandler method
		 * (!validators.isEmpty()) : true  #  inside getBindHandler method
		 * (for-each(getBindHandlerAdvisors())) : false  #  inside getBindHandler method
		 * (this.binder == null) : true  #  inside getBinder method
		 * (this.applicationContext instanceof ConfigurableApplicationContext configurableContext) : false  #  inside getPropertyEditorInitializer method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type Binder, object of type PropertySourcesDeducer
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
			 MockedStatic<BoundConfigurationProperties> boundConfigurationProperties = mockStatic(BoundConfigurationProperties.class);
			 MockedStatic<ConfigurationPropertiesJsr303Validator> configurationPropertiesJsr303Validator = mockStatic(ConfigurationPropertiesJsr303Validator.class)) {
			doReturn(bindableMock).when(propertiesBeanMock).asBindTarget();
			doReturn(annotationMock).when(bindableMock).getAnnotation(Validated.class);
			doReturn(supplierMock, supplierMock2).when(bindableMock).getValue();
			doReturn(configurationPropertiesMock).when(propertiesBeanMock).getAnnotation();
			doReturn(false).when(configurationPropertiesMock).ignoreInvalidFields();
			doReturn(true).when(configurationPropertiesMock).ignoreUnknownFields();
			doReturn("return_of_prefix1").when(configurationPropertiesMock).prefix();
			doReturn(true).when(applicationContextMock).containsBean("configurationPropertiesValidator");
			doReturn(validatorMock).when(applicationContextMock).getBean("configurationPropertiesValidator", Validator.class);
			configurationPropertiesJsr303Validator.when(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock)).thenReturn(true);
			boundConfigurationProperties.when(() -> BoundConfigurationProperties.get(applicationContextMock)).thenReturn(null);
			configurationPropertySources.when(() -> ConfigurationPropertySources.from((PropertySources) any())).thenReturn(iterableMock);
			ConfigurationPropertiesBinder target = new ConfigurationPropertiesBinder(applicationContextMock);
			doReturn(objectProviderMock).when(applicationContextMock).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
			Stream stream = Stream.empty();
			doReturn(stream).when(objectProviderMock).orderedStream();
			//Act Statement(s)
			BindResult<?> result = target.bind(propertiesBeanMock);
			PropertySourcesDeducer propertySourcesDeducer = new PropertySourcesDeducer(applicationContextMock);
			PropertySources propertySources = propertySourcesDeducer.getPropertySources();
			PropertySourcesPlaceholdersResolver propertySourcesPlaceholdersResolver = new PropertySourcesPlaceholdersResolver(propertySources);
			List<ConversionService> conversionServiceList = new ArrayList<>();
			Binder binder = new Binder(iterableMock, propertySourcesPlaceholdersResolver, conversionServiceList, (Consumer) null, (BindHandler) null, (BindConstructorProvider) null);
			ConfigurationPropertiesJsr303Validator configurationPropertiesJsr303Validator2 = new ConfigurationPropertiesJsr303Validator(applicationContextMock);
			Validator[] validatorArray = new Validator[] { validatorMock, configurationPropertiesJsr303Validator2 };
			ValidationBindHandler validationBindHandler = new ValidationBindHandler((BindHandler) null, validatorArray);
			BindResult bindResult = binder.bind("return_of_prefix1", bindableMock, validationBindHandler);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindResult));
				verify(propertiesBeanMock).asBindTarget();
				verify(bindableMock, atLeast(1)).getAnnotation(Validated.class);
				verify(bindableMock, atLeast(2)).getValue();
				verify(propertiesBeanMock).getAnnotation();
				verify(configurationPropertiesMock).ignoreInvalidFields();
				verify(configurationPropertiesMock).ignoreUnknownFields();
				verify(configurationPropertiesMock).prefix();
				verify(applicationContextMock, atLeast(1)).containsBean("configurationPropertiesValidator");
				verify(applicationContextMock, atLeast(1)).getBean("configurationPropertiesValidator", Validator.class);
				configurationPropertiesJsr303Validator.verify(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock), atLeast(1));
				boundConfigurationProperties.verify(() -> BoundConfigurationProperties.get(applicationContextMock), atLeast(1));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.from((PropertySources) any()));
				verify(applicationContextMock, atLeast(1)).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
				verify(objectProviderMock).orderedStream();
			});
		}
	}

	//Sapient generated method id: ${28c86dbf-2039-3d1a-9133-49e664a200a0}, hash: 3A02F882B6411D6562A2D17C684434C3
	@Disabled()
	@Test()
	void bindWhenThisBinderIsNullAndThisApplicationContextNotInstanceOfConfigurableApplicationContext13() throws BeansException {
		/* Branches:
		 * (this.configurationPropertiesValidator != null) : true  #  inside getValidators method
		 * (this.jsr303Present) : true  #  inside getValidators method
		 * (target.getAnnotation(Validated.class) != null) : true  #  inside getValidators method
		 * (this.jsr303Validator == null) : true  #  inside getJsr303Validator method
		 * (target.getValue() != null) : false  #  inside getSelfValidator method
		 * (Validator.class.isAssignableFrom(type)) : true  #  inside getSelfValidator method
		 * (selfValidator != null) : false  #  inside getValidators method
		 * (bound != null) : false  #  inside getHandler method
		 * (annotation.ignoreInvalidFields()) : false  #  inside getBindHandler method
		 * (!annotation.ignoreUnknownFields()) : false  #  inside getBindHandler method
		 * (!validators.isEmpty()) : true  #  inside getBindHandler method
		 * (for-each(getBindHandlerAdvisors())) : false  #  inside getBindHandler method
		 * (this.binder == null) : true  #  inside getBinder method
		 * (this.applicationContext instanceof ConfigurableApplicationContext configurableContext) : false  #  inside getPropertyEditorInitializer method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type Binder, object of type PropertySourcesDeducer
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
			 MockedStatic<BoundConfigurationProperties> boundConfigurationProperties = mockStatic(BoundConfigurationProperties.class);
			 MockedStatic<ConfigurationPropertiesJsr303Validator> configurationPropertiesJsr303Validator = mockStatic(ConfigurationPropertiesJsr303Validator.class)) {
			doReturn(bindableMock).when(propertiesBeanMock).asBindTarget();
			doReturn(annotationMock).when(bindableMock).getAnnotation(Validated.class);
			doReturn(null).when(bindableMock).getValue();
			doReturn(resolvableTypeMock).when(bindableMock).getType();
			doReturn(Object.class).when(resolvableTypeMock).resolve();
			doReturn(configurationPropertiesMock).when(propertiesBeanMock).getAnnotation();
			doReturn(false).when(configurationPropertiesMock).ignoreInvalidFields();
			doReturn(true).when(configurationPropertiesMock).ignoreUnknownFields();
			doReturn("return_of_prefix1").when(configurationPropertiesMock).prefix();
			doReturn(true).when(applicationContextMock).containsBean("configurationPropertiesValidator");
			doReturn(validatorMock).when(applicationContextMock).getBean("configurationPropertiesValidator", Validator.class);
			configurationPropertiesJsr303Validator.when(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock)).thenReturn(true);
			boundConfigurationProperties.when(() -> BoundConfigurationProperties.get(applicationContextMock)).thenReturn(null);
			configurationPropertySources.when(() -> ConfigurationPropertySources.from((PropertySources) any())).thenReturn(iterableMock);
			ConfigurationPropertiesBinder target = new ConfigurationPropertiesBinder(applicationContextMock);
			doReturn(objectProviderMock).when(applicationContextMock).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
			Stream stream = Stream.empty();
			doReturn(stream).when(objectProviderMock).orderedStream();
			//Act Statement(s)
			BindResult<?> result = target.bind(propertiesBeanMock);
			PropertySourcesDeducer propertySourcesDeducer = new PropertySourcesDeducer(applicationContextMock);
			PropertySources propertySources = propertySourcesDeducer.getPropertySources();
			PropertySourcesPlaceholdersResolver propertySourcesPlaceholdersResolver = new PropertySourcesPlaceholdersResolver(propertySources);
			List<ConversionService> conversionServiceList = new ArrayList<>();
			Binder binder = new Binder(iterableMock, propertySourcesPlaceholdersResolver, conversionServiceList, (Consumer) null, (BindHandler) null, (BindConstructorProvider) null);
			ConfigurationPropertiesJsr303Validator configurationPropertiesJsr303Validator2 = new ConfigurationPropertiesJsr303Validator(applicationContextMock);
			Validator[] validatorArray = new Validator[] { validatorMock, configurationPropertiesJsr303Validator2 };
			ValidationBindHandler validationBindHandler = new ValidationBindHandler((BindHandler) null, validatorArray);
			BindResult bindResult = binder.bind("return_of_prefix1", bindableMock, validationBindHandler);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindResult));
				verify(propertiesBeanMock).asBindTarget();
				verify(bindableMock, atLeast(1)).getAnnotation(Validated.class);
				verify(bindableMock, atLeast(1)).getValue();
				verify(bindableMock, atLeast(1)).getType();
				verify(resolvableTypeMock).resolve();
				verify(propertiesBeanMock).getAnnotation();
				verify(configurationPropertiesMock).ignoreInvalidFields();
				verify(configurationPropertiesMock).ignoreUnknownFields();
				verify(configurationPropertiesMock).prefix();
				verify(applicationContextMock, atLeast(1)).containsBean("configurationPropertiesValidator");
				verify(applicationContextMock, atLeast(1)).getBean("configurationPropertiesValidator", Validator.class);
				configurationPropertiesJsr303Validator.verify(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock), atLeast(1));
				boundConfigurationProperties.verify(() -> BoundConfigurationProperties.get(applicationContextMock), atLeast(1));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.from((PropertySources) any()));
				verify(applicationContextMock, atLeast(1)).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
				verify(objectProviderMock).orderedStream();
			});
		}
	}

	//Sapient generated method id: ${257f579d-62cf-30d3-8fa8-2f1fa261c8a4}, hash: 7AF53344604EDC4A39E0835BC75E9D9A
	@Disabled()
	@Test()
	void bindWhenThisBinderIsNullAndThisApplicationContextNotInstanceOfConfigurableApplicationContext14() throws BeansException {
		/* Branches:
		 * (this.configurationPropertiesValidator != null) : true  #  inside getValidators method
		 * (this.jsr303Present) : true  #  inside getValidators method
		 * (target.getAnnotation(Validated.class) != null) : true  #  inside getValidators method
		 * (this.jsr303Validator == null) : true  #  inside getJsr303Validator method
		 * (target.getValue() != null) : false  #  inside getSelfValidator method
		 * (Validator.class.isAssignableFrom(type)) : false  #  inside getSelfValidator method
		 * (selfValidator != null) : false  #  inside getValidators method
		 * (bound != null) : false  #  inside getHandler method
		 * (annotation.ignoreInvalidFields()) : false  #  inside getBindHandler method
		 * (!annotation.ignoreUnknownFields()) : false  #  inside getBindHandler method
		 * (!validators.isEmpty()) : true  #  inside getBindHandler method
		 * (for-each(getBindHandlerAdvisors())) : false  #  inside getBindHandler method
		 * (this.binder == null) : true  #  inside getBinder method
		 * (this.applicationContext instanceof ConfigurableApplicationContext configurableContext) : false  #  inside getPropertyEditorInitializer method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type Binder, object of type PropertySourcesDeducer
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
			 MockedStatic<BoundConfigurationProperties> boundConfigurationProperties = mockStatic(BoundConfigurationProperties.class);
			 MockedStatic<ConfigurationPropertiesJsr303Validator> configurationPropertiesJsr303Validator = mockStatic(ConfigurationPropertiesJsr303Validator.class)) {
			doReturn(bindableMock).when(propertiesBeanMock).asBindTarget();
			doReturn(annotationMock).when(bindableMock).getAnnotation(Validated.class);
			doReturn(null).when(bindableMock).getValue();
			doReturn(resolvableTypeMock).when(bindableMock).getType();
			doReturn(Object.class).when(resolvableTypeMock).resolve();
			doReturn(configurationPropertiesMock).when(propertiesBeanMock).getAnnotation();
			doReturn(false).when(configurationPropertiesMock).ignoreInvalidFields();
			doReturn(true).when(configurationPropertiesMock).ignoreUnknownFields();
			doReturn("return_of_prefix1").when(configurationPropertiesMock).prefix();
			doReturn(true).when(applicationContextMock).containsBean("configurationPropertiesValidator");
			doReturn(validatorMock).when(applicationContextMock).getBean("configurationPropertiesValidator", Validator.class);
			configurationPropertiesJsr303Validator.when(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock)).thenReturn(true);
			boundConfigurationProperties.when(() -> BoundConfigurationProperties.get(applicationContextMock)).thenReturn(null);
			configurationPropertySources.when(() -> ConfigurationPropertySources.from((PropertySources) any())).thenReturn(iterableMock);
			ConfigurationPropertiesBinder target = new ConfigurationPropertiesBinder(applicationContextMock);
			doReturn(objectProviderMock).when(applicationContextMock).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
			Stream stream = Stream.empty();
			doReturn(stream).when(objectProviderMock).orderedStream();
			//Act Statement(s)
			BindResult<?> result = target.bind(propertiesBeanMock);
			PropertySourcesDeducer propertySourcesDeducer = new PropertySourcesDeducer(applicationContextMock);
			PropertySources propertySources = propertySourcesDeducer.getPropertySources();
			PropertySourcesPlaceholdersResolver propertySourcesPlaceholdersResolver = new PropertySourcesPlaceholdersResolver(propertySources);
			List<ConversionService> conversionServiceList = new ArrayList<>();
			Binder binder = new Binder(iterableMock, propertySourcesPlaceholdersResolver, conversionServiceList, (Consumer) null, (BindHandler) null, (BindConstructorProvider) null);
			ConfigurationPropertiesJsr303Validator configurationPropertiesJsr303Validator2 = new ConfigurationPropertiesJsr303Validator(applicationContextMock);
			Validator[] validatorArray = new Validator[] { validatorMock, configurationPropertiesJsr303Validator2 };
			ValidationBindHandler validationBindHandler = new ValidationBindHandler((BindHandler) null, validatorArray);
			BindResult bindResult = binder.bind("return_of_prefix1", bindableMock, validationBindHandler);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindResult));
				verify(propertiesBeanMock).asBindTarget();
				verify(bindableMock, atLeast(1)).getAnnotation(Validated.class);
				verify(bindableMock, atLeast(1)).getValue();
				verify(bindableMock, atLeast(1)).getType();
				verify(resolvableTypeMock).resolve();
				verify(propertiesBeanMock).getAnnotation();
				verify(configurationPropertiesMock).ignoreInvalidFields();
				verify(configurationPropertiesMock).ignoreUnknownFields();
				verify(configurationPropertiesMock).prefix();
				verify(applicationContextMock, atLeast(1)).containsBean("configurationPropertiesValidator");
				verify(applicationContextMock, atLeast(1)).getBean("configurationPropertiesValidator", Validator.class);
				configurationPropertiesJsr303Validator.verify(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock), atLeast(1));
				boundConfigurationProperties.verify(() -> BoundConfigurationProperties.get(applicationContextMock), atLeast(1));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.from((PropertySources) any()));
				verify(applicationContextMock, atLeast(1)).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
				verify(objectProviderMock).orderedStream();
			});
		}
	}

	//Sapient generated method id: ${cbcd0f61-e28b-316e-b0b7-548e04a4da3e}, hash: DCE007D6D66CFEFEB85F48D5A3BF9C3C
	@Disabled()
	@Test()
	void bindOrCreateWhenGetBindHandlerAdvisorsIsNotEmptyAndThisBinderIsNullAndThisApplicationContextNotInstanceOfConfigurableAp() throws BeansException {
		/* Branches:
		 * (this.configurationPropertiesValidator != null) : true  #  inside getValidators method
		 * (this.jsr303Present) : true  #  inside getValidators method
		 * (target.getAnnotation(Validated.class) != null) : true  #  inside getValidators method
		 * (this.jsr303Validator == null) : true  #  inside getJsr303Validator method
		 * (target.getValue() != null) : true  #  inside getSelfValidator method
		 * (value instanceof Validator validator) : true  #  inside getSelfValidator method
		 * (selfValidator != null) : true  #  inside getValidators method
		 * (bound != null) : true  #  inside getHandler method
		 * (annotation.ignoreInvalidFields()) : true  #  inside getBindHandler method
		 * (!annotation.ignoreUnknownFields()) : true  #  inside getBindHandler method
		 * (!validators.isEmpty()) : true  #  inside getBindHandler method
		 * (for-each(getBindHandlerAdvisors())) : true  #  inside getBindHandler method
		 * (this.binder == null) : true  #  inside getBinder method
		 * (this.applicationContext instanceof ConfigurableApplicationContext configurableContext) : false  #  inside getPropertyEditorInitializer method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type Binder, object of type PropertySourcesDeducer
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
			 MockedStatic<BoundConfigurationProperties> boundConfigurationProperties = mockStatic(BoundConfigurationProperties.class);
			 MockedStatic<ConfigurationPropertiesJsr303Validator> configurationPropertiesJsr303Validator = mockStatic(ConfigurationPropertiesJsr303Validator.class)) {
			doReturn(bindableMock).when(propertiesBeanMock).asBindTarget();
			doReturn(annotationMock).when(bindableMock).getAnnotation(Validated.class);
			doReturn(supplierMock, supplierMock2).when(bindableMock).getValue();
			doReturn(configurationPropertiesMock).when(propertiesBeanMock).getAnnotation();
			doReturn(true).when(configurationPropertiesMock).ignoreInvalidFields();
			doReturn(false).when(configurationPropertiesMock).ignoreUnknownFields();
			doReturn("return_of_prefix1").when(configurationPropertiesMock).prefix();
			doReturn(true).when(applicationContextMock).containsBean("configurationPropertiesValidator");
			doReturn(validatorMock).when(applicationContextMock).getBean("configurationPropertiesValidator", Validator.class);
			configurationPropertiesJsr303Validator.when(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock)).thenReturn(true);
			boundConfigurationProperties.when(() -> BoundConfigurationProperties.get(applicationContextMock)).thenReturn(boundConfigurationPropertiesMock);
			configurationPropertySources.when(() -> ConfigurationPropertySources.from((PropertySources) any())).thenReturn(iterableMock);
			ConfigurationPropertiesBinder target = new ConfigurationPropertiesBinder(applicationContextMock);
			doReturn(objectProviderMock).when(applicationContextMock).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
			Stream stream = Stream.empty();
			doReturn(stream).when(objectProviderMock).orderedStream();
			//Act Statement(s)
			Object result = target.bindOrCreate(propertiesBeanMock);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(propertiesBeanMock).asBindTarget();
				verify(bindableMock, atLeast(1)).getAnnotation(Validated.class);
				verify(bindableMock, atLeast(2)).getValue();
				verify(propertiesBeanMock).getAnnotation();
				verify(configurationPropertiesMock).ignoreInvalidFields();
				verify(configurationPropertiesMock).ignoreUnknownFields();
				verify(configurationPropertiesMock).prefix();
				verify(applicationContextMock).containsBean("configurationPropertiesValidator");
				verify(applicationContextMock).getBean("configurationPropertiesValidator", Validator.class);
				configurationPropertiesJsr303Validator.verify(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock), atLeast(1));
				boundConfigurationProperties.verify(() -> BoundConfigurationProperties.get(applicationContextMock), atLeast(1));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.from((PropertySources) any()));
				verify(applicationContextMock).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
				verify(objectProviderMock).orderedStream();
			});
		}
	}

	//Sapient generated method id: ${a77da511-e4a4-3b6c-9785-bbbeaed49824}, hash: 42E1B21154154E01AE8EB46911FD87C1
	@Disabled()
	@Test()
	void bindOrCreateWhenThisBinderIsNullAndThisApplicationContextNotInstanceOfConfigurableApplicationContext12() throws BeansException {
		/* Branches:
		 * (this.configurationPropertiesValidator != null) : true  #  inside getValidators method
		 * (this.jsr303Present) : true  #  inside getValidators method
		 * (target.getAnnotation(Validated.class) != null) : true  #  inside getValidators method
		 * (this.jsr303Validator == null) : true  #  inside getJsr303Validator method
		 * (target.getValue() != null) : true  #  inside getSelfValidator method
		 * (value instanceof Validator validator) : false  #  inside getSelfValidator method
		 * (selfValidator != null) : false  #  inside getValidators method
		 * (bound != null) : false  #  inside getHandler method
		 * (annotation.ignoreInvalidFields()) : false  #  inside getBindHandler method
		 * (!annotation.ignoreUnknownFields()) : false  #  inside getBindHandler method
		 * (!validators.isEmpty()) : true  #  inside getBindHandler method
		 * (for-each(getBindHandlerAdvisors())) : false  #  inside getBindHandler method
		 * (this.binder == null) : true  #  inside getBinder method
		 * (this.applicationContext instanceof ConfigurableApplicationContext configurableContext) : false  #  inside getPropertyEditorInitializer method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type Binder, object of type PropertySourcesDeducer
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
			 MockedStatic<BoundConfigurationProperties> boundConfigurationProperties = mockStatic(BoundConfigurationProperties.class);
			 MockedStatic<ConfigurationPropertiesJsr303Validator> configurationPropertiesJsr303Validator = mockStatic(ConfigurationPropertiesJsr303Validator.class)) {
			doReturn(bindableMock).when(propertiesBeanMock).asBindTarget();
			doReturn(annotationMock).when(bindableMock).getAnnotation(Validated.class);
			doReturn(supplierMock, supplierMock2).when(bindableMock).getValue();
			doReturn(configurationPropertiesMock).when(propertiesBeanMock).getAnnotation();
			doReturn(false).when(configurationPropertiesMock).ignoreInvalidFields();
			doReturn(true).when(configurationPropertiesMock).ignoreUnknownFields();
			doReturn("return_of_prefix1").when(configurationPropertiesMock).prefix();
			doReturn(true).when(applicationContextMock).containsBean("configurationPropertiesValidator");
			doReturn(validatorMock).when(applicationContextMock).getBean("configurationPropertiesValidator", Validator.class);
			configurationPropertiesJsr303Validator.when(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock)).thenReturn(true);
			boundConfigurationProperties.when(() -> BoundConfigurationProperties.get(applicationContextMock)).thenReturn(null);
			configurationPropertySources.when(() -> ConfigurationPropertySources.from((PropertySources) any())).thenReturn(iterableMock);
			ConfigurationPropertiesBinder target = new ConfigurationPropertiesBinder(applicationContextMock);
			doReturn(objectProviderMock).when(applicationContextMock).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
			Stream stream = Stream.empty();
			doReturn(stream).when(objectProviderMock).orderedStream();
			//Act Statement(s)
			Object result = target.bindOrCreate(propertiesBeanMock);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(propertiesBeanMock).asBindTarget();
				verify(bindableMock, atLeast(1)).getAnnotation(Validated.class);
				verify(bindableMock, atLeast(2)).getValue();
				verify(propertiesBeanMock).getAnnotation();
				verify(configurationPropertiesMock).ignoreInvalidFields();
				verify(configurationPropertiesMock).ignoreUnknownFields();
				verify(configurationPropertiesMock).prefix();
				verify(applicationContextMock, atLeast(1)).containsBean("configurationPropertiesValidator");
				verify(applicationContextMock, atLeast(1)).getBean("configurationPropertiesValidator", Validator.class);
				configurationPropertiesJsr303Validator.verify(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock), atLeast(1));
				boundConfigurationProperties.verify(() -> BoundConfigurationProperties.get(applicationContextMock), atLeast(1));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.from((PropertySources) any()));
				verify(applicationContextMock, atLeast(1)).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
				verify(objectProviderMock).orderedStream();
			});
		}
	}

	//Sapient generated method id: ${759ed4a6-e5ec-311f-a311-51064f364f74}, hash: 5BBAC4BFD05D693D188FBC5B1888B8AB
	@Disabled()
	@Test()
	void bindOrCreateWhenThisBinderIsNullAndThisApplicationContextNotInstanceOfConfigurableApplicationContext13() throws BeansException {
		/* Branches:
		 * (this.configurationPropertiesValidator != null) : true  #  inside getValidators method
		 * (this.jsr303Present) : true  #  inside getValidators method
		 * (target.getAnnotation(Validated.class) != null) : true  #  inside getValidators method
		 * (this.jsr303Validator == null) : true  #  inside getJsr303Validator method
		 * (target.getValue() != null) : false  #  inside getSelfValidator method
		 * (Validator.class.isAssignableFrom(type)) : true  #  inside getSelfValidator method
		 * (selfValidator != null) : false  #  inside getValidators method
		 * (bound != null) : false  #  inside getHandler method
		 * (annotation.ignoreInvalidFields()) : false  #  inside getBindHandler method
		 * (!annotation.ignoreUnknownFields()) : false  #  inside getBindHandler method
		 * (!validators.isEmpty()) : true  #  inside getBindHandler method
		 * (for-each(getBindHandlerAdvisors())) : false  #  inside getBindHandler method
		 * (this.binder == null) : true  #  inside getBinder method
		 * (this.applicationContext instanceof ConfigurableApplicationContext configurableContext) : false  #  inside getPropertyEditorInitializer method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type Binder, object of type PropertySourcesDeducer
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
			 MockedStatic<BoundConfigurationProperties> boundConfigurationProperties = mockStatic(BoundConfigurationProperties.class);
			 MockedStatic<ConfigurationPropertiesJsr303Validator> configurationPropertiesJsr303Validator = mockStatic(ConfigurationPropertiesJsr303Validator.class)) {
			doReturn(bindableMock).when(propertiesBeanMock).asBindTarget();
			doReturn(annotationMock).when(bindableMock).getAnnotation(Validated.class);
			doReturn(null).when(bindableMock).getValue();
			doReturn(resolvableTypeMock).when(bindableMock).getType();
			doReturn(Object.class).when(resolvableTypeMock).resolve();
			doReturn(configurationPropertiesMock).when(propertiesBeanMock).getAnnotation();
			doReturn(false).when(configurationPropertiesMock).ignoreInvalidFields();
			doReturn(true).when(configurationPropertiesMock).ignoreUnknownFields();
			doReturn("return_of_prefix1").when(configurationPropertiesMock).prefix();
			doReturn(true).when(applicationContextMock).containsBean("configurationPropertiesValidator");
			doReturn(validatorMock).when(applicationContextMock).getBean("configurationPropertiesValidator", Validator.class);
			configurationPropertiesJsr303Validator.when(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock)).thenReturn(true);
			boundConfigurationProperties.when(() -> BoundConfigurationProperties.get(applicationContextMock)).thenReturn(null);
			configurationPropertySources.when(() -> ConfigurationPropertySources.from((PropertySources) any())).thenReturn(iterableMock);
			ConfigurationPropertiesBinder target = new ConfigurationPropertiesBinder(applicationContextMock);
			doReturn(objectProviderMock).when(applicationContextMock).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
			Stream stream = Stream.empty();
			doReturn(stream).when(objectProviderMock).orderedStream();
			//Act Statement(s)
			Object result = target.bindOrCreate(propertiesBeanMock);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(propertiesBeanMock).asBindTarget();
				verify(bindableMock, atLeast(1)).getAnnotation(Validated.class);
				verify(bindableMock, atLeast(1)).getValue();
				verify(bindableMock, atLeast(1)).getType();
				verify(resolvableTypeMock).resolve();
				verify(propertiesBeanMock).getAnnotation();
				verify(configurationPropertiesMock).ignoreInvalidFields();
				verify(configurationPropertiesMock).ignoreUnknownFields();
				verify(configurationPropertiesMock).prefix();
				verify(applicationContextMock, atLeast(1)).containsBean("configurationPropertiesValidator");
				verify(applicationContextMock, atLeast(1)).getBean("configurationPropertiesValidator", Validator.class);
				configurationPropertiesJsr303Validator.verify(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock), atLeast(1));
				boundConfigurationProperties.verify(() -> BoundConfigurationProperties.get(applicationContextMock), atLeast(1));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.from((PropertySources) any()));
				verify(applicationContextMock, atLeast(1)).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
				verify(objectProviderMock).orderedStream();
			});
		}
	}

	//Sapient generated method id: ${8176d8cc-b749-33d3-abc5-f6a4031faa7b}, hash: 31987A424463CDED0861B004E7497D5B
	@Disabled()
	@Test()
	void bindOrCreateWhenThisBinderIsNullAndThisApplicationContextNotInstanceOfConfigurableApplicationContext14() throws BeansException {
		/* Branches:
		 * (this.configurationPropertiesValidator != null) : true  #  inside getValidators method
		 * (this.jsr303Present) : true  #  inside getValidators method
		 * (target.getAnnotation(Validated.class) != null) : true  #  inside getValidators method
		 * (this.jsr303Validator == null) : true  #  inside getJsr303Validator method
		 * (target.getValue() != null) : false  #  inside getSelfValidator method
		 * (Validator.class.isAssignableFrom(type)) : false  #  inside getSelfValidator method
		 * (selfValidator != null) : false  #  inside getValidators method
		 * (bound != null) : false  #  inside getHandler method
		 * (annotation.ignoreInvalidFields()) : false  #  inside getBindHandler method
		 * (!annotation.ignoreUnknownFields()) : false  #  inside getBindHandler method
		 * (!validators.isEmpty()) : true  #  inside getBindHandler method
		 * (for-each(getBindHandlerAdvisors())) : false  #  inside getBindHandler method
		 * (this.binder == null) : true  #  inside getBinder method
		 * (this.applicationContext instanceof ConfigurableApplicationContext configurableContext) : false  #  inside getPropertyEditorInitializer method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type Binder, object of type PropertySourcesDeducer
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class);
			 MockedStatic<BoundConfigurationProperties> boundConfigurationProperties = mockStatic(BoundConfigurationProperties.class);
			 MockedStatic<ConfigurationPropertiesJsr303Validator> configurationPropertiesJsr303Validator = mockStatic(ConfigurationPropertiesJsr303Validator.class)) {
			doReturn(bindableMock).when(propertiesBeanMock).asBindTarget();
			doReturn(annotationMock).when(bindableMock).getAnnotation(Validated.class);
			doReturn(null).when(bindableMock).getValue();
			doReturn(resolvableTypeMock).when(bindableMock).getType();
			doReturn(Object.class).when(resolvableTypeMock).resolve();
			doReturn(configurationPropertiesMock).when(propertiesBeanMock).getAnnotation();
			doReturn(false).when(configurationPropertiesMock).ignoreInvalidFields();
			doReturn(true).when(configurationPropertiesMock).ignoreUnknownFields();
			doReturn("return_of_prefix1").when(configurationPropertiesMock).prefix();
			doReturn(true).when(applicationContextMock).containsBean("configurationPropertiesValidator");
			doReturn(validatorMock).when(applicationContextMock).getBean("configurationPropertiesValidator", Validator.class);
			configurationPropertiesJsr303Validator.when(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock)).thenReturn(true);
			boundConfigurationProperties.when(() -> BoundConfigurationProperties.get(applicationContextMock)).thenReturn(null);
			configurationPropertySources.when(() -> ConfigurationPropertySources.from((PropertySources) any())).thenReturn(iterableMock);
			ConfigurationPropertiesBinder target = new ConfigurationPropertiesBinder(applicationContextMock);
			doReturn(objectProviderMock).when(applicationContextMock).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
			Stream stream = Stream.empty();
			doReturn(stream).when(objectProviderMock).orderedStream();
			//Act Statement(s)
			Object result = target.bindOrCreate(propertiesBeanMock);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(propertiesBeanMock).asBindTarget();
				verify(bindableMock, atLeast(1)).getAnnotation(Validated.class);
				verify(bindableMock, atLeast(1)).getValue();
				verify(bindableMock, atLeast(1)).getType();
				verify(resolvableTypeMock).resolve();
				verify(propertiesBeanMock).getAnnotation();
				verify(configurationPropertiesMock).ignoreInvalidFields();
				verify(configurationPropertiesMock).ignoreUnknownFields();
				verify(configurationPropertiesMock).prefix();
				verify(applicationContextMock, atLeast(1)).containsBean("configurationPropertiesValidator");
				verify(applicationContextMock, atLeast(1)).getBean("configurationPropertiesValidator", Validator.class);
				configurationPropertiesJsr303Validator.verify(() -> ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock), atLeast(1));
				boundConfigurationProperties.verify(() -> BoundConfigurationProperties.get(applicationContextMock), atLeast(1));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.from((PropertySources) any()));
				verify(applicationContextMock, atLeast(1)).getBeanProvider(ConfigurationPropertiesBindHandlerAdvisor.class);
				verify(objectProviderMock).orderedStream();
			});
		}
	}

	//Sapient generated method id: ${86d5dd96-2a75-3e17-ac21-495a839897f1}, hash: 9F3A2995392EEB89140DA656DBCB7398
	@Test()
	void registerWhenRegistryNotContainsBeanDefinitionBEAN_NAME() throws BeanDefinitionStoreException {
		/* Branches:
		 * (!registry.containsBeanDefinition(BEAN_NAME)) : true
		 */
		//Arrange Statement(s)
		BeanDefinitionRegistry registryMock = mock(BeanDefinitionRegistry.class);
		doReturn(false).when(registryMock).containsBeanDefinition("org.springframework.boot.context.internalConfigurationPropertiesBinder");
		doNothing().when(registryMock).registerBeanDefinition(eq("org.springframework.boot.context.internalConfigurationPropertiesBinder"), (BeanDefinition) any());
		//Act Statement(s)
		ConfigurationPropertiesBinder.register(registryMock);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(registryMock).containsBeanDefinition("org.springframework.boot.context.internalConfigurationPropertiesBinder");
			verify(registryMock).registerBeanDefinition(eq("org.springframework.boot.context.internalConfigurationPropertiesBinder"), (BeanDefinition) any());
		});
	}

	//Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}, hash: 70152A5EC2A3B526FA8BFD199513E858
	@Test()
	void getTest() throws BeansException {
		//Arrange Statement(s)
		BeanFactory beanFactoryMock = mock(BeanFactory.class);
		ConfigurationPropertiesBinder configurationPropertiesBinderMock = mock(ConfigurationPropertiesBinder.class);
		doReturn(configurationPropertiesBinderMock).when(beanFactoryMock).getBean("org.springframework.boot.context.internalConfigurationPropertiesBinder", ConfigurationPropertiesBinder.class);
		//Act Statement(s)
		ConfigurationPropertiesBinder result = ConfigurationPropertiesBinder.get(beanFactoryMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(configurationPropertiesBinderMock));
			verify(beanFactoryMock).getBean("org.springframework.boot.context.internalConfigurationPropertiesBinder", ConfigurationPropertiesBinder.class);
		});
	}
}
