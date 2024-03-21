package org.springframework.boot.context.config;

import org.springframework.boot.context.config.ConfigDataLocation;

import java.lang.*;

import org.springframework.boot.origin.Origin;
import org.springframework.util.*;
import org.springframework.util.StringUtils;
import org.springframework.boot.context.config.ConfigDataLocation;

import java.lang.Object;

import org.springframework.boot.origin.*;
import org.springframework.boot.context.config.*;
import org.springframework.boot.origin.Origin;
import org.springframework.util.StringUtils;
import org.springframework.boot.origin.OriginProvider;

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

class ConfigDataLocationSplitEnhancedTest {

	private ConfigDataLocation configDataLocation;

	private Origin mockOrigin;

	@BeforeEach
	void setUp() {
		mockOrigin = mock(Origin.class);
		configDataLocation = ConfigDataLocation.of("test:location").withOrigin(mockOrigin);
	}

	@AfterEach
	void tearDown() {
		// Clean up after tests if necessary
	}

	@Test
	void split_WithValidDelimiter_ShouldReturnSplitLocations() {
		// Given
		String delimiter = ":";
		when(mockOrigin.toString()).thenReturn("origin-string");
		// When
		ConfigDataLocation[] splitLocations = configDataLocation.split(delimiter);
		// Then
		assertNotNull(splitLocations);
		assertEquals(2, splitLocations.length);
		assertEquals("test", splitLocations[0].toString());
		assertEquals("location", splitLocations[1].toString());
		assertEquals(mockOrigin, splitLocations[0].getOrigin());
		assertEquals(mockOrigin, splitLocations[1].getOrigin());
	}

	@Test
	void split_WithInvalidDelimiter_ShouldReturnWholeLocation() {
		// Given
		String delimiter = ",";
		when(mockOrigin.toString()).thenReturn("origin-string");
		// When
		ConfigDataLocation[] splitLocations = configDataLocation.split(delimiter);
		// Then
		assertNotNull(splitLocations);
		assertEquals(1, splitLocations.length);
		assertEquals("test:location", splitLocations[0].toString());
		assertEquals(mockOrigin, splitLocations[0].getOrigin());
	}

	@Test
	void split_WithEmptyDelimiter_ShouldThrowException() {
		// Given
		String delimiter = "";
		// When & Then
		assertThrows(IllegalArgumentException.class, () -> configDataLocation.split(delimiter));
	}

	@Test
	void split_WithNullDelimiter_ShouldThrowException() {
		// Given
		String delimiter = null;
		// When & Then
		assertThrows(IllegalArgumentException.class, () -> configDataLocation.split(delimiter));
	}

	@Test
	void split_WithOptionalLocation_ShouldHandleOptionalPrefix() {
		// Given
		configDataLocation = ConfigDataLocation.of("optional:test:location").withOrigin(mockOrigin);
		String delimiter = ":";
		// When
		ConfigDataLocation[] splitLocations = configDataLocation.split(delimiter);
		// Then
		assertNotNull(splitLocations);
		assertEquals(3, splitLocations.length);
		assertTrue(splitLocations[0].isOptional());
		assertEquals("test", splitLocations[1].toString());
		assertEquals("location", splitLocations[2].toString());
		assertEquals(mockOrigin, splitLocations[0].getOrigin());
		assertEquals(mockOrigin, splitLocations[1].getOrigin());
		assertEquals(mockOrigin, splitLocations[2].getOrigin());
	}
}
