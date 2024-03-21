package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import org.springframework.core.io.ResourceLoader;

import org.mockito.stubbing.Answer;

import org.springframework.util.Assert;

import java.nio.file.Path;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigTreeConfigDataLocationResolverSapientGeneratedTest {

	private final ConfigDataLocationResolverContext configDataLocationResolverContextMock = mock(ConfigDataLocationResolverContext.class);

	private final ConfigDataLocation locationMock = mock(ConfigDataLocation.class);

	private final ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);

	//Sapient generated method id: ${6b78cc0f-648f-3dea-82de-b38f68724c0c}, hash: FFA8071E699FF55FE826CC870D38EAC1
	@Test()
	void isResolvableWhenLocationHasPrefixPREFIX() {
		/* Branches:
		 * (location.hasPrefix(PREFIX)) : true
		 */
		//Arrange Statement(s)
		doReturn(true).when(locationMock).hasPrefix("configtree:");
		ConfigTreeConfigDataLocationResolver target = new ConfigTreeConfigDataLocationResolver(resourceLoaderMock);
		//Act Statement(s)
		boolean result = target.isResolvable(configDataLocationResolverContextMock, locationMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.TRUE));
			verify(locationMock).hasPrefix("configtree:");
		});
	}

	//Sapient generated method id: ${f3c72092-d023-31e2-895e-c58417003c86}, hash: A047618F7E5592F7B6F74F3DD822FB18
	@Test()
	void isResolvableWhenLocationNotHasPrefixPREFIX() {
		/* Branches:
		 * (location.hasPrefix(PREFIX)) : false
		 */
		//Arrange Statement(s)
		doReturn(false).when(locationMock).hasPrefix("configtree:");
		ConfigTreeConfigDataLocationResolver target = new ConfigTreeConfigDataLocationResolver(resourceLoaderMock);
		//Act Statement(s)
		boolean result = target.isResolvable(configDataLocationResolverContextMock, locationMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(locationMock).hasPrefix("configtree:");
		});
	}

	//Sapient generated method id: ${2206528a-4a91-39e3-b925-d3b48c4d52da}, hash: E18D68A87FC9D8525B4754C03F6D3A44
	@Test()
	void resolveWhenThisResourceLoaderNotIsPatternLocation() throws IOException {
		/* Branches:
		 * (!this.resourceLoader.isPattern(location)) : true  #  inside resolve method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: resourceLoader - Method: isPattern
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn("A").when(locationMock).getNonPrefixedValue("configtree:");
			_assert.when(() -> Assert.isTrue(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			ConfigTreeConfigDataLocationResolver target = new ConfigTreeConfigDataLocationResolver(resourceLoaderMock);
			//Act Statement(s)
			List<ConfigTreeConfigDataResource> result = target.resolve(configDataLocationResolverContextMock, locationMock);
			ConfigTreeConfigDataResource configTreeConfigDataResource = new ConfigTreeConfigDataResource("A");
			List<ConfigTreeConfigDataResource> configTreeConfigDataResourceResultList = new ArrayList<>(List.of(configTreeConfigDataResource));
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(configTreeConfigDataResourceResultList.size()));
				assertThat(result, containsInRelativeOrder(configTreeConfigDataResourceResultList.toArray()));
				verify(locationMock).getNonPrefixedValue("configtree:");
				_assert.verify(() -> Assert.isTrue(eq(false), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${2133bd83-535c-3663-82c2-0c722bb1179c}, hash: B0C930CD329AD84F850DCAFF26854ACB
	@Disabled()
	@Test()
	void resolveWhenCaughtIOExceptionThrowsConfigDataLocationNotFoundException() {
		/* Branches:
		 * (!this.resourceLoader.isPattern(location)) : true  #  inside resolve method
		 * (catch-exception (IOException)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: resourceLoader - Method: isPattern
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn("A").when(locationMock).getNonPrefixedValue("configtree:");
			_assert.when(() -> Assert.isTrue(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			ConfigTreeConfigDataLocationResolver target = new ConfigTreeConfigDataLocationResolver(resourceLoaderMock);
			//Act Statement(s)
			final ConfigDataLocationNotFoundException result = assertThrows(ConfigDataLocationNotFoundException.class, () -> {
				target.resolve(configDataLocationResolverContextMock, locationMock);
			});
			IOException iOException = new IOException();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
				verify(locationMock, atLeast(1)).getNonPrefixedValue("configtree:");
				_assert.verify(() -> Assert.isTrue(eq(false), (Supplier) any()));
			});
		}
	}

	//Sapient generated method id: ${5cd1dbd5-2bcb-30bb-826a-c8ff4c48a577}, hash: 6EC53DF6C7EFC360C45ED979780D2DE7
	@Disabled()
	@Test()
	void resolveWhenResourcesIsNotEmpty() throws IOException {
		/* Branches:
		 * (!this.resourceLoader.isPattern(location)) : false  #  inside resolve method
		 * (for-each(resources)) : true  #  inside resolve method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: resourceLoader - Method: isPattern
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Path pathMock = mock(Path.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn("A").when(locationMock).getNonPrefixedValue("configtree:");
			_assert.when(() -> Assert.isTrue(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			ConfigTreeConfigDataLocationResolver target = new ConfigTreeConfigDataLocationResolver(resourceLoaderMock);
			//Act Statement(s)
			List<ConfigTreeConfigDataResource> result = target.resolve(configDataLocationResolverContextMock, locationMock);
			ConfigTreeConfigDataResource configTreeConfigDataResource = new ConfigTreeConfigDataResource(pathMock);
			List<ConfigTreeConfigDataResource> configTreeConfigDataResourceResultList = new ArrayList<>(1);
			configTreeConfigDataResourceResultList.add(configTreeConfigDataResource);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(configTreeConfigDataResourceResultList.size()));
				assertThat(result, containsInRelativeOrder(configTreeConfigDataResourceResultList.toArray()));
				verify(locationMock).getNonPrefixedValue("configtree:");
				_assert.verify(() -> Assert.isTrue(eq(false), (Supplier) any()));
			});
		}
	}
}
