package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.LinkedHashMap;

import org.apache.commons.logging.impl.NoOpLog;

import org.springframework.core.log.LogMessage;

import java.util.Map;

import org.mockito.MockedStatic;

import org.springframework.boot.logging.DeferredLogFactory;

import java.util.ArrayList;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigDataImporterSapientGeneratedTest {

	private final ConfigDataLocationResolvers resolversMock = mock(ConfigDataLocationResolvers.class, "resolvers");

	private final ConfigDataLoaders loadersMock = mock(ConfigDataLoaders.class, "loaders");

	private final ConfigDataActivationContext activationContextMock = mock(ConfigDataActivationContext.class);

	private final ConfigDataLoaderContext configDataLoaderContextMock = mock(ConfigDataLoaderContext.class);

	private final ConfigDataLocation configDataLocationMock = mock(ConfigDataLocation.class);

	private final ConfigDataLocation configDataLocationMock2 = mock(ConfigDataLocation.class);

	private final ConfigDataLocationResolverContext configDataLocationResolverContextMock = mock(ConfigDataLocationResolverContext.class);

	private final ConfigData configDataMock = mock(ConfigData.class);

	private final ConfigDataResolutionResult configDataResolutionResultMock = mock(ConfigDataResolutionResult.class);

	private final ConfigDataResource configDataResourceMock = mock(ConfigDataResource.class);

	private final DeferredLogFactory logFactoryMock = mock(DeferredLogFactory.class);

	private final LogMessage logMessageMock = mock(LogMessage.class);

	private final LogMessage logMessageMock2 = mock(LogMessage.class);

	private final Profiles profilesMock = mock(Profiles.class);

	//Sapient generated method id: ${34f58acc-aa3c-3127-929b-a7af5c4a067c}, hash: AF76E2EA60C77282A0E64C8260349E3B
	@Test()
	void resolveAndLoadWhenActivationContextIsNullAndLocationsIsEmptyAndILessThan0() throws IOException {
		/* Branches:
		 * (activationContext != null) : false
		 * (for-each(locations)) : false  #  inside resolve method
		 * (i >= 0) : false  #  inside load method
		 */
		//Arrange Statement(s)
		NoOpLog noOpLog = new NoOpLog();
		doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataImporter.class);
		ConfigDataImporter target = new ConfigDataImporter(logFactoryMock, ConfigDataNotFoundAction.FAIL, resolversMock, loadersMock);
		ConfigDataActivationContext configDataActivationContext = null;
		List<ConfigDataLocation> configDataLocationList = new ArrayList<>();
		//Act Statement(s)
		Map<ConfigDataResolutionResult, ConfigData> result = target.resolveAndLoad(configDataActivationContext, configDataLocationResolverContextMock, configDataLoaderContextMock, configDataLocationList);
		Map<ConfigDataResolutionResult, ConfigData> configDataResolutionResultConfigDataResultMap = new LinkedHashMap<>();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(configDataResolutionResultConfigDataResultMap));
			verify(logFactoryMock).getLog(ConfigDataImporter.class);
		});
	}

	//Sapient generated method id: ${ea38d006-ae53-35ca-9c3e-0c861d82b40a}, hash: 765A5B97512A263BAB9D8A414911130B
	@Disabled()
	@Test()
	void resolveAndLoadWhenILessThan0AndCaughtIOExceptionThrowsIllegalStateException() {
		/* Branches:
		 * (activationContext != null) : false
		 * (for-each(locations)) : false  #  inside resolve method
		 * (i >= 0) : false  #  inside load method
		 * (catch-exception (IOException)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		NoOpLog noOpLog = new NoOpLog();
		doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataImporter.class);
		ConfigDataImporter target = new ConfigDataImporter(logFactoryMock, ConfigDataNotFoundAction.FAIL, resolversMock, loadersMock);
		ConfigDataActivationContext configDataActivationContext = null;
		List<ConfigDataLocation> configDataLocationList = new ArrayList<>();
		IOException iOException = new IOException();
		IllegalStateException illegalStateException = new IllegalStateException("IO error on loading imports from []", iOException);
		//Act Statement(s)
		final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
			target.resolveAndLoad(configDataActivationContext, configDataLocationResolverContextMock, configDataLoaderContextMock, configDataLocationList);
		});
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
			assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
			verify(logFactoryMock).getLog(ConfigDataImporter.class);
		});
	}

	//Sapient generated method id: ${e0e90118-01cd-38fe-bbdf-a4ac99c10c1d}, hash: D06B4DBB6B5EA37BF5B3B73455DC905D
	@Disabled()
	@Test()
	void resolveAndLoadWhenLoadedIsNotNull() throws IOException {
		/* Branches:
		 * (activationContext != null) : true
		 * (for-each(locations)) : true  #  inside resolve method
		 * (i >= 0) : true  #  inside load method
		 * (resource.isOptional()) : true  #  inside load method
		 * (this.loaded.contains(resource)) : false  #  inside load method
		 * (loaded != null) : true  #  inside load method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class)) {
			doReturn(profilesMock).when(activationContextMock).getProfiles();
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataImporter.class);
			logMessage.when(() -> LogMessage.format("Considering resource %s from location %s", configDataResourceMock, configDataLocationMock)).thenReturn(logMessageMock);
			doReturn(true).when(configDataResourceMock).isOptional();
			logMessage.when(() -> LogMessage.format("Loaded resource %s from location %s", configDataResourceMock, configDataLocationMock)).thenReturn(logMessageMock2);
			ConfigDataImporter target = new ConfigDataImporter(logFactoryMock, ConfigDataNotFoundAction.FAIL, resolversMock, loadersMock);
			List<ConfigDataResolutionResult> configDataResolutionResultList = new ArrayList<>();
			doReturn(configDataResolutionResultList).when(resolversMock).resolve(configDataLocationResolverContextMock, configDataLocationMock2, profilesMock);
			doReturn(configDataMock).when(loadersMock).load(configDataLoaderContextMock, configDataResourceMock);
			List<ConfigDataLocation> configDataLocationList = new ArrayList<>();
			configDataLocationList.add(configDataLocationMock2);
			//Act Statement(s)
			Map<ConfigDataResolutionResult, ConfigData> result = target.resolveAndLoad(activationContextMock, configDataLocationResolverContextMock, configDataLoaderContextMock, configDataLocationList);
			Map<ConfigDataResolutionResult, ConfigData> configDataResolutionResultConfigDataResultMap = new LinkedHashMap<>();
			configDataResolutionResultConfigDataResultMap.put(configDataResolutionResultMock, configDataMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configDataResolutionResultConfigDataResultMap));
				verify(activationContextMock).getProfiles();
				verify(logFactoryMock).getLog(ConfigDataImporter.class);
				logMessage.verify(() -> LogMessage.format("Considering resource %s from location %s", configDataResourceMock, configDataLocationMock), atLeast(1));
				verify(configDataResourceMock).isOptional();
				logMessage.verify(() -> LogMessage.format("Loaded resource %s from location %s", configDataResourceMock, configDataLocationMock), atLeast(1));
				verify(resolversMock).resolve(configDataLocationResolverContextMock, configDataLocationMock2, profilesMock);
				verify(loadersMock).load(configDataLoaderContextMock, configDataResourceMock);
			});
		}
	}

	//Sapient generated method id: ${a463e7ef-0f08-3411-9126-ffdbc47b0847}, hash: EEC39C54198ED9AF576D98B3DAAD90D1
	@Disabled()
	@Test()
	void resolveAndLoadWhenResourceIsNullAndILessThan0() throws IOException {
		/* Branches:
		 * (activationContext != null) : true
		 * (for-each(locations)) : true  #  inside resolve method
		 * (catch-exception (ConfigDataNotFoundException)) : true  #  inside resolve method
		 * (ex instanceof ConfigDataResourceNotFoundException notFoundException) : true  #  inside handle method
		 * (location.isOptional()) : false  #  inside getNotFoundAction method
		 * (resource != null) : false  #  inside getNotFoundAction method
		 * (i >= 0) : false  #  inside load method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(profilesMock).when(activationContextMock).getProfiles();
		ConfigDataLocation locationMock = mock(ConfigDataLocation.class);
		doReturn(false).when(locationMock).isOptional();
		NoOpLog noOpLog = new NoOpLog();
		doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataImporter.class);
		ConfigDataImporter target = new ConfigDataImporter(logFactoryMock, ConfigDataNotFoundAction.FAIL, resolversMock, loadersMock);
		List<ConfigDataResolutionResult> configDataResolutionResultList = new ArrayList<>();
		doReturn(configDataResolutionResultList).when(resolversMock).resolve(configDataLocationResolverContextMock, locationMock, profilesMock);
		List<ConfigDataLocation> configDataLocationList = new ArrayList<>();
		configDataLocationList.add(locationMock);
		//Act Statement(s)
		Map<ConfigDataResolutionResult, ConfigData> result = target.resolveAndLoad(activationContextMock, configDataLocationResolverContextMock, configDataLoaderContextMock, configDataLocationList);
		Map<ConfigDataResolutionResult, ConfigData> configDataResolutionResultConfigDataResultMap = new LinkedHashMap<>();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(configDataResolutionResultConfigDataResultMap));
			verify(activationContextMock).getProfiles();
			verify(locationMock).isOptional();
			verify(logFactoryMock).getLog(ConfigDataImporter.class);
			verify(resolversMock).resolve(configDataLocationResolverContextMock, locationMock, profilesMock);
		});
	}

	//Sapient generated method id: ${fd103a77-e3f1-3fd1-a0f6-27943e1d832e}, hash: B7282647027F4F832C77A7E6E8BDE5AD
	@Disabled()
	@Test()
	void resolveAndLoadWhenLoadedIsNotNullAndCaughtIOExceptionThrowsIllegalStateException() throws IOException {
		/* Branches:
		 * (activationContext != null) : true
		 * (for-each(locations)) : true  #  inside resolve method
		 * (i >= 0) : true  #  inside load method
		 * (resource.isOptional()) : true  #  inside load method
		 * (this.loaded.contains(resource)) : false  #  inside load method
		 * (loaded != null) : true  #  inside load method
		 * (catch-exception (IOException)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class)) {
			doReturn(profilesMock).when(activationContextMock).getProfiles();
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataImporter.class);
			logMessage.when(() -> LogMessage.format("Considering resource %s from location %s", configDataResourceMock, configDataLocationMock)).thenReturn(logMessageMock);
			doReturn(true).when(configDataResourceMock).isOptional();
			logMessage.when(() -> LogMessage.format("Loaded resource %s from location %s", configDataResourceMock, configDataLocationMock)).thenReturn(logMessageMock2);
			ConfigDataImporter target = new ConfigDataImporter(logFactoryMock, ConfigDataNotFoundAction.FAIL, resolversMock, loadersMock);
			List<ConfigDataResolutionResult> configDataResolutionResultList = new ArrayList<>();
			doReturn(configDataResolutionResultList).when(resolversMock).resolve(configDataLocationResolverContextMock, configDataLocationMock2, profilesMock);
			doReturn(configDataMock).when(loadersMock).load(configDataLoaderContextMock, configDataResourceMock);
			List<ConfigDataLocation> configDataLocationList = new ArrayList<>();
			configDataLocationList.add(configDataLocationMock2);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.resolveAndLoad(activationContextMock, configDataLocationResolverContextMock, configDataLoaderContextMock, configDataLocationList);
			});
			IOException iOException = new IOException();
			IllegalStateException illegalStateException = new IllegalStateException("IO error on loading imports from []", iOException);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
				verify(activationContextMock).getProfiles();
				verify(logFactoryMock).getLog(ConfigDataImporter.class);
				logMessage.verify(() -> LogMessage.format("Considering resource %s from location %s", configDataResourceMock, configDataLocationMock), atLeast(1));
				verify(configDataResourceMock).isOptional();
				logMessage.verify(() -> LogMessage.format("Loaded resource %s from location %s", configDataResourceMock, configDataLocationMock), atLeast(1));
				verify(resolversMock).resolve(configDataLocationResolverContextMock, configDataLocationMock2, profilesMock);
				verify(loadersMock).load(configDataLoaderContextMock, configDataResourceMock);
			});
		}
	}

	//Sapient generated method id: ${3675beae-b7c7-342c-b6e4-b023070cb4e4}, hash: 53E1FD735B4EC542E4F2214DC04A4F49
	@Disabled()
	@Test()
	void resolveAndLoadWhenResourceIsOptional() throws IOException {
		/* Branches:
		 * (activationContext != null) : true
		 * (for-each(locations)) : true  #  inside resolve method
		 * (i >= 0) : true  #  inside load method
		 * (resource.isOptional()) : true  #  inside load method
		 * (this.loaded.contains(resource)) : false  #  inside load method
		 * (loaded != null) : true  #  inside load method
		 * (catch-exception (ConfigDataNotFoundException)) : true  #  inside load method
		 * (ex instanceof ConfigDataResourceNotFoundException notFoundException) : true  #  inside handle method
		 * (location.isOptional()) : false  #  inside getNotFoundAction method
		 * (resource != null) : true  #  inside getNotFoundAction method
		 * (resource.isOptional()) : true  #  inside getNotFoundAction method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<LogMessage> logMessage = mockStatic(LogMessage.class)) {
			doReturn(profilesMock).when(activationContextMock).getProfiles();
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(ConfigDataImporter.class);
			logMessage.when(() -> LogMessage.format("Considering resource %s from location %s", configDataResourceMock, configDataLocationMock)).thenReturn(logMessageMock);
			doReturn(true).when(configDataResourceMock).isOptional();
			doReturn(false).when(configDataLocationMock).isOptional();
			logMessage.when(() -> LogMessage.format("Loaded resource %s from location %s", configDataResourceMock, configDataLocationMock)).thenReturn(logMessageMock2);
			ConfigDataImporter target = new ConfigDataImporter(logFactoryMock, ConfigDataNotFoundAction.FAIL, resolversMock, loadersMock);
			List<ConfigDataResolutionResult> configDataResolutionResultList = new ArrayList<>();
			doReturn(configDataResolutionResultList).when(resolversMock).resolve(configDataLocationResolverContextMock, configDataLocationMock2, profilesMock);
			doReturn(configDataMock).when(loadersMock).load(configDataLoaderContextMock, configDataResourceMock);
			List<ConfigDataLocation> configDataLocationList = new ArrayList<>();
			configDataLocationList.add(configDataLocationMock2);
			//Act Statement(s)
			Map<ConfigDataResolutionResult, ConfigData> result = target.resolveAndLoad(activationContextMock, configDataLocationResolverContextMock, configDataLoaderContextMock, configDataLocationList);
			Map<ConfigDataResolutionResult, ConfigData> configDataResolutionResultConfigDataResultMap = new LinkedHashMap<>();
			configDataResolutionResultConfigDataResultMap.put(configDataResolutionResultMock, configDataMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configDataResolutionResultConfigDataResultMap));
				verify(activationContextMock).getProfiles();
				verify(logFactoryMock).getLog(ConfigDataImporter.class);
				logMessage.verify(() -> LogMessage.format("Considering resource %s from location %s", configDataResourceMock, configDataLocationMock), atLeast(1));
				verify(configDataResourceMock, times(2)).isOptional();
				verify(configDataLocationMock).isOptional();
				logMessage.verify(() -> LogMessage.format("Loaded resource %s from location %s", configDataResourceMock, configDataLocationMock), atLeast(1));
				verify(resolversMock).resolve(configDataLocationResolverContextMock, configDataLocationMock2, profilesMock);
				verify(loadersMock).load(configDataLoaderContextMock, configDataResourceMock);
			});
		}
	}
}
