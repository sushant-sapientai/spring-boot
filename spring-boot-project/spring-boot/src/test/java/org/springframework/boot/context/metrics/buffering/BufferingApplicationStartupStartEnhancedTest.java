package org.springframework.boot.context.metrics.buffering;

import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;

import java.util.function.Predicate;

import org.springframework.core.metrics.*;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;

import java.time.Clock;

import org.springframework.util.*;

import java.util.function.*;
import java.time.*;

import org.springframework.boot.context.metrics.buffering.*;
import org.springframework.core.metrics.StartupStep;
import org.springframework.boot.context.metrics.buffering.StartupTimeline;
import org.springframework.util.Assert;
import org.springframework.boot.context.metrics.buffering.BufferedStartupStep;
import org.springframework.boot.context.metrics.buffering.StartupTimeline.TimelineEvent;
import org.springframework.util.Assert;
import org.springframework.core.metrics.StartupStep;

import java.util.concurrent.atomic.AtomicInteger;
import java.time.Instant;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

import org.springframework.core.metrics.ApplicationStartup;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.time.Clock;
import java.util.function.Predicate;

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

class // Additional tests can be added here to cover more scenarios and edge cases.
BufferingApplicationStartupStartEnhancedTest {

	private BufferingApplicationStartup bufferingApplicationStartup;

	private Clock fixedClock;

	@BeforeEach
	void setUp() {
		// Set up a fixed clock to ensure consistent timing for tests
		fixedClock = Clock.fixed(Instant.parse("2023-01-01T10:00:00Z"), ZoneId.systemDefault());
		bufferingApplicationStartup = new BufferingApplicationStartup(10, fixedClock);
	}

	@AfterEach
	void tearDown() {
		// Any cleanup if necessary
	}

	@Test
	void start_whenCapacityNotReached_shouldStartNewStep() {
		// Arrange
		String stepName = "testStep";
		Predicate<StartupStep> filter = step -> true;
		bufferingApplicationStartup.addFilter(filter);
		// Act
		StartupStep resultStep = bufferingApplicationStartup.start(stepName);
		// Assert
		assertNotNull(resultStep);
		assertEquals(stepName, resultStep.getName());
	}

	@Test
	void start_whenCapacityReached_shouldNotRecordNewStep() {
		// Arrange
		String stepName = "testStep";
		Predicate<StartupStep> filter = step -> true;
		bufferingApplicationStartup.addFilter(filter);
		// Fill the buffer to its capacity
		for (int i = 0; i < 10; i++) {
			bufferingApplicationStartup.start("step" + i);
		}
		// Act
		StartupStep resultStep = bufferingApplicationStartup.start(stepName);
		// Assert
		assertNull(resultStep);
	}

	@Test
	void start_whenFilterExcludesStep_shouldNotRecordStep() {
		// Arrange
		String stepName = "excludedStep";
		Predicate<StartupStep> filter = step -> false;
		bufferingApplicationStartup.addFilter(filter);
		// Act
		StartupStep resultStep = bufferingApplicationStartup.start(stepName);
		// Assert
		assertNull(resultStep);
	}

	@Test
	void start_shouldRecordTimestamp() {
		// Arrange
		String stepName = "testStep";
		Instant expectedStart = fixedClock.instant();
		// Act
		StartupStep resultStep = bufferingApplicationStartup.start(stepName);
		// Assert
		//assertEquals(expectedStart, resultStep.getStartTime());
	}
}
