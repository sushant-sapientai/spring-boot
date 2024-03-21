package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.mockito.stubbing.Answer;

import org.springframework.boot.origin.Origin;

import java.util.Iterator;
import java.util.stream.Stream;

import org.springframework.util.Assert;

import java.util.Map;
import java.util.HashMap;

import org.springframework.boot.origin.PropertySourceOrigin;

import org.mockito.MockedStatic;

import java.util.function.BiPredicate;
import java.util.ArrayList;

import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.core.env.MapPropertySource;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static java.util.Map.entry;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringIterableConfigurationPropertySourceSapientGeneratedTest {

	private final BiPredicate biPredicateMock = mock(BiPredicate.class);

	private final BiPredicate biPredicateMock2 = mock(BiPredicate.class);

	private final ConfigurationProperty configurationPropertyMock = mock(ConfigurationProperty.class);

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final EnumerablePropertySource enumerablePropertySourceMock = mock(EnumerablePropertySource.class);

	private final EnumerablePropertySource enumerablePropertySourceMock2 = mock(EnumerablePropertySource.class);

	private final MapPropertySource mapSourceMock = mock(MapPropertySource.class);

	private final Origin originMock = mock(Origin.class);

	private final Origin originMock2 = mock(Origin.class);

	private final PropertyMapper propertyMapperMock = mock(PropertyMapper.class);

	private final PropertyMapper propertyMapperMock2 = mock(PropertyMapper.class);

	//Sapient generated method id: ${ee2e73e4-ef45-316b-bf2a-4acf0f0898a5}, hash: 882E7DA0A386405B21150B550BCEA48F
	@Test()
	void getCachingTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Map<String, String> stringStringMap = new HashMap<>();
			doReturn(stringStringMap).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray);
			//Act Statement(s)
			ConfigurationPropertyCaching result = target.getCaching();
			//Assert statement(s)
			//TODO: Please implement equals method in SoftReferenceConfigurationPropertyCache for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(mapSourceMock, times(2)).getSource();
				verify(mapSourceMock, atLeast(1)).getName();
				verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
				verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${b9f4539f-22c1-3b32-b0e6-3ab60afe5a86}, hash: 2A3BF3325DD925BA0B7E1ABE7CA5A0C9
	@Test()
	void getConfigurationPropertyWhenNameIsNull() {
		/* Branches:
		 * (name == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Map<String, String> stringStringMap = new HashMap<>();
			doReturn(stringStringMap).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray);
			ConfigurationPropertyName configurationPropertyName = null;
			//Act Statement(s)
			ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(mapSourceMock, times(2)).getSource();
				verify(mapSourceMock, atLeast(1)).getName();
				verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
				verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${87d2c1c5-91e5-3fb5-83d2-294d6c587a4a}, hash: F3B44E552897B37BE6F150D5EB26C221
	@Test()
	void getConfigurationPropertyWhenConfigurationPropertyIsNotNull() {
		/* Branches:
		 * (name == null) : false
		 * (name == null) : false  #  inside getConfigurationProperty method
		 * (for-each(this.mappers)) : true  #  inside getConfigurationProperty method
		 * (for-each(mapper.map(name))) : true  #  inside getConfigurationProperty method
		 * (value != null) : true  #  inside getConfigurationProperty method
		 * (configurationProperty != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
			 MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Map<String, String> stringStringMap = new HashMap<>();
			doReturn(stringStringMap).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			Object object = new Object();
			doReturn(object).when(mapSourceMock).getProperty("return_of_mapItem1");
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			List<String> stringList = new ArrayList<>();
			stringList.add("return_of_mapItem1");
			doReturn(stringList).when(propertyMapperMock).map(configurationPropertyNameMock);
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			propertySourceOrigin.when(() -> PropertySourceOrigin.get(mapSourceMock, "return_of_mapItem1")).thenReturn(originMock);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray);
			configurationProperty.when(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock)).thenReturn(configurationPropertyMock);
			//Act Statement(s)
			ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyMock));
				verify(mapSourceMock, times(2)).getSource();
				verify(mapSourceMock, atLeast(1)).getName();
				verify(mapSourceMock, atLeast(1)).getProperty("return_of_mapItem1");
				verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
				verify(propertyMapperMock, atLeast(1)).map(configurationPropertyNameMock);
				verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
				propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapSourceMock, "return_of_mapItem1"), atLeast(1));
				configurationProperty.verify(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${9fc1eebb-964a-3d08-9dbf-f24b53dfd687}, hash: 30127ABE3AA0FF420EF2FF1AACA56C91
	@Disabled()
	@Test()
	void getConfigurationPropertyWhenValueIsNullAndConfigurationPropertyIsNullAndGetMappingsGetMappedNameIsEmpty() {
		/* Branches:
		 * (name == null) : false
		 * (name == null) : false  #  inside getConfigurationProperty method
		 * (for-each(this.mappers)) : true  #  inside getConfigurationProperty method
		 * (for-each(mapper.map(name))) : true  #  inside getConfigurationProperty method
		 * (value != null) : false  #  inside getConfigurationProperty method
		 * (configurationProperty != null) : false
		 * (for-each(getMappings().getMapped(name))) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type SpringIterableConfigurationPropertySource.Mappings
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Map<String, String> stringStringMap = new HashMap<>();
			doReturn(stringStringMap).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			doReturn(null).when(mapSourceMock).getProperty("return_of_mapItem1");
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			List<String> stringList = new ArrayList<>();
			stringList.add("return_of_mapItem1");
			doReturn(stringList).when(propertyMapperMock).map(configurationPropertyNameMock);
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray);
			//Act Statement(s)
			ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(mapSourceMock, times(2)).getSource();
				verify(mapSourceMock, atLeast(1)).getName();
				verify(mapSourceMock, atLeast(1)).getProperty("return_of_mapItem1");
				verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
				verify(propertyMapperMock, atLeast(1)).map(configurationPropertyNameMock);
				verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${57054a1e-10ca-3fbe-8b8c-9d6a45d7edfc}, hash: E51F301E093605906CEF529000C0FBF0
	@Disabled()
	@Test()
	void getConfigurationPropertyWhenValueIsNotNull() {
		/* Branches:
		 * (name == null) : false
		 * (name == null) : false  #  inside getConfigurationProperty method
		 * (for-each(this.mappers)) : true  #  inside getConfigurationProperty method
		 * (for-each(mapper.map(name))) : true  #  inside getConfigurationProperty method
		 * (value != null) : true  #  inside getConfigurationProperty method
		 * (configurationProperty != null) : false
		 * (for-each(getMappings().getMapped(name))) : true
		 * (value != null) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type SpringIterableConfigurationPropertySource.Mappings
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
			 MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Map<String, String> stringStringMap = new HashMap<>();
			doReturn(stringStringMap).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			Object object = new Object();
			doReturn(object).when(mapSourceMock).getProperty("return_of_mapItem1");
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			List<String> stringList = new ArrayList<>();
			stringList.add("return_of_mapItem1");
			doReturn(stringList).when(propertyMapperMock).map(configurationPropertyNameMock);
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			propertySourceOrigin.when(() -> PropertySourceOrigin.get(mapSourceMock, "return_of_mapItem1")).thenReturn(originMock);
			propertySourceOrigin.when(() -> PropertySourceOrigin.get(enumerablePropertySourceMock, "name1")).thenReturn(originMock2);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
			configurationProperty.when(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock)).thenReturn(null);
			Object object2 = new Object();
			doReturn(object2).when(enumerablePropertySourceMock2).getProperty("name1");
			doReturn(enumerablePropertySourceMock2, enumerablePropertySourceMock).when(target).getPropertySource();
			configurationProperty.when(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object2, originMock2)).thenReturn(configurationPropertyMock);
			//Act Statement(s)
			ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyMock));
				verify(mapSourceMock, times(2)).getSource();
				verify(mapSourceMock, atLeast(1)).getName();
				verify(mapSourceMock, atLeast(1)).getProperty("return_of_mapItem1");
				verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
				verify(propertyMapperMock, atLeast(1)).map(configurationPropertyNameMock);
				verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
				propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapSourceMock, "return_of_mapItem1"), atLeast(1));
				propertySourceOrigin.verify(() -> PropertySourceOrigin.get(enumerablePropertySourceMock, "name1"), atLeast(1));
				configurationProperty.verify(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock), atLeast(1));
				verify(target, times(2)).getPropertySource();
				verify(enumerablePropertySourceMock2, atLeast(1)).getProperty("name1");
				configurationProperty.verify(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object2, originMock2), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${e893205b-f056-31da-9a8b-883b9fa7b02b}, hash: 3FB4293F4DDA3DC7B36714A0D05A411F
	@Disabled()
	@Test()
	void getConfigurationPropertyWhenValueIsNull() {
		/* Branches:
		 * (name == null) : false
		 * (name == null) : false  #  inside getConfigurationProperty method
		 * (for-each(this.mappers)) : true  #  inside getConfigurationProperty method
		 * (for-each(mapper.map(name))) : true  #  inside getConfigurationProperty method
		 * (value != null) : true  #  inside getConfigurationProperty method
		 * (configurationProperty != null) : false
		 * (for-each(getMappings().getMapped(name))) : true
		 * (value != null) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type SpringIterableConfigurationPropertySource.Mappings
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
			 MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Map<String, String> stringStringMap = new HashMap<>();
			doReturn(stringStringMap).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			Object object = new Object();
			doReturn(object).when(mapSourceMock).getProperty("return_of_mapItem1");
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			List<String> stringList = new ArrayList<>();
			stringList.add("return_of_mapItem1");
			doReturn(stringList).when(propertyMapperMock).map(configurationPropertyNameMock);
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			propertySourceOrigin.when(() -> PropertySourceOrigin.get(mapSourceMock, "return_of_mapItem1")).thenReturn(originMock);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
			configurationProperty.when(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock)).thenReturn(null);
			doReturn(enumerablePropertySourceMock).when(target).getPropertySource();
			doReturn(null).when(enumerablePropertySourceMock).getProperty("name1");
			//Act Statement(s)
			ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(mapSourceMock, times(2)).getSource();
				verify(mapSourceMock, atLeast(1)).getName();
				verify(mapSourceMock, atLeast(1)).getProperty("return_of_mapItem1");
				verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
				verify(propertyMapperMock, atLeast(1)).map(configurationPropertyNameMock);
				verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
				propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapSourceMock, "return_of_mapItem1"), atLeast(1));
				configurationProperty.verify(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock), atLeast(1));
				verify(target, atLeast(1)).getPropertySource();
				verify(enumerablePropertySourceMock, atLeast(1)).getProperty("name1");
			});
		}
	}

	//Sapient generated method id: ${e105d3be-5472-393b-b059-b658a063d376}, hash: 93F59F3FC7E854CC663363A4A44F9D09
	@Disabled()
	@Test()
	void getConfigurationPropertyWhenGetMappingsGetMappedNameIsNotEmptyAndValueIsNotNull() {
		/* Branches:
		 * (name == null) : false
		 * (name == null) : false  #  inside getConfigurationProperty method
		 * (for-each(this.mappers)) : true  #  inside getConfigurationProperty method
		 * (for-each(mapper.map(name))) : true  #  inside getConfigurationProperty method
		 * (value != null) : true  #  inside getConfigurationProperty method
		 * (branch expression (line 91)) : true  #  inside getConfigurationProperty method
		 * (configurationProperty != null) : false
		 * (for-each(getMappings().getMapped(name))) : true
		 * (value != null) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type SpringIterableConfigurationPropertySource.Mappings
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationProperty configurationPropertyMock2 = mock(ConfigurationProperty.class);
		try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
			 MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Map<String, String> stringStringMap = new HashMap<>();
			doReturn(stringStringMap).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			Object object = new Object();
			doReturn(object).when(mapSourceMock).getProperty("return_of_mapItem1");
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			List<String> stringList = new ArrayList<>();
			stringList.add("return_of_mapItem1");
			doReturn(stringList).when(propertyMapperMock).map(configurationPropertyNameMock);
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			propertySourceOrigin.when(() -> PropertySourceOrigin.get(mapSourceMock, "return_of_mapItem1")).thenReturn(originMock);
			propertySourceOrigin.when(() -> PropertySourceOrigin.get(enumerablePropertySourceMock, "name1")).thenReturn(originMock2);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
			configurationProperty.when(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock)).thenReturn(configurationPropertyMock);
			Object object2 = new Object();
			doReturn(object2).when(enumerablePropertySourceMock2).getProperty("name1");
			doReturn(enumerablePropertySourceMock2, enumerablePropertySourceMock).when(target).getPropertySource();
			configurationProperty.when(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object2, originMock2)).thenReturn(configurationPropertyMock2);
			//Act Statement(s)
			ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyMock2));
				verify(mapSourceMock, times(2)).getSource();
				verify(mapSourceMock, atLeast(1)).getName();
				verify(mapSourceMock, atLeast(1)).getProperty("return_of_mapItem1");
				verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
				verify(propertyMapperMock, atLeast(1)).map(configurationPropertyNameMock);
				verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
				propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapSourceMock, "return_of_mapItem1"), atLeast(1));
				propertySourceOrigin.verify(() -> PropertySourceOrigin.get(enumerablePropertySourceMock, "name1"), atLeast(1));
				configurationProperty.verify(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock), atLeast(1));
				verify(target, times(2)).getPropertySource();
				verify(enumerablePropertySourceMock2, atLeast(1)).getProperty("name1");
				configurationProperty.verify(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object2, originMock2), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${9050c48e-938a-32db-b9a6-0eb22f72c7dc}, hash: 2B9F9E1F5F2264D959B9FBD12FAC760D
	@Disabled()
	@Test()
	void getConfigurationPropertyWhenGetMappingsGetMappedNameIsNotEmptyAndValueIsNull() {
		/* Branches:
		 * (name == null) : false
		 * (name == null) : false  #  inside getConfigurationProperty method
		 * (for-each(this.mappers)) : true  #  inside getConfigurationProperty method
		 * (for-each(mapper.map(name))) : true  #  inside getConfigurationProperty method
		 * (value != null) : true  #  inside getConfigurationProperty method
		 * (branch expression (line 91)) : true  #  inside getConfigurationProperty method
		 * (configurationProperty != null) : false
		 * (for-each(getMappings().getMapped(name))) : true
		 * (value != null) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type SpringIterableConfigurationPropertySource.Mappings
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationProperty> configurationProperty = mockStatic(ConfigurationProperty.class);
			 MockedStatic<PropertySourceOrigin> propertySourceOrigin = mockStatic(PropertySourceOrigin.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Map<String, String> stringStringMap = new HashMap<>();
			doReturn(stringStringMap).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			Object object = new Object();
			doReturn(object).when(mapSourceMock).getProperty("return_of_mapItem1");
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			List<String> stringList = new ArrayList<>();
			stringList.add("return_of_mapItem1");
			doReturn(stringList).when(propertyMapperMock).map(configurationPropertyNameMock);
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			propertySourceOrigin.when(() -> PropertySourceOrigin.get(mapSourceMock, "return_of_mapItem1")).thenReturn(originMock);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
			configurationProperty.when(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock)).thenReturn(configurationPropertyMock);
			doReturn(enumerablePropertySourceMock).when(target).getPropertySource();
			doReturn(null).when(enumerablePropertySourceMock).getProperty("name1");
			//Act Statement(s)
			ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(mapSourceMock, times(2)).getSource();
				verify(mapSourceMock, atLeast(1)).getName();
				verify(mapSourceMock, atLeast(1)).getProperty("return_of_mapItem1");
				verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
				verify(propertyMapperMock, atLeast(1)).map(configurationPropertyNameMock);
				verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
				propertySourceOrigin.verify(() -> PropertySourceOrigin.get(mapSourceMock, "return_of_mapItem1"), atLeast(1));
				configurationProperty.verify(() -> ConfigurationProperty.of(target, configurationPropertyNameMock, object, originMock), atLeast(1));
				verify(target, atLeast(1)).getPropertySource();
				verify(enumerablePropertySourceMock, atLeast(1)).getProperty("name1");
			});
		}
	}

	//Sapient generated method id: ${d3831c55-97fb-36f6-9e97-7248c23be7cc}, hash: 437318112BF9C1FEED1D2F1E580AF587
	@Disabled()
	@Test()
	void streamWhenIsImmutablePropertySourceNot() {
		/* Branches:
		 * (source instanceof OriginLookup) : false  #  inside isImmutablePropertySource method
		 * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(source.getName())) : false  #  inside isImmutablePropertySource method
		 * (!isImmutablePropertySource()) : true  #  inside getConfigurationPropertyNames method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Map<String, String> stringStringMap = new HashMap<>();
			doReturn(stringStringMap).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
			doReturn("A").when(enumerablePropertySourceMock).getName();
			doReturn(enumerablePropertySourceMock, enumerablePropertySourceMock2).when(target).getPropertySource();
			String[] stringArray = new String[] {};
			doReturn(stringArray).when(enumerablePropertySourceMock2).getPropertyNames();
			//Act Statement(s)
			Stream<ConfigurationPropertyName> result = target.stream();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(mapSourceMock, times(2)).getSource();
				verify(mapSourceMock, atLeast(1)).getName();
				verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
				verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
				verify(target, times(2)).getPropertySource();
				verify(enumerablePropertySourceMock, atLeast(1)).getName();
				verify(enumerablePropertySourceMock2, atLeast(1)).getPropertyNames();
			});
		}
	}

	//Sapient generated method id: ${f2c28042-b6a8-3d46-a8a9-732e5704ff04}, hash: 88F8C69B09B067A25F2049A24C60F46D
	@Disabled()
	@Test()
	void streamWhenSourceGetSourceNotEqualsSystemGetenvAndIsImmutablePropertySourceNot() {
		/* Branches:
		 * (source instanceof OriginLookup) : false  #  inside isImmutablePropertySource method
		 * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(source.getName())) : true  #  inside isImmutablePropertySource method
		 * (source.getSource() == System.getenv()) : false  #  inside isImmutablePropertySource method
		 * (!isImmutablePropertySource()) : true  #  inside getConfigurationPropertyNames method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Map<String, String> stringStringMap = new HashMap<>();
			doReturn(stringStringMap).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
			doReturn("systemEnvironment").when(enumerablePropertySourceMock).getName();
			Object object = new Object();
			doReturn(object).when(enumerablePropertySourceMock).getSource();
			doReturn(enumerablePropertySourceMock, enumerablePropertySourceMock2).when(target).getPropertySource();
			String[] stringArray = new String[] {};
			doReturn(stringArray).when(enumerablePropertySourceMock2).getPropertyNames();
			//Act Statement(s)
			Stream<ConfigurationPropertyName> result = target.stream();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(mapSourceMock, times(2)).getSource();
				verify(mapSourceMock, atLeast(1)).getName();
				verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
				verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
				verify(target, times(2)).getPropertySource();
				verify(enumerablePropertySourceMock, atLeast(1)).getName();
				verify(enumerablePropertySourceMock, atLeast(1)).getSource();
				verify(enumerablePropertySourceMock2, atLeast(1)).getPropertyNames();
			});
		}
	}

	//Sapient generated method id: ${15837300-d633-3fc1-8480-7507eacca3a1}, hash: CC91A7E7A6820B3917F49A0513BF5AE9
	@Disabled()
	@Test()
	void streamWhenConfigurationPropertyNamesIsNull() {
		/* Branches:
		 * (source instanceof OriginLookup) : false  #  inside isImmutablePropertySource method
		 * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(source.getName())) : true  #  inside isImmutablePropertySource method
		 * (source.getSource() == System.getenv()) : true  #  inside isImmutablePropertySource method
		 * (!isImmutablePropertySource()) : false  #  inside getConfigurationPropertyNames method
		 * (configurationPropertyNames == null) : true  #  inside getConfigurationPropertyNames method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Map<String, String> stringStringMap = new HashMap<>();
			doReturn(stringStringMap).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
			doReturn("systemEnvironment").when(enumerablePropertySourceMock).getName();
			Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("PATH", "/usr/bin:/bin:/usr/sbin:/sbin"), entry("__CFBundleIdentifier", "com.jetbrains.intellij.ce"), entry("SSH_AUTH_SOCK", "/private/tmp/com.apple.launchd.8tne8Tof25/Listeners"), entry("XPC_FLAGS", "0x0"), entry("SHELL", "/bin/zsh"), entry("__CF_USER_TEXT_ENCODING", "0x1F5:0x0:0x0"), entry("LOGNAME", "sushantkumarsinha"), entry("XPC_SERVICE_NAME", "application.com.jetbrains.intellij.ce.39697931.39698994"), entry("USER", "sushantkumarsinha"), entry("HOME", "/Users/sushantkumarsinha"), entry("TMPDIR", "/var/folders/0f/l7nrmq912pdd7mlfzlmfmdc40000gn/T/"), entry("COMMAND_MODE", "unix2003")));
			doReturn(stringStringMap2).when(enumerablePropertySourceMock).getSource();
			doReturn(enumerablePropertySourceMock, enumerablePropertySourceMock2).when(target).getPropertySource();
			String[] stringArray = new String[] {};
			doReturn(stringArray).when(enumerablePropertySourceMock2).getPropertyNames();
			//Act Statement(s)
			Stream<ConfigurationPropertyName> result = target.stream();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(mapSourceMock, times(2)).getSource();
				verify(mapSourceMock, atLeast(1)).getName();
				verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
				verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
				verify(target, times(2)).getPropertySource();
				verify(enumerablePropertySourceMock, atLeast(1)).getName();
				verify(enumerablePropertySourceMock, atLeast(1)).getSource();
				verify(enumerablePropertySourceMock2, atLeast(1)).getPropertyNames();
			});
		}
	}

	//Sapient generated method id: ${cf8a5d39-ae43-3644-96ff-2e7c71af28b9}, hash: 972E148119D81ADCF6109E08AB8F6999
	@Disabled()
	@Test()
	void iteratorWhenIsImmutablePropertySourceNot() {
		/* Branches:
		 * (source instanceof OriginLookup) : false  #  inside isImmutablePropertySource method
		 * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(source.getName())) : false  #  inside isImmutablePropertySource method
		 * (!isImmutablePropertySource()) : true  #  inside getConfigurationPropertyNames method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Map<String, String> stringStringMap = new HashMap<>();
			doReturn(stringStringMap).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
			doReturn("A").when(enumerablePropertySourceMock).getName();
			doReturn(enumerablePropertySourceMock, enumerablePropertySourceMock2).when(target).getPropertySource();
			String[] stringArray = new String[] {};
			doReturn(stringArray).when(enumerablePropertySourceMock2).getPropertyNames();
			//Act Statement(s)
			Iterator<ConfigurationPropertyName> result = target.iterator();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(mapSourceMock, times(2)).getSource();
				verify(mapSourceMock, atLeast(1)).getName();
				verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
				verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
				verify(target, times(2)).getPropertySource();
				verify(enumerablePropertySourceMock, atLeast(1)).getName();
				verify(enumerablePropertySourceMock2, atLeast(1)).getPropertyNames();
			});
		}
	}

	//Sapient generated method id: ${989baa53-a8dd-3271-a5f1-93759b7cded4}, hash: 870810997E07EDFE9B800D328BF7155B
	@Disabled()
	@Test()
	void iteratorWhenSourceGetSourceNotEqualsSystemGetenvAndIsImmutablePropertySourceNot() {
		/* Branches:
		 * (source instanceof OriginLookup) : false  #  inside isImmutablePropertySource method
		 * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(source.getName())) : true  #  inside isImmutablePropertySource method
		 * (source.getSource() == System.getenv()) : false  #  inside isImmutablePropertySource method
		 * (!isImmutablePropertySource()) : true  #  inside getConfigurationPropertyNames method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Map<String, String> stringStringMap = new HashMap<>();
			doReturn(stringStringMap).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
			doReturn("systemEnvironment").when(enumerablePropertySourceMock).getName();
			Object object = new Object();
			doReturn(object).when(enumerablePropertySourceMock).getSource();
			doReturn(enumerablePropertySourceMock, enumerablePropertySourceMock2).when(target).getPropertySource();
			String[] stringArray = new String[] {};
			doReturn(stringArray).when(enumerablePropertySourceMock2).getPropertyNames();
			//Act Statement(s)
			Iterator<ConfigurationPropertyName> result = target.iterator();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(mapSourceMock, times(2)).getSource();
				verify(mapSourceMock, atLeast(1)).getName();
				verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
				verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
				verify(target, times(2)).getPropertySource();
				verify(enumerablePropertySourceMock, atLeast(1)).getName();
				verify(enumerablePropertySourceMock, atLeast(1)).getSource();
				verify(enumerablePropertySourceMock2, atLeast(1)).getPropertyNames();
			});
		}
	}

	//Sapient generated method id: ${29532aaf-aa83-3bbc-bab1-a7aa401044f9}, hash: 65CE940880A722B8EEF939260DEF4633
	@Disabled()
	@Test()
	void iteratorWhenConfigurationPropertyNamesIsNull() {
		/* Branches:
		 * (source instanceof OriginLookup) : false  #  inside isImmutablePropertySource method
		 * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(source.getName())) : true  #  inside isImmutablePropertySource method
		 * (source.getSource() == System.getenv()) : true  #  inside isImmutablePropertySource method
		 * (!isImmutablePropertySource()) : false  #  inside getConfigurationPropertyNames method
		 * (configurationPropertyNames == null) : true  #  inside getConfigurationPropertyNames method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Map<String, String> stringStringMap = new HashMap<>();
			doReturn(stringStringMap).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
			doReturn("systemEnvironment").when(enumerablePropertySourceMock).getName();
			Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("PATH", "/usr/bin:/bin:/usr/sbin:/sbin"), entry("__CFBundleIdentifier", "com.jetbrains.intellij.ce"), entry("SSH_AUTH_SOCK", "/private/tmp/com.apple.launchd.8tne8Tof25/Listeners"), entry("XPC_FLAGS", "0x0"), entry("SHELL", "/bin/zsh"), entry("__CF_USER_TEXT_ENCODING", "0x1F5:0x0:0x0"), entry("LOGNAME", "sushantkumarsinha"), entry("XPC_SERVICE_NAME", "application.com.jetbrains.intellij.ce.39697931.39698994"), entry("USER", "sushantkumarsinha"), entry("HOME", "/Users/sushantkumarsinha"), entry("TMPDIR", "/var/folders/0f/l7nrmq912pdd7mlfzlmfmdc40000gn/T/"), entry("COMMAND_MODE", "unix2003")));
			doReturn(stringStringMap2).when(enumerablePropertySourceMock).getSource();
			doReturn(enumerablePropertySourceMock, enumerablePropertySourceMock2).when(target).getPropertySource();
			String[] stringArray = new String[] {};
			doReturn(stringArray).when(enumerablePropertySourceMock2).getPropertyNames();
			//Act Statement(s)
			Iterator<ConfigurationPropertyName> result = target.iterator();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(mapSourceMock, times(2)).getSource();
				verify(mapSourceMock, atLeast(1)).getName();
				verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
				verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
				verify(target, times(2)).getPropertySource();
				verify(enumerablePropertySourceMock, atLeast(1)).getName();
				verify(enumerablePropertySourceMock, atLeast(1)).getSource();
				verify(enumerablePropertySourceMock2, atLeast(1)).getPropertyNames();
			});
		}
	}

	//Sapient generated method id: ${182a0c69-945f-3716-a1d7-c802b7e83095}, hash: FB619EE0053F0351588FA1122F93C0F3
	@Disabled()
	@Test()
	void containsDescendantOfWhenThisAncestorOfCheckEqualsPropertyMapperDEFAULT_ANCESTOR_OF_CHECK() {
		/* Branches:
		 * (underlyingSource instanceof Random) : false  #  inside containsDescendantOf method
		 * (underlyingSource instanceof PropertySource<?> underlyingPropertySource) : false  #  inside containsDescendantOf method
		 * (result != ConfigurationPropertyState.UNKNOWN) : false
		 * (this.ancestorOfCheck == PropertyMapper.DEFAULT_ANCESTOR_OF_CHECK) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type SpringIterableConfigurationPropertySource.Mappings
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Map<String, String> stringStringMap = new HashMap<>();
			doReturn(stringStringMap).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray);
			//Act Statement(s)
			ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.PRESENT));
				verify(mapSourceMock, times(3)).getSource();
				verify(mapSourceMock, atLeast(1)).getName();
				verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
				verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${04a7e493-84fd-3b5a-b0f4-78402cbdf3a6}, hash: 3010C9B9428927BCC3DF1930219D04C2
	@Disabled()
	@Test()
	void containsDescendantOfWhenCandidatesIsEmpty() {
		/* Branches:
		 * (underlyingSource instanceof Random) : false  #  inside containsDescendantOf method
		 * (underlyingSource instanceof PropertySource<?> underlyingPropertySource) : false  #  inside containsDescendantOf method
		 * (result != ConfigurationPropertyState.UNKNOWN) : false
		 * (this.ancestorOfCheck == PropertyMapper.DEFAULT_ANCESTOR_OF_CHECK) : false
		 * (source instanceof OriginLookup) : false  #  inside isImmutablePropertySource method
		 * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(source.getName())) : false  #  inside isImmutablePropertySource method
		 * (!isImmutablePropertySource()) : true  #  inside getConfigurationPropertyNames method
		 * (for-each(candidates)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Map<String, String> stringStringMap = new HashMap<>();
			doReturn(stringStringMap).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
			doReturn("A").when(enumerablePropertySourceMock).getName();
			doReturn(enumerablePropertySourceMock, enumerablePropertySourceMock2).when(target).getPropertySource();
			String[] stringArray = new String[] {};
			doReturn(stringArray).when(enumerablePropertySourceMock2).getPropertyNames();
			//Act Statement(s)
			ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.ABSENT));
				verify(mapSourceMock, times(3)).getSource();
				verify(mapSourceMock, atLeast(1)).getName();
				verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
				verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
				verify(target, times(2)).getPropertySource();
				verify(enumerablePropertySourceMock, atLeast(1)).getName();
				verify(enumerablePropertySourceMock2, atLeast(1)).getPropertyNames();
			});
		}
	}

	//Sapient generated method id: ${79f37c4e-7f19-31d8-9bf6-e72a79eac3ec}, hash: E565E7D56E768F8158F8AF1AD151C7A1
	@Disabled()
	@Test()
	void containsDescendantOfWhenIsImmutablePropertySourceNotAndCandidatesIsEmpty() {
		/* Branches:
		 * (underlyingSource instanceof Random) : false  #  inside containsDescendantOf method
		 * (underlyingSource instanceof PropertySource<?> underlyingPropertySource) : false  #  inside containsDescendantOf method
		 * (result != ConfigurationPropertyState.UNKNOWN) : false
		 * (this.ancestorOfCheck == PropertyMapper.DEFAULT_ANCESTOR_OF_CHECK) : false
		 * (source instanceof OriginLookup) : false  #  inside isImmutablePropertySource method
		 * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(source.getName())) : true  #  inside isImmutablePropertySource method
		 * (source.getSource() == System.getenv()) : false  #  inside isImmutablePropertySource method
		 * (!isImmutablePropertySource()) : true  #  inside getConfigurationPropertyNames method
		 * (for-each(candidates)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Map<String, String> stringStringMap = new HashMap<>();
			doReturn(stringStringMap).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
			doReturn("systemEnvironment").when(enumerablePropertySourceMock).getName();
			Object object = new Object();
			doReturn(object).when(enumerablePropertySourceMock).getSource();
			doReturn(enumerablePropertySourceMock, enumerablePropertySourceMock2).when(target).getPropertySource();
			String[] stringArray = new String[] {};
			doReturn(stringArray).when(enumerablePropertySourceMock2).getPropertyNames();
			//Act Statement(s)
			ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.ABSENT));
				verify(mapSourceMock, times(3)).getSource();
				verify(mapSourceMock, atLeast(1)).getName();
				verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
				verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
				verify(target, times(2)).getPropertySource();
				verify(enumerablePropertySourceMock, atLeast(1)).getName();
				verify(enumerablePropertySourceMock, atLeast(1)).getSource();
				verify(enumerablePropertySourceMock2, atLeast(1)).getPropertyNames();
			});
		}
	}

	//Sapient generated method id: ${9fb0ca08-ed2e-31c2-a1d9-0392e69db412}, hash: F1FBC86123AD2896D674666AE93B021D
	@Disabled()
	@Test()
	void containsDescendantOfWhenThisAncestorOfCheckTestNameCandidate() {
		/* Branches:
		 * (underlyingSource instanceof Random) : false  #  inside containsDescendantOf method
		 * (underlyingSource instanceof PropertySource<?> underlyingPropertySource) : false  #  inside containsDescendantOf method
		 * (result != ConfigurationPropertyState.UNKNOWN) : false
		 * (this.ancestorOfCheck == PropertyMapper.DEFAULT_ANCESTOR_OF_CHECK) : false
		 * (source instanceof OriginLookup) : false  #  inside isImmutablePropertySource method
		 * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(source.getName())) : true  #  inside isImmutablePropertySource method
		 * (source.getSource() == System.getenv()) : true  #  inside isImmutablePropertySource method
		 * (!isImmutablePropertySource()) : false  #  inside getConfigurationPropertyNames method
		 * (configurationPropertyNames == null) : true  #  inside getConfigurationPropertyNames method
		 * (for-each(candidates)) : true
		 * (candidate != null) : true
		 * (this.ancestorOfCheck.test(name, candidate)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Map<String, String> stringStringMap = new HashMap<>();
			doReturn(stringStringMap).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
			doReturn("systemEnvironment").when(enumerablePropertySourceMock).getName();
			Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("PATH", "/usr/bin:/bin:/usr/sbin:/sbin"), entry("__CFBundleIdentifier", "com.jetbrains.intellij.ce"), entry("SSH_AUTH_SOCK", "/private/tmp/com.apple.launchd.8tne8Tof25/Listeners"), entry("XPC_FLAGS", "0x0"), entry("SHELL", "/bin/zsh"), entry("__CF_USER_TEXT_ENCODING", "0x1F5:0x0:0x0"), entry("LOGNAME", "sushantkumarsinha"), entry("XPC_SERVICE_NAME", "application.com.jetbrains.intellij.ce.39697931.39698994"), entry("USER", "sushantkumarsinha"), entry("HOME", "/Users/sushantkumarsinha"), entry("TMPDIR", "/var/folders/0f/l7nrmq912pdd7mlfzlmfmdc40000gn/T/"), entry("COMMAND_MODE", "unix2003")));
			doReturn(stringStringMap2).when(enumerablePropertySourceMock).getSource();
			doReturn(enumerablePropertySourceMock, enumerablePropertySourceMock2).when(target).getPropertySource();
			String[] stringArray = new String[] {};
			doReturn(stringArray).when(enumerablePropertySourceMock2).getPropertyNames();
			//Act Statement(s)
			ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.PRESENT));
				verify(mapSourceMock, times(3)).getSource();
				verify(mapSourceMock, atLeast(1)).getName();
				verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
				verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
				verify(target, times(2)).getPropertySource();
				verify(enumerablePropertySourceMock, atLeast(1)).getName();
				verify(enumerablePropertySourceMock, atLeast(1)).getSource();
				verify(enumerablePropertySourceMock2, atLeast(1)).getPropertyNames();
			});
		}
	}

	//Sapient generated method id: ${4739748f-ab7f-3670-b7b9-3d8a3e4f2a31}, hash: 3EB173ACA739E531DAFA1CC69A1493D2
	@Disabled()
	@Test()
	void containsDescendantOfWhenThisAncestorOfCheckNotTestNameCandidate() {
		/* Branches:
		 * (underlyingSource instanceof Random) : false  #  inside containsDescendantOf method
		 * (underlyingSource instanceof PropertySource<?> underlyingPropertySource) : false  #  inside containsDescendantOf method
		 * (result != ConfigurationPropertyState.UNKNOWN) : false
		 * (this.ancestorOfCheck == PropertyMapper.DEFAULT_ANCESTOR_OF_CHECK) : false
		 * (source instanceof OriginLookup) : false  #  inside isImmutablePropertySource method
		 * (StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME.equals(source.getName())) : true  #  inside isImmutablePropertySource method
		 * (source.getSource() == System.getenv()) : true  #  inside isImmutablePropertySource method
		 * (!isImmutablePropertySource()) : false  #  inside getConfigurationPropertyNames method
		 * (configurationPropertyNames == null) : true  #  inside getConfigurationPropertyNames method
		 * (for-each(candidates)) : true
		 * (candidate != null) : true
		 * (this.ancestorOfCheck.test(name, candidate)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Map<String, String> stringStringMap = new HashMap<>();
			doReturn(stringStringMap).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = spy(new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray));
			doReturn("systemEnvironment").when(enumerablePropertySourceMock).getName();
			Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("PATH", "/usr/bin:/bin:/usr/sbin:/sbin"), entry("__CFBundleIdentifier", "com.jetbrains.intellij.ce"), entry("SSH_AUTH_SOCK", "/private/tmp/com.apple.launchd.8tne8Tof25/Listeners"), entry("XPC_FLAGS", "0x0"), entry("SHELL", "/bin/zsh"), entry("__CF_USER_TEXT_ENCODING", "0x1F5:0x0:0x0"), entry("LOGNAME", "sushantkumarsinha"), entry("XPC_SERVICE_NAME", "application.com.jetbrains.intellij.ce.39697931.39698994"), entry("USER", "sushantkumarsinha"), entry("HOME", "/Users/sushantkumarsinha"), entry("TMPDIR", "/var/folders/0f/l7nrmq912pdd7mlfzlmfmdc40000gn/T/"), entry("COMMAND_MODE", "unix2003")));
			doReturn(stringStringMap2).when(enumerablePropertySourceMock).getSource();
			doReturn(enumerablePropertySourceMock, enumerablePropertySourceMock2).when(target).getPropertySource();
			String[] stringArray = new String[] {};
			doReturn(stringArray).when(enumerablePropertySourceMock2).getPropertyNames();
			//Act Statement(s)
			ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.ABSENT));
				verify(mapSourceMock, times(3)).getSource();
				verify(mapSourceMock, atLeast(1)).getName();
				verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
				verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
				verify(target, times(2)).getPropertySource();
				verify(enumerablePropertySourceMock, atLeast(1)).getName();
				verify(enumerablePropertySourceMock, atLeast(1)).getSource();
				verify(enumerablePropertySourceMock2, atLeast(1)).getPropertyNames();
			});
		}
	}

	//Sapient generated method id: ${cbdd9389-5eb8-3391-bbcd-f3454860f4c7}, hash: 3B53EB451E993BF5F2EDC45B50E78F4E
	@Test()
	void getPropertySource1Test() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Map<String, String> stringStringMap = new HashMap<>();
			doReturn(stringStringMap).when(mapSourceMock).getSource();
			doReturn("systemEnvironment").when(mapSourceMock).getName();
			doReturn(biPredicateMock).when(propertyMapperMock).getAncestorOfCheck();
			doReturn(biPredicateMock2).when(propertyMapperMock2).getAncestorOfCheck();
			_assert.when(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper[] propertyMapperArray = new PropertyMapper[] { propertyMapperMock, propertyMapperMock2 };
			SpringIterableConfigurationPropertySource target = new SpringIterableConfigurationPropertySource(mapSourceMock, propertyMapperArray);
			//Act Statement(s)
			EnumerablePropertySource<?> result = target.getPropertySource();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(mapSourceMock));
				verify(mapSourceMock, atLeast(2)).getSource();
				verify(mapSourceMock, atLeast(1)).getName();
				verify(propertyMapperMock, atLeast(1)).getAncestorOfCheck();
				verify(propertyMapperMock2, atLeast(1)).getAncestorOfCheck();
				_assert.verify(() -> Assert.notNull(mapSourceMock, "PropertySource must not be null"), atLeast(1));
			});
		}
	}
}
