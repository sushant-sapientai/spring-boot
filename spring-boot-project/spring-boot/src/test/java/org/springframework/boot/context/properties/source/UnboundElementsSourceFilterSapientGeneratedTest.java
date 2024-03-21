package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.env.PropertySource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UnboundElementsSourceFilterSapientGeneratedTest {

	private final ConfigurationPropertySource configurationPropertySourceMock = mock(ConfigurationPropertySource.class);

	//Sapient generated method id: ${5f3aefae-6212-3c03-9286-f562997697c1}, hash: 52B05A5B5F6D109AFF9D0E078A87E6F5
	@Test()
	void applyWhenUnderlyingSourceNotInstanceOfPropertySource() {
		/* Branches:
		 * (underlyingSource instanceof PropertySource) : false
		 */
		//Arrange Statement(s)
		Object object = new Object();
		doReturn(object).when(configurationPropertySourceMock).getUnderlyingSource();
		UnboundElementsSourceFilter target = new UnboundElementsSourceFilter();

		//Act Statement(s)
		Boolean result = target.apply(configurationPropertySourceMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.TRUE));
			verify(configurationPropertySourceMock).getUnderlyingSource();
		});
	}

	//Sapient generated method id: ${0000fa7d-6b33-3661-a73a-b594448e0a97}, hash: 85027818AC4341266EE44A5806E5F379
	@Test()
	void applyWhenBENIGN_PROPERTY_SOURCE_NAMESNotContainsName() {
		/* Branches:
		 * (underlyingSource instanceof PropertySource) : true
		 * (!BENIGN_PROPERTY_SOURCE_NAMES.contains(name)) : true
		 */
		//Arrange Statement(s)
		PropertySource propertySource = PropertySource.named("name1");
		doReturn(propertySource).when(configurationPropertySourceMock).getUnderlyingSource();
		UnboundElementsSourceFilter target = new UnboundElementsSourceFilter();

		//Act Statement(s)
		Boolean result = target.apply(configurationPropertySourceMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.TRUE));
			verify(configurationPropertySourceMock).getUnderlyingSource();
		});
	}
}
