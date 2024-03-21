package org.springframework.boot.context.annotation;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.mockito.stubbing.Answer;

import java.util.Iterator;

import org.springframework.util.Assert;

import org.mockito.MockedStatic;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.anyList;
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
class ImportCandidatesSapientGeneratedTest {

	//Sapient generated method id: ${78c09fb6-edcf-3ce7-9932-6ef4ffc152b3}, hash: 928D724BAEA7160834F7DF69064B0EB7
	@Test()
	void iteratorTest() {
		//Arrange Statement(s)
		ImportCandidates target = ImportCandidates.load(Object.class, (ClassLoader) null);
		//Act Statement(s)
		Iterator<String> result = target.iterator();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${a3c7da29-0bbd-3f39-9f91-a3778d99b52f}, hash: 521B0ADBC69A859EC7BABC4B79C4ACE4
	@Disabled()
	@Test()
	void loadWhenCaughtIOExceptionThrowsIllegalArgumentException() throws IOException {
		/* Branches:
		 * (classLoader == null) : true  #  inside decideClassloader method
		 * (catch-exception (IOException)) : true  #  inside findUrlsInClasspath method
		 */
		//Arrange Statement(s)
		IOException iOExceptionMock = mock(IOException.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(Object.class, "'annotation' must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ClassLoader classLoader = null;
			//Act Statement(s)
			final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
				ImportCandidates.load(Object.class, classLoader);
			});
			IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Failed to load configurations from location [META-INF/spring/.imports]", iOExceptionMock);
			IOException iOException = new IOException();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
				_assert.verify(() -> Assert.notNull(Object.class, "'annotation' must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c16e6d43-e4d4-3f25-9b3e-719ad3301153}, hash: AC8F8EE5F97DBECB23FCA9FA3F824651
	@Test()
	void loadWhenClassLoaderIsNotNullAndUrlsNotHasMoreElements() throws Throwable, IOException {
		/* Branches:
		 * (classLoader == null) : false  #  inside decideClassloader method
		 * (urls.hasMoreElements()) : false
		 */
		//Arrange Statement(s)
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//Act Statement(s)
		ImportCandidates result = ImportCandidates.load(Object.class, classLoader);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${66276f23-9dba-3ae4-aaf3-495b01d2b949}, hash: 3BCFBB7928110208F3AD5A2B2BC3CA3F
	@Test()
	void loadWhenLineIsEmpty() throws Throwable, IOException {
		/* Branches:
		 * (classLoader == null) : true  #  inside decideClassloader method
		 * (urls.hasMoreElements()) : true
		 * ((line = reader.readLine()) != null) : true  #  inside readCandidateConfigurations method
		 * (commentStart == -1) : true  #  inside stripComment method
		 * (line.isEmpty()) : true  #  inside readCandidateConfigurations method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: object of type UrlResource - Method: getInputStream
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			_assert.when(() -> Assert.notNull(Object.class, "'annotation' must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ClassLoader classLoader = null;
			//Act Statement(s)
			ImportCandidates result = ImportCandidates.load(Object.class, classLoader);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(Object.class, "'annotation' must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f3da8e3e-2e95-395b-9655-a8600e04db22}, hash: F912FC961A09739B7B0CCB4A68207966
	@Test()
	void loadWhenCommentStartNotEqualsMinus1AndLineNotIsEmpty() throws Throwable, IOException {
		/* Branches:
		 * (classLoader == null) : true  #  inside decideClassloader method
		 * (urls.hasMoreElements()) : true
		 * ((line = reader.readLine()) != null) : true  #  inside readCandidateConfigurations method
		 * (commentStart == -1) : false  #  inside stripComment method
		 * (line.isEmpty()) : false  #  inside readCandidateConfigurations method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: object of type UrlResource - Method: getInputStream
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(Object.class, "'annotation' must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(anyList(), eq("'candidates' must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			ClassLoader classLoader = null;
			//Act Statement(s)
			ImportCandidates result = ImportCandidates.load(Object.class, classLoader);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(Object.class, "'annotation' must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(anyList(), eq("'candidates' must not be null")));
			});
		}
	}

	//Sapient generated method id: ${2b216bd1-213c-3ae7-8203-1ee6c92eb640}, hash: FD82C4319AF554561221E12E58CEC993
	@Disabled()
	@Test()
	void loadWhenDefaultBranchThrowsThrowable() throws IOException {
		/* Branches:
		 * (classLoader == null) : true  #  inside decideClassloader method
		 * (urls.hasMoreElements()) : true
		 * ((line = reader.readLine()) != null) : true  #  inside readCandidateConfigurations method
		 * (commentStart == -1) : true  #  inside stripComment method
		 * (line.isEmpty()) : true  #  inside readCandidateConfigurations method
		 * (branch expression (line 110)) : true  #  inside readCandidateConfigurations method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: object of type UrlResource - Method: getInputStream
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(Object.class, "'annotation' must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ClassLoader classLoader = null;
			//Act Statement(s)
			final Throwable result = assertThrows(Throwable.class, () -> {
				ImportCandidates.load(Object.class, classLoader);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(Object.class, "'annotation' must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${48a9e60b-ff61-3e6e-8a7b-c99dc294b5dd}, hash: EEAE0D05CADE256B2156B4B3AE170CB3
	@Disabled()
	@Test()
	void loadWhenLineIsEmptyAndCaughtIOExceptionThrowsIllegalArgumentException() throws IOException {
		/* Branches:
		 * (classLoader == null) : true  #  inside decideClassloader method
		 * (urls.hasMoreElements()) : true
		 * ((line = reader.readLine()) != null) : true  #  inside readCandidateConfigurations method
		 * (commentStart == -1) : true  #  inside stripComment method
		 * (line.isEmpty()) : true  #  inside readCandidateConfigurations method
		 * (catch-exception (IOException)) : true  #  inside readCandidateConfigurations method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: object of type UrlResource - Method: getInputStream
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(Object.class, "'annotation' must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ClassLoader classLoader = null;
			//Act Statement(s)
			final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
				ImportCandidates.load(Object.class, classLoader);
			});
			IOException iOException = new IOException();
			IllegalArgumentException illegalArgumentException = new IllegalArgumentException("message1", iOException);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
				_assert.verify(() -> Assert.notNull(Object.class, "'annotation' must not be null"), atLeast(1));
			});
		}
	}
}
