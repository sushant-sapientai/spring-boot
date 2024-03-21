package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigDataPropertiesSapientGeneratedTest {

	private final ConfigDataProperties.Activate activateMock = mock(ConfigDataProperties.Activate.class, "activate");

	private final ConfigDataActivationContext configDataActivationContextMock = mock(ConfigDataActivationContext.class);

	//Sapient generated method id: ${a7686ba3-4398-3c4f-8a12-0630458f6b73}, hash: 52D6F8385125C8A3EF8DEF5AA356F394
	@Test()
	void isActiveWhenThisActivateIsActiveActivationContext() {
		/* Branches:
		 * (this.activate == null) : false
		 * (this.activate.isActive(activationContext)) : true
		 */
		//Arrange Statement(s)
		List<ConfigDataLocation> configDataLocationList = new ArrayList<>();
		ConfigDataProperties target = new ConfigDataProperties(configDataLocationList, activateMock);
		doReturn(true).when(activateMock).isActive(configDataActivationContextMock);

		//Act Statement(s)
		boolean result = target.isActive(configDataActivationContextMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.TRUE));
			verify(activateMock).isActive(configDataActivationContextMock);
		});
	}

	//Sapient generated method id: ${367670c8-7071-3de6-ae86-91f98de36d72}, hash: 828BD9BF88B881749577E23D5589FE0D
	@Test()
	void isActiveWhenThisActivateNotIsActiveActivationContext() {
		/* Branches:
		 * (this.activate == null) : false
		 * (this.activate.isActive(activationContext)) : false
		 */
		//Arrange Statement(s)
		List<ConfigDataLocation> configDataLocationList = new ArrayList<>();
		ConfigDataProperties target = new ConfigDataProperties(configDataLocationList, activateMock);
		doReturn(false).when(activateMock).isActive(configDataActivationContextMock);

		//Act Statement(s)
		boolean result = target.isActive(configDataActivationContextMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(activateMock).isActive(configDataActivationContextMock);
		});
	}

	//Sapient generated method id: ${c0df80b8-42ee-3e61-b9ff-afe788883f2a}, hash: 55EBE83AE760D203F0C02541CC3302CB
	@Test()
	void withoutImportsWhenDefaultBranch() {
		/* Branches:
		 * (branch expression (line 53)) : false  #  inside <init> method
		 */
		//Arrange Statement(s)
		List<ConfigDataLocation> configDataLocationList = new ArrayList<>();
		ConfigDataProperties target = new ConfigDataProperties(configDataLocationList, activateMock);

		//Act Statement(s)
		ConfigDataProperties result = target.withoutImports();

		//Assert statement(s)
		//TODO: Please implement equals method in ConfigDataProperties for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}, hash: 9010FFA3E4E619781D4FC8E14BE6DE62
	@Test()
	void getTest() {
		//Arrange Statement(s)
		Binder binderMock = mock(Binder.class);
		BindResult bindResultMock = mock(BindResult.class);
		doReturn(bindResultMock).when(binderMock).bind((ConfigurationPropertyName) any(), (Bindable) any(), (ConfigDataLocationBindHandler) any());
		ConfigDataProperties configDataPropertiesMock = mock(ConfigDataProperties.class);
		doReturn(configDataPropertiesMock).when(bindResultMock).orElse(null);

		//Act Statement(s)
		ConfigDataProperties result = ConfigDataProperties.get(binderMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(configDataPropertiesMock));
			verify(binderMock).bind((ConfigurationPropertyName) any(), (Bindable) any(), (ConfigDataLocationBindHandler) any());
			verify(bindResultMock).orElse(null);
		});
	}
}
