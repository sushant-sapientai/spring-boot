package org.springframework.boot.context.properties.bind;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.core.ResolvableType;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ArrayBinderSapientGeneratedTest {

	private final AggregateElementBinder aggregateElementBinderMock = mock(AggregateElementBinder.class);

	private final Binder.Context binderContextMock = mock(Binder.Context.class);

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final ResolvableType resolvableTypeMock = mock(ResolvableType.class);

	private final ResolvableType resolvableTypeMock2 = mock(ResolvableType.class);

	//Sapient generated method id: ${b803041a-05e6-3623-8060-a875ca1f5a9e}, hash: A1454CF49327BE55D7BCFFB57C93EBBA
	@Test()
	void bindAggregateWhenResultNotWasSupplied() {
		/* Branches:
		 * (result.wasSupplied()) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: result
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(resolvableTypeMock2).when(resolvableTypeMock).getComponentType();
		ArrayBinder target = spy(new ArrayBinder(binderContextMock));
		doNothing().when(target).bindIndexed(eq(configurationPropertyNameMock), (Bindable) any(), eq(aggregateElementBinderMock), eq(resolvableTypeMock), eq(resolvableTypeMock2), (IndexedElementsBinder.IndexedCollectionSupplier) any());
		Bindable bindable = Bindable.of(resolvableTypeMock);
		//Act Statement(s)
		Object result = target.bindAggregate(configurationPropertyNameMock, bindable, aggregateElementBinderMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(nullValue()));
			verify(resolvableTypeMock).getComponentType();
			verify(target).bindIndexed(eq(configurationPropertyNameMock), (Bindable) any(), eq(aggregateElementBinderMock), eq(resolvableTypeMock), eq(resolvableTypeMock2), (IndexedElementsBinder.IndexedCollectionSupplier) any());
		});
	}

	//Sapient generated method id: ${72274d74-1f0b-3808-9f6e-51f3a942e2d8}, hash: 55F50D5B97EAE9E27690BAEAEBE0A28B
	@Disabled()
	@Test()
	void bindAggregateWhenILessThanListSize() {
		/* Branches:
		 * (result.wasSupplied()) : true
		 * (i < list.size()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: result
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(resolvableTypeMock2).when(resolvableTypeMock).getComponentType();
		doReturn(Object.class).when(resolvableTypeMock2).resolve();
		ArrayBinder target = spy(new ArrayBinder(binderContextMock));
		doNothing().when(target).bindIndexed(eq(configurationPropertyNameMock), (Bindable) any(), eq(aggregateElementBinderMock), eq(resolvableTypeMock), eq(resolvableTypeMock2), (IndexedElementsBinder.IndexedCollectionSupplier) any());
		Bindable bindable = Bindable.of(resolvableTypeMock);
		//Act Statement(s)
		Object result = target.bindAggregate(configurationPropertyNameMock, bindable, aggregateElementBinderMock);
		//Assert statement(s)
		//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(resolvableTypeMock).getComponentType();
			verify(resolvableTypeMock2).resolve();
			verify(target).bindIndexed(eq(configurationPropertyNameMock), (Bindable) any(), eq(aggregateElementBinderMock), eq(resolvableTypeMock), eq(resolvableTypeMock2), (IndexedElementsBinder.IndexedCollectionSupplier) any());
		});
	}

	//Sapient generated method id: ${d7d042c3-124b-3792-8757-207cd3cb67b4}, hash: 95EA962C4642C55910728E2258C43543
	@Test()
	void mergeTest() {
		//Arrange Statement(s)
		ArrayBinder target = new ArrayBinder(binderContextMock);
		Supplier supplierMock = mock(Supplier.class);
		Object object = new Object();
		//Act Statement(s)
		Object result = target.merge(supplierMock, object);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(object)));
	}
}
