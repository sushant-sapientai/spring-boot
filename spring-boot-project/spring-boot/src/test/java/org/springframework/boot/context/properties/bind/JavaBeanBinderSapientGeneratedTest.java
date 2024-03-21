package org.springframework.boot.context.properties.bind;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import org.springframework.core.ResolvableType;
import org.springframework.beans.BeanUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class JavaBeanBinderSapientGeneratedTest {

	private final Binder.Context binderContextMock = mock(Binder.Context.class);

	private final ResolvableType resolvableTypeMock = mock(ResolvableType.class);

	//Sapient generated method id: ${b7f6e049-53d8-30b7-bb8b-f15c1a9c42c6}, hash: B8A668E31C1228FA0FD5CFA52080701C
	@Disabled()
	@Test()
	void createWhenTypeIsNotNull() {
		/* Branches:
		 * (type != null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<BeanUtils> beanUtils = mockStatic(BeanUtils.class)) {
			doReturn(Object.class).when(resolvableTypeMock).resolve();
			Object object = new Object();
			beanUtils.when(() -> BeanUtils.instantiateClass(Object.class)).thenReturn(object);
			JavaBeanBinder target = new JavaBeanBinder();
			Bindable bindable = Bindable.of(resolvableTypeMock);
			//Act Statement(s)
			Object result = target.create(bindable, binderContextMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(object));
				verify(resolvableTypeMock).resolve();
				beanUtils.verify(() -> BeanUtils.instantiateClass(Object.class), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${707e5d6d-b3d1-3884-b706-e7d8563d81a2}, hash: 1EFAEE84690A1553AB17B3289A1F5CB1
	@Disabled()
	@Test()
	void createWhenTypeIsNull() {
		/* Branches:
		 * (type != null) : false
		 */
		//Arrange Statement(s)
		doReturn(null).when(resolvableTypeMock).resolve();
		JavaBeanBinder target = new JavaBeanBinder();
		Bindable bindable = Bindable.of(resolvableTypeMock);
		//Act Statement(s)
		Object result = target.create(bindable, binderContextMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(nullValue()));
			verify(resolvableTypeMock).resolve();
		});
	}
}
