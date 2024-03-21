package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.boot.context.properties.bind.Binder;

import org.mockito.stubbing.Answer;

import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.boot.ansi.AnsiOutput;
import org.springframework.boot.ConfigurableBootstrapContext;

import org.mockito.MockedStatic;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class AnsiOutputApplicationListenerSapientGeneratedTest {

	//Sapient generated method id: ${472c146e-fdf0-3ffc-9db9-d5a3f9028e9d}, hash: 68501FBB521B1BC67A79474B0936647E
	@Disabled()
	@Test()
	void onApplicationEventTest() {
		//Arrange Statement(s)
		ConfigurableEnvironment environmentMock = mock(ConfigurableEnvironment.class);
		Binder binderMock = mock(Binder.class);
		BindResult bindResultMock = mock(BindResult.class);
		ConfigurableBootstrapContext configurableBootstrapContextMock = mock(ConfigurableBootstrapContext.class);
		SpringApplication springApplicationMock = mock(SpringApplication.class);
		try (MockedStatic<AnsiOutput> ansiOutput = mockStatic(AnsiOutput.class);
			 MockedStatic<Binder> binder = mockStatic(Binder.class)) {
			doReturn(false).when(environmentMock).getProperty("spring.output.ansi.console-available", Boolean.class);
			binder.when(() -> Binder.get(environmentMock)).thenReturn(binderMock);
			doReturn(bindResultMock).when(binderMock).bind("spring.output.ansi.enabled", AnsiOutput.Enabled.class);
			doNothing().when(bindResultMock).ifBound((Consumer) any());
			ansiOutput.when(() -> AnsiOutput.setEnabled(AnsiOutput.Enabled.NEVER)).thenAnswer((Answer<Void>) invocation -> null);
			ansiOutput.when(() -> AnsiOutput.setConsoleAvailable(false)).thenAnswer((Answer<Void>) invocation -> null);
			AnsiOutputApplicationListener target = new AnsiOutputApplicationListener();
			String[] stringArray = new String[] {};
			ApplicationEnvironmentPreparedEvent applicationEnvironmentPreparedEvent = new ApplicationEnvironmentPreparedEvent(configurableBootstrapContextMock, springApplicationMock, stringArray, environmentMock);
			//Act Statement(s)
			target.onApplicationEvent(applicationEnvironmentPreparedEvent);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(environmentMock).getProperty("spring.output.ansi.console-available", Boolean.class);
				binder.verify(() -> Binder.get(environmentMock), atLeast(1));
				verify(binderMock).bind("spring.output.ansi.enabled", AnsiOutput.Enabled.class);
				verify(bindResultMock).ifBound((Consumer) any());
				ansiOutput.verify(() -> AnsiOutput.setEnabled(AnsiOutput.Enabled.NEVER), atLeast(1));
				ansiOutput.verify(() -> AnsiOutput.setConsoleAvailable(false), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c0bb632e-c120-35d3-9fe3-7fc42c801bce}, hash: 365E936925E3E61239DE8BC3BD405105
	@Test()
	void getOrderTest() {
		//Arrange Statement(s)
		AnsiOutputApplicationListener target = new AnsiOutputApplicationListener();
		//Act Statement(s)
		int result = target.getOrder();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(-2147483637)));
	}
}
