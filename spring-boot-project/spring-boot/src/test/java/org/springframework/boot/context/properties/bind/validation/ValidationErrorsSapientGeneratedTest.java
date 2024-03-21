package org.springframework.boot.context.properties.bind.validation;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.mockito.stubbing.Answer;

import org.springframework.boot.origin.Origin;
import org.springframework.validation.FieldError;

import java.util.Iterator;
import java.util.Set;

import org.springframework.boot.context.properties.source.ConfigurationProperty;
import org.springframework.util.Assert;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import java.util.HashSet;

import org.mockito.MockedStatic;

import org.springframework.validation.ObjectError;

import java.util.ArrayList;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.anySet;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ValidationErrorsSapientGeneratedTest {

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final FieldError fieldErrorMock = mock(FieldError.class);

	private final ConfigurationPropertyName nameMock = mock(ConfigurationPropertyName.class);

	private final Origin origin2Mock = mock(Origin.class);

	private final Origin originMock = mock(Origin.class);

	//Sapient generated method id: ${cf442961-1f2d-3f7a-9584-5ca516d49e80}, hash: D99CCD817A90E1BB4AEC0BE43B145564
	@Test()
	void hasErrorsWhenThisErrorsNotIsEmpty() {
		/* Branches:
		 * (!this.errors.isEmpty()) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<OriginTrackedFieldError> originTrackedFieldError = mockStatic(OriginTrackedFieldError.class);
			 MockedStatic<Origin> origin = mockStatic(Origin.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(true).when(nameMock).isParentOf(configurationPropertyNameMock);
			doReturn("B").when(configurationPropertyNameMock).getLastElement(ConfigurationPropertyName.Form.UNIFORM);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(anySet(), eq("BoundProperties must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(anyList(), eq("Errors must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, object, origin2Mock);
			origin.when(() -> Origin.from(configurationProperty)).thenReturn(originMock);
			FieldError fieldError = new FieldError("objectName1", "B", "defaultMessage1");
			originTrackedFieldError.when(() -> OriginTrackedFieldError.of(fieldError, originMock)).thenReturn(fieldErrorMock);
			Set<ConfigurationProperty> configurationPropertySet = new HashSet<>();
			configurationPropertySet.add(configurationProperty);
			List<ObjectError> objectErrorList = new ArrayList<>();
			objectErrorList.add(fieldError);
			ValidationErrors target = new ValidationErrors(nameMock, configurationPropertySet, objectErrorList);
			//Act Statement(s)
			boolean result = target.hasErrors();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				verify(nameMock).isParentOf(configurationPropertyNameMock);
				verify(configurationPropertyNameMock).getLastElement(ConfigurationPropertyName.Form.UNIFORM);
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(anySet(), eq("BoundProperties must not be null")));
				_assert.verify(() -> Assert.notNull(anyList(), eq("Errors must not be null")));
				origin.verify(() -> Origin.from(configurationProperty), atLeast(1));
				originTrackedFieldError.verify(() -> OriginTrackedFieldError.of(fieldError, originMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${78c09fb6-edcf-3ce7-9932-6ef4ffc152b3}, hash: 4233B4A652DCF53F98769EFAA8F71180
	@Test()
	void iteratorTest() {
		//Arrange Statement(s)
		try (MockedStatic<OriginTrackedFieldError> originTrackedFieldError = mockStatic(OriginTrackedFieldError.class);
			 MockedStatic<Origin> origin = mockStatic(Origin.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(true).when(nameMock).isParentOf(configurationPropertyNameMock);
			doReturn("B").when(configurationPropertyNameMock).getLastElement(ConfigurationPropertyName.Form.UNIFORM);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(anySet(), eq("BoundProperties must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(anyList(), eq("Errors must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Object object = new Object();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, object, origin2Mock);
			origin.when(() -> Origin.from(configurationProperty)).thenReturn(originMock);
			FieldError fieldError = new FieldError("objectName1", "B", "defaultMessage1");
			originTrackedFieldError.when(() -> OriginTrackedFieldError.of(fieldError, originMock)).thenReturn(fieldErrorMock);
			Set<ConfigurationProperty> configurationPropertySet = new HashSet<>();
			configurationPropertySet.add(configurationProperty);
			List<ObjectError> objectErrorList = new ArrayList<>();
			objectErrorList.add(fieldError);
			ValidationErrors target = new ValidationErrors(nameMock, configurationPropertySet, objectErrorList);
			//Act Statement(s)
			Iterator<ObjectError> result = target.iterator();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(nameMock).isParentOf(configurationPropertyNameMock);
				verify(configurationPropertyNameMock).getLastElement(ConfigurationPropertyName.Form.UNIFORM);
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(anySet(), eq("BoundProperties must not be null")));
				_assert.verify(() -> Assert.notNull(anyList(), eq("Errors must not be null")));
				origin.verify(() -> Origin.from(configurationProperty), atLeast(1));
				originTrackedFieldError.verify(() -> OriginTrackedFieldError.of(fieldError, originMock), atLeast(1));
			});
		}
	}
}
