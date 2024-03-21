package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.env.ConfigurableEnvironment;

import org.mockito.stubbing.Answer;

import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.springframework.util.Assert;
import org.springframework.core.env.ConfigurablePropertyResolver;

import org.mockito.MockedStatic;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertySourcesSapientGeneratedTest {

	private final ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);

	private final ConfigurationPropertySourcesPropertySource configurationPropertySourcesPropertySourceMock = mock(ConfigurationPropertySourcesPropertySource.class);

	private final Iterable iterableMock = mock(Iterable.class);

	private final MutablePropertySources mutablePropertySourcesMock = mock(MutablePropertySources.class);

	private final PropertySource propertySourceMock = mock(PropertySource.class);

	private final SpringConfigurationPropertySources springConfigurationPropertySourcesMock = mock(SpringConfigurationPropertySources.class);

	//Sapient generated method id: ${cd721531-c35e-340b-93ef-a0cc3cccaba6}, hash: 3A2487B271B70FECA40499F822E26DE9
	@Test()
	void createPropertyResolverTest() {

		//Act Statement(s)
		ConfigurablePropertyResolver result = ConfigurationPropertySources.createPropertyResolver(mutablePropertySourcesMock);

		//Assert statement(s)
		//TODO: Please implement equals method in ConfigurationPropertySourcesPropertyResolver for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${deb7e9b2-51d7-36b8-a46a-c1ea4e7142e9}, hash: BDC7CCA8DDCAE40C8D8B6E7EB07317EB
	@Test()
	void isAttachedConfigurationPropertySourceWhenATTACHED_PROPERTY_SOURCE_NAMEEqualsPropertySourceGetName() {
		/* Branches:
		 * (ATTACHED_PROPERTY_SOURCE_NAME.equals(propertySource.getName())) : true
		 */
		//Arrange Statement(s)
		PropertySource propertySource = PropertySource.named("configurationProperties");

		//Act Statement(s)
		boolean result = ConfigurationPropertySources.isAttachedConfigurationPropertySource(propertySource);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${4501669b-f593-372b-9097-ee9ea3de7829}, hash: 7ADAB2360E6B16473941ACEB1D462FC6
	@Test()
	void isAttachedConfigurationPropertySourceWhenATTACHED_PROPERTY_SOURCE_NAMENotEqualsPropertySourceGetName() {
		/* Branches:
		 * (ATTACHED_PROPERTY_SOURCE_NAME.equals(propertySource.getName())) : false
		 */
		//Arrange Statement(s)
		PropertySource propertySource = PropertySource.named("A");

		//Act Statement(s)
		boolean result = ConfigurationPropertySources.isAttachedConfigurationPropertySource(propertySource);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${d3ab6577-0e08-3133-b7b8-fd7226d48345}, hash: CAD3A01C2B1B08568516C10967D88846
	@Test()
	void attachWhenIsUsingSourcesAttachedSources() {
		/* Branches:
		 * (attached == null) : false
		 * (attached instanceof ConfigurationPropertySourcesPropertySource) : true  #  inside isUsingSources method
		 * (((SpringConfigurationPropertySources) attached.getSource()).isUsingSources(sources)) : true  #  inside isUsingSources method
		 * (!isUsingSources(attached, sources)) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(mutablePropertySourcesMock).when(configurableEnvironmentMock).getPropertySources();
			doReturn(propertySourceMock).when(mutablePropertySourcesMock).remove("configurationProperties");
			doNothing().when(mutablePropertySourcesMock).addFirst(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(true).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			_assert.when(() -> Assert.isInstanceOf(ConfigurableEnvironment.class, configurableEnvironmentMock)).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			//Act Statement(s)
			ConfigurationPropertySources.attach(configurableEnvironmentMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(configurableEnvironmentMock, atLeast(1)).getPropertySources();
				verify(mutablePropertySourcesMock, atLeast(1)).remove("configurationProperties");
				verify(mutablePropertySourcesMock, atLeast(1)).addFirst(configurationPropertySourcesPropertySourceMock);
				verify(configurationPropertySourcesPropertySourceMock, atLeast(1)).getSource();
				verify(springConfigurationPropertySourcesMock, atLeast(1)).isUsingSources(mutablePropertySourcesMock);
				_assert.verify(() -> Assert.isInstanceOf(ConfigurableEnvironment.class, configurableEnvironmentMock), atLeast(1));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${8ca6ff15-4e18-3bbd-a3bc-7521e6d8bfe0}, hash: D9E9F3D6FF952BFA46A2AE751AB606F3
	@Test()
	void attachWhenAttachedGetSourceNotIsUsingSourcesSourcesAndIsUsingSourcesNotAttachedSources() {
		/* Branches:
		 * (attached == null) : false
		 * (attached instanceof ConfigurationPropertySourcesPropertySource) : true  #  inside isUsingSources method
		 * (((SpringConfigurationPropertySources) attached.getSource()).isUsingSources(sources)) : false  #  inside isUsingSources method
		 * (!isUsingSources(attached, sources)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(mutablePropertySourcesMock).when(configurableEnvironmentMock).getPropertySources();
			doReturn(propertySourceMock).when(mutablePropertySourcesMock).remove("configurationProperties");
			doNothing().when(mutablePropertySourcesMock).addFirst((PropertySource) any());
			_assert.when(() -> Assert.isInstanceOf(ConfigurableEnvironment.class, configurableEnvironmentMock)).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertySources.when(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock)).thenReturn(configurationPropertySourcesPropertySourceMock);
			doReturn(springConfigurationPropertySourcesMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			doReturn(false).when(springConfigurationPropertySourcesMock).isUsingSources(mutablePropertySourcesMock);
			//Act Statement(s)
			ConfigurationPropertySources.attach(configurableEnvironmentMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(configurableEnvironmentMock, atLeast(1)).getPropertySources();
				verify(mutablePropertySourcesMock, atLeast(1)).remove("configurationProperties");
				verify(mutablePropertySourcesMock, atLeast(1)).addFirst((PropertySource) any());
				_assert.verify(() -> Assert.isInstanceOf(ConfigurableEnvironment.class, configurableEnvironmentMock), atLeast(1));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.getAttached(mutablePropertySourcesMock), atLeast(1));
				verify(configurationPropertySourcesPropertySourceMock, atLeast(1)).getSource();
				verify(springConfigurationPropertySourcesMock, atLeast(1)).isUsingSources(mutablePropertySourcesMock);
			});
		}
	}

	//Sapient generated method id: ${b5c283f5-2eb0-3ec9-9787-8b67a1543576}, hash: A378D21AA4310EDCFF4274482491D7CA
	@Test()
	void getAttachedWhenSourcesIsNotNull() {
		/* Branches:
		 * (sources != null) : true
		 */
		//Arrange Statement(s)
		MutablePropertySources sourcesMock = mock(MutablePropertySources.class);
		doReturn(propertySourceMock).when(sourcesMock).get("configurationProperties");

		//Act Statement(s)
		PropertySource<?> result = ConfigurationPropertySources.getAttached(sourcesMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(propertySourceMock));
			verify(sourcesMock).get("configurationProperties");
		});
	}

	//Sapient generated method id: ${e17be36d-a537-33bc-8b9d-25e04610ea47}, hash: 8D0DAC11BCCB31D8919BFF5D502CC8F3
	@Test()
	void getAttachedWhenSourcesIsNull() {
		/* Branches:
		 * (sources != null) : false
		 */
		//Arrange Statement(s)
		MutablePropertySources mutablePropertySources = null;

		//Act Statement(s)
		PropertySource<?> result = ConfigurationPropertySources.getAttached(mutablePropertySources);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${a610375f-03b0-3911-b8e6-2e398a6d5879}, hash: F15C702EF934E8582767830B45312BFA
	@Test()
	void getWhenAttachedIsNull() {
		/* Branches:
		 * (attached == null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertySources> configurationPropertySources = mockStatic(ConfigurationPropertySources.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(mutablePropertySourcesMock).when(configurableEnvironmentMock).getPropertySources();
			doReturn(null).when(mutablePropertySourcesMock).get("configurationProperties");
			_assert.when(() -> Assert.isInstanceOf(ConfigurableEnvironment.class, configurableEnvironmentMock)).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertySources.when(() -> ConfigurationPropertySources.from(mutablePropertySourcesMock)).thenReturn(iterableMock);
			//Act Statement(s)
			Iterable<ConfigurationPropertySource> result = ConfigurationPropertySources.get(configurableEnvironmentMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(iterableMock));
				verify(configurableEnvironmentMock, atLeast(1)).getPropertySources();
				verify(mutablePropertySourcesMock, atLeast(1)).get("configurationProperties");
				_assert.verify(() -> Assert.isInstanceOf(ConfigurableEnvironment.class, configurableEnvironmentMock), atLeast(1));
				configurationPropertySources.verify(() -> ConfigurationPropertySources.from(mutablePropertySourcesMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${5bf81d9e-fba5-3b14-b80a-1e242c0b880a}, hash: 664928EAE440E402B157C232C4AF2786
	@Test()
	void getWhenAttachedIsNotNull() {
		/* Branches:
		 * (attached == null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(mutablePropertySourcesMock).when(configurableEnvironmentMock).getPropertySources();
			doReturn(configurationPropertySourcesPropertySourceMock).when(mutablePropertySourcesMock).get("configurationProperties");
			doReturn(iterableMock).when(configurationPropertySourcesPropertySourceMock).getSource();
			_assert.when(() -> Assert.isInstanceOf(ConfigurableEnvironment.class, configurableEnvironmentMock)).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			Iterable<ConfigurationPropertySource> result = ConfigurationPropertySources.get(configurableEnvironmentMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(iterableMock));
				verify(configurableEnvironmentMock).getPropertySources();
				verify(mutablePropertySourcesMock).get("configurationProperties");
				verify(configurationPropertySourcesPropertySourceMock).getSource();
				_assert.verify(() -> Assert.isInstanceOf(ConfigurableEnvironment.class, configurableEnvironmentMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${75b57cb1-444a-3fb9-bd56-a8c3b1a5a77c}, hash: 4F1B7FE646DC8CC489AC395780475F06
	@Test()
	void fromTest() {
		//Arrange Statement(s)
		ConfigurationPropertySource configurationPropertySourceMock = mock(ConfigurationPropertySource.class);
		try (MockedStatic<ConfigurationPropertySource> configurationPropertySource = mockStatic(ConfigurationPropertySource.class)) {
			configurationPropertySource.when(() -> ConfigurationPropertySource.from(propertySourceMock)).thenReturn(configurationPropertySourceMock);
			//Act Statement(s)
			Iterable<ConfigurationPropertySource> result = ConfigurationPropertySources.from(propertySourceMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				configurationPropertySource.verify(() -> ConfigurationPropertySource.from(propertySourceMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4d14331c-3461-34d2-9c31-3612d7b953ef}, hash: E29F81263336155447089005286E42AC
	@Test()
	void from1Test() {

		//Act Statement(s)
		Iterable<ConfigurationPropertySource> result = ConfigurationPropertySources.from(iterableMock);

		//Assert statement(s)
		//TODO: Please implement equals method in SpringConfigurationPropertySources for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
