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

public class BufferingApplicationStartupDrainBufferedTimelineEnhancedTest {

	private BufferingApplicationStartup bufferingApplicationStartup;

	private Clock clock;

	private Instant startTime;

	@BeforeEach
	public void setUp() {
		clock = Mockito.mock(Clock.class);
		startTime = Instant.now();
		Mockito.when(clock.instant()).thenReturn(startTime);
		bufferingApplicationStartup = new BufferingApplicationStartup(10, clock);
	}

	@AfterEach
	public void tearDown() {
		// Perform any necessary cleanup after tests
	}

	@Test
	public void testDrainBufferedTimelineWhenEmpty() {
		StartupTimeline timeline = bufferingApplicationStartup.drainBufferedTimeline();
		assertTrue(timeline.getEvents().isEmpty(), "Timeline should be empty when no events have been recorded.");
	}

	@Test
	public void testDrainBufferedTimelineWithEvents() {
		// Arrange
		AtomicInteger idSeq = new AtomicInteger();
		Predicate<StartupStep> filter = (step) -> true;
		AtomicInteger estimatedSize = new AtomicInteger();
		bufferingApplicationStartup.addFilter(filter);
		// Simulate adding events to the buffer
		for (int i = 0; i < 5; i++) {
			StartupStep step = Mockito.mock(StartupStep.class);
//			Mockito.when(step.getId()).thenReturn(idSeq.incrementAndGet());
//			Mockito.when(step.getStartTime()).thenReturn(startTime.plusSeconds(i));
			Mockito.when(step.getName()).thenReturn("step" + i);
			Mockito.when(step.getTags()).thenReturn(Mockito.mock(StartupStep.Tags.class));
//			TimelineEvent event = new TimelineEvent(step, startTime.plusSeconds(i + 1));
//			bufferingApplicationStartup.recordEvent(event);
		}
		// Act
		StartupTimeline timeline = bufferingApplicationStartup.drainBufferedTimeline();
		// Assert
		List<TimelineEvent> events = timeline.getEvents();
		assertEquals(5, events.size(), "Timeline should contain 5 events.");
		for (int i = 0; i < events.size(); i++) {
			TimelineEvent event = events.get(i);
			//assertEquals("step" + i, event.getStep().getName(), "Event name should match.");
			assertEquals(Duration.between(startTime.plusSeconds(i), startTime.plusSeconds(i + 1)), event.getDuration(), "Event duration should match.");
		}
	}

	// Helper method to simulate recording an event
	private void recordEvent(TimelineEvent event) {
		// Implementation details to simulate recording an event
	}
}
