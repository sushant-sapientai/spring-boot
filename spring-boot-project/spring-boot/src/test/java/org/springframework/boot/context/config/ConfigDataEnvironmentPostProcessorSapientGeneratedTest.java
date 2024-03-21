package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.ResourceLoader;

import org.mockito.stubbing.Answer;
import org.apache.commons.logging.impl.NoOpLog;

import java.util.Set;
import java.util.HashSet;

import org.springframework.boot.ConfigurableBootstrapContext;

import java.util.Collection;

import org.springframework.core.io.DefaultResourceLoader;

import org.mockito.MockedStatic;

import org.springframework.boot.logging.DeferredLogFactory;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigDataEnvironmentPostProcessorSapientGeneratedTest {

	private final ConfigDataEnvironment configDataEnvironmentMock = mock(ConfigDataEnvironment.class);

	private final ConfigDataEnvironmentUpdateListener configDataEnvironmentUpdateListenerMock = mock(ConfigDataEnvironmentUpdateListener.class);

	private final ConfigurableBootstrapContext configurableBootstrapContextMock = mock(ConfigurableBootstrapContext.class);

	private final ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);

	private final DeferredLogFactory logFactoryMock = mock(DeferredLogFactory.class);

	private final ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);

	//Sapient generated method id: ${2bf0d88c-87ae-32ff-8715-263d7bb08637}, hash: 88814EA35200E617795DA35CA86CCDD3
	@Test()
	void postProcessEnvironmentTest() {
		//Arrange Statement(s)
		SpringApplication applicationMock = mock(SpringApplication.class);
		doReturn(resourceLoaderMock).when(applicationMock).getResourceLoader();
		Set<String> stringSet = new HashSet<>();
		doReturn(stringSet).when(applicationMock).getAdditionalProfiles();
		NoOpLog noOpLog = new NoOpLog();
		doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataEnvironmentPostProcessor.class);
		ConfigDataEnvironmentPostProcessor target = spy(new ConfigDataEnvironmentPostProcessor(logFactoryMock, configurableBootstrapContextMock));
		doNothing().when(target).postProcessEnvironment(configurableEnvironmentMock, resourceLoaderMock, stringSet);
		//Act Statement(s)
		target.postProcessEnvironment(configurableEnvironmentMock, applicationMock);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(applicationMock).getResourceLoader();
			verify(applicationMock).getAdditionalProfiles();
			verify(logFactoryMock).getLog(ConfigDataEnvironmentPostProcessor.class);
			verify(target).postProcessEnvironment(configurableEnvironmentMock, resourceLoaderMock, stringSet);
		});
	}

	//Sapient generated method id: ${f9fd88f1-e402-3928-aca0-4872b16f1937}, hash: BC46FE73D14995E640070B1FC8517B51
	@Test()
	void postProcessEnvironment1WhenResourceLoaderIsNotNull() {
		/* Branches:
		 * (resourceLoader != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		NoOpLog noOpLog = new NoOpLog();
		doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataEnvironmentPostProcessor.class);
		ConfigDataEnvironmentPostProcessor target = spy(new ConfigDataEnvironmentPostProcessor(logFactoryMock, configurableBootstrapContextMock));
		Collection<String> collection = new ArrayList<>();
		doReturn(configDataEnvironmentMock).when(target).getConfigDataEnvironment(configurableEnvironmentMock, resourceLoaderMock, collection);
		doNothing().when(configDataEnvironmentMock).processAndApply();
		//Act Statement(s)
		target.postProcessEnvironment(configurableEnvironmentMock, resourceLoaderMock, collection);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(logFactoryMock).getLog(ConfigDataEnvironmentPostProcessor.class);
			verify(target).getConfigDataEnvironment(configurableEnvironmentMock, resourceLoaderMock, collection);
			verify(configDataEnvironmentMock).processAndApply();
		});
	}

	//Sapient generated method id: ${182cd80d-88d1-3ad1-8fd6-fbdc758e91cf}, hash: 17E2486440FD9B0B92F7CF7CA1B42500
	@Test()
	void postProcessEnvironment1WhenResourceLoaderIsNull() {
		/* Branches:
		 * (resourceLoader != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		NoOpLog noOpLog = new NoOpLog();
		doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataEnvironmentPostProcessor.class);
		ConfigDataEnvironmentPostProcessor target = spy(new ConfigDataEnvironmentPostProcessor(logFactoryMock, configurableBootstrapContextMock));
		Collection<String> collection = new ArrayList<>();
		doReturn(configDataEnvironmentMock).when(target).getConfigDataEnvironment(eq(configurableEnvironmentMock), (DefaultResourceLoader) any(), eq(collection));
		doNothing().when(configDataEnvironmentMock).processAndApply();
		ResourceLoader resourceLoader = null;
		//Act Statement(s)
		target.postProcessEnvironment(configurableEnvironmentMock, resourceLoader, collection);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(logFactoryMock).getLog(ConfigDataEnvironmentPostProcessor.class);
			verify(target).getConfigDataEnvironment(eq(configurableEnvironmentMock), (DefaultResourceLoader) any(), eq(collection));
			verify(configDataEnvironmentMock).processAndApply();
		});
	}

	//Sapient generated method id: ${23a64fe5-9a99-3ed7-988e-508cc9b0149d}, hash: 5B95B2BE7D472F51162E8545C547909C
	@Disabled()
	@Test()
	void getConfigDataEnvironmentTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.context.config.ConfigDataEnvironment
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		NoOpLog noOpLog = new NoOpLog();
		doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataEnvironmentPostProcessor.class);
		ConfigDataEnvironmentPostProcessor target = new ConfigDataEnvironmentPostProcessor(logFactoryMock, configurableBootstrapContextMock);
		Collection<String> collection = new ArrayList<>();
		//Act Statement(s)
		ConfigDataEnvironment result = target.getConfigDataEnvironment(configurableEnvironmentMock, resourceLoaderMock, collection);
		//Assert statement(s)
		//TODO: Please implement equals method in ConfigDataEnvironment for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(logFactoryMock, atLeast(1)).getLog(ConfigDataEnvironmentPostProcessor.class);
		});
	}

	//Sapient generated method id: ${0f0a622f-1e3b-3dc0-a3ae-a6ceb63c4e13}, hash: 0BE955D494D136DC500575AC7C8EE08C
	@Test()
	void applyToTest() {
		//Arrange Statement(s)
		try (MockedStatic<ConfigDataEnvironmentPostProcessor> configDataEnvironmentPostProcessor = mockStatic(ConfigDataEnvironmentPostProcessor.class, CALLS_REAL_METHODS)) {
			configDataEnvironmentPostProcessor.when(() -> ConfigDataEnvironmentPostProcessor.applyTo(eq(configurableEnvironmentMock), eq((ResourceLoader) null), eq((ConfigurableBootstrapContext) null), anyList())).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			ConfigDataEnvironmentPostProcessor.applyTo(configurableEnvironmentMock);
			//Assert statement(s)
			assertAll("result", () -> configDataEnvironmentPostProcessor.verify(() -> ConfigDataEnvironmentPostProcessor.applyTo(eq(configurableEnvironmentMock), eq((ResourceLoader) null), eq((ConfigurableBootstrapContext) null), anyList()), atLeast(1)));
		}
	}

	//Sapient generated method id: ${cd9cc7ed-2bcd-3b9e-92ea-37cc65615b1f}, hash: 79977D6827DDB4F6C20179600E65B521
	@Test()
	void applyTo1Test() {
		//Arrange Statement(s)
		try (MockedStatic<ConfigDataEnvironmentPostProcessor> configDataEnvironmentPostProcessor = mockStatic(ConfigDataEnvironmentPostProcessor.class, CALLS_REAL_METHODS)) {
			configDataEnvironmentPostProcessor.when(() -> ConfigDataEnvironmentPostProcessor.applyTo(eq(configurableEnvironmentMock), eq(resourceLoaderMock), eq(configurableBootstrapContextMock), anyList())).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] {};
			//Act Statement(s)
			ConfigDataEnvironmentPostProcessor.applyTo(configurableEnvironmentMock, resourceLoaderMock, configurableBootstrapContextMock, stringArray);
			//Assert statement(s)
			assertAll("result", () -> configDataEnvironmentPostProcessor.verify(() -> ConfigDataEnvironmentPostProcessor.applyTo(eq(configurableEnvironmentMock), eq(resourceLoaderMock), eq(configurableBootstrapContextMock), anyList()), atLeast(1)));
		}
	}

	//Sapient generated method id: ${66433c20-bae2-3b8a-93d0-ae3b3333ce38}, hash: 7FE8FA42234E0CE16D55E704BE497DDB
	@Disabled()
	@Test()
	void applyTo2WhenBootstrapContextIsNotNull() {
		/* Branches:
		 * (bootstrapContext != null) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: postProcessor
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Collection<String> collection = new ArrayList<>();
		//Act Statement(s)
		ConfigDataEnvironmentPostProcessor.applyTo(configurableEnvironmentMock, resourceLoaderMock, configurableBootstrapContextMock, collection);
	}

	//Sapient generated method id: ${585bc3a1-dad3-32d9-ac64-63f9489a09b6}, hash: 497CBA6A2203CEEB7C277F728280ED98
	@Disabled()
	@Test()
	void applyTo2WhenBootstrapContextIsNull() {
		/* Branches:
		 * (bootstrapContext != null) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: postProcessor
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurableBootstrapContext configurableBootstrapContext = null;
		Collection<String> collection = new ArrayList<>();
		//Act Statement(s)
		ConfigDataEnvironmentPostProcessor.applyTo(configurableEnvironmentMock, resourceLoaderMock, configurableBootstrapContext, collection);
	}

	//Sapient generated method id: ${8d5c6b39-2150-3b76-9e7f-3a640d378b82}, hash: 31CE69D23D6896FB923A83544F759292
	@Disabled()
	@Test()
	void applyTo3WhenBootstrapContextIsNotNull() {
		/* Branches:
		 * (bootstrapContext != null) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: postProcessor
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Collection<String> collection = new ArrayList<>();
		//Act Statement(s)
		ConfigDataEnvironmentPostProcessor.applyTo(configurableEnvironmentMock, resourceLoaderMock, configurableBootstrapContextMock, collection, configDataEnvironmentUpdateListenerMock);
	}

	//Sapient generated method id: ${658966d4-8dea-3d12-99b4-6e34f58a6282}, hash: 0428B2D8390F0C213F3BC436FEE0FD9F
	@Disabled()
	@Test()
	void applyTo3WhenBootstrapContextIsNull() {
		/* Branches:
		 * (bootstrapContext != null) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: postProcessor
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurableBootstrapContext configurableBootstrapContext = null;
		Collection<String> collection = new ArrayList<>();
		//Act Statement(s)
		ConfigDataEnvironmentPostProcessor.applyTo(configurableEnvironmentMock, resourceLoaderMock, configurableBootstrapContext, collection, configDataEnvironmentUpdateListenerMock);
	}
}
