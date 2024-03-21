package org.springframework.boot.context.metrics.buffering;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.metrics.StartupStep;

import java.util.function.Supplier;
import java.util.function.Consumer;
import java.time.Instant;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BufferedStartupStepSapientGeneratedTest {

	private final BufferedStartupStep parentMock = mock(BufferedStartupStep.class, "parent");

	private final Consumer consumerMock = mock(Consumer.class);

	//Sapient generated method id: ${5fdfba7e-6b5c-369a-b59f-2fcad9fad4db}, hash: 2C7B80A2BF3478F40E546E1528337F7D
	@Test()
	void getParentIdWhenThisParentIsNotNull() {
		/* Branches:
		 * (this.parent != null) : true
		 */
		//Arrange Statement(s)
		Instant instant = Instant.ofEpochSecond(1700000000);
		BufferedStartupStep target = new BufferedStartupStep(parentMock, "name1", 0L, instant, consumerMock);
		doReturn(1L).when(parentMock).getId();

		//Act Statement(s)
		Long result = target.getParentId();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(1L));
			verify(parentMock).getId();
		});
	}

	//Sapient generated method id: ${95008174-021a-3024-a11b-30baf1e3002b}, hash: 6302C8CDF7A397997F273B94595520A2
	@Test()
	void getParentIdWhenThisParentIsNull() {
		/* Branches:
		 * (this.parent != null) : false
		 */
		//Arrange Statement(s)
		Instant instant = Instant.ofEpochSecond(1700000000);
		BufferedStartupStep target = new BufferedStartupStep((BufferedStartupStep) null, "name1", 0L, instant, consumerMock);

		//Act Statement(s)
		Long result = target.getParentId();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${59fc8b6d-9cf4-385e-b4d4-3f0361c77781}, hash: 22560AF74AA2A4989A19E2933C570452
	@Test()
	void getTagsTest() {
		//Arrange Statement(s)
		Instant instant = Instant.ofEpochSecond(1700000000);
		BufferedStartupStep target = new BufferedStartupStep(parentMock, "name1", 0L, instant, consumerMock);

		//Act Statement(s)
		StartupStep.Tags result = target.getTags();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${1492b9c2-b980-3a4a-9204-051aa921c1c9}, hash: 6F0FDC6A238E5926E095C390BD7CB7F2
	@Test()
	void tagTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Instant instant = Instant.ofEpochSecond(1700000000);
		BufferedStartupStep target = spy(new BufferedStartupStep(parentMock, "name1", 0L, instant, consumerMock));
		StartupStep startupStepMock = mock(StartupStep.class);
		doReturn(startupStepMock).when(target).tag("key1", "value1");
		Supplier supplierMock = mock(Supplier.class);

		//Act Statement(s)
		StartupStep result = target.tag("key1", supplierMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(startupStepMock));
			verify(target).tag("key1", "value1");
		});
	}

	//Sapient generated method id: ${9c1d60d2-3642-35ae-8a13-dd374591872a}, hash: 2B051E5E51B143C38F38B93E2B3AF341
	@Test()
	void tag1WhenThisEndedNotGet() {
		/* Branches:
		 * (!this.ended.get()) : true
		 */
		//Arrange Statement(s)
		Instant instant = Instant.ofEpochSecond(1700000000);
		BufferedStartupStep target = new BufferedStartupStep(parentMock, "name1", 0L, instant, consumerMock);

		//Act Statement(s)
		StartupStep result = target.tag("key1", "value1");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(target)));
	}

	//Sapient generated method id: ${ad1c9377-0a10-3767-87a5-3115a50be4cd}, hash: E5DB0D469F7CF8D713CFA45E6FD31305
	@Test()
	void endTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Instant instant = Instant.ofEpochSecond(1700000000);
		BufferedStartupStep target = new BufferedStartupStep(parentMock, "name1", 0L, instant, consumerMock);

		//Act Statement(s)
		target.end();
	}

	//Sapient generated method id: ${6120f7f7-3b69-3400-9ac0-126d5ae7bc19}, hash: 3E3736E1AB5CDEDE274E07C15CA6D456
	@Test()
	void isEndedTest() {
		//Arrange Statement(s)
		Instant instant = Instant.ofEpochSecond(1700000000);
		BufferedStartupStep target = new BufferedStartupStep(parentMock, "name1", 0L, instant, consumerMock);

		//Act Statement(s)
		boolean result = target.isEnded();

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}
}
