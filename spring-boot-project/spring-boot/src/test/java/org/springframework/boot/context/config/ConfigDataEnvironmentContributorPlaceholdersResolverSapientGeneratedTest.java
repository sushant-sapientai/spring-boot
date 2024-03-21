package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigDataEnvironmentContributorPlaceholdersResolverSapientGeneratedTest {

	private final ConfigDataActivationContext configDataActivationContextMock = mock(ConfigDataActivationContext.class);

	private final ConfigDataEnvironmentContributor configDataEnvironmentContributorMock = mock(ConfigDataEnvironmentContributor.class);

	private final Iterable iterableMock = mock(Iterable.class);

	//Sapient generated method id: ${92f654c1-59d0-3f5f-8724-669bbd7eff5a}, hash: 5EAD571E3C5B9BB4F2A816980F678A03
	@Disabled()
	@Test()
	void resolvePlaceholdersWhenValueInstanceOfString() {
		/* Branches:
		 * (value instanceof String string) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: helper
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigDataEnvironmentContributorPlaceholdersResolver target = new ConfigDataEnvironmentContributorPlaceholdersResolver(iterableMock, configDataActivationContextMock, configDataEnvironmentContributorMock, false);
		//Act Statement(s)
		Object result = target.resolvePlaceholders("value1");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("return_of_replacePlaceholders1")));
	}

	//Sapient generated method id: ${2e755de7-a01c-3580-9542-15932e99692f}, hash: B7864185960EA35C071660942ADE6270
	@Test()
	void resolvePlaceholdersWhenValueNotInstanceOfString() {
		/* Branches:
		 * (value instanceof String string) : false
		 */
		//Arrange Statement(s)
		ConfigDataEnvironmentContributorPlaceholdersResolver target = new ConfigDataEnvironmentContributorPlaceholdersResolver(iterableMock, configDataActivationContextMock, configDataEnvironmentContributorMock, false);
		Object object = new Object();
		//Act Statement(s)
		Object result = target.resolvePlaceholders(object);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(object)));
	}
}
