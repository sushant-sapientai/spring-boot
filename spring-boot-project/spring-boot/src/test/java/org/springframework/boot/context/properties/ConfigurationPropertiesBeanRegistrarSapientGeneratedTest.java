package org.springframework.boot.context.properties;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.BeanDefinitionStoreException;

import org.mockito.stubbing.Answer;

import org.springframework.util.StringUtils;
import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.util.Assert;

import java.util.function.Supplier;

import org.springframework.core.annotation.MergedAnnotation;

import org.mockito.MockedStatic;

import org.springframework.core.AttributeAccessor;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.context.properties.bind.BindMethod;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertiesBeanRegistrarSapientGeneratedTest {

	private final BeanDefinitionRegistry registryMock = mock(BeanDefinitionRegistry.class, "registry");

	private final MergedAnnotation<ConfigurationProperties> annotationMock = mock(MergedAnnotation.class);

	//Sapient generated method id: ${853913a6-18ed-366c-8d01-10d393fd970e}, hash: 846D1D24DED31F0E4DBEDD8B677D6E4F
	@Disabled()
	@Test()
	void registerTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		MergedAnnotations mergedAnnotationsMock = mock(MergedAnnotations.class);
		MergedAnnotation<ConfigurationProperties> mergedAnnotationMock = mock(MergedAnnotation.class);
		try (MockedStatic<MergedAnnotations> mergedAnnotations = mockStatic(MergedAnnotations.class)) {
			mergedAnnotations.when(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock);
			doReturn(mergedAnnotationMock).when(mergedAnnotationsMock).get(ConfigurationProperties.class);
			ConfigurationPropertiesBeanRegistrar target = spy(new ConfigurationPropertiesBeanRegistrar(registryMock));
			doNothing().when(target).register(Object.class, mergedAnnotationMock);
			//Act Statement(s)
			target.register(Object.class);
			//Assert statement(s)
			assertAll("result", () -> {
				mergedAnnotations.verify(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(1));
				verify(mergedAnnotationsMock).get(ConfigurationProperties.class);
				verify(target).register(Object.class, mergedAnnotationMock);
			});
		}
	}

	//Sapient generated method id: ${1f68e201-ef10-35df-9a07-1476241b36f5}, hash: B3D65FF3AE34041190A5B97FA6BDC3B2
	@Disabled()
	@Test()
	void register1WhenContainsBeanDefinitionName() throws NoSuchElementException {
		/* Branches:
		 * (annotation.isPresent()) : true  #  inside getName method
		 * (StringUtils.hasText(prefix)) : true  #  inside getName method
		 * (beanFactory instanceof ListableBeanFactory listableBeanFactory) : true  #  inside containsBeanDefinition method
		 * (listableBeanFactory.containsBeanDefinition(name)) : true  #  inside containsBeanDefinition method
		 * (!containsBeanDefinition(name)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(true).when(annotationMock).isPresent();
		doReturn("A").when(annotationMock).getString("prefix");
		ConfigurationPropertiesBeanRegistrar target = new ConfigurationPropertiesBeanRegistrar(registryMock);
		//Act Statement(s)
		target.register(Object.class, annotationMock);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(annotationMock).isPresent();
			verify(annotationMock).getString("prefix");
		});
	}

	//Sapient generated method id: ${1e8acbc1-030a-3bca-aab8-13cf04495245}, hash: EE17E712BFCF2E7D236ADC90BFFDBC25
	@Disabled()
	@Test()
	void register1WhenContainsBeanDefinitionThisBeanFactoryNameAndContainsBeanDefinitionName() throws NoSuchElementException {
		/* Branches:
		 * (annotation.isPresent()) : true  #  inside getName method
		 * (StringUtils.hasText(prefix)) : true  #  inside getName method
		 * (beanFactory instanceof ListableBeanFactory listableBeanFactory) : false  #  inside containsBeanDefinition method
		 * (beanFactory instanceof HierarchicalBeanFactory hierarchicalBeanFactory) : true  #  inside containsBeanDefinition method
		 * (containsBeanDefinition(this.beanFactory, name)) : true  #  inside containsBeanDefinition method
		 * (!containsBeanDefinition(name)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(true).when(annotationMock).isPresent();
		doReturn("A").when(annotationMock).getString("prefix");
		ConfigurationPropertiesBeanRegistrar target = new ConfigurationPropertiesBeanRegistrar(registryMock);
		//Act Statement(s)
		target.register(Object.class, annotationMock);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(annotationMock).isPresent();
			verify(annotationMock).getString("prefix");
		});
	}

	//Sapient generated method id: ${457da517-a828-386b-9bee-c57d15eca370}, hash: B6F035D50EAF43919B4A750B9204F5A0
	@Disabled()
	@Test()
	void register1WhenBeanFactoryNotInstanceOfHierarchicalBeanFactoryAndContainsBeanDefinitionNotNameAndBindMethodNotEqualsBindM() throws BeanDefinitionStoreException {
		/* Branches:
		 * (annotation.isPresent()) : false  #  inside getName method
		 * (StringUtils.hasText(prefix)) : false  #  inside getName method
		 * (beanFactory instanceof ListableBeanFactory listableBeanFactory) : false  #  inside containsBeanDefinition method
		 * (beanFactory instanceof HierarchicalBeanFactory hierarchicalBeanFactory) : false  #  inside containsBeanDefinition method
		 * (!containsBeanDefinition(name)) : true
		 * (bindMethod == BindMethod.VALUE_OBJECT) : false  #  inside createBeanDefinition method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BindMethodAttribute> bindMethodAttribute = mockStatic(BindMethodAttribute.class);
			 MockedStatic<ConfigurationPropertiesBean> configurationPropertiesBean = mockStatic(ConfigurationPropertiesBean.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(false).when(annotationMock).isPresent();
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertiesBean.when(() -> ConfigurationPropertiesBean.deduceBindMethod(Object.class)).thenReturn(BindMethod.JAVA_BEAN);
			bindMethodAttribute.when(() -> BindMethodAttribute.set((AttributeAccessor) any(), eq(BindMethod.JAVA_BEAN))).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertiesBeanRegistrar target = new ConfigurationPropertiesBeanRegistrar(registryMock);
			doNothing().when(registryMock).registerBeanDefinition(eq("java.lang.Object"), (BeanDefinition) any());
			//Act Statement(s)
			target.register(Object.class, annotationMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(annotationMock, times(2)).isPresent();
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
				configurationPropertiesBean.verify(() -> ConfigurationPropertiesBean.deduceBindMethod(Object.class), atLeast(1));
				bindMethodAttribute.verify(() -> BindMethodAttribute.set((AttributeAccessor) any(), eq(BindMethod.JAVA_BEAN)));
				verify(registryMock).registerBeanDefinition(eq("java.lang.Object"), (BeanDefinition) any());
			});
		}
	}

	//Sapient generated method id: ${0d78ece8-4b86-3d5e-b785-087ad7a58e66}, hash: 6E8B2B55C42016F635462819A48E7752
	@Disabled()
	@Test()
	void register1WhenBindMethodEqualsBindMethodVALUE_OBJECT() throws NoSuchElementException, BeanDefinitionStoreException {
		/* Branches:
		 * (annotation.isPresent()) : true  #  inside getName method
		 * (StringUtils.hasText(prefix)) : true  #  inside getName method
		 * (beanFactory instanceof ListableBeanFactory listableBeanFactory) : true  #  inside containsBeanDefinition method
		 * (listableBeanFactory.containsBeanDefinition(name)) : false  #  inside containsBeanDefinition method
		 * (beanFactory instanceof HierarchicalBeanFactory hierarchicalBeanFactory) : false  #  inside containsBeanDefinition method
		 * (!containsBeanDefinition(name)) : true
		 * (bindMethod == BindMethod.VALUE_OBJECT) : true  #  inside createBeanDefinition method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<BindMethodAttribute> bindMethodAttribute = mockStatic(BindMethodAttribute.class);
			 MockedStatic<ConfigurationPropertiesBean> configurationPropertiesBean = mockStatic(ConfigurationPropertiesBean.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn("A").when(annotationMock).getString("prefix");
			doReturn(true, false).when(annotationMock).isPresent();
			_assert.when(() -> Assert.state(eq(false), (Supplier) any())).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertiesBean.when(() -> ConfigurationPropertiesBean.deduceBindMethod(Object.class)).thenReturn(BindMethod.VALUE_OBJECT);
			bindMethodAttribute.when(() -> BindMethodAttribute.set((AttributeAccessor) any(), eq(BindMethod.VALUE_OBJECT))).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertiesBeanRegistrar target = new ConfigurationPropertiesBeanRegistrar(registryMock);
			doNothing().when(registryMock).registerBeanDefinition(eq("A-java.lang.Object"), (BeanDefinition) any());
			//Act Statement(s)
			target.register(Object.class, annotationMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(annotationMock, times(2)).isPresent();
				verify(annotationMock).getString("prefix");
				_assert.verify(() -> Assert.state(eq(false), (Supplier) any()));
				configurationPropertiesBean.verify(() -> ConfigurationPropertiesBean.deduceBindMethod(Object.class), atLeast(1));
				bindMethodAttribute.verify(() -> BindMethodAttribute.set((AttributeAccessor) any(), eq(BindMethod.VALUE_OBJECT)));
				verify(registryMock).registerBeanDefinition(eq("A-java.lang.Object"), (BeanDefinition) any());
			});
		}
	}
}
