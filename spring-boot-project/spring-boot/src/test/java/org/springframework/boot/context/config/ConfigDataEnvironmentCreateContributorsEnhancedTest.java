package org.springframework.boot.context.config;

import org.springframework.boot.context.config.ConfigDataEnvironment;

import org.springframework.boot.context.properties.bind.Bindable;

import java.util.Collection;

import org.springframework.boot.context.config.ConfigDataEnvironmentContributor;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.boot.context.properties.source.ConfigurationPropertySource;
import org.springframework.util.StringUtils;
import org.springframework.boot.context.properties.bind.BindException;

import java.util.function.Supplier;

import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import org.apache.commons.logging.impl.NoOpLog;

import org.springframework.boot.logging.*;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.boot.logging.DeferredLogFactory;
import org.springframework.boot.context.config.InactiveConfigDataAccessException;

import org.apache.commons.logging.impl.*;

import org.springframework.boot.context.config.ConfigDataEnvironment;
import org.springframework.core.io.ResourceLoader;

import java.lang.ClassLoader;

import org.springframework.core.log.LogMessage;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.function.Predicate;
import java.util.Set;

import org.springframework.util.*;
import org.springframework.boot.context.config.Profiles;

import java.lang.Throwable;

import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.boot.context.config.ConfigDataNotFoundAction;

import java.util.function.*;

import org.springframework.core.env.PropertySource;
import org.springframework.boot.context.config.ConfigDataLocationResolvers;
import org.springframework.boot.context.properties.source.*;

import java.util.Iterator;

import org.springframework.boot.context.config.ConfigDataEnvironmentUpdateListener;

import java.util.function.Consumer;

import org.springframework.boot.context.config.InvalidConfigDataPropertyException;
import org.springframework.boot.DefaultPropertiesPropertySource;
import org.springframework.boot.context.config.*;
import org.springframework.core.env.*;

import java.util.List;
import java.lang.Class;

import org.springframework.boot.context.config.ConfigDataImporter;
import org.springframework.core.log.*;
import org.springframework.boot.context.properties.bind.*;

import java.lang.*;

import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.core.io.*;
import org.springframework.boot.context.config.ConfigDataActivationContext;
import org.springframework.boot.context.config.ConfigDataResource;
import org.springframework.boot.*;
import org.springframework.boot.context.config.ConfigDataLocation;
import org.springframework.boot.context.config.ConfigDataEnvironmentContributors;

import java.util.*;

import org.springframework.core.io.support.*;

import java.util.LinkedHashSet;

import org.springframework.core.io.ResourceLoader;

import java.util.Set;

import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.boot.context.properties.bind.PlaceholdersResolver;
import org.springframework.boot.context.properties.source.ConfigurationPropertySource;

import java.util.ArrayList;

import org.springframework.core.env.PropertySource;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.util.StringUtils;
import org.springframework.boot.DefaultPropertiesPropertySource;

import java.util.List;
import java.util.Collections;

import org.apache.commons.logging.Log;

import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.BindException;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.context.config.ConfigDataEnvironmentContributors.BinderOption;
import org.springframework.boot.BootstrapRegistry.InstanceSupplier;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.boot.BootstrapRegistry.Scope;
import org.springframework.core.log.LogMessage;
import org.springframework.boot.logging.DeferredLogFactory;
import org.springframework.core.env.Environment;

import java.util.Collection;

import org.springframework.core.env.MutablePropertySources;

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

class ConfigDataEnvironmentCreateContributorsEnhancedTest {

	private AutoCloseable closeable;

	@Mock
	private DeferredLogFactory logFactory;

	@Mock
	private ConfigurableBootstrapContext bootstrapContext;

	@Mock
	private ConfigurableEnvironment environment;

	@Mock
	private ResourceLoader resourceLoader;

	@Mock
	private ConfigDataEnvironmentContributors contributors;

	private ConfigDataEnvironment configDataEnvironment;

	@BeforeEach
	void setUp() {
		closeable = MockitoAnnotations.openMocks(this);
		configDataEnvironment = new ConfigDataEnvironment(logFactory, bootstrapContext, environment, resourceLoader, Collections.emptyList(), null);
	}

	@AfterEach
	void tearDown() throws Exception {
		closeable.close();
	}

	@Test
	void testCreateContributors() {
		List<ConfigDataEnvironmentContributor> contributorList = Collections.emptyList();
		ConfigDataEnvironmentContributors createdContributors = configDataEnvironment.createContributors(contributorList);
		assertNotNull(createdContributors, "Contributors should not be null");
	}
}
