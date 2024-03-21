package org.springframework.boot.context.properties;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.BeansException;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.core.convert.ConversionService;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConversionServiceDeducerSapientGeneratedTest {

	private final ApplicationContext applicationContextMock = mock(ApplicationContext.class, "applicationContext");

	private final AutowireCapableBeanFactory autowireCapableBeanFactoryMock = mock(AutowireCapableBeanFactory.class);

	//Sapient generated method id: ${e37d94a4-e334-3839-ad8f-8cff7cff29b3}, hash: 46BE6B86C471E8393BF3BE8764869488
	@Test()
	void getConversionServicesWhenHasUserDefinedConfigurationServiceBean() throws IllegalStateException, NoSuchBeanDefinitionException, BeansException {
		/* Branches:
		 * (this.applicationContext.containsBean(beanName)) : true  #  inside hasUserDefinedConfigurationServiceBean method
		 * (this.applicationContext.getAutowireCapableBeanFactory().isTypeMatch(beanName, ConversionService.class)) : true  #  inside hasUserDefinedConfigurationServiceBean method
		 * (hasUserDefinedConfigurationServiceBean()) : true
		 */
		//Arrange Statement(s)
		ConversionServiceDeducer target = new ConversionServiceDeducer(applicationContextMock);
		doReturn(true).when(applicationContextMock).containsBean("conversionService");
		doReturn(autowireCapableBeanFactoryMock).when(applicationContextMock).getAutowireCapableBeanFactory();
		doReturn(true).when(autowireCapableBeanFactoryMock).isTypeMatch("conversionService", ConversionService.class);
		ConversionService conversionServiceMock = mock(ConversionService.class);
		doReturn(conversionServiceMock).when(applicationContextMock).getBean("conversionService", ConversionService.class);

		//Act Statement(s)
		List<ConversionService> result = target.getConversionServices();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result.size(), equalTo(1));
			assertThat(result.get(0), is(instanceOf(ConversionService.class)));
			verify(applicationContextMock).containsBean("conversionService");
			verify(applicationContextMock).getAutowireCapableBeanFactory();
			verify(autowireCapableBeanFactoryMock).isTypeMatch("conversionService", ConversionService.class);
			verify(applicationContextMock).getBean("conversionService", ConversionService.class);
		});
	}

	//Sapient generated method id: ${e49d0f07-003b-3016-a941-8bd87a17ede5}, hash: 531F107670EBE44CE714D141ADB57FC5
	@Test()
	void getConversionServicesWhenHasUserDefinedConfigurationServiceBeanNotAndThisApplicationContextNotInstanceOfConfigurableApp() throws IllegalStateException, NoSuchBeanDefinitionException {
		/* Branches:
		 * (this.applicationContext.containsBean(beanName)) : true  #  inside hasUserDefinedConfigurationServiceBean method
		 * (this.applicationContext.getAutowireCapableBeanFactory().isTypeMatch(beanName, ConversionService.class)) : false  #  inside hasUserDefinedConfigurationServiceBean method
		 * (hasUserDefinedConfigurationServiceBean()) : false
		 * (this.applicationContext instanceof ConfigurableApplicationContext configurableContext) : false
		 */
		//Arrange Statement(s)
		ConversionServiceDeducer target = new ConversionServiceDeducer(applicationContextMock);
		doReturn(true).when(applicationContextMock).containsBean("conversionService");
		doReturn(autowireCapableBeanFactoryMock).when(applicationContextMock).getAutowireCapableBeanFactory();
		doReturn(false).when(autowireCapableBeanFactoryMock).isTypeMatch("conversionService", ConversionService.class);

		//Act Statement(s)
		List<ConversionService> result = target.getConversionServices();

		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, is(nullValue()));
			verify(applicationContextMock).containsBean("conversionService");
			verify(applicationContextMock).getAutowireCapableBeanFactory();
			verify(autowireCapableBeanFactoryMock).isTypeMatch("conversionService", ConversionService.class);
		});
	}
}
