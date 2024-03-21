package org.springframework.boot.context.config;

import org.springframework.boot.context.config.ConfigTreeConfigDataLoader;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.boot.context.config.ConfigTreeConfigDataLoader;
import org.springframework.boot.context.config.ConfigTreeConfigDataResource;
import org.springframework.boot.context.config.ConfigData;

import java.nio.file.Path;
import java.nio.file.*;

import org.springframework.boot.context.config.ConfigDataLoaderContext;
import org.springframework.boot.context.config.*;
import org.springframework.boot.env.ConfigTreePropertySource;

import java.nio.file.Path;

import org.springframework.boot.env.ConfigTreePropertySource.Option;

import java.io.IOException;
import java.util.Collections;

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

class ConfigTreeConfigDataLoaderLoadEnhancedTest {

	private ConfigTreeConfigDataLoader loader;

	private ConfigDataLoaderContext context;

	private ConfigTreeConfigDataResource resource;

	private Path path;

	@BeforeEach
	void setUp() {
		loader = new ConfigTreeConfigDataLoader();
		context = Mockito.mock(ConfigDataLoaderContext.class);
		resource = Mockito.mock(ConfigTreeConfigDataResource.class);
		path = Paths.get("/test/config/tree");
		Mockito.when(resource.getPath()).thenReturn(path);
	}

	@AfterEach
	void tearDown() {
		Mockito.verifyNoMoreInteractions(context, resource);
	}

	@Test
	void load_WhenPathExists_ShouldReturnConfigDataWithPropertySource() throws IOException {
		// Arrange
		Mockito.doNothing().when(ConfigTreeConfigDataResource.class);
		//ConfigTreeConfigDataResource.throwIfDoesNotExist(any(ConfigTreeConfigDataResource.class), any(Path.class));
		// Act
		ConfigData configData = loader.load(context, resource);
		// Assert
		assertNotNull(configData);
		assertEquals(1, configData.getPropertySources().size());
		assertTrue(configData.getPropertySources().get(0) instanceof ConfigTreePropertySource);
	}

	@Test
	void load_WhenPathDoesNotExist_ShouldThrowConfigDataResourceNotFoundException() {
		// Arrange
		Mockito.doThrow(new ConfigDataResourceNotFoundException(resource)).when(ConfigTreeConfigDataResource.class);
		//ConfigTreeConfigDataResource.throwIfDoesNotExist(any(ConfigTreeConfigDataResource.class), any(Path.class));
		// Act & Assert
		assertThrows(ConfigDataResourceNotFoundException.class, () -> loader.load(context, resource));
	}
}
