package org.springframework.boot.context;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;

import java.io.File;

import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.util.Assert;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ApplicationPidFileWriterSapientGeneratedTest {

	private final SpringApplicationEvent springApplicationEventMock = mock(SpringApplicationEvent.class);

	//Sapient generated method id: ${5ff1d027-0f41-3e3a-800d-d1703f753974}, hash: E6F17A53CD94C39BDFC3194C15D95879
	@Test()
	void setTriggerEventTypeTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((File) any(), eq("File must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(SpringApplicationEvent.class, "Trigger event type must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ApplicationPidFileWriter target = new ApplicationPidFileWriter("filename1");
			//Act Statement(s)
			target.setTriggerEventType(SpringApplicationEvent.class);
			//Assert statement(s)
			assertAll("result", () -> {
				_assert.verify(() -> Assert.notNull((File) any(), eq("File must not be null")));
				_assert.verify(() -> Assert.notNull(SpringApplicationEvent.class, "Trigger event type must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${5e7879e8-3f8f-34af-8d3b-4a0b41de4bc6}, hash: 3468E4012D0B61A0DD6CD5F9EEAA8A50
	@Test()
	void onApplicationEventWhenOverrideIsNotNull() throws Exception {
		/* Branches:
		 * (this.triggerEventType.isInstance(event)) : true
		 * (created.compareAndSet(false, true)) : true
		 * (for-each(candidates)) : true  #  inside getProperty method
		 * (value != null) : true  #  inside getProperty method
		 * (override != null) : true  #  inside writePidFile method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((File) any(), eq("File must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			ApplicationPidFileWriter target = new ApplicationPidFileWriter("filename1");
			//Act Statement(s)
			target.onApplicationEvent(springApplicationEventMock);
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.notNull((File) any(), eq("File must not be null"))));
		}
	}

	//Sapient generated method id: ${62c4eb21-8829-3c9f-a880-556ff00b2926}, hash: 5A4F66A27D3F200657A16A7239B1D7C7
	@Test()
	void onApplicationEventWhenOverrideIsNull() throws Exception {
		/* Branches:
		 * (this.triggerEventType.isInstance(event)) : true
		 * (created.compareAndSet(false, true)) : true
		 * (for-each(candidates)) : true  #  inside getProperty method
		 * (value != null) : false  #  inside getProperty method
		 * (override != null) : false  #  inside writePidFile method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((File) any(), eq("File must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			ApplicationPidFileWriter target = new ApplicationPidFileWriter("filename1");
			//Act Statement(s)
			target.onApplicationEvent(springApplicationEventMock);
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.notNull((File) any(), eq("File must not be null"))));
		}
	}

	//Sapient generated method id: ${2e6bfade-6826-3482-8fe9-e3368cba5c83}, hash: 335A984F60C976FFF74823372D920924
	@Disabled()
	@Test()
	void onApplicationEventWhenFailOnWriteErrorEventThrowsIllegalStateException() throws IOException {
		/* Branches:
		 * (this.triggerEventType.isInstance(event)) : true
		 * (created.compareAndSet(false, true)) : true
		 * (for-each(candidates)) : true  #  inside getProperty method
		 * (value != null) : false  #  inside getProperty method
		 * (override != null) : false  #  inside writePidFile method
		 * (catch-exception (Exception)) : true
		 * (Boolean.parseBoolean(value)) : true  #  inside failOnWriteError method
		 * (failOnWriteError(event)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((File) any(), eq("File must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			ApplicationPidFileWriter target = new ApplicationPidFileWriter("filename1");
			//Act Statement(s)
			final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
				target.onApplicationEvent(springApplicationEventMock);
			});
			Exception exception = new Exception();
			IllegalStateException illegalStateException = new IllegalStateException("message1", exception);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
				assertThat(result.getCause(), is(instanceOf(exception.getClass())));
				_assert.verify(() -> Assert.notNull((File) any(), eq("File must not be null")));
			});
		}
	}

	//Sapient generated method id: ${03bec59c-edde-3403-9e5b-210ba3ff13ae}, hash: 81095DDB6786B910E2BADA472F474033
	@Test()
	void onApplicationEventWhenFailOnWriteErrorNotEvent() throws Exception {
		/* Branches:
		 * (this.triggerEventType.isInstance(event)) : true
		 * (created.compareAndSet(false, true)) : true
		 * (for-each(candidates)) : true  #  inside getProperty method
		 * (value != null) : false  #  inside getProperty method
		 * (override != null) : false  #  inside writePidFile method
		 * (catch-exception (Exception)) : true
		 * (Boolean.parseBoolean(value)) : false  #  inside failOnWriteError method
		 * (failOnWriteError(event)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull((File) any(), eq("File must not be null"))).thenAnswer((Answer<Void>) invocation -> null);
			ApplicationPidFileWriter target = new ApplicationPidFileWriter("filename1");
			//Act Statement(s)
			target.onApplicationEvent(springApplicationEventMock);
			//Assert statement(s)
			assertAll("result", () -> _assert.verify(() -> Assert.notNull((File) any(), eq("File must not be null"))));
		}
	}

	//Sapient generated method id: ${956fb832-abf7-3971-aedb-c516d557eacc}, hash: 9B7C61320ACC4995E1FFF5F77C4A9E31
	@Test()
	void resetTest() {
		//Act Statement(s)
		ApplicationPidFileWriter.reset();
	}
}
