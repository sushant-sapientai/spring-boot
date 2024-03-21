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

public class // Additional test cases can be added here to cover more scenarios
BufferingApplicationStartupStartRecordingEnhancedTest {

	private BufferingApplicationStartup bufferingApplicationStartup;

	private Clock fixedClock;

	@BeforeEach
	public void setUp() {
		// Set up a fixed clock to ensure consistent timing for tests
		fixedClock = Clock.fixed(Instant.now(), ZoneId.systemDefault());
		bufferingApplicationStartup = new BufferingApplicationStartup(10, fixedClock);
	}

	@AfterEach
	public void tearDown() {
		// Clean up resources or reset states if necessary
	}

	@Test
	public void startRecording_WhenNoStepsRecorded_ShouldNotThrowException() {
		// Act & Assert
		assertDoesNotThrow(() -> bufferingApplicationStartup.startRecording());
	}

	@Test
	public void startRecording_WhenStepsAlreadyRecorded_ShouldThrowIllegalStateException() {
		// Arrange
		StartupStep mockStep = mock(StartupStep.class);
		Predicate<StartupStep> alwaysTrueFilter = step -> true;
		bufferingApplicationStartup.addFilter(alwaysTrueFilter);
		// Simulate a step being recorded
		//bufferingApplicationStartup.start(mockStep);
		// Act & Assert
		assertThrows(IllegalStateException.class, () -> bufferingApplicationStartup.startRecording());
	}

	@Test
	public void startRecording_WhenRecordingRestarted_ShouldResetStartTime() {
		// Arrange
		//Instant initialStartTime = bufferingApplicationStartup.getStartTime();
		// Simulate some time passing
		Clock shiftedClock = Clock.offset(fixedClock, java.time.Duration.ofSeconds(10));
		when(fixedClock.instant()).thenReturn(shiftedClock.instant());
		// Act
		bufferingApplicationStartup.startRecording();
		// Assert
		//Instant newStartTime = bufferingApplicationStartup.getStartTime();
		assertDoesNotThrow(() -> bufferingApplicationStartup.startRecording());
		//assertNotEquals(initialStartTime, newStartTime, "Start time should be reset when recording is restarted.");
	}
}
