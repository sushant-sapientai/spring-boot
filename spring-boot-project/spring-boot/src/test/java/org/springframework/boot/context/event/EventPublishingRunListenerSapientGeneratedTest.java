package org.springframework.boot.context.event;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.env.ConfigurableEnvironment;

import org.mockito.stubbing.Answer;

import org.springframework.boot.availability.ReadinessState;
import org.springframework.boot.availability.AvailabilityChangeEvent;

import java.util.Set;
import java.util.HashSet;
import java.time.Duration;

import org.springframework.boot.ConfigurableBootstrapContext;

import org.mockito.MockedStatic;

import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.availability.LivenessState;
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
import static org.mockito.Mockito.times;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class EventPublishingRunListenerSapientGeneratedTest {

	private final SpringApplication applicationMock = mock(SpringApplication.class, "application");

	private final ApplicationListener<?> applicationListenerMock = mock(ApplicationListener.class);

	private final ConfigurableBootstrapContext configurableBootstrapContextMock = mock(ConfigurableBootstrapContext.class);

	private final ConfigurableApplicationContext contextMock = mock(ConfigurableApplicationContext.class);

	//Sapient generated method id: ${c0bb632e-c120-35d3-9fe3-7fc42c801bce}, hash: AF35A1938D04F3708E24D04F821D3AA2
	@Test()
	void getOrderTest() {
		//Arrange Statement(s)
		String[] stringArray = new String[] {};
		EventPublishingRunListener target = new EventPublishingRunListener(applicationMock, stringArray);
		//Act Statement(s)
		int result = target.getOrder();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(0)));
	}

	//Sapient generated method id: ${37c66c46-84ba-3016-9ec0-fa970ff9c0c1}, hash: F9EBFAC92F00A8FFF035C837C5CBC7F5
	@Test()
	void startingTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: initialMulticaster - Method: addApplicationListener
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] {};
		EventPublishingRunListener target = new EventPublishingRunListener(applicationMock, stringArray);
		Set<ApplicationListener<?>> anySet = new HashSet<>();
		anySet.add(applicationListenerMock);
		doReturn(anySet).when(applicationMock).getListeners();
		//Act Statement(s)
		target.starting(configurableBootstrapContextMock);
		//Assert statement(s)
		assertAll("result", () -> verify(applicationMock).getListeners());
	}

	//Sapient generated method id: ${7f4813f8-6c32-3f42-86b9-557a14642266}, hash: 82175188BC3CA98BCAA05A41D6D80FE2
	@Test()
	void environmentPreparedTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: initialMulticaster - Method: addApplicationListener
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] {};
		EventPublishingRunListener target = new EventPublishingRunListener(applicationMock, stringArray);
		Set<ApplicationListener<?>> anySet = new HashSet<>();
		anySet.add(applicationListenerMock);
		doReturn(anySet).when(applicationMock).getListeners();
		ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);
		//Act Statement(s)
		target.environmentPrepared(configurableBootstrapContextMock, configurableEnvironmentMock);
		//Assert statement(s)
		assertAll("result", () -> verify(applicationMock).getListeners());
	}

	//Sapient generated method id: ${7ea8f036-57c3-39ce-b7b8-234241e6da28}, hash: 3579B2C7EE312ABDC41CFF14DC0E5C34
	@Test()
	void contextPreparedTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: initialMulticaster - Method: addApplicationListener
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		String[] stringArray = new String[] {};
		EventPublishingRunListener target = new EventPublishingRunListener(applicationMock, stringArray);
		Set<ApplicationListener<?>> anySet = new HashSet<>();
		anySet.add(applicationListenerMock);
		doReturn(anySet).when(applicationMock).getListeners();
		ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		//Act Statement(s)
		target.contextPrepared(configurableApplicationContextMock);
		//Assert statement(s)
		assertAll("result", () -> verify(applicationMock).getListeners());
	}

	//Sapient generated method id: ${4b3b6191-eb63-3e48-8437-134f7d3d6d06}, hash: 619539A1397E0E09FDB3883830D57C3C
	@Test()
	void contextLoadedWhenListenerNotInstanceOfApplicationContextAware() {
		/* Branches:
		 * (for-each(this.application.getListeners())) : true
		 * (listener instanceof ApplicationContextAware contextAware) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  A variable could not be isolated or mocked when calling a method - Variable name: initialMulticaster - Method: addApplicationListener
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doNothing().when(contextMock).addApplicationListener(applicationListenerMock);
		String[] stringArray = new String[] {};
		EventPublishingRunListener target = new EventPublishingRunListener(applicationMock, stringArray);
		Set<ApplicationListener<?>> anySet = new HashSet<>();
		anySet.add(applicationListenerMock);
		ApplicationListener<?> applicationListenerMock2 = mock(ApplicationListener.class);
		Set<ApplicationListener<?>> anySet2 = new HashSet<>();
		anySet2.add(applicationListenerMock2);
		doReturn(anySet, anySet2).when(applicationMock).getListeners();
		//Act Statement(s)
		target.contextLoaded(contextMock);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(contextMock).addApplicationListener(applicationListenerMock);
			verify(applicationMock, times(2)).getListeners();
		});
	}

	//Sapient generated method id: ${e0963f6c-062e-35ce-b94f-1908590884bd}, hash: F2989AA35EB2FC0C608D350C826BAC35
	@Test()
	void startedTest() {
		//Arrange Statement(s)
		try (MockedStatic<AvailabilityChangeEvent> availabilityChangeEvent = mockStatic(AvailabilityChangeEvent.class)) {
			doNothing().when(contextMock).publishEvent((ApplicationStartedEvent) any());
			availabilityChangeEvent.when(() -> AvailabilityChangeEvent.publish(contextMock, LivenessState.CORRECT)).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] {};
			EventPublishingRunListener target = new EventPublishingRunListener(applicationMock, stringArray);
			Duration duration = Duration.ofDays(0L);
			//Act Statement(s)
			target.started(contextMock, duration);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(contextMock).publishEvent((ApplicationStartedEvent) any());
				availabilityChangeEvent.verify(() -> AvailabilityChangeEvent.publish(contextMock, LivenessState.CORRECT), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${40151341-834f-3327-9d6d-0248563b4e54}, hash: 2573A7AE147A43278E2A1E7B938C1332
	@Test()
	void readyTest() {
		//Arrange Statement(s)
		try (MockedStatic<AvailabilityChangeEvent> availabilityChangeEvent = mockStatic(AvailabilityChangeEvent.class)) {
			doNothing().when(contextMock).publishEvent((ApplicationReadyEvent) any());
			availabilityChangeEvent.when(() -> AvailabilityChangeEvent.publish(contextMock, ReadinessState.ACCEPTING_TRAFFIC)).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] {};
			EventPublishingRunListener target = new EventPublishingRunListener(applicationMock, stringArray);
			Duration duration = Duration.ofDays(0L);
			//Act Statement(s)
			target.ready(contextMock, duration);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(contextMock).publishEvent((ApplicationReadyEvent) any());
				availabilityChangeEvent.verify(() -> AvailabilityChangeEvent.publish(contextMock, ReadinessState.ACCEPTING_TRAFFIC), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${87ce5f58-89d8-32e1-a56b-c1f247247abd}, hash: 77056C87FCF30A2EBE01644A2499AC77
	@Test()
	void failedWhenContextIsActive() {
		/* Branches:
		 * (context != null) : true
		 * (context.isActive()) : true
		 */
		//Arrange Statement(s)
		doReturn(true).when(contextMock).isActive();
		doNothing().when(contextMock).publishEvent((ApplicationFailedEvent) any());
		String[] stringArray = new String[] {};
		EventPublishingRunListener target = new EventPublishingRunListener(applicationMock, stringArray);
		Throwable throwable = new Throwable();
		//Act Statement(s)
		target.failed(contextMock, throwable);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(contextMock).isActive();
			verify(contextMock).publishEvent((ApplicationFailedEvent) any());
		});
	}

	//Sapient generated method id: ${8abb3420-4a89-3456-82d1-c9ad9fef7887}, hash: 54F123F90B4A410ABDB6867278B358EB
	@Test()
	void failedWhenContextNotIsActiveAndContextNotInstanceOfAbstractApplicationContext() {
		/* Branches:
		 * (context != null) : true
		 * (context.isActive()) : false
		 * (context instanceof AbstractApplicationContext abstractApplicationContext) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: initialMulticaster
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(false).when(contextMock).isActive();
		String[] stringArray = new String[] {};
		EventPublishingRunListener target = new EventPublishingRunListener(applicationMock, stringArray);
		Throwable throwable = new Throwable();
		//Act Statement(s)
		target.failed(contextMock, throwable);
		//Assert statement(s)
		assertAll("result", () -> verify(contextMock).isActive());
	}
}
