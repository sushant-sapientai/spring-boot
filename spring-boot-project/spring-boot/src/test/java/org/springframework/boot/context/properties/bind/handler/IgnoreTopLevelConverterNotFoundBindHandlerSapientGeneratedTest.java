package org.springframework.boot.context.properties.bind.handler;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.convert.ConverterNotFoundException;
import org.springframework.boot.context.properties.bind.BindContext;

import org.mockito.stubbing.Answer;

import org.springframework.util.Assert;
import org.springframework.boot.context.properties.bind.Bindable;

import org.mockito.MockedStatic;

import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.boot.context.properties.bind.BindHandler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class IgnoreTopLevelConverterNotFoundBindHandlerSapientGeneratedTest {

	private final BindHandler bindHandlerMock = mock(BindHandler.class);

	private final Bindable<?> bindableMock = mock(Bindable.class);

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final BindContext contextMock = mock(BindContext.class);

	//Sapient generated method id: ${86358bf6-7739-37d2-a7d5-f1853f80e2a9}, hash: C32D8A99E0282778535D2D8565B6FED1
	@Test()
	void onFailureWhenErrorInstanceOfConverterNotFoundException() throws Exception {
		/* Branches:
		 * (context.getDepth() == 0) : true
		 * (error instanceof ConverterNotFoundException) : true
		 */
		//Arrange Statement(s)
		ConverterNotFoundException converterNotFoundExceptionMock = mock(ConverterNotFoundException.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(0).when(contextMock).getDepth();
			_assert.when(() -> Assert.notNull(bindHandlerMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			IgnoreTopLevelConverterNotFoundBindHandler target = new IgnoreTopLevelConverterNotFoundBindHandler(bindHandlerMock);
			//Act Statement(s)
			Object result = target.onFailure(configurationPropertyNameMock, bindableMock, contextMock, converterNotFoundExceptionMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(contextMock).getDepth();
				_assert.verify(() -> Assert.notNull(bindHandlerMock, "Parent must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${450b08fa-3b16-3d24-a359-3fdf0896ba13}, hash: 4D79656FBDAF1B2C458419FA1C84FB33
	@Test()
	void onFailureWhenErrorNotInstanceOfConverterNotFoundExceptionThrowsException() throws Exception {
		/* Branches:
		 * (context.getDepth() == 0) : true
		 * (error instanceof ConverterNotFoundException) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(0).when(contextMock).getDepth();
			_assert.when(() -> Assert.notNull(bindHandlerMock, "Parent must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			IgnoreTopLevelConverterNotFoundBindHandler target = new IgnoreTopLevelConverterNotFoundBindHandler(bindHandlerMock);
			Exception exception = new Exception();
			//Act Statement(s)
			final Exception result = assertThrows(Exception.class, () -> {
				target.onFailure(configurationPropertyNameMock, bindableMock, contextMock, exception);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(exception));
				verify(contextMock).getDepth();
				_assert.verify(() -> Assert.notNull(bindHandlerMock, "Parent must not be null"), atLeast(1));
			});
		}
	}
}
