package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MutuallyExclusiveConfigurationPropertiesExceptionSapientGeneratedTest {

	private final Consumer consumerMock = mock(Consumer.class);

	//Sapient generated method id: ${3108182a-2878-331d-9fc8-447f5994d0fc}, hash: B834B836AE44E3D45F4F9F20C4262A94
	@Test()
	void throwIfMultipleNonNullValuesInWhenConfiguredNamesSizeNotGreaterThan1() {
		/* Branches:
		 * (configuredNames.size() > 1) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		MutuallyExclusiveConfigurationPropertiesException.throwIfMultipleNonNullValuesIn(consumerMock);
	}

	//Sapient generated method id: ${88052858-048f-33ac-8a82-ddf8cad9aead}, hash: 4568C4EA3437E105CF917B602C009579
	@Disabled()
	@Test()
	void throwIfMultipleNonNullValuesInWhenCollectionIsNotNullThrowsMutuallyExclusiveConfigurationPropertiesException() {
		/* Branches:
		 * (configuredNames.size() > 1) : true
		 * (collection != null) : true  #  inside asSet method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		final MutuallyExclusiveConfigurationPropertiesException result = assertThrows(MutuallyExclusiveConfigurationPropertiesException.class, () -> {
			MutuallyExclusiveConfigurationPropertiesException.throwIfMultipleNonNullValuesIn(consumerMock);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${3dd09632-79d9-3e4f-846b-f9cf2a2ec546}, hash: 90CE1462FB14F2CF36FE1876ECEF0E68
	@Disabled()
	@Test()
	void throwIfMultipleNonNullValuesInWhenCollectionIsNullThrowsMutuallyExclusiveConfigurationPropertiesException() {
		/* Branches:
		 * (configuredNames.size() > 1) : true
		 * (collection != null) : false  #  inside asSet method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		final MutuallyExclusiveConfigurationPropertiesException result = assertThrows(MutuallyExclusiveConfigurationPropertiesException.class, () -> {
			MutuallyExclusiveConfigurationPropertiesException.throwIfMultipleNonNullValuesIn(consumerMock);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
