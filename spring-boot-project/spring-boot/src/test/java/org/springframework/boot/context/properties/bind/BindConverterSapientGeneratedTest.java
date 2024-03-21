package org.springframework.boot.context.properties.bind;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.lang.annotation.Annotation;

import org.springframework.core.ResolvableType;
import org.springframework.core.convert.ConversionService;
import org.springframework.util.CollectionUtils;
import org.springframework.core.convert.ConversionFailedException;
import org.springframework.boot.convert.ApplicationConversionService;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import org.springframework.core.convert.TypeDescriptor;

import java.util.function.Consumer;

import org.springframework.beans.PropertyEditorRegistry;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BindConverterSapientGeneratedTest {

	private final Consumer consumerMock = mock(Consumer.class);

	private final ConversionService conversionServiceMock = mock(ConversionService.class);

	private final ResolvableType resolvableTypeMock = mock(ResolvableType.class);

	private final TypeDescriptor typeDescriptorMock = mock(TypeDescriptor.class);

	//Sapient generated method id: ${69ef5508-56e7-3270-97e6-6a741d4d046b}, hash: AEDD81846F32334BAFD936836D97A14E
	@Disabled()
	@Test()
	void canConvertWhenServiceCanConvertSourceTypeTargetType() {
		/* Branches:
		 * (for-each(this.delegates)) : true  #  inside canConvert method
		 * (service.canConvert(sourceType, targetType)) : true  #  inside canConvert method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<TypeDescriptor> typeDescriptor = mockStatic(TypeDescriptor.class)) {
			Object object = new Object();
			typeDescriptor.when(() -> TypeDescriptor.forObject(object)).thenReturn(typeDescriptorMock);
			ConversionService conversionService = ApplicationConversionService.getSharedInstance();
			List<ConversionService> conversionServiceList = new ArrayList<>();
			conversionServiceList.add(conversionService);
			BindConverter target = BindConverter.get(conversionServiceList, (Consumer) null);
			Annotation[] annotationArray = new Annotation[] {};
			//Act Statement(s)
			boolean result = target.canConvert(object, resolvableTypeMock, annotationArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				typeDescriptor.verify(() -> TypeDescriptor.forObject(object), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${00d968af-8a7d-37e3-9dab-1c9ee4d8e197}, hash: C32ECBB10CA93F36724DE4E1B03169CA
	@Disabled()
	@Test()
	void canConvertWhenServiceNotCanConvertSourceTypeTargetType() {
		/* Branches:
		 * (for-each(this.delegates)) : true  #  inside canConvert method
		 * (service.canConvert(sourceType, targetType)) : false  #  inside canConvert method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<TypeDescriptor> typeDescriptor = mockStatic(TypeDescriptor.class);
			 MockedStatic<ApplicationConversionService> applicationConversionService = mockStatic(ApplicationConversionService.class)) {
			ConversionService conversionService = ApplicationConversionService.getSharedInstance();
			applicationConversionService.when(() -> ApplicationConversionService.getSharedInstance()).thenReturn(conversionService).thenReturn(conversionServiceMock);
			doReturn(false).when(conversionServiceMock).canConvert(eq(typeDescriptorMock), (TypeDescriptor) any());
			Object object = new Object();
			typeDescriptor.when(() -> TypeDescriptor.forObject(object)).thenReturn(typeDescriptorMock);
			List<ConversionService> conversionServiceList = new ArrayList<>();
			conversionServiceList.add(conversionService);
			BindConverter target = BindConverter.get(conversionServiceList, (Consumer) null);
			Annotation[] annotationArray = new Annotation[] {};
			//Act Statement(s)
			boolean result = target.canConvert(object, resolvableTypeMock, annotationArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				applicationConversionService.verify(() -> ApplicationConversionService.getSharedInstance(), atLeast(2));
				verify(conversionServiceMock).canConvert(eq(typeDescriptorMock), (TypeDescriptor) any());
				typeDescriptor.verify(() -> TypeDescriptor.forObject(object), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${bcac3615-eb3e-3c15-88e5-1c9363f33c9d}, hash: 41F5A4E7FCE982798139282B05D3A96C
	@Test()
	void convertTest() {
		//Arrange Statement(s)
		Bindable<Object> targetMock = mock(Bindable.class);
		doReturn(resolvableTypeMock).when(targetMock).getType();
		Annotation[] annotationArray = new Annotation[] {};
		doReturn(annotationArray).when(targetMock).getAnnotations();
		ConversionService conversionService = ApplicationConversionService.getSharedInstance();
		List<ConversionService> conversionServiceList = new ArrayList<>();
		conversionServiceList.add(conversionService);
		BindConverter target = spy(BindConverter.get(conversionServiceList, (Consumer) null));
		Object object = new Object();
		Object object2 = new Object();
		doReturn(object).when(target).convert(object2, resolvableTypeMock, annotationArray);
		//Act Statement(s)
		Object result = target.convert(object2, targetMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(object));
			verify(targetMock).getType();
			verify(targetMock).getAnnotations();
			verify(target).convert(object2, resolvableTypeMock, annotationArray);
		});
	}

	//Sapient generated method id: ${aef27110-422b-3ac2-a0bb-246b203d0098}, hash: 5F60C0B9B11DD1E3D3D5EDED36F5DB98
	@Test()
	void convert1WhenSourceIsNull() {
		/* Branches:
		 * (source == null) : true
		 */
		//Arrange Statement(s)
		ConversionService conversionService = ApplicationConversionService.getSharedInstance();
		List<ConversionService> conversionServiceList = new ArrayList<>();
		conversionServiceList.add(conversionService);
		BindConverter target = BindConverter.get(conversionServiceList, (Consumer) null);
		Object object = null;
		Annotation[] annotationArray = new Annotation[] {};
		//Act Statement(s)
		Object result = target.convert(object, resolvableTypeMock, annotationArray);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${4eb56f17-342c-3b60-afcd-538561ba471f}, hash: 24FC5EE873D0A50BF64A050E47B252E9
	@Disabled()
	@Test()
	void convert1WhenDelegateCanConvertSourceTypeTargetType() {
		/* Branches:
		 * (source == null) : false
		 * (for-each(this.delegates)) : true  #  inside convert method
		 * (delegate.canConvert(sourceType, targetType)) : true  #  inside convert method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<TypeDescriptor> typeDescriptor = mockStatic(TypeDescriptor.class)) {
			Object object = new Object();
			typeDescriptor.when(() -> TypeDescriptor.forObject(object)).thenReturn(typeDescriptorMock);
			ConversionService conversionService = ApplicationConversionService.getSharedInstance();
			List<ConversionService> conversionServiceList = new ArrayList<>();
			conversionServiceList.add(conversionService);
			BindConverter target = BindConverter.get(conversionServiceList, (Consumer) null);
			Annotation[] annotationArray = new Annotation[] {};
			//Act Statement(s)
			Object result = target.convert(object, resolvableTypeMock, annotationArray);
			//Assert statement(s)
			//TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				typeDescriptor.verify(() -> TypeDescriptor.forObject(object), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${28330c3e-868a-37df-b436-0d4d42720d6d}, hash: 7B7FC9C03CAC66F67D6B327107A551B9
	@Disabled()
	@Test()
	void convert1WhenFailureIsNullThrowsConverterNotFoundException() {
		/* Branches:
		 * (source == null) : false
		 * (for-each(this.delegates)) : true  #  inside convert method
		 * (delegate.canConvert(sourceType, targetType)) : false  #  inside convert method
		 * (failure != null) : false  #  inside convert method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<TypeDescriptor> typeDescriptor = mockStatic(TypeDescriptor.class);
			 MockedStatic<ApplicationConversionService> applicationConversionService = mockStatic(ApplicationConversionService.class)) {
			ConversionService conversionService = ApplicationConversionService.getSharedInstance();
			applicationConversionService.when(() -> ApplicationConversionService.getSharedInstance()).thenReturn(conversionService).thenReturn(conversionServiceMock);
			doReturn(false).when(conversionServiceMock).canConvert(eq(typeDescriptorMock), (TypeDescriptor) any());
			Object object = new Object();
			typeDescriptor.when(() -> TypeDescriptor.forObject(object)).thenReturn(typeDescriptorMock);
			List<ConversionService> conversionServiceList = new ArrayList<>();
			conversionServiceList.add(conversionService);
			BindConverter target = BindConverter.get(conversionServiceList, (Consumer) null);
			Annotation[] annotationArray = new Annotation[] {};
			//Act Statement(s)
			Object result = target.convert(object, resolvableTypeMock, annotationArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				applicationConversionService.verify(() -> ApplicationConversionService.getSharedInstance(), atLeast(2));
				verify(conversionServiceMock).canConvert(eq(typeDescriptorMock), (TypeDescriptor) any());
				typeDescriptor.verify(() -> TypeDescriptor.forObject(object), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a2e4648d-e299-340f-9e00-eb9238f344ed}, hash: C83DE22297BF15044B57EDE621755A9B
	@Disabled()
	@Test()
	void convert1WhenFailureIsNotNullThrowsConversionFailedException() {
		/* Branches:
		 * (source == null) : false
		 * (for-each(this.delegates)) : true  #  inside convert method
		 * (delegate.canConvert(sourceType, targetType)) : true  #  inside convert method
		 * (catch-exception (ConversionException)) : true  #  inside convert method
		 * (failure == null) : true  #  inside convert method
		 * (ex instanceof ConversionFailedException) : true  #  inside convert method
		 * (failure != null) : true  #  inside convert method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<TypeDescriptor> typeDescriptor = mockStatic(TypeDescriptor.class);
			 MockedStatic<ApplicationConversionService> applicationConversionService = mockStatic(ApplicationConversionService.class)) {
			ConversionService conversionService = ApplicationConversionService.getSharedInstance();
			applicationConversionService.when(() -> ApplicationConversionService.getSharedInstance()).thenReturn(conversionService).thenReturn(conversionServiceMock);
			doReturn(true).when(conversionServiceMock).canConvert(eq(typeDescriptorMock), (TypeDescriptor) any());
			Object object = new Object();
			Object object2 = new Object();
			doReturn(object).when(conversionServiceMock).convert(eq(object2), eq(typeDescriptorMock), (TypeDescriptor) any());
			typeDescriptor.when(() -> TypeDescriptor.forObject(object2)).thenReturn(typeDescriptorMock);
			List<ConversionService> conversionServiceList = new ArrayList<>();
			conversionServiceList.add(conversionService);
			BindConverter target = BindConverter.get(conversionServiceList, (Consumer) null);
			Annotation[] annotationArray = new Annotation[] {};
			//Act Statement(s)
			final ConversionFailedException result = assertThrows(ConversionFailedException.class, () -> {
				target.convert(object2, resolvableTypeMock, annotationArray);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				applicationConversionService.verify(() -> ApplicationConversionService.getSharedInstance(), atLeast(2));
				verify(conversionServiceMock).canConvert(eq(typeDescriptorMock), (TypeDescriptor) any());
				verify(conversionServiceMock).convert(eq(object2), eq(typeDescriptorMock), (TypeDescriptor) any());
				typeDescriptor.verify(() -> TypeDescriptor.forObject(object2), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${082f5b7e-1fb1-3833-bcdf-bd53002ca1fa}, hash: 8942704AB9EE0D915C53010A4AFA9FC5
	@Disabled()
	@Test()
	void convert1WhenExInstanceOfConversionFailedExceptionAndFailureIsNullThrowsConverterNotFoundException() {
		/* Branches:
		 * (source == null) : false
		 * (for-each(this.delegates)) : true  #  inside convert method
		 * (delegate.canConvert(sourceType, targetType)) : true  #  inside convert method
		 * (catch-exception (ConversionException)) : true  #  inside convert method
		 * (failure == null) : true  #  inside convert method
		 * (ex instanceof ConversionFailedException) : true  #  inside convert method
		 * (failure != null) : false  #  inside convert method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<TypeDescriptor> typeDescriptor = mockStatic(TypeDescriptor.class);
			 MockedStatic<ApplicationConversionService> applicationConversionService = mockStatic(ApplicationConversionService.class)) {
			ConversionService conversionService = ApplicationConversionService.getSharedInstance();
			applicationConversionService.when(() -> ApplicationConversionService.getSharedInstance()).thenReturn(conversionService).thenReturn(conversionServiceMock);
			doReturn(true).when(conversionServiceMock).canConvert(eq(typeDescriptorMock), (TypeDescriptor) any());
			Object object = new Object();
			Object object2 = new Object();
			doReturn(object).when(conversionServiceMock).convert(eq(object2), eq(typeDescriptorMock), (TypeDescriptor) any());
			typeDescriptor.when(() -> TypeDescriptor.forObject(object2)).thenReturn(typeDescriptorMock);
			List<ConversionService> conversionServiceList = new ArrayList<>();
			conversionServiceList.add(conversionService);
			BindConverter target = BindConverter.get(conversionServiceList, (Consumer) null);
			Annotation[] annotationArray = new Annotation[] {};
			//Act Statement(s)
			Object result = target.convert(object2, resolvableTypeMock, annotationArray);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				applicationConversionService.verify(() -> ApplicationConversionService.getSharedInstance(), atLeast(2));
				verify(conversionServiceMock).canConvert(eq(typeDescriptorMock), (TypeDescriptor) any());
				verify(conversionServiceMock).convert(eq(object2), eq(typeDescriptorMock), (TypeDescriptor) any());
				typeDescriptor.verify(() -> TypeDescriptor.forObject(object2), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${97922747-d2e0-334c-b575-09f5ae7204bf}, hash: 643DD40E39DFE66AC889177BFB69E03B
	@Test()
	void getWhenPropertyEditorInitializerIsNullAndNotSharedApplicationConversionServiceAndDefaultBranchAndDefaultBranch() {
		/* Branches:
		 * (conversionServices == null) : false
		 * (conversionServices.size() == 1) : true
		 * (conversionServices.get(0) == ApplicationConversionService.getSharedInstance()) : false
		 * (propertyEditorInitializer == null) : true
		 * (sharedApplicationConversionService) : false
		 * (branch expression (line 66)) : true  #  inside <init> method
		 * (branch expression (line 72)) : false  #  inside <init> method
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class)) {
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(true);
			List<ConversionService> conversionServiceList = new ArrayList<>();
			conversionServiceList.add(conversionServiceMock);
			Consumer<PropertyEditorRegistry> consumer = null;
			//Act Statement(s)
			BindConverter result = BindConverter.get(conversionServiceList, consumer);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()));
			});
		}
	}

	//Sapient generated method id: ${adadfc4b-c9e9-3b1b-9bf3-0bcd3fc33366}, hash: 31ECF2EAABDFE4113C997543529DC341
	@Test()
	void getWhenSharedApplicationConversionServiceAndSharedInstanceIsNullAndDefaultBranchAndDefaultBranch() {
		/* Branches:
		 * (conversionServices == null) : false
		 * (conversionServices.size() == 1) : true
		 * (conversionServices.get(0) == ApplicationConversionService.getSharedInstance()) : true
		 * (propertyEditorInitializer == null) : true
		 * (sharedApplicationConversionService) : true
		 * (sharedInstance == null) : true  #  inside getSharedInstance method
		 * (branch expression (line 66)) : true  #  inside <init> method
		 * (branch expression (line 72)) : false  #  inside <init> method
		 */
		//Arrange Statement(s)
		ConversionService conversionService = ApplicationConversionService.getSharedInstance();
		List<ConversionService> conversionServiceList = new ArrayList<>();
		conversionServiceList.add(conversionService);
		Consumer<PropertyEditorRegistry> consumer = null;
		//Act Statement(s)
		BindConverter result = BindConverter.get(conversionServiceList, consumer);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${5afd3037-c406-329e-b56c-16a27205f96d}, hash: 42BC126ABDB7A7BCE6F462331F99BA7E
	@Test()
	void getWhenDefaultBranchAndDefaultBranchAndDefaultBranch() {
		/* Branches:
		 * (conversionServices == null) : false
		 * (conversionServices.size() == 1) : true
		 * (conversionServices.get(0) == ApplicationConversionService.getSharedInstance()) : true
		 * (propertyEditorInitializer == null) : false
		 * (branch expression (line 66)) : false  #  inside <init> method
		 * (branch expression (line 67)) : true  #  inside <init> method
		 * (branch expression (line 69)) : false  #  inside <init> method
		 * (branch expression (line 72)) : true  #  inside <init> method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class)) {
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(false);
			List<ConversionService> conversionServiceList = new ArrayList<>();
			//Act Statement(s)
			BindConverter result = BindConverter.get(conversionServiceList, consumerMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()));
			});
		}
	}

	//Sapient generated method id: ${79e5a6f2-24df-3d46-9042-788f5d4df01c}, hash: 4209B759257D202612D6B0378AA39863
	@Test()
	void getWhenDefaultBranchAndDefaultBranchAndDefaultBranchAndDefaultBranch() {
		/* Branches:
		 * (conversionServices == null) : false
		 * (conversionServices.size() == 1) : true
		 * (conversionServices.get(0) == ApplicationConversionService.getSharedInstance()) : true
		 * (propertyEditorInitializer == null) : false
		 * (branch expression (line 66)) : false  #  inside <init> method
		 * (branch expression (line 67)) : true  #  inside <init> method
		 * (branch expression (line 69)) : false  #  inside <init> method
		 * (branch expression (line 72)) : false  #  inside <init> method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class)) {
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(false);
			List<ConversionService> conversionServiceList = new ArrayList<>();
			//Act Statement(s)
			BindConverter result = BindConverter.get(conversionServiceList, consumerMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()));
			});
		}
	}
}
