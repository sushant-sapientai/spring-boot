package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import java.util.Collection;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import org.springframework.core.env.PropertySource;
import org.springframework.util.Assert;

import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigDataSapientGeneratedTest {

	private final ConfigData.PropertySourceOptions propertySourceOptionsMock = mock(ConfigData.PropertySourceOptions.class, "propertySourceOptions");

	private final PropertySource propertySourceMock = mock(PropertySource.class);

	//Sapient generated method id: ${35c45523-e5c7-34f7-8d6d-4e96598349f7}, hash: 281D1FBEFBD64E30BBFEE413E2C82DC1
	@Disabled()
	@Test()
	void getOptionsWhenOptionsIsNotNull() {
		/* Branches:
		 * (options != null) : true
		 */
		//Arrange Statement(s)
		ConfigData.Options configDataOptionsMock = mock(ConfigData.Options.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(anyCollection(), eq("PropertySources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(propertySourceOptionsMock, "PropertySourceOptions must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Collection<PropertySource<?>> collection = new ArrayList<>();
			ConfigData target = new ConfigData(collection, propertySourceOptionsMock);
			doReturn(configDataOptionsMock).when(propertySourceOptionsMock).get(propertySourceMock);
			//Act Statement(s)
			ConfigData.Options result = target.getOptions(propertySourceMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configDataOptionsMock));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("PropertySources must not be null")));
				_assert.verify(() -> Assert.notNull(propertySourceOptionsMock, "PropertySourceOptions must not be null"), atLeast(1));
				verify(propertySourceOptionsMock).get(propertySourceMock);
			});
		}
	}

	//Sapient generated method id: ${50b37f37-bd4b-33ea-95ca-e144f7ee5a35}, hash: DF47574DDE9EBEB34333451BCC6A4550
	@Test()
	void getOptionsWhenOptionsIsNull() {
		/* Branches:
		 * (options != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(anyCollection(), eq("PropertySources must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(propertySourceOptionsMock, "PropertySourceOptions must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Collection<PropertySource<?>> collection = new ArrayList<>();
			ConfigData target = new ConfigData(collection, propertySourceOptionsMock);
			doReturn(null).when(propertySourceOptionsMock).get(propertySourceMock);
			//Act Statement(s)
			ConfigData.Options result = target.getOptions(propertySourceMock);
			ConfigData.Options options = ConfigData.Options.NONE;
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(options));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("PropertySources must not be null")));
				_assert.verify(() -> Assert.notNull(propertySourceOptionsMock, "PropertySourceOptions must not be null"), atLeast(1));
				verify(propertySourceOptionsMock).get(propertySourceMock);
			});
		}
	}
}
