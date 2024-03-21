package org.springframework.boot.context.properties;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;

import org.mockito.MockedStatic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.AttributeAccessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.boot.context.properties.bind.BindMethod;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BindMethodAttributeSapientGeneratedTest {

	private final AttributeAccessor attributesMock = mock(AttributeAccessor.class);

	private final BeanDefinition beanDefinitionMock = mock(BeanDefinition.class);

	private final BeanDefinitionRegistry beanDefinitionRegistryMock = mock(BeanDefinitionRegistry.class);

	private final ConfigurableListableBeanFactory beanFactoryMock = mock(ConfigurableListableBeanFactory.class);

	//Sapient generated method id: ${2d601620-c377-3385-9974-cd99b3998839}, hash: 71831A26ED987EE056010C7606808EAE
	@Test()
	void getWhenApplicationContextInstanceOfConfigurableApplicationContext() throws IllegalStateException {
		/* Branches:
		 * (applicationContext instanceof ConfigurableApplicationContext configurableApplicationContext) : true
		 */
		//Arrange Statement(s)
		ConfigurableApplicationContext configurableApplicationContextMock = mock(ConfigurableApplicationContext.class);
		ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);
		try (MockedStatic<BindMethodAttribute> bindMethodAttribute = mockStatic(BindMethodAttribute.class, CALLS_REAL_METHODS)) {
			doReturn(configurableListableBeanFactoryMock).when(configurableApplicationContextMock).getBeanFactory();
			bindMethodAttribute.when(() -> BindMethodAttribute.get(configurableListableBeanFactoryMock, "beanName1")).thenReturn(BindMethod.JAVA_BEAN);
			//Act Statement(s)
			BindMethod result = BindMethodAttribute.get((ApplicationContext) configurableApplicationContextMock, "beanName1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(BindMethod.JAVA_BEAN));
				verify(configurableApplicationContextMock, atLeast(1)).getBeanFactory();
				bindMethodAttribute.verify(() -> BindMethodAttribute.get(configurableListableBeanFactoryMock, "beanName1"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${fa9964a1-38ed-3619-ae21-dbaee84f0342}, hash: 7628562AD11B02169A50161AA6B4EB0C
	@Test()
	void getWhenApplicationContextNotInstanceOfConfigurableApplicationContext() {
		/* Branches:
		 * (applicationContext instanceof ConfigurableApplicationContext configurableApplicationContext) : false
		 */
		//Arrange Statement(s)
		ApplicationContext applicationContextMock = mock(ApplicationContext.class);

		//Act Statement(s)
		BindMethod result = BindMethodAttribute.get(applicationContextMock, "beanName1");

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${5002ea8e-139d-3041-919f-17f32e57eca3}, hash: 0B08A7298DB79EC06CF8947B4F6C8ADD
	@Test()
	void get1WhenBeanFactoryNotContainsBeanDefinitionBeanName() {
		/* Branches:
		 * (!beanFactory.containsBeanDefinition(beanName)) : true
		 */
		//Arrange Statement(s)
		doReturn(false).when(beanFactoryMock).containsBeanDefinition("beanName1");

		//Act Statement(s)
		BindMethod result = BindMethodAttribute.get(beanFactoryMock, "beanName1");

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(nullValue()));
			verify(beanFactoryMock).containsBeanDefinition("beanName1");
		});
	}

	//Sapient generated method id: ${99fa28a3-c8de-3b32-922c-f0e5f000c660}, hash: A993C8A1F11B84A375E9C5A2D571CCC7
	@Test()
	void get1WhenBeanFactoryContainsBeanDefinitionBeanName() throws NoSuchBeanDefinitionException {
		/* Branches:
		 * (!beanFactory.containsBeanDefinition(beanName)) : false
		 */
		//Arrange Statement(s)
		doReturn(true).when(beanFactoryMock).containsBeanDefinition("beanName1");
		doReturn(beanDefinitionMock).when(beanFactoryMock).getBeanDefinition("beanName1");
		doReturn(BindMethod.JAVA_BEAN).when(beanDefinitionMock).getAttribute("org.springframework.boot.context.properties.bind.BindMethod");

		//Act Statement(s)
		BindMethod result = BindMethodAttribute.get(beanFactoryMock, "beanName1");

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(BindMethod.JAVA_BEAN));
			verify(beanFactoryMock).containsBeanDefinition("beanName1");
			verify(beanFactoryMock).getBeanDefinition("beanName1");
			verify(beanDefinitionMock).getAttribute("org.springframework.boot.context.properties.bind.BindMethod");
		});
	}

	//Sapient generated method id: ${2d411b37-ab25-3545-8162-638bddeea5e9}, hash: 6FC93E96F99228BA10CF4A73018E15FD
	@Test()
	void get2WhenBeanDefinitionRegistryNotContainsBeanDefinitionBeanName() {
		/* Branches:
		 * (!beanDefinitionRegistry.containsBeanDefinition(beanName)) : true
		 */
		//Arrange Statement(s)
		doReturn(false).when(beanDefinitionRegistryMock).containsBeanDefinition("beanName1");

		//Act Statement(s)
		BindMethod result = BindMethodAttribute.get(beanDefinitionRegistryMock, "beanName1");

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(nullValue()));
			verify(beanDefinitionRegistryMock).containsBeanDefinition("beanName1");
		});
	}

	//Sapient generated method id: ${99d011b3-c10e-39fd-ad7a-4e14497971e6}, hash: 639F8BBF3360CA88CD073DCDA534D390
	@Test()
	void get2WhenBeanDefinitionRegistryContainsBeanDefinitionBeanName() throws NoSuchBeanDefinitionException {
		/* Branches:
		 * (!beanDefinitionRegistry.containsBeanDefinition(beanName)) : false
		 */
		//Arrange Statement(s)
		doReturn(true).when(beanDefinitionRegistryMock).containsBeanDefinition("beanName1");
		doReturn(beanDefinitionMock).when(beanDefinitionRegistryMock).getBeanDefinition("beanName1");
		doReturn(BindMethod.JAVA_BEAN).when(beanDefinitionMock).getAttribute("org.springframework.boot.context.properties.bind.BindMethod");

		//Act Statement(s)
		BindMethod result = BindMethodAttribute.get(beanDefinitionRegistryMock, "beanName1");

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(BindMethod.JAVA_BEAN));
			verify(beanDefinitionRegistryMock).containsBeanDefinition("beanName1");
			verify(beanDefinitionRegistryMock).getBeanDefinition("beanName1");
			verify(beanDefinitionMock).getAttribute("org.springframework.boot.context.properties.bind.BindMethod");
		});
	}

	//Sapient generated method id: ${56b94b6a-fcdd-30bc-99fe-466780af1a26}, hash: 1D5B9EDFA8471DFC27FC886342A1CB75
	@Test()
	void get3Test() {
		//Arrange Statement(s)
		doReturn(BindMethod.JAVA_BEAN).when(attributesMock).getAttribute("org.springframework.boot.context.properties.bind.BindMethod");

		//Act Statement(s)
		BindMethod result = BindMethodAttribute.get(attributesMock);

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(BindMethod.JAVA_BEAN));
			verify(attributesMock).getAttribute("org.springframework.boot.context.properties.bind.BindMethod");
		});
	}

	//Sapient generated method id: ${5f854b88-bcf7-387d-b72e-a25ce3260bc1}, hash: 434B7A7486B11E5F4D6D2A66E503D0B6
	@Test()
	void setTest() {
		//Arrange Statement(s)
		doNothing().when(attributesMock).setAttribute("org.springframework.boot.context.properties.bind.BindMethod", BindMethod.JAVA_BEAN);

		//Act Statement(s)
		BindMethodAttribute.set(attributesMock, BindMethod.JAVA_BEAN);

		//Assert statement(s)
		assertAll("result", () -> verify(attributesMock).setAttribute("org.springframework.boot.context.properties.bind.BindMethod", BindMethod.JAVA_BEAN));
	}
}
