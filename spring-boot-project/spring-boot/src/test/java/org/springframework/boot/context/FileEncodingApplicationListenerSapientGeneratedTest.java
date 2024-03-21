package org.springframework.boot.context;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.SpringApplication;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FileEncodingApplicationListenerSapientGeneratedTest {

	private final ConfigurableBootstrapContext configurableBootstrapContextMock = mock(ConfigurableBootstrapContext.class);

	private final ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class);

	private final SpringApplication springApplicationMock = mock(SpringApplication.class);

	//Sapient generated method id: ${13dc4dfd-0eae-3a88-9a21-2f09e0c561cf}, hash: A2C236D8D88F8D2055B8F3EBA88F42FE
	@Test()
	void onApplicationEventWhenDesiredIsNull() {
		/* Branches:
		 * (desired == null) : true
		 */
		//Arrange Statement(s)
		doReturn(null).when(environmentMock).getProperty("spring.mandatory-file-encoding");
		FileEncodingApplicationListener target = new FileEncodingApplicationListener();
		String[] stringArray = new String[] {};
		ApplicationEnvironmentPreparedEvent applicationEnvironmentPreparedEvent = new ApplicationEnvironmentPreparedEvent(configurableBootstrapContextMock, springApplicationMock, stringArray, environmentMock);
		//Act Statement(s)
		target.onApplicationEvent(applicationEnvironmentPreparedEvent);
		//Assert statement(s)
		assertAll("result", () -> verify(environmentMock).getProperty("spring.mandatory-file-encoding"));
	}

	//Sapient generated method id: ${dd92fe74-4b53-31b0-9ac9-f5b39cecb33a}, hash: BA056B8DA145BF726B1343518E1A4BA5
	@Disabled()
	@Test()
	void onApplicationEventWhenDesiredEqualsIgnoreCaseEncoding() {
		/* Branches:
		 * (desired == null) : false
		 * (encoding != null) : true
		 * (!desired.equalsIgnoreCase(encoding)) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.lang.System::getProperty has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn("B").when(environmentMock).getProperty("spring.mandatory-file-encoding");
		FileEncodingApplicationListener target = new FileEncodingApplicationListener();
		String[] stringArray = new String[] {};
		ApplicationEnvironmentPreparedEvent applicationEnvironmentPreparedEvent = new ApplicationEnvironmentPreparedEvent(configurableBootstrapContextMock, springApplicationMock, stringArray, environmentMock);
		//Act Statement(s)
		target.onApplicationEvent(applicationEnvironmentPreparedEvent);
		//Assert statement(s)
		assertAll("result", () -> verify(environmentMock).getProperty("spring.mandatory-file-encoding"));
	}

	//Sapient generated method id: ${e9fbbf8f-a708-3e27-a727-1b6dd20cce86}, hash: 7BC3217E330DDB309FD8A5EEDD744F6B
	@Test()
	void onApplicationEventWhenLoggerIsErrorEnabledThrowsIllegalStateException() {
		/* Branches:
		 * (desired == null) : false
		 * (encoding != null) : true
		 * (!desired.equalsIgnoreCase(encoding)) : true
		 * (logger.isErrorEnabled()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.lang.System::getProperty has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn("D").when(environmentMock).getProperty("spring.mandatory-file-encoding");
		FileEncodingApplicationListener target = new FileEncodingApplicationListener();
		String[] stringArray = new String[] {};
		ApplicationEnvironmentPreparedEvent applicationEnvironmentPreparedEvent = new ApplicationEnvironmentPreparedEvent(configurableBootstrapContextMock, springApplicationMock, stringArray, environmentMock);
		IllegalStateException illegalStateException = new IllegalStateException("The Java Virtual Machine has not been configured to use the desired default character encoding (D).");
		//Act Statement(s)
		final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
			target.onApplicationEvent(applicationEnvironmentPreparedEvent);
		});
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
			verify(environmentMock).getProperty("spring.mandatory-file-encoding");
		});
	}
}
