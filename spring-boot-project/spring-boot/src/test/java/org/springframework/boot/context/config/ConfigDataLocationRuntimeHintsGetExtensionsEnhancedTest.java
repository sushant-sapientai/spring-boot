package org.springframework.boot.context.config;

import org.springframework.boot.context.config.ConfigDataLocationRuntimeHints;

import java.util.List;
import java.lang.Class;

import org.springframework.boot.env.*;

import java.lang.ClassLoader;

import org.springframework.aot.hint.support.*;
import org.springframework.boot.context.config.ConfigDataLocationRuntimeHints;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.ResourceHints;
import org.springframework.boot.env.PropertySourceLoader;

import java.lang.*;

import org.springframework.aot.hint.support.FilePatternResourceHintsRegistrar;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.aot.hint.*;
import org.springframework.boot.context.config.*;

import java.util.*;

import org.springframework.core.io.support.*;

import org.apache.commons.logging.LogFactory;

import org.springframework.aot.hint.support.FilePatternResourceHintsRegistrar;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.aot.hint.RuntimeHints;

import org.apache.commons.logging.Log;

import org.springframework.util.ResourceUtils;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.boot.env.PropertySourceLoader;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

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

public class ConfigDataLocationRuntimeHintsGetExtensionsEnhancedTest {

	private ClassLoader classLoader;

	private SpringFactoriesLoader springFactoriesLoader;

	private PropertySourceLoader propertySourceLoader;

	@BeforeEach
	public void setUp() {
		classLoader = Mockito.mock(ClassLoader.class);
		springFactoriesLoader = Mockito.mock(SpringFactoriesLoader.class);
		propertySourceLoader = Mockito.mock(PropertySourceLoader.class);
	}

	@AfterEach
	public void tearDown() {
		Mockito.reset(classLoader, springFactoriesLoader, propertySourceLoader);
	}

	@Test
	public void testGetExtensions() {
		// Given
		ConfigDataLocationRuntimeHints runtimeHints = new ConfigDataLocationRuntimeHints();
		when(springFactoriesLoader.load(PropertySourceLoader.class)).thenReturn(List.of(propertySourceLoader));
		when(propertySourceLoader.getFileExtensions()).thenReturn(new String[] { "properties", "yml" });
		//Mockito.mockStatic(SpringFactoriesLoader.class).when(() -> SpringFactoriesLoader.forDefaultResourceLocation(any(ClassLoader.class))).thenReturn(springFactoriesLoader);
		// When
		List<String> extensions = runtimeHints.getExtensions(classLoader);
		// Then
		List<String> expectedExtensions = new ArrayList<>();
		expectedExtensions.add(".properties");
		expectedExtensions.add(".yml");
		assertEquals(expectedExtensions, extensions);
	}
}
