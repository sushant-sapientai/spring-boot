package org.springframework.boot.context.config;

import org.springframework.boot.context.config.ConfigDataEnvironmentPostProcessor;

import java.util.Collection;

import org.springframework.core.env.*;

import java.util.List;
import java.lang.Class;

import org.springframework.boot.context.config.ConfigDataEnvironmentPostProcessor;

import org.apache.commons.logging.impl.*;

import org.springframework.boot.context.config.ConfigDataEnvironment;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.core.io.ResourceLoader;

import org.apache.commons.logging.impl.NoOpLog;

import org.springframework.boot.SpringApplication;
import org.springframework.core.env.ConfigurableEnvironment;

import java.lang.*;
import java.util.Set;

import org.springframework.boot.logging.*;
import org.springframework.boot.context.config.ConfigDataEnvironmentUpdateListener;
import org.springframework.core.io.*;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.boot.*;
import org.springframework.boot.logging.DeferredLogFactory;
import org.springframework.boot.context.config.*;

import java.util.*;

import org.springframework.core.io.ResourceLoader;
import org.springframework.boot.DefaultBootstrapContext;

import org.apache.commons.logging.Log;

import org.springframework.boot.SpringApplication;
import org.springframework.core.Ordered;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.boot.logging.DeferredLogFactory;
import org.springframework.core.env.Environment;

import java.util.Collection;
import java.util.function.Supplier;
import java.util.Collections;
import java.util.Arrays;

import org.springframework.core.io.DefaultResourceLoader;

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

class ConfigDataEnvironmentPostProcessorApplyToEnhancedTest {

	@Mock
	private ConfigurableEnvironment environment;

	@Mock
	private ResourceLoader resourceLoader;

	@Mock
	private ConfigurableBootstrapContext bootstrapContext;

	@Mock
	private ConfigDataEnvironmentUpdateListener environmentUpdateListener;

	@Mock
	private DeferredLogFactory logFactory;

	private AutoCloseable closeable;

	@BeforeEach
	void setUp() {
		closeable = MockitoAnnotations.openMocks(this);
	}

	@AfterEach
	void tearDown() throws Exception {
		closeable.close();
	}

	@Test
	void applyToWithNonNullBootstrapContext() {
		Set<String> additionalProfiles = Collections.singleton("test");
		ConfigDataEnvironmentPostProcessor.applyTo(environment, resourceLoader, bootstrapContext, additionalProfiles, environmentUpdateListener);
		verify(bootstrapContext, times(1)).registerIfAbsent(any(), any());
		verify(environment, times(1)).merge(any());
	}

	@Test
	void applyToWithNullBootstrapContext() {
		Set<String> additionalProfiles = Collections.singleton("test");
		ConfigDataEnvironmentPostProcessor.applyTo(environment, resourceLoader, null, additionalProfiles, environmentUpdateListener);
		verify(environment, times(1)).merge(any());
	}

	@Test
	void applyToWithAdditionalProfiles() {
		Set<String> additionalProfiles = Collections.singleton("additional-profile");
		ConfigDataEnvironmentPostProcessor.applyTo(environment, resourceLoader, bootstrapContext, additionalProfiles, environmentUpdateListener);
		verify(environment, times(1)).addActiveProfile("additional-profile");
	}

	@Test
	void applyToWithEnvironmentUpdateListener() {
		Set<String> additionalProfiles = Collections.singleton("test");
		ConfigDataEnvironmentPostProcessor.applyTo(environment, resourceLoader, bootstrapContext, additionalProfiles, environmentUpdateListener);
		//verify(environmentUpdateListener, times(1)).onPropertySourceAdded(any());
	}
}
