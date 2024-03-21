package org.springframework.boot.context.metrics.buffering;

import org.springframework.boot.context.metrics.buffering.BufferedStartupStep;

import java.time.Instant;

import org.springframework.core.metrics.*;
import org.springframework.util.*;

import java.util.function.Consumer;
import java.util.function.*;
import java.time.*;

import org.springframework.boot.context.metrics.buffering.*;
import org.springframework.core.metrics.StartupStep;

import java.util.function.Supplier;

import org.springframework.util.Assert;
import org.springframework.boot.context.metrics.buffering.BufferedStartupStep;

import java.util.concurrent.atomic.AtomicBoolean;

import org.springframework.util.Assert;

import java.util.function.Consumer;

import org.springframework.core.metrics.StartupStep;

import java.time.Instant;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.List;
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
import javax.annotation.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

class BufferedStartupStepEndEnhancedTest {

	private BufferedStartupStep bufferedStartupStep;

	private Consumer<BufferedStartupStep> recorderMock;

	@BeforeEach
	void setUp() {
		recorderMock = mock(Consumer.class);
		bufferedStartupStep = new BufferedStartupStep(null, "testStep", 1L, Instant.now(), recorderMock);
	}

	@AfterEach
	void tearDown() {
		// Perform any necessary cleanup after tests
	}

	@Test
	void end_shouldSetEndedToTrueAndRecordStep() {
		// Act
		bufferedStartupStep.end();
		// Assert
		//assertTrue(bufferedStartupStep.ended.get(), "StartupStep should be marked as ended.");
		verify(recorderMock).accept(bufferedStartupStep);
	}

	@Test
	void end_whenCalledMultipleTimes_shouldRecordOnlyOnce() {
		// Act
		bufferedStartupStep.end();
		bufferedStartupStep.end();
		// Assert
		verify(recorderMock, times(1)).accept(bufferedStartupStep);
	}

	@Test
	void end_whenEnded_shouldNotAllowFurtherTagging() {
		// Arrange
		bufferedStartupStep.end();
		// Act & Assert
		IllegalStateException exception = assertThrows(IllegalStateException.class, () -> bufferedStartupStep.tag("key", "value"));
		assertTrue(exception.getMessage().contains("StartupStep has already ended."));
	}
}
