package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.mockito.stubbing.Answer;

import org.springframework.core.io.Resource;

import org.mockito.MockedStatic;

import org.springframework.core.io.FileUrlResource;

import java.io.File;

import org.springframework.util.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StandardConfigDataResourceSapientGeneratedTest {

	private final StandardConfigDataReference referenceMock = mock(StandardConfigDataReference.class, "reference");

	private final FileUrlResource resourceMock = mock(FileUrlResource.class, "<init>_resource1");

	//Sapient generated method id: ${6780309b-92bc-33e6-800b-154b82269244}, hash: 18F9592B0D0772D2A851A0D5AE0213BB
	@Test()
	void getProfileTest() {
		//Arrange Statement(s)
		Resource resourceMock2 = mock(Resource.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(referenceMock, "Reference must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(resourceMock2, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			StandardConfigDataResource target = new StandardConfigDataResource(referenceMock, resourceMock2, false);
			doReturn("return_of_getProfile1").when(referenceMock).getProfile();
			//Act Statement(s)
			String result = target.getProfile();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_getProfile1"));
				_assert.verify(() -> Assert.notNull(referenceMock, "Reference must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(resourceMock2, "Resource must not be null"), atLeast(1));
				verify(referenceMock).getProfile();
			});
		}
	}

	//Sapient generated method id: ${c5555d08-d01a-3a52-a66e-e1e21ecbfbf3}, hash: 2D5A6D5892D83401E81DA9BA8ADE6018
	@Disabled()
	@Test()
	void toStringWhenThisResourceInstanceOfFileUrlResource() throws IOException {
		/* Branches:
		 * (this.resource instanceof FileSystemResource) : false
		 * (this.resource instanceof FileUrlResource) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(referenceMock, "Reference must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			StandardConfigDataResource target = new StandardConfigDataResource(referenceMock, resourceMock, false);
			File file = new File("pathname1");
			doReturn(file).when(resourceMock).getFile();
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("file [toString_file1]"));
				_assert.verify(() -> Assert.notNull(referenceMock, "Reference must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
				verify(resourceMock).getFile();
			});
		}
	}

	//Sapient generated method id: ${18106b5f-54ff-3ffc-a7e0-efa49143f1e2}, hash: 1B0AD30DE7024A6517E9E055FC4B74F7
	@Test()
	void toStringWhenThisResourceNotInstanceOfFileUrlResource() throws IOException {
		/* Branches:
		 * (this.resource instanceof FileSystemResource) : false
		 * (this.resource instanceof FileUrlResource) : false
		 */
		//Arrange Statement(s)
		Resource resourceMock2 = mock(Resource.class, "<init>_resource1");
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(referenceMock, "Reference must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(resourceMock2, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			StandardConfigDataResource target = new StandardConfigDataResource(referenceMock, resourceMock2, false);
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("<init>_resource1"));
				_assert.verify(() -> Assert.notNull(referenceMock, "Reference must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(resourceMock2, "Resource must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${75dc4ff8-2cf2-313b-a667-5df014450199}, hash: 1F23D563E281630D85492F655E4B1C88
	@Disabled()
	@Test()
	void toStringWhenCaughtIOException() throws IOException {
		/* Branches:
		 * (this.resource instanceof FileSystemResource) : false
		 * (this.resource instanceof FileUrlResource) : true
		 * (catch-exception (IOException)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(referenceMock, "Reference must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(resourceMock, "Resource must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			StandardConfigDataResource target = new StandardConfigDataResource(referenceMock, resourceMock, false);
			File file = new File("pathname1");
			doReturn(file).when(resourceMock).getFile();
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("<init>_resource1"));
				_assert.verify(() -> Assert.notNull(referenceMock, "Reference must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(resourceMock, "Resource must not be null"), atLeast(1));
				verify(resourceMock).getFile();
			});
		}
	}
}
