package org.springframework.boot.context.properties;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import java.util.function.Supplier;

import org.mockito.MockedStatic;

import org.springframework.util.function.SingletonSupplier;
import org.springframework.util.Assert;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PropertyMapperSapientGeneratedTest {

	//Sapient generated method id: ${99f617df-0936-3513-991d-3fc77524d0cd}, hash: 5C63E5BC588F7899EE950C17C53F5FE2
	@Test()
	void alwaysApplyingWhenNonNullTest() {
		//Arrange Statement(s)
		PropertyMapper target = spy(PropertyMapper.get());
		PropertyMapper propertyMapperMock = mock(PropertyMapper.class);
		doReturn(propertyMapperMock).when(target).alwaysApplying((PropertyMapper.SourceOperator) any());
		//Act Statement(s)
		PropertyMapper result = target.alwaysApplyingWhenNonNull();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(propertyMapperMock));
			verify(target).alwaysApplying((PropertyMapper.SourceOperator) any());
		});
	}

	//Sapient generated method id: ${2e37e555-8fa5-3902-b7f6-74578dfd46db}, hash: 963B38C2BC61F23102991BB41968DFC6
	@Test()
	void alwaysApplyingTest() {
		//Arrange Statement(s)
		PropertyMapper.SourceOperator propertyMapperSourceOperatorMock = mock(PropertyMapper.SourceOperator.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(propertyMapperSourceOperatorMock, "Operator must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			PropertyMapper target = PropertyMapper.get();
			//Act Statement(s)
			PropertyMapper result = target.alwaysApplying(propertyMapperSourceOperatorMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(propertyMapperSourceOperatorMock, "Operator must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${68f1c17c-5392-37f0-8bed-31fd051e0dde}, hash: 4221BD8B3F2614D86F097D4FC29D8893
	@Test()
	void fromWhenThisSourceOperatorIsNull() {
		/* Branches:
		 * (this.parent != null) : false  #  inside getSource method
		 * (this.sourceOperator != null) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.context.properties.PropertyMapper$Source
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Supplier supplierMock = mock(Supplier.class);
		SingletonSupplier<Object> singletonSupplierMock = mock(SingletonSupplier.class);
		try (MockedStatic<SingletonSupplier> singletonSupplier = mockStatic(SingletonSupplier.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(supplierMock, "Supplier must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			singletonSupplier.when(() -> SingletonSupplier.of(supplierMock)).thenReturn(singletonSupplierMock);
			PropertyMapper target = PropertyMapper.get();
			//Act Statement(s)
			PropertyMapper.Source result = target.from(supplierMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(supplierMock, "Supplier must not be null"), atLeast(1));
				singletonSupplier.verify(() -> SingletonSupplier.of(supplierMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4d14331c-3461-34d2-9c31-3612d7b953ef}, hash: 1D8921E445F001C7373E1A97689872E0
	@Test()
	void from1Test() {
		//Arrange Statement(s)
		PropertyMapper target = spy(PropertyMapper.get());
		PropertyMapper.Source propertyMapperSourceMock = mock(PropertyMapper.Source.class);
		doReturn(propertyMapperSourceMock).when(target).from((Supplier) any());
		Object object = new Object();
		//Act Statement(s)
		PropertyMapper.Source result = target.from(object);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(propertyMapperSourceMock));
			verify(target).from((Supplier) any());
		});
	}

	//Sapient generated method id: ${9c25887d-767d-38e9-b5ae-c2e4012c49be}, hash: 5FAEA5DB87B3CAC50D6E0E57372FBF79
	@Test()
	void getTest() {
		//Act Statement(s)
		PropertyMapper result = PropertyMapper.get();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
