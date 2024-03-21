package org.springframework.boot.context.properties;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.util.ClassUtils;

import org.mockito.MockedStatic;

import org.springframework.context.ApplicationContext;
import org.springframework.validation.Errors;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
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
class ConfigurationPropertiesJsr303ValidatorSapientGeneratedTest {

	private final ApplicationContext applicationContextMock = mock(ApplicationContext.class);

	//Sapient generated method id: ${b0fd6193-6bc2-3249-baf1-975b64959d5f}, hash: 7D34D181554BAE49DF815049FE6C4BF8
	@Disabled()
	@Test()
	void supportsWhenThisDelegateSupportsType() {
		/* Branches:
		 * (this.delegate.supports(type)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertiesJsr303Validator target = new ConfigurationPropertiesJsr303Validator(applicationContextMock);
		//Act Statement(s)
		boolean result = target.supports(Object.class);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${195f945e-2726-31ec-ab88-a6194c87df0a}, hash: AF498B75D8A49C6EC63BB0B0595D2632
	@Disabled()
	@Test()
	void supportsWhenThisDelegateNotSupportsType() {
		/* Branches:
		 * (this.delegate.supports(type)) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertiesJsr303Validator target = new ConfigurationPropertiesJsr303Validator(applicationContextMock);
		//Act Statement(s)
		boolean result = target.supports(Object.class);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${d6258f2b-2170-3e1b-a0f4-0e909ecdbd95}, hash: 0E77ADFC2C8D178050BB874316B13FF0
	@Disabled()
	@Test()
	void validateTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: delegate
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertiesJsr303Validator target = new ConfigurationPropertiesJsr303Validator(applicationContextMock);
		Object object = new Object();
		Errors errorsMock = mock(Errors.class);
		//Act Statement(s)
		target.validate(object, errorsMock);
	}

	//Sapient generated method id: ${7397d75a-8dd7-3534-b9ff-a928c990d5ad}, hash: 2E85CF7320D7F85F2C27D3A6784A02C2
	@Test()
	void isJsr303PresentWhenClassUtilsNotIsPresentValidatorClassClassLoader() {
		/* Branches:
		 * (for-each(VALIDATOR_CLASSES)) : true
		 * (!ClassUtils.isPresent(validatorClass, classLoader)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader).when(applicationContextMock).getClassLoader();
			classUtils.when(() -> ClassUtils.isPresent(eq("jakarta.validation.Validator"), (ClassLoader) any())).thenReturn(false);
			//Act Statement(s)
			boolean result = ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				verify(applicationContextMock).getClassLoader();
				classUtils.verify(() -> ClassUtils.isPresent(eq("jakarta.validation.Validator"), (ClassLoader) any()));
			});
		}
	}

	//Sapient generated method id: ${e8747bbc-a725-3f39-9997-8dbea99cbf99}, hash: C4BFC04A25395F8D7D2D7279395A9021
	@Test()
	void isJsr303PresentWhenClassUtilsIsPresentValidatorClassClassLoader() {
		/* Branches:
		 * (for-each(VALIDATOR_CLASSES)) : true
		 * (!ClassUtils.isPresent(validatorClass, classLoader)) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
			doReturn(classLoader).when(applicationContextMock).getClassLoader();
			classUtils.when(() -> ClassUtils.isPresent(eq("jakarta.validation.Validator"), (ClassLoader) any())).thenReturn(true);
			classUtils.when(() -> ClassUtils.isPresent(eq("jakarta.validation.ValidatorFactory"), (ClassLoader) any())).thenReturn(true);
			classUtils.when(() -> ClassUtils.isPresent(eq("jakarta.validation.bootstrap.GenericBootstrap"), (ClassLoader) any())).thenReturn(true);
			//Act Statement(s)
			boolean result = ConfigurationPropertiesJsr303Validator.isJsr303Present(applicationContextMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				verify(applicationContextMock).getClassLoader();
				classUtils.verify(() -> ClassUtils.isPresent(eq("jakarta.validation.Validator"), (ClassLoader) any()));
				classUtils.verify(() -> ClassUtils.isPresent(eq("jakarta.validation.ValidatorFactory"), (ClassLoader) any()));
				classUtils.verify(() -> ClassUtils.isPresent(eq("jakarta.validation.bootstrap.GenericBootstrap"), (ClassLoader) any()));
			});
		}
	}
}
