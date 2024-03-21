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

public class BufferingApplicationStartupAddFilterEnhancedTest {

	private BufferingApplicationStartup bufferingApplicationStartup;

	private Clock clock;

	@BeforeEach
	public void setUp() {
		clock = Mockito.mock(Clock.class);
		Mockito.when(clock.instant()).thenReturn(Instant.now());
		bufferingApplicationStartup = new BufferingApplicationStartup(10, clock);
	}

	@AfterEach
	public void tearDown() {
		// Any necessary teardown can be done here
	}

	@Test
	public void addFilter_ShouldCombineFilters_WhenCalledWithNewFilter() {
		// Arrange
		Predicate<StartupStep> initialFilter = Mockito.mock(Predicate.class);
		Predicate<StartupStep> additionalFilter = Mockito.mock(Predicate.class);
		StartupStep startupStep = Mockito.mock(StartupStep.class);
		Mockito.when(initialFilter.test(any())).thenReturn(true);
		Mockito.when(additionalFilter.test(any())).thenReturn(true);
		bufferingApplicationStartup.addFilter(initialFilter);
		// Act
		bufferingApplicationStartup.addFilter(additionalFilter);
		// Assert
		verify(initialFilter, times(1)).test(startupStep);
		verify(additionalFilter, times(1)).test(startupStep);
	}

	@Test
	public void addFilter_ShouldNotRecordStep_WhenFilterDoesNotMatch() {
		// Arrange
		Predicate<StartupStep> filter = Mockito.mock(Predicate.class);
		StartupStep startupStep = Mockito.mock(StartupStep.class);
		Mockito.when(filter.test(any())).thenReturn(false);
		// Act
		bufferingApplicationStartup.addFilter(filter);
		// Assert
		verify(filter, never()).test(startupStep);
	}

	@Test
	public void addFilter_ShouldRecordStep_WhenFilterMatches() {
		// Arrange
		Predicate<StartupStep> filter = Mockito.mock(Predicate.class);
		StartupStep startupStep = Mockito.mock(StartupStep.class);
		Mockito.when(filter.test(any())).thenReturn(true);
		// Act
		bufferingApplicationStartup.addFilter(filter);
		// Assert
		verify(filter, times(1)).test(startupStep);
	}
}
