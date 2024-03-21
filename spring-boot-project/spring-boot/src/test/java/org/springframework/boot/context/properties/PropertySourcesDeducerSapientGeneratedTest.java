package org.springframework.boot.context.properties;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.beans.BeansException;
import org.springframework.core.env.ConfigurableEnvironment;

import org.mockito.stubbing.Answer;

import org.springframework.core.env.Environment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.util.Assert;
import org.springframework.core.env.PropertySources;

import java.util.Map;
import java.util.HashMap;

import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PropertySourcesDeducerSapientGeneratedTest {

	private final ApplicationContext applicationContextMock = mock(ApplicationContext.class, "applicationContext");

	private final PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurerMock = mock(PropertySourcesPlaceholderConfigurer.class);

	//Sapient generated method id: ${a5bf5486-514a-3dbb-885e-35c017895aed}, hash: EA783D9F9ABA40CF787881712045982E
	@Test()
	void getPropertySourcesWhenConfigurerIsNotNull() throws BeansException, IllegalStateException {
		/* Branches:
		 * (beans.size() == 1) : true  #  inside getSinglePropertySourcesPlaceholderConfigurer method
		 * (configurer != null) : true
		 */
		//Arrange Statement(s)
		PropertySourcesDeducer target = new PropertySourcesDeducer(applicationContextMock);
		Map<String, PropertySourcesPlaceholderConfigurer> stringPropertySourcesPlaceholderConfigurerMap = new HashMap<>();
		stringPropertySourcesPlaceholderConfigurerMap.put("0", propertySourcesPlaceholderConfigurerMock);
		doReturn(stringPropertySourcesPlaceholderConfigurerMap).when(applicationContextMock).getBeansOfType(PropertySourcesPlaceholderConfigurer.class, false, false);
		PropertySources propertySourcesMock = mock(PropertySources.class);
		doReturn(propertySourcesMock).when(propertySourcesPlaceholderConfigurerMock).getAppliedPropertySources();

		//Act Statement(s)
		PropertySources result = target.getPropertySources();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(propertySourcesMock));
			verify(applicationContextMock).getBeansOfType(PropertySourcesPlaceholderConfigurer.class, false, false);
			verify(propertySourcesPlaceholderConfigurerMock).getAppliedPropertySources();
		});
	}

	//Sapient generated method id: ${eb630e05-3d88-3aef-8d53-0792c10b60f4}, hash: FF771A63E4BFE43CD11E5CDFD775D1C0
	@Test()
	void getPropertySourcesWhenSourcesIsNotNull() throws BeansException {
		/* Branches:
		 * (beans.size() == 1) : true  #  inside getSinglePropertySourcesPlaceholderConfigurer method
		 * (configurer != null) : false
		 * (environment instanceof ConfigurableEnvironment configurableEnvironment) : true  #  inside extractEnvironmentPropertySources method
		 * (sources != null) : true
		 */
		//Arrange Statement(s)
		PropertySourcesDeducer target = new PropertySourcesDeducer(applicationContextMock);
		Map<String, PropertySourcesPlaceholderConfigurer> stringPropertySourcesPlaceholderConfigurerMap = new HashMap<>();
		stringPropertySourcesPlaceholderConfigurerMap.put("0", (PropertySourcesPlaceholderConfigurer) null);
		doReturn(stringPropertySourcesPlaceholderConfigurerMap).when(applicationContextMock).getBeansOfType(PropertySourcesPlaceholderConfigurer.class, false, false);
		ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
		doReturn(configurableEnvironmentMock).when(applicationContextMock).getEnvironment();
		MutablePropertySources mutablePropertySourcesMock = mock(MutablePropertySources.class);
		doReturn(mutablePropertySourcesMock).when(configurableEnvironmentMock).getPropertySources();

		//Act Statement(s)
		PropertySources result = target.getPropertySources();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(mutablePropertySourcesMock));
			verify(applicationContextMock).getBeansOfType(PropertySourcesPlaceholderConfigurer.class, false, false);
			verify(applicationContextMock).getEnvironment();
			verify(configurableEnvironmentMock).getPropertySources();
		});
	}

	//Sapient generated method id: ${1694a2f6-4b78-3766-8cef-333024b46f49}, hash: ACBEC34D3ED85C56F656F0584FB91ECA
	@Test()
	void getPropertySourcesWhenLoggerIsWarnEnabledAndConfigurerIsNullAndEnvironmentNotInstanceOfConfigurableEnvironmentAndSource() throws BeansException {
		/* Branches:
		 * (beans.size() == 1) : false  #  inside getSinglePropertySourcesPlaceholderConfigurer method
		 * (beans.size() > 1) : true  #  inside getSinglePropertySourcesPlaceholderConfigurer method
		 * (logger.isWarnEnabled()) : true  #  inside getSinglePropertySourcesPlaceholderConfigurer method
		 * (configurer != null) : false
		 * (environment instanceof ConfigurableEnvironment configurableEnvironment) : false  #  inside extractEnvironmentPropertySources method
		 * (sources != null) : false
		 */
		//Arrange Statement(s)
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurerMock2 = mock(PropertySourcesPlaceholderConfigurer.class);
		Environment environmentMock = mock(Environment.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(false, "Unable to obtain PropertySources from PropertySourcesPlaceholderConfigurer or Environment")).thenAnswer((Answer<Void>) invocation -> null);
			PropertySourcesDeducer target = new PropertySourcesDeducer(applicationContextMock);
			Map<String, PropertySourcesPlaceholderConfigurer> stringPropertySourcesPlaceholderConfigurerMap = new HashMap<>();
			stringPropertySourcesPlaceholderConfigurerMap.put("return_of_getBeansOfTypeItem1Key1", propertySourcesPlaceholderConfigurerMock);
			stringPropertySourcesPlaceholderConfigurerMap.put("return_of_getBeansOfTypeItem2Key1", propertySourcesPlaceholderConfigurerMock2);
			doReturn(stringPropertySourcesPlaceholderConfigurerMap).when(applicationContextMock).getBeansOfType(PropertySourcesPlaceholderConfigurer.class, false, false);
			doReturn(environmentMock).when(applicationContextMock).getEnvironment();
			//Act Statement(s)
			PropertySources result = target.getPropertySources();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.state(false, "Unable to obtain PropertySources from PropertySourcesPlaceholderConfigurer or Environment"), atLeast(1));
				verify(applicationContextMock).getBeansOfType(PropertySourcesPlaceholderConfigurer.class, false, false);
				verify(applicationContextMock).getEnvironment();
			});
		}
	}
}
