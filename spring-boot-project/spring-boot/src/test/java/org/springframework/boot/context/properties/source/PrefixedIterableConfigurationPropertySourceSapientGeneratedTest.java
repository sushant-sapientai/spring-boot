package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import java.util.stream.Stream;

import org.springframework.util.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PrefixedIterableConfigurationPropertySourceSapientGeneratedTest {

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final IterableConfigurationPropertySource iterableConfigurationPropertySourceMock = mock(IterableConfigurationPropertySource.class);

	//Sapient generated method id: ${b4af2388-e781-3800-820a-b8ede09bd914}, hash: 3854EF1666714CEE2DBCA3A46B722333
	@Test()
	void streamTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		IterableConfigurationPropertySource iterableConfigurationPropertySourceMock2 = mock(IterableConfigurationPropertySource.class);
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(iterableConfigurationPropertySourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.hasText("A", "Prefix must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("A")).thenReturn(configurationPropertyNameMock);
			PrefixedIterableConfigurationPropertySource target = spy(new PrefixedIterableConfigurationPropertySource(iterableConfigurationPropertySourceMock, "A"));
			doReturn(iterableConfigurationPropertySourceMock2).when(target).getSource();
			Stream stream = Stream.empty();
			doReturn(stream).when(iterableConfigurationPropertySourceMock2).stream();
			//Act Statement(s)
			Stream<ConfigurationPropertyName> result = target.stream();
			//Assert statement(s)
			//TODO: Please implement equals method in Stream for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(iterableConfigurationPropertySourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.hasText("A", "Prefix must not be empty"), atLeast(1));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("A"), atLeast(1));
				verify(target).getSource();
				verify(iterableConfigurationPropertySourceMock2).stream();
			});
		}
	}

	//Sapient generated method id: ${bfcb6725-5fb8-3080-8655-dc87e9921af1}, hash: 75BCC953BE06E3C7A8E3CFEFF9722FF7
	@Test()
	void getSource1Test() {
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(iterableConfigurationPropertySourceMock, "Source must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.hasText("A", "Prefix must not be empty")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("A")).thenReturn(configurationPropertyNameMock);
			PrefixedIterableConfigurationPropertySource target = new PrefixedIterableConfigurationPropertySource(iterableConfigurationPropertySourceMock, "A");
			//Act Statement(s)
			IterableConfigurationPropertySource result = target.getSource();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(iterableConfigurationPropertySourceMock));
				_assert.verify(() -> Assert.notNull(iterableConfigurationPropertySourceMock, "Source must not be null"), atLeast(1));
				_assert.verify(() -> Assert.hasText("A", "Prefix must not be empty"), atLeast(1));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("A"), atLeast(1));
			});
		}
	}
}
