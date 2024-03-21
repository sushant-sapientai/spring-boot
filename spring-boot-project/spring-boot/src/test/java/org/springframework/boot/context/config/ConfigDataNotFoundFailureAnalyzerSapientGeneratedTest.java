package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.origin.Origin;

import org.mockito.MockedStatic;

import org.springframework.boot.diagnostics.FailureAnalysis;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigDataNotFoundFailureAnalyzerSapientGeneratedTest {

	//Sapient generated method id: ${86a94c06-1bf6-3695-8b58-09bb7743a745}, hash: A0CA94F2004AA4A4C3EC1C8E84731CFB
	@Test()
	void analyze2WhenLocationNotIsOptional() {
		/* Branches:
		 * (cause instanceof ConfigDataLocationNotFoundException locationNotFoundException) : true  #  inside getLocation method
		 * (location != null) : true
		 * (origin != null) : true
		 * (location != null) : true
		 * (!location.isOptional()) : true
		 */
		//Arrange Statement(s)
		ConfigDataLocationNotFoundException locationNotFoundExceptionMock = mock(ConfigDataLocationNotFoundException.class);
		ConfigDataLocation configDataLocationMock = mock(ConfigDataLocation.class, "getLocation_configDataLocation1");
		Origin originMock = mock(Origin.class, "analyze_origin1");
		try (MockedStatic<Origin> origin = mockStatic(Origin.class)) {
			doReturn(configDataLocationMock).when(locationNotFoundExceptionMock).getLocation();
			doReturn(false).when(configDataLocationMock).isOptional();
			doReturn("").when(locationNotFoundExceptionMock).getReferenceDescription();
			origin.when(() -> Origin.from(configDataLocationMock)).thenReturn(originMock);
			ConfigDataNotFoundFailureAnalyzer target = new ConfigDataNotFoundFailureAnalyzer();
			Throwable throwable = new Throwable();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, (ConfigDataNotFoundException) locationNotFoundExceptionMock);
			//Assert statement(s)
			//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(locationNotFoundExceptionMock, atLeast(1)).getLocation();
				verify(configDataLocationMock).isOptional();
				verify(locationNotFoundExceptionMock, atLeast(1)).getReferenceDescription();
				origin.verify(() -> Origin.from(configDataLocationMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3f4d8ae1-d48f-3654-8314-e8fa99f3451d}, hash: C4C7C0CBA36512889E44256C83102AE5
	@Test()
	void analyze2WhenLocationIsNullAndOriginIsNullAndLocationIsNull() {
		/* Branches:
		 * (cause instanceof ConfigDataLocationNotFoundException locationNotFoundException) : false  #  inside getLocation method
		 * (cause instanceof ConfigDataResourceNotFoundException resourceNotFoundException) : true  #  inside getLocation method
		 * (location != null) : false
		 * (origin != null) : false
		 * (location != null) : false
		 */
		//Arrange Statement(s)
		ConfigDataResourceNotFoundException resourceNotFoundExceptionMock = mock(ConfigDataResourceNotFoundException.class);
		try (MockedStatic<Origin> origin = mockStatic(Origin.class)) {
			doReturn(null).when(resourceNotFoundExceptionMock).getLocation();
			doReturn("A").when(resourceNotFoundExceptionMock).getReferenceDescription();
			origin.when(() -> Origin.from((ConfigDataLocation) null)).thenReturn(null);
			ConfigDataNotFoundFailureAnalyzer target = new ConfigDataNotFoundFailureAnalyzer();
			Throwable throwable = new Throwable();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, (ConfigDataNotFoundException) resourceNotFoundExceptionMock);
			//Assert statement(s)
			//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(resourceNotFoundExceptionMock, atLeast(1)).getLocation();
				verify(resourceNotFoundExceptionMock, atLeast(1)).getReferenceDescription();
				origin.verify(() -> Origin.from((ConfigDataLocation) null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${8657ded6-0a93-3210-9d92-2b9c24568d92}, hash: 874B9D14F410E22C624F4C57F34A7395
	@Test()
	void analyze2WhenCauseNotInstanceOfConfigDataResourceNotFoundExceptionAndLocationIsNullAndOriginIsNullAndLocationIsNull() {
		/* Branches:
		 * (cause instanceof ConfigDataLocationNotFoundException locationNotFoundException) : false  #  inside getLocation method
		 * (cause instanceof ConfigDataResourceNotFoundException resourceNotFoundException) : false  #  inside getLocation method
		 * (location != null) : false
		 * (origin != null) : false
		 * (location != null) : false
		 */
		//Arrange Statement(s)
		ConfigDataNotFoundException causeMock = mock(ConfigDataNotFoundException.class);
		try (MockedStatic<Origin> origin = mockStatic(Origin.class)) {
			doReturn("A").when(causeMock).getReferenceDescription();
			origin.when(() -> Origin.from((ConfigDataLocation) null)).thenReturn(null);
			ConfigDataNotFoundFailureAnalyzer target = new ConfigDataNotFoundFailureAnalyzer();
			Throwable throwable = new Throwable();
			//Act Statement(s)
			FailureAnalysis result = target.analyze(throwable, causeMock);
			//Assert statement(s)
			//TODO: Please implement equals method in FailureAnalysis for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(causeMock, atLeast(1)).getReferenceDescription();
				origin.verify(() -> Origin.from((ConfigDataLocation) null), atLeast(1));
			});
		}
	}
}
