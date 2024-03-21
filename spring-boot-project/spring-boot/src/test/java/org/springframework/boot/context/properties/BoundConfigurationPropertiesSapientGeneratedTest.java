package org.springframework.boot.context.properties;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanDefinitionStoreException;

import org.mockito.stubbing.Answer;

import org.springframework.boot.origin.Origin;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.context.properties.source.ConfigurationProperty;
import org.springframework.util.Assert;

import java.util.Map;

import org.mockito.MockedStatic;

import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.config.BeanDefinition;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BoundConfigurationPropertiesSapientGeneratedTest {

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final ApplicationContext contextMock = mock(ApplicationContext.class);

	//Sapient generated method id: ${2f52d914-224e-3cf8-a2e5-c61089a0f6f4}, hash: 1110F0BF716B4E8D8E3F8A732A2F1E52
	@Test()
	void addTest() {
		//Arrange Statement(s)
		BoundConfigurationProperties target = new BoundConfigurationProperties();
		Object object = new Object();
		Origin originMock = mock(Origin.class);
		ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, object, originMock);

		//Act Statement(s)
		target.add(configurationProperty);
	}

	//Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}, hash: 8417CE05B3B86E02CD23B650B8EA6B9A
	@Test()
	void getTest() {
		//Arrange Statement(s)
		BoundConfigurationProperties target = new BoundConfigurationProperties();

		//Act Statement(s)
		ConfigurationProperty result = target.get(configurationPropertyNameMock);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${a88321e2-c443-39ad-bf1b-22930f2ed148}, hash: 20AE210C20DF2E779A517CD5F542776D
	@Test()
	void getAllTest() {
		//Arrange Statement(s)
		BoundConfigurationProperties target = new BoundConfigurationProperties();

		//Act Statement(s)
		Map<ConfigurationPropertyName, ConfigurationProperty> result = target.getAll();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}

	//Sapient generated method id: ${a1cf46f6-be94-3796-a037-ae640381b20e}, hash: E53F59794320329F99A8063BC10FB790
	@Test()
	void get1WhenContextNotContainsBeanDefinitionBEAN_NAME() {
		/* Branches:
		 * (!context.containsBeanDefinition(BEAN_NAME)) : true
		 */
		//Arrange Statement(s)
		doReturn(false).when(contextMock).containsBeanDefinition("org.springframework.boot.context.properties.BoundConfigurationProperties");

		//Act Statement(s)
		BoundConfigurationProperties result = BoundConfigurationProperties.get(contextMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(nullValue()));
			verify(contextMock).containsBeanDefinition("org.springframework.boot.context.properties.BoundConfigurationProperties");
		});
	}

	//Sapient generated method id: ${60b0428b-f3c6-30f7-a2c5-a75ca6b7f410}, hash: 74DDF01A9B1D3C9A69C615EDEB867ADB
	@Test()
	void get1WhenContextContainsBeanDefinitionBEAN_NAME() throws BeansException {
		/* Branches:
		 * (!context.containsBeanDefinition(BEAN_NAME)) : false
		 */
		//Arrange Statement(s)
		doReturn(true).when(contextMock).containsBeanDefinition("org.springframework.boot.context.properties.BoundConfigurationProperties");
		BoundConfigurationProperties boundConfigurationPropertiesMock = mock(BoundConfigurationProperties.class);
		doReturn(boundConfigurationPropertiesMock).when(contextMock).getBean("org.springframework.boot.context.properties.BoundConfigurationProperties", BoundConfigurationProperties.class);

		//Act Statement(s)
		BoundConfigurationProperties result = BoundConfigurationProperties.get(contextMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(boundConfigurationPropertiesMock));
			verify(contextMock).containsBeanDefinition("org.springframework.boot.context.properties.BoundConfigurationProperties");
			verify(contextMock).getBean("org.springframework.boot.context.properties.BoundConfigurationProperties", BoundConfigurationProperties.class);
		});
	}

	//Sapient generated method id: ${86d5dd96-2a75-3e17-ac21-495a839897f1}, hash: B22EF1A3D2D153A8E90B53690420AA38
	@Test()
	void registerWhenRegistryNotContainsBeanDefinitionBEAN_NAME() throws BeanDefinitionStoreException {
		/* Branches:
		 * (!registry.containsBeanDefinition(BEAN_NAME)) : true
		 */
		//Arrange Statement(s)
		BeanDefinitionRegistry registryMock = mock(BeanDefinitionRegistry.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(false).when(registryMock).containsBeanDefinition("org.springframework.boot.context.properties.BoundConfigurationProperties");
			doNothing().when(registryMock).registerBeanDefinition(eq("org.springframework.boot.context.properties.BoundConfigurationProperties"), (BeanDefinition) any());
			_assert.when(() -> Assert.notNull(registryMock, "Registry must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			BoundConfigurationProperties.register(registryMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(registryMock).containsBeanDefinition("org.springframework.boot.context.properties.BoundConfigurationProperties");
				verify(registryMock).registerBeanDefinition(eq("org.springframework.boot.context.properties.BoundConfigurationProperties"), (BeanDefinition) any());
				_assert.verify(() -> Assert.notNull(registryMock, "Registry must not be null"), atLeast(1));
			});
		}
	}
}
