package org.springframework.boot.context.properties.bind.validation;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.validation.Validator;
import org.springframework.boot.context.properties.bind.BindContext;

import org.mockito.stubbing.Answer;

import org.springframework.core.ResolvableType;
import org.springframework.validation.Errors;
import org.springframework.boot.context.properties.source.ConfigurationProperty;
import org.springframework.util.Assert;
import org.springframework.boot.context.properties.bind.Bindable;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.boot.context.properties.bind.BindHandler;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ValidationBindHandlerSapientGeneratedTest {

	private final BindHandler parentMock = mock(BindHandler.class, "parent");

	private final Bindable bindableMock = mock(Bindable.class);

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final BindContext contextMock = mock(BindContext.class);

	private final ResolvableType resolvableTypeMock = mock(ResolvableType.class);

	private final Supplier supplierMock = mock(Supplier.class);

	private final Bindable targetMock = mock(Bindable.class);

	private final Validator validatorMock = mock(Validator.class);

	//Sapient generated method id: ${1b031792-a2be-3eb2-9c2b-1c39b062abb7}, hash: 851552A9D72C28CC27CFD313EEDDB034
	@Test()
	void onStartTest() {
		//Arrange Statement(s)
		BindContext bindContextMock = mock(BindContext.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Validator[] validatorArray = new Validator[] {};
			ValidationBindHandler target = new ValidationBindHandler(parentMock, validatorArray);
			doReturn(bindableMock).when(parentMock).onStart(eq(configurationPropertyNameMock), (Bindable) any(), eq(bindContextMock));
			Bindable bindable = Bindable.of(resolvableTypeMock);
			//Act Statement(s)
			Bindable result = target.onStart(configurationPropertyNameMock, bindable, bindContextMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindableMock));
				_assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
				verify(parentMock).onStart(eq(configurationPropertyNameMock), (Bindable) any(), eq(bindContextMock));
			});
		}
	}

	//Sapient generated method id: ${375b8827-9a6a-39a3-85de-4f975a205d5b}, hash: 0C5D21D192804004E0D36B627AEE49C6
	@Test()
	void onSuccessWhenContextGetConfigurationPropertyIsNotNull() {
		/* Branches:
		 * (context.getConfigurationProperty() != null) : true
		 */
		//Arrange Statement(s)
		ConfigurationProperty configurationPropertyMock = mock(ConfigurationProperty.class);
		ConfigurationProperty configurationPropertyMock2 = mock(ConfigurationProperty.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(configurationPropertyMock, configurationPropertyMock2).when(contextMock).getConfigurationProperty();
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Validator[] validatorArray = new Validator[] {};
			ValidationBindHandler target = new ValidationBindHandler(parentMock, validatorArray);
			Object object = new Object();
			Object object2 = new Object();
			doReturn(object).when(parentMock).onSuccess(configurationPropertyNameMock, bindableMock, contextMock, object2);
			//Act Statement(s)
			Object result = target.onSuccess(configurationPropertyNameMock, bindableMock, contextMock, object2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(object));
				verify(contextMock, times(2)).getConfigurationProperty();
				_assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
				verify(parentMock).onSuccess(configurationPropertyNameMock, bindableMock, contextMock, object2);
			});
		}
	}

	//Sapient generated method id: ${f3728810-568a-33c3-9be6-094b28b002e9}, hash: 55D317CE88FBC04029AACE9D76C06547
	@Test()
	void onFailureWhenTargetGetValueIsNullAndValidationTargetIsNullAndContextGetDepthNotEquals0() throws Exception {
		/* Branches:
		 * (result != null) : false
		 * (this.exception == null) : true  #  inside validate method
		 * (result != null) : false  #  inside getValidationTarget method
		 * (context.getDepth() == 0) : true  #  inside getValidationTarget method
		 * (target.getValue() != null) : false  #  inside getValidationTarget method
		 * (validationTarget != null) : false  #  inside validate method
		 * (context.getDepth() == 0) : false  #  inside validate method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(null).when(targetMock).getValue();
			doReturn(resolvableTypeMock).when(targetMock).getBoxedType();
			doReturn(Object.class).when(resolvableTypeMock).resolve();
			doReturn(0, -1).when(contextMock).getDepth();
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Validator[] validatorArray = new Validator[] {};
			ValidationBindHandler target = new ValidationBindHandler(parentMock, validatorArray);
			Exception exception = new Exception();
			doReturn(null).when(parentMock).onFailure(configurationPropertyNameMock, targetMock, contextMock, exception);
			//Act Statement(s)
			Object result = target.onFailure(configurationPropertyNameMock, targetMock, contextMock, exception);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(targetMock).getValue();
				verify(targetMock).getBoxedType();
				verify(resolvableTypeMock).resolve();
				verify(contextMock, times(2)).getDepth();
				_assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
				verify(parentMock).onFailure(configurationPropertyNameMock, targetMock, contextMock, exception);
			});
		}
	}

	//Sapient generated method id: ${04cd3024-f666-358f-a833-cb070f35979b}, hash: 959FBCD6FD759011BB82EB5755D42190
	@Test()
	void onFailureWhenThisExceptionIsNull() throws Exception {
		/* Branches:
		 * (result != null) : false
		 * (this.exception == null) : true  #  inside validate method
		 * (result != null) : false  #  inside getValidationTarget method
		 * (context.getDepth() == 0) : true  #  inside getValidationTarget method
		 * (target.getValue() != null) : true  #  inside getValidationTarget method
		 * (validationTarget != null) : true  #  inside validate method
		 * (for-each(this.validators)) : false  #  inside validateAndPush method
		 * (result != null) : false  #  inside validateAndPush method
		 * (context.getDepth() == 0) : true  #  inside validate method
		 * (this.exception != null) : false  #  inside validate method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(supplierMock).when(targetMock).getValue();
			doReturn(resolvableTypeMock).when(targetMock).getBoxedType();
			doReturn(Object.class).when(resolvableTypeMock).resolve();
			doReturn(0).when(contextMock).getDepth();
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Validator[] validatorArray = new Validator[] {};
			ValidationBindHandler target = new ValidationBindHandler(parentMock, validatorArray);
			Exception exception = new Exception();
			doReturn(null).when(parentMock).onFailure(configurationPropertyNameMock, targetMock, contextMock, exception);
			//Act Statement(s)
			Object result = target.onFailure(configurationPropertyNameMock, targetMock, contextMock, exception);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(targetMock, times(2)).getValue();
				verify(targetMock).getBoxedType();
				verify(resolvableTypeMock).resolve();
				verify(contextMock, times(2)).getDepth();
				_assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
				verify(parentMock).onFailure(configurationPropertyNameMock, targetMock, contextMock, exception);
			});
		}
	}

	//Sapient generated method id: ${62ceecb0-fc2c-3387-939d-6b72dca12619}, hash: CC85A1EE877933AC6D5C2125C79E2CCF
	@Test()
	void onFailureWhenThisExceptionIsNotNullThrowsBindValidationException() throws Exception {
		//TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
		//Act Statement(s)
		//Assert statement(s)
		//doReturn(resolvableTypeMock).when(targetMock).getBoxedType();
		//doReturn(Object.class).when(resolvableTypeMock).resolve();
		//doReturn(0).when(contextMock).getDepth();
		//doReturn(true).when(validatorMock).supports(Object.class);
		//Object object = new Object();
		//doNothing().when(validatorMock).validate(eq(object), (Errors) any());
		//_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
		//Validator[] validatorArray = new Validator[] { validatorMock };
		//ValidationBindHandler target = new ValidationBindHandler(parentMock, validatorArray);
		//Exception exception = new Exception();
		//doReturn(object).when(parentMock).onFailure(configurationPropertyNameMock, targetMock, contextMock, exception);
		//final BindValidationException result = assertThrows(BindValidationException.class, () -> {    target.onFailure(configurationPropertyNameMock, targetMock, contextMock, exception);});
		//assertAll("result", () -> {    assertThat(result, is(notNullValue()));    verify(targetMock).getBoxedType();    verify(resolvableTypeMock).resolve();    verify(contextMock).getDepth();    verify(validatorMock).supports(Object.class);    verify(validatorMock).validate(eq(object), (Errors) any());    _assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));    verify(parentMock).onFailure(configurationPropertyNameMock, targetMock, contextMock, exception);});
	}

	//Sapient generated method id: ${b670b6ae-bd0b-3a1e-88a3-185e0745b766}, hash: 971CA2CE691468BF871BFF4AE548B999
	@Test()
	void onFinishWhenTargetGetValueIsNullAndValidationTargetIsNullAndContextGetDepthNotEquals0() throws Exception {
		/* Branches:
		 * (this.exception == null) : true  #  inside validate method
		 * (result != null) : false  #  inside getValidationTarget method
		 * (context.getDepth() == 0) : true  #  inside getValidationTarget method
		 * (target.getValue() != null) : false  #  inside getValidationTarget method
		 * (validationTarget != null) : false  #  inside validate method
		 * (context.getDepth() == 0) : false  #  inside validate method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(null).when(targetMock).getValue();
			doReturn(resolvableTypeMock).when(targetMock).getBoxedType();
			doReturn(Object.class).when(resolvableTypeMock).resolve();
			doReturn(0, -1).when(contextMock).getDepth();
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Validator[] validatorArray = new Validator[] {};
			ValidationBindHandler target = new ValidationBindHandler(parentMock, validatorArray);
			doNothing().when(parentMock).onFinish(configurationPropertyNameMock, targetMock, contextMock, (Object) null);
			Object object = null;
			//Act Statement(s)
			target.onFinish(configurationPropertyNameMock, targetMock, contextMock, object);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(targetMock).getValue();
				verify(targetMock).getBoxedType();
				verify(resolvableTypeMock).resolve();
				verify(contextMock, times(2)).getDepth();
				_assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
				verify(parentMock).onFinish(configurationPropertyNameMock, targetMock, contextMock, (Object) null);
			});
		}
	}

	//Sapient generated method id: ${b1a4b903-0cca-321f-967c-11bcceda7239}, hash: 39594364BF591084DC0FBD50B45297AC
	@Test()
	void onFinishWhenThisExceptionIsNull() throws Exception {
		/* Branches:
		 * (this.exception == null) : true  #  inside validate method
		 * (result != null) : false  #  inside getValidationTarget method
		 * (context.getDepth() == 0) : true  #  inside getValidationTarget method
		 * (target.getValue() != null) : true  #  inside getValidationTarget method
		 * (validationTarget != null) : true  #  inside validate method
		 * (for-each(this.validators)) : false  #  inside validateAndPush method
		 * (result != null) : false  #  inside validateAndPush method
		 * (context.getDepth() == 0) : true  #  inside validate method
		 * (this.exception != null) : false  #  inside validate method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(supplierMock).when(targetMock).getValue();
			doReturn(resolvableTypeMock).when(targetMock).getBoxedType();
			doReturn(Object.class).when(resolvableTypeMock).resolve();
			doReturn(0).when(contextMock).getDepth();
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Validator[] validatorArray = new Validator[] {};
			ValidationBindHandler target = new ValidationBindHandler(parentMock, validatorArray);
			doNothing().when(parentMock).onFinish(configurationPropertyNameMock, targetMock, contextMock, (Object) null);
			Object object = null;
			//Act Statement(s)
			target.onFinish(configurationPropertyNameMock, targetMock, contextMock, object);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(targetMock, times(2)).getValue();
				verify(targetMock).getBoxedType();
				verify(resolvableTypeMock).resolve();
				verify(contextMock, times(2)).getDepth();
				_assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
				verify(parentMock).onFinish(configurationPropertyNameMock, targetMock, contextMock, (Object) null);
			});
		}
	}

	//Sapient generated method id: ${ea952770-a9fd-328f-9898-aadf4a5cb5cf}, hash: 7BCE0F887BF737E9BA0CB772AEB8A4D4
	@Test()
	void onFinishWhenThisExceptionIsNotNullThrowsBindValidationException() throws Exception {
		//TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
		//Act Statement(s)
		//Assert statement(s)
		//doReturn(resolvableTypeMock).when(targetMock).getBoxedType();
		//doReturn(Object.class).when(resolvableTypeMock).resolve();
		//doReturn(0).when(contextMock).getDepth();
		//doReturn(true).when(validatorMock).supports(Object.class);
		//Object object = new Object();
		//doNothing().when(validatorMock).validate(eq(object), (Errors) any());
		//_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
		//Validator[] validatorArray = new Validator[] { validatorMock };
		//ValidationBindHandler target = new ValidationBindHandler(parentMock, validatorArray);
		//final BindValidationException result = assertThrows(BindValidationException.class, () -> {    target.onFinish(configurationPropertyNameMock, targetMock, contextMock, object);});
		//assertAll("result", () -> {    assertThat(result, is(notNullValue()));    verify(targetMock).getBoxedType();    verify(resolvableTypeMock).resolve();    verify(contextMock).getDepth();    verify(validatorMock).supports(Object.class);    verify(validatorMock).validate(eq(object), (Errors) any());    _assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));});
	}

	//Sapient generated method id: ${30bfa1ff-53a1-3693-ac79-5a311bc116f3}, hash: A4C9F00AC2CF022DDB9C60D031D3B717
	@Test()
	void onFinishWhenContextGetDepthEquals0AndThisExceptionIsNull() throws Exception {
		//TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
		//Act Statement(s)
		//Assert statement(s)
		//doReturn(resolvableTypeMock).when(targetMock).getBoxedType();
		//doReturn(Object.class).when(resolvableTypeMock).resolve();
		//doReturn(0).when(contextMock).getDepth();
		//doReturn(true).when(validatorMock).supports(Object.class);
		//Object object = new Object();
		//doNothing().when(validatorMock).validate(eq(object), (Errors) any());
		//_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
		//Validator[] validatorArray = new Validator[] { validatorMock };
		//ValidationBindHandler target = new ValidationBindHandler(parentMock, validatorArray);
		//doNothing().when(parentMock).onFinish(configurationPropertyNameMock, targetMock, contextMock, object);
		//target.onFinish(configurationPropertyNameMock, targetMock, contextMock, object);
		//assertAll("result", () -> {    verify(targetMock).getBoxedType();    verify(resolvableTypeMock).resolve();    verify(contextMock).getDepth();    verify(validatorMock).supports(Object.class);    verify(validatorMock).validate(eq(object), (Errors) any());    _assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));    verify(parentMock).onFinish(configurationPropertyNameMock, targetMock, contextMock, object);});
	}
}
