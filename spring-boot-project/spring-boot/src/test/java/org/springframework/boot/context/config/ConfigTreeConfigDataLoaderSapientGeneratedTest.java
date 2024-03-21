package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import java.nio.file.Path;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigTreeConfigDataLoaderSapientGeneratedTest {

	//Sapient generated method id: ${ff42effe-8e08-33e3-9690-b409079214e3}, hash: 39F7AA905245981DA3BF7E5899731424
	@Disabled()
	@Test()
	void loadTest() throws IOException, ConfigDataResourceNotFoundException {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigTreeConfigDataResource resourceMock = mock(ConfigTreeConfigDataResource.class);
		Path pathMock = mock(Path.class, "load_path1");
		ConfigDataLoaderContext configDataLoaderContextMock = mock(ConfigDataLoaderContext.class);
		try (MockedStatic<ConfigDataResourceNotFoundException> configDataResourceNotFoundException = mockStatic(ConfigDataResourceNotFoundException.class)) {
			doReturn(pathMock).when(resourceMock).getPath();
			configDataResourceNotFoundException.when(() -> ConfigDataResourceNotFoundException.throwIfDoesNotExist(resourceMock, pathMock)).thenAnswer((Answer<Void>) invocation -> null);
			ConfigTreeConfigDataLoader target = new ConfigTreeConfigDataLoader();
			//Act Statement(s)
			ConfigData result = target.load(configDataLoaderContextMock, resourceMock);
			//Assert statement(s)
			//TODO: Please implement equals method in ConfigData for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(resourceMock).getPath();
				configDataResourceNotFoundException.verify(() -> ConfigDataResourceNotFoundException.throwIfDoesNotExist(resourceMock, pathMock), atLeast(1));
			});
		}
	}
}
