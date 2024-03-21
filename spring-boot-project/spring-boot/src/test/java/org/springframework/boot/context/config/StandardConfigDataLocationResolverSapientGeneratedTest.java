package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.core.io.ResourceLoader;

import org.mockito.stubbing.Answer;
import org.apache.commons.logging.impl.NoOpLog;

import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.util.Assert;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import org.springframework.boot.logging.DeferredLogFactory;
import org.springframework.core.io.support.SpringFactoriesLoader;

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
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StandardConfigDataLocationResolverSapientGeneratedTest {

	private final BindResult bindResultMock = mock(BindResult.class);

	private final Binder binderMock = mock(Binder.class);

	private final ConfigDataLocationResolverContext configDataLocationResolverContextMock = mock(ConfigDataLocationResolverContext.class);

	private final ConfigDataResource configDataResourceMock = mock(ConfigDataResource.class);

	private final ConfigDataLocationResolverContext contextMock = mock(ConfigDataLocationResolverContext.class);

	private final ConfigDataLocation locationMock = mock(ConfigDataLocation.class);

	private final DeferredLogFactory logFactoryMock = mock(DeferredLogFactory.class);

	private final Profiles profilesMock = mock(Profiles.class);

	private final ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);

	private final StandardConfigDataReference standardConfigDataReferenceMock = mock(StandardConfigDataReference.class);

	private final StandardConfigDataResource standardConfigDataResourceMock = mock(StandardConfigDataResource.class);

	//Sapient generated method id: ${0bab2f51-0335-3cad-8d28-78925f74e38e}, hash: A330A4D6559513725401FF03814EBC80
	@Disabled()
	@Test()
	void isResolvableTest() {
		//Arrange Statement(s)
		ConfigDataLocation configDataLocationMock = mock(ConfigDataLocation.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] { "A" };
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			boolean result = target.isResolvable(configDataLocationResolverContextMock, configDataLocationMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${77a101a8-307f-3910-9b9b-6213390f5109}, hash: B82BD1180374D2B2A03586B3313BD3DD
	@Disabled()
	@Test()
	void resolveWhenCaughtRuntimeExceptionThrowsIllegalStateException() throws ConfigDataNotFoundException {
		/* Branches:
		 * (for-each(configDataLocations)) : true  #  inside getReferences method
		 * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
		 * (URL_PREFIX.matcher(resourceLocation).matches()) : false  #  inside getResourceLocation method
		 * (isAbsolute) : false  #  inside getResourceLocation method
		 * (parent instanceof StandardConfigDataResource resource) : true  #  inside getResourceLocation method
		 * (resourceLocation.endsWith("/")) : true  #  inside isDirectory method
		 * (isDirectory(resourceLocation)) : true  #  inside getReferences method
		 * (for-each(this.configNames)) : false  #  inside getReferencesForDirectory method
		 * (catch-exception (RuntimeException)) : true  #  inside getReferences method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(standardConfigDataResourceMock).when(contextMock).getParent();
			doReturn(standardConfigDataReferenceMock).when(standardConfigDataResourceMock).getReference();
			doReturn("return_of_getResourceLocation1").when(standardConfigDataReferenceMock).getResourceLocation();
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.resolve(contextMock, locationMock);
			});
			RuntimeException runtimeException = new RuntimeException();
			IllegalStateException illegalStateException = new IllegalStateException("message1", runtimeException);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(runtimeException.getClass())));
				verify(contextMock).getParent();
				verify(standardConfigDataResourceMock).getReference();
				verify(standardConfigDataReferenceMock).getResourceLocation();
				verify(locationMock).split();
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${c31bb46e-873f-376c-b94d-152b8b67e332}, hash: 2750765C636AFBAD8D786143B096F877
	@Disabled()
	@Test()
	void resolveWhenThisPropertySourceLoadersIsEmptyAndCaughtRuntimeExceptionThrowsIllegalStateException() throws ConfigDataNotFoundException {
		/* Branches:
		 * (for-each(configDataLocations)) : true  #  inside getReferences method
		 * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
		 * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
		 * (isAbsolute) : true  #  inside getResourceLocation method
		 * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
		 * (resourceLocation.endsWith(File.separator)) : true  #  inside isDirectory method
		 * (isDirectory(resourceLocation)) : true  #  inside getReferences method
		 * (for-each(this.configNames)) : true  #  inside getReferencesForDirectory method
		 * (for-each(this.propertySourceLoaders)) : false  #  inside getReferencesForConfigName method
		 * (catch-exception (RuntimeException)) : true  #  inside getReferences method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.resolve(configDataLocationResolverContextMock, locationMock);
			});
			RuntimeException runtimeException = new RuntimeException();
			IllegalStateException illegalStateException = new IllegalStateException("message1", runtimeException);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(runtimeException.getClass())));
				verify(locationMock).split();
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${58dc558c-f00a-3374-8d11-59f79d984ae0}, hash: 73FB7AC96FB6A545CEDAD2A4289A9B85
	@Disabled()
	@Test()
	void resolveWhenConfigDataLocationNotIsOptionalThrowsIllegalStateException() throws ConfigDataNotFoundException {
		/* Branches:
		 * (for-each(configDataLocations)) : true  #  inside getReferences method
		 * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
		 * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
		 * (isAbsolute) : true  #  inside getResourceLocation method
		 * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
		 * (resourceLocation.endsWith(File.separator)) : false  #  inside isDirectory method
		 * (isDirectory(resourceLocation)) : false  #  inside getReferences method
		 * (extensionHintLocation) : true  #  inside getReferencesForFile method
		 * (for-each(this.propertySourceLoaders)) : false  #  inside getReferencesForFile method
		 * (configDataLocation.isOptional()) : false  #  inside getReferencesForFile method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.resolve(configDataLocationResolverContextMock, locationMock);
			});
			RuntimeException runtimeException = new RuntimeException();
			IllegalStateException illegalStateException = new IllegalStateException("message1", runtimeException);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(runtimeException.getClass())));
				verify(locationMock).split();
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${e7e271de-04b1-38c3-9e7f-377560d99ba0}, hash: 54A68D7CE1DAF9819BA140606BEEE6B4
	@Disabled()
	@Test()
	void resolveWhenReferencesIsEmptyAndResolvedIsEmptyAndReferencesIsEmpty() throws ConfigDataNotFoundException {
		/* Branches:
		 * (for-each(configDataLocations)) : true  #  inside getReferences method
		 * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
		 * (URL_PREFIX.matcher(resourceLocation).matches()) : false  #  inside getResourceLocation method
		 * (isAbsolute) : false  #  inside getResourceLocation method
		 * (parent instanceof StandardConfigDataResource resource) : true  #  inside getResourceLocation method
		 * (resourceLocation.endsWith("/")) : true  #  inside isDirectory method
		 * (isDirectory(resourceLocation)) : true  #  inside getReferences method
		 * (for-each(this.configNames)) : false  #  inside getReferencesForDirectory method
		 * (for-each(references)) : false  #  inside resolve method
		 * (resolved.isEmpty()) : true  #  inside resolve method
		 * (for-each(references)) : false  #  inside resolveEmptyDirectories method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(standardConfigDataResourceMock).when(contextMock).getParent();
			doReturn(standardConfigDataReferenceMock).when(standardConfigDataResourceMock).getReference();
			doReturn("return_of_getResourceLocation1").when(standardConfigDataReferenceMock).getResourceLocation();
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			List<StandardConfigDataResource> result = target.resolve(contextMock, locationMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				verify(contextMock).getParent();
				verify(standardConfigDataResourceMock).getReference();
				verify(standardConfigDataReferenceMock).getResourceLocation();
				verify(locationMock).split();
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${3aee43c1-3576-3f3e-8a3f-afd58fda701b}, hash: 62F5151BE46A6CDC492B4EBFF5C2B847
	@Disabled()
	@Test()
	void resolveWhenThisConfigNamesIsEmptyAndReferencesIsEmptyAndResolvedIsEmptyAndReferencesIsEmpty() throws ConfigDataNotFoundException {
		/* Branches:
		 * (for-each(configDataLocations)) : true  #  inside getReferences method
		 * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
		 * (URL_PREFIX.matcher(resourceLocation).matches()) : false  #  inside getResourceLocation method
		 * (isAbsolute) : false  #  inside getResourceLocation method
		 * (parent instanceof StandardConfigDataResource resource) : false  #  inside getResourceLocation method
		 * (resourceLocation.endsWith("/")) : true  #  inside isDirectory method
		 * (isDirectory(resourceLocation)) : true  #  inside getReferences method
		 * (for-each(this.configNames)) : false  #  inside getReferencesForDirectory method
		 * (for-each(references)) : false  #  inside resolve method
		 * (resolved.isEmpty()) : true  #  inside resolve method
		 * (for-each(references)) : false  #  inside resolveEmptyDirectories method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(configDataResourceMock).when(contextMock).getParent();
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			List<StandardConfigDataResource> result = target.resolve(contextMock, locationMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				verify(contextMock).getParent();
				verify(locationMock).split();
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${19ed33cc-54d9-3a96-b086-a77c1dff99f3}, hash: 743DE9C4F4ED86BAE4B76E2B41CE13A7
	@Disabled()
	@Test()
	void resolveWhenThisPropertySourceLoadersIsEmptyAndReferencesIsEmptyAndResolvedIsEmptyAndReferencesIsEmpty() throws ConfigDataNotFoundException {
		/* Branches:
		 * (for-each(configDataLocations)) : true  #  inside getReferences method
		 * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
		 * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
		 * (isAbsolute) : true  #  inside getResourceLocation method
		 * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
		 * (resourceLocation.endsWith(File.separator)) : true  #  inside isDirectory method
		 * (isDirectory(resourceLocation)) : true  #  inside getReferences method
		 * (for-each(this.configNames)) : true  #  inside getReferencesForDirectory method
		 * (for-each(this.propertySourceLoaders)) : false  #  inside getReferencesForConfigName method
		 * (for-each(references)) : false  #  inside resolve method
		 * (resolved.isEmpty()) : true  #  inside resolve method
		 * (for-each(references)) : false  #  inside resolveEmptyDirectories method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			List<StandardConfigDataResource> result = target.resolve(configDataLocationResolverContextMock, locationMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				verify(locationMock).split();
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${e510bc32-be77-38f0-a669-867859c38855}, hash: CFDE77B3829E290FA24855812BB02599
	@Disabled()
	@Test()
	void resolveWhenConfigDataLocationIsOptionalAndReferencesIsEmptyAndResolvedIsEmptyAndReferencesIsEmpty() throws ConfigDataNotFoundException {
		/* Branches:
		 * (for-each(configDataLocations)) : true  #  inside getReferences method
		 * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
		 * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
		 * (isAbsolute) : true  #  inside getResourceLocation method
		 * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
		 * (resourceLocation.endsWith(File.separator)) : false  #  inside isDirectory method
		 * (isDirectory(resourceLocation)) : false  #  inside getReferences method
		 * (extensionHintLocation) : true  #  inside getReferencesForFile method
		 * (for-each(this.propertySourceLoaders)) : false  #  inside getReferencesForFile method
		 * (configDataLocation.isOptional()) : true  #  inside getReferencesForFile method
		 * (for-each(references)) : false  #  inside resolve method
		 * (resolved.isEmpty()) : true  #  inside resolve method
		 * (for-each(references)) : false  #  inside resolveEmptyDirectories method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			List<StandardConfigDataResource> result = target.resolve(configDataLocationResolverContextMock, locationMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				verify(locationMock).split();
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${658caf19-ddec-3ea8-8559-1f587a2b595b}, hash: 3555E9F04489854BA40F544BD2BB15F6
	@Disabled()
	@Test()
	void resolveProfileSpecificWhenConfigDataLocationNotIsOptionalThrowsIllegalStateException() {
		/* Branches:
		 * (for-each(profiles)) : true  #  inside getProfileSpecificReferences method
		 * (for-each(configDataLocations)) : true  #  inside getProfileSpecificReferences method
		 * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
		 * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
		 * (isAbsolute) : true  #  inside getResourceLocation method
		 * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
		 * (resourceLocation.endsWith(File.separator)) : false  #  inside isDirectory method
		 * (isDirectory(resourceLocation)) : false  #  inside getReferences method
		 * (extensionHintLocation) : true  #  inside getReferencesForFile method
		 * (for-each(this.propertySourceLoaders)) : false  #  inside getReferencesForFile method
		 * (configDataLocation.isOptional()) : false  #  inside getReferencesForFile method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn(null).when(profilesMock).iterator();
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.resolveProfileSpecific(configDataLocationResolverContextMock, locationMock, profilesMock);
			});
			IllegalStateException illegalStateException = new IllegalStateException("File extension is not known to any PropertySourceLoader. If the location is meant to reference a directory, it must end in '/' or File.separator");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				verify(locationMock).split();
				verify(profilesMock).iterator();
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${d5a507f2-e922-378c-a66c-1b408cfdf339}, hash: 54D08BBFE14E3BE3B1A9F0A93C7032B2
	@Disabled()
	@Test()
	void resolveProfileSpecificWhenThisConfigNamesIsEmptyAndReferencesIsEmptyAndResolvedIsEmptyAndReferencesIsEmpty() {
		/* Branches:
		 * (for-each(profiles)) : true  #  inside getProfileSpecificReferences method
		 * (for-each(configDataLocations)) : true  #  inside getProfileSpecificReferences method
		 * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
		 * (URL_PREFIX.matcher(resourceLocation).matches()) : false  #  inside getResourceLocation method
		 * (isAbsolute) : false  #  inside getResourceLocation method
		 * (parent instanceof StandardConfigDataResource resource) : true  #  inside getResourceLocation method
		 * (resourceLocation.endsWith("/")) : true  #  inside isDirectory method
		 * (isDirectory(resourceLocation)) : true  #  inside getReferences method
		 * (for-each(this.configNames)) : false  #  inside getReferencesForDirectory method
		 * (for-each(references)) : false  #  inside resolve method
		 * (resolved.isEmpty()) : true  #  inside resolve method
		 * (for-each(references)) : false  #  inside resolveEmptyDirectories method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(standardConfigDataResourceMock).when(contextMock).getParent();
			doReturn(standardConfigDataReferenceMock).when(standardConfigDataResourceMock).getReference();
			doReturn("return_of_getResourceLocation1").when(standardConfigDataReferenceMock).getResourceLocation();
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn(null).when(profilesMock).iterator();
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			List<StandardConfigDataResource> result = target.resolveProfileSpecific(contextMock, locationMock, profilesMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				verify(contextMock).getParent();
				verify(standardConfigDataResourceMock).getReference();
				verify(standardConfigDataReferenceMock).getResourceLocation();
				verify(locationMock).split();
				verify(profilesMock).iterator();
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${e2a343c6-45dc-3a44-8c38-92e5f37fee56}, hash: 88AE59DB6DCFCCBACC7FA12FB9AFC3D1
	@Disabled()
	@Test()
	void resolveProfileSpecificWhenIsDirectoryResourceLocationAndThisConfigNamesIsEmptyAndReferencesIsEmptyAndResolvedIsEmptyAnd() {
		/* Branches:
		 * (for-each(profiles)) : true  #  inside getProfileSpecificReferences method
		 * (for-each(configDataLocations)) : true  #  inside getProfileSpecificReferences method
		 * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
		 * (URL_PREFIX.matcher(resourceLocation).matches()) : false  #  inside getResourceLocation method
		 * (isAbsolute) : false  #  inside getResourceLocation method
		 * (parent instanceof StandardConfigDataResource resource) : false  #  inside getResourceLocation method
		 * (resourceLocation.endsWith("/")) : true  #  inside isDirectory method
		 * (isDirectory(resourceLocation)) : true  #  inside getReferences method
		 * (for-each(this.configNames)) : false  #  inside getReferencesForDirectory method
		 * (for-each(references)) : false  #  inside resolve method
		 * (resolved.isEmpty()) : true  #  inside resolve method
		 * (for-each(references)) : false  #  inside resolveEmptyDirectories method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(configDataResourceMock).when(contextMock).getParent();
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn(null).when(profilesMock).iterator();
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			List<StandardConfigDataResource> result = target.resolveProfileSpecific(contextMock, locationMock, profilesMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				verify(contextMock).getParent();
				verify(locationMock).split();
				verify(profilesMock).iterator();
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${c13108ae-bfdb-3577-9c62-c0ed2ee45378}, hash: 6D8474C6F785AA85A75B8D87FE9BE601
	@Disabled()
	@Test()
	void resolveProfileSpecificWhenThisPropertySourceLoadersIsEmptyAndReferencesIsEmptyAndResolvedIsEmptyAndReferencesIsEmpty() {
		/* Branches:
		 * (for-each(profiles)) : true  #  inside getProfileSpecificReferences method
		 * (for-each(configDataLocations)) : true  #  inside getProfileSpecificReferences method
		 * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
		 * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
		 * (isAbsolute) : true  #  inside getResourceLocation method
		 * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
		 * (resourceLocation.endsWith(File.separator)) : true  #  inside isDirectory method
		 * (isDirectory(resourceLocation)) : true  #  inside getReferences method
		 * (for-each(this.configNames)) : true  #  inside getReferencesForDirectory method
		 * (for-each(this.propertySourceLoaders)) : false  #  inside getReferencesForConfigName method
		 * (for-each(references)) : false  #  inside resolve method
		 * (resolved.isEmpty()) : true  #  inside resolve method
		 * (for-each(references)) : false  #  inside resolveEmptyDirectories method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn(null).when(profilesMock).iterator();
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			List<StandardConfigDataResource> result = target.resolveProfileSpecific(configDataLocationResolverContextMock, locationMock, profilesMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				verify(locationMock).split();
				verify(profilesMock).iterator();
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${f8ba7ed4-8401-3bdd-b62b-96effdbf4b09}, hash: 4A766EDC7375254817DFC676AFA642F1
	@Disabled()
	@Test()
	void resolveProfileSpecificWhenConfigDataLocationIsOptionalAndReferencesIsEmptyAndResolvedIsEmptyAndReferencesIsEmpty() {
		/* Branches:
		 * (for-each(profiles)) : true  #  inside getProfileSpecificReferences method
		 * (for-each(configDataLocations)) : true  #  inside getProfileSpecificReferences method
		 * (resourceLocation.startsWith("/")) : false  #  inside getResourceLocation method
		 * (URL_PREFIX.matcher(resourceLocation).matches()) : true  #  inside getResourceLocation method
		 * (isAbsolute) : true  #  inside getResourceLocation method
		 * (resourceLocation.endsWith("/")) : false  #  inside isDirectory method
		 * (resourceLocation.endsWith(File.separator)) : false  #  inside isDirectory method
		 * (isDirectory(resourceLocation)) : false  #  inside getReferences method
		 * (extensionHintLocation) : true  #  inside getReferencesForFile method
		 * (for-each(this.propertySourceLoaders)) : false  #  inside getReferencesForFile method
		 * (configDataLocation.isOptional()) : true  #  inside getReferencesForFile method
		 * (for-each(references)) : false  #  inside resolve method
		 * (resolved.isEmpty()) : true  #  inside resolve method
		 * (for-each(references)) : false  #  inside resolveEmptyDirectories method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			ConfigDataLocation[] configDataLocationArray = new ConfigDataLocation[] {};
			doReturn(configDataLocationArray).when(locationMock).split();
			doReturn(null).when(profilesMock).iterator();
			NoOpLog noOpLog = new NoOpLog();
			doReturn(noOpLog).when(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
			doReturn(bindResultMock).when(binderMock).bind("spring.config.name", String[].class);
			String[] stringArray = new String[] {};
			String[] stringArray2 = new String[] { "application" };
			doReturn(stringArray).when(bindResultMock).orElse(stringArray2);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			StandardConfigDataLocationResolver target = new StandardConfigDataLocationResolver(logFactoryMock, binderMock, resourceLoaderMock);
			//Act Statement(s)
			List<StandardConfigDataResource> result = target.resolveProfileSpecific(configDataLocationResolverContextMock, locationMock, profilesMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				verify(locationMock).split();
				verify(profilesMock).iterator();
				verify(logFactoryMock).getLog(StandardConfigDataLocationResolver.class);
				verify(binderMock).bind("spring.config.name", String[].class);
				verify(bindResultMock).orElse(stringArray2);
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
			});
		}
	}
}
