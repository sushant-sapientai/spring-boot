package org.springframework.boot.context.config;

import org.springframework.boot.context.config.ConfigData.Option;
import org.springframework.boot.context.config.ConfigData.Options;
import org.springframework.boot.context.config.ConfigDataEnvironmentContributor;

import org.springframework.boot.context.config.ConfigDataEnvironmentContributor.ImportPhase;
import org.springframework.boot.context.config.ConfigDataEnvironmentContributor.Kind;
import org.springframework.boot.context.properties.bind.Binder;

import java.lang.NullPointerException;

import org.springframework.boot.context.config.ConfigDataEnvironmentContributor;

import java.util.Spliterator;

import org.springframework.core.env.PropertySource;
import org.springframework.boot.context.properties.source.ConfigurationPropertySource;
import org.springframework.boot.context.properties.source.*;

import java.util.Iterator;

import org.springframework.boot.context.config.ConfigData;
import org.springframework.boot.context.config.*;
import org.springframework.core.env.*;

import java.util.List;
import java.util.Map;

import org.springframework.util.CollectionUtils;
import org.springframework.boot.context.properties.bind.*;

import java.lang.StringBuilder;
import java.util.stream.Stream;
import java.util.stream.*;
import java.lang.*;

import org.springframework.util.*;
import org.springframework.boot.context.config.ConfigDataActivationContext;
import org.springframework.boot.context.config.ConfigDataProperties;
import org.springframework.boot.context.config.ConfigDataResource;

import java.lang.Iterable;

import org.springframework.boot.context.config.ConfigDataLocation;

import java.util.*;

import org.springframework.boot.context.properties.bind.PlaceholdersResolver;
import org.springframework.util.CollectionUtils;
import org.springframework.boot.context.properties.source.ConfigurationPropertySource;

import java.util.ArrayList;
import java.util.stream.StreamSupport;

import org.springframework.core.env.PropertySource;

import java.util.LinkedHashMap;

import org.springframework.boot.context.properties.bind.Binder;

import java.util.Iterator;

import org.springframework.core.env.Environment;

import java.util.stream.Stream;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import java.util.NoSuchElementException;

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

public class ConfigDataEnvironmentContributorToStringEnhancedTest {

	private ConfigDataEnvironmentContributor contributor;

	@BeforeEach
	void setUp() {
		// Setup necessary mock objects and the class under test here
	}

	@AfterEach
	void tearDown() {
		// Clean up after tests if necessary
	}

	@Test
	void testToStringWithNoChildren() {
		// Given
		ConfigDataLocation location = mock(ConfigDataLocation.class);
		ConfigDataResource resource = mock(ConfigDataResource.class);
		PropertySource<?> propertySource = mock(PropertySource.class);
		ConfigurationPropertySource configurationPropertySource = ConfigurationPropertySource.from(propertySource);
		ConfigDataProperties properties = mock(ConfigDataProperties.class);
		Options options = Options.of(Option.IGNORE_IMPORTS);
		contributor = new ConfigDataEnvironmentContributor(Kind.EXISTING, location, resource, false, propertySource, configurationPropertySource, properties, options, Collections.emptyMap());
		// When
		String result = contributor.toString();
		// Then
		String expected = "EXISTING " + location + " " + resource + " " + options + "\n";
		assertEquals(expected, result);
	}

	@Test
	void testToStringWithChildren() {
		// Given
		ConfigDataLocation location = mock(ConfigDataLocation.class);
		ConfigDataResource resource = mock(ConfigDataResource.class);
		PropertySource<?> propertySource = mock(PropertySource.class);
		ConfigurationPropertySource configurationPropertySource = ConfigurationPropertySource.from(propertySource);
		ConfigDataProperties properties = mock(ConfigDataProperties.class);
		Options options = Options.of(Option.IGNORE_IMPORTS);
		ConfigDataEnvironmentContributor childContributor = mock(ConfigDataEnvironmentContributor.class);
		when(childContributor.toString()).thenReturn("CHILD_CONTRIBUTOR");
		Map<ImportPhase, List<ConfigDataEnvironmentContributor>> children = new LinkedHashMap<>();
		children.put(ImportPhase.BEFORE_PROFILE_ACTIVATION, Collections.singletonList(childContributor));
		contributor = new ConfigDataEnvironmentContributor(Kind.ROOT, location, resource, false, propertySource, configurationPropertySource, properties, options, children);
		// When
		String result = contributor.toString();
		// Then
		String expected = "ROOT null null " + options + "\n    CHILD_CONTRIBUTOR";
		assertEquals(expected, result);
	}
}
