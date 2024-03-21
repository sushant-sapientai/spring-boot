package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.springframework.core.io.ResourceLoader;

import org.mockito.stubbing.Answer;

import org.springframework.util.StringUtils;
import org.springframework.util.Assert;
import org.springframework.util.ResourceUtils;

import java.util.function.Supplier;

import org.springframework.core.io.Resource;

import org.mockito.MockedStatic;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
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
class LocationResourceLoaderSapientGeneratedTest {

	private final ResourceLoader resourceLoaderMock = mock(ResourceLoader.class, "resourceLoader");

	private final Resource resourceMock = mock(Resource.class);

	//Sapient generated method id: ${83d1f957-5683-3636-80b1-5d1f4cf96295}, hash: 179E372E5FC2A93CDF3BB8A9D64BB639
	@Test()
	void isPatternWhenLocationContains_() {
		/* Branches:
		 * (StringUtils.hasLength(location)) : true
		 * (location.contains("*")) : true
		 */
		//Arrange Statement(s)
		LocationResourceLoader target = new LocationResourceLoader(resourceLoaderMock);
		//Act Statement(s)
		boolean result = target.isPattern("*");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${ad6ecb0c-f28a-3621-aa20-4f7a359d034b}, hash: 885F2F3721AC8825C49707BD3389E300
	@Test()
	void isPatternWhenLocationNotContains_() {
		/* Branches:
		 * (StringUtils.hasLength(location)) : true
		 * (location.contains("*")) : false
		 */
		//Arrange Statement(s)
		LocationResourceLoader target = new LocationResourceLoader(resourceLoaderMock);
		//Act Statement(s)
		boolean result = target.isPattern("A");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${8da096d3-e6f3-3006-8187-7a36734bb4ce}, hash: B169D9DA37FC09F29B563FD62E322ED2
	@Test()
	void getResourceWhenResourceUtilsNotIsUrlLocation() {
		/* Branches:
		 * (!isPattern(location)) : true  #  inside validateNonPattern method
		 * (!ResourceUtils.isUrl(location)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			LocationResourceLoader target = spy(new LocationResourceLoader(resourceLoaderMock));
			doReturn(false).when(target).isPattern("A");
			doReturn(resourceMock).when(resourceLoaderMock).getResource("file:A");
			//Act Statement(s)
			Resource result = target.getResource("A");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(resourceMock));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
				verify(target).isPattern("A");
				verify(resourceLoaderMock).getResource("file:A");
			});
		}
	}

	//Sapient generated method id: ${876d6481-b89c-328e-97bb-1e8e641aad15}, hash: 2F3BD165BC0A3DD78111E429650CFB83
	@Test()
	void getResourceWhenIsPatternLocationAndResourceUtilsIsUrlLocation() {
		/* Branches:
		 * (!isPattern(location)) : false  #  inside validateNonPattern method
		 * (!ResourceUtils.isUrl(location)) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<ResourceUtils> resourceUtils = mockStatic(ResourceUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			resourceUtils.when(() -> ResourceUtils.isUrl("A")).thenReturn(true);
			LocationResourceLoader target = spy(new LocationResourceLoader(resourceLoaderMock));
			doReturn(true).when(target).isPattern("A");
			doReturn(resourceMock).when(resourceLoaderMock).getResource("A");
			//Act Statement(s)
			Resource result = target.getResource("A");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(resourceMock));
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
				resourceUtils.verify(() -> ResourceUtils.isUrl("A"), atLeast(1));
				verify(target).isPattern("A");
				verify(resourceLoaderMock).getResource("A");
			});
		}
	}

	//Sapient generated method id: ${c28e5654-5ba5-3b52-8f1e-d2ad6c16acd1}, hash: B8F35C9F4F11514B2DF91DEE534ACAB5
	@Disabled()
	@Test()
	void getResourcesWhenResourceNotExists() throws Exception {
		/* Branches:
		 * (!location.startsWith(ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX)) : true  #  inside validatePattern method
		 * (StringUtils.countOccurrencesOf(location, "*") == 1) : true  #  inside validatePattern method
		 * (type != ResourceType.DIRECTORY) : true  #  inside validatePattern method
		 * (!resource.exists()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			LocationResourceLoader target = spy(new LocationResourceLoader(resourceLoaderMock));
			doReturn(false).when(target).isPattern("location1");
			doReturn(resourceMock).when(target).getResource("location1");
			doReturn(false).when(resourceMock).exists();
			//Act Statement(s)
			Resource[] result = target.getResources("location1", LocationResourceLoader.ResourceType.FILE);
			Resource[] resourceResultArray = new Resource[] {};
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(resourceResultArray));
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()), atLeast(2));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()), atLeast(2));
				verify(target).isPattern("location1");
				verify(target).getResource("location1");
				verify(resourceMock).exists();
			});
		}
	}

	//Sapient generated method id: ${c1b693f1-34f8-3d72-bd2b-3b62fd974ef6}, hash: DF624D1CCEAA4008CC9F01621894095F
	@Disabled()
	@Test()
	void getResourcesWhenFileNotIsDirectory() throws Exception {
		/* Branches:
		 * (!location.startsWith(ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX)) : true  #  inside validatePattern method
		 * (StringUtils.countOccurrencesOf(location, "*") == 1) : true  #  inside validatePattern method
		 * (type != ResourceType.DIRECTORY) : true  #  inside validatePattern method
		 * (!resource.exists()) : false
		 * (!file.isDirectory()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			LocationResourceLoader target = spy(new LocationResourceLoader(resourceLoaderMock));
			doReturn(false).when(target).isPattern("location1");
			doReturn(resourceMock).when(target).getResource("location1");
			doReturn(false).when(resourceMock).exists();
			File file = new File("pathname1");
			doReturn(file).when(resourceMock).getFile();
			//Act Statement(s)
			Resource[] result = target.getResources("location1", LocationResourceLoader.ResourceType.FILE);
			Resource[] resourceResultArray = new Resource[] {};
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(resourceResultArray));
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()), atLeast(2));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()), atLeast(2));
				verify(target).isPattern("location1");
				verify(target).getResource("location1");
				verify(resourceMock).exists();
				verify(resourceMock).getFile();
			});
		}
	}

	//Sapient generated method id: ${0a0ac474-94a5-3006-8fb0-f5a244c7cf85}, hash: 63F08BD7A65F9F7C7011882EFE7A2232
	@Disabled()
	@Test()
	void getResourcesWhenCaughtExceptionThrowsIllegalStateException() throws IOException {
		/* Branches:
		 * (!location.startsWith(ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX)) : true  #  inside validatePattern method
		 * (StringUtils.countOccurrencesOf(location, "*") == 1) : true  #  inside validatePattern method
		 * (type != ResourceType.DIRECTORY) : true  #  inside validatePattern method
		 * (!resource.exists()) : false
		 * (catch-exception (Exception)) : true  #  inside getFile method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			LocationResourceLoader target = spy(new LocationResourceLoader(resourceLoaderMock));
			doReturn(false).when(target).isPattern("location1");
			doReturn(resourceMock).when(target).getResource("location1");
			doReturn(false).when(resourceMock).exists();
			File file = new File("pathname1");
			doReturn(file).when(resourceMock).getFile();
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.getResources("location1", LocationResourceLoader.ResourceType.FILE);
			});
			Exception exception = new Exception();
			IllegalStateException illegalStateException = new IllegalStateException("message1", exception);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(exception.getClass())));
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()), atLeast(2));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()), atLeast(2));
				verify(target).isPattern("location1");
				verify(target).getResource("location1");
				verify(resourceMock).exists();
				verify(resourceMock).getFile();
			});
		}
	}

	//Sapient generated method id: ${5f7ffde2-040e-3ceb-8599-71caa86dca72}, hash: 71DCE20B4C1B49BAD8EA0818D6CFC1C7
	@Disabled()
	@Test()
	void getResourcesWhenFileIsDirectoryAndSubDirectoriesIsNotNullAndTypeEqualsResourceTypeDIRECTORY() throws Exception {
		/* Branches:
		 * (!location.startsWith(ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX)) : false  #  inside validatePattern method
		 * (StringUtils.countOccurrencesOf(location, "*") == 1) : false  #  inside validatePattern method
		 * (type != ResourceType.DIRECTORY) : false  #  inside validatePattern method
		 * (!resource.exists()) : false
		 * (!file.isDirectory()) : false
		 * (subDirectories == null) : false
		 * (type == ResourceType.DIRECTORY) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			LocationResourceLoader target = spy(new LocationResourceLoader(resourceLoaderMock));
			doReturn(false).when(target).isPattern("location1");
			doReturn(resourceMock).when(target).getResource("location1");
			doReturn(false).when(resourceMock).exists();
			File file = new File("pathname1");
			doReturn(file).when(resourceMock).getFile();
			//Act Statement(s)
			Resource[] result = target.getResources("location1", LocationResourceLoader.ResourceType.FILE);
			Resource[] resourceResultArray = new Resource[] {};
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(resourceResultArray));
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()), atLeast(4));
				verify(target).isPattern("location1");
				verify(target).getResource("location1");
				verify(resourceMock).exists();
				verify(resourceMock).getFile();
			});
		}
	}

	//Sapient generated method id: ${607a0ead-fc76-38f5-b6fc-16d5d642ea93}, hash: 015301BA7960D83271D53534B58296B2
	@Disabled()
	@Test()
	void getResourcesWhenFilesIsNotNull() throws Exception {
		/* Branches:
		 * (!location.startsWith(ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX)) : true  #  inside validatePattern method
		 * (StringUtils.countOccurrencesOf(location, "*") == 1) : true  #  inside validatePattern method
		 * (type != ResourceType.DIRECTORY) : true  #  inside validatePattern method
		 * (!resource.exists()) : false
		 * (!file.isDirectory()) : false
		 * (subDirectories == null) : false
		 * (type == ResourceType.DIRECTORY) : false
		 * (for-each(subDirectories)) : true
		 * (files != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			LocationResourceLoader target = spy(new LocationResourceLoader(resourceLoaderMock));
			doReturn(false).when(target).isPattern("location1");
			doReturn(resourceMock).when(target).getResource("location1");
			doReturn(false).when(resourceMock).exists();
			File file = new File("pathname1");
			doReturn(file).when(resourceMock).getFile();
			//Act Statement(s)
			Resource[] result = target.getResources("location1", LocationResourceLoader.ResourceType.FILE);
			Resource[] resourceResultArray = new Resource[] {};
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(resourceResultArray));
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()), atLeast(2));
				_assert.verify(() -> Assert.state(eq(true), (Supplier) any()), atLeast(2));
				verify(target).isPattern("location1");
				verify(target).getResource("location1");
				verify(resourceMock).exists();
				verify(resourceMock).getFile();
			});
		}
	}
}
