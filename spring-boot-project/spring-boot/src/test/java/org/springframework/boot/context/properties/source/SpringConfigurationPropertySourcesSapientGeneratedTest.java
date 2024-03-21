package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import java.util.Iterator;

import org.springframework.util.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SpringConfigurationPropertySourcesSapientGeneratedTest {

	private final Iterable iterableMock = mock(Iterable.class);

	//Sapient generated method id: ${4f7f2e04-5085-3c77-9c5c-510e42b3bd0f}, hash: 2DF45E1C445DFF4206C1C199B065913E
	@Test()
	void isUsingSourcesWhenThisSourcesEqualsSources() {
		/* Branches:
		 * (this.sources == sources) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(iterableMock, "Sources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			SpringConfigurationPropertySources target = new SpringConfigurationPropertySources(iterableMock);
			//Act Statement(s)
			boolean result = target.isUsingSources(iterableMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull(iterableMock, "Sources must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${9cb242de-be1f-37eb-b291-8765c225da25}, hash: 92A559F7738058313AAD15C7F95D3DE5
	@Test()
	void isUsingSourcesWhenThisSourcesNotEqualsSources() {
		/* Branches:
		 * (this.sources == sources) : false
		 */
		//Arrange Statement(s)
		Iterable iterableMock2 = mock(Iterable.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(iterableMock, "Sources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			SpringConfigurationPropertySources target = new SpringConfigurationPropertySources(iterableMock);
			//Act Statement(s)
			boolean result = target.isUsingSources(iterableMock2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				_assert.verify(() -> Assert.notNull(iterableMock, "Sources must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${78c09fb6-edcf-3ce7-9932-6ef4ffc152b3}, hash: 9B0200ADCF9DF9CFD34A0452C8067FF6
	@Disabled()
	@Test()
	void iteratorTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(iterableMock, "Sources must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			SpringConfigurationPropertySources target = new SpringConfigurationPropertySources(iterableMock);
			//Act Statement(s)
			Iterator<ConfigurationPropertySource> result = target.iterator();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(iterableMock, "Sources must not be null"), atLeast(1));
			});
		}
	}
}
