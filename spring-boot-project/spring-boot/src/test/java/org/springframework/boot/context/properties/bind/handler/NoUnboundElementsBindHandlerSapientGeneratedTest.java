package org.springframework.boot.context.properties.bind.handler;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.context.properties.bind.BindContext;

import org.mockito.stubbing.Answer;

import org.springframework.util.Assert;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import java.util.function.Function;

import org.springframework.boot.context.properties.bind.Bindable;

import org.mockito.MockedStatic;

import org.springframework.boot.context.properties.bind.BindHandler;
import org.springframework.boot.context.properties.bind.UnboundConfigurationPropertiesException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class NoUnboundElementsBindHandlerSapientGeneratedTest {

	private final BindHandler parentMock = mock(BindHandler.class, "parent");

	private final BindContext bindContextMock = mock(BindContext.class);

	private final Bindable<?> bindableMock = mock(Bindable.class);

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final ConfigurationPropertyName configurationPropertyNameMock2 = mock(ConfigurationPropertyName.class);

	private final ConfigurationPropertyName configurationPropertyNameMock3 = mock(ConfigurationPropertyName.class);

	private final BindContext contextMock = mock(BindContext.class);

	private final Function functionMock = mock(Function.class);

	private final Iterable iterableMock = mock(Iterable.class);

	private final ConfigurationPropertyName nameMock = mock(ConfigurationPropertyName.class);

	//Sapient generated method id: ${1b031792-a2be-3eb2-9c2b-1c39b062abb7}, hash: 1AB22CAB2D75834F4DF66284A3B0FDF4
	@Test()
	void onStartTest() {
		//Arrange Statement(s)
		Bindable bindableMock = mock(Bindable.class);
		Bindable<Object> bindableMock2 = mock(Bindable.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, functionMock);
			doReturn(bindableMock).when(parentMock).onStart(configurationPropertyNameMock, bindableMock2, bindContextMock);
			//Act Statement(s)
			Bindable result = target.onStart(configurationPropertyNameMock, bindableMock2, bindContextMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindableMock));
				_assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
				verify(parentMock).onStart(configurationPropertyNameMock, bindableMock2, bindContextMock);
			});
		}
	}

	//Sapient generated method id: ${d0bdf940-b807-32a4-8689-ec11cffdd36c}, hash: B120595FE93357B6C121835B7748AC98
	@Test()
	void onSuccessTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, functionMock);
			Object object = new Object();
			Object object2 = new Object();
			doReturn(object).when(parentMock).onSuccess(configurationPropertyNameMock, bindableMock, bindContextMock, object2);
			//Act Statement(s)
			Object result = target.onSuccess(configurationPropertyNameMock, bindableMock, bindContextMock, object2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(object));
				_assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
				verify(parentMock).onSuccess(configurationPropertyNameMock, bindableMock, bindContextMock, object2);
			});
		}
	}

	//Sapient generated method id: ${fe3c2724-cc5c-3473-a788-9673b9ae408a}, hash: B4FF0037AC478020987B4A6802C5DC3E
	@Test()
	void onFailureWhenErrorInstanceOfUnboundConfigurationPropertiesExceptionThrowsUnboundConfigurationPropertiesException() throws Exception {
		/* Branches:
		 * (error instanceof UnboundConfigurationPropertiesException) : true
		 */
		//Arrange Statement(s)
		UnboundConfigurationPropertiesException unboundConfigurationPropertiesExceptionMock = mock(UnboundConfigurationPropertiesException.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, functionMock);
			//Act Statement(s)
			final UnboundConfigurationPropertiesException result = assertThrows(UnboundConfigurationPropertiesException.class, () -> {
				target.onFailure(configurationPropertyNameMock, bindableMock, bindContextMock, unboundConfigurationPropertiesExceptionMock);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(unboundConfigurationPropertiesExceptionMock));
				_assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3eebbb18-610a-3abf-9354-c3ff07431bf5}, hash: B637F1349A2C54FA8BAC118328F49231
	@Test()
	void onFailureWhenErrorNotInstanceOfUnboundConfigurationPropertiesException() throws Exception {
		/* Branches:
		 * (error instanceof UnboundConfigurationPropertiesException) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, functionMock);
			Object object = new Object();
			Exception exception = new Exception();
			doReturn(object).when(parentMock).onFailure(configurationPropertyNameMock, bindableMock, bindContextMock, exception);
			//Act Statement(s)
			Object result = target.onFailure(configurationPropertyNameMock, bindableMock, bindContextMock, exception);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(object));
				_assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
				verify(parentMock).onFailure(configurationPropertyNameMock, bindableMock, bindContextMock, exception);
			});
		}
	}

	//Sapient generated method id: ${2dceed88-84e4-300e-baab-f0be556459d4}, hash: 25F77F78E93E6367FC0C1A3D8819C930
	@Disabled()
	@Test()
	void onFinishWhenFilteredIsEmptyAndUnboundIsEmpty() throws Exception {
		/* Branches:
		 * (context.getDepth() == 0) : true
		 * (for-each(context.getSources())) : true  #  inside checkNoUnboundElements method
		 * (source instanceof IterableConfigurationPropertySource) : true  #  inside checkNoUnboundElements method
		 * (this.filter.apply(source)) : true  #  inside checkNoUnboundElements method
		 * (name.isAncestorOf(candidate)) : false  #  inside isUnbound method
		 * (for-each(filtered)) : false  #  inside collectUnbound method
		 * (!unbound.isEmpty()) : false  #  inside checkNoUnboundElements method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(false).when(nameMock).isAncestorOf(configurationPropertyNameMock);
			doReturn(0).when(contextMock).getDepth();
			doReturn(iterableMock).when(contextMock).getSources();
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, functionMock);
			Object object = new Object();
			//Act Statement(s)
			target.onFinish(nameMock, bindableMock, contextMock, object);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(nameMock).isAncestorOf(configurationPropertyNameMock);
				verify(contextMock).getDepth();
				verify(contextMock).getSources();
				_assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${698714d5-5d6b-3dde-9e92-fc4f0adb5cb3}, hash: 6CC2EC7056FD52F53C6D005C4B21216F
	@Disabled()
	@Test()
	void onFinishWhenUnboundNotIsEmptyThrowsUnboundConfigurationPropertiesException() throws Exception {
		/* Branches:
		 * (context.getDepth() == 0) : true
		 * (for-each(context.getSources())) : true  #  inside checkNoUnboundElements method
		 * (source instanceof IterableConfigurationPropertySource) : true  #  inside checkNoUnboundElements method
		 * (this.filter.apply(source)) : true  #  inside checkNoUnboundElements method
		 * (name.isAncestorOf(candidate)) : false  #  inside isUnbound method
		 * (for-each(filtered)) : true  #  inside collectUnbound method
		 * (catch-exception (Exception)) : true  #  inside collectUnbound method
		 * (!unbound.isEmpty()) : true  #  inside checkNoUnboundElements method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(false).when(nameMock).isAncestorOf(configurationPropertyNameMock);
			doReturn(0).when(contextMock).getDepth();
			doReturn(iterableMock).when(contextMock).getSources();
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, functionMock);
			Object object = new Object();
			//Act Statement(s)
			final UnboundConfigurationPropertiesException result = assertThrows(UnboundConfigurationPropertiesException.class, () -> {
				target.onFinish(nameMock, bindableMock, contextMock, object);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(nameMock, times(2)).isAncestorOf(configurationPropertyNameMock);
				verify(contextMock).getDepth();
				verify(contextMock).getSources();
				_assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${038aa6b3-25c1-383d-816c-b7d5cea3a188}, hash: 50D7B4263E08722B09FF55BF2DF6877F
	@Disabled()
	@Test()
	void onFinishWhenFilteredIsNotEmptyAndUnboundNotIsEmptyThrowsUnboundConfigurationPropertiesException() throws Exception {
		/* Branches:
		 * (context.getDepth() == 0) : true
		 * (for-each(context.getSources())) : true  #  inside checkNoUnboundElements method
		 * (source instanceof IterableConfigurationPropertySource) : true  #  inside checkNoUnboundElements method
		 * (this.filter.apply(source)) : true  #  inside checkNoUnboundElements method
		 * (name.isAncestorOf(candidate)) : true  #  inside isUnbound method
		 * (!this.boundNames.contains(candidate)) : true  #  inside isUnbound method
		 * (candidate.isLastElementIndexed()) : true  #  inside isOverriddenCollectionElement method
		 * (!isOverriddenCollectionElement(candidate)) : true  #  inside isUnbound method
		 * (for-each(filtered)) : true  #  inside collectUnbound method
		 * (!unbound.isEmpty()) : true  #  inside checkNoUnboundElements method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(true).when(nameMock).isAncestorOf(configurationPropertyNameMock);
			doReturn(0).when(configurationPropertyNameMock).getNumberOfElements();
			doReturn(true).when(configurationPropertyNameMock).isLastElementIndexed();
			doReturn(configurationPropertyNameMock2).when(configurationPropertyNameMock).chop(-1);
			doReturn(0).when(contextMock).getDepth();
			doReturn(iterableMock).when(contextMock).getSources();
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, functionMock);
			Object object = new Object();
			//Act Statement(s)
			final UnboundConfigurationPropertiesException result = assertThrows(UnboundConfigurationPropertiesException.class, () -> {
				target.onFinish(nameMock, bindableMock, contextMock, object);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(nameMock, times(2)).isAncestorOf(configurationPropertyNameMock);
				verify(configurationPropertyNameMock, times(2)).getNumberOfElements();
				verify(configurationPropertyNameMock, times(2)).isLastElementIndexed();
				verify(configurationPropertyNameMock, times(2)).chop(-1);
				verify(contextMock).getDepth();
				verify(contextMock).getSources();
				_assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a1f701ab-7041-32d7-84ba-317a9511a810}, hash: 85C29C23C232F9186F461904639A5D91
	@Disabled()
	@Test()
	void onFinishWhenIsOverriddenCollectionElementNotCandidateAndFilteredIsNotEmptyThrowsUnboundConfigurationPropertiesException() throws Exception {
		/* Branches:
		 * (context.getDepth() == 0) : true
		 * (for-each(context.getSources())) : true  #  inside checkNoUnboundElements method
		 * (source instanceof IterableConfigurationPropertySource) : true  #  inside checkNoUnboundElements method
		 * (this.filter.apply(source)) : true  #  inside checkNoUnboundElements method
		 * (name.isAncestorOf(candidate)) : true  #  inside isUnbound method
		 * (!this.boundNames.contains(candidate)) : true  #  inside isUnbound method
		 * (candidate.isLastElementIndexed()) : true  #  inside isOverriddenCollectionElement method
		 * (!isOverriddenCollectionElement(candidate)) : true  #  inside isUnbound method
		 * (for-each(filtered)) : true  #  inside collectUnbound method
		 * (!unbound.isEmpty()) : true  #  inside checkNoUnboundElements method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(true).when(nameMock).isAncestorOf(configurationPropertyNameMock);
			doReturn(0).when(configurationPropertyNameMock).getNumberOfElements();
			doReturn(true).when(configurationPropertyNameMock).isLastElementIndexed();
			doReturn(configurationPropertyNameMock2).when(configurationPropertyNameMock).chop(-1);
			doReturn(false).when(nameMock).isAncestorOf(configurationPropertyNameMock3);
			doReturn(0).when(contextMock).getDepth();
			doReturn(iterableMock).when(contextMock).getSources();
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, functionMock);
			Object object = new Object();
			//Act Statement(s)
			final UnboundConfigurationPropertiesException result = assertThrows(UnboundConfigurationPropertiesException.class, () -> {
				target.onFinish(nameMock, bindableMock, contextMock, object);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(nameMock).isAncestorOf(configurationPropertyNameMock);
				verify(configurationPropertyNameMock).getNumberOfElements();
				verify(configurationPropertyNameMock).isLastElementIndexed();
				verify(configurationPropertyNameMock).chop(-1);
				verify(nameMock).isAncestorOf(configurationPropertyNameMock3);
				verify(contextMock).getDepth();
				verify(contextMock).getSources();
				_assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${aa226bc7-1dc5-3393-806a-53064e2ce99d}, hash: 961AD6DB3902EA53CD8723CA763C942B
	@Disabled()
	@Test()
	void onFinishWhenIndexedIsNullAndUnboundNotIsEmpty2ThrowsUnboundConfigurationPropertiesException() throws Exception {
		/* Branches:
		 * (context.getDepth() == 0) : true
		 * (for-each(context.getSources())) : true  #  inside checkNoUnboundElements method
		 * (source instanceof IterableConfigurationPropertySource) : true  #  inside checkNoUnboundElements method
		 * (this.filter.apply(source)) : true  #  inside checkNoUnboundElements method
		 * (name.isAncestorOf(candidate)) : true  #  inside isUnbound method
		 * (!this.boundNames.contains(candidate)) : true  #  inside isUnbound method
		 * (candidate.isLastElementIndexed()) : true  #  inside isOverriddenCollectionElement method
		 * (!isOverriddenCollectionElement(candidate)) : true  #  inside isUnbound method
		 * (for-each(filtered)) : true  #  inside collectUnbound method
		 * (i < candidate.getNumberOfElements()) : true  #  inside getIndexed method
		 * (candidate.isNumericIndex(i)) : false  #  inside getIndexed method
		 * (indexed != null) : false  #  inside isOverriddenCollectionElement method
		 * (!unbound.isEmpty()) : true  #  inside checkNoUnboundElements method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(true).when(nameMock).isAncestorOf(configurationPropertyNameMock);
			doReturn(false).when(configurationPropertyNameMock).isLastElementIndexed();
			doReturn(0, 1, 0).when(configurationPropertyNameMock).getNumberOfElements();
			doReturn(false).when(configurationPropertyNameMock).isNumericIndex(0);
			doReturn(0).when(contextMock).getDepth();
			doReturn(iterableMock).when(contextMock).getSources();
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, functionMock);
			Object object = new Object();
			//Act Statement(s)
			final UnboundConfigurationPropertiesException result = assertThrows(UnboundConfigurationPropertiesException.class, () -> {
				target.onFinish(nameMock, bindableMock, contextMock, object);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(nameMock, times(2)).isAncestorOf(configurationPropertyNameMock);
				verify(configurationPropertyNameMock, times(4)).getNumberOfElements();
				verify(configurationPropertyNameMock).isLastElementIndexed();
				verify(configurationPropertyNameMock).isNumericIndex(0);
				verify(contextMock).getDepth();
				verify(contextMock).getSources();
				_assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${62176b12-0f52-30d7-90ab-1ee4d6d175a8}, hash: D6E97C93ED7C4F3E25D3C89FF4611ED2
	@Disabled()
	@Test()
	void onFinishWhenCandidateNotIsNumericIndexIAndIndexedIsNullAndIsOverriddenCollectionElementNotCandidateAndFilteredIsEmptyAn() throws Exception {
		/* Branches:
		 * (context.getDepth() == 0) : true
		 * (for-each(context.getSources())) : true  #  inside checkNoUnboundElements method
		 * (source instanceof IterableConfigurationPropertySource) : true  #  inside checkNoUnboundElements method
		 * (this.filter.apply(source)) : true  #  inside checkNoUnboundElements method
		 * (name.isAncestorOf(candidate)) : true  #  inside isUnbound method
		 * (!this.boundNames.contains(candidate)) : true  #  inside isUnbound method
		 * (candidate.isLastElementIndexed()) : false  #  inside isOverriddenCollectionElement method
		 * (i < candidate.getNumberOfElements()) : true  #  inside getIndexed method
		 * (candidate.isNumericIndex(i)) : false  #  inside getIndexed method
		 * (indexed != null) : false  #  inside isOverriddenCollectionElement method
		 * (!isOverriddenCollectionElement(candidate)) : true  #  inside isUnbound method
		 * (for-each(filtered)) : false  #  inside collectUnbound method
		 * (!unbound.isEmpty()) : false  #  inside checkNoUnboundElements method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(true).when(nameMock).isAncestorOf(configurationPropertyNameMock);
			doReturn(false).when(configurationPropertyNameMock).isLastElementIndexed();
			doReturn(0, 1, 0).when(configurationPropertyNameMock).getNumberOfElements();
			doReturn(false).when(configurationPropertyNameMock).isNumericIndex(0);
			doReturn(0).when(contextMock).getDepth();
			doReturn(iterableMock).when(contextMock).getSources();
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, functionMock);
			Object object = new Object();
			//Act Statement(s)
			target.onFinish(nameMock, bindableMock, contextMock, object);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(nameMock).isAncestorOf(configurationPropertyNameMock);
				verify(configurationPropertyNameMock, times(3)).getNumberOfElements();
				verify(configurationPropertyNameMock).isLastElementIndexed();
				verify(configurationPropertyNameMock).isNumericIndex(0);
				verify(contextMock).getDepth();
				verify(contextMock).getSources();
				_assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${1191da43-293e-3c12-bc85-962bb9330879}, hash: CDB11214D164004F60AE5E75462E99CB
	@Disabled()
	@Test()
	void onFinishWhenThisBoundNamesNotContainsConfigurationPropertyNameOfZeroethProThrowsUnboundConfigurationPropertiesException() throws Exception {
		/* Branches:
		 * (context.getDepth() == 0) : true
		 * (for-each(context.getSources())) : true  #  inside checkNoUnboundElements method
		 * (source instanceof IterableConfigurationPropertySource) : true  #  inside checkNoUnboundElements method
		 * (this.filter.apply(source)) : true  #  inside checkNoUnboundElements method
		 * (name.isAncestorOf(candidate)) : true  #  inside isUnbound method
		 * (!this.boundNames.contains(candidate)) : true  #  inside isUnbound method
		 * (candidate.isLastElementIndexed()) : true  #  inside isOverriddenCollectionElement method
		 * (!isOverriddenCollectionElement(candidate)) : true  #  inside isUnbound method
		 * (for-each(filtered)) : true  #  inside collectUnbound method
		 * (i < candidate.getNumberOfElements()) : true  #  inside getIndexed method
		 * (candidate.isNumericIndex(i)) : true  #  inside getIndexed method
		 * (indexed != null) : true  #  inside isOverriddenCollectionElement method
		 * (this.boundNames.contains(ConfigurationPropertyName.of(zeroethProperty))) : false  #  inside isOverriddenCollectionElement method
		 * (!unbound.isEmpty()) : true  #  inside checkNoUnboundElements method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertyName configurationPropertyNameMock2 = mock(ConfigurationPropertyName.class, "getIndexed_configurationPropertyName1");
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(true).when(nameMock).isAncestorOf(configurationPropertyNameMock);
			doReturn(false).when(configurationPropertyNameMock).isLastElementIndexed();
			doReturn(0, 1).when(configurationPropertyNameMock).getNumberOfElements();
			doReturn(true).when(configurationPropertyNameMock).isNumericIndex(0);
			doReturn(configurationPropertyNameMock2).when(configurationPropertyNameMock).chop(0);
			doReturn("return_of_getElement1").when(configurationPropertyNameMock).getElement(1, ConfigurationPropertyName.Form.UNIFORM);
			doReturn(0).when(contextMock).getDepth();
			doReturn(iterableMock).when(contextMock).getSources();
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("A[0]")).thenReturn(configurationPropertyNameMock3);
			NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, functionMock);
			Object object = new Object();
			//Act Statement(s)
			final UnboundConfigurationPropertiesException result = assertThrows(UnboundConfigurationPropertiesException.class, () -> {
				target.onFinish(nameMock, bindableMock, contextMock, object);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(nameMock, times(2)).isAncestorOf(configurationPropertyNameMock);
				verify(configurationPropertyNameMock, times(3)).getNumberOfElements();
				verify(configurationPropertyNameMock).isLastElementIndexed();
				verify(configurationPropertyNameMock).isNumericIndex(0);
				verify(configurationPropertyNameMock).chop(0);
				verify(configurationPropertyNameMock).getElement(1, ConfigurationPropertyName.Form.UNIFORM);
				verify(contextMock).getDepth();
				verify(contextMock).getSources();
				_assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("A[0]"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${17e6a4a9-b7a6-3e21-a734-76bb0c509b93}, hash: 7E28EFC23C5FAA7680E8ED6C4357758A
	@Disabled()
	@Test()
	void onFinishWhenThisBoundNamesNotContainsConfigurationPropertyNameOfZeroethPropertyAndIsOverriddenCollectionElementNotCandi() throws Exception {
		/* Branches:
		 * (context.getDepth() == 0) : true
		 * (for-each(context.getSources())) : true  #  inside checkNoUnboundElements method
		 * (source instanceof IterableConfigurationPropertySource) : true  #  inside checkNoUnboundElements method
		 * (this.filter.apply(source)) : true  #  inside checkNoUnboundElements method
		 * (name.isAncestorOf(candidate)) : true  #  inside isUnbound method
		 * (!this.boundNames.contains(candidate)) : true  #  inside isUnbound method
		 * (candidate.isLastElementIndexed()) : false  #  inside isOverriddenCollectionElement method
		 * (i < candidate.getNumberOfElements()) : true  #  inside getIndexed method
		 * (candidate.isNumericIndex(i)) : true  #  inside getIndexed method
		 * (indexed != null) : true  #  inside isOverriddenCollectionElement method
		 * (this.boundNames.contains(ConfigurationPropertyName.of(zeroethProperty))) : false  #  inside isOverriddenCollectionElement method
		 * (!isOverriddenCollectionElement(candidate)) : true  #  inside isUnbound method
		 * (for-each(filtered)) : false  #  inside collectUnbound method
		 * (!unbound.isEmpty()) : false  #  inside checkNoUnboundElements method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertyName configurationPropertyNameMock2 = mock(ConfigurationPropertyName.class, "getIndexed_configurationPropertyName1");
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(true).when(nameMock).isAncestorOf(configurationPropertyNameMock);
			doReturn(false).when(configurationPropertyNameMock).isLastElementIndexed();
			doReturn(0, 1).when(configurationPropertyNameMock).getNumberOfElements();
			doReturn(true).when(configurationPropertyNameMock).isNumericIndex(0);
			doReturn(configurationPropertyNameMock2).when(configurationPropertyNameMock).chop(0);
			doReturn("return_of_getElement1").when(configurationPropertyNameMock).getElement(1, ConfigurationPropertyName.Form.UNIFORM);
			doReturn(0).when(contextMock).getDepth();
			doReturn(iterableMock).when(contextMock).getSources();
			_assert.when(() -> Assert.notNull(parentMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("A[0]")).thenReturn(configurationPropertyNameMock3);
			NoUnboundElementsBindHandler target = new NoUnboundElementsBindHandler(parentMock, functionMock);
			Object object = new Object();
			//Act Statement(s)
			target.onFinish(nameMock, bindableMock, contextMock, object);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(nameMock).isAncestorOf(configurationPropertyNameMock);
				verify(configurationPropertyNameMock, times(2)).getNumberOfElements();
				verify(configurationPropertyNameMock).isLastElementIndexed();
				verify(configurationPropertyNameMock).isNumericIndex(0);
				verify(configurationPropertyNameMock).chop(0);
				verify(configurationPropertyNameMock).getElement(1, ConfigurationPropertyName.Form.UNIFORM);
				verify(contextMock).getDepth();
				verify(contextMock).getSources();
				_assert.verify(() -> Assert.notNull(parentMock, "Parent must not be null"), atLeast(1));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("A[0]"), atLeast(1));
			});
		}
	}
}
