package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.origin.Origin;
import org.springframework.util.ClassUtils;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.convert.support.DefaultConversionService;

import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertySourcesPropertyResolverSapientGeneratedTest {

	private final ConfigurationProperty configurationPropertyMock = mock(ConfigurationProperty.class);

	private final ConfigurationPropertyName configurationPropertyName2Mock = mock(ConfigurationPropertyName.class);

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final ConfigurationPropertySourcesPropertySource configurationPropertySourcesPropertySourceMock = mock(ConfigurationPropertySourcesPropertySource.class);

	private final ConversionService conversionServiceMock = mock(ConversionService.class);

	private final MutablePropertySources mutablePropertySourcesMock = mock(MutablePropertySources.class);

	private final Origin originMock = mock(Origin.class);

	private final SpringConfigurationPropertySources springConfigurationPropertySourcesMock = mock(SpringConfigurationPropertySources.class);

	//Sapient generated method id: ${3330932b-5c8c-39b9-a6c0-b88cb5f4ebae}, hash: 3C4E6AEB5E8463FC06199C6BDB9F4BD5
	@Disabled()
	@Test()
	void containsPropertyWhenAttachedIsNullAndThisDefaultResolverNotContainsPropertyKey() throws Exception {
		/* Branches:
		 * (attached != null) : false  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : false  #  inside getAttached method
		 * (attached != null) : false
		 * (this.defaultResolver.containsProperty(key)) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: defaultResolver
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(null);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			//Act Statement(s)
			boolean result = target.containsProperty("key1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c0e9bb19-8da4-3906-bbef-9c8c866ea231}, hash: E564E7BB79C49A101320DAFE623E3ABB
	@Test()
	void containsPropertyWhenAttachedFindConfigurationPropertyNameIsNotNull() throws Exception {
		/* Branches:
		 * (attached != null) : true  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : true  #  inside getAttached method
		 * (springSource.isUsingSources(this.propertySources)) : true  #  inside getAttached method
		 * (attached != null) : true
		 * (name != null) : true
		 * (attached.findConfigurationProperty(name) != null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			doReturn(configurationPropertyMock).when(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("key1", true)).thenReturn(configurationPropertyNameMock);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			//Act Statement(s)
			boolean result = target.containsProperty("key1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				verify(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
				verify(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("key1", true), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${5d86fb9f-75bd-3848-9b65-f3a24d29b0d0}, hash: 25A3E11064910C5CB5F995527E01CC62
	@Test()
	void containsPropertyWhenAttachedFindConfigurationPropertyNameIsNull() throws Exception {
		/* Branches:
		 * (attached != null) : true  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : true  #  inside getAttached method
		 * (springSource.isUsingSources(this.propertySources)) : true  #  inside getAttached method
		 * (attached != null) : true
		 * (name != null) : true
		 * (attached.findConfigurationProperty(name) != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			doReturn(null).when(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("key1", true)).thenReturn(configurationPropertyNameMock);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			//Act Statement(s)
			boolean result = target.containsProperty("key1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				verify(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
				verify(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("key1", true), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c519a802-bafd-336d-abd2-40264828dd8d}, hash: A3D437122FDB02B2A5D4F360AD1E1410
	@Disabled()
	@Test()
	void containsPropertyWhenThisDefaultResolverContainsPropertyKey() throws Exception {
		/* Branches:
		 * (attached != null) : true  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : true  #  inside getAttached method
		 * (springSource.isUsingSources(this.propertySources)) : true  #  inside getAttached method
		 * (attached != null) : true
		 * (name != null) : false
		 * (this.defaultResolver.containsProperty(key)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: defaultResolver
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("key1", true)).thenReturn(null);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			//Act Statement(s)
			boolean result = target.containsProperty("key1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				verify(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("key1", true), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${abf2f751-2d8d-328b-b876-1d028f927b94}, hash: 7A37785FAD59CB048A389C1F5C642452
	@Test()
	void containsPropertyWhenCaughtExceptionAndThisDefaultResolverContainsPropertyKey() throws Exception {
		/* Branches:
		 * (attached != null) : true  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : true  #  inside getAttached method
		 * (springSource.isUsingSources(this.propertySources)) : true  #  inside getAttached method
		 * (attached != null) : true
		 * (name != null) : true
		 * (attached.findConfigurationProperty(name) != null) : true
		 * (catch-exception (Exception)) : true
		 * (this.defaultResolver.containsProperty(key)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: defaultResolver
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			doReturn(configurationPropertyMock).when(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("key1", true)).thenReturn(configurationPropertyNameMock);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			//Act Statement(s)
			boolean result = target.containsProperty("key1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				verify(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
				verify(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("key1", true), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${73c17d9a-4743-3423-a4c5-31860de55d0d}, hash: FCDCCC2E1B95FDD0A220C6F9B37D63B1
	@Disabled()
	@Test()
	void containsPropertyWhenCaughtExceptionAndThisDefaultResolverNotContainsPropertyKey() throws Exception {
		/* Branches:
		 * (attached != null) : true  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : true  #  inside getAttached method
		 * (springSource.isUsingSources(this.propertySources)) : true  #  inside getAttached method
		 * (attached != null) : true
		 * (name != null) : true
		 * (attached.findConfigurationProperty(name) != null) : true
		 * (catch-exception (Exception)) : true
		 * (this.defaultResolver.containsProperty(key)) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: defaultResolver
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			doReturn(configurationPropertyMock).when(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("key1", true)).thenReturn(configurationPropertyNameMock);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			//Act Statement(s)
			boolean result = target.containsProperty("key1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				verify(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
				verify(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("key1", true), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${dc9fbe4a-8d57-3691-ae58-7bae70fbc30d}, hash: 73FEB724221BDA921FF9A5FD67088DD9
	@Disabled()
	@Test()
	void getPropertyWhenResolveNestedPlaceholdersAndValueNotInstanceOfString() throws Exception {
		/* Branches:
		 * (attached != null) : false  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : false  #  inside getAttached method
		 * (attached != null) : false  #  inside findPropertyValue method
		 * (value == null) : false  #  inside getProperty method
		 * (resolveNestedPlaceholders) : true  #  inside getProperty method
		 * (value instanceof String string) : false  #  inside getProperty method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: defaultResolver - Method: getProperty
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(null);
			Object object = new Object();
			classUtils.when(() -> ClassUtils.isAssignableValue(String.class, object)).thenReturn(false);
			defaultConversionService.when(() -> DefaultConversionService.getSharedInstance()).thenReturn(conversionServiceMock);
			doReturn("return_of_convert1").when(conversionServiceMock).convert(object, String.class);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			//Act Statement(s)
			String result = target.getProperty("key1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_convert1"));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				classUtils.verify(() -> ClassUtils.isAssignableValue(String.class, object), atLeast(1));
				defaultConversionService.verify(() -> DefaultConversionService.getSharedInstance(), atLeast(1));
				verify(conversionServiceMock).convert(object, String.class);
			});
		}
	}

	//Sapient generated method id: ${97ce597c-91ee-34da-bc91-30b57e73d393}, hash: 7FEC78DC5DCD65F82C1F0443B11BA3E7
	@Test()
	void getPropertyWhenConfigurationPropertyIsNullAndValueIsNull() throws Exception {
		/* Branches:
		 * (attached != null) : true  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : true  #  inside getAttached method
		 * (springSource.isUsingSources(this.propertySources)) : true  #  inside getAttached method
		 * (attached != null) : true  #  inside findPropertyValue method
		 * (name != null) : true  #  inside findPropertyValue method
		 * (configurationProperty != null) : false  #  inside findPropertyValue method
		 * (value == null) : true  #  inside getProperty method
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			doReturn(null).when(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("key1", true)).thenReturn(configurationPropertyNameMock);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			//Act Statement(s)
			String result = target.getProperty("key1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				verify(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
				verify(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("key1", true), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${fef8509b-1159-33de-baa3-53aa2b22b647}, hash: 9A9D2DD07A93EEB602ED7785B42393AD
	@Disabled()
	@Test()
	void getPropertyWhenCaughtExceptionAndValueIsNull() throws Exception {
		/* Branches:
		 * (attached != null) : true  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : true  #  inside getAttached method
		 * (springSource.isUsingSources(this.propertySources)) : true  #  inside getAttached method
		 * (attached != null) : true  #  inside findPropertyValue method
		 * (name != null) : true  #  inside findPropertyValue method
		 * (configurationProperty != null) : true  #  inside findPropertyValue method
		 * (catch-exception (Exception)) : true  #  inside findPropertyValue method
		 * (value == null) : true  #  inside getProperty method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: defaultResolver - Method: getProperty
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			Object object = new Object();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyName2Mock, object, originMock);
			doReturn(configurationProperty).when(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("key1", true)).thenReturn(configurationPropertyNameMock);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			//Act Statement(s)
			String result = target.getProperty("key1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				verify(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
				verify(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("key1", true), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${7ac2ea26-3a82-3f8b-9802-1c527554ec2d}, hash: FF3BC9828BF03165C8A3FEAC816B49D5
	@Test()
	void getPropertyWhenValueInstanceOfString() throws Exception {
		/* Branches:
		 * (attached != null) : true  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : true  #  inside getAttached method
		 * (springSource.isUsingSources(this.propertySources)) : true  #  inside getAttached method
		 * (attached != null) : true  #  inside findPropertyValue method
		 * (name != null) : true  #  inside findPropertyValue method
		 * (configurationProperty != null) : true  #  inside findPropertyValue method
		 * (value == null) : false  #  inside getProperty method
		 * (resolveNestedPlaceholders) : true  #  inside getProperty method
		 * (value instanceof String string) : true  #  inside getProperty method
		 */
		//Arrange Statement(s)
		try (MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyName2Mock, "A", originMock);
			doReturn(configurationProperty).when(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("key1", true)).thenReturn(configurationPropertyNameMock);
			classUtils.when(() -> ClassUtils.isAssignableValue(String.class, "return_of_resolveRequiredPlaceholders1")).thenReturn(false);
			defaultConversionService.when(() -> DefaultConversionService.getSharedInstance()).thenReturn(conversionServiceMock);
			doReturn("return_of_convert1").when(conversionServiceMock).convert("return_of_resolveRequiredPlaceholders1", String.class);
			ConfigurationPropertySourcesPropertyResolver target = spy(new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock));
			doReturn("return_of_resolveRequiredPlaceholders1").when(target).resolveRequiredPlaceholders("A");
			//Act Statement(s)
			String result = target.getProperty("key1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_convert1"));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				verify(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
				verify(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("key1", true), atLeast(1));
				classUtils.verify(() -> ClassUtils.isAssignableValue(String.class, "return_of_resolveRequiredPlaceholders1"), atLeast(1));
				defaultConversionService.verify(() -> DefaultConversionService.getSharedInstance(), atLeast(1));
				verify(conversionServiceMock).convert("return_of_resolveRequiredPlaceholders1", String.class);
				verify(target).resolveRequiredPlaceholders("A");
			});
		}
	}

	//Sapient generated method id: ${06cfd8ef-1ec6-33fa-954d-f1efeb038665}, hash: EDEAD7A2285A3312693A3032880A63F7
	@Test()
	void getPropertyWhenResolveNestedPlaceholdersAndValueInstanceOfString() throws Exception {
		/* Branches:
		 * (attached != null) : true  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : true  #  inside getAttached method
		 * (springSource.isUsingSources(this.propertySources)) : true  #  inside getAttached method
		 * (attached != null) : true  #  inside findPropertyValue method
		 * (name != null) : true  #  inside findPropertyValue method
		 * (configurationProperty != null) : true  #  inside findPropertyValue method
		 * (value == null) : false  #  inside getProperty method
		 * (resolveNestedPlaceholders) : true  #  inside getProperty method
		 * (value instanceof String string) : true  #  inside getProperty method
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyName2Mock, "", originMock);
			doReturn(configurationProperty).when(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("key1", true)).thenReturn(configurationPropertyNameMock);
			classUtils.when(() -> ClassUtils.isAssignableValue(String.class, "")).thenReturn(true);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			//Act Statement(s)
			String result = target.getProperty("key1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(""));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				verify(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
				verify(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("key1", true), atLeast(1));
				classUtils.verify(() -> ClassUtils.isAssignableValue(String.class, ""), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${e158282f-b41d-3367-94af-49d38b7ba1ea}, hash: 276E10584226D6A9F01C0567035C2249
	@Disabled()
	@Test()
	void getPropertyWhenCaughtExceptionAndValueIsNotNullAndResolveNestedPlaceholdersAndValueInstanceOfString() throws Exception {
		/* Branches:
		 * (attached != null) : true  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : true  #  inside getAttached method
		 * (springSource.isUsingSources(this.propertySources)) : true  #  inside getAttached method
		 * (attached != null) : true  #  inside findPropertyValue method
		 * (name != null) : true  #  inside findPropertyValue method
		 * (configurationProperty != null) : true  #  inside findPropertyValue method
		 * (catch-exception (Exception)) : true  #  inside findPropertyValue method
		 * (value == null) : false  #  inside getProperty method
		 * (resolveNestedPlaceholders) : true  #  inside getProperty method
		 * (value instanceof String string) : true  #  inside getProperty method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: defaultResolver - Method: getProperty
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			Object object = new Object();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyName2Mock, object, originMock);
			doReturn(configurationProperty).when(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("key1", true)).thenReturn(configurationPropertyNameMock);
			classUtils.when(() -> ClassUtils.isAssignableValue(String.class, "return_of_resolveRequiredPlaceholders1")).thenReturn(false);
			defaultConversionService.when(() -> DefaultConversionService.getSharedInstance()).thenReturn(conversionServiceMock);
			doReturn("return_of_convert1").when(conversionServiceMock).convert("return_of_resolveRequiredPlaceholders1", String.class);
			ConfigurationPropertySourcesPropertyResolver target = spy(new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock));
			doReturn("return_of_resolveRequiredPlaceholders1").when(target).resolveRequiredPlaceholders("A");
			//Act Statement(s)
			String result = target.getProperty("key1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_convert1"));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				verify(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
				verify(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("key1", true), atLeast(1));
				classUtils.verify(() -> ClassUtils.isAssignableValue(String.class, "return_of_resolveRequiredPlaceholders1"), atLeast(1));
				defaultConversionService.verify(() -> DefaultConversionService.getSharedInstance(), atLeast(1));
				verify(conversionServiceMock).convert("return_of_resolveRequiredPlaceholders1", String.class);
				verify(target).resolveRequiredPlaceholders("A");
			});
		}
	}

	//Sapient generated method id: ${6cf580f6-244b-31c9-a85d-34146976b29d}, hash: 77D3D04A635BEEC14579CE134208B64B
	@Disabled()
	@Test()
	void getPropertyWhenConfigurationPropertyIsNotNullAndCaughtExceptionAndValueIsNotNullAndResolveNestedPlaceholdersAndValueIns() throws Exception {
		/* Branches:
		 * (attached != null) : true  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : true  #  inside getAttached method
		 * (springSource.isUsingSources(this.propertySources)) : true  #  inside getAttached method
		 * (attached != null) : true  #  inside findPropertyValue method
		 * (name != null) : true  #  inside findPropertyValue method
		 * (configurationProperty != null) : true  #  inside findPropertyValue method
		 * (catch-exception (Exception)) : true  #  inside findPropertyValue method
		 * (value == null) : false  #  inside getProperty method
		 * (resolveNestedPlaceholders) : true  #  inside getProperty method
		 * (value instanceof String string) : true  #  inside getProperty method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: defaultResolver - Method: getProperty
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			Object object = new Object();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyName2Mock, object, originMock);
			doReturn(configurationProperty).when(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("key1", true)).thenReturn(configurationPropertyNameMock);
			classUtils.when(() -> ClassUtils.isAssignableValue(String.class, "")).thenReturn(true);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			//Act Statement(s)
			String result = target.getProperty("key1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(""));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				verify(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
				verify(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("key1", true), atLeast(1));
				classUtils.verify(() -> ClassUtils.isAssignableValue(String.class, ""), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${d071d10f-388d-3270-b158-d9f291bc308a}, hash: EC02E921809786DF6E9D9553397B533F
	@Disabled()
	@Test()
	void getPropertyWhenConfigurationPropertyIsNullAndCaughtExceptionAndValueIsNotNullAndResolveNestedPlaceholdersAndValueNotIns() throws Exception {
		/* Branches:
		 * (attached != null) : true  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : true  #  inside getAttached method
		 * (springSource.isUsingSources(this.propertySources)) : true  #  inside getAttached method
		 * (attached != null) : true  #  inside findPropertyValue method
		 * (name != null) : true  #  inside findPropertyValue method
		 * (configurationProperty != null) : false  #  inside findPropertyValue method
		 * (catch-exception (Exception)) : true  #  inside findPropertyValue method
		 * (value == null) : false  #  inside getProperty method
		 * (resolveNestedPlaceholders) : true  #  inside getProperty method
		 * (value instanceof String string) : false  #  inside getProperty method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: defaultResolver - Method: getProperty
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			doReturn(null).when(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("key1", true)).thenReturn(configurationPropertyNameMock);
			Object object = new Object();
			classUtils.when(() -> ClassUtils.isAssignableValue(String.class, object)).thenReturn(false);
			defaultConversionService.when(() -> DefaultConversionService.getSharedInstance()).thenReturn(conversionServiceMock);
			doReturn("return_of_convert1").when(conversionServiceMock).convert(object, String.class);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			//Act Statement(s)
			String result = target.getProperty("key1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_convert1"));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				verify(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
				verify(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("key1", true), atLeast(1));
				classUtils.verify(() -> ClassUtils.isAssignableValue(String.class, object), atLeast(1));
				defaultConversionService.verify(() -> DefaultConversionService.getSharedInstance(), atLeast(1));
				verify(conversionServiceMock).convert(object, String.class);
			});
		}
	}

	//Sapient generated method id: ${0e3d4019-4e90-37a0-b32d-8bb73f4ba120}, hash: F7358E97419BCBBB67AECBFFED22DF01
	@Disabled()
	@Test()
	void getProperty3WhenResolveNestedPlaceholdersAndValueNotInstanceOfString() throws Exception {
		/* Branches:
		 * (attached != null) : false  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : false  #  inside getAttached method
		 * (attached != null) : false  #  inside findPropertyValue method
		 * (value == null) : false  #  inside getProperty method
		 * (resolveNestedPlaceholders) : true  #  inside getProperty method
		 * (value instanceof String string) : false  #  inside getProperty method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: defaultResolver - Method: getProperty
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(null);
			Object object = new Object();
			classUtils.when(() -> ClassUtils.isAssignableValue(Object.class, object)).thenReturn(false);
			defaultConversionService.when(() -> DefaultConversionService.getSharedInstance()).thenReturn(conversionServiceMock);
			Object object2 = new Object();
			doReturn(object2).when(conversionServiceMock).convert(object, Object.class);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			//Act Statement(s)
			Object result = target.getProperty("key1", Object.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(object2));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				classUtils.verify(() -> ClassUtils.isAssignableValue(Object.class, object), atLeast(1));
				defaultConversionService.verify(() -> DefaultConversionService.getSharedInstance(), atLeast(1));
				verify(conversionServiceMock).convert(object, Object.class);
			});
		}
	}

	//Sapient generated method id: ${b983baf7-66fa-34cb-8458-6a130f93c4ea}, hash: 938830107820D724BFCF6ACA251CAD04
	@Test()
	void getProperty3WhenConfigurationPropertyIsNullAndValueIsNull() throws Exception {
		/* Branches:
		 * (attached != null) : true  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : true  #  inside getAttached method
		 * (springSource.isUsingSources(this.propertySources)) : true  #  inside getAttached method
		 * (attached != null) : true  #  inside findPropertyValue method
		 * (name != null) : true  #  inside findPropertyValue method
		 * (configurationProperty != null) : false  #  inside findPropertyValue method
		 * (value == null) : true  #  inside getProperty method
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			doReturn(null).when(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("key1", true)).thenReturn(configurationPropertyNameMock);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			//Act Statement(s)
			Object result = target.getProperty("key1", Object.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				verify(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
				verify(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("key1", true), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${ddfae7d5-b8dd-383e-80db-fe19b964c210}, hash: E4335EB15FCD6421749625F056F701FE
	@Disabled()
	@Test()
	void getProperty3WhenCaughtExceptionAndValueIsNull() throws Exception {
		/* Branches:
		 * (attached != null) : true  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : true  #  inside getAttached method
		 * (springSource.isUsingSources(this.propertySources)) : true  #  inside getAttached method
		 * (attached != null) : true  #  inside findPropertyValue method
		 * (name != null) : true  #  inside findPropertyValue method
		 * (configurationProperty != null) : true  #  inside findPropertyValue method
		 * (catch-exception (Exception)) : true  #  inside findPropertyValue method
		 * (value == null) : true  #  inside getProperty method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: defaultResolver - Method: getProperty
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			Object object = new Object();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyName2Mock, object, originMock);
			doReturn(configurationProperty).when(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("key1", true)).thenReturn(configurationPropertyNameMock);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			//Act Statement(s)
			Object result = target.getProperty("key1", Object.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				verify(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
				verify(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("key1", true), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${0106ccab-fbad-3458-85c9-aba9a897ea6d}, hash: 767D2BE42EFF79EB7FDA015FB3C9CABD
	@Test()
	void getProperty3WhenValueInstanceOfString() throws Exception {
		/* Branches:
		 * (attached != null) : true  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : true  #  inside getAttached method
		 * (springSource.isUsingSources(this.propertySources)) : true  #  inside getAttached method
		 * (attached != null) : true  #  inside findPropertyValue method
		 * (name != null) : true  #  inside findPropertyValue method
		 * (configurationProperty != null) : true  #  inside findPropertyValue method
		 * (value == null) : false  #  inside getProperty method
		 * (resolveNestedPlaceholders) : true  #  inside getProperty method
		 * (value instanceof String string) : true  #  inside getProperty method
		 */
		//Arrange Statement(s)
		try (MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyName2Mock, "A", originMock);
			doReturn(configurationProperty).when(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("key1", true)).thenReturn(configurationPropertyNameMock);
			classUtils.when(() -> ClassUtils.isAssignableValue(Object.class, "return_of_resolveRequiredPlaceholders1")).thenReturn(false);
			defaultConversionService.when(() -> DefaultConversionService.getSharedInstance()).thenReturn(conversionServiceMock);
			Object object = new Object();
			doReturn(object).when(conversionServiceMock).convert("return_of_resolveRequiredPlaceholders1", Object.class);
			ConfigurationPropertySourcesPropertyResolver target = spy(new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock));
			doReturn("return_of_resolveRequiredPlaceholders1").when(target).resolveRequiredPlaceholders("A");
			//Act Statement(s)
			Object result = target.getProperty("key1", Object.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(object));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				verify(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
				verify(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("key1", true), atLeast(1));
				classUtils.verify(() -> ClassUtils.isAssignableValue(Object.class, "return_of_resolveRequiredPlaceholders1"), atLeast(1));
				defaultConversionService.verify(() -> DefaultConversionService.getSharedInstance(), atLeast(1));
				verify(conversionServiceMock).convert("return_of_resolveRequiredPlaceholders1", Object.class);
				verify(target).resolveRequiredPlaceholders("A");
			});
		}
	}

	//Sapient generated method id: ${4be18f0e-fc19-36f7-bd30-a24284232024}, hash: 0CD5C3AB76D94BFE604BC33C4C85B675
	@Test()
	void getProperty3WhenResolveNestedPlaceholdersAndValueInstanceOfString() throws Exception {
		/* Branches:
		 * (attached != null) : true  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : true  #  inside getAttached method
		 * (springSource.isUsingSources(this.propertySources)) : true  #  inside getAttached method
		 * (attached != null) : true  #  inside findPropertyValue method
		 * (name != null) : true  #  inside findPropertyValue method
		 * (configurationProperty != null) : true  #  inside findPropertyValue method
		 * (value == null) : false  #  inside getProperty method
		 * (resolveNestedPlaceholders) : true  #  inside getProperty method
		 * (value instanceof String string) : true  #  inside getProperty method
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyName2Mock, "", originMock);
			doReturn(configurationProperty).when(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("key1", true)).thenReturn(configurationPropertyNameMock);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			Class<Object> _class = null;
			//Act Statement(s)
			Object result = target.getProperty("key1", _class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(""));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				verify(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
				verify(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("key1", true), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${04a859b7-4ac2-370b-adbd-713d08e1fe8b}, hash: 0250A08560FB9BCE165DFE15FF3BE922
	@Test()
	void getProperty3WhenConfigurationPropertyIsNotNullAndValueIsNotNullAndResolveNestedPlaceholdersAndValueInstanceOfString() throws Exception {
		/* Branches:
		 * (attached != null) : true  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : true  #  inside getAttached method
		 * (springSource.isUsingSources(this.propertySources)) : true  #  inside getAttached method
		 * (attached != null) : true  #  inside findPropertyValue method
		 * (name != null) : true  #  inside findPropertyValue method
		 * (configurationProperty != null) : true  #  inside findPropertyValue method
		 * (value == null) : false  #  inside getProperty method
		 * (resolveNestedPlaceholders) : true  #  inside getProperty method
		 * (value instanceof String string) : true  #  inside getProperty method
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyName2Mock, "", originMock);
			doReturn(configurationProperty).when(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("key1", true)).thenReturn(configurationPropertyNameMock);
			classUtils.when(() -> ClassUtils.isAssignableValue(Object.class, "")).thenReturn(true);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			//Act Statement(s)
			Object result = target.getProperty("key1", Object.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(""));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				verify(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
				verify(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("key1", true), atLeast(1));
				classUtils.verify(() -> ClassUtils.isAssignableValue(Object.class, ""), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4eb45dcf-3e0f-3715-976d-c80efad0c4ce}, hash: 1C0C9E3070BE12C7F925CCE4BB3FB73E
	@Disabled()
	@Test()
	void getProperty3WhenCaughtExceptionAndValueIsNotNullAndResolveNestedPlaceholdersAndValueInstanceOfString() throws Exception {
		/* Branches:
		 * (attached != null) : true  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : true  #  inside getAttached method
		 * (springSource.isUsingSources(this.propertySources)) : true  #  inside getAttached method
		 * (attached != null) : true  #  inside findPropertyValue method
		 * (name != null) : true  #  inside findPropertyValue method
		 * (configurationProperty != null) : true  #  inside findPropertyValue method
		 * (catch-exception (Exception)) : true  #  inside findPropertyValue method
		 * (value == null) : false  #  inside getProperty method
		 * (resolveNestedPlaceholders) : true  #  inside getProperty method
		 * (value instanceof String string) : true  #  inside getProperty method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: defaultResolver - Method: getProperty
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			Object object = new Object();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyName2Mock, object, originMock);
			doReturn(configurationProperty).when(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("key1", true)).thenReturn(configurationPropertyNameMock);
			classUtils.when(() -> ClassUtils.isAssignableValue(Object.class, "")).thenReturn(false);
			defaultConversionService.when(() -> DefaultConversionService.getSharedInstance()).thenReturn(conversionServiceMock);
			Object object2 = new Object();
			doReturn(object2).when(conversionServiceMock).convert("", Object.class);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			//Act Statement(s)
			Object result = target.getProperty("key1", Object.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(object2));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				verify(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
				verify(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("key1", true), atLeast(1));
				classUtils.verify(() -> ClassUtils.isAssignableValue(Object.class, ""), atLeast(1));
				defaultConversionService.verify(() -> DefaultConversionService.getSharedInstance(), atLeast(1));
				verify(conversionServiceMock).convert("", Object.class);
			});
		}
	}

	//Sapient generated method id: ${3381bc01-cc6f-3fb1-acc6-49d9032189b6}, hash: 0914994AE71A9C980F1090D23D3AF585
	@Disabled()
	@Test()
	void getProperty3WhenConfigurationPropertyIsNotNullAndCaughtExceptionAndValueIsNotNullAndResolveNestedPlaceholdersAndValueIn() throws Exception {
		/* Branches:
		 * (attached != null) : true  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : true  #  inside getAttached method
		 * (springSource.isUsingSources(this.propertySources)) : true  #  inside getAttached method
		 * (attached != null) : true  #  inside findPropertyValue method
		 * (name != null) : true  #  inside findPropertyValue method
		 * (configurationProperty != null) : true  #  inside findPropertyValue method
		 * (catch-exception (Exception)) : true  #  inside findPropertyValue method
		 * (value == null) : false  #  inside getProperty method
		 * (resolveNestedPlaceholders) : true  #  inside getProperty method
		 * (value instanceof String string) : true  #  inside getProperty method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: defaultResolver - Method: getProperty
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			Object object = new Object();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyName2Mock, object, originMock);
			doReturn(configurationProperty).when(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("key1", true)).thenReturn(configurationPropertyNameMock);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			Class<Object> _class = null;
			//Act Statement(s)
			Object result = target.getProperty("key1", _class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(""));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				verify(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
				verify(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("key1", true), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${137c4932-6bf0-3306-98f3-1a13f6dae120}, hash: D3FE4F50547032C94429AB88F4EDD01E
	@Disabled()
	@Test()
	void getProperty3WhenCaughtExceptionAndValueIsNotNullAndResolveNestedPlaceholdersAndValueInstanceOfString2() throws Exception {
		/* Branches:
		 * (attached != null) : true  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : true  #  inside getAttached method
		 * (springSource.isUsingSources(this.propertySources)) : true  #  inside getAttached method
		 * (attached != null) : true  #  inside findPropertyValue method
		 * (name != null) : true  #  inside findPropertyValue method
		 * (configurationProperty != null) : true  #  inside findPropertyValue method
		 * (catch-exception (Exception)) : true  #  inside findPropertyValue method
		 * (value == null) : false  #  inside getProperty method
		 * (resolveNestedPlaceholders) : true  #  inside getProperty method
		 * (value instanceof String string) : true  #  inside getProperty method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: defaultResolver - Method: getProperty
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			Object object = new Object();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyName2Mock, object, originMock);
			doReturn(configurationProperty).when(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("key1", true)).thenReturn(configurationPropertyNameMock);
			classUtils.when(() -> ClassUtils.isAssignableValue(Object.class, "")).thenReturn(true);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			//Act Statement(s)
			Object result = target.getProperty("key1", Object.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(""));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				verify(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
				verify(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("key1", true), atLeast(1));
				classUtils.verify(() -> ClassUtils.isAssignableValue(Object.class, ""), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${96526e58-f2a4-39cb-ae25-d7d769ae4d92}, hash: B0B8EA60DF754B038E57CA3562CEC827
	@Disabled()
	@Test()
	void getPropertyAsRawStringWhenValueIsNotNullAndNotResolveNestedPlaceholders() throws Exception {
		/* Branches:
		 * (attached != null) : false  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : false  #  inside getAttached method
		 * (attached != null) : false  #  inside findPropertyValue method
		 * (value == null) : false  #  inside getProperty method
		 * (resolveNestedPlaceholders) : false  #  inside getProperty method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: defaultResolver - Method: getProperty
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(null);
			Object object = new Object();
			classUtils.when(() -> ClassUtils.isAssignableValue(String.class, object)).thenReturn(false);
			defaultConversionService.when(() -> DefaultConversionService.getSharedInstance()).thenReturn(conversionServiceMock);
			doReturn("return_of_convert1").when(conversionServiceMock).convert(object, String.class);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			//Act Statement(s)
			String result = target.getPropertyAsRawString("key1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_convert1"));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				classUtils.verify(() -> ClassUtils.isAssignableValue(String.class, object), atLeast(1));
				defaultConversionService.verify(() -> DefaultConversionService.getSharedInstance(), atLeast(1));
				verify(conversionServiceMock).convert(object, String.class);
			});
		}
	}

	//Sapient generated method id: ${8178a25c-3642-3433-86f1-fb6c4cc7e472}, hash: D9CD0D2257355B78A3702170092A2776
	@Test()
	void getPropertyAsRawStringWhenConfigurationPropertyIsNullAndValueIsNull() throws Exception {
		/* Branches:
		 * (attached != null) : true  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : true  #  inside getAttached method
		 * (springSource.isUsingSources(this.propertySources)) : true  #  inside getAttached method
		 * (attached != null) : true  #  inside findPropertyValue method
		 * (name != null) : true  #  inside findPropertyValue method
		 * (configurationProperty != null) : false  #  inside findPropertyValue method
		 * (value == null) : true  #  inside getProperty method
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			doReturn(null).when(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("key1", true)).thenReturn(configurationPropertyNameMock);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			//Act Statement(s)
			String result = target.getPropertyAsRawString("key1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				verify(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
				verify(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("key1", true), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${58557aca-035b-3c54-bf85-8473a7b90a3e}, hash: 8400689C676089E49D76E61098007467
	@Test()
	void getPropertyAsRawStringWhenConfigurationPropertyIsNotNullAndValueIsNotNullAndNotResolveNestedPlaceholders() throws Exception {
		/* Branches:
		 * (attached != null) : true  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : true  #  inside getAttached method
		 * (springSource.isUsingSources(this.propertySources)) : true  #  inside getAttached method
		 * (attached != null) : true  #  inside findPropertyValue method
		 * (name != null) : true  #  inside findPropertyValue method
		 * (configurationProperty != null) : true  #  inside findPropertyValue method
		 * (value == null) : false  #  inside getProperty method
		 * (resolveNestedPlaceholders) : false  #  inside getProperty method
		 */
		//Arrange Statement(s)
		try (MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			Object object = new Object();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyName2Mock, object, originMock);
			doReturn(configurationProperty).when(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("key1", true)).thenReturn(configurationPropertyNameMock);
			classUtils.when(() -> ClassUtils.isAssignableValue(String.class, object)).thenReturn(false);
			defaultConversionService.when(() -> DefaultConversionService.getSharedInstance()).thenReturn(conversionServiceMock);
			doReturn("return_of_convert1").when(conversionServiceMock).convert(object, String.class);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			//Act Statement(s)
			String result = target.getPropertyAsRawString("key1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_convert1"));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				verify(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
				verify(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("key1", true), atLeast(1));
				classUtils.verify(() -> ClassUtils.isAssignableValue(String.class, object), atLeast(1));
				defaultConversionService.verify(() -> DefaultConversionService.getSharedInstance(), atLeast(1));
				verify(conversionServiceMock).convert(object, String.class);
			});
		}
	}

	//Sapient generated method id: ${9089bea0-bf63-3a30-b81e-574541a28fec}, hash: EBC56A959FDB1807D69D1C86F208AC41
	@Test()
	void getPropertyAsRawStringWhenConfigurationPropertyIsNotNullAndValueIsNotNullAndNotResolveNestedPlaceholders2() throws Exception {
		/* Branches:
		 * (attached != null) : true  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : true  #  inside getAttached method
		 * (springSource.isUsingSources(this.propertySources)) : true  #  inside getAttached method
		 * (attached != null) : true  #  inside findPropertyValue method
		 * (name != null) : true  #  inside findPropertyValue method
		 * (configurationProperty != null) : true  #  inside findPropertyValue method
		 * (value == null) : false  #  inside getProperty method
		 * (resolveNestedPlaceholders) : false  #  inside getProperty method
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyName2Mock, "value1", originMock);
			doReturn(configurationProperty).when(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("key1", true)).thenReturn(configurationPropertyNameMock);
			classUtils.when(() -> ClassUtils.isAssignableValue(String.class, "value1")).thenReturn(true);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			//Act Statement(s)
			String result = target.getPropertyAsRawString("key1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("value1"));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				verify(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
				verify(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("key1", true), atLeast(1));
				classUtils.verify(() -> ClassUtils.isAssignableValue(String.class, "value1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${5c4e4df6-d7b5-3443-ba18-431e3022d0dc}, hash: 6972ABB1F2528A7F791C00B6785277E6
	@Disabled()
	@Test()
	void getPropertyAsRawStringWhenCaughtExceptionAndValueIsNull() throws Exception {
		/* Branches:
		 * (attached != null) : true  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : true  #  inside getAttached method
		 * (springSource.isUsingSources(this.propertySources)) : true  #  inside getAttached method
		 * (attached != null) : true  #  inside findPropertyValue method
		 * (name != null) : true  #  inside findPropertyValue method
		 * (configurationProperty != null) : true  #  inside findPropertyValue method
		 * (catch-exception (Exception)) : true  #  inside findPropertyValue method
		 * (value == null) : true  #  inside getProperty method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: defaultResolver - Method: getProperty
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			Object object = new Object();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyName2Mock, object, originMock);
			doReturn(configurationProperty).when(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("key1", true)).thenReturn(configurationPropertyNameMock);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			//Act Statement(s)
			String result = target.getPropertyAsRawString("key1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				verify(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
				verify(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("key1", true), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4ab0aaa3-6bea-38fa-9c21-f244d7e9c6a0}, hash: 08A9DBF8EFF323970F04DAB11B40DB6C
	@Disabled()
	@Test()
	void getPropertyAsRawStringWhenCaughtExceptionAndValueIsNotNullAndNotResolveNestedPlaceholders() throws Exception {
		/* Branches:
		 * (attached != null) : true  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : true  #  inside getAttached method
		 * (springSource.isUsingSources(this.propertySources)) : true  #  inside getAttached method
		 * (attached != null) : true  #  inside findPropertyValue method
		 * (name != null) : true  #  inside findPropertyValue method
		 * (configurationProperty != null) : true  #  inside findPropertyValue method
		 * (catch-exception (Exception)) : true  #  inside findPropertyValue method
		 * (value == null) : false  #  inside getProperty method
		 * (resolveNestedPlaceholders) : false  #  inside getProperty method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: defaultResolver - Method: getProperty
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			Object object = new Object();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyName2Mock, object, originMock);
			doReturn(configurationProperty).when(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("key1", true)).thenReturn(configurationPropertyNameMock);
			Object object2 = new Object();
			classUtils.when(() -> ClassUtils.isAssignableValue(String.class, object2)).thenReturn(false);
			defaultConversionService.when(() -> DefaultConversionService.getSharedInstance()).thenReturn(conversionServiceMock);
			doReturn("return_of_convert1").when(conversionServiceMock).convert(object2, String.class);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			//Act Statement(s)
			String result = target.getPropertyAsRawString("key1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_convert1"));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				verify(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
				verify(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("key1", true), atLeast(1));
				classUtils.verify(() -> ClassUtils.isAssignableValue(String.class, object2), atLeast(1));
				defaultConversionService.verify(() -> DefaultConversionService.getSharedInstance(), atLeast(1));
				verify(conversionServiceMock).convert(object2, String.class);
			});
		}
	}

	//Sapient generated method id: ${d8e95d18-a74a-3b58-b7a9-c72791ba3814}, hash: CEDD9A2C895C276F51BC69D63312E0C8
	@Disabled()
	@Test()
	void getPropertyAsRawStringWhenConfigurationPropertyIsNotNullAndCaughtExceptionAndValueIsNotNullAndNotResolveNestedPlacehold() throws Exception {
		/* Branches:
		 * (attached != null) : true  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : true  #  inside getAttached method
		 * (springSource.isUsingSources(this.propertySources)) : true  #  inside getAttached method
		 * (attached != null) : true  #  inside findPropertyValue method
		 * (name != null) : true  #  inside findPropertyValue method
		 * (configurationProperty != null) : true  #  inside findPropertyValue method
		 * (catch-exception (Exception)) : true  #  inside findPropertyValue method
		 * (value == null) : false  #  inside getProperty method
		 * (resolveNestedPlaceholders) : false  #  inside getProperty method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: defaultResolver - Method: getProperty
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			Object object = new Object();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyName2Mock, object, originMock);
			doReturn(configurationProperty).when(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("key1", true)).thenReturn(configurationPropertyNameMock);
			classUtils.when(() -> ClassUtils.isAssignableValue(String.class, "return_of_getProperty1")).thenReturn(true);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			//Act Statement(s)
			String result = target.getPropertyAsRawString("key1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_getProperty1"));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				verify(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
				verify(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("key1", true), atLeast(1));
				classUtils.verify(() -> ClassUtils.isAssignableValue(String.class, "return_of_getProperty1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${acf7beb5-251a-3524-99f1-c4f065269f55}, hash: C3CEBF5F50D4D90B1FF1D66C4CB923E4
	@Disabled()
	@Test()
	void getPropertyAsRawStringWhenConfigurationPropertyIsNullAndCaughtExceptionAndValueIsNotNullAndNotResolveNestedPlaceholders() throws Exception {
		/* Branches:
		 * (attached != null) : true  #  inside getAttached method
		 * (attachedSource instanceof SpringConfigurationPropertySources springSource) : true  #  inside getAttached method
		 * (springSource.isUsingSources(this.propertySources)) : true  #  inside getAttached method
		 * (attached != null) : true  #  inside findPropertyValue method
		 * (name != null) : true  #  inside findPropertyValue method
		 * (configurationProperty != null) : false  #  inside findPropertyValue method
		 * (catch-exception (Exception)) : true  #  inside findPropertyValue method
		 * (value == null) : false  #  inside getProperty method
		 * (resolveNestedPlaceholders) : false  #  inside getProperty method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: defaultResolver - Method: getProperty
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<DefaultConversionService> defaultConversionService = mockStatic(DefaultConversionService.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class)) {
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			doReturn(null).when(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("key1", true)).thenReturn(configurationPropertyNameMock);
			Object object = new Object();
			classUtils.when(() -> ClassUtils.isAssignableValue(String.class, object)).thenReturn(false);
			defaultConversionService.when(() -> DefaultConversionService.getSharedInstance()).thenReturn(conversionServiceMock);
			doReturn("return_of_convert1").when(conversionServiceMock).convert(object, String.class);
			ConfigurationPropertySourcesPropertyResolver target = new ConfigurationPropertySourcesPropertyResolver(mutablePropertySourcesMock);
			//Act Statement(s)
			String result = target.getPropertyAsRawString("key1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_convert1"));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				verify(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
				verify(configurationPropertySourcesPropertySourceMock).findConfigurationProperty(configurationPropertyNameMock);
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("key1", true), atLeast(1));
				classUtils.verify(() -> ClassUtils.isAssignableValue(String.class, object), atLeast(1));
				defaultConversionService.verify(() -> DefaultConversionService.getSharedInstance(), atLeast(1));
				verify(conversionServiceMock).convert(object, String.class);
			});
		}
	}
}
