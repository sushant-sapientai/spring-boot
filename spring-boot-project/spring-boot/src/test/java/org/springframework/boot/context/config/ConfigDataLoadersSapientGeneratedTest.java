package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.mockito.stubbing.Answer;

import org.springframework.boot.BootstrapContext;
import org.springframework.core.io.support.SpringFactoriesLoader;

import org.apache.commons.logging.impl.NoOpLog;

import org.springframework.core.log.LogMessage;
import org.springframework.util.Assert;
import org.springframework.boot.ConfigurableBootstrapContext;

import org.apache.commons.logging.Log;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import org.springframework.boot.logging.DeferredLogFactory;
import org.springframework.boot.BootstrapRegistry;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigDataLoadersSapientGeneratedTest {

	private final ConfigDataLoaderContext configDataLoaderContextMock = mock(ConfigDataLoaderContext.class);

	private final ConfigDataResource configDataResourceMock = mock(ConfigDataResource.class);

	private final ConfigurableBootstrapContext configurableBootstrapContextMock = mock(ConfigurableBootstrapContext.class);

	private final DeferredLogFactory logFactoryMock = mock(DeferredLogFactory.class);

	private final LogMessage logMessageMock = mock(LogMessage.class);

	private final SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock = mock(SpringFactoriesLoader.ArgumentResolver.class);

	private final SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock2 = mock(SpringFactoriesLoader.ArgumentResolver.class);

	private final SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock3 = mock(SpringFactoriesLoader.ArgumentResolver.class);

	private final SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock4 = mock(SpringFactoriesLoader.ArgumentResolver.class);

	private final SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock5 = mock(SpringFactoriesLoader.ArgumentResolver.class);

	private final SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);

	//Sapient generated method id: ${e3cf0279-6830-3a5e-95c0-323aba8ef93f}, hash: D15A595FB5CDFDA5D419EF3BD4EC8805
	@Disabled()
	@Test()
	void loadWhenResultIsNotNull() throws IOException, ConfigDataResourceNotFoundException {
		/* Branches:
		 * (i < this.loaders.size()) : true  #  inside getLoader method
		 * (this.resourceTypes.get(i).isInstance(resource)) : true  #  inside getLoader method
		 * (candidate.isLoadable(context, resource)) : true  #  inside getLoader method
		 * (result != null) : false  #  inside getLoader method
		 * (result != null) : true  #  inside getLoader method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<SpringFactoriesLoader.ArgumentResolver> springFactoriesLoaderArgumentResolver = mockStatic(SpringFactoriesLoader.ArgumentResolver.class)) {
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataLoaders.class);
			springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(DeferredLogFactory.class, logFactoryMock)).thenReturn(springFactoriesLoaderArgumentResolverMock);
			doReturn(springFactoriesLoaderArgumentResolverMock2).when(springFactoriesLoaderArgumentResolverMock).and(ConfigurableBootstrapContext.class, configurableBootstrapContextMock);
			doReturn(springFactoriesLoaderArgumentResolverMock3).when(springFactoriesLoaderArgumentResolverMock2).and(BootstrapContext.class, configurableBootstrapContextMock);
			doReturn(springFactoriesLoaderArgumentResolverMock4).when(springFactoriesLoaderArgumentResolverMock3).and(BootstrapRegistry.class, configurableBootstrapContextMock);
			doReturn(springFactoriesLoaderArgumentResolverMock5).when(springFactoriesLoaderArgumentResolverMock4).andSupplied(eq(Log.class), (Supplier) any());
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			logMessage.when(() -> LogMessage.of((Supplier) any())).thenReturn(logMessageMock);
			ConfigDataLoaders target = new ConfigDataLoaders(logFactoryMock, configurableBootstrapContextMock, springFactoriesLoaderMock);
			//Act Statement(s)
			ConfigData result = target.load(configDataLoaderContextMock, configDataResourceMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(logFactoryMock).getLog(ConfigDataLoaders.class);
				springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(DeferredLogFactory.class, logFactoryMock), atLeast(1));
				verify(springFactoriesLoaderArgumentResolverMock).and(ConfigurableBootstrapContext.class, configurableBootstrapContextMock);
				verify(springFactoriesLoaderArgumentResolverMock2).and(BootstrapContext.class, configurableBootstrapContextMock);
				verify(springFactoriesLoaderArgumentResolverMock3).and(BootstrapRegistry.class, configurableBootstrapContextMock);
				verify(springFactoriesLoaderArgumentResolverMock4).andSupplied(eq(Log.class), (Supplier) any());
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				logMessage.verify(() -> LogMessage.of((Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${8af7da23-036e-3ce2-a062-9f91b92a61a3}, hash: 0A35E728A5D68C26D26E2A14632BC51B
	@Test()
	void loadWhenResultIsNullAndResultIsNullThrowsNullPointerException() throws IOException, ConfigDataResourceNotFoundException {
		/* Branches:
		 * (i < this.loaders.size()) : true  #  inside getLoader method
		 * (this.resourceTypes.get(i).isInstance(resource)) : true  #  inside getLoader method
		 * (candidate.isLoadable(context, resource)) : true  #  inside getLoader method
		 * (result != null) : false  #  inside getLoader method
		 * (result != null) : false  #  inside getLoader method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<SpringFactoriesLoader.ArgumentResolver> springFactoriesLoaderArgumentResolver = mockStatic(SpringFactoriesLoader.ArgumentResolver.class)) {
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataLoaders.class);
			springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(DeferredLogFactory.class, logFactoryMock)).thenReturn(springFactoriesLoaderArgumentResolverMock);
			doReturn(springFactoriesLoaderArgumentResolverMock2).when(springFactoriesLoaderArgumentResolverMock).and(ConfigurableBootstrapContext.class, configurableBootstrapContextMock);
			doReturn(springFactoriesLoaderArgumentResolverMock3).when(springFactoriesLoaderArgumentResolverMock2).and(BootstrapContext.class, configurableBootstrapContextMock);
			doReturn(springFactoriesLoaderArgumentResolverMock4).when(springFactoriesLoaderArgumentResolverMock3).and(BootstrapRegistry.class, configurableBootstrapContextMock);
			doReturn(springFactoriesLoaderArgumentResolverMock5).when(springFactoriesLoaderArgumentResolverMock4).andSupplied(eq(Log.class), (Supplier) any());
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			logMessage.when(() -> LogMessage.of((Supplier) any())).thenReturn(logMessageMock);
			ConfigDataLoaders target = new ConfigDataLoaders(logFactoryMock, configurableBootstrapContextMock, springFactoriesLoaderMock);
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.load(configDataLoaderContextMock, configDataResourceMock);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(logFactoryMock).getLog(ConfigDataLoaders.class);
				springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(DeferredLogFactory.class, logFactoryMock), atLeast(1));
				verify(springFactoriesLoaderArgumentResolverMock).and(ConfigurableBootstrapContext.class, configurableBootstrapContextMock);
				verify(springFactoriesLoaderArgumentResolverMock2).and(BootstrapContext.class, configurableBootstrapContextMock);
				verify(springFactoriesLoaderArgumentResolverMock3).and(BootstrapRegistry.class, configurableBootstrapContextMock);
				verify(springFactoriesLoaderArgumentResolverMock4).andSupplied(eq(Log.class), (Supplier) any());
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
				logMessage.verify(() -> LogMessage.of((Supplier) any()));
			});
		}
	}
}
