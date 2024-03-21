package org.springframework.boot.context.properties;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.util.ClassUtils;

import org.mockito.MockedStatic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertiesBindExceptionSapientGeneratedTest {

	private final ConfigurationPropertiesBean beanMock = mock(ConfigurationPropertiesBean.class, "bean");

	private final ConfigurationProperties configurationPropertiesMock = mock(ConfigurationProperties.class);

	//Sapient generated method id: ${1cc3cfdd-301b-396a-9afe-056478b1c411}, hash: 54763549B803DB8EC06464BB9E53D197
	@Test()
	void getBeanTypeTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			doReturn("D").when(beanMock).getName();
			doReturn(configurationPropertiesMock).when(beanMock).getAnnotation();
			doReturn("B").when(configurationPropertiesMock).prefix();
			doReturn(false).when(configurationPropertiesMock).ignoreInvalidFields();
			doReturn(false).when(configurationPropertiesMock).ignoreUnknownFields();
			doReturn(Object.class).when(beanMock).getType();
			classUtils.when(() -> ClassUtils.getShortName(Object.class)).thenReturn("A");
			Exception exception = new Exception();
			ConfigurationPropertiesBindException target = new ConfigurationPropertiesBindException(beanMock, exception);
			//Act Statement(s)
			Class<?> result = target.getBeanType();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Object.class));
				verify(beanMock).getName();
				verify(beanMock).getAnnotation();
				verify(configurationPropertiesMock).prefix();
				verify(configurationPropertiesMock).ignoreInvalidFields();
				verify(configurationPropertiesMock).ignoreUnknownFields();
				verify(beanMock, times(2)).getType();
				classUtils.verify(() -> ClassUtils.getShortName(Object.class), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${43f6554e-3df6-3d8d-8e42-81c52fff7a95}, hash: E8B51ACA16A94F9F2137D2E977A46D6B
	@Disabled()
	@Test()
	void getAnnotationTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationProperties configurationPropertiesMock2 = mock(ConfigurationProperties.class);
		try (MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class)) {
			doReturn("D").when(beanMock).getName();
			doReturn("B").when(configurationPropertiesMock).prefix();
			doReturn(false).when(configurationPropertiesMock).ignoreInvalidFields();
			doReturn(false).when(configurationPropertiesMock).ignoreUnknownFields();
			doReturn(Object.class).when(beanMock).getType();
			classUtils.when(() -> ClassUtils.getShortName(Object.class)).thenReturn("A");
			Exception exception = new Exception();
			ConfigurationPropertiesBindException target = new ConfigurationPropertiesBindException(beanMock, exception);
			doReturn(configurationPropertiesMock, configurationPropertiesMock2).when(beanMock).getAnnotation();
			//Act Statement(s)
			ConfigurationProperties result = target.getAnnotation();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertiesMock2));
				verify(beanMock).getName();
				verify(beanMock, times(2)).getAnnotation();
				verify(configurationPropertiesMock).prefix();
				verify(configurationPropertiesMock).ignoreInvalidFields();
				verify(configurationPropertiesMock).ignoreUnknownFields();
				verify(beanMock).getType();
				classUtils.verify(() -> ClassUtils.getShortName(Object.class), atLeast(1));
			});
		}
	}
}
