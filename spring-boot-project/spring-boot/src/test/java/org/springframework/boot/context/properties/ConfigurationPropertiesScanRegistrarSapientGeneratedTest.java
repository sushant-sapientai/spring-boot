package org.springframework.boot.context.properties;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.core.io.ResourceLoader;
import org.springframework.util.ClassUtils;
import org.springframework.core.env.Environment;
import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.core.annotation.AnnotationAttributes;

import java.util.Map;
import java.util.HashMap;

import org.springframework.stereotype.Component;

import org.mockito.MockedStatic;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;

import static org.mockito.Mockito.verify;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertiesScanRegistrarSapientGeneratedTest {

	private final BeanDefinitionRegistry beanDefinitionRegistryMock = mock(BeanDefinitionRegistry.class);

	private final Environment environmentMock = mock(Environment.class);

	private final MergedAnnotations mergedAnnotationsMock = mock(MergedAnnotations.class);

	private final AnnotationMetadata metadataMock = mock(AnnotationMetadata.class);

	private final ResourceLoader resourceLoaderMock = mock(ResourceLoader.class);

	//Sapient generated method id: ${c0d90754-6ebc-3056-b15b-c420e58b8d90}, hash: 995F2645268955C41C88F7ED4512732C
	@Disabled()
	@Test()
	void registerBeanDefinitionsWhenIsComponentType() throws LinkageError, ClassNotFoundException {
		/* Branches:
		 * (for-each(basePackageClasses)) : true  #  inside getPackagesToScan method
		 * (packagesToScan.isEmpty()) : true  #  inside getPackagesToScan method
		 * (for-each(packages)) : true  #  inside scan method
		 * (for-each(scanner.findCandidateComponents(basePackage))) : true  #  inside scan method
		 * (MergedAnnotations.from(type, SearchStrategy.TYPE_HIERARCHY).isPresent(Component.class)) : true  #  inside isComponent method
		 * (!isComponent(type)) : false  #  inside register method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<MergedAnnotations> mergedAnnotations = mockStatic(MergedAnnotations.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<AnnotationAttributes> annotationAttributes = mockStatic(AnnotationAttributes.class)) {
			Map<String, Object> stringObjectMap = new HashMap<>();
			doReturn(stringObjectMap).when(metadataMock).getAnnotationAttributes("org.springframework.boot.context.properties.ConfigurationPropertiesScan");
			doReturn("return_of_getClassName1").when(metadataMock).getClassName();
			AnnotationAttributes annotationAttributes2 = new AnnotationAttributes();
			annotationAttributes.when(() -> AnnotationAttributes.fromMap(anyMap())).thenReturn(annotationAttributes2);
			classUtils.when(() -> ClassUtils.getPackageName(Object.class)).thenReturn("return_of_getPackageName1");
			classUtils.when(() -> ClassUtils.getPackageName("return_of_getClassName1")).thenReturn("return_of_getPackageName1");
			classUtils.when(() -> ClassUtils.forName("return_of_getBeanClassName1", null)).thenReturn(Object.class);
			mergedAnnotations.when(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock);
			doReturn(true).when(mergedAnnotationsMock).isPresent(Component.class);
			ConfigurationPropertiesScanRegistrar target = new ConfigurationPropertiesScanRegistrar(environmentMock, resourceLoaderMock);
			//Act Statement(s)
			target.registerBeanDefinitions(metadataMock, beanDefinitionRegistryMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(metadataMock).getAnnotationAttributes("org.springframework.boot.context.properties.ConfigurationPropertiesScan");
				verify(metadataMock).getClassName();
				annotationAttributes.verify(() -> AnnotationAttributes.fromMap(anyMap()));
				classUtils.verify(() -> ClassUtils.getPackageName(Object.class), atLeast(1));
				classUtils.verify(() -> ClassUtils.getPackageName("return_of_getClassName1"), atLeast(1));
				classUtils.verify(() -> ClassUtils.forName("return_of_getBeanClassName1", null), atLeast(1));
				mergedAnnotations.verify(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(1));
				verify(mergedAnnotationsMock).isPresent(Component.class);
			});
		}
	}

	//Sapient generated method id: ${5e22f4f9-a410-369e-8df0-14d8223d71c9}, hash: 6CF179CEB0E95B541C4A370CE4CF1143
	@Disabled()
	@Test()
	void registerBeanDefinitionsWhenIsComponentNotType() throws LinkageError, ClassNotFoundException {
		/* Branches:
		 * (for-each(basePackageClasses)) : true  #  inside getPackagesToScan method
		 * (packagesToScan.isEmpty()) : true  #  inside getPackagesToScan method
		 * (for-each(packages)) : true  #  inside scan method
		 * (for-each(scanner.findCandidateComponents(basePackage))) : true  #  inside scan method
		 * (MergedAnnotations.from(type, SearchStrategy.TYPE_HIERARCHY).isPresent(Component.class)) : false  #  inside isComponent method
		 * (!isComponent(type)) : true  #  inside register method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<MergedAnnotations> mergedAnnotations = mockStatic(MergedAnnotations.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<AnnotationAttributes> annotationAttributes = mockStatic(AnnotationAttributes.class)) {
			Map<String, Object> stringObjectMap = new HashMap<>();
			doReturn(stringObjectMap).when(metadataMock).getAnnotationAttributes("org.springframework.boot.context.properties.ConfigurationPropertiesScan");
			doReturn("return_of_getClassName1").when(metadataMock).getClassName();
			AnnotationAttributes annotationAttributes2 = new AnnotationAttributes();
			annotationAttributes.when(() -> AnnotationAttributes.fromMap(anyMap())).thenReturn(annotationAttributes2);
			classUtils.when(() -> ClassUtils.getPackageName(Object.class)).thenReturn("return_of_getPackageName1");
			classUtils.when(() -> ClassUtils.getPackageName("return_of_getClassName1")).thenReturn("return_of_getPackageName1");
			classUtils.when(() -> ClassUtils.forName("return_of_getBeanClassName1", null)).thenReturn(Object.class);
			mergedAnnotations.when(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock);
			doReturn(false).when(mergedAnnotationsMock).isPresent(Component.class);
			ConfigurationPropertiesScanRegistrar target = new ConfigurationPropertiesScanRegistrar(environmentMock, resourceLoaderMock);
			//Act Statement(s)
			target.registerBeanDefinitions(metadataMock, beanDefinitionRegistryMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(metadataMock).getAnnotationAttributes("org.springframework.boot.context.properties.ConfigurationPropertiesScan");
				verify(metadataMock).getClassName();
				annotationAttributes.verify(() -> AnnotationAttributes.fromMap(anyMap()));
				classUtils.verify(() -> ClassUtils.getPackageName(Object.class), atLeast(1));
				classUtils.verify(() -> ClassUtils.getPackageName("return_of_getClassName1"), atLeast(1));
				classUtils.verify(() -> ClassUtils.forName("return_of_getBeanClassName1", null), atLeast(1));
				mergedAnnotations.verify(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(1));
				verify(mergedAnnotationsMock).isPresent(Component.class);
			});
		}
	}

	//Sapient generated method id: ${fbec5789-e71d-313e-b81a-35bd5444035b}, hash: F28A15A56C925F5CC467B843344C7EAF
	@Disabled()
	@Test()
	void registerBeanDefinitionsWhenCaughtClassNotFoundException() throws LinkageError, ClassNotFoundException {
		/* Branches:
		 * (for-each(basePackageClasses)) : true  #  inside getPackagesToScan method
		 * (packagesToScan.isEmpty()) : true  #  inside getPackagesToScan method
		 * (for-each(packages)) : true  #  inside scan method
		 * (for-each(scanner.findCandidateComponents(basePackage))) : true  #  inside scan method
		 * (MergedAnnotations.from(type, SearchStrategy.TYPE_HIERARCHY).isPresent(Component.class)) : false  #  inside isComponent method
		 * (!isComponent(type)) : true  #  inside register method
		 * (catch-exception (ClassNotFoundException)) : true  #  inside register method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<MergedAnnotations> mergedAnnotations = mockStatic(MergedAnnotations.class);
			 MockedStatic<ClassUtils> classUtils = mockStatic(ClassUtils.class);
			 MockedStatic<AnnotationAttributes> annotationAttributes = mockStatic(AnnotationAttributes.class)) {
			Map<String, Object> stringObjectMap = new HashMap<>();
			doReturn(stringObjectMap).when(metadataMock).getAnnotationAttributes("org.springframework.boot.context.properties.ConfigurationPropertiesScan");
			doReturn("return_of_getClassName1").when(metadataMock).getClassName();
			AnnotationAttributes annotationAttributes2 = new AnnotationAttributes();
			annotationAttributes.when(() -> AnnotationAttributes.fromMap(anyMap())).thenReturn(annotationAttributes2);
			classUtils.when(() -> ClassUtils.getPackageName(Object.class)).thenReturn("return_of_getPackageName1");
			classUtils.when(() -> ClassUtils.getPackageName("return_of_getClassName1")).thenReturn("return_of_getPackageName1");
			classUtils.when(() -> ClassUtils.forName("return_of_getBeanClassName1", null)).thenReturn(Object.class);
			mergedAnnotations.when(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY)).thenReturn(mergedAnnotationsMock);
			doReturn(false).when(mergedAnnotationsMock).isPresent(Component.class);
			ConfigurationPropertiesScanRegistrar target = new ConfigurationPropertiesScanRegistrar(environmentMock, resourceLoaderMock);
			//Act Statement(s)
			target.registerBeanDefinitions(metadataMock, beanDefinitionRegistryMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(metadataMock).getAnnotationAttributes("org.springframework.boot.context.properties.ConfigurationPropertiesScan");
				verify(metadataMock).getClassName();
				annotationAttributes.verify(() -> AnnotationAttributes.fromMap(anyMap()));
				classUtils.verify(() -> ClassUtils.getPackageName(Object.class), atLeast(1));
				classUtils.verify(() -> ClassUtils.getPackageName("return_of_getClassName1"), atLeast(1));
				classUtils.verify(() -> ClassUtils.forName("return_of_getBeanClassName1", null), atLeast(1));
				mergedAnnotations.verify(() -> MergedAnnotations.from(Object.class, MergedAnnotations.SearchStrategy.TYPE_HIERARCHY), atLeast(1));
				verify(mergedAnnotationsMock).isPresent(Component.class);
			});
		}
	}
}
