package org.springframework.boot.context.properties;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.BeanDefinitionStoreException;

import org.mockito.stubbing.Answer;

import org.springframework.core.annotation.MergedAnnotations;

import java.util.stream.Stream;

import org.mockito.MockedStatic;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.config.BeanDefinition;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class EnableConfigurationPropertiesRegistrarSapientGeneratedTest {

	private final BeanDefinitionRegistry beanDefinitionRegistryMock = mock(BeanDefinitionRegistry.class);

	//Sapient generated method id: ${65ccd99f-3bf8-36f1-bca0-bbb723609f6b}, hash: 91C36F65AE98B94B7769AB2A9D1B27C6
	@Disabled()
	@Test()
	void registerBeanDefinitionsTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: beanRegistrar
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		AnnotationMetadata metadataMock = mock(AnnotationMetadata.class);
		MergedAnnotations mergedAnnotationsMock = mock(MergedAnnotations.class);
		try (MockedStatic<EnableConfigurationPropertiesRegistrar> enableConfigurationPropertiesRegistrar = mockStatic(EnableConfigurationPropertiesRegistrar.class, CALLS_REAL_METHODS);
			 MockedStatic<BoundConfigurationProperties> boundConfigurationProperties = mockStatic(BoundConfigurationProperties.class);
			 MockedStatic<ConfigurationPropertiesBindingPostProcessor> configurationPropertiesBindingPostProcessor = mockStatic(ConfigurationPropertiesBindingPostProcessor.class)) {
			doReturn(mergedAnnotationsMock).when(metadataMock).getAnnotations();
			Stream stream = Stream.empty();
			doReturn(stream).when(mergedAnnotationsMock).stream(EnableConfigurationProperties.class);
			configurationPropertiesBindingPostProcessor.when(() -> ConfigurationPropertiesBindingPostProcessor.register(beanDefinitionRegistryMock)).thenAnswer((Answer<Void>) invocation -> null);
			boundConfigurationProperties.when(() -> BoundConfigurationProperties.register(beanDefinitionRegistryMock)).thenAnswer((Answer<Void>) invocation -> null);
			enableConfigurationPropertiesRegistrar.when(() -> EnableConfigurationPropertiesRegistrar.registerMethodValidationExcludeFilter(beanDefinitionRegistryMock)).thenAnswer((Answer<Void>) invocation -> null);
			EnableConfigurationPropertiesRegistrar target = new EnableConfigurationPropertiesRegistrar();
			//Act Statement(s)
			target.registerBeanDefinitions(metadataMock, beanDefinitionRegistryMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(metadataMock, atLeast(1)).getAnnotations();
				verify(mergedAnnotationsMock, atLeast(1)).stream(EnableConfigurationProperties.class);
				configurationPropertiesBindingPostProcessor.verify(() -> ConfigurationPropertiesBindingPostProcessor.register(beanDefinitionRegistryMock), atLeast(1));
				boundConfigurationProperties.verify(() -> BoundConfigurationProperties.register(beanDefinitionRegistryMock), atLeast(1));
				enableConfigurationPropertiesRegistrar.verify(() -> EnableConfigurationPropertiesRegistrar.registerMethodValidationExcludeFilter(beanDefinitionRegistryMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${96dec1e4-e0cf-3af5-8062-1ec41e83a239}, hash: 4E1BAD3BBFAF46945187EF3ABA8EB604
	@Test()
	void registerInfrastructureBeansTest() {
		//Arrange Statement(s)
		try (MockedStatic<BoundConfigurationProperties> boundConfigurationProperties = mockStatic(BoundConfigurationProperties.class);
			 MockedStatic<ConfigurationPropertiesBindingPostProcessor> configurationPropertiesBindingPostProcessor = mockStatic(ConfigurationPropertiesBindingPostProcessor.class)) {
			configurationPropertiesBindingPostProcessor.when(() -> ConfigurationPropertiesBindingPostProcessor.register(beanDefinitionRegistryMock)).thenAnswer((Answer<Void>) invocation -> null);
			boundConfigurationProperties.when(() -> BoundConfigurationProperties.register(beanDefinitionRegistryMock)).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			EnableConfigurationPropertiesRegistrar.registerInfrastructureBeans(beanDefinitionRegistryMock);
			//Assert statement(s)
			assertAll("result", () -> {
				configurationPropertiesBindingPostProcessor.verify(() -> ConfigurationPropertiesBindingPostProcessor.register(beanDefinitionRegistryMock), atLeast(1));
				boundConfigurationProperties.verify(() -> BoundConfigurationProperties.register(beanDefinitionRegistryMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a8406ee8-52ed-335b-bd8c-e91c55a8b744}, hash: 7D6729257B25434CF9A563314CAD9986
	@Test()
	void registerMethodValidationExcludeFilterWhenRegistryNotContainsBeanDefinitionMETHOD_VALIDATION_EXCLUDE_FILTER_BEAN_NAME() throws BeanDefinitionStoreException {
		/* Branches:
		 * (!registry.containsBeanDefinition(METHOD_VALIDATION_EXCLUDE_FILTER_BEAN_NAME)) : true
		 */
		//Arrange Statement(s)
		BeanDefinitionRegistry registryMock = mock(BeanDefinitionRegistry.class);
		doReturn(false).when(registryMock).containsBeanDefinition("org.springframework.boot.context.properties.EnableConfigurationPropertiesRegistrar.methodValidationExcludeFilter");
		doNothing().when(registryMock).registerBeanDefinition(eq("org.springframework.boot.context.properties.EnableConfigurationPropertiesRegistrar.methodValidationExcludeFilter"), (BeanDefinition) any());
		//Act Statement(s)
		EnableConfigurationPropertiesRegistrar.registerMethodValidationExcludeFilter(registryMock);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(registryMock).containsBeanDefinition("org.springframework.boot.context.properties.EnableConfigurationPropertiesRegistrar.methodValidationExcludeFilter");
			verify(registryMock).registerBeanDefinition(eq("org.springframework.boot.context.properties.EnableConfigurationPropertiesRegistrar.methodValidationExcludeFilter"), (BeanDefinition) any());
		});
	}
}
