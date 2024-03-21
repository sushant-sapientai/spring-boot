package org.springframework.boot.context.properties.bind;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.mockito.stubbing.Answer;

import java.lang.annotation.Annotation;

import org.springframework.core.ResolvableType;

import java.util.Set;

import org.springframework.util.Assert;

import java.util.Map;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BindableSapientGeneratedTest {

	private final ResolvableType typeMock = mock(ResolvableType.class, "type");

	private final ResolvableType boxedTypeMock = mock(ResolvableType.class, "boxedType");

	private final Bindable<Map<Object, Object>> bindableMock = mock(Bindable.class);

	private final ResolvableType resolvableTypeMock = mock(ResolvableType.class);

	private final ResolvableType typeMock2 = mock(ResolvableType.class);

	//Sapient generated method id: ${0c0b54df-f145-3614-8d79-f6601fa56d79}, hash: 54AB7BDE9F77CF95E128805783EFE84A
	@Test()
	void getAnnotationWhenTypeIsInstanceAnnotation() {
		/* Branches:
		 * (for-each(this.annotations)) : true
		 * (type.isInstance(annotation)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
    MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
    Class<Object>[] classArray = new Class[] { Object.class, Object.class };
    resolvableType.when(() -> ResolvableType.forClassWithGenerics(Map.class, classArray)).thenReturn(resolvableTypeMock);
    bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
    Bindable<Object> target = Bindable.mapOf(Object.class, Object.class);
    //Act Statement(s)
    Annotation result = target.getAnnotation(Annotation.class);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(notNullValue()));
        resolvableType.verify(() -> ResolvableType.forClassWithGenerics(Map.class, classArray), atLeast(1));
        bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${4eb7db39-0a57-38ad-a72d-511d50e04994}, hash: FF25B23C1C8F12B8A3E9B40E5079659A
	@Test()
	void getAnnotationWhenTypeNotIsInstanceAnnotation() {
		/* Branches:
		 * (for-each(this.annotations)) : true
		 * (type.isInstance(annotation)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
    MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
    Class<Object>[] classArray = new Class[] { Object.class, Object.class };
    resolvableType.when(() -> ResolvableType.forClassWithGenerics(Map.class, classArray)).thenReturn(resolvableTypeMock);
    bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
    Bindable<Object> target = Bindable.mapOf(Object.class, Object.class);
    //Act Statement(s)
    Annotation result = target.getAnnotation(Annotation.class);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(nullValue()));
        resolvableType.verify(() -> ResolvableType.forClassWithGenerics(Map.class, classArray), atLeast(1));
        bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${2a98fe32-b8a9-36b6-836e-6db8e42d23b4}, hash: B36FA08ABF9423AAF01063D00AD1658B
	@Test()
	void hasBindRestrictionWhenThisBindRestrictionsContainsBindRestriction() {
		/* Branches:
		 * (this.bindRestrictions.contains(bindRestriction)) : true
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
    MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
    Class<Object>[] classArray = new Class[] { Object.class, Object.class };
    resolvableType.when(() -> ResolvableType.forClassWithGenerics(Map.class, classArray)).thenReturn(resolvableTypeMock);
    bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
    Bindable<Object> target = Bindable.mapOf(Object.class, Object.class);
    //Act Statement(s)
    boolean result = target.hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo(Boolean.TRUE));
        resolvableType.verify(() -> ResolvableType.forClassWithGenerics(Map.class, classArray), atLeast(1));
        bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${5e37aa51-fcf5-3095-9f2c-5a579041ad64}, hash: E76223DA6A5A09A3803BCCBA5BAB9410
	@Test()
	void hasBindRestrictionWhenThisBindRestrictionsNotContainsBindRestriction() {
		/* Branches:
		 * (this.bindRestrictions.contains(bindRestriction)) : false
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
    MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
    Class<Object>[] classArray = new Class[] { Object.class, Object.class };
    resolvableType.when(() -> ResolvableType.forClassWithGenerics(Map.class, classArray)).thenReturn(resolvableTypeMock);
    bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
    Bindable<Object> target = Bindable.mapOf(Object.class, Object.class);
    //Act Statement(s)
    boolean result = target.hasBindRestriction(Bindable.BindRestriction.NO_DIRECT_PROPERTY);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo(Boolean.FALSE));
        resolvableType.verify(() -> ResolvableType.forClassWithGenerics(Map.class, classArray), atLeast(1));
        bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${71eb015a-95ed-3787-b890-7174d4d99f79}, hash: C4A06199E7ACB4B9B530C6A4B67A16FD
	@Test()
	void toStringWhenThisValueIsNull() {
		/* Branches:
		 * (this.value != null) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: creator
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
    MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
    Class<Object>[] classArray = new Class[] { Object.class, Object.class };
    resolvableType.when(() -> ResolvableType.forClassWithGenerics(Map.class, classArray)).thenReturn(resolvableTypeMock);
    bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
    Bindable<Object> target = Bindable.mapOf(Object.class, Object.class);
    //Act Statement(s)
    String result = target.toString();
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo("result1"));
        resolvableType.verify(() -> ResolvableType.forClassWithGenerics(Map.class, classArray), atLeast(1));
        bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${98869e93-f5c9-3b6c-ba2d-3272eeab77b3}, hash: 9F3F467BFA7BD2FBABDE2C6D6C293C26
	@Test()
	void withAnnotationsWhenAnnotationsIsNotNull() {
		/* Branches:
		 * (annotations != null) : true
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
    MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
    Class<Object>[] classArray = new Class[] { Object.class, Object.class };
    resolvableType.when(() -> ResolvableType.forClassWithGenerics(Map.class, classArray)).thenReturn(resolvableTypeMock);
    bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
    Bindable<Object> target = Bindable.mapOf(Object.class, Object.class);
    Annotation[] annotationArray = new Annotation[] {};
    //Act Statement(s)
    Bindable result = target.withAnnotations(annotationArray);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(notNullValue()));
        resolvableType.verify(() -> ResolvableType.forClassWithGenerics(Map.class, classArray), atLeast(1));
        bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${0a923754-1598-368b-923e-63ff46b9f177}, hash: 5E89F0ED70E48B96A29382A12A39143F
	@Test()
	void withAnnotationsWhenAnnotationsIsNull() {
		/* Branches:
		 * (annotations != null) : false
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
    MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
    Class<Object>[] classArray = new Class[] { Object.class, Object.class };
    resolvableType.when(() -> ResolvableType.forClassWithGenerics(Map.class, classArray)).thenReturn(resolvableTypeMock);
    bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
    Bindable<Object> target = Bindable.mapOf(Object.class, Object.class);
    Annotation[] annotation = null;
    //Act Statement(s)
    Bindable result = target.withAnnotations(annotation);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(notNullValue()));
        resolvableType.verify(() -> ResolvableType.forClassWithGenerics(Map.class, classArray), atLeast(1));
        bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${b6c83d41-f625-3420-9839-04f9ae84dc5a}, hash: 8F51F57E71BBABB605183E4DDC86AD46
	@Test()
	void withExistingValueWhenExistingValueIsNull() {
		/* Branches:
		 * (branch expression (line 193)) : false
		 * (this.bindMethod != BindMethod.VALUE_OBJECT) : true
		 * (existingValue != null) : false
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
    MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
    MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
    Class<Object>[] classArray = new Class[] { Object.class, Object.class };
    resolvableType.when(() -> ResolvableType.forClassWithGenerics(Map.class, classArray)).thenReturn(resolvableTypeMock);
    bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
    _assert.when(() -> Assert.isTrue(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    Bindable<Object> target = Bindable.mapOf(Object.class, Object.class);
    Object object = null;
    //Act Statement(s)
    Bindable result = target.withExistingValue(object);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(notNullValue()));
        resolvableType.verify(() -> ResolvableType.forClassWithGenerics(Map.class, classArray), atLeast(1));
        bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
        _assert.verify(() -> Assert.isTrue(eq(true), (Supplier) any()));
        _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
    });
}*/
	}

	//Sapient generated method id: ${b7446969-16fe-3200-a92a-363fafc23073}, hash: DC4E1443BD7DFD71FD1E85A2B78F5D75
	@Test()
	void withExistingValueWhenThisBindMethodNotEqualsBindMethodVALUE_OBJECTAndExistingValueIsNotNull() {
		/* Branches:
		 * (branch expression (line 193)) : false
		 * (existingValue == null) : true
		 * (this.type.isArray()) : true
		 * (this.bindMethod != BindMethod.VALUE_OBJECT) : true
		 * (existingValue != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
    MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
    MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
    Class<Object>[] classArray = new Class[] { Object.class, Object.class };
    resolvableType.when(() -> ResolvableType.forClassWithGenerics(Map.class, classArray)).thenReturn(resolvableTypeMock);
    bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
    _assert.when(() -> Assert.isTrue(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    Bindable<Object> target = Bindable.mapOf(Object.class, Object.class);
    doReturn(false).when(typeMock).isArray();
    doReturn(Object.class).when(boxedTypeMock).resolve();
    Object object = new Object();
    //Act Statement(s)
    Bindable result = target.withExistingValue(object);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(notNullValue()));
        resolvableType.verify(() -> ResolvableType.forClassWithGenerics(Map.class, classArray), atLeast(1));
        bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
        _assert.verify(() -> Assert.isTrue(eq(true), (Supplier) any()));
        _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
        verify(typeMock, atLeast(1)).isArray();
        verify(boxedTypeMock, atLeast(1)).resolve();
    });
}*/
	}

	//Sapient generated method id: ${c9bb1644-d672-3aaa-9855-15df24c7157e}, hash: 4E82111B2E30D9784F4A03D562EB9437
	@Test()
	void withExistingValueWhenThisTypeNotIsArrayAndThisBindMethodNotEqualsBindMethodVALUE_OBJECTAndExistingValueIsNotNull() {
		/* Branches:
		 * (branch expression (line 193)) : false
		 * (existingValue == null) : true
		 * (this.type.isArray()) : false
		 * (this.bindMethod != BindMethod.VALUE_OBJECT) : true
		 * (existingValue != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
    MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
    MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
    Class<Object>[] classArray = new Class[] { Object.class, Object.class };
    resolvableType.when(() -> ResolvableType.forClassWithGenerics(Map.class, classArray)).thenReturn(resolvableTypeMock);
    bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
    _assert.when(() -> Assert.isTrue(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    Bindable<Object> target = Bindable.mapOf(Object.class, Object.class);
    doReturn(false).when(typeMock).isArray();
    doReturn(Object.class).when(boxedTypeMock).resolve();
    Object object = new Object();
    //Act Statement(s)
    Bindable result = target.withExistingValue(object);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(notNullValue()));
        resolvableType.verify(() -> ResolvableType.forClassWithGenerics(Map.class, classArray), atLeast(1));
        bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
        _assert.verify(() -> Assert.isTrue(eq(false), (Supplier) any()));
        _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
        verify(typeMock, atLeast(1)).isArray();
        verify(boxedTypeMock, atLeast(1)).resolve();
    });
}*/
	}

	//Sapient generated method id: ${887d4022-14db-348b-8a3d-fa4aa86d8237}, hash: 4125428488C374D0F751EB356A9856D6
	@Test()
	void withSuppliedValueTest() {
		//Arrange Statement(s)
		//Supplier supplierMock = mock(Supplier.class);
        /*try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
    MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
    Class<Object>[] classArray = new Class[] { Object.class, Object.class };
    resolvableType.when(() -> ResolvableType.forClassWithGenerics(Map.class, classArray)).thenReturn(resolvableTypeMock);
    bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
    Bindable<Object> target = Bindable.mapOf(Object.class, Object.class);
    //Act Statement(s)
    Bindable result = target.withSuppliedValue(supplierMock);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(notNullValue()));
        resolvableType.verify(() -> ResolvableType.forClassWithGenerics(Map.class, classArray), atLeast(1));
        bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${4623f66f-2eaf-3b78-b9eb-6d6cecb5f962}, hash: 28A39876840947ED7DF216B859A8F404
	@Test()
	void withBindRestrictionsTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
    MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
    Class<Object>[] classArray = new Class[] { Object.class, Object.class };
    resolvableType.when(() -> ResolvableType.forClassWithGenerics(Map.class, classArray)).thenReturn(resolvableTypeMock);
    bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
    Bindable<Object> target = Bindable.mapOf(Object.class, Object.class);
    Bindable.BindRestriction[] bindRestrictionArray = new Bindable.BindRestriction[] {};
    //Act Statement(s)
    Bindable result = target.withBindRestrictions(bindRestrictionArray);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(notNullValue()));
        resolvableType.verify(() -> ResolvableType.forClassWithGenerics(Map.class, classArray), atLeast(1));
        bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
    });
}*/
	}

	//Sapient generated method id: ${9c096587-2488-3865-9fb2-ad8cf97bbd6b}, hash: 9CA6C122ED8D4A11004635C8C94CE542
	@Test()
	void withBindMethodWhenThisValueIsNull() {
		/* Branches:
		 * (bindMethod != BindMethod.VALUE_OBJECT) : false
		 * (this.value == null) : true
		 */
		//Arrange Statement(s)
        /*try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
    MockedStatic<Bindable> bindable = mockStatic(Bindable.class);
    MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
    Class<Object>[] classArray = new Class[] { Object.class, Object.class };
    resolvableType.when(() -> ResolvableType.forClassWithGenerics(Map.class, classArray)).thenReturn(resolvableTypeMock);
    bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
    _assert.when(() -> Assert.state(eq(true), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
    Bindable<Object> target = Bindable.mapOf(Object.class, Object.class);
    //Act Statement(s)
    Bindable result = target.withBindMethod(BindMethod.VALUE_OBJECT);
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, is(notNullValue()));
        resolvableType.verify(() -> ResolvableType.forClassWithGenerics(Map.class, classArray), atLeast(1));
        bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
        _assert.verify(() -> Assert.state(eq(true), (Supplier) any()));
    });
}*/
	}

	//Sapient generated method id: ${99269197-38e4-3e61-b80e-c546d61e22ee}, hash: FC3FA5C9EAC7B1999E11D38A3E34515C
	@Test()
	void ofInstanceTest() {
		//Arrange Statement(s)
		Bindable<Object> bindableMock = mock(Bindable.class);
		Bindable bindableMock2 = mock(Bindable.class);
		try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class, CALLS_REAL_METHODS);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			Object object = new Object();
			_assert.when(() -> Assert.notNull(object, "Instance must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			bindable.when(() -> Bindable.of(Object.class)).thenReturn(bindableMock);
			doReturn(bindableMock2).when(bindableMock).withExistingValue(object);
			//Act Statement(s)
			Bindable result = Bindable.ofInstance(object);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindableMock2));
				_assert.verify(() -> Assert.notNull(object, "Instance must not be null"), atLeast(1));
				bindable.verify(() -> Bindable.of(Object.class), atLeast(1));
				verify(bindableMock, atLeast(1)).withExistingValue(object);
			});
		}
	}

	//Sapient generated method id: ${3155f475-158f-3510-8516-db6562387204}, hash: AFA410480DFEE37094F508BE8160A560
	@Test()
	void ofTest() {
		//Arrange Statement(s)
		Bindable bindableMock = mock(Bindable.class);
		try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class, CALLS_REAL_METHODS);
			 MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(Object.class, "Type must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			resolvableType.when(() -> ResolvableType.forClass(Object.class)).thenReturn(resolvableTypeMock);
			bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
			//Act Statement(s)
			Bindable result = Bindable.of(Object.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindableMock));
				_assert.verify(() -> Assert.notNull(Object.class, "Type must not be null"), atLeast(1));
				resolvableType.verify(() -> ResolvableType.forClass(Object.class), atLeast(1));
				bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${b1301ccd-db54-3f04-ba3b-023b16f93ee8}, hash: 9B6B0D7E1527B9117F05B618EA2F150D
	@Test()
	void listOfTest() {
		//Arrange Statement(s)
		Bindable<List<Object>> bindableMock = mock(Bindable.class);
		try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class, CALLS_REAL_METHODS);
			 MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			Class<Object>[] classArray = new Class[] { Object.class };
			resolvableType.when(() -> ResolvableType.forClassWithGenerics(List.class, classArray)).thenReturn(resolvableTypeMock);
			bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
			//Act Statement(s)
			Bindable<List<Object>> result = Bindable.listOf(Object.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindableMock));
				resolvableType.verify(() -> ResolvableType.forClassWithGenerics(List.class, classArray), atLeast(1));
				bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${1a55bfd1-a800-3a32-bada-69469b6ce117}, hash: 09B57E4395FF9943C470DF6831743A7B
	@Test()
	void setOfTest() {
		//Arrange Statement(s)
		Bindable<Set<Object>> bindableMock = mock(Bindable.class);
		try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class, CALLS_REAL_METHODS);
			 MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			Class<Object>[] classArray = new Class[] { Object.class };
			resolvableType.when(() -> ResolvableType.forClassWithGenerics(Set.class, classArray)).thenReturn(resolvableTypeMock);
			bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
			//Act Statement(s)
			Bindable<Set<Object>> result = Bindable.setOf(Object.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindableMock));
				resolvableType.verify(() -> ResolvableType.forClassWithGenerics(Set.class, classArray), atLeast(1));
				bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${fdc5ff0e-48f6-3ffc-bd15-6aa54a16a841}, hash: B4C9C0363A6883956906A4C8388033F1
	@Test()
	void mapOfTest() {
		//Arrange Statement(s)
		try (MockedStatic<Bindable> bindable = mockStatic(Bindable.class, CALLS_REAL_METHODS);
			 MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class)) {
			Class<Object>[] classArray = new Class[] { Object.class, Object.class };
			resolvableType.when(() -> ResolvableType.forClassWithGenerics(Map.class, classArray)).thenReturn(resolvableTypeMock);
			bindable.when(() -> Bindable.of(resolvableTypeMock)).thenReturn(bindableMock);
			//Act Statement(s)
			Bindable<Map<Object, Object>> result = Bindable.mapOf(Object.class, Object.class);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(bindableMock));
				resolvableType.verify(() -> ResolvableType.forClassWithGenerics(Map.class, classArray), atLeast(1));
				bindable.verify(() -> Bindable.of(resolvableTypeMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${47c9fee2-c871-304a-9717-afca5a5be807}, hash: 9D4D889697F9254DAFFA3A754BEBD5AF
	@Disabled()
	@Test()
	void of1WhenResolvedIsPrimitive() {
		/* Branches:
		 * (resolved != null) : true  #  inside box method
		 * (resolved.isPrimitive()) : true  #  inside box method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(Object.class).when(typeMock2).resolve();
			_assert.when(() -> Assert.notNull(typeMock2, "Type must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			resolvableType.when(() -> ResolvableType.forClass(Object.class)).thenReturn(resolvableTypeMock);
			//Act Statement(s)
			Bindable result = Bindable.of(typeMock2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(typeMock2, atLeast(1)).resolve();
				_assert.verify(() -> Assert.notNull(typeMock2, "Type must not be null"), atLeast(1));
				resolvableType.verify(() -> ResolvableType.forClass(Object.class), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${9f281972-2c76-3ba7-b3f7-825e7fd33cca}, hash: 4ADA6EE92638F3B1976E8C31BC3D2D95
	@Disabled()
	@Test()
	void of1WhenResolvedIsArray() {
		/* Branches:
		 * (resolved != null) : true  #  inside box method
		 * (resolved.isPrimitive()) : false  #  inside box method
		 * (resolved != null) : true  #  inside box method
		 * (resolved.isArray()) : true  #  inside box method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ResolvableType resolvableTypeMock2 = mock(ResolvableType.class);
		ResolvableType resolvableTypeMock3 = mock(ResolvableType.class);
		try (MockedStatic<ResolvableType> resolvableType = mockStatic(ResolvableType.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(Object.class).when(typeMock2).resolve();
			doReturn(resolvableTypeMock).when(typeMock2).getComponentType();
			_assert.when(() -> Assert.notNull(typeMock2, "Type must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			resolvableType.when(() -> ResolvableType.forArrayComponent(resolvableTypeMock3)).thenReturn(resolvableTypeMock2);
			//Act Statement(s)
			Bindable result = Bindable.of(typeMock2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(typeMock2, atLeast(1)).resolve();
				verify(typeMock2, atLeast(1)).getComponentType();
				_assert.verify(() -> Assert.notNull(typeMock2, "Type must not be null"), atLeast(1));
				resolvableType.verify(() -> ResolvableType.forArrayComponent(resolvableTypeMock3), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${408629a3-3af9-3096-8cdb-52cfaf0d3167}, hash: 0F0108CDC2ED1F1249E7A1C2B09DF830
	@Test()
	void of1WhenResolvedNotIsArray() {
		/* Branches:
		 * (resolved != null) : true  #  inside box method
		 * (resolved.isPrimitive()) : false  #  inside box method
		 * (resolved != null) : true  #  inside box method
		 * (resolved.isArray()) : false  #  inside box method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(Object.class).when(typeMock2).resolve();
			_assert.when(() -> Assert.notNull(typeMock2, "Type must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			Bindable result = Bindable.of(typeMock2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(typeMock2, atLeast(1)).resolve();
				_assert.verify(() -> Assert.notNull(typeMock2, "Type must not be null"), atLeast(1));
			});
		}
	}
}
