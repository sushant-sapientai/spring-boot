package org.springframework.boot.context.metrics.buffering;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.metrics.StartupStep;

import java.time.Clock;
import java.time.Instant;
import java.util.function.Predicate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BufferingApplicationStartupSapientGeneratedTest {

	private final Clock clockMock = mock(Clock.class, "clock");

	//Sapient generated method id: ${1cece066-52ae-3fda-9b18-8c9a43d889bb}, hash: 7DD4793AE719D39EEE004EF6C4ECA599
	@Test()
	void startRecordingTest() {
		//Arrange Statement(s)
		Instant instant = Instant.ofEpochSecond(1700000000);
		BufferingApplicationStartup target = new BufferingApplicationStartup(0, clockMock);
		Instant instant2 = Instant.ofEpochSecond(1700000000);
		doReturn(instant, instant2).when(clockMock).instant();
		//Act Statement(s)
		target.startRecording();
		//Assert statement(s)
		assertAll("result", () -> verify(clockMock, times(2)).instant());
	}

	//Sapient generated method id: ${afd847a1-cb6d-38f3-acdc-6d34e0a12e24}, hash: 5731DB6F27BC3463002567ABC685DBE1
	@Test()
	void addFilterTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Instant instant = Instant.ofEpochSecond(1700000000);
		doReturn(instant).when(clockMock).instant();
		BufferingApplicationStartup target = new BufferingApplicationStartup(0, clockMock);
		Predicate predicateMock = mock(Predicate.class);
		//Act Statement(s)
		target.addFilter(predicateMock);
		//Assert statement(s)
		assertAll("result", () -> verify(clockMock).instant());
	}

	//Sapient generated method id: ${4c4ffefb-2c2d-34b9-8503-4a8a3903023d}, hash: ABFD00CD6CE1C1B1E65D6A1980752BD7
	@Test()
	void startWhenThisCurrentCompareAndSetCurrentNext() {
		/* Branches:
		 * (step != null) : false  #  inside getLatestActive method
		 * (this.current.compareAndSet(current, next)) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: current
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Instant instant = Instant.ofEpochSecond(1700000000);
		BufferingApplicationStartup target = new BufferingApplicationStartup(0, clockMock);
		Instant instant2 = Instant.ofEpochSecond(1700000000);
		doReturn(instant, instant2).when(clockMock).instant();
		//Act Statement(s)
		StartupStep result = target.start("name1");
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(clockMock, times(2)).instant();
		});
	}

	//Sapient generated method id: ${53591950-228d-396d-85fa-4b838e47f089}, hash: 8A9B68718A850A610DB246788B5C1402
	@Test()
	void startWhenThisCurrentNotCompareAndSetCurrentNext() {
		/* Branches:
		 * (step != null) : false  #  inside getLatestActive method
		 * (this.current.compareAndSet(current, next)) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: current
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Instant instant = Instant.ofEpochSecond(1700000000);
		BufferingApplicationStartup target = new BufferingApplicationStartup(0, clockMock);
		Instant instant2 = Instant.ofEpochSecond(1700000000);
		doReturn(instant, instant2).when(clockMock).instant();
		//Act Statement(s)
		StartupStep result = target.start("name1");
		//Assert statement(s)
		assertAll("result", () -> verify(clockMock, times(2)).instant());
	}

	//Sapient generated method id: ${ecf4868e-c128-31d9-8678-11f99f17d770}, hash: EA8FCCC1CDA8F5C456791CACC19B36EA
	@Test()
	void getBufferedTimelineTest() {
		//Arrange Statement(s)
		Instant instant = Instant.ofEpochSecond(1700000000);
		doReturn(instant).when(clockMock).instant();
		BufferingApplicationStartup target = new BufferingApplicationStartup(0, clockMock);
		//Act Statement(s)
		StartupTimeline result = target.getBufferedTimeline();
		//Assert statement(s)
		//TODO: Please implement equals method in StartupTimeline for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(clockMock).instant();
		});
	}

	//Sapient generated method id: ${fbe41aa6-d048-301d-a7ef-5da40d7b1da8}, hash: 20C368AF161DE141749C38D7C350A74B
	@Test()
	void drainBufferedTimelineWhenIteratorNotHasNext() {
		/* Branches:
		 * (iterator.hasNext()) : false
		 */
		//Arrange Statement(s)
		Instant instant = Instant.ofEpochSecond(1700000000);
		doReturn(instant).when(clockMock).instant();
		BufferingApplicationStartup target = new BufferingApplicationStartup(0, clockMock);
		//Act Statement(s)
		StartupTimeline result = target.drainBufferedTimeline();
		//Assert statement(s)
		//TODO: Please implement equals method in StartupTimeline for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(clockMock).instant();
		});
	}
}
