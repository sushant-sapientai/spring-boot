package org.springframework.boot.context.properties;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.ArrayList;

import org.springframework.boot.diagnostics.FailureAnalysis;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class IncompatibleConfigurationFailureAnalyzerSapientGeneratedTest {

	//Sapient generated method id: ${61fb4ac6-aef4-3600-ac10-5fdf40761c4c}, hash: 4D3E6D069AD90D51E89F53497C4D6716
	@Test()
	void analyze2Test() {
		//Arrange Statement(s)
		IncompatibleConfigurationException causeMock = mock(IncompatibleConfigurationException.class);
		Collection<String> collection = new ArrayList<>();
		doReturn(collection).when(causeMock).getIncompatibleKeys();
		doReturn("return_of_getMessage1").when(causeMock).getMessage();
		IncompatibleConfigurationFailureAnalyzer target = new IncompatibleConfigurationFailureAnalyzer();
		Throwable throwable = new Throwable();

		//Act Statement(s)
		FailureAnalysis result = target.analyze(throwable, causeMock);

		//Assert statement(s)
		//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(causeMock, atLeast(1)).getIncompatibleKeys();
			verify(causeMock, atLeast(1)).getMessage();
		});
	}
}
