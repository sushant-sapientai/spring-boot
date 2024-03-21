package org.springframework.boot.context.properties.bind;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.boot.origin.Origin;
import org.springframework.core.ResolvableType;
import org.springframework.boot.context.properties.source.ConfigurationPropertySource;
import org.springframework.boot.context.properties.source.ConfigurationProperty;
import org.springframework.core.CollectionFactory;

import java.util.Map;
import java.util.HashMap;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import org.springframework.boot.context.properties.source.ConfigurationPropertyName;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MapBinderSapientGeneratedTest {

	private final AggregateElementBinder aggregateElementBinderMock = mock(AggregateElementBinder.class);

	private final Binder.Context binderContextMock = mock(Binder.Context.class);

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final Iterable iterableMock = mock(Iterable.class);

	private final Iterable iterableMock2 = mock(Iterable.class);

	private final ResolvableType resolvableTypeMock = mock(ResolvableType.class);

	private final Supplier supplierMock = mock(Supplier.class);

	private final Bindable targetMock = mock(Bindable.class);

	//Sapient generated method id: ${0ccd0b70-9ed9-3d5e-b132-40d474602358}, hash: D77A6DBA8DFB0FD738066710D1C6D675
	@Test()
	void isAllowRecursiveBindingTest() {
		//Arrange Statement(s)
		MapBinder target = new MapBinder(binderContextMock);
		ConfigurationPropertySource configurationPropertySourceMock = mock(ConfigurationPropertySource.class);
		//Act Statement(s)
		boolean result = target.isAllowRecursiveBinding(configurationPropertySourceMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
	}

	//Sapient generated method id: ${0429d3b4-4624-32a1-a21f-c785100948e3}, hash: AE9D6983D7FCCC1343F44835471EDAE8
	@Disabled()
	@Test()
	void bindAggregateWhenSourceContainsDescendantOfNameNotEqualsConfigurationPropertyStatePRESENTAndGetContextGetSourcesIsEmpty() {
		/* Branches:
		 * (target.getValue() != null) : true
		 * (Properties.class.isAssignableFrom(type)) : true  #  inside resolveTarget method
		 * (for-each(getContext().getSources())) : true  #  inside hasDescendants method
		 * (source.containsDescendantOf(name) == ConfigurationPropertyState.PRESENT) : false  #  inside hasDescendants method
		 * (for-each(getContext().getSources())) : false
		 * (map.isEmpty()) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
			doReturn(supplierMock).when(targetMock).getValue();
			doReturn(resolvableTypeMock).when(targetMock).getType();
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			doReturn(iterableMock, iterableMock2).when(binderContextMock).getSources();
			Object object = new Object();
			Object object2 = new Object();
			Map<Object, Object> objectObjectMap = new HashMap<>();
			objectObjectMap.put(object, object2);
			collectionFactory.when(() -> CollectionFactory.createMap(Map.class, 0)).thenReturn(objectObjectMap);
			MapBinder target = new MapBinder(binderContextMock);
			//Act Statement(s)
			Object result = target.bindAggregate(configurationPropertyNameMock, targetMock, aggregateElementBinderMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(objectObjectMap));
				verify(targetMock).getValue();
				verify(targetMock).getType();
				verify(resolvableTypeMock).resolve(Object.class);
				verify(binderContextMock, times(2)).getSources();
				collectionFactory.verify(() -> CollectionFactory.createMap(Map.class, 0), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${cfe7afa0-41c8-3000-b925-7b367a552635}, hash: 986936916F48CC49392E9A7F4CBD0114
	@Disabled()
	@Test()
	void bindAggregateWhenNotHasDescendants() {
		/* Branches:
		 * (target.getValue() != null) : false
		 * (Properties.class.isAssignableFrom(type)) : false  #  inside resolveTarget method
		 * (for-each(getContext().getSources())) : false  #  inside hasDescendants method
		 * (for-each(getContext().getSources())) : true
		 * (!ConfigurationPropertyName.EMPTY.equals(name)) : true
		 * (property != null) : true
		 * (!hasDescendants) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: EMPTY
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Origin originMock = mock(Origin.class);
		PlaceholdersResolver placeholdersResolverMock = mock(PlaceholdersResolver.class);
		BindConverter bindConverterMock = mock(BindConverter.class);
		ConfigurationPropertyName configurationPropertyNameMock2 = mock(ConfigurationPropertyName.class);
		try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
			doReturn(null).when(targetMock).getValue();
			doReturn(resolvableTypeMock).when(targetMock).getType();
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			doReturn(iterableMock, iterableMock2).when(binderContextMock).getSources();
			Object object = new Object();
			ConfigurationProperty configurationProperty = new ConfigurationProperty(configurationPropertyNameMock, object, originMock);
			doNothing().when(binderContextMock).setConfigurationProperty(configurationProperty);
			doReturn(placeholdersResolverMock).when(binderContextMock).getPlaceholdersResolver();
			Object object2 = new Object();
			doReturn(object2).when(placeholdersResolverMock).resolvePlaceholders(object);
			doReturn(bindConverterMock).when(binderContextMock).getConverter();
			Object object3 = new Object();
			doReturn(object3).when(bindConverterMock).convert(object2, targetMock);
			Map<Object, Object> objectObjectMap = new HashMap<>();
			collectionFactory.when(() -> CollectionFactory.createMap(Object.class, 0)).thenReturn(objectObjectMap);
			MapBinder target = new MapBinder(binderContextMock);
			//Act Statement(s)
			Object result = target.bindAggregate(configurationPropertyNameMock2, targetMock, aggregateElementBinderMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(object3));
				verify(targetMock).getValue();
				verify(targetMock, times(2)).getType();
				verify(resolvableTypeMock, times(2)).resolve(Object.class);
				verify(binderContextMock, times(2)).getSources();
				verify(binderContextMock).setConfigurationProperty(configurationProperty);
				verify(binderContextMock).getPlaceholdersResolver();
				verify(placeholdersResolverMock).resolvePlaceholders(object);
				verify(binderContextMock).getConverter();
				verify(bindConverterMock).convert(object2, targetMock);
				collectionFactory.verify(() -> CollectionFactory.createMap(Object.class, 0), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${00271470-6796-3b1a-b8b6-61156b9f56df}, hash: B2FABC5CAE2A12D3D5C9EA4D4678B7F3
	@Disabled()
	@Test()
	void bindAggregateWhenHasDescendantsAndMapIsEmpty() {
		/* Branches:
		 * (target.getValue() != null) : true
		 * (Properties.class.isAssignableFrom(type)) : true  #  inside resolveTarget method
		 * (for-each(getContext().getSources())) : true  #  inside hasDescendants method
		 * (source.containsDescendantOf(name) == ConfigurationPropertyState.PRESENT) : true  #  inside hasDescendants method
		 * (for-each(getContext().getSources())) : true
		 * (!ConfigurationPropertyName.EMPTY.equals(name)) : true
		 * (property != null) : true
		 * (!hasDescendants) : false
		 * (map.isEmpty()) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: EMPTY, object of type MapBinder.EntryBinder
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigurationPropertyName nameMock = mock(ConfigurationPropertyName.class);
		try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
			doReturn(false).when(nameMock).isAncestorOf(configurationPropertyNameMock);
			doReturn(supplierMock).when(targetMock).getValue();
			doReturn(resolvableTypeMock).when(targetMock).getType();
			doReturn(Object.class).when(resolvableTypeMock).resolve(Object.class);
			doReturn(iterableMock, iterableMock2).when(binderContextMock).getSources();
			Map<Object, Object> objectObjectMap = new HashMap<>();
			collectionFactory.when(() -> CollectionFactory.createMap(Map.class, 0)).thenReturn(objectObjectMap);
			MapBinder target = new MapBinder(binderContextMock);
			//Act Statement(s)
			Object result = target.bindAggregate(nameMock, targetMock, aggregateElementBinderMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				verify(nameMock).isAncestorOf(configurationPropertyNameMock);
				verify(targetMock).getValue();
				verify(targetMock).getType();
				verify(resolvableTypeMock).resolve(Object.class);
				verify(binderContextMock, times(2)).getSources();
				collectionFactory.verify(() -> CollectionFactory.createMap(Map.class, 0), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${91ba369a-239b-3e45-b8e1-cb063d5608a8}, hash: C7FE68C066C4AB961C08377A8713EDBE
	@Test()
	void merge1WhenExistingMapIsNull() throws Exception {
		/* Branches:
		 * (existingMap == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		MapBinder target = new MapBinder(binderContextMock);
		Map<Object, Object> objectObjectMap = new HashMap<>();
		//Act Statement(s)
		Map<Object, Object> result = target.merge(supplierMock, objectObjectMap);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(objectObjectMap)));
	}

	//Sapient generated method id: ${baceb4bb-acee-3db0-81c8-75be54bb55cc}, hash: DAE8913C1DE9DCDC5A63C9B65765C702
	@Disabled()
	@Test()
	void merge1WhenExistingMapIsNotNull() throws Exception {
		/* Branches:
		 * (existingMap == null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
			Map<Object, Object> objectObjectMap = new HashMap<>();
			collectionFactory.when(() -> CollectionFactory.createMap(HashMap.class, 0)).thenReturn(objectObjectMap);
			MapBinder target = new MapBinder(binderContextMock);
			Map<Object, Object> objectObjectMap2 = new HashMap<>();
			//Act Statement(s)
			Map<Object, Object> result = target.merge(supplierMock, objectObjectMap2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(objectObjectMap));
				collectionFactory.verify(() -> CollectionFactory.createMap(HashMap.class, 0), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${27ad051d-497e-338e-959d-4de0373f3c6e}, hash: D6D60BEB0CDEB4627D6DBB15961E6D83
	@Disabled()
	@Test()
	void merge1WhenCaughtUnsupportedOperationException() throws Exception {
		/* Branches:
		 * (existingMap == null) : false
		 * (catch-exception (UnsupportedOperationException)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
			Map<Object, Object> objectObjectMap = new HashMap<>();
			Map<Object, Object> objectObjectMap2 = new HashMap<>();
			collectionFactory.when(() -> CollectionFactory.createMap(HashMap.class, 0)).thenReturn(objectObjectMap).thenReturn(objectObjectMap2);
			MapBinder target = new MapBinder(binderContextMock);
			Map<Object, Object> objectObjectMap3 = new HashMap<>();
			//Act Statement(s)
			Map<Object, Object> result = target.merge(supplierMock, objectObjectMap3);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(objectObjectMap2));
				collectionFactory.verify(() -> CollectionFactory.createMap(HashMap.class, 0), atLeast(2));
			});
		}
	}

	//Sapient generated method id: ${e452e94b-b1fe-3a3a-8001-5d8d839829f7}, hash: A7D6237122A8400FA6131B9AFCC3E471
	@Disabled()
	@Test()
	void merge1WhenCaughtException() throws Exception {
		/* Branches:
		 * (existingMap == null) : false
		 * (catch-exception (Exception)) : true  #  inside copyIfPossible method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionFactory> collectionFactory = mockStatic(CollectionFactory.class)) {
			Map<Object, Object> objectObjectMap = new HashMap<>();
			collectionFactory.when(() -> CollectionFactory.createMap(HashMap.class, 0)).thenReturn(objectObjectMap);
			MapBinder target = new MapBinder(binderContextMock);
			Map<Object, Object> objectObjectMap2 = new HashMap<>();
			//Act Statement(s)
			Map<Object, Object> result = target.merge(supplierMock, objectObjectMap2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				collectionFactory.verify(() -> CollectionFactory.createMap(HashMap.class, 0), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${d9cc4214-14b6-3b98-b4df-71cfb9766bf1}, hash: 6C5678588B9EF10B58414ACF3DD6D033
	@Test()
	void merge1WhenCaughtExceptionAndExistingMapIsNull() throws Exception {
		/* Branches:
		 * (catch-exception (Exception)) : true  #  inside getExistingIfPossible method
		 * (existingMap == null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		MapBinder target = new MapBinder(binderContextMock);
		Map<Object, Object> objectObjectMap = new HashMap<>();
		//Act Statement(s)
		Map<Object, Object> result = target.merge(supplierMock, objectObjectMap);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(objectObjectMap)));
	}
}
