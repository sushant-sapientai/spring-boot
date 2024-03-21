package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.origin.Origin;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.boot.context.properties.source.ConfigurationPropertySource;
import org.springframework.boot.context.properties.source.ConfigurationProperty;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class InvalidConfigDataPropertyExceptionSapientGeneratedTest {

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class, "getMessage_configurationPropertyName1");

	private final ConfigurationPropertySource configurationPropertySourceMock = mock(ConfigurationPropertySource.class);

	private final ConfigDataEnvironmentContributor contributorMock = mock(ConfigDataEnvironmentContributor.class);

	//Sapient generated method id: ${0306cbed-2ff6-3cf3-8dad-04e455d28c22}, hash: 39421C4310D0E2495DA56C48B2D66CA4
	@Test()
	void throwIfPropertyFoundWhenPropertySourceIsNull() {
		/* Branches:
		 * (propertySource != null) : false
		 */
		//Arrange Statement(s)
		doReturn(null).when(contributorMock).getConfigurationPropertySource();
		//Act Statement(s)
		InvalidConfigDataPropertyException.throwIfPropertyFound(contributorMock);
		//Assert statement(s)
		assertAll("result", () -> verify(contributorMock).getConfigurationPropertySource());
	}

	//Sapient generated method id: ${f42cb751-bc9d-3eb1-9e02-9ff06dac214b}, hash: 06ACBF408CF3E9A29A67A0D6B4ECF922
	@Disabled()
	@Test()
	void throwIfPropertyFoundWhenPropertyGetOriginIsNotNullThrowsInvalidConfigDataPropertyException() {
		/* Branches:
		 * (propertySource != null) : true
		 * (property != null) : true  #  inside lambda$throwIfPropertyFound$0 method
		 * (location != null) : true  #  inside getMessage method
		 * (profileSpecific) : false  #  inside getMessage method
		 * (replacement != null) : true  #  inside getMessage method
		 * (property.getOrigin() != null) : true  #  inside getMessage method
		 */
		//Arrange Statement(s)
		doReturn(configurationPropertySourceMock).when(contributorMock).getConfigurationPropertySource();
		Object object = new Object();
		Origin originMock = mock(Origin.class, "getMessage_origin1");
		ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, object, originMock);
		ConfigurationPropertyName configurationPropertyNameMock2 = mock(ConfigurationPropertyName.class, "getMessage_configurationPropertyName2");
		Object object2 = new Object();
		Origin originMock2 = mock(Origin.class, "getMessage_origin3");
		ConfigurationProperty configurationProperty2 = new ConfigurationProperty(configurationPropertyNameMock2, object2, originMock2);
		doReturn(configurationProperty, configurationProperty2).when(configurationPropertySourceMock).getConfigurationProperty((ConfigurationPropertyName) any());
		ConfigDataResource configDataResourceMock = mock(ConfigDataResource.class, "lambda$throwIfPropertyFound$0_configDataResource1");
		ConfigDataResource configDataResourceMock2 = mock(ConfigDataResource.class, "lambda$throwIfPropertyFound$0_configDataResource2");
		doReturn(configDataResourceMock, configDataResourceMock2).when(contributorMock).getResource();
		//Act Statement(s)
		final InvalidConfigDataPropertyException result = assertThrows(InvalidConfigDataPropertyException.class, () -> {
			InvalidConfigDataPropertyException.throwIfPropertyFound(contributorMock);
		});
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(contributorMock).getConfigurationPropertySource();
			verify(configurationPropertySourceMock, atLeast(2)).getConfigurationProperty((ConfigurationPropertyName) any());
			verify(contributorMock, times(2)).getResource();
		});
	}

	//Sapient generated method id: ${ba0a8d50-7cff-36dc-bb96-6d848204d906}, hash: 2ED550A8E514122F43CAA0CC22A1D398
	@Disabled()
	@Test()
	void throwIfPropertyFoundWhenReplacementIsNotNullAndPropertyGetOriginIsNullThrowsInvalidConfigDataPropertyException() {
		/* Branches:
		 * (propertySource != null) : true
		 * (property != null) : true  #  inside lambda$throwIfPropertyFound$0 method
		 * (location != null) : false  #  inside getMessage method
		 * (profileSpecific) : false  #  inside getMessage method
		 * (replacement != null) : true  #  inside getMessage method
		 * (property.getOrigin() != null) : false  #  inside getMessage method
		 */
		ConfigurationProperty configurationProperty2 = null;
		//Arrange Statement(s)
		doReturn(configurationPropertySourceMock).when(contributorMock).getConfigurationPropertySource();
		Object object = new Object();
		ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, object, (Origin) null);
		doReturn(configurationProperty, configurationProperty2).when(configurationPropertySourceMock).getConfigurationProperty((ConfigurationPropertyName) any());
		doReturn(null).when(contributorMock).getResource();
		//Act Statement(s)
		final InvalidConfigDataPropertyException result = assertThrows(InvalidConfigDataPropertyException.class, () -> {
			InvalidConfigDataPropertyException.throwIfPropertyFound(contributorMock);
		});
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(contributorMock).getConfigurationPropertySource();
			verify(configurationPropertySourceMock, atLeast(2)).getConfigurationProperty((ConfigurationPropertyName) any());
			verify(contributorMock).getResource();
		});
	}
}
