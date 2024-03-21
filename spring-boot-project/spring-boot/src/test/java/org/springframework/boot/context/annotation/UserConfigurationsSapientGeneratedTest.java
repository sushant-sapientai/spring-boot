package org.springframework.boot.context.annotation;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import org.mockito.stubbing.Answer;

import java.util.Collection;

import org.mockito.MockedStatic;

import java.util.ArrayList;
import java.util.Set;

import org.springframework.util.Assert;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.anySet;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UserConfigurationsSapientGeneratedTest {

	//Sapient generated method id: ${e876de3d-41c8-338f-8f90-1b71d6116f6e}, hash: 42A6B66E1D9522A5AD62D33F1D6307A2
	@Disabled()
	@Test()
	void merge2Test() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(anyCollection(), eq("Classes must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(anySet(), eq("Classes must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Collection<Class<?>> collection = new ArrayList<>();
			UserConfigurations target = new UserConfigurations(collection);
			Set<Class<?>> anySet = new HashSet<>();
			//Act Statement(s)
			UserConfigurations result = target.merge(anySet);
			//Assert statement(s)
			//TODO: Please implement equals method in UserConfigurations for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(anyCollection(), eq("Classes must not be null")));
				_assert.verify(() -> Assert.notNull(anySet(), eq("Classes must not be null")));
			});
		}
	}

	//Sapient generated method id: ${3155f475-158f-3510-8516-db6562387204}, hash: 46AAC45E7CBA00F5BA9523A40C168E24
	@Test()
	void ofTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull(anyList(), eq("Classes must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			Class<?>[] classArray = new Class[] {};
			//Act Statement(s)
			UserConfigurations result = UserConfigurations.of(classArray);
			//Assert statement(s)
			//TODO: Please implement equals method in UserConfigurations for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull(anyList(), eq("Classes must not be null")));
			});
		}
	}
}
