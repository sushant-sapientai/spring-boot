package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.core.log.LogMessage;
import org.springframework.core.env.PropertySource;

import java.util.Map;

import org.springframework.boot.ConfigurableBootstrapContext;

import java.util.HashMap;

import org.springframework.boot.logging.DeferredLogFactory;

import java.util.ArrayList;

import org.apache.commons.logging.impl.NoOpLog;

import java.util.Iterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
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
class ConfigDataEnvironmentContributorsSapientGeneratedTest {

	private final ConfigDataEnvironmentContributor rootMock = mock(ConfigDataEnvironmentContributor.class, "root");

	private final ConfigDataActivationContext configDataActivationContextMock = mock(ConfigDataActivationContext.class);

	private final ConfigDataEnvironmentContributor configDataEnvironmentContributorMock = mock(ConfigDataEnvironmentContributor.class);

	private final ConfigDataImporter configDataImporterMock = mock(ConfigDataImporter.class);

	private final ConfigDataLocation configDataLocationMock = mock(ConfigDataLocation.class);

	private final ConfigData configDataMock = mock(ConfigData.class);

	private final ConfigDataResolutionResult configDataResolutionResultMock = mock(ConfigDataResolutionResult.class);

	private final ConfigDataResource configDataResourceMock = mock(ConfigDataResource.class);

	private final ConfigurableBootstrapContext configurableBootstrapContextMock = mock(ConfigurableBootstrapContext.class);

	private final ConfigDataImporter importerMock = mock(ConfigDataImporter.class);

	private final DeferredLogFactory logFactoryMock = mock(DeferredLogFactory.class);

	private final LogMessage logMessageMock = mock(LogMessage.class);

	private final LogMessage logMessageMock2 = mock(LogMessage.class);

	private final LogMessage logMessageMock3 = mock(LogMessage.class);

	//Sapient generated method id: ${1842d923-3302-3abb-a58b-96aa63c0ab22}, hash: DDFC56F51561BCA35B47AB30F5F7B8D4
	@Disabled()
	@Test()
	void withProcessedImportsWhenContributorsGetRootIsEmptyAndContributorIsNull() {
		/* Branches:
		 * (activationContext != null) : false
		 * (for-each(contributors.getRoot())) : false  #  inside getNextToProcess method
		 * (contributor == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class, CALLS_REAL_METHODS);
			 MockedStatic<ConfigDataEnvironmentContributor.ImportPhase> configDataEnvironmentContributorImportPhase = mockStatic(ConfigDataEnvironmentContributor.ImportPhase.class, CALLS_REAL_METHODS);
			 MockedStatic<ConfigDataEnvironmentContributor> configDataEnvironmentContributor = mockStatic(ConfigDataEnvironmentContributor.class)) {
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataEnvironmentContributors.class);
			configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.of(anyList())).thenReturn(rootMock);
			configDataEnvironmentContributorImportPhase.when(() -> ConfigDataEnvironmentContributor.ImportPhase.get((ConfigDataActivationContext) null)).thenReturn(ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION);
			logMessage.when(() -> LogMessage.format("Processing imports for phase %s. %s", ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION, "no activation context")).thenReturn(logMessageMock);
			List<ConfigDataEnvironmentContributor> configDataEnvironmentContributorList = new ArrayList<>();
			ConfigDataEnvironmentContributors target = new ConfigDataEnvironmentContributors(logFactoryMock, configurableBootstrapContextMock, configDataEnvironmentContributorList);
			ConfigDataActivationContext configDataActivationContext = null;
			//Act Statement(s)
			ConfigDataEnvironmentContributors result = target.withProcessedImports(configDataImporterMock, configDataActivationContext);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(target));
				verify(logFactoryMock, atLeast(1)).getLog(ConfigDataEnvironmentContributors.class);
				configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.of(anyList()), atLeast(1));
				configDataEnvironmentContributorImportPhase.verify(() -> ConfigDataEnvironmentContributor.ImportPhase.get((ConfigDataActivationContext) null), atLeast(1));
				logMessage.verify(() -> LogMessage.format("Processing imports for phase %s. %s", ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION, "no activation context"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${7902a050-55f2-3bd2-87f0-3e12fcbe7266}, hash: C2F7610CACB9ADB3D22296288F3738D0
	@Disabled()
	@Test()
	void withProcessedImportsWhenContributorNotHasUnprocessedImportsImportPhaseAndIsActiveWithUnprocessedImportsNotActivationCon() {
		/* Branches:
		 * (activationContext != null) : true
		 * (for-each(contributors.getRoot())) : true  #  inside getNextToProcess method
		 * (contributor.getKind() == Kind.UNBOUND_IMPORT) : false  #  inside getNextToProcess method
		 * (contributor.isActive(activationContext)) : true  #  inside isActiveWithUnprocessedImports method
		 * (contributor.hasUnprocessedImports(importPhase)) : false  #  inside isActiveWithUnprocessedImports method
		 * (isActiveWithUnprocessedImports(activationContext, importPhase, contributor)) : false  #  inside getNextToProcess method
		 * (contributor == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class, CALLS_REAL_METHODS);
			 MockedStatic<ConfigDataEnvironmentContributor.ImportPhase> configDataEnvironmentContributorImportPhase = mockStatic(ConfigDataEnvironmentContributor.ImportPhase.class, CALLS_REAL_METHODS);
			 MockedStatic<ConfigDataEnvironmentContributor> configDataEnvironmentContributor = mockStatic(ConfigDataEnvironmentContributor.class)) {
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataEnvironmentContributors.class);
			configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.of(anyList())).thenReturn(rootMock);
			configDataEnvironmentContributorImportPhase.when(() -> ConfigDataEnvironmentContributor.ImportPhase.get(configDataActivationContextMock)).thenReturn(ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION);
			logMessage.when(() -> LogMessage.format("Processing imports for phase %s. %s", ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION, configDataActivationContextMock)).thenReturn(logMessageMock);
			List<ConfigDataEnvironmentContributor> configDataEnvironmentContributorList = new ArrayList<>();
			ConfigDataEnvironmentContributors target = new ConfigDataEnvironmentContributors(logFactoryMock, configurableBootstrapContextMock, configDataEnvironmentContributorList);
			//Act Statement(s)
			ConfigDataEnvironmentContributors result = target.withProcessedImports(configDataImporterMock, configDataActivationContextMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(target));
				verify(logFactoryMock, atLeast(1)).getLog(ConfigDataEnvironmentContributors.class);
				configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.of(anyList()), atLeast(1));
				configDataEnvironmentContributorImportPhase.verify(() -> ConfigDataEnvironmentContributor.ImportPhase.get(configDataActivationContextMock), atLeast(1));
				logMessage.verify(() -> LogMessage.format("Processing imports for phase %s. %s", ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION, configDataActivationContextMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${75f58abd-955f-3a73-8bad-89c5b631cdff}, hash: 5167846305770EC2BDA27FFDD8D126E4
	@Disabled()
	@Test()
	void withProcessedImportsWhenDataGetPropertySourcesIsEmpty() {
		/* Branches:
		 * (activationContext != null) : true
		 * (for-each(contributors.getRoot())) : true  #  inside getNextToProcess method
		 * (contributor.getKind() == Kind.UNBOUND_IMPORT) : false  #  inside getNextToProcess method
		 * (contributor.isActive(activationContext)) : true  #  inside isActiveWithUnprocessedImports method
		 * (contributor.hasUnprocessedImports(importPhase)) : true  #  inside isActiveWithUnprocessedImports method
		 * (isActiveWithUnprocessedImports(activationContext, importPhase, contributor)) : true  #  inside getNextToProcess method
		 * (contributor == null) : false
		 * (contributor.getKind() == Kind.UNBOUND_IMPORT) : true
		 * (data.getPropertySources().isEmpty()) : true  #  inside lambda$asContributors$2 method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: result, object of type ConfigDataEnvironmentContributor
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigDataEnvironmentContributor> configDataEnvironmentContributor = mockStatic(ConfigDataEnvironmentContributor.class);
			 MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
			 MockedStatic<ConfigDataEnvironmentContributor.ImportPhase> configDataEnvironmentContributorImportPhase = mockStatic(ConfigDataEnvironmentContributor.ImportPhase.class, CALLS_REAL_METHODS)) {
			Map<ConfigDataResolutionResult, ConfigData> configDataResolutionResultConfigDataMap = new HashMap<>();
			configDataResolutionResultConfigDataMap.put(configDataResolutionResultMock, configDataMock);
			List<ConfigDataLocation> configDataLocationList = new ArrayList<>();
			doReturn(configDataResolutionResultConfigDataMap).when(importerMock).resolveAndLoad(eq(configDataActivationContextMock), (ConfigDataLocationResolverContext) any(), (ConfigDataLoaderContext) any(), eq(configDataLocationList));
			doReturn(configDataLocationMock).when(configDataResolutionResultMock).getLocation();
			doReturn(configDataResourceMock).when(configDataResolutionResultMock).getResource();
			doReturn(false).when(configDataResolutionResultMock).isProfileSpecific();
			List<PropertySource<?>> anyList = new ArrayList<>();
			doReturn(anyList).when(configDataMock).getPropertySources();
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataEnvironmentContributors.class);
			configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.of(anyList())).thenReturn(rootMock);
			configDataEnvironmentContributorImportPhase.when(() -> ConfigDataEnvironmentContributor.ImportPhase.get(configDataActivationContextMock)).thenReturn(ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION);
			logMessage.when(() -> LogMessage.format("Processing imports for phase %s. %s", ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION, configDataActivationContextMock)).thenReturn(logMessageMock);
			logMessage.when(() -> LogMessage.format(eq("Processing imports %s"), anyList())).thenReturn(logMessageMock2);
			logMessage.when(() -> LogMessage.of((Supplier) any())).thenReturn(logMessageMock3);
			configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofEmptyLocation(configDataLocationMock, false)).thenReturn(configDataEnvironmentContributorMock);
			List<ConfigDataEnvironmentContributor> configDataEnvironmentContributorList = new ArrayList<>();
			ConfigDataEnvironmentContributors target = new ConfigDataEnvironmentContributors(logFactoryMock, configurableBootstrapContextMock, configDataEnvironmentContributorList);
			//Act Statement(s)
			ConfigDataEnvironmentContributors result = target.withProcessedImports(importerMock, configDataActivationContextMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(importerMock, atLeast(1)).resolveAndLoad(eq(configDataActivationContextMock), (ConfigDataLocationResolverContext) any(), (ConfigDataLoaderContext) any(), eq(configDataLocationList));
				verify(configDataResolutionResultMock, atLeast(1)).getLocation();
				verify(configDataResolutionResultMock, atLeast(1)).getResource();
				verify(configDataResolutionResultMock, atLeast(1)).isProfileSpecific();
				verify(configDataMock, atLeast(1)).getPropertySources();
				verify(logFactoryMock, atLeast(1)).getLog(ConfigDataEnvironmentContributors.class);
				configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.of(anyList()), atLeast(1));
				configDataEnvironmentContributorImportPhase.verify(() -> ConfigDataEnvironmentContributor.ImportPhase.get(configDataActivationContextMock), atLeast(1));
				logMessage.verify(() -> LogMessage.format("Processing imports for phase %s. %s", ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION, configDataActivationContextMock), atLeast(1));
				logMessage.verify(() -> LogMessage.format(eq("Processing imports %s"), anyList()), atLeast(1));
				logMessage.verify(() -> LogMessage.of((Supplier) any()), atLeast(1));
				configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofEmptyLocation(configDataLocationMock, false), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${0813946b-1918-3824-85f7-5653ed308975}, hash: C35777FAFE677BB494C62F8FB81906CD
	@Disabled()
	@Test()
	void withProcessedImportsWhenIGreaterThanOrEqualsTo0() {
		/* Branches:
		 * (activationContext != null) : true
		 * (for-each(contributors.getRoot())) : true  #  inside getNextToProcess method
		 * (contributor.getKind() == Kind.UNBOUND_IMPORT) : false  #  inside getNextToProcess method
		 * (contributor.isActive(activationContext)) : true  #  inside isActiveWithUnprocessedImports method
		 * (contributor.hasUnprocessedImports(importPhase)) : true  #  inside isActiveWithUnprocessedImports method
		 * (isActiveWithUnprocessedImports(activationContext, importPhase, contributor)) : true  #  inside getNextToProcess method
		 * (contributor == null) : false
		 * (contributor.getKind() == Kind.UNBOUND_IMPORT) : true
		 * (data.getPropertySources().isEmpty()) : false  #  inside lambda$asContributors$2 method
		 * (i >= 0) : true  #  inside lambda$asContributors$2 method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: result, object of type ConfigDataEnvironmentContributor
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		PropertySource propertySourceMock = mock(PropertySource.class);
		try (MockedStatic<ConfigDataEnvironmentContributor> configDataEnvironmentContributor = mockStatic(ConfigDataEnvironmentContributor.class);
			 MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class);
			 MockedStatic<ConfigDataEnvironmentContributor.ImportPhase> configDataEnvironmentContributorImportPhase = mockStatic(ConfigDataEnvironmentContributor.ImportPhase.class, CALLS_REAL_METHODS)) {
			Map<ConfigDataResolutionResult, ConfigData> configDataResolutionResultConfigDataMap = new HashMap<>();
			configDataResolutionResultConfigDataMap.put(configDataResolutionResultMock, configDataMock);
			List<ConfigDataLocation> configDataLocationList = new ArrayList<>();
			doReturn(configDataResolutionResultConfigDataMap).when(importerMock).resolveAndLoad(eq(configDataActivationContextMock), (ConfigDataLocationResolverContext) any(), (ConfigDataLoaderContext) any(), eq(configDataLocationList));
			doReturn(configDataLocationMock).when(configDataResolutionResultMock).getLocation();
			doReturn(configDataResourceMock).when(configDataResolutionResultMock).getResource();
			doReturn(false).when(configDataResolutionResultMock).isProfileSpecific();
			List<PropertySource<?>> anyList = new ArrayList<>();
			anyList.add(propertySourceMock);
			doReturn(anyList).when(configDataMock).getPropertySources();
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataEnvironmentContributors.class);
			configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.of(anyList())).thenReturn(rootMock);
			configDataEnvironmentContributorImportPhase.when(() -> ConfigDataEnvironmentContributor.ImportPhase.get(configDataActivationContextMock)).thenReturn(ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION);
			logMessage.when(() -> LogMessage.format("Processing imports for phase %s. %s", ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION, configDataActivationContextMock)).thenReturn(logMessageMock);
			logMessage.when(() -> LogMessage.format(eq("Processing imports %s"), anyList())).thenReturn(logMessageMock2);
			logMessage.when(() -> LogMessage.of((Supplier) any())).thenReturn(logMessageMock3);
			configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.ofUnboundImport(configDataLocationMock, configDataResourceMock, false, configDataMock, 0)).thenReturn(configDataEnvironmentContributorMock);
			List<ConfigDataEnvironmentContributor> configDataEnvironmentContributorList = new ArrayList<>();
			ConfigDataEnvironmentContributors target = new ConfigDataEnvironmentContributors(logFactoryMock, configurableBootstrapContextMock, configDataEnvironmentContributorList);
			//Act Statement(s)
			ConfigDataEnvironmentContributors result = target.withProcessedImports(importerMock, configDataActivationContextMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(importerMock, atLeast(1)).resolveAndLoad(eq(configDataActivationContextMock), (ConfigDataLocationResolverContext) any(), (ConfigDataLoaderContext) any(), eq(configDataLocationList));
				verify(configDataResolutionResultMock, atLeast(1)).getLocation();
				verify(configDataResolutionResultMock, atLeast(1)).getResource();
				verify(configDataResolutionResultMock, atLeast(1)).isProfileSpecific();
				verify(configDataMock, times(2)).getPropertySources();
				verify(logFactoryMock, atLeast(1)).getLog(ConfigDataEnvironmentContributors.class);
				configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.of(anyList()), atLeast(1));
				configDataEnvironmentContributorImportPhase.verify(() -> ConfigDataEnvironmentContributor.ImportPhase.get(configDataActivationContextMock), atLeast(1));
				logMessage.verify(() -> LogMessage.format("Processing imports for phase %s. %s", ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION, configDataActivationContextMock), atLeast(1));
				logMessage.verify(() -> LogMessage.format(eq("Processing imports %s"), anyList()), atLeast(1));
				logMessage.verify(() -> LogMessage.of((Supplier) any()), atLeast(1));
				configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.ofUnboundImport(configDataLocationMock, configDataResourceMock, false, configDataMock, 0), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${27f159bb-8759-38a1-9961-779599d3b712}, hash: BC9824B0767788693335483E442ACCE3
	@Disabled()
	@Test()
	void getBinderTest() {
		//Arrange Statement(s)
		Binder binderMock = mock(Binder.class);
		Predicate predicateMock = mock(Predicate.class);
		try (MockedStatic<ConfigDataEnvironmentContributor> configDataEnvironmentContributor = mockStatic(ConfigDataEnvironmentContributor.class)) {
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataEnvironmentContributors.class);
			configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.of(anyList())).thenReturn(rootMock);
			List<ConfigDataEnvironmentContributor> configDataEnvironmentContributorList = new ArrayList<>();
			ConfigDataEnvironmentContributors target = spy(new ConfigDataEnvironmentContributors(logFactoryMock, configurableBootstrapContextMock, configDataEnvironmentContributorList));
			ConfigDataEnvironmentContributors.BinderOption[] binderOptionArray = new ConfigDataEnvironmentContributors.BinderOption[] {};
			doReturn(binderMock).when(target).getBinder(configDataActivationContextMock, predicateMock, binderOptionArray);
			//Act Statement(s)
			Binder result = target.getBinder(configDataActivationContextMock, binderOptionArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(binderMock));
				verify(logFactoryMock).getLog(ConfigDataEnvironmentContributors.class);
				configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.of(anyList()));
				verify(target).getBinder(configDataActivationContextMock, predicateMock, binderOptionArray);
			});
		}
	}

	//Sapient generated method id: ${78c09fb6-edcf-3ce7-9932-6ef4ffc152b3}, hash: 92663A268EE2D2001AEEA32BC0BA2190
	@Disabled()
	@Test()
	void iteratorTest() {
		//Arrange Statement(s)
		try (MockedStatic<ConfigDataEnvironmentContributor> configDataEnvironmentContributor = mockStatic(ConfigDataEnvironmentContributor.class)) {
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataEnvironmentContributors.class);
			configDataEnvironmentContributor.when(() -> ConfigDataEnvironmentContributor.of(anyList())).thenReturn(rootMock);
			List<ConfigDataEnvironmentContributor> configDataEnvironmentContributorList = new ArrayList<>();
			ConfigDataEnvironmentContributors target = new ConfigDataEnvironmentContributors(logFactoryMock, configurableBootstrapContextMock, configDataEnvironmentContributorList);
			doReturn(null).when(rootMock).iterator();
			//Act Statement(s)
			Iterator<ConfigDataEnvironmentContributor> result = target.iterator();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(logFactoryMock).getLog(ConfigDataEnvironmentContributors.class);
				configDataEnvironmentContributor.verify(() -> ConfigDataEnvironmentContributor.of(anyList()));
				verify(rootMock).iterator();
			});
		}
	}
}
