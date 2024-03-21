package org.springframework.boot.context.properties.bind;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import org.springframework.boot.origin.Origin;
import org.springframework.boot.context.properties.source.ConfigurationProperty;
import org.springframework.util.Assert;

import org.mockito.MockedStatic;

import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import java.util.function.Consumer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BoundPropertiesTrackingBindHandlerSapientGeneratedTest {

	//Sapient generated method id: ${16f9706f-ab77-3149-a783-73708e126a86}, hash: 0EDDD666ECE21FE3CE404A94CF6A6F69
	@Test()
	void onSuccessWhenNameEqualsContextGetConfigurationPropertyGetName() {
		/* Branches:
		 * (context.getConfigurationProperty() != null) : true
		 * (name.equals(context.getConfigurationProperty().getName())) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		BindContext contextMock = mock(BindContext.class);
		ConfigurationProperty configurationPropertyMock = mock(ConfigurationProperty.class);
		ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);
		Origin originMock = mock(Origin.class);
		ConfigurationProperty configurationPropertyMock2 = mock(ConfigurationProperty.class);
		Consumer consumerMock = mock(Consumer.class);
		Bindable bindableMock = mock(Bindable.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS)) {
			Object object = new Object();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, object, originMock);
			doReturn(configurationPropertyMock, configurationProperty, configurationPropertyMock2).when(contextMock).getConfigurationProperty();
			_assert.when(() -> Assert.notNull(consumerMock, "Consumer must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			BoundPropertiesTrackingBindHandler target = new BoundPropertiesTrackingBindHandler(consumerMock);
			Object object2 = new Object();
			//Act Statement(s)
			Object result = target.onSuccess(configurationPropertyNameMock, bindableMock, contextMock, object2);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(contextMock, atLeast(3)).getConfigurationProperty();
				_assert.verify(() -> Assert.notNull(consumerMock, "Consumer must not be null"), atLeast(1));
			});
		}
	}
}
