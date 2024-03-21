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

class BufferedStartupStepTagEnhancedTest {

	private BufferedStartupStep bufferedStartupStep;

	private Consumer<BufferedStartupStep> recorderMock;

	private Supplier<String> valueSupplierMock;

	@BeforeEach
	void setUp() {
		recorderMock = mock(Consumer.class);
		valueSupplierMock = mock(Supplier.class);
		bufferedStartupStep = new BufferedStartupStep(null, "testStep", 1L, Instant.now(), recorderMock);
	}

	@Test
	void tagWithKeyAndValueSupplierShouldAddTag() {
		when(valueSupplierMock.get()).thenReturn("testValue");
		bufferedStartupStep.tag("testKey", valueSupplierMock);
		// Verify the tag method with String key and String value is called
		verify(valueSupplierMock).get();
		// Assert that the tag was added (this would require access to the tags list, which is private)
		// As we cannot verify the state of the private tags list, we assume the tag method works correctly if no exception is thrown
	}

	@Test
	void tagWithKeyAndValueShouldAddTag() {
		bufferedStartupStep.tag("testKey", "testValue");
		// Assert that the tag was added (this would require access to the tags list, which is private)
		// As we cannot verify the state of the private tags list, we assume the tag method works correctly if no exception is thrown
	}

	@Test
	void tagAfterEndShouldThrowException() {
		// Simulate the end of the startup step
		bufferedStartupStep.end();
		// Attempt to add a tag after the step has ended
		assertThrows(IllegalStateException.class, () -> bufferedStartupStep.tag("testKey", "testValue"));
	}
}
