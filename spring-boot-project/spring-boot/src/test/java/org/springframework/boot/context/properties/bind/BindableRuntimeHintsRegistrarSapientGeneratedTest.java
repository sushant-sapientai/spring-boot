package org.springframework.boot.context.properties.bind;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import org.springframework.aot.hint.RuntimeHints;
import org.springframework.util.Assert;

import org.mockito.MockedStatic;

import org.springframework.aot.hint.ReflectionHints;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BindableRuntimeHintsRegistrarSapientGeneratedTest {

	private final BindableRuntimeHintsRegistrar bindableRuntimeHintsRegistrarMock = mock(BindableRuntimeHintsRegistrar.class);

	private final Iterable iterableMock = mock(Iterable.class);

	//Sapient generated method id: ${b1fc7be3-9a56-3b28-acf9-0d8d8fa91d7d}, hash: E599107814AC0C1BC1CA38720EA7C8AC
	@Test()
	void registerHintsTest() {
		//Arrange Statement(s)
		Bindable<?>[] bindableArray = new Bindable[] {};
		BindableRuntimeHintsRegistrar target = spy(new BindableRuntimeHintsRegistrar(bindableArray));
		RuntimeHints runtimeHintsMock = mock(RuntimeHints.class);
		doNothing().when(target).registerHints(runtimeHintsMock);
		ClassLoader classLoader = ClassLoader.getPlatformClassLoader();
		//Act Statement(s)
		target.registerHints(runtimeHintsMock, classLoader);
		//Assert statement(s)
		assertAll("result", () -> verify(target).registerHints(runtimeHintsMock));
	}

	//Sapient generated method id: ${94213cdb-311d-376f-81f8-48586bfd4718}, hash: 42A7E3F85C1E6954C28251E7B8F64BC8
	@Disabled()
	@Test()
	void registerHints1WhenCompiledWithoutParametersIsEmpty() {
		/* Branches:
		 * (for-each(this.bindables)) : true
		 * (!compiledWithoutParameters.isEmpty()) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type BindableRuntimeHintsRegistrar.Processor
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		RuntimeHints hintsMock = mock(RuntimeHints.class);
		ReflectionHints reflectionHintsMock = mock(ReflectionHints.class);
		doReturn(reflectionHintsMock).when(hintsMock).reflection();
		Bindable bindableMock = mock(Bindable.class);
		Bindable<?>[] bindableArray = new Bindable[] { bindableMock };
		BindableRuntimeHintsRegistrar target = new BindableRuntimeHintsRegistrar(bindableArray);
		//Act Statement(s)
		target.registerHints(hintsMock);
		//Assert statement(s)
		assertAll("result", () -> verify(hintsMock).reflection());
	}

	//Sapient generated method id: ${bc32b462-c0e2-3b0a-8d60-1ededd13d7e9}, hash: E86DAD08E9B065DCD23D0E6BD0F50077
	@Disabled()
	@Test()
	void forTypesTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BindableRuntimeHintsRegistrar> bindableRuntimeHintsRegistrar = mockStatic(BindableRuntimeHintsRegistrar.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(iterableMock, "Types must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Class[] classArray = new Class[] {};
			bindableRuntimeHintsRegistrar.when(() -> BindableRuntimeHintsRegistrar.forTypes(classArray)).thenReturn(bindableRuntimeHintsRegistrarMock);
			//Act Statement(s)
			BindableRuntimeHintsRegistrar result = BindableRuntimeHintsRegistrar.forTypes(iterableMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindableRuntimeHintsRegistrarMock));
				_assert.verify(() -> Assert.notNull(iterableMock, "Types must not be null"), atLeast(1));
				bindableRuntimeHintsRegistrar.verify(() -> BindableRuntimeHintsRegistrar.forTypes(classArray), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${55cc2ab7-c9de-3c22-a6fe-af0d4c42310b}, hash: FEA8E2E0232CD2C76C16AE6C0A10E894
	@Test()
	void forTypes1Test() {
		//Arrange Statement(s)
		Class<?>[] classArray = new Class[] {};
		//Act Statement(s)
		BindableRuntimeHintsRegistrar result = BindableRuntimeHintsRegistrar.forTypes(classArray);
		//Assert statement(s)
		//TODO: Please implement equals method in BindableRuntimeHintsRegistrar for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${9fbf1158-262c-310f-a0b2-fd9cc0ebcdc6}, hash: 9BA441ED9726BEAA4E9D8187E3B0167D
	@Disabled()
	@Test()
	void forBindablesTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BindableRuntimeHintsRegistrar> bindableRuntimeHintsRegistrar = mockStatic(BindableRuntimeHintsRegistrar.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(iterableMock, "Bindables must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			Bindable[] bindableArray = new Bindable[] {};
			bindableRuntimeHintsRegistrar.when(() -> BindableRuntimeHintsRegistrar.forBindables(bindableArray)).thenReturn(bindableRuntimeHintsRegistrarMock);
			//Act Statement(s)
			BindableRuntimeHintsRegistrar result = BindableRuntimeHintsRegistrar.forBindables(iterableMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindableRuntimeHintsRegistrarMock));
				_assert.verify(() -> Assert.notNull(iterableMock, "Bindables must not be null"), atLeast(1));
				bindableRuntimeHintsRegistrar.verify(() -> BindableRuntimeHintsRegistrar.forBindables(bindableArray), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${81b33437-9e76-3aa7-a922-56dd13cbf50f}, hash: 8C8AC6A13BD81715AA93CB8BF1918443
	@Test()
	void forBindables1Test() {
		//Arrange Statement(s)
		Bindable<?>[] bindableArray = new Bindable[] {};
		//Act Statement(s)
		BindableRuntimeHintsRegistrar result = BindableRuntimeHintsRegistrar.forBindables(bindableArray);
		//Assert statement(s)
		//TODO: Please implement equals method in BindableRuntimeHintsRegistrar for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
