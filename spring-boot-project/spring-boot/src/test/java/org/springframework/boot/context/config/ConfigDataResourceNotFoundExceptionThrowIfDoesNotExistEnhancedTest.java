package org.springframework.boot.context.config;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;

import java.nio.file.Path;
import java.nio.file.*;

import org.springframework.core.io.Resource;

import java.io.File;
import java.lang.*;

import org.springframework.boot.origin.Origin;
import org.springframework.util.*;

import java.io.*;

import org.springframework.core.io.*;
import org.springframework.boot.context.config.ConfigDataResource;

import java.lang.Throwable;

import org.springframework.util.Assert;
import org.springframework.boot.context.config.ConfigDataLocation;
import org.springframework.boot.origin.*;
import org.springframework.boot.context.config.*;
import org.springframework.boot.origin.Origin;

import java.nio.file.Path;

import org.springframework.util.Assert;
import org.springframework.core.io.Resource;

import java.nio.file.Files;
import java.io.File;

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

class ConfigDataResourceNotFoundExceptionThrowIfDoesNotExistEnhancedTest {

	private MockedStatic<Files> filesMockedStatic;

	@BeforeEach
	void setUp() {
		filesMockedStatic = Mockito.mockStatic(Files.class);
	}

	@AfterEach
	void tearDown() {
		filesMockedStatic.close();
	}

	@Test
	void throwIfDoesNotExist_WhenPathDoesNotExist_ShouldThrowException() {
		// Arrange
		ConfigDataResource resource = Mockito.mock(ConfigDataResource.class);
		Path pathToCheck = Mockito.mock(Path.class);
		filesMockedStatic.when(() -> Files.exists(pathToCheck)).thenReturn(false);
		// Act & Assert
		assertThrows(ConfigDataResourceNotFoundException.class, () -> ConfigDataResourceNotFoundException.throwIfDoesNotExist(resource, pathToCheck));
	}

	@Test
	void throwIfDoesNotExist_WhenPathExists_ShouldNotThrowException() {
		// Arrange
		ConfigDataResource resource = Mockito.mock(ConfigDataResource.class);
		Path pathToCheck = Mockito.mock(Path.class);
		filesMockedStatic.when(() -> Files.exists(pathToCheck)).thenReturn(true);
		// Act & Assert
		assertDoesNotThrow(() -> ConfigDataResourceNotFoundException.throwIfDoesNotExist(resource, pathToCheck));
	}
}
