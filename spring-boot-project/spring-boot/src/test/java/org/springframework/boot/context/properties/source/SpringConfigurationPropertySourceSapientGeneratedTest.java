package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.mockito.stubbing.Answer;

import org.springframework.boot.origin.Origin;
import org.springframework.core.env.PropertySource;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.util.Assert;

import java.util.Map;
import java.util.HashMap;

import org.springframework.boot.origin.PropertySourceOrigin;

import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.util.Random;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.doThrow;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringConfigurationPropertySourceSapientGeneratedTest {

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final PropertyMapper mapperMock = mock(PropertyMapper.class);

	private final ConfigurationPropertyName nameMock = mock(ConfigurationPropertyName.class);

	private final Origin originMock = mock(Origin.class);

	private final PropertyMapper propertyMapperMock = mock(PropertyMapper.class);

	private final PropertySource propertySourceMock = mock(PropertySource.class);

	private final SystemEnvironmentPropertySource sourceMock = mock(SystemEnvironmentPropertySource.class);

	//Sapient generated method id: ${b9f4539f-22c1-3b32-b0e6-3ab60afe5a86}, hash: C24C482D2E40073AB1B6B89CCECC7730
	@Test()
	void getConfigurationPropertyWhenNameIsNull() throws Exception {
		/* Branches:
		 * (name == null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.notNull(propertySourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
			SpringConfigurationPropertySource target = new SpringConfigurationPropertySource(propertySourceMock, propertyMapperArray);
			ConfigurationPropertyName configurationPropertyName = null;
			//Act Statement(s)
			ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.notNull(propertySourceMock, "PropertySource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${57054a1e-10ca-3fbe-8b8c-9d6a45d7edfc}, hash: 74F3A0CD4F6D4CC3917BE22026B182B7
	@Test()
	void getConfigurationPropertyWhenValueIsNotNull() throws Exception {
		/* Branches:
		 * (name == null) : false
		 * (for-each(this.mappers)) : true
		 * (for-each(mapper.map(name))) : true
		 * (value != null) : true
		 */
		//Arrange Statement(s)
		ConfigurationProperty configurationPropertyMock = mock(ConfigurationProperty.class);
		try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
			 MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Object object = new Object();
			doReturn(object).when(propertySourceMock).getProperty("return_of_mapItem1");
			List<String> stringList = new ArrayList<>();
			stringList.add("return_of_mapItem1");
			doReturn(stringList).when(mapperMock).map(configurationPropertyNameMock);
			_assert.when(() -> Assert.notNull(propertySourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			propertySourceOrigin.when(() -> PropertySourceOrigin.get(propertySourceMock, "return_of_mapItem1")).thenReturn(originMock);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { mapperMock };
			SpringConfigurationPropertySource target = new SpringConfigurationPropertySource(propertySourceMock, propertyMapperArray);
			configurationProperty.when(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock)).thenReturn(configurationPropertyMock);
			//Act Statement(s)
			ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyMock));
				verify(propertySourceMock, atLeast(1)).getProperty("return_of_mapItem1");
				verify(mapperMock, atLeast(1)).map(configurationPropertyNameMock);
				_assert.verify(() -> Assert.notNull(propertySourceMock, "PropertySource must not be null"), atLeast(1));
				propertySourceOrigin.verify(() -> PropertySourceOrigin.get(propertySourceMock, "return_of_mapItem1"), atLeast(1));
				configurationProperty.verify(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${e893205b-f056-31da-9a8b-883b9fa7b02b}, hash: DC74B61D0012E7F07CFE4F3F2C12D214
	@Test()
	void getConfigurationPropertyWhenValueIsNull() throws Exception {
		/* Branches:
		 * (name == null) : false
		 * (for-each(this.mappers)) : true
		 * (for-each(mapper.map(name))) : true
		 * (value != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			doReturn(null).when(propertySourceMock).getProperty("return_of_mapItem1");
			List<String> stringList = new ArrayList<>();
			stringList.add("return_of_mapItem1");
			doReturn(stringList).when(mapperMock).map(configurationPropertyNameMock);
			_assert.when(() -> Assert.notNull(propertySourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { mapperMock };
			SpringConfigurationPropertySource target = new SpringConfigurationPropertySource(propertySourceMock, propertyMapperArray);
			//Act Statement(s)
			ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(propertySourceMock, atLeast(1)).getProperty("return_of_mapItem1");
				verify(mapperMock, atLeast(1)).map(configurationPropertyNameMock);
				_assert.verify(() -> Assert.notNull(propertySourceMock, "PropertySource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${b05f9563-c00e-35b0-ac54-e5a6743c0e45}, hash: ED2CBA039566866571CEE73590ECE123
	@Test()
	void getConfigurationPropertyWhenValueIsNotNullAndCaughtException() throws Exception {
		/* Branches:
		 * (name == null) : false
		 * (for-each(this.mappers)) : true
		 * (for-each(mapper.map(name))) : true
		 * (value != null) : true
		 * (catch-exception (Exception)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
			 MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Object object = new Object();
			doReturn(object).when(propertySourceMock).getProperty("return_of_mapItem1");
			List<String> stringList = new ArrayList<>();
			stringList.add("return_of_mapItem1");
			doReturn(stringList).when(mapperMock).map(configurationPropertyNameMock);
			_assert.when(() -> Assert.notNull(propertySourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			propertySourceOrigin.when(() -> PropertySourceOrigin.get(propertySourceMock, "return_of_mapItem1")).thenReturn(originMock);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { mapperMock };
			SpringConfigurationPropertySource target = new SpringConfigurationPropertySource(propertySourceMock, propertyMapperArray);
			RuntimeException runtimeException = new RuntimeException();
			configurationProperty.when(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock)).thenThrow(runtimeException);
			//Act Statement(s)
			ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(propertySourceMock, atLeast(1)).getProperty("return_of_mapItem1");
				verify(mapperMock, atLeast(1)).map(configurationPropertyNameMock);
				_assert.verify(() -> Assert.notNull(propertySourceMock, "PropertySource must not be null"), atLeast(1));
				propertySourceOrigin.verify(() -> PropertySourceOrigin.get(propertySourceMock, "return_of_mapItem1"), atLeast(1));
				configurationProperty.verify(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a20fdfe4-cdf6-38cc-838b-6f56df8c64d8}, hash: 452A77148A1343C1F1C72D9645510D4D
	@Test()
	void containsDescendantOfWhenNameGetElement0FormDASHEDEqualsPrefix() {
		/* Branches:
		 * (underlyingSource instanceof Random) : true
		 * (name.getNumberOfElements() > 1) : true  #  inside containsDescendantOfForRandom method
		 * (name.getElement(0, Form.DASHED).equals(prefix)) : true  #  inside containsDescendantOfForRandom method
		 */
		//Arrange Statement(s)
		PropertySource sourceMock = mock(PropertySource.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			doReturn(2).when(nameMock).getNumberOfElements();
			doReturn("random").when(nameMock).getElement(0, ConfigurationPropertyName.Form.DASHED);
			Random random = new Random();
			doReturn(random).when(sourceMock).getSource();
			_assert.when(() -> Assert.notNull(sourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
			SpringConfigurationPropertySource target = new SpringConfigurationPropertySource(sourceMock, propertyMapperArray);
			//Act Statement(s)
			ConfigurationPropertyState result = target.containsDescendantOf(nameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.PRESENT));
				verify(nameMock, atLeast(1)).getNumberOfElements();
				verify(nameMock, atLeast(1)).getElement(0, ConfigurationPropertyName.Form.DASHED);
				verify(sourceMock, atLeast(1)).getSource();
				_assert.verify(() -> Assert.notNull(sourceMock, "PropertySource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${b514815c-5d5f-3106-8992-cabdec07f0e1}, hash: D3F3236A86A2D7002E8399D0CFD9E7EF
	@Test()
	void containsDescendantOfWhenNameGetElement0FormDASHEDNotEqualsPrefix() {
		/* Branches:
		 * (underlyingSource instanceof Random) : true
		 * (name.getNumberOfElements() > 1) : true  #  inside containsDescendantOfForRandom method
		 * (name.getElement(0, Form.DASHED).equals(prefix)) : false  #  inside containsDescendantOfForRandom method
		 */
		//Arrange Statement(s)
		PropertySource sourceMock = mock(PropertySource.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			doReturn(2).when(nameMock).getNumberOfElements();
			doReturn("A").when(nameMock).getElement(0, ConfigurationPropertyName.Form.DASHED);
			Random random = new Random();
			doReturn(random).when(sourceMock).getSource();
			_assert.when(() -> Assert.notNull(sourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
			SpringConfigurationPropertySource target = new SpringConfigurationPropertySource(sourceMock, propertyMapperArray);
			//Act Statement(s)
			ConfigurationPropertyState result = target.containsDescendantOf(nameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.ABSENT));
				verify(nameMock, atLeast(1)).getNumberOfElements();
				verify(nameMock, atLeast(1)).getElement(0, ConfigurationPropertyName.Form.DASHED);
				verify(sourceMock, atLeast(1)).getSource();
				_assert.verify(() -> Assert.notNull(sourceMock, "PropertySource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3480a059-111e-3cd7-8876-097390f04f0b}, hash: EF7C66E03E1C8C087F2669A53ED863DE
	@Test()
	void containsDescendantOfWhenUnderlyingPropertySourceGetSourceNotInstanceOfRandom() {
		/* Branches:
		 * (underlyingSource instanceof Random) : false
		 * (underlyingSource instanceof PropertySource<?> underlyingPropertySource) : true
		 * (underlyingPropertySource.getSource() instanceof Random) : false
		 */
		//Arrange Statement(s)
		PropertySource sourceMock = mock(PropertySource.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			doReturn(propertySourceMock).when(sourceMock).getSource();
			Object object = new Object();
			doReturn(object).when(propertySourceMock).getSource();
			_assert.when(() -> Assert.notNull(sourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
			SpringConfigurationPropertySource target = new SpringConfigurationPropertySource(sourceMock, propertyMapperArray);
			//Act Statement(s)
			ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.UNKNOWN));
				verify(sourceMock, atLeast(1)).getSource();
				verify(propertySourceMock, atLeast(1)).getSource();
				_assert.verify(() -> Assert.notNull(sourceMock, "PropertySource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${167a029e-7228-3e41-8223-6ba2de054634}, hash: 85B558B1D0176107E85EFECDA30DC35F
	@Test()
	void containsDescendantOfWhenNameGetNumberOfElementsGreaterThan1AndNameGetElement0FormDASHEDEqualsPrefix() {
		/* Branches:
		 * (underlyingSource instanceof Random) : false
		 * (underlyingSource instanceof PropertySource<?> underlyingPropertySource) : true
		 * (underlyingPropertySource.getSource() instanceof Random) : true
		 * (name.getNumberOfElements() > 1) : true  #  inside containsDescendantOfForRandom method
		 * (name.getElement(0, Form.DASHED).equals(prefix)) : true  #  inside containsDescendantOfForRandom method
		 */
		//Arrange Statement(s)
		PropertySource sourceMock = mock(PropertySource.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			doReturn(2).when(nameMock).getNumberOfElements();
			doReturn("A").when(nameMock).getElement(0, ConfigurationPropertyName.Form.DASHED);
			doReturn(propertySourceMock).when(sourceMock).getSource();
			Random random = new Random();
			doReturn(random).when(propertySourceMock).getSource();
			doReturn("A").when(sourceMock).getName();
			_assert.when(() -> Assert.notNull(sourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
			SpringConfigurationPropertySource target = new SpringConfigurationPropertySource(sourceMock, propertyMapperArray);
			//Act Statement(s)
			ConfigurationPropertyState result = target.containsDescendantOf(nameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.PRESENT));
				verify(nameMock, atLeast(1)).getNumberOfElements();
				verify(nameMock, atLeast(1)).getElement(0, ConfigurationPropertyName.Form.DASHED);
				verify(sourceMock, atLeast(1)).getSource();
				verify(propertySourceMock, atLeast(1)).getSource();
				verify(sourceMock, atLeast(1)).getName();
				_assert.verify(() -> Assert.notNull(sourceMock, "PropertySource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${5e8ae88e-57b6-3519-814b-ed5c83f6309f}, hash: F80FBA1E99C7F6C629F4FD0A6A3F0E4A
	@Test()
	void containsDescendantOfWhenNameGetNumberOfElementsGreaterThan1AndNameGetElement0FormDASHEDNotEqualsPrefix() {
		/* Branches:
		 * (underlyingSource instanceof Random) : false
		 * (underlyingSource instanceof PropertySource<?> underlyingPropertySource) : true
		 * (underlyingPropertySource.getSource() instanceof Random) : true
		 * (name.getNumberOfElements() > 1) : true  #  inside containsDescendantOfForRandom method
		 * (name.getElement(0, Form.DASHED).equals(prefix)) : false  #  inside containsDescendantOfForRandom method
		 */
		//Arrange Statement(s)
		PropertySource sourceMock = mock(PropertySource.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			doReturn(2).when(nameMock).getNumberOfElements();
			doReturn("A").when(nameMock).getElement(0, ConfigurationPropertyName.Form.DASHED);
			doReturn(propertySourceMock).when(sourceMock).getSource();
			Random random = new Random();
			doReturn(random).when(propertySourceMock).getSource();
			doReturn("B").when(sourceMock).getName();
			_assert.when(() -> Assert.notNull(sourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
			SpringConfigurationPropertySource target = new SpringConfigurationPropertySource(sourceMock, propertyMapperArray);
			//Act Statement(s)
			ConfigurationPropertyState result = target.containsDescendantOf(nameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.ABSENT));
				verify(nameMock, atLeast(1)).getNumberOfElements();
				verify(nameMock, atLeast(1)).getElement(0, ConfigurationPropertyName.Form.DASHED);
				verify(sourceMock, atLeast(1)).getSource();
				verify(propertySourceMock, atLeast(1)).getSource();
				verify(sourceMock, atLeast(1)).getName();
				_assert.verify(() -> Assert.notNull(sourceMock, "PropertySource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${72fc3519-47ef-3838-a2f1-90ba712b0e09}, hash: FCD1E9E10A8DF0146804F45D366D636D
	@Test()
	void getUnderlyingSourceTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.notNull(propertySourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
			SpringConfigurationPropertySource target = new SpringConfigurationPropertySource(propertySourceMock, propertyMapperArray);
			//Act Statement(s)
			Object result = target.getUnderlyingSource();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(propertySourceMock));
				_assert.verify(() -> Assert.notNull(propertySourceMock, "PropertySource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: B81BB8EF0A876BFD5F95013332FC2505
	@Test()
	void toStringTest() {
		//Arrange Statement(s)
		PropertySource propertySourceMock = mock(PropertySource.class, "<init>_propertySource1");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.notNull(propertySourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock };
			SpringConfigurationPropertySource target = new SpringConfigurationPropertySource(propertySourceMock, propertyMapperArray);
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("<init>_propertySource1"));
				_assert.verify(() -> Assert.notNull(propertySourceMock, "PropertySource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${2b28a53e-8877-3ae9-8aa0-a0a4712c9edc}, hash: 13B4B13FF2295339CB1432A7A328114E
	@Test()
	void fromWhenDefaultBranch() {
		/* Branches:
		 * (source instanceof SystemEnvironmentPropertySource) : false  #  inside getPropertyMappers method
		 * (source.getSource() != null) : false  #  inside getRootSource method
		 * (rootSource.getSource() instanceof Map) : false  #  inside isFullEnumerable method
		 * (isFullEnumerable(source)) : false
		 * (branch expression (line 71)) : false  #  inside <init> method
		 */
		//Arrange Statement(s)
		PropertySource sourceMock = mock(PropertySource.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			doReturn(null).when(sourceMock).getSource();
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(sourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			SpringConfigurationPropertySource result = SpringConfigurationPropertySource.from(sourceMock);
			//Assert statement(s)
			//TODO: Please implement equals method in SpringConfigurationPropertySource for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(sourceMock, atLeast(2)).getSource();
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(sourceMock, "PropertySource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${d32b81e2-723e-3db4-a762-6c75b5a0a2b0}, hash: 675C7002A9FF183A436755A23C9FF421
	@Disabled()
	@Test()
	void fromWhenSourceGetSourceIsNullAndRootSourceGetSourceNotInstanceOfMapAndIsFullEnumerableSource() {
		/* Branches:
		 * (source instanceof SystemEnvironmentPropertySource) : true  #  inside getPropertyMappers method
		 * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(name)) : false  #  inside hasSystemEnvironmentName method
		 * (name.endsWith("-" + StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME)) : false  #  inside hasSystemEnvironmentName method
		 * (hasSystemEnvironmentName(source)) : false  #  inside getPropertyMappers method
		 * (source.getSource() != null) : false  #  inside getRootSource method
		 * (rootSource.getSource() instanceof Map) : false  #  inside isFullEnumerable method
		 * (isFullEnumerable(source)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.context.properties.source.SpringIterableConfigurationPropertySource
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn("ABCDFGHIJKLMNOPQRS").when(sourceMock).getName();
			doReturn(null).when(sourceMock).getSource();
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			SpringConfigurationPropertySource result = SpringConfigurationPropertySource.from(sourceMock);
			//Assert statement(s)
			//TODO: Please implement equals method in SpringIterableConfigurationPropertySource for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(sourceMock, atLeast(1)).getName();
				verify(sourceMock, atLeast(2)).getSource();
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${e8ac2e10-0a1e-3415-98c0-91539382cdf1}, hash: 1A5D07BB426609E7C78F321C24378C93
	@Disabled()
	@Test()
	void fromWhenCaughtUnsupportedOperationExceptionAndIsFullEnumerableSource() {
		/* Branches:
		 * (source instanceof SystemEnvironmentPropertySource) : true  #  inside getPropertyMappers method
		 * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(name)) : true  #  inside hasSystemEnvironmentName method
		 * (hasSystemEnvironmentName(source)) : true  #  inside getPropertyMappers method
		 * (source.getSource() != null) : true  #  inside getRootSource method
		 * (source.getSource() instanceof PropertySource) : true  #  inside getRootSource method
		 * (rootSource.getSource() instanceof Map) : false  #  inside isFullEnumerable method
		 * (catch-exception (UnsupportedOperationException)) : true  #  inside isFullEnumerable method
		 * (isFullEnumerable(source)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.context.properties.source.SpringIterableConfigurationPropertySource
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn("systemEnvironment").when(sourceMock).getName();
			doReturn(propertySourceMock).when(sourceMock).getSource();
			doReturn(null).when(propertySourceMock).getSource();
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			SpringConfigurationPropertySource result = SpringConfigurationPropertySource.from(sourceMock);
			//Assert statement(s)
			//TODO: Please implement equals method in SpringIterableConfigurationPropertySource for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(sourceMock, atLeast(1)).getName();
				verify(sourceMock, atLeast(3)).getSource();
				verify(propertySourceMock, times(2)).getSource();
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${7afaeedc-e7ae-3ad1-a6b1-8c0f7e8a5387}, hash: 355081377A0A291F9963E5DC201CB977
	@Disabled()
	@Test()
	void fromWhenSourceGetSourceInstanceOfPropertySourceAndRootSourceGetSourceNotInstanceOfMapAndIsFullEnumerableSource() {
		/* Branches:
		 * (source instanceof SystemEnvironmentPropertySource) : true  #  inside getPropertyMappers method
		 * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(name)) : false  #  inside hasSystemEnvironmentName method
		 * (name.endsWith("-" + StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME)) : true  #  inside hasSystemEnvironmentName method
		 * (hasSystemEnvironmentName(source)) : true  #  inside getPropertyMappers method
		 * (source.getSource() != null) : true  #  inside getRootSource method
		 * (source.getSource() instanceof PropertySource) : true  #  inside getRootSource method
		 * (rootSource.getSource() instanceof Map) : false  #  inside isFullEnumerable method
		 * (isFullEnumerable(source)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.context.properties.source.SpringIterableConfigurationPropertySource
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn("-systemEnvironment").when(sourceMock).getName();
			doReturn(propertySourceMock).when(sourceMock).getSource();
			doReturn(null).when(propertySourceMock).getSource();
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			SpringConfigurationPropertySource result = SpringConfigurationPropertySource.from(sourceMock);
			//Assert statement(s)
			//TODO: Please implement equals method in SpringIterableConfigurationPropertySource for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(sourceMock, atLeast(1)).getName();
				verify(sourceMock, atLeast(3)).getSource();
				verify(propertySourceMock, times(2)).getSource();
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${6a450037-0369-3bfc-95af-bfa2a61f528f}, hash: BBE457AF7BA5B108DE83ED27873F303A
	@Test()
	void fromWhenRootSourceGetSourceInstanceOfMapAndIsFullEnumerableSource() {
		/* Branches:
		 * (source instanceof SystemEnvironmentPropertySource) : true  #  inside getPropertyMappers method
		 * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(name)) : false  #  inside hasSystemEnvironmentName method
		 * (name.endsWith("-" + StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME)) : true  #  inside hasSystemEnvironmentName method
		 * (hasSystemEnvironmentName(source)) : true  #  inside getPropertyMappers method
		 * (source.getSource() != null) : true  #  inside getRootSource method
		 * (source.getSource() instanceof PropertySource) : false  #  inside getRootSource method
		 * (rootSource.getSource() instanceof Map) : true  #  inside isFullEnumerable method
		 * (isFullEnumerable(source)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.context.properties.source.SpringIterableConfigurationPropertySource
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn("-systemEnvironment").when(sourceMock).getName();
			Map map = new HashMap<>();
			doReturn(map).when(sourceMock).getSource();
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			SpringConfigurationPropertySource result = SpringConfigurationPropertySource.from(sourceMock);
			//Assert statement(s)
			//TODO: Please implement equals method in SpringIterableConfigurationPropertySource for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(sourceMock, atLeast(1)).getName();
				verify(sourceMock, atLeast(4)).getSource();
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${7f100488-911f-3e27-bc67-2051b101c34d}, hash: AA39A8F47AF66C54D5EE4C7D7A5C3C8D
	@Test()
	void fromWhenIsFullEnumerableNotSourceAndDefaultBranch() {
		/* Branches:
		 * (source instanceof SystemEnvironmentPropertySource) : true  #  inside getPropertyMappers method
		 * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(name)) : true  #  inside hasSystemEnvironmentName method
		 * (hasSystemEnvironmentName(source)) : true  #  inside getPropertyMappers method
		 * (source.getSource() != null) : true  #  inside getRootSource method
		 * (source.getSource() instanceof PropertySource) : false  #  inside getRootSource method
		 * (rootSource.getSource() instanceof Map) : true  #  inside isFullEnumerable method
		 * (catch-exception (UnsupportedOperationException)) : true  #  inside isFullEnumerable method
		 * (isFullEnumerable(source)) : false
		 * (branch expression (line 71)) : false  #  inside <init> method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		UnsupportedOperationException unsupportedOperationExceptionMock = mock(UnsupportedOperationException.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			doReturn("systemEnvironment").when(sourceMock).getName();
			Map map = new HashMap<>();
			doThrow(unsupportedOperationExceptionMock).when(sourceMock).getSource();
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(sourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			SpringConfigurationPropertySource result = SpringConfigurationPropertySource.from(sourceMock);
			//Assert statement(s)
			//TODO: Please implement equals method in SpringConfigurationPropertySource for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(sourceMock, atLeast(1)).getName();
				verify(sourceMock, atLeast(4)).getSource();
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(sourceMock, "PropertySource must not be null"), atLeast(1));
			});
		}
	}
}
