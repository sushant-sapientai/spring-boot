package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import org.springframework.util.Assert;

import java.util.function.Predicate;

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

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FilteredConfigurationPropertiesSourceSapientGeneratedTest {

	private final ConfigurationPropertySource sourceMock = mock(ConfigurationPropertySource.class, "<init>_configurationPropertySource1");

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final Predicate predicateMock = mock(Predicate.class);

	//Sapient generated method id: ${83cc193e-c3fe-3d15-89d9-324b130ff7fa}, hash: 2F66B48978243BCD526772A605F175EE
	@Disabled()
	@Test()
	void getConfigurationPropertyWhenFiltered() {
		/* Branches:
		 * (filtered) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationProperty configurationPropertyMock = mock(ConfigurationProperty.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(configurationPropertyMock).when(sourceMock).getConfigurationProperty(configurationPropertyNameMock);
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(predicateMock, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			FilteredConfigurationPropertiesSource target = new FilteredConfigurationPropertiesSource(sourceMock, predicateMock);
			//Act Statement(s)
			ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyMock));
				verify(sourceMock).getConfigurationProperty(configurationPropertyNameMock);
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(predicateMock, "Filter must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${17249c2a-2677-3381-9b43-5c4eb5883a4b}, hash: A7D4AFF2683CE66C6B8B62D820B5E2CC
	@Test()
	void getConfigurationPropertyWhenNotFiltered() {
		/* Branches:
		 * (filtered) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(predicateMock, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			FilteredConfigurationPropertiesSource target = new FilteredConfigurationPropertiesSource(sourceMock, predicateMock);
			//Act Statement(s)
			ConfigurationProperty result = target.getConfigurationProperty(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(predicateMock, "Filter must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${ec954726-fd43-35a0-bfcb-1b9fb123582d}, hash: 8E32A1CCE1B2EFE90F65EF414A23E9F4
	@Test()
	void containsDescendantOfWhenResultEqualsConfigurationPropertyStatePRESENT() {
		/* Branches:
		 * (result == ConfigurationPropertyState.PRESENT) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(predicateMock, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			FilteredConfigurationPropertiesSource target = new FilteredConfigurationPropertiesSource(sourceMock, predicateMock);
			doReturn(ConfigurationPropertyState.PRESENT).when(sourceMock).containsDescendantOf(configurationPropertyNameMock);
			//Act Statement(s)
			ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.UNKNOWN));
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(predicateMock, "Filter must not be null"), atLeast(1));
				verify(sourceMock).containsDescendantOf(configurationPropertyNameMock);
			});
		}
	}

	//Sapient generated method id: ${037d2fc7-5bba-3d25-a42b-3c3834dbb372}, hash: 831CFAD019914964FB5F0CB424A82B1A
	@Test()
	void containsDescendantOfWhenResultNotEqualsConfigurationPropertyStatePRESENT() {
		/* Branches:
		 * (result == ConfigurationPropertyState.PRESENT) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(predicateMock, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			FilteredConfigurationPropertiesSource target = new FilteredConfigurationPropertiesSource(sourceMock, predicateMock);
			doReturn(ConfigurationPropertyState.ABSENT).when(sourceMock).containsDescendantOf(configurationPropertyNameMock);
			//Act Statement(s)
			ConfigurationPropertyState result = target.containsDescendantOf(configurationPropertyNameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(ConfigurationPropertyState.ABSENT));
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(predicateMock, "Filter must not be null"), atLeast(1));
				verify(sourceMock).containsDescendantOf(configurationPropertyNameMock);
			});
		}
	}

	//Sapient generated method id: ${72fc3519-47ef-3838-a2f1-90ba712b0e09}, hash: 171832E9162F50E36CDF137D7F376A0F
	@Test()
	void getUnderlyingSourceTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(predicateMock, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			FilteredConfigurationPropertiesSource target = new FilteredConfigurationPropertiesSource(sourceMock, predicateMock);
			Object object = new Object();
			doReturn(object).when(sourceMock).getUnderlyingSource();
			//Act Statement(s)
			Object result = target.getUnderlyingSource();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(object));
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(predicateMock, "Filter must not be null"), atLeast(1));
				verify(sourceMock).getUnderlyingSource();
			});
		}
	}

	//Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 5859B976EF81C8C16F190FFB5F434F1C
	@Test()
	void toStringTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(sourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(predicateMock, "Filter must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			FilteredConfigurationPropertiesSource target = new FilteredConfigurationPropertiesSource(sourceMock, predicateMock);
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("<init>_configurationPropertySource1 (filtered)"));
				_assert.verify(() -> Assert.notNull(sourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(predicateMock, "Filter must not be null"), atLeast(1));
			});
		}
	}
}
