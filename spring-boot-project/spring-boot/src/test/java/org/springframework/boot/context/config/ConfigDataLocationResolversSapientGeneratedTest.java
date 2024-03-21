package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.core.io.ResourceLoader;
import org.springframework.boot.BootstrapContext;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.boot.ConfigurableBootstrapContext;

import org.apache.commons.logging.Log;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import org.springframework.boot.logging.DeferredLogFactory;
import org.springframework.boot.BootstrapRegistry;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigDataLocationResolversSapientGeneratedTest {

	private final Binder binderMock = mock(Binder.class);

	private final ConfigDataLocationResolverContext configDataLocationResolverContextMock = mock(ConfigDataLocationResolverContext.class);

	private final ConfigurableBootstrapContext configurableBootstrapContextMock = mock(ConfigurableBootstrapContext.class);

	private final DeferredLogFactory deferredLogFactoryMock = mock(DeferredLogFactory.class);

	private final Profiles profilesMock = mock(Profiles.class);

	private final ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);

	private final SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock = mock(SpringFactoriesLoader.ArgumentResolver.class);

	private final SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock2 = mock(SpringFactoriesLoader.ArgumentResolver.class);

	private final SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock3 = mock(SpringFactoriesLoader.ArgumentResolver.class);

	private final SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock4 = mock(SpringFactoriesLoader.ArgumentResolver.class);

	private final SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock5 = mock(SpringFactoriesLoader.ArgumentResolver.class);

	private final SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock6 = mock(SpringFactoriesLoader.ArgumentResolver.class);

	private final SpringFactoriesLoader.ArgumentResolver springFactoriesLoaderArgumentResolverMock7 = mock(SpringFactoriesLoader.ArgumentResolver.class);

	private final SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);

	//Sapient generated method id: ${3cb1073a-8690-31ab-b987-15b38abd03c3}, hash: 9952BF9CB0C10B6A52AF21B2F6DD3708
	@Test()
	void resolveWhenLocationIsNull() {
		/* Branches:
		 * (location == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<SpringFactoriesLoader.ArgumentResolver> springFactoriesLoaderArgumentResolver = mockStatic(SpringFactoriesLoader.ArgumentResolver.class)) {
			springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(DeferredLogFactory.class, deferredLogFactoryMock)).thenReturn(springFactoriesLoaderArgumentResolverMock);
			doReturn(springFactoriesLoaderArgumentResolverMock2).when(springFactoriesLoaderArgumentResolverMock).and(Binder.class, binderMock);
			doReturn(springFactoriesLoaderArgumentResolverMock3).when(springFactoriesLoaderArgumentResolverMock2).and(ResourceLoader.class, resourceLoaderMock);
			doReturn(springFactoriesLoaderArgumentResolverMock4).when(springFactoriesLoaderArgumentResolverMock3).and(ConfigurableBootstrapContext.class, configurableBootstrapContextMock);
			doReturn(springFactoriesLoaderArgumentResolverMock5).when(springFactoriesLoaderArgumentResolverMock4).and(BootstrapContext.class, configurableBootstrapContextMock);
			doReturn(springFactoriesLoaderArgumentResolverMock6).when(springFactoriesLoaderArgumentResolverMock5).and(BootstrapRegistry.class, configurableBootstrapContextMock);
			doReturn(springFactoriesLoaderArgumentResolverMock7).when(springFactoriesLoaderArgumentResolverMock6).andSupplied(eq(Log.class), (Supplier) any());
			ConfigDataLocationResolvers target = new ConfigDataLocationResolvers(deferredLogFactoryMock, configurableBootstrapContextMock, binderMock, resourceLoaderMock, springFactoriesLoaderMock);
			ConfigDataLocation configDataLocation = null;
			//Act Statement(s)
			List<ConfigDataResolutionResult> result = target.resolve(configDataLocationResolverContextMock, configDataLocation, profilesMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(DeferredLogFactory.class, deferredLogFactoryMock), atLeast(1));
				verify(springFactoriesLoaderArgumentResolverMock).and(Binder.class, binderMock);
				verify(springFactoriesLoaderArgumentResolverMock2).and(ResourceLoader.class, resourceLoaderMock);
				verify(springFactoriesLoaderArgumentResolverMock3).and(ConfigurableBootstrapContext.class, configurableBootstrapContextMock);
				verify(springFactoriesLoaderArgumentResolverMock4).and(BootstrapContext.class, configurableBootstrapContextMock);
				verify(springFactoriesLoaderArgumentResolverMock5).and(BootstrapRegistry.class, configurableBootstrapContextMock);
				verify(springFactoriesLoaderArgumentResolverMock6).andSupplied(eq(Log.class), (Supplier) any());
			});
		}
	}

	//Sapient generated method id: ${8ca5cb1f-f519-3f47-b0dd-9a36e07de474}, hash: 3372B1642CDB15BB1546FE6DAC261C5A
	@Disabled()
	@Test()
	void resolveWhenLocationIsNotNullThrowsNullPointerException() {
		/* Branches:
		 * (location == null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigDataLocation configDataLocationMock = mock(ConfigDataLocation.class);
		try (MockedStatic<SpringFactoriesLoader.ArgumentResolver> springFactoriesLoaderArgumentResolver = mockStatic(SpringFactoriesLoader.ArgumentResolver.class)) {
			springFactoriesLoaderArgumentResolver.when(() -> SpringFactoriesLoader.ArgumentResolver.of(DeferredLogFactory.class, deferredLogFactoryMock)).thenReturn(springFactoriesLoaderArgumentResolverMock);
			doReturn(springFactoriesLoaderArgumentResolverMock2).when(springFactoriesLoaderArgumentResolverMock).and(Binder.class, binderMock);
			doReturn(springFactoriesLoaderArgumentResolverMock3).when(springFactoriesLoaderArgumentResolverMock2).and(ResourceLoader.class, resourceLoaderMock);
			doReturn(springFactoriesLoaderArgumentResolverMock4).when(springFactoriesLoaderArgumentResolverMock3).and(ConfigurableBootstrapContext.class, configurableBootstrapContextMock);
			doReturn(springFactoriesLoaderArgumentResolverMock5).when(springFactoriesLoaderArgumentResolverMock4).and(BootstrapContext.class, configurableBootstrapContextMock);
			doReturn(springFactoriesLoaderArgumentResolverMock6).when(springFactoriesLoaderArgumentResolverMock5).and(BootstrapRegistry.class, configurableBootstrapContextMock);
			doReturn(springFactoriesLoaderArgumentResolverMock7).when(springFactoriesLoaderArgumentResolverMock6).andSupplied(eq(Log.class), (Supplier) any());
			ConfigDataLocationResolvers target = new ConfigDataLocationResolvers(deferredLogFactoryMock, configurableBootstrapContextMock, binderMock, resourceLoaderMock, springFactoriesLoaderMock);
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.resolve(configDataLocationResolverContextMock, configDataLocationMock, profilesMock);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				springFactoriesLoaderArgumentResolver.verify(() -> SpringFactoriesLoader.ArgumentResolver.of(DeferredLogFactory.class, deferredLogFactoryMock), atLeast(1));
				verify(springFactoriesLoaderArgumentResolverMock).and(Binder.class, binderMock);
				verify(springFactoriesLoaderArgumentResolverMock2).and(ResourceLoader.class, resourceLoaderMock);
				verify(springFactoriesLoaderArgumentResolverMock3).and(ConfigurableBootstrapContext.class, configurableBootstrapContextMock);
				verify(springFactoriesLoaderArgumentResolverMock4).and(BootstrapContext.class, configurableBootstrapContextMock);
				verify(springFactoriesLoaderArgumentResolverMock5).and(BootstrapRegistry.class, configurableBootstrapContextMock);
				verify(springFactoriesLoaderArgumentResolverMock6).andSupplied(eq(Log.class), (Supplier) any());
			});
		}
	}
}
