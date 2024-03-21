package org.springframework.boot.context.config;

import org.springframework.boot.context.config.StandardConfigDataResource;

import org.springframework.boot.context.config.StandardConfigDataReference;
import org.springframework.core.io.Resource;

import java.io.File;

import org.springframework.core.io.FileUrlResource;

import java.lang.*;

import org.springframework.util.*;
import org.springframework.core.io.*;

import java.io.*;

import org.springframework.boot.context.config.StandardConfigDataResource;
import org.springframework.util.Assert;
import org.springframework.core.io.FileSystemResource;

import java.lang.Object;

import org.springframework.boot.context.config.*;
import org.springframework.util.Assert;
import org.springframework.core.io.Resource;
import org.springframework.core.io.FileSystemResource;

import java.io.IOException;

import org.springframework.core.io.FileUrlResource;

import java.io.File;

import org.springframework.core.io.ClassPathResource;

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

public class StandardConfigDataResourceToStringEnhancedTest {

	private StandardConfigDataReference reference;

	private Resource resource;

	private StandardConfigDataResource standardConfigDataResource;

	@BeforeEach
	public void setUp() {
		reference = Mockito.mock(StandardConfigDataReference.class);
		resource = Mockito.mock(Resource.class);
		standardConfigDataResource = new StandardConfigDataResource(reference, resource);
	}

	@AfterEach
	public void tearDown() {
		// Clean up after each test if necessary
	}

	@Test
	public void toString_WhenResourceIsFileSystemResource_ShouldReturnFilePath() throws IOException {
		FileSystemResource fileSystemResource = Mockito.mock(FileSystemResource.class);
		File file = new File("/path/to/resource");
		when(fileSystemResource.getFile()).thenReturn(file);
		standardConfigDataResource = new StandardConfigDataResource(reference, fileSystemResource);
		String result = standardConfigDataResource.toString();
		assertEquals("file [" + file.getPath() + "]", result);
	}

	@Test
	public void toString_WhenResourceIsFileUrlResource_ShouldReturnFilePath() throws IOException {
		FileUrlResource fileUrlResource = Mockito.mock(FileUrlResource.class);
		File file = new File("/path/to/resource");
		when(fileUrlResource.getFile()).thenReturn(file);
		standardConfigDataResource = new StandardConfigDataResource(reference, fileUrlResource);
		String result = standardConfigDataResource.toString();
		assertEquals("file [" + file.getPath() + "]", result);
	}

	@Test
	public void toString_WhenResourceIsNotFileResource_ShouldReturnResourceToString() {
		String resourceString = "nonFileResource";
		when(resource.toString()).thenReturn(resourceString);
		String result = standardConfigDataResource.toString();
		assertEquals(resourceString, result);
	}

	@Test
	public void toString_WhenResourceIsFileResourceButIOExceptionOccurs_ShouldReturnResourceToString() throws IOException {
		FileSystemResource fileSystemResource = Mockito.mock(FileSystemResource.class);
		when(fileSystemResource.getFile()).thenThrow(new IOException());
		standardConfigDataResource = new StandardConfigDataResource(reference, fileSystemResource);
		when(fileSystemResource.toString()).thenReturn("fileSystemResource");
		String result = standardConfigDataResource.toString();
		assertEquals("fileSystemResource", result);
	}
}
