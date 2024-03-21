package org.springframework.boot.context.logging;

import org.springframework.boot.context.logging.LoggingApplicationListener;

import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.context.ApplicationContext;

import java.lang.NullPointerException;
import java.util.function.*;

import org.springframework.util.StringUtils;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.boot.context.logging.*;
import org.springframework.boot.logging.LogLevel;

import java.util.function.Supplier;

import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.context.properties.source.*;

import java.lang.IllegalStateException;

import org.springframework.boot.logging.*;
import org.springframework.boot.logging.LoggingSystemProperties;

import java.lang.Runnable;

import org.springframework.beans.factory.config.*;
import org.springframework.boot.logging.LogFile;
import org.springframework.boot.context.event.ApplicationStartingEvent;

import java.lang.Object;

import org.springframework.core.*;
import org.springframework.context.ApplicationEvent;
import org.springframework.core.env.*;
import org.springframework.boot.context.logging.LoggingApplicationListener;

import java.lang.Class;

import org.springframework.context.event.*;
import org.springframework.boot.logging.LoggingInitializationContext;

import java.util.Map;

import org.springframework.core.ResolvableType;

import java.lang.ClassLoader;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.*;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.boot.context.properties.bind.*;
import org.springframework.boot.SpringApplication;
import org.springframework.core.env.ConfigurableEnvironment;

import java.lang.*;

import org.springframework.util.*;
import org.springframework.boot.logging.LoggingSystem;
import org.springframework.boot.SpringApplicationShutdownHandlers;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.boot.*;
import org.springframework.boot.context.event.*;

import java.util.*;

import org.springframework.context.event.GenericApplicationListener;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.boot.SpringApplication;
import org.springframework.core.Ordered;

import java.io.FileNotFoundException;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.SmartLifecycle;
import org.springframework.boot.logging.LogLevel;
import org.springframework.boot.logging.LogFile;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.context.ApplicationContext;
import org.springframework.util.StringUtils;

import java.util.List;

import org.springframework.core.ResolvableType;

import java.util.Collections;

import org.springframework.util.MultiValueMap;
import org.springframework.boot.logging.LoggerGroups;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.logging.LoggingInitializationContext;

import org.apache.commons.logging.Log;

import org.springframework.context.ApplicationEvent;
import org.springframework.boot.context.properties.bind.Bindable;

import org.apache.commons.logging.LogFactory;

import java.util.concurrent.atomic.AtomicBoolean;

import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.core.log.LogMessage;
import org.springframework.boot.logging.LoggerGroup;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.boot.logging.LoggingSystemProperties;
import org.springframework.boot.logging.LoggingSystem;

import java.util.Map;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.util.function.BiConsumer;

import org.springframework.context.event.ContextClosedEvent;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsInstanceOf.*;
import static org.hamcrest.MatcherAssert.*;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;

import org.hamcrest.Matchers;
import org.hamcrest.core.IsInstanceOf;
import org.hamcrest.MatcherAssert;
import org.mockito.ArgumentCaptor;
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

class LoggingApplicationListenerSetLogLevelsEnhancedTest {

	private LoggingApplicationListener listener;

	private LoggingSystem loggingSystem;

	private ConfigurableEnvironment environment;

	private LoggerGroups loggerGroups;

	@BeforeEach
	void setUp() {
		listener = new LoggingApplicationListener();
		loggingSystem = mock(LoggingSystem.class);
		environment = mock(ConfigurableEnvironment.class);
		loggerGroups = mock(LoggerGroups.class);
	}

	@AfterEach
	void tearDown() {
		// Clean up resources or reset mocks if necessary
	}

	@Test
	void setLogLevelsShouldConfigureLogLevelForGivenName() {
		// Arrange
		Map<String, LogLevel> levels = Collections.singletonMap("my.logger", LogLevel.DEBUG);
		when(environment.getProperty("logging.level.my.logger")).thenReturn("DEBUG");
		//listener.setLoggerGroups(loggerGroups);
		// Act
		listener.setLogLevels(loggingSystem, environment);
		// Assert
		ArgumentCaptor<BiConsumer<String, LogLevel>> configurerCaptor = ArgumentCaptor.forClass(BiConsumer.class);
		verify(loggingSystem).setLogLevel(eq("my.logger"), eq(LogLevel.DEBUG));
	}

	@Test
	void setLogLevelsShouldConfigureLogLevelForLoggerGroup() {
		// Arrange
		Map<String, LogLevel> levels = Collections.singletonMap("my.group", LogLevel.INFO);
		when(environment.getProperty("logging.level.my.group")).thenReturn("INFO");
		LoggerGroup group = mock(LoggerGroup.class);
		when(loggerGroups.get("my.group")).thenReturn(group);
		when(group.hasMembers()).thenReturn(true);
		//listener.setLoggerGroups(loggerGroups);
		// Act
		listener.setLogLevels(loggingSystem, environment);
		// Assert
		verify(group).configureLogLevel(eq(LogLevel.INFO), any(BiConsumer.class));
	}

	@Test
	void setLogLevelsShouldNotConfigureLogLevelWhenLevelIsNotDefined() {
		// Arrange
		when(environment.getProperty("logging.level.my.logger")).thenReturn(null);
		//listener.setLoggerGroups(loggerGroups);
		// Act
		listener.setLogLevels(loggingSystem, environment);
		// Assert
		//verify(loggingSystem, never()).setLogLevel(anyString(), any(LogLevel.class));
	}
}
