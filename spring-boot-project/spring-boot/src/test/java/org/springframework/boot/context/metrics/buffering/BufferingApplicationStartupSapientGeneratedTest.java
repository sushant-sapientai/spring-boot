package org.springframework.boot.context.metrics.buffering;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.metrics.StartupStep;

import java.time.Clock;

import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import org.springframework.util.Assert;

import java.util.function.Predicate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BufferingApplicationStartupSapientGeneratedTest {

	//Sapient generated method id: ${1cece066-52ae-3fda-9b18-8c9a43d889bb}, hash: 55403DA8101A6A8266056B14A97128C9
	@Test()
	void startRecordingTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.time.Clock::instant has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.state(true, "Cannot restart recording once steps have been buffered.")).thenAnswer((Answer<Void>) invocation -> null);
			Clock clock = Clock.systemUTC();
			BufferingApplicationStartup target = new BufferingApplicationStartup(0, clock);
			//Act Statement(s)
			target.startRecording();
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.state(true, "Cannot restart recording once steps have been buffered."), atLeast(1)));
		}
	}

	//Sapient generated method id: ${afd847a1-cb6d-38f3-acdc-6d34e0a12e24}, hash: 1C2681FF08C86506F44825B7006A619A
	@Test()
	void addFilterTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.time.Clock::instant has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Clock clock = Clock.systemUTC();
		BufferingApplicationStartup target = new BufferingApplicationStartup(0, clock);
		Predicate predicateMock = mock(Predicate.class);
		//Act Statement(s)
		target.addFilter(predicateMock);
	}

	//Sapient generated method id: ${4c4ffefb-2c2d-34b9-8503-4a8a3903023d}, hash: D2523CFE3EE5560C0F4C1E5A9471035B
	@Test()
	void startWhenThisCurrentCompareAndSetCurrentNext() {
		/* Branches:
		 * (step != null) : false  #  inside getLatestActive method
		 * (this.current.compareAndSet(current, next)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.time.Clock::instant has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Clock clock = Clock.systemUTC();
		BufferingApplicationStartup target = new BufferingApplicationStartup(0, clock);
		//Act Statement(s)
		StartupStep result = target.start("name1");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${ecf4868e-c128-31d9-8678-11f99f17d770}, hash: A70EAD289C7C169C82469BB73E1E3A90
	@Test()
	void getBufferedTimelineTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.time.Clock::instant has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Clock clock = Clock.systemUTC();
		BufferingApplicationStartup target = new BufferingApplicationStartup(0, clock);
		//Act Statement(s)
		StartupTimeline result = target.getBufferedTimeline();
		//Assert statement(s)
		//TODO: Please implement equals method in StartupTimeline for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${fbe41aa6-d048-301d-a7ef-5da40d7b1da8}, hash: AABCC7D99E45895A065B8636A5D476F9
	@Test()
	void drainBufferedTimelineWhenIteratorNotHasNext() {
		/* Branches:
		 * (iterator.hasNext()) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.time.Clock::instant has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Clock clock = Clock.systemUTC();
		BufferingApplicationStartup target = new BufferingApplicationStartup(0, clock);
		//Act Statement(s)
		StartupTimeline result = target.drainBufferedTimeline();
		//Assert statement(s)
		//TODO: Please implement equals method in StartupTimeline for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${53591950-228d-396d-85fa-4b838e47f089}, hash: D36AA7AFEF81750F04C64B3E76839677
	@Test()
	void startWhenThisCurrentNotCompareAndSetCurrentNext() {
		/* Branches:
		 * (step != null) : false  #  inside getLatestActive method
		 * (this.current.compareAndSet(current, next)) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Method java.time.Clock::instant has a unrepeatable behavior
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Clock clock = Clock.systemUTC();
		BufferingApplicationStartup target = new BufferingApplicationStartup(0, clock);
		//Act Statement(s)
		StartupStep result = target.start("name1");
	}
}
