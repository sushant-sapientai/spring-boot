package org.springframework.boot.context.properties.bind;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import org.springframework.core.ResolvableType;

import java.lang.reflect.Constructor;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
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
class DefaultBindConstructorProviderSapientGeneratedTest {

	private final Bindable bindableMock = mock(Bindable.class);

	private final Constructor constructorMock = mock(Constructor.class);

	private final DefaultBindConstructorProvider.Constructors defaultBindConstructorProviderConstructorsMock = mock(DefaultBindConstructorProvider.Constructors.class);

	private final ResolvableType resolvableTypeMock = mock(ResolvableType.class);

	private final Supplier supplierMock = mock(Supplier.class);

	//Sapient generated method id: ${e8d915a5-39dc-32d4-ac18-b76d08af025d}, hash: FA9A7B9A09335C83ED6E8303B29B8AF0
	@Disabled()
	@Test()
	void getBindConstructorWhenBindableGetValueGetIsNotNull() {
		/* Branches:
		 * (constructors.getBind() != null) : true
		 * (constructors.isDeducedBindConstructor()) : true
		 * (!constructors.isImmutableType()) : true
		 * (bindable.getValue() != null) : true
		 * (bindable.getValue().get() != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<DefaultBindConstructorProvider.Constructors> defaultBindConstructorProviderConstructors = mockStatic(DefaultBindConstructorProvider.Constructors.class)) {
			doReturn(resolvableTypeMock).when(bindableMock).getType();
			doReturn(Object.class).when(resolvableTypeMock).resolve();
			doReturn(supplierMock).when(bindableMock).getValue();
			defaultBindConstructorProviderConstructors.when(() -> DefaultBindConstructorProvider.Constructors.getConstructors(Object.class, false)).thenReturn(defaultBindConstructorProviderConstructorsMock);
			doReturn(constructorMock).when(defaultBindConstructorProviderConstructorsMock).getBind();
			doReturn(true).when(defaultBindConstructorProviderConstructorsMock).isDeducedBindConstructor();
			doReturn(false).when(defaultBindConstructorProviderConstructorsMock).isImmutableType();
			DefaultBindConstructorProvider target = new DefaultBindConstructorProvider();
			//Act Statement(s)
			Constructor<?> result = target.getBindConstructor(bindableMock, false);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(bindableMock).getType();
				verify(resolvableTypeMock).resolve();
				verify(bindableMock, times(2)).getValue();
				defaultBindConstructorProviderConstructors.verify(() -> DefaultBindConstructorProvider.Constructors.getConstructors(Object.class, false), atLeast(1));
				verify(defaultBindConstructorProviderConstructorsMock).getBind();
				verify(defaultBindConstructorProviderConstructorsMock).isDeducedBindConstructor();
				verify(defaultBindConstructorProviderConstructorsMock).isImmutableType();
			});
		}
	}

	//Sapient generated method id: ${48284b12-4c06-33f5-a80d-006947556451}, hash: 1751AF1848277B1781540BFAF0DE77C6
	@Test()
	void getBindConstructorWhenBindableGetValueGetIsNull() {
		/* Branches:
		 * (constructors.getBind() != null) : true
		 * (constructors.isDeducedBindConstructor()) : true
		 * (!constructors.isImmutableType()) : true
		 * (bindable.getValue() != null) : true
		 * (bindable.getValue().get() != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Constructor constructorMock2 = mock(Constructor.class);
		try (MockedStatic<DefaultBindConstructorProvider.Constructors> defaultBindConstructorProviderConstructors = mockStatic(DefaultBindConstructorProvider.Constructors.class)) {
			doReturn(resolvableTypeMock).when(bindableMock).getType();
			doReturn(Object.class).when(resolvableTypeMock).resolve();
			doReturn(supplierMock).when(bindableMock).getValue();
			defaultBindConstructorProviderConstructors.when(() -> DefaultBindConstructorProvider.Constructors.getConstructors(Object.class, false)).thenReturn(defaultBindConstructorProviderConstructorsMock);
			doReturn(true).when(defaultBindConstructorProviderConstructorsMock).isDeducedBindConstructor();
			doReturn(false).when(defaultBindConstructorProviderConstructorsMock).isImmutableType();
			doReturn(constructorMock, constructorMock2).when(defaultBindConstructorProviderConstructorsMock).getBind();
			DefaultBindConstructorProvider target = new DefaultBindConstructorProvider();
			//Act Statement(s)
			Constructor<?> result = target.getBindConstructor(bindableMock, false);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(constructorMock2));
				verify(bindableMock).getType();
				verify(resolvableTypeMock).resolve();
				verify(bindableMock, times(2)).getValue();
				defaultBindConstructorProviderConstructors.verify(() -> DefaultBindConstructorProvider.Constructors.getConstructors(Object.class, false), atLeast(1));
				verify(defaultBindConstructorProviderConstructorsMock, times(2)).getBind();
				verify(defaultBindConstructorProviderConstructorsMock).isDeducedBindConstructor();
				verify(defaultBindConstructorProviderConstructorsMock).isImmutableType();
			});
		}
	}

	//Sapient generated method id: ${88d6a42d-24de-31df-bea3-67e1e253d8da}, hash: B8FC6D024198EC9D2A665019E66AE443
	@Test()
	void getBindConstructor1Test() {
		//Arrange Statement(s)
		try (MockedStatic<DefaultBindConstructorProvider.Constructors> defaultBindConstructorProviderConstructors = mockStatic(DefaultBindConstructorProvider.Constructors.class)) {
			defaultBindConstructorProviderConstructors.when(() -> DefaultBindConstructorProvider.Constructors.getConstructors(Object.class, false)).thenReturn(defaultBindConstructorProviderConstructorsMock);
			doReturn(constructorMock).when(defaultBindConstructorProviderConstructorsMock).getBind();
			DefaultBindConstructorProvider target = new DefaultBindConstructorProvider();
			//Act Statement(s)
			Constructor<?> result = target.getBindConstructor(Object.class, false);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(constructorMock));
				defaultBindConstructorProviderConstructors.verify(() -> DefaultBindConstructorProvider.Constructors.getConstructors(Object.class, false), atLeast(1));
				verify(defaultBindConstructorProviderConstructorsMock).getBind();
			});
		}
	}
}
