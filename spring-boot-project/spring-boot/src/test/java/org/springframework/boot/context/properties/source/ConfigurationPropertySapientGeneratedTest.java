package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import org.springframework.boot.origin.Origin;

import org.mockito.MockedStatic;

import org.springframework.boot.origin.OriginTrackedValue;
import org.springframework.util.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertySapientGeneratedTest {

	private final ConfigurationPropertyName nameMock = mock(ConfigurationPropertyName.class, "name");

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final ConfigurationPropertySource configurationPropertySourceMock = mock(ConfigurationPropertySource.class);

	private final Origin originMock = mock(Origin.class);

	//Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 364154EEAABE8D86C73E0469D096C141
	@Disabled()
	@Test()
	void toStringTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ToStringCreator
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			_assert.when(() -> Assert.notNull(object, "Value must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationProperty target = new ConfigurationProperty(nameMock, object, originMock);
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("result1"));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(object, "Value must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${af5f6332-26a2-3749-8f9a-ac87ce6fe7cf}, hash: F3AF001AE4ABF57697F474338BA1DD46
	@Test()
	void compareToTest() {
		//Arrange Statement(s)
		Origin originMock2 = mock(Origin.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			_assert.when(() -> Assert.notNull(object, "Value must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationProperty target = new ConfigurationProperty(nameMock, object, originMock);
			doReturn(0).when(nameMock).compareTo(configurationPropertyNameMock);
			Object object2 = new Object();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, object2, originMock2);
			//Act Statement(s)
			int result = target.compareTo(configurationProperty);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(0));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(object, "Value must not be null"), atLeast(1));
				verify(nameMock).compareTo(configurationPropertyNameMock);
			});
		}
	}

	//Sapient generated method id: ${57d57d84-5000-3dae-b8ae-1c38bc642ec8}, hash: 95E3180A38A5F9423698CF8F03EA4DFE
	@Test()
	void ofWhenValueIsNull() {
		/* Branches:
		 * (value == null) : true
		 */
		//Arrange Statement(s)
		OriginTrackedValue originTrackedValue = null;
		//Act Statement(s)
		ConfigurationProperty result = ConfigurationProperty.of(configurationPropertyNameMock, originTrackedValue);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${5ddb9e9b-119c-3723-b99f-1c385f211650}, hash: 52B2D8D5918F77649276EA27AB753D84
	@Test()
	void ofWhenValueIsNotNull() {
		/* Branches:
		 * (value == null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			_assert.when(() -> Assert.notNull(object, "Value must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			OriginTrackedValue originTrackedValue = OriginTrackedValue.of(object, originMock);
			//Act Statement(s)
			ConfigurationProperty result = ConfigurationProperty.of(configurationPropertyNameMock, originTrackedValue);
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, object, originMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationProperty));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(object, "Value must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c4585d80-4f7e-33da-8df7-5ac9d20b2bd9}, hash: 40A67D25E0468D9724D8C59621CBFF96
	@Test()
	void of1WhenValueIsNull() {
		/* Branches:
		 * (value == null) : true
		 */
		//Arrange Statement(s)
		Object object = null;
		//Act Statement(s)
		ConfigurationProperty result = ConfigurationProperty.of(configurationPropertySourceMock, configurationPropertyNameMock, object, originMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${9ebb26ae-85fd-38c3-a6f9-2dd2158a80f3}, hash: F7C8D1CBB8A0CBDEAFF05B3917E0839A
	@Test()
	void of1WhenValueIsNotNull() {
		/* Branches:
		 * (value == null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			_assert.when(() -> Assert.notNull(object, "Value must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			ConfigurationProperty result = ConfigurationProperty.of(configurationPropertySourceMock, configurationPropertyNameMock, object, originMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(object, "Value must not be null"), atLeast(1));
			});
		}
	}
}
