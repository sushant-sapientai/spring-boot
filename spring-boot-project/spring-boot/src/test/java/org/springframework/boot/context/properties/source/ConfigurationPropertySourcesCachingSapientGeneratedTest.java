package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import org.mockito.MockedStatic;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertySourcesCachingSapientGeneratedTest {

	private final ConfigurationPropertyCaching configurationPropertyCachingMock = mock(ConfigurationPropertyCaching.class);

	private final ConfigurationPropertySource configurationPropertySourceMock = mock(ConfigurationPropertySource.class);

	private final Iterable iterableMock = mock(Iterable.class);

	//Sapient generated method id: ${cb96b1fd-4c54-332e-a77f-27ba1bdaf688}, hash: 8ECCC2F9F931B34D9B1F37FAFF6C5400
	@Disabled()
	@Test()
	void enableWhenCachingIsNotNull() {
		/* Branches:
		 * (this.sources != null) : true  #  inside forEach method
		 * (for-each(this.sources)) : true  #  inside forEach method
		 * (caching != null) : true  #  inside forEach method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CachingConfigurationPropertySource> cachingConfigurationPropertySource = mockStatic(CachingConfigurationPropertySource.class)) {
			cachingConfigurationPropertySource.when(() -> CachingConfigurationPropertySource.find(configurationPropertySourceMock)).thenReturn(configurationPropertyCachingMock);
			ConfigurationPropertySourcesCaching target = new ConfigurationPropertySourcesCaching(iterableMock);
			//Act Statement(s)
			target.enable();
			//Assert statement(s)
			assertAll("result", () -> cachingConfigurationPropertySource.verify(() -> CachingConfigurationPropertySource.find(configurationPropertySourceMock), atLeast(1)));
		}
	}

	//Sapient generated method id: ${b8533de4-b672-3d9c-95d3-41074b1432ac}, hash: E30C86E8CF7122239B4E830105663E8F
	@Disabled()
	@Test()
	void disableWhenCachingIsNotNull() {
		/* Branches:
		 * (this.sources != null) : true  #  inside forEach method
		 * (for-each(this.sources)) : true  #  inside forEach method
		 * (caching != null) : true  #  inside forEach method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CachingConfigurationPropertySource> cachingConfigurationPropertySource = mockStatic(CachingConfigurationPropertySource.class)) {
			cachingConfigurationPropertySource.when(() -> CachingConfigurationPropertySource.find(configurationPropertySourceMock)).thenReturn(configurationPropertyCachingMock);
			ConfigurationPropertySourcesCaching target = new ConfigurationPropertySourcesCaching(iterableMock);
			//Act Statement(s)
			target.disable();
			//Assert statement(s)
			assertAll("result", () -> cachingConfigurationPropertySource.verify(() -> CachingConfigurationPropertySource.find(configurationPropertySourceMock), atLeast(1)));
		}
	}

	//Sapient generated method id: ${8cb0e90a-05d6-3fb9-aa16-eb1e353994f7}, hash: 3E1D1F92958DB8AFED297EC61B360DF1
	@Disabled()
	@Test()
	void setTimeToLiveWhenCachingIsNotNull() {
		/* Branches:
		 * (this.sources != null) : true  #  inside forEach method
		 * (for-each(this.sources)) : true  #  inside forEach method
		 * (caching != null) : true  #  inside forEach method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CachingConfigurationPropertySource> cachingConfigurationPropertySource = mockStatic(CachingConfigurationPropertySource.class)) {
			cachingConfigurationPropertySource.when(() -> CachingConfigurationPropertySource.find(configurationPropertySourceMock)).thenReturn(configurationPropertyCachingMock);
			ConfigurationPropertySourcesCaching target = new ConfigurationPropertySourcesCaching(iterableMock);
			Duration duration = Duration.ofDays(0L);
			//Act Statement(s)
			target.setTimeToLive(duration);
			//Assert statement(s)
			assertAll("result", () -> cachingConfigurationPropertySource.verify(() -> CachingConfigurationPropertySource.find(configurationPropertySourceMock), atLeast(1)));
		}
	}

	//Sapient generated method id: ${94b1de9e-8161-348d-92ce-f93cee722361}, hash: 6F1BAB3153D4E9FA6DC986749ABB92FF
	@Disabled()
	@Test()
	void clearWhenCachingIsNotNull() {
		/* Branches:
		 * (this.sources != null) : true  #  inside forEach method
		 * (for-each(this.sources)) : true  #  inside forEach method
		 * (caching != null) : true  #  inside forEach method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CachingConfigurationPropertySource> cachingConfigurationPropertySource = mockStatic(CachingConfigurationPropertySource.class)) {
			cachingConfigurationPropertySource.when(() -> CachingConfigurationPropertySource.find(configurationPropertySourceMock)).thenReturn(configurationPropertyCachingMock);
			ConfigurationPropertySourcesCaching target = new ConfigurationPropertySourcesCaching(iterableMock);
			//Act Statement(s)
			target.clear();
			//Assert statement(s)
			assertAll("result", () -> cachingConfigurationPropertySource.verify(() -> CachingConfigurationPropertySource.find(configurationPropertySourceMock), atLeast(1)));
		}
	}
}
