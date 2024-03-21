package org.springframework.boot.context.properties;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.support.RegisteredBean;

import org.mockito.MockedStatic;

import java.util.function.UnaryOperator;

import org.springframework.beans.factory.aot.BeanRegistrationAotContribution;
import org.springframework.boot.context.properties.bind.BindMethod;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertiesBeanRegistrationAotProcessorSapientGeneratedTest {

	private final RegisteredBean registeredBeanMock = mock(RegisteredBean.class);

	private final RootBeanDefinition rootBeanDefinitionMock = mock(RootBeanDefinition.class);

	//Sapient generated method id: ${5006a468-7c69-3945-ae79-0b7b0dd25711}, hash: AAB93A2DBB2CB193C70E9E0FE7D1A3BA
	@Test()
	void processAheadOfTimeWhenIsImmutableConfigurationPropertiesBeanDefinitionRegisteredBeanGetMergedBeanDefinition() {
		/* Branches:
		 * (BindMethod.VALUE_OBJECT.equals(BindMethodAttribute.get(beanDefinition))) : true  #  inside isImmutableConfigurationPropertiesBeanDefinition method
		 * (!isImmutableConfigurationPropertiesBeanDefinition(registeredBean.getMergedBeanDefinition())) : false
		 */
		//Arrange Statement(s)
		BeanRegistrationAotContribution beanRegistrationAotContributionMock = mock(BeanRegistrationAotContribution.class);
		try (MockedStatic<BeanRegistrationAotContribution> beanRegistrationAotContribution = mockStatic(BeanRegistrationAotContribution.class);
			 MockedStatic<BindMethodAttribute> bindMethodAttribute = mockStatic(BindMethodAttribute.class)) {
			doReturn(rootBeanDefinitionMock).when(registeredBeanMock).getMergedBeanDefinition();
			bindMethodAttribute.when(() -> BindMethodAttribute.get(rootBeanDefinitionMock)).thenReturn(BindMethod.VALUE_OBJECT);
			beanRegistrationAotContribution.when(() -> BeanRegistrationAotContribution.withCustomCodeFragments((UnaryOperator) any())).thenReturn(beanRegistrationAotContributionMock);
			ConfigurationPropertiesBeanRegistrationAotProcessor target = new ConfigurationPropertiesBeanRegistrationAotProcessor();
			//Act Statement(s)
			BeanRegistrationAotContribution result = target.processAheadOfTime(registeredBeanMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(beanRegistrationAotContributionMock));
				verify(registeredBeanMock).getMergedBeanDefinition();
				bindMethodAttribute.verify(() -> BindMethodAttribute.get(rootBeanDefinitionMock), atLeast(1));
				beanRegistrationAotContribution.verify(() -> BeanRegistrationAotContribution.withCustomCodeFragments((UnaryOperator) any()));
			});
		}
	}

	//Sapient generated method id: ${d828adae-363b-3338-a7bc-af45e187d33d}, hash: 37300D89C0A5B082366BE3A91082B1DC
	@Test()
	void processAheadOfTimeWhenIsImmutableConfigurationPropertiesBeanDefinitionNotRegisteredBeanGetMergedBeanDefinition() {
		/* Branches:
		 * (BindMethod.VALUE_OBJECT.equals(BindMethodAttribute.get(beanDefinition))) : false  #  inside isImmutableConfigurationPropertiesBeanDefinition method
		 * (!isImmutableConfigurationPropertiesBeanDefinition(registeredBean.getMergedBeanDefinition())) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<BindMethodAttribute> bindMethodAttribute = mockStatic(BindMethodAttribute.class)) {
			doReturn(rootBeanDefinitionMock).when(registeredBeanMock).getMergedBeanDefinition();
			bindMethodAttribute.when(() -> BindMethodAttribute.get(rootBeanDefinitionMock)).thenReturn(BindMethod.JAVA_BEAN);
			ConfigurationPropertiesBeanRegistrationAotProcessor target = new ConfigurationPropertiesBeanRegistrationAotProcessor();
			//Act Statement(s)
			BeanRegistrationAotContribution result = target.processAheadOfTime(registeredBeanMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(registeredBeanMock).getMergedBeanDefinition();
				bindMethodAttribute.verify(() -> BindMethodAttribute.get(rootBeanDefinitionMock), atLeast(1));
			});
		}
	}
}
