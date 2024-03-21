package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.core.io.ResourceLoader;
import org.springframework.boot.DefaultPropertiesPropertySource;
import org.springframework.core.log.LogMessage;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.boot.BootstrapRegistry;
import org.springframework.util.StringUtils;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.logging.DeferredLogFactory;

import java.util.ArrayList;

import org.springframework.core.env.ConfigurableEnvironment;

import org.mockito.stubbing.Answer;
import org.apache.commons.logging.impl.NoOpLog;

import org.springframework.boot.context.properties.bind.BindException;
import org.springframework.boot.context.properties.bind.Bindable;

import java.util.Collection;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import org.springframework.core.io.support.SpringFactoriesLoader;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.atLeast;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigDataEnvironmentSapientGeneratedTest {

	private final ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class, "environment");

	private final ConfigurableBootstrapContext bootstrapContextMock = mock(ConfigurableBootstrapContext.class, "bootstrapContext");

	private final ConfigDataEnvironmentUpdateListener environmentUpdateListenerMock = mock(ConfigDataEnvironmentUpdateListener.class, "environmentUpdateListener");

	private final BindResult bindResultMock = mock(BindResult.class);

	private final BindResult bindResultMock2 = mock(BindResult.class);

	private final BindResult bindResultMock3 = mock(BindResult.class);

	private final BindResult bindResultMock4 = mock(BindResult.class);

	private final Binder binderMock = mock(Binder.class);

	private final BootstrapRegistry.InstanceSupplier bootstrapRegistryInstanceSupplierMock = mock(BootstrapRegistry.InstanceSupplier.class);

	private final BootstrapRegistry.InstanceSupplier bootstrapRegistryInstanceSupplierMock2 = mock(BootstrapRegistry.InstanceSupplier.class);

	private final BootstrapRegistry.InstanceSupplier bootstrapRegistryInstanceSupplierMock3 = mock(BootstrapRegistry.InstanceSupplier.class);

	private final BootstrapRegistry.InstanceSupplier bootstrapRegistryInstanceSupplierMock4 = mock(BootstrapRegistry.InstanceSupplier.class);

	private final BootstrapRegistry.InstanceSupplier bootstrapRegistryInstanceSupplierMock5 = mock(BootstrapRegistry.InstanceSupplier.class);

	private final BootstrapRegistry.InstanceSupplier bootstrapRegistryInstanceSupplierMock6 = mock(BootstrapRegistry.InstanceSupplier.class);

	private final BootstrapRegistry.InstanceSupplier bootstrapRegistryInstanceSupplierMock7 = mock(BootstrapRegistry.InstanceSupplier.class);

	private final BootstrapRegistry.InstanceSupplier bootstrapRegistryInstanceSupplierMock8 = mock(BootstrapRegistry.InstanceSupplier.class);

	private final ConfigDataEnvironmentContributor configDataEnvironmentContributorMock = mock(ConfigDataEnvironmentContributor.class);

	private final ConfigDataEnvironmentContributor configDataEnvironmentContributorMock2 = mock(ConfigDataEnvironmentContributor.class);

	private final ConfigDataEnvironmentContributor configDataEnvironmentContributorMock3 = mock(ConfigDataEnvironmentContributor.class);

	private final ConfigDataEnvironmentContributor configDataEnvironmentContributorMock4 = mock(ConfigDataEnvironmentContributor.class);

	private final ConfigDataEnvironmentContributor configDataEnvironmentContributorMock5 = mock(ConfigDataEnvironmentContributor.class);

	private final ConfigDataLocation configDataLocationMock = mock(ConfigDataLocation.class);

	private final ConfigDataLocation configDataLocationMock2 = mock(ConfigDataLocation.class);

	private final ConfigDataLocation configDataLocationMock3 = mock(ConfigDataLocation.class);

	private final DeferredLogFactory logFactoryMock = mock(DeferredLogFactory.class);

	private final LogMessage logMessageMock = mock(LogMessage.class);

	private final LogMessage logMessageMock2 = mock(LogMessage.class);

	private final LogMessage logMessageMock3 = mock(LogMessage.class);

	private final LogMessage logMessageMock4 = mock(LogMessage.class);

	private final LogMessage logMessageMock5 = mock(LogMessage.class);

	private final LogMessage logMessageMock6 = mock(LogMessage.class);

	private final MutablePropertySources mutablePropertySourcesMock = mock(MutablePropertySources.class);

	private final MutablePropertySources mutablePropertySourcesMock2 = mock(MutablePropertySources.class);

	private final Profiles profilesMock = mock(Profiles.class);

	private final PropertySource propertySourceMock = mock(PropertySource.class);

	private final ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);

	private final SpringFactoriesLoader springFactoriesLoaderMock = mock(SpringFactoriesLoader.class);

	private final SpringFactoriesLoader springFactoriesLoaderMock2 = mock(SpringFactoriesLoader.class);

	//Sapient generated method id: ${1627c4eb-7a5a-372b-bb70-2c07cb2b6d35}, hash: C3790FFDF3A678C8ED8473DAA1521A0D
	@Test()
	void createConfigDataLocationResolversTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		SpringFactoriesLoader springFactoriesLoaderMock3 = mock(SpringFactoriesLoader.class);
		try (MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
			 MockedStatic<ConfigDataEnvironmentContributor> configDataEnvironmentContributor = mockStatic(ConfigDataEnvironmentContributor.class);
			 MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
			 MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
			 MockedStatic<Binder> binder = mockStatic(Binder.class)) {
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataEnvironment.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
			doReturn(ConfigDataNotFoundAction.FAIL).when(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
			doReturn(bindResultMock2).when(binderMock).bind(eq("spring.config.import"), (Bindable) any());
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
			ConfigDataLocation[] configDataLocationArray2 = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(bindResultMock2).orElse(configDataLocationArray2);
			doReturn(bindResultMock3).when(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
			ConfigDataLocation[] configDataLocationArray3 = new ConfigDataLocation[] { configDataLocationMock2 };
			doReturn(configDataLocationArray3).when(bindResultMock3).orElse(configDataLocationArray2);
			doReturn(bindResultMock4).when(binderMock).bind(eq("spring.config.location"), (Bindable) any());
			ConfigDataLocation[] configDataLocationArray4 = new ConfigDataLocation[] { configDataLocationMock3 };
			ConfigDataLocation configDataLocation = ConfigDataLocation.of("optional:classpath:/;optional:classpath:/config/");
			ConfigDataLocation configDataLocation2 = ConfigDataLocation.of("optional:file:./;optional:file:./config/;optional:file:./config/*/");
			ConfigDataLocation[] configDataLocationArray5 = new ConfigDataLocation[] { configDataLocation, configDataLocation2 };
			doReturn(configDataLocationArray4).when(bindResultMock4).orElse(configDataLocationArray5);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader3 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader, classLoader2, classLoader3).when(resourceLoaderMock).getClassLoader();
			binder.when(() -> Binder.get(environmentMock)).thenReturn(binderMock);
			defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock)).thenReturn(true);
			logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock)).thenReturn(logMessageMock);
			configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock)).thenReturn(configDataEnvironmentContributorMock);
			logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2)).thenReturn(logMessageMock2);
			configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2)).thenReturn(configDataEnvironmentContributorMock2);
			logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3)).thenReturn(logMessageMock3);
			configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3)).thenReturn(configDataEnvironmentContributorMock3);
			configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock)).thenReturn(configDataEnvironmentContributorMock4);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2).thenReturn(springFactoriesLoaderMock3);
			Collection<String> collection = new ArrayList<>();
			ConfigDataEnvironment target = new ConfigDataEnvironment(logFactoryMock, bootstrapContextMock, environmentMock, resourceLoaderMock, collection, environmentUpdateListenerMock);
			doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
			doReturn(1).when(mutablePropertySourcesMock).size();
			doReturn(null).when(mutablePropertySourcesMock).iterator();
			//Act Statement(s)
			ConfigDataLocationResolvers result = target.createConfigDataLocationResolvers(logFactoryMock, bootstrapContextMock, binderMock, resourceLoaderMock);
			//Assert statement(s)
			//TODO: Please implement equals method in ConfigDataLocationResolvers for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(logFactoryMock, atLeast(1)).getLog(ConfigDataEnvironment.class);
				verify(binderMock, atLeast(1)).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
				verify(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
				verify(binderMock).bind(eq("spring.config.import"), (Bindable) any());
				verify(bindResultMock2).orElse(configDataLocationArray2);
				verify(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
				verify(bindResultMock3).orElse(configDataLocationArray2);
				verify(binderMock).bind(eq("spring.config.location"), (Bindable) any());
				verify(bindResultMock4).orElse(configDataLocationArray5);
				verify(resourceLoaderMock, atLeast(3)).getClassLoader();
				binder.verify(() -> Binder.get(environmentMock), atLeast(1));
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(3));
				defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock), atLeast(1));
				logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock), atLeast(1));
				configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock), atLeast(1));
				logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2), atLeast(1));
				configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2), atLeast(1));
				logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3), atLeast(1));
				configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3), atLeast(1));
				configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock), atLeast(1));
				verify(environmentMock).getPropertySources();
				verify(mutablePropertySourcesMock).size();
				verify(mutablePropertySourcesMock).iterator();
			});
		}
	}

	//Sapient generated method id: ${820d0286-666f-3e3b-92fa-bf3f3f80f7fc}, hash: 7B03706E2043E98CBBFA9461AACA46C5
	@Test()
	void createContributors1Test() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigDataEnvironmentContributor> configDataEnvironmentContributor = mockStatic(ConfigDataEnvironmentContributor.class);
			 MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
			 MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
			 MockedStatic<Binder> binder = mockStatic(Binder.class)) {
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataEnvironment.class);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader, classLoader2).when(resourceLoaderMock).getClassLoader();
			binder.when(() -> Binder.get(environmentMock)).thenReturn(binderMock);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
			doReturn(ConfigDataNotFoundAction.FAIL).when(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
			doReturn(bindResultMock2).when(binderMock).bind(eq("spring.config.import"), (Bindable) any());
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
			ConfigDataLocation[] configDataLocationArray2 = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(bindResultMock2).orElse(configDataLocationArray2);
			doReturn(bindResultMock3).when(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
			ConfigDataLocation[] configDataLocationArray3 = new ConfigDataLocation[] { configDataLocationMock2 };
			doReturn(configDataLocationArray3).when(bindResultMock3).orElse(configDataLocationArray2);
			doReturn(bindResultMock4).when(binderMock).bind(eq("spring.config.location"), (Bindable) any());
			ConfigDataLocation[] configDataLocationArray4 = new ConfigDataLocation[] { configDataLocationMock3 };
			ConfigDataLocation configDataLocation = ConfigDataLocation.of("optional:classpath:/;optional:classpath:/config/");
			ConfigDataLocation configDataLocation2 = ConfigDataLocation.of("optional:file:./;optional:file:./config/;optional:file:./config/*/");
			ConfigDataLocation[] configDataLocationArray5 = new ConfigDataLocation[] { configDataLocation, configDataLocation2 };
			doReturn(configDataLocationArray4).when(bindResultMock4).orElse(configDataLocationArray5);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2);
			defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock)).thenReturn(true);
			logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock)).thenReturn(logMessageMock);
			configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock)).thenReturn(configDataEnvironmentContributorMock);
			logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2)).thenReturn(logMessageMock2);
			configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2)).thenReturn(configDataEnvironmentContributorMock2);
			logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3)).thenReturn(logMessageMock3);
			configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3)).thenReturn(configDataEnvironmentContributorMock3);
			configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock)).thenReturn(configDataEnvironmentContributorMock4);
			Collection<String> collection = new ArrayList<>();
			ConfigDataEnvironment target = new ConfigDataEnvironment(logFactoryMock, bootstrapContextMock, environmentMock, resourceLoaderMock, collection, environmentUpdateListenerMock);
			doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
			doReturn(1).when(mutablePropertySourcesMock).size();
			doReturn(null).when(mutablePropertySourcesMock).iterator();
			List<ConfigDataEnvironmentContributor> configDataEnvironmentContributorList = new ArrayList<>(11);
			configDataEnvironmentContributorList.add(configDataEnvironmentContributorMock);
			configDataEnvironmentContributorList.add(configDataEnvironmentContributorMock2);
			configDataEnvironmentContributorList.add(configDataEnvironmentContributorMock3);
			configDataEnvironmentContributorList.add(configDataEnvironmentContributorMock4);
			//Act Statement(s)
			ConfigDataEnvironmentContributors result = target.createContributors(configDataEnvironmentContributorList);
			//Assert statement(s)
			//TODO: Please implement equals method in ConfigDataEnvironmentContributors for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(logFactoryMock, atLeast(1)).getLog(ConfigDataEnvironment.class);
				verify(resourceLoaderMock, times(2)).getClassLoader();
				binder.verify(() -> Binder.get(environmentMock), atLeast(1));
				verify(binderMock).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
				verify(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
				verify(binderMock).bind(eq("spring.config.import"), (Bindable) any());
				verify(bindResultMock2).orElse(configDataLocationArray2);
				verify(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
				verify(bindResultMock3).orElse(configDataLocationArray2);
				verify(binderMock).bind(eq("spring.config.location"), (Bindable) any());
				verify(bindResultMock4).orElse(configDataLocationArray5);
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(2));
				defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock), atLeast(1));
				logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock), atLeast(1));
				configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock), atLeast(1));
				logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2), atLeast(1));
				configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2), atLeast(1));
				logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3), atLeast(1));
				configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3), atLeast(1));
				configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock), atLeast(1));
				verify(environmentMock).getPropertySources();
				verify(mutablePropertySourcesMock).size();
				verify(mutablePropertySourcesMock).iterator();
			});
		}
	}

	//Sapient generated method id: ${24ffa5f9-670a-39b3-b8fc-e7297e50797f}, hash: 9B98639FD75868E8DB38051C6C3E1998
	@Test()
	void processAndApplyWhenExGetCauseInstanceOfInactiveConfigDataAccessExceptionThrowsInactiveConfigDataAccessException() {
		/* Branches:
		 * (catch-exception (BindException)) : true  #  inside createActivationContext method
		 * (ex.getCause() instanceof InactiveConfigDataAccessException inactiveException) : true  #  inside createActivationContext method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BootstrapRegistry.InstanceSupplier> bootstrapRegistryInstanceSupplier = mockStatic(BootstrapRegistry.InstanceSupplier.class);
			 MockedStatic<ConfigDataEnvironmentContributor> configDataEnvironmentContributor = mockStatic(ConfigDataEnvironmentContributor.class);
			 MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
			 MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
			 MockedStatic<Binder> binder = mockStatic(Binder.class)) {
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataEnvironment.class);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader, classLoader2).when(resourceLoaderMock).getClassLoader();
			binder.when(() -> Binder.get(environmentMock)).thenReturn(binderMock);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
			doReturn(ConfigDataNotFoundAction.FAIL).when(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
			doReturn(bindResultMock2).when(binderMock).bind(eq("spring.config.import"), (Bindable) any());
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
			ConfigDataLocation[] configDataLocationArray2 = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(bindResultMock2).orElse(configDataLocationArray2);
			doReturn(bindResultMock3).when(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
			ConfigDataLocation[] configDataLocationArray3 = new ConfigDataLocation[] { configDataLocationMock2 };
			doReturn(configDataLocationArray3).when(bindResultMock3).orElse(configDataLocationArray2);
			doReturn(bindResultMock4).when(binderMock).bind(eq("spring.config.location"), (Bindable) any());
			ConfigDataLocation[] configDataLocationArray4 = new ConfigDataLocation[] { configDataLocationMock3 };
			ConfigDataLocation configDataLocation = ConfigDataLocation.of("optional:classpath:/;optional:classpath:/config/");
			ConfigDataLocation configDataLocation2 = ConfigDataLocation.of("optional:file:./;optional:file:./config/;optional:file:./config/*/");
			ConfigDataLocation[] configDataLocationArray5 = new ConfigDataLocation[] { configDataLocation, configDataLocation2 };
			doReturn(configDataLocationArray4).when(bindResultMock4).orElse(configDataLocationArray5);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2);
			defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock)).thenReturn(true);
			logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock)).thenReturn(logMessageMock);
			configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock)).thenReturn(configDataEnvironmentContributorMock);
			logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2)).thenReturn(logMessageMock2);
			configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2)).thenReturn(configDataEnvironmentContributorMock2);
			logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3)).thenReturn(logMessageMock3);
			configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3)).thenReturn(configDataEnvironmentContributorMock3);
			configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock)).thenReturn(configDataEnvironmentContributorMock4);
			doReturn(bootstrapRegistryInstanceSupplierMock2).when(bootstrapRegistryInstanceSupplierMock).withScope(BootstrapRegistry.Scope.PROTOTYPE);
			bootstrapRegistryInstanceSupplier.when(() -> BootstrapRegistry.InstanceSupplier.from((Supplier) any())).thenReturn(bootstrapRegistryInstanceSupplierMock).thenReturn(bootstrapRegistryInstanceSupplierMock3);
			doReturn(bootstrapRegistryInstanceSupplierMock4).when(bootstrapRegistryInstanceSupplierMock3).withScope(BootstrapRegistry.Scope.PROTOTYPE);
			Collection<String> collection = new ArrayList<>();
			ConfigDataEnvironment target = new ConfigDataEnvironment(logFactoryMock, bootstrapContextMock, environmentMock, resourceLoaderMock, collection, environmentUpdateListenerMock);
			doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
			doReturn(1).when(mutablePropertySourcesMock).size();
			doReturn(null).when(mutablePropertySourcesMock).iterator();
			doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock2);
			doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock4);
			//Act Statement(s)
			final InactiveConfigDataAccessException result = assertThrows(InactiveConfigDataAccessException.class, () -> {
				target.processAndApply();
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(logFactoryMock).getLog(ConfigDataEnvironment.class);
				verify(resourceLoaderMock, times(2)).getClassLoader();
				binder.verify(() -> Binder.get(environmentMock), atLeast(1));
				verify(binderMock).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
				verify(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
				verify(binderMock).bind(eq("spring.config.import"), (Bindable) any());
				verify(bindResultMock2).orElse(configDataLocationArray2);
				verify(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
				verify(bindResultMock3).orElse(configDataLocationArray2);
				verify(binderMock).bind(eq("spring.config.location"), (Bindable) any());
				verify(bindResultMock4).orElse(configDataLocationArray5);
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(2));
				defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock), atLeast(1));
				logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock), atLeast(1));
				configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock), atLeast(1));
				logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2), atLeast(1));
				configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2), atLeast(1));
				logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3), atLeast(1));
				configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3), atLeast(1));
				configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock), atLeast(1));
				bootstrapRegistryInstanceSupplier.verify(() -> BootstrapRegistry.InstanceSupplier.from((Supplier) any()), atLeast(2));
				verify(bootstrapRegistryInstanceSupplierMock).withScope(BootstrapRegistry.Scope.PROTOTYPE);
				verify(bootstrapRegistryInstanceSupplierMock3).withScope(BootstrapRegistry.Scope.PROTOTYPE);
				verify(environmentMock).getPropertySources();
				verify(mutablePropertySourcesMock).size();
				verify(mutablePropertySourcesMock).iterator();
				verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock2);
				verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock4);
			});
		}
	}

	//Sapient generated method id: ${a9681f80-592e-3df6-b206-577ffa348f90}, hash: 1791B46DB297974257E44AB10B25AB1C
	@Test()
	void processAndApplyWhenExGetCauseNotInstanceOfInactiveConfigDataAccessExceptionThrowsBindException() {
		/* Branches:
		 * (catch-exception (BindException)) : true  #  inside createActivationContext method
		 * (ex.getCause() instanceof InactiveConfigDataAccessException inactiveException) : false  #  inside createActivationContext method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
	    /*try (MockedStatic<BootstrapRegistry.InstanceSupplier> bootstrapRegistryInstanceSupplier = mockStatic(BootstrapRegistry.InstanceSupplier.class);
    MockedStatic<ConfigDataEnvironmentContributor> configDataEnvironmentContributor = mockStatic(ConfigDataEnvironmentContributor.class);
    MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
    MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
    MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
    MockedStatic<Binder> binder = mockStatic(Binder.class)) {
    NoOpLog noOpLog = new NoOpLog();
    doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataEnvironment.class);
    ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
    ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
    doReturn(classLoader, classLoader2).when(resourceLoaderMock).getClassLoader();
    binder.when(() -> Binder.get(environmentMock)).thenReturn(binderMock);
    doReturn(bindResultMock).when(binderMock).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
    doReturn(ConfigDataNotFoundAction.FAIL).when(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
    doReturn(bindResultMock2).when(binderMock).bind(eq("spring.config.import"), (Bindable) any());
    ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
    ConfigDataLocation[] configDataLocationArray2 = new ConfigDataLocation[] {};
    doReturn(configDataLocationArray).when(bindResultMock2).orElse(configDataLocationArray2);
    doReturn(bindResultMock3).when(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
    ConfigDataLocation[] configDataLocationArray3 = new ConfigDataLocation[] { configDataLocationMock2 };
    doReturn(configDataLocationArray3).when(bindResultMock3).orElse(configDataLocationArray2);
    doReturn(bindResultMock4).when(binderMock).bind(eq("spring.config.location"), (Bindable) any());
    ConfigDataLocation[] configDataLocationArray4 = new ConfigDataLocation[] { configDataLocationMock3 };
    ConfigDataLocation configDataLocation = ConfigDataLocation.of("optional:classpath:/;optional:classpath:/config/");
    ConfigDataLocation configDataLocation2 = ConfigDataLocation.of("optional:file:./;optional:file:./config/;optional:file:./config/*/
//		");
//		ConfigDataLocation[] configDataLocationArray5 = new ConfigDataLocation[] { configDataLocation, configDataLocation2 };
//		doReturn(configDataLocationArray4).when(bindResultMock4).orElse(configDataLocationArray5);
//		springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2);
//		defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock)).thenReturn(true);
//		logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock)).thenReturn(logMessageMock);
//		configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock)).thenReturn(configDataEnvironmentContributorMock);
//		logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2)).thenReturn(logMessageMock2);
//		configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2)).thenReturn(configDataEnvironmentContributorMock2);
//		logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3)).thenReturn(logMessageMock3);
//		configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3)).thenReturn(configDataEnvironmentContributorMock3);
//		configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock)).thenReturn(configDataEnvironmentContributorMock4);
//		doReturn(bootstrapRegistryInstanceSupplierMock2).when(bootstrapRegistryInstanceSupplierMock).withScope(BootstrapRegistry.Scope.PROTOTYPE);
//		bootstrapRegistryInstanceSupplier.when(() -> BootstrapRegistry.InstanceSupplier.from((Supplier) any())).thenReturn(bootstrapRegistryInstanceSupplierMock).thenReturn(bootstrapRegistryInstanceSupplierMock3);
//		doReturn(bootstrapRegistryInstanceSupplierMock4).when(bootstrapRegistryInstanceSupplierMock3).withScope(BootstrapRegistry.Scope.PROTOTYPE);
//		Collection<String> collection = new ArrayList<>();
//		ConfigDataEnvironment target = new ConfigDataEnvironment(logFactoryMock, bootstrapContextMock, environmentMock, resourceLoaderMock, collection, environmentUpdateListenerMock);
//		doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
//		doReturn(1).when(mutablePropertySourcesMock).size();
//		doReturn(null).when(mutablePropertySourcesMock).iterator();
//		doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock2);
//		doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock4);
//		//Act Statement(s)
//		target.processAndApply();
//		//Assert statement(s)
//		assertAll("result", () -> {
//			assertThat(result, is(notNullValue()));
//			verify(logFactoryMock).getLog(ConfigDataEnvironment.class);
//			verify(resourceLoaderMock, times(2)).getClassLoader();
//			binder.verify(() -> Binder.get(environmentMock), atLeast(1));
//			verify(binderMock).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
//			verify(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
//			verify(binderMock).bind(eq("spring.config.import"), (Bindable) any());
//			verify(bindResultMock2).orElse(configDataLocationArray2);
//			verify(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
//			verify(bindResultMock3).orElse(configDataLocationArray2);
//			verify(binderMock).bind(eq("spring.config.location"), (Bindable) any());
//			verify(bindResultMock4).orElse(configDataLocationArray5);
//			springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(2));
//			defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock), atLeast(1));
//			logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock), atLeast(1));
//			configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock), atLeast(1));
//			logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2), atLeast(1));
//			configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2), atLeast(1));
//			logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3), atLeast(1));
//			configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3), atLeast(1));
//			configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock), atLeast(1));
//			bootstrapRegistryInstanceSupplier.verify(() -> BootstrapRegistry.InstanceSupplier.from((Supplier) any()), atLeast(2));
//			verify(bootstrapRegistryInstanceSupplierMock).withScope(BootstrapRegistry.Scope.PROTOTYPE);
//			verify(bootstrapRegistryInstanceSupplierMock3).withScope(BootstrapRegistry.Scope.PROTOTYPE);
//			verify(environmentMock).getPropertySources();
//			verify(mutablePropertySourcesMock).size();
//			verify(mutablePropertySourcesMock).iterator();
//			verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock2);
//			verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock4);
//		});
//	}*/
}

	//Sapient generated method id: ${11f3c4b5-9aa8-3339-bdde-3e8219e8bfbd}, hash: 5715EF71BDC8DF868A04A789E1CF8069
	@Test()
	void processAndApplyWhenCaughtBindExceptionAndExGetCauseInstanceOfInactiveConfigDataAThrowsInactiveConfigDataAccessException() {
		/* Branches:
		 * (for-each(contributors)) : true  #  inside getIncludedProfiles method
		 * (source != null) : true  #  inside getIncludedProfiles method
		 * (!contributor.hasConfigDataOption(ConfigData.Option.IGNORE_PROFILES)) : true  #  inside getIncludedProfiles method
		 * (catch-exception (BindException)) : true  #  inside withProfiles method
		 * (ex.getCause() instanceof InactiveConfigDataAccessException inactiveException) : true  #  inside withProfiles method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BootstrapRegistry.InstanceSupplier> bootstrapRegistryInstanceSupplier = mockStatic(BootstrapRegistry.InstanceSupplier.class);
			 MockedStatic<ConfigDataEnvironmentContributor> configDataEnvironmentContributor = mockStatic(ConfigDataEnvironmentContributor.class);
			 MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
			 MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
			 MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
			 MockedStatic<Binder> binder = mockStatic(Binder.class)) {
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataEnvironment.class);
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader, classLoader2).when(resourceLoaderMock).getClassLoader();
			binder.when(() -> Binder.get(environmentMock)).thenReturn(binderMock);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
			doReturn(ConfigDataNotFoundAction.FAIL).when(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
			doReturn(bindResultMock2).when(binderMock).bind(eq("spring.config.import"), (Bindable) any());
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
			ConfigDataLocation[] configDataLocationArray2 = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(bindResultMock2).orElse(configDataLocationArray2);
			doReturn(bindResultMock3).when(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
			ConfigDataLocation[] configDataLocationArray3 = new ConfigDataLocation[] { configDataLocationMock2 };
			doReturn(configDataLocationArray3).when(bindResultMock3).orElse(configDataLocationArray2);
			doReturn(bindResultMock4).when(binderMock).bind(eq("spring.config.location"), (Bindable) any());
			ConfigDataLocation[] configDataLocationArray4 = new ConfigDataLocation[] { configDataLocationMock3 };
			ConfigDataLocation configDataLocation = ConfigDataLocation.of("optional:classpath:/;optional:classpath:/config/");
			ConfigDataLocation configDataLocation2 = ConfigDataLocation.of("optional:file:./;optional:file:./config/;optional:file:./config/*/");
			ConfigDataLocation[] configDataLocationArray5 = new ConfigDataLocation[] { configDataLocation, configDataLocation2 };
			doReturn(configDataLocationArray4).when(bindResultMock4).orElse(configDataLocationArray5);
			springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2);
			defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock)).thenReturn(true);
			logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock)).thenReturn(logMessageMock);
			configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock)).thenReturn(configDataEnvironmentContributorMock);
			logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2)).thenReturn(logMessageMock2);
			configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2)).thenReturn(configDataEnvironmentContributorMock2);
			logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3)).thenReturn(logMessageMock3);
			configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3)).thenReturn(configDataEnvironmentContributorMock3);
			configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock)).thenReturn(configDataEnvironmentContributorMock4);
			doReturn(bootstrapRegistryInstanceSupplierMock2).when(bootstrapRegistryInstanceSupplierMock).withScope(BootstrapRegistry.Scope.PROTOTYPE);
			doReturn(bootstrapRegistryInstanceSupplierMock4).when(bootstrapRegistryInstanceSupplierMock3).withScope(BootstrapRegistry.Scope.PROTOTYPE);
			bootstrapRegistryInstanceSupplier.when(() -> BootstrapRegistry.InstanceSupplier.from((Supplier) any())).thenReturn(bootstrapRegistryInstanceSupplierMock).thenReturn(bootstrapRegistryInstanceSupplierMock3).thenReturn(bootstrapRegistryInstanceSupplierMock5);
			doReturn(bootstrapRegistryInstanceSupplierMock6).when(bootstrapRegistryInstanceSupplierMock5).withScope(BootstrapRegistry.Scope.PROTOTYPE);
			Collection<String> collection = new ArrayList<>();
			ConfigDataEnvironment target = new ConfigDataEnvironment(logFactoryMock, bootstrapContextMock, environmentMock, resourceLoaderMock, collection, environmentUpdateListenerMock);
			doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
			doReturn(1).when(mutablePropertySourcesMock).size();
			doReturn(null).when(mutablePropertySourcesMock).iterator();
			doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock2);
			doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock4);
			doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock6);
			//Act Statement(s)
			final InactiveConfigDataAccessException result = assertThrows(InactiveConfigDataAccessException.class, () -> {
				target.processAndApply();
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(logFactoryMock).getLog(ConfigDataEnvironment.class);
				verify(resourceLoaderMock, times(2)).getClassLoader();
				binder.verify(() -> Binder.get(environmentMock), atLeast(1));
				verify(binderMock).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
				verify(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
				verify(binderMock).bind(eq("spring.config.import"), (Bindable) any());
				verify(bindResultMock2).orElse(configDataLocationArray2);
				verify(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
				verify(bindResultMock3).orElse(configDataLocationArray2);
				verify(binderMock).bind(eq("spring.config.location"), (Bindable) any());
				verify(bindResultMock4).orElse(configDataLocationArray5);
				springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(2));
				defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock), atLeast(1));
				logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock), atLeast(1));
				configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock), atLeast(1));
				logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2), atLeast(1));
				configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2), atLeast(1));
				logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3), atLeast(1));
				configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3), atLeast(1));
				configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock), atLeast(1));
				bootstrapRegistryInstanceSupplier.verify(() -> BootstrapRegistry.InstanceSupplier.from((Supplier) any()), atLeast(3));
				verify(bootstrapRegistryInstanceSupplierMock).withScope(BootstrapRegistry.Scope.PROTOTYPE);
				verify(bootstrapRegistryInstanceSupplierMock3).withScope(BootstrapRegistry.Scope.PROTOTYPE);
				verify(bootstrapRegistryInstanceSupplierMock5).withScope(BootstrapRegistry.Scope.PROTOTYPE);
				verify(environmentMock).getPropertySources();
				verify(mutablePropertySourcesMock).size();
				verify(mutablePropertySourcesMock).iterator();
				verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock2);
				verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock4);
				verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock6);
			});
		}
	}

	//Sapient generated method id: ${87c76203-0888-3b2f-8e34-ac53d19d22e9}, hash: F744D40DCD07E353EB2C4309CA5F09D2
	@Test()
	void processAndApplyWhenCaughtBindExceptionAndExGetCauseNotInstanceOfInactiveConfigDataAccessExceptionThrowsBindException() {
		/* Branches:
		 * (for-each(contributors)) : true  #  inside getIncludedProfiles method
		 * (source != null) : true  #  inside getIncludedProfiles method
		 * (!contributor.hasConfigDataOption(ConfigData.Option.IGNORE_PROFILES)) : true  #  inside getIncludedProfiles method
		 * (catch-exception (BindException)) : true  #  inside withProfiles method
		 * (ex.getCause() instanceof InactiveConfigDataAccessException inactiveException) : false  #  inside withProfiles method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
	    /*try (MockedStatic<BootstrapRegistry.InstanceSupplier> bootstrapRegistryInstanceSupplier = mockStatic(BootstrapRegistry.InstanceSupplier.class);
    MockedStatic<ConfigDataEnvironmentContributor> configDataEnvironmentContributor = mockStatic(ConfigDataEnvironmentContributor.class);
    MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
    MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource = mockStatic(DefaultPropertiesPropertySource.class);
    MockedStatic<SpringFactoriesLoader> springFactoriesLoader = mockStatic(SpringFactoriesLoader.class);
    MockedStatic<Binder> binder = mockStatic(Binder.class)) {
    NoOpLog noOpLog = new NoOpLog();
    doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataEnvironment.class);
    ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
    ClassLoader classLoader2 = ClassLoader.getPlatformClassLoader();
    doReturn(classLoader, classLoader2).when(resourceLoaderMock).getClassLoader();
    binder.when(() -> Binder.get(environmentMock)).thenReturn(binderMock);
    doReturn(bindResultMock).when(binderMock).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
    doReturn(ConfigDataNotFoundAction.FAIL).when(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
    doReturn(bindResultMock2).when(binderMock).bind(eq("spring.config.import"), (Bindable) any());
    ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] { configDataLocationMock };
    ConfigDataLocation[] configDataLocationArray2 = new ConfigDataLocation[] {};
    doReturn(configDataLocationArray).when(bindResultMock2).orElse(configDataLocationArray2);
    doReturn(bindResultMock3).when(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
    ConfigDataLocation[] configDataLocationArray3 = new ConfigDataLocation[] { configDataLocationMock2 };
    doReturn(configDataLocationArray3).when(bindResultMock3).orElse(configDataLocationArray2);
    doReturn(bindResultMock4).when(binderMock).bind(eq("spring.config.location"), (Bindable) any());
    ConfigDataLocation[] configDataLocationArray4 = new ConfigDataLocation[] { configDataLocationMock3 };
    ConfigDataLocation configDataLocation = ConfigDataLocation.of("optional:classpath:/;optional:classpath:/config/");
    ConfigDataLocation configDataLocation2 = ConfigDataLocation.of("optional:file:./;optional:file:./config/;optional:file:./config/*/
//		");
//		ConfigDataLocation[] configDataLocationArray5 = new ConfigDataLocation[] { configDataLocation, configDataLocation2 };
//		doReturn(configDataLocationArray4).when(bindResultMock4).orElse(configDataLocationArray5);
//		springFactoriesLoader.when(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2);
//		defaultPropertiesPropertySource.when(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock)).thenReturn(true);
//		logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock)).thenReturn(logMessageMock);
//		configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock)).thenReturn(configDataEnvironmentContributorMock);
//		logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2)).thenReturn(logMessageMock2);
//		configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2)).thenReturn(configDataEnvironmentContributorMock2);
//		logMessage.when(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3)).thenReturn(logMessageMock3);
//		configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3)).thenReturn(configDataEnvironmentContributorMock3);
//		configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock)).thenReturn(configDataEnvironmentContributorMock4);
//		doReturn(bootstrapRegistryInstanceSupplierMock2).when(bootstrapRegistryInstanceSupplierMock).withScope(BootstrapRegistry.Scope.PROTOTYPE);
//		doReturn(bootstrapRegistryInstanceSupplierMock4).when(bootstrapRegistryInstanceSupplierMock3).withScope(BootstrapRegistry.Scope.PROTOTYPE);
//		bootstrapRegistryInstanceSupplier.when(() -> BootstrapRegistry.InstanceSupplier.from((Supplier) any())).thenReturn(bootstrapRegistryInstanceSupplierMock).thenReturn(bootstrapRegistryInstanceSupplierMock3).thenReturn(bootstrapRegistryInstanceSupplierMock5);
//		doReturn(bootstrapRegistryInstanceSupplierMock6).when(bootstrapRegistryInstanceSupplierMock5).withScope(BootstrapRegistry.Scope.PROTOTYPE);
//		Collection<String> collection = new ArrayList<>();
//		ConfigDataEnvironment target = new ConfigDataEnvironment(logFactoryMock, bootstrapContextMock, environmentMock, resourceLoaderMock, collection, environmentUpdateListenerMock);
//		doReturn(mutablePropertySourcesMock).when(environmentMock).getPropertySources();
//		doReturn(1).when(mutablePropertySourcesMock).size();
//		doReturn(null).when(mutablePropertySourcesMock).iterator();
//		doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock2);
//		doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock4);
//		doNothing().when(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock6);
//		//Act Statement(s)
//		target.processAndApply();
//		//Assert statement(s)
//		assertAll("result", () -> {
//			assertThat(result, is(notNullValue()));
//			verify(logFactoryMock).getLog(ConfigDataEnvironment.class);
//			verify(resourceLoaderMock, times(2)).getClassLoader();
//			binder.verify(() -> Binder.get(environmentMock), atLeast(1));
//			verify(binderMock).bind("spring.config.on-not-found", ConfigDataNotFoundAction.class);
//			verify(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
//			verify(binderMock).bind(eq("spring.config.import"), (Bindable) any());
//			verify(bindResultMock2).orElse(configDataLocationArray2);
//			verify(binderMock).bind(eq("spring.config.additional-location"), (Bindable) any());
//			verify(bindResultMock3).orElse(configDataLocationArray2);
//			verify(binderMock).bind(eq("spring.config.location"), (Bindable) any());
//			verify(bindResultMock4).orElse(configDataLocationArray5);
//			springFactoriesLoader.verify(() -> SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader) any()), atLeast(2));
//			defaultPropertiesPropertySource.verify(() -> DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock), atLeast(1));
//			logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock), atLeast(1));
//			configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock), atLeast(1));
//			logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock2), atLeast(1));
//			configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2), atLeast(1));
//			logMessage.verify(() -> LogMessage.format("Adding initial config data import from location '%s'", configDataLocationMock3), atLeast(1));
//			configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3), atLeast(1));
//			configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofExisting(propertySourceMock), atLeast(1));
//			bootstrapRegistryInstanceSupplier.verify(() -> BootstrapRegistry.InstanceSupplier.from((Supplier) any()), atLeast(3));
//			verify(bootstrapRegistryInstanceSupplierMock).withScope(BootstrapRegistry.Scope.PROTOTYPE);
//			verify(bootstrapRegistryInstanceSupplierMock3).withScope(BootstrapRegistry.Scope.PROTOTYPE);
//			verify(bootstrapRegistryInstanceSupplierMock5).withScope(BootstrapRegistry.Scope.PROTOTYPE);
//			verify(environmentMock).getPropertySources();
//			verify(mutablePropertySourcesMock).size();
//			verify(mutablePropertySourcesMock).iterator();
//			verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock2);
//			verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock4);
//			verify(bootstrapContextMock).register(Binder.class, bootstrapRegistryInstanceSupplierMock6);
//		});
//	}*/
		}

//Sapient generated method id: ${abacdc5c-08db-310f-ae50-32be1716fe75}, hash: 7D365C8F4F43BFD0F85ADC1FD5D6A6BF
@Test()
	void processAndApplyWhenContributorNotIsActiveActivationContext(){
			/* Branches:
			 * (for-each(contributors)) : true  #  inside getIncludedProfiles method
			 * (source != null) : true  #  inside getIncludedProfiles method
			 * (!contributor.hasConfigDataOption(ConfigData.Option.IGNORE_PROFILES)) : true  #  inside getIncludedProfiles method
			 * (for-each(contributors)) : true  #  inside checkForInvalidProperties method
			 * (for-each(contributors)) : true  #  inside checkMandatoryLocations method
			 * (contributor.isActive(activationContext)) : true  #  inside checkMandatoryLocations method
			 * (for-each(imports)) : true  #  inside getMandatoryImports method
			 * (!location.isOptional()) : true  #  inside getMandatoryImports method
			 * (for-each(contributors)) : true  #  inside checkMandatoryLocations method
			 * (contributor.getLocation() != null) : true  #  inside checkMandatoryLocations method
			 * (!mandatoryLocations.isEmpty()) : true  #  inside checkMandatoryLocations method
			 * (for-each(mandatoryLocations)) : true  #  inside checkMandatoryLocations method
			 * (for-each(contributors)) : true  #  inside applyContributor method
			 * (contributor.getKind() == ConfigDataEnvironmentContributor.Kind.BOUND_IMPORT) : true  #  inside applyContributor method
			 * (propertySource != null) : true  #  inside applyContributor method
			 * (!contributor.isActive(activationContext)) : true  #  inside applyContributor method
			 *
			 * TODO: Help needed! This method is not unit testable!
			 *  Following variables could not be isolated/mocked: importer
			 *  Suggestions:
			 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
			 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
			 *  The test code, including the assertion statements, has been successfully generated.
			 */
			//Arrange Statement(s)
			try(MockedStatic<StringUtils> stringUtils=mockStatic(StringUtils.class);
		MockedStatic<LogMessage> logMessage=mockStatic(LogMessage.class);
		MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource=mockStatic(DefaultPropertiesPropertySource.class);
		MockedStatic<InvalidConfigDataPropertyException> invalidConfigDataPropertyException=mockStatic(InvalidConfigDataPropertyException.class);
		MockedStatic<BootstrapRegistry.InstanceSupplier>bootstrapRegistryInstanceSupplier=mockStatic(BootstrapRegistry.InstanceSupplier.class);
		MockedStatic<ConfigDataEnvironmentContributor> configDataEnvironmentContributor=mockStatic(ConfigDataEnvironmentContributor.class);
		MockedStatic<SpringFactoriesLoader> springFactoriesLoader=mockStatic(SpringFactoriesLoader.class);
		MockedStatic<Binder> binder=mockStatic(Binder.class)){
		NoOpLog noOpLog=new NoOpLog();
		doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataEnvironment.class);
		ClassLoader classLoader=ClassLoader.getPlatformClassLoader();
		ClassLoader classLoader2=ClassLoader.getPlatformClassLoader();
		doReturn(classLoader,classLoader2).when(resourceLoaderMock).getClassLoader();
		binder.when(()->Binder.get(environmentMock)).thenReturn(binderMock);
		doReturn(bindResultMock).when(binderMock).bind("spring.config.on-not-found",ConfigDataNotFoundAction.class);
		doReturn(ConfigDataNotFoundAction.FAIL).when(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
		doReturn(bindResultMock2).when(binderMock).bind(eq("spring.config.import"),(Bindable)any());
		ConfigDataLocation[]configDataLocationArray=new ConfigDataLocation[]{};
		ConfigDataLocation[]configDataLocationArray2=new ConfigDataLocation[]{};
		doReturn(configDataLocationArray).when(bindResultMock2).orElse(configDataLocationArray2);
		doReturn(bindResultMock3).when(binderMock).bind(eq("spring.config.additional-location"),(Bindable)any());
		ConfigDataLocation[]configDataLocationArray3=new ConfigDataLocation[]{};
		doReturn(configDataLocationArray3).when(bindResultMock3).orElse(configDataLocationArray2);
		doReturn(bindResultMock4).when(binderMock).bind(eq("spring.config.location"),(Bindable)any());
		ConfigDataLocation[]configDataLocationArray4=new ConfigDataLocation[]{};
		ConfigDataLocation configDataLocation=ConfigDataLocation.of("optional:classpath:/;optional:classpath:/config/");
		ConfigDataLocation configDataLocation2=ConfigDataLocation.of("optional:file:./;optional:file:./config/;optional:file:./config/*/");
		ConfigDataLocation[]configDataLocationArray5=new ConfigDataLocation[]{configDataLocation,configDataLocation2};
		doReturn(configDataLocationArray4).when(bindResultMock4).orElse(configDataLocationArray5);
		springFactoriesLoader.when(()->SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader)any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2);
		defaultPropertiesPropertySource.when(()->DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock)).thenReturn(false);
		logMessage.when(()->LogMessage.format("Adding initial config data import from location '%s'",configDataLocationMock)).thenReturn(logMessageMock);
		configDataEnvironmentContributor.when(()->ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock)).thenReturn(configDataEnvironmentContributorMock);
		logMessage.when(()->LogMessage.format("Adding initial config data import from location '%s'",configDataLocationMock2)).thenReturn(logMessageMock2);
		configDataEnvironmentContributor.when(()->ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2)).thenReturn(configDataEnvironmentContributorMock2);
		logMessage.when(()->LogMessage.format("Adding initial config data import from location '%s'",configDataLocationMock3)).thenReturn(logMessageMock3);
		configDataEnvironmentContributor.when(()->ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3)).thenReturn(configDataEnvironmentContributorMock3);
		configDataEnvironmentContributor.when(()->ConfigDataEnvironmentContributor.ofExisting(propertySourceMock)).thenReturn(configDataEnvironmentContributorMock4);
		doReturn(bootstrapRegistryInstanceSupplierMock2).when(bootstrapRegistryInstanceSupplierMock).withScope(BootstrapRegistry.Scope.PROTOTYPE);
		doReturn(bootstrapRegistryInstanceSupplierMock4).when(bootstrapRegistryInstanceSupplierMock3).withScope(BootstrapRegistry.Scope.PROTOTYPE);
		doReturn(bootstrapRegistryInstanceSupplierMock6).when(bootstrapRegistryInstanceSupplierMock5).withScope(BootstrapRegistry.Scope.PROTOTYPE);
		bootstrapRegistryInstanceSupplier.when(()->BootstrapRegistry.InstanceSupplier.from((Supplier)any())).thenReturn(bootstrapRegistryInstanceSupplierMock).thenReturn(bootstrapRegistryInstanceSupplierMock3).thenReturn(bootstrapRegistryInstanceSupplierMock5).thenReturn(bootstrapRegistryInstanceSupplierMock7);
		doReturn(bootstrapRegistryInstanceSupplierMock8).when(bootstrapRegistryInstanceSupplierMock7).withScope(BootstrapRegistry.Scope.PROTOTYPE);
		invalidConfigDataPropertyException.when(()->InvalidConfigDataPropertyException.throwIfPropertyFound(configDataEnvironmentContributorMock5)).thenAnswer((Answer<Void>)invocation->null);
		logMessage.when(()->LogMessage.format("Skipping inactive property source '%s'","name1")).thenReturn(logMessageMock4);
		defaultPropertiesPropertySource.when(()->DefaultPropertiesPropertySource.moveToEnd(mutablePropertySourcesMock)).thenAnswer((Answer<Void>)invocation->null);
		logMessage.when(()->LogMessage.format(eq("Setting default profiles: %s"),anyList())).thenReturn(logMessageMock5);
		String[]stringArray=new String[]{};
		logMessage.when(()->LogMessage.format(eq("Setting active profiles: %s"),anyList())).thenReturn(logMessageMock6);
		String[]stringArray2=new String[]{};
		stringUtils.when(()->StringUtils.toStringArray(anyList())).thenReturn(stringArray).thenReturn(stringArray2);
		Collection<String> collection=new ArrayList<>();
		ConfigDataEnvironment target=new ConfigDataEnvironment(logFactoryMock,bootstrapContextMock,environmentMock,resourceLoaderMock,collection,environmentUpdateListenerMock);
		doReturn(0).when(mutablePropertySourcesMock2).size();
		doReturn(null).when(mutablePropertySourcesMock2).iterator();
		doNothing().when(bootstrapContextMock).register(Binder.class,bootstrapRegistryInstanceSupplierMock2);
		doNothing().when(bootstrapContextMock).register(Binder.class,bootstrapRegistryInstanceSupplierMock4);
		doNothing().when(bootstrapContextMock).register(Binder.class,bootstrapRegistryInstanceSupplierMock6);
		doNothing().when(bootstrapContextMock).register(Binder.class,bootstrapRegistryInstanceSupplierMock8);
		doReturn(mutablePropertySourcesMock2,mutablePropertySourcesMock).when(environmentMock).getPropertySources();
		doNothing().when(environmentMock).setDefaultProfiles(stringArray);
		doNothing().when(environmentMock).setActiveProfiles(stringArray2);
		doNothing().when(environmentUpdateListenerMock).onSetProfiles(profilesMock);
		List<String> stringList=new ArrayList<>();
		List<String> stringList2=new ArrayList<>();
		doReturn(stringList,stringList2).when(profilesMock).getDefault();
		List<String> stringList3=new ArrayList<>();
		List<String> stringList4=new ArrayList<>();
		doReturn(stringList3,stringList4).when(profilesMock).getActive();
		//Act Statement(s)
		target.processAndApply();
		//Assert statement(s)
		assertAll("result",()->{
		verify(logFactoryMock).getLog(ConfigDataEnvironment.class);
		verify(resourceLoaderMock,times(2)).getClassLoader();
		binder.verify(()->Binder.get(environmentMock),atLeast(1));
		verify(binderMock).bind("spring.config.on-not-found",ConfigDataNotFoundAction.class);
		verify(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
		verify(binderMock).bind(eq("spring.config.import"),(Bindable)any());
		verify(bindResultMock2).orElse(configDataLocationArray2);
		verify(binderMock).bind(eq("spring.config.additional-location"),(Bindable)any());
		verify(bindResultMock3).orElse(configDataLocationArray2);
		verify(binderMock).bind(eq("spring.config.location"),(Bindable)any());
		verify(bindResultMock4).orElse(configDataLocationArray5);
		springFactoriesLoader.verify(()->SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader)any()),atLeast(2));
		defaultPropertiesPropertySource.verify(()->DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock),atLeast(1));
		logMessage.verify(()->LogMessage.format("Adding initial config data import from location '%s'",configDataLocationMock),atLeast(1));
		configDataEnvironmentContributor.verify(()->ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock),atLeast(1));
		logMessage.verify(()->LogMessage.format("Adding initial config data import from location '%s'",configDataLocationMock2),atLeast(1));
		configDataEnvironmentContributor.verify(()->ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2),atLeast(1));
		logMessage.verify(()->LogMessage.format("Adding initial config data import from location '%s'",configDataLocationMock3),atLeast(1));
		configDataEnvironmentContributor.verify(()->ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3),atLeast(1));
		configDataEnvironmentContributor.verify(()->ConfigDataEnvironmentContributor.ofExisting(propertySourceMock),atLeast(1));
		bootstrapRegistryInstanceSupplier.verify(()->BootstrapRegistry.InstanceSupplier.from((Supplier)any()),atLeast(4));
		verify(bootstrapRegistryInstanceSupplierMock).withScope(BootstrapRegistry.Scope.PROTOTYPE);
		verify(bootstrapRegistryInstanceSupplierMock3).withScope(BootstrapRegistry.Scope.PROTOTYPE);
		verify(bootstrapRegistryInstanceSupplierMock5).withScope(BootstrapRegistry.Scope.PROTOTYPE);
		verify(bootstrapRegistryInstanceSupplierMock7).withScope(BootstrapRegistry.Scope.PROTOTYPE);
		invalidConfigDataPropertyException.verify(()->InvalidConfigDataPropertyException.throwIfPropertyFound(configDataEnvironmentContributorMock5),atLeast(1));
		logMessage.verify(()->LogMessage.format("Skipping inactive property source '%s'","name1"),atLeast(1));
		defaultPropertiesPropertySource.verify(()->DefaultPropertiesPropertySource.moveToEnd(mutablePropertySourcesMock),atLeast(1));
		logMessage.verify(()->LogMessage.format(eq("Setting default profiles: %s"),anyList()));
		stringUtils.verify(()->StringUtils.toStringArray(anyList()),atLeast(2));
		logMessage.verify(()->LogMessage.format(eq("Setting active profiles: %s"),anyList()));
		verify(environmentMock,times(2)).getPropertySources();
		verify(mutablePropertySourcesMock2).size();
		verify(mutablePropertySourcesMock2).iterator();
		verify(bootstrapContextMock).register(Binder.class,bootstrapRegistryInstanceSupplierMock2);
		verify(bootstrapContextMock).register(Binder.class,bootstrapRegistryInstanceSupplierMock4);
		verify(bootstrapContextMock).register(Binder.class,bootstrapRegistryInstanceSupplierMock6);
		verify(bootstrapContextMock).register(Binder.class,bootstrapRegistryInstanceSupplierMock8);
		verify(environmentMock).setDefaultProfiles(stringArray);
		verify(environmentMock).setActiveProfiles(stringArray2);
		verify(environmentUpdateListenerMock).onSetProfiles(profilesMock);
		verify(profilesMock,times(2)).getDefault();
		verify(profilesMock,times(2)).getActive();
		});
		}
		}

//Sapient generated method id: ${afb95b61-a7c6-39e1-807f-36b28ddfab0c}, hash: D612C2611EA7B024A097F3694480C6F0
@Test()
	void processAndApplyWhenContributorIsActiveActivationContext(){
			/* Branches:
			 * (for-each(contributors)) : true  #  inside getIncludedProfiles method
			 * (source != null) : true  #  inside getIncludedProfiles method
			 * (!contributor.hasConfigDataOption(ConfigData.Option.IGNORE_PROFILES)) : true  #  inside getIncludedProfiles method
			 * (for-each(contributors)) : true  #  inside checkForInvalidProperties method
			 * (for-each(contributors)) : true  #  inside checkMandatoryLocations method
			 * (contributor.isActive(activationContext)) : true  #  inside checkMandatoryLocations method
			 * (for-each(imports)) : true  #  inside getMandatoryImports method
			 * (!location.isOptional()) : true  #  inside getMandatoryImports method
			 * (for-each(contributors)) : true  #  inside checkMandatoryLocations method
			 * (contributor.getLocation() != null) : true  #  inside checkMandatoryLocations method
			 * (!mandatoryLocations.isEmpty()) : true  #  inside checkMandatoryLocations method
			 * (for-each(mandatoryLocations)) : true  #  inside checkMandatoryLocations method
			 * (for-each(contributors)) : true  #  inside applyContributor method
			 * (contributor.getKind() == ConfigDataEnvironmentContributor.Kind.BOUND_IMPORT) : true  #  inside applyContributor method
			 * (propertySource != null) : true  #  inside applyContributor method
			 * (!contributor.isActive(activationContext)) : false  #  inside applyContributor method
			 *
			 * TODO: Help needed! This method is not unit testable!
			 *  Following variables could not be isolated/mocked: importer
			 *  Suggestions:
			 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
			 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
			 *  The test code, including the assertion statements, has been successfully generated.
			 */
			//Arrange Statement(s)
			ConfigDataLocation configDataLocationMock4=mock(ConfigDataLocation.class);
		ConfigDataResource configDataResourceMock=mock(ConfigDataResource.class);
		try(MockedStatic<StringUtils> stringUtils=mockStatic(StringUtils.class);
		MockedStatic<LogMessage> logMessage=mockStatic(LogMessage.class);
		MockedStatic<DefaultPropertiesPropertySource> defaultPropertiesPropertySource=mockStatic(DefaultPropertiesPropertySource.class);
		MockedStatic<InvalidConfigDataPropertyException> invalidConfigDataPropertyException=mockStatic(InvalidConfigDataPropertyException.class);
		MockedStatic<BootstrapRegistry.InstanceSupplier>bootstrapRegistryInstanceSupplier=mockStatic(BootstrapRegistry.InstanceSupplier.class);
		MockedStatic<ConfigDataEnvironmentContributor> configDataEnvironmentContributor=mockStatic(ConfigDataEnvironmentContributor.class);
		MockedStatic<SpringFactoriesLoader> springFactoriesLoader=mockStatic(SpringFactoriesLoader.class);
		MockedStatic<Binder> binder=mockStatic(Binder.class)){
		NoOpLog noOpLog=new NoOpLog();
		doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataEnvironment.class);
		ClassLoader classLoader=ClassLoader.getPlatformClassLoader();
		ClassLoader classLoader2=ClassLoader.getPlatformClassLoader();
		doReturn(classLoader,classLoader2).when(resourceLoaderMock).getClassLoader();
		binder.when(()->Binder.get(environmentMock)).thenReturn(binderMock);
		doReturn(bindResultMock).when(binderMock).bind("spring.config.on-not-found",ConfigDataNotFoundAction.class);
		doReturn(ConfigDataNotFoundAction.FAIL).when(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
		doReturn(bindResultMock2).when(binderMock).bind(eq("spring.config.import"),(Bindable)any());
		ConfigDataLocation[]configDataLocationArray=new ConfigDataLocation[]{};
		ConfigDataLocation[]configDataLocationArray2=new ConfigDataLocation[]{};
		doReturn(configDataLocationArray).when(bindResultMock2).orElse(configDataLocationArray2);
		doReturn(bindResultMock3).when(binderMock).bind(eq("spring.config.additional-location"),(Bindable)any());
		ConfigDataLocation[]configDataLocationArray3=new ConfigDataLocation[]{};
		doReturn(configDataLocationArray3).when(bindResultMock3).orElse(configDataLocationArray2);
		doReturn(bindResultMock4).when(binderMock).bind(eq("spring.config.location"),(Bindable)any());
		ConfigDataLocation[]configDataLocationArray4=new ConfigDataLocation[]{};
		ConfigDataLocation configDataLocation=ConfigDataLocation.of("optional:classpath:/;optional:classpath:/config/");
		ConfigDataLocation configDataLocation2=ConfigDataLocation.of("optional:file:./;optional:file:./config/;optional:file:./config/*/");
		ConfigDataLocation[]configDataLocationArray5=new ConfigDataLocation[]{configDataLocation,configDataLocation2};
		doReturn(configDataLocationArray4).when(bindResultMock4).orElse(configDataLocationArray5);
		springFactoriesLoader.when(()->SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader)any())).thenReturn(springFactoriesLoaderMock).thenReturn(springFactoriesLoaderMock2);
		defaultPropertiesPropertySource.when(()->DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock)).thenReturn(false);
		logMessage.when(()->LogMessage.format("Adding initial config data import from location '%s'",configDataLocationMock)).thenReturn(logMessageMock);
		configDataEnvironmentContributor.when(()->ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock)).thenReturn(configDataEnvironmentContributorMock);
		logMessage.when(()->LogMessage.format("Adding initial config data import from location '%s'",configDataLocationMock2)).thenReturn(logMessageMock2);
		configDataEnvironmentContributor.when(()->ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2)).thenReturn(configDataEnvironmentContributorMock2);
		logMessage.when(()->LogMessage.format("Adding initial config data import from location '%s'",configDataLocationMock3)).thenReturn(logMessageMock3);
		configDataEnvironmentContributor.when(()->ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3)).thenReturn(configDataEnvironmentContributorMock3);
		configDataEnvironmentContributor.when(()->ConfigDataEnvironmentContributor.ofExisting(propertySourceMock)).thenReturn(configDataEnvironmentContributorMock4);
		doReturn(bootstrapRegistryInstanceSupplierMock2).when(bootstrapRegistryInstanceSupplierMock).withScope(BootstrapRegistry.Scope.PROTOTYPE);
		doReturn(bootstrapRegistryInstanceSupplierMock4).when(bootstrapRegistryInstanceSupplierMock3).withScope(BootstrapRegistry.Scope.PROTOTYPE);
		doReturn(bootstrapRegistryInstanceSupplierMock6).when(bootstrapRegistryInstanceSupplierMock5).withScope(BootstrapRegistry.Scope.PROTOTYPE);
		bootstrapRegistryInstanceSupplier.when(()->BootstrapRegistry.InstanceSupplier.from((Supplier)any())).thenReturn(bootstrapRegistryInstanceSupplierMock).thenReturn(bootstrapRegistryInstanceSupplierMock3).thenReturn(bootstrapRegistryInstanceSupplierMock5).thenReturn(bootstrapRegistryInstanceSupplierMock7);
		doReturn(bootstrapRegistryInstanceSupplierMock8).when(bootstrapRegistryInstanceSupplierMock7).withScope(BootstrapRegistry.Scope.PROTOTYPE);
		invalidConfigDataPropertyException.when(()->InvalidConfigDataPropertyException.throwIfPropertyFound(configDataEnvironmentContributorMock5)).thenAnswer((Answer<Void>)invocation->null);
		logMessage.when(()->LogMessage.format("Adding imported property source '%s'","name1")).thenReturn(logMessageMock4);
		defaultPropertiesPropertySource.when(()->DefaultPropertiesPropertySource.moveToEnd(mutablePropertySourcesMock)).thenAnswer((Answer<Void>)invocation->null);
		doNothing().when(mutablePropertySourcesMock).addLast((PropertySource)any());
		logMessage.when(()->LogMessage.format(eq("Setting default profiles: %s"),anyList())).thenReturn(logMessageMock5);
		String[]stringArray=new String[]{};
		logMessage.when(()->LogMessage.format(eq("Setting active profiles: %s"),anyList())).thenReturn(logMessageMock6);
		String[]stringArray2=new String[]{};
		stringUtils.when(()->StringUtils.toStringArray(anyList())).thenReturn(stringArray).thenReturn(stringArray2);
		Collection<String> collection=new ArrayList<>();
		ConfigDataEnvironment target=new ConfigDataEnvironment(logFactoryMock,bootstrapContextMock,environmentMock,resourceLoaderMock,collection,environmentUpdateListenerMock);
		doReturn(0).when(mutablePropertySourcesMock2).size();
		doReturn(null).when(mutablePropertySourcesMock2).iterator();
		doNothing().when(bootstrapContextMock).register(Binder.class,bootstrapRegistryInstanceSupplierMock2);
		doNothing().when(bootstrapContextMock).register(Binder.class,bootstrapRegistryInstanceSupplierMock4);
		doNothing().when(bootstrapContextMock).register(Binder.class,bootstrapRegistryInstanceSupplierMock6);
		doNothing().when(bootstrapContextMock).register(Binder.class,bootstrapRegistryInstanceSupplierMock8);
		doReturn(mutablePropertySourcesMock2,mutablePropertySourcesMock).when(environmentMock).getPropertySources();
		doNothing().when(environmentUpdateListenerMock).onPropertySourceAdded((PropertySource)any(),eq(configDataLocationMock4),eq(configDataResourceMock));
		doNothing().when(environmentMock).setDefaultProfiles(stringArray);
		doNothing().when(environmentMock).setActiveProfiles(stringArray2);
		doNothing().when(environmentUpdateListenerMock).onSetProfiles(profilesMock);
		List<String> stringList=new ArrayList<>();
		List<String> stringList2=new ArrayList<>();
		doReturn(stringList,stringList2).when(profilesMock).getDefault();
		List<String> stringList3=new ArrayList<>();
		List<String> stringList4=new ArrayList<>();
		doReturn(stringList3,stringList4).when(profilesMock).getActive();
		//Act Statement(s)
		target.processAndApply();
		//Assert statement(s)
		assertAll("result",()->{
		verify(logFactoryMock).getLog(ConfigDataEnvironment.class);
		verify(resourceLoaderMock,times(2)).getClassLoader();
		binder.verify(()->Binder.get(environmentMock),atLeast(1));
		verify(binderMock).bind("spring.config.on-not-found",ConfigDataNotFoundAction.class);
		verify(bindResultMock).orElse(ConfigDataNotFoundAction.FAIL);
		verify(binderMock).bind(eq("spring.config.import"),(Bindable)any());
		verify(bindResultMock2).orElse(configDataLocationArray2);
		verify(binderMock).bind(eq("spring.config.additional-location"),(Bindable)any());
		verify(bindResultMock3).orElse(configDataLocationArray2);
		verify(binderMock).bind(eq("spring.config.location"),(Bindable)any());
		verify(bindResultMock4).orElse(configDataLocationArray5);
		springFactoriesLoader.verify(()->SpringFactoriesLoader.forDefaultResourceLocation((ClassLoader)any()),atLeast(2));
		defaultPropertiesPropertySource.verify(()->DefaultPropertiesPropertySource.hasMatchingName(propertySourceMock),atLeast(1));
		logMessage.verify(()->LogMessage.format("Adding initial config data import from location '%s'",configDataLocationMock),atLeast(1));
		configDataEnvironmentContributor.verify(()->ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock),atLeast(1));
		logMessage.verify(()->LogMessage.format("Adding initial config data import from location '%s'",configDataLocationMock2),atLeast(1));
		configDataEnvironmentContributor.verify(()->ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock2),atLeast(1));
		logMessage.verify(()->LogMessage.format("Adding initial config data import from location '%s'",configDataLocationMock3),atLeast(1));
		configDataEnvironmentContributor.verify(()->ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock3),atLeast(1));
		configDataEnvironmentContributor.verify(()->ConfigDataEnvironmentContributor.ofExisting(propertySourceMock),atLeast(1));
		bootstrapRegistryInstanceSupplier.verify(()->BootstrapRegistry.InstanceSupplier.from((Supplier)any()),atLeast(4));
		verify(bootstrapRegistryInstanceSupplierMock).withScope(BootstrapRegistry.Scope.PROTOTYPE);
		verify(bootstrapRegistryInstanceSupplierMock3).withScope(BootstrapRegistry.Scope.PROTOTYPE);
		verify(bootstrapRegistryInstanceSupplierMock5).withScope(BootstrapRegistry.Scope.PROTOTYPE);
		verify(bootstrapRegistryInstanceSupplierMock7).withScope(BootstrapRegistry.Scope.PROTOTYPE);
		invalidConfigDataPropertyException.verify(()->InvalidConfigDataPropertyException.throwIfPropertyFound(configDataEnvironmentContributorMock5),atLeast(1));
		logMessage.verify(()->LogMessage.format("Adding imported property source '%s'","name1"),atLeast(1));
		defaultPropertiesPropertySource.verify(()->DefaultPropertiesPropertySource.moveToEnd(mutablePropertySourcesMock),atLeast(1));
		verify(mutablePropertySourcesMock).addLast((PropertySource)any());
		logMessage.verify(()->LogMessage.format(eq("Setting default profiles: %s"),anyList()));
		stringUtils.verify(()->StringUtils.toStringArray(anyList()),atLeast(2));
		logMessage.verify(()->LogMessage.format(eq("Setting active profiles: %s"),anyList()));
		verify(environmentMock,times(2)).getPropertySources();
		verify(mutablePropertySourcesMock2).size();
		verify(mutablePropertySourcesMock2).iterator();
		verify(bootstrapContextMock).register(Binder.class,bootstrapRegistryInstanceSupplierMock2);
		verify(bootstrapContextMock).register(Binder.class,bootstrapRegistryInstanceSupplierMock4);
		verify(bootstrapContextMock).register(Binder.class,bootstrapRegistryInstanceSupplierMock6);
		verify(bootstrapContextMock).register(Binder.class,bootstrapRegistryInstanceSupplierMock8);
		verify(environmentUpdateListenerMock).onPropertySourceAdded((PropertySource)any(),eq(configDataLocationMock4),eq(configDataResourceMock));
		verify(environmentMock).setDefaultProfiles(stringArray);
		verify(environmentMock).setActiveProfiles(stringArray2);
		verify(environmentUpdateListenerMock).onSetProfiles(profilesMock);
		verify(profilesMock,times(2)).getDefault();
		verify(profilesMock,times(2)).getActive();
		});
		}
		}
		}