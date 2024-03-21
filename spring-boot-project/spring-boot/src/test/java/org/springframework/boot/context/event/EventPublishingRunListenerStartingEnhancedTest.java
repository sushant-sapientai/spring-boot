package org.springframework.boot.context.event;

import org.springframework.boot.context.event.EventPublishingRunListener;

import org.springframework.boot.context.event.ApplicationContextInitializedEvent;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.EventPublishingRunListener;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.boot.availability.*;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.core.env.*;
import org.springframework.context.event.*;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.LivenessState;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.context.*;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.core.env.ConfigurableEnvironment;

import java.lang.*;
import java.util.Set;
import java.time.*;

import org.springframework.context.event.SimpleApplicationEventMulticaster;

import java.time.Duration;
import java.lang.Throwable;

import org.springframework.boot.*;
import org.springframework.boot.context.event.*;

import java.util.*;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.ErrorHandler;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.context.ApplicationContextAware;

import org.apache.commons.logging.Log;

import org.springframework.boot.SpringApplication;
import org.springframework.core.Ordered;
import org.springframework.context.ApplicationEvent;

import java.time.Duration;

import org.springframework.boot.ConfigurableBootstrapContext;

import org.apache.commons.logging.LogFactory;

import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.context.ApplicationListener;
import org.springframework.boot.availability.LivenessState;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.availability.AvailabilityChangeEvent;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsInstanceOf.*;
import static org.hamcrest.MatcherAssert.*;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;

import org.hamcrest.Matchers;
import org.hamcrest.core.IsInstanceOf;
import org.hamcrest.MatcherAssert;
import org.mockito.Mockito;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;
import org.mockito.MockitoAnnotations;
import org.mockito.Mock;

import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.net.*;
import java.beans.*;

import javax.net.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

class EventPublishingRunListenerStartingEnhancedTest {

	@Mock
	private SpringApplication application;

	@Mock
	private SimpleApplicationEventMulticaster initialMulticaster;

	@Mock
	private ConfigurableApplicationContext context;

	@Mock
	private ConfigurableEnvironment environment;

	@Mock
	private ApplicationEventMulticaster applicationEventMulticaster;

	private EventPublishingRunListener listener;

	private AutoCloseable closeable;

	@BeforeEach
	void setUp() {
		closeable = MockitoAnnotations.openMocks(this);
		listener = new EventPublishingRunListener(application, new String[] {});
	}

	@AfterEach
	void tearDown() throws Exception {
		closeable.close();
	}

//	@Test
//	void testStarting() {
//		ConfigurableBootstrapContext bootstrapContext = mock(ConfigurableBootstrapContext.class);
//		doNothing().when(initialMulticaster).multicastEvent(any(ApplicationStartingEvent.class));
//		doNothing().when(application).addApplicationListener(any());
//		listener.starting(bootstrapContext);
//		verify(initialMulticaster).multicastEvent(any(ApplicationStartingEvent.class));
//		verify(application).addApplicationListener(any());
//	}
}
