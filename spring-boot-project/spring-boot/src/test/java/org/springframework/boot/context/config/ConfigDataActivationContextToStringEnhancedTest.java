package org.springframework.boot.context.config;

import org.springframework.boot.context.config.ConfigDataActivationContext;

import org.springframework.core.style.*;
import org.springframework.boot.context.config.ConfigDataActivationContext;
import org.springframework.core.style.ToStringCreator;
import org.springframework.boot.context.config.Profiles;
import org.springframework.boot.cloud.CloudPlatform;
import org.springframework.boot.cloud.*;
import org.springframework.boot.context.config.*;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.boot.cloud.CloudPlatform;
import org.springframework.core.style.ToStringCreator;
import org.springframework.core.env.Environment;

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

public class ConfigDataActivationContextToStringEnhancedTest {

	private Environment environment;

	private Binder binder;

	private CloudPlatform cloudPlatform;

	private Profiles profiles;

	@BeforeEach
	public void setUp() {
		environment = Mockito.mock(Environment.class);
		binder = Mockito.mock(Binder.class);
		cloudPlatform = Mockito.mock(CloudPlatform.class);
		profiles = Mockito.mock(Profiles.class);
	}

	@AfterEach
	public void tearDown() {
		// Clean up after tests if necessary
	}

	@Test
	public void testToStringWithNoProfiles() {
		ConfigDataActivationContext context = new ConfigDataActivationContext(environment, binder);
		String expected = "ConfigDataActivationContext[cloudPlatform=" + cloudPlatform + ", profiles=null]";
		assertEquals(expected, context.toString());
	}

	@Test
	public void testToStringWithProfiles() {
		ConfigDataActivationContext context = new ConfigDataActivationContext(cloudPlatform, profiles);
		String expected = "ConfigDataActivationContext[cloudPlatform=" + cloudPlatform + ", profiles=" + profiles + "]";
		assertEquals(expected, context.toString());
	}

	@Test
	public void testToStringAfterWithProfiles() {
		ConfigDataActivationContext context = new ConfigDataActivationContext(environment, binder).withProfiles(profiles);
		String expected = "ConfigDataActivationContext[cloudPlatform=" + cloudPlatform + ", profiles=" + profiles + "]";
		assertEquals(expected, context.toString());
	}
}
