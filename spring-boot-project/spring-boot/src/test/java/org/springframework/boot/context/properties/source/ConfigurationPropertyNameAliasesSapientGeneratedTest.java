package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.util.MultiValueMap;

import org.mockito.stubbing.Answer;

import java.util.Map;
import java.util.Iterator;
import java.util.Set;

import org.springframework.util.Assert;

import java.util.HashSet;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static java.util.Map.entry;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertyNameAliasesSapientGeneratedTest {

	private final MultiValueMap<ConfigurationPropertyName, ConfigurationPropertyName> aliasesMock = mock(MultiValueMap.class, "aliases");

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final ConfigurationPropertyName configurationPropertyNameMock2 = mock(ConfigurationPropertyName.class);

	//Sapient generated method id: ${33fd4f79-ef2b-3f30-ac75-a869eebecb94}, hash: 16FA179A2AEC5900D5C9A7007D52D760
	@Disabled()
	@Test()
	void addAliasesTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class)) {
			_assert.when(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName[] configurationPropertyNameArray = new ConfigurationPropertyName[] {};
			_assert.when(() -> Assert.notNull(configurationPropertyNameArray, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("A")).thenReturn(configurationPropertyNameMock).thenReturn(configurationPropertyNameMock2);
			_assert.when(() -> Assert.notNull(configurationPropertyNameMock2, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName[] configurationPropertyNameArray2 = new ConfigurationPropertyName[] {};
			_assert.when(() -> Assert.notNull(configurationPropertyNameArray2, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] {};
			ConfigurationPropertyNameAliases target = new ConfigurationPropertyNameAliases("A", stringArray);
			List<ConfigurationPropertyName> configurationPropertyNameList = new ArrayList<>();
			doNothing().when(aliasesMock).addAll(configurationPropertyNameMock, configurationPropertyNameList);
			List<ConfigurationPropertyName> configurationPropertyNameList2 = new ArrayList<>();
			doNothing().when(aliasesMock).addAll(configurationPropertyNameMock2, configurationPropertyNameList2);
			//Act Statement(s)
			target.addAliases("A", stringArray);
			//Assert statement(s)
			assertAll("result", () -> {
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("A"), atLeast(2));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameArray, "Aliases must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameMock2, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameArray2, "Aliases must not be null"), atLeast(1));
				verify(aliasesMock, atLeast(1)).addAll(configurationPropertyNameMock, configurationPropertyNameList);
				verify(aliasesMock, atLeast(1)).addAll(configurationPropertyNameMock2, configurationPropertyNameList2);
			});
		}
	}

	//Sapient generated method id: ${b5f7e64d-074b-3fc8-8adc-0fbfe842d7c3}, hash: EAEC4B083B0BF7DAAB22B823047358C0
	@Disabled()
	@Test()
	void addAliases1Test() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class)) {
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("A")).thenReturn(configurationPropertyNameMock);
			_assert.when(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName[] configurationPropertyNameArray = new ConfigurationPropertyName[] {};
			_assert.when(() -> Assert.notNull(configurationPropertyNameArray, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] {};
			ConfigurationPropertyNameAliases target = new ConfigurationPropertyNameAliases("A", stringArray);
			List<ConfigurationPropertyName> configurationPropertyNameList = new ArrayList<>();
			doNothing().when(aliasesMock).addAll(configurationPropertyNameMock, configurationPropertyNameList);
			List<ConfigurationPropertyName> configurationPropertyNameList2 = new ArrayList<>();
			doNothing().when(aliasesMock).addAll(configurationPropertyNameMock, configurationPropertyNameList2);
			//Act Statement(s)
			target.addAliases(configurationPropertyNameMock, configurationPropertyNameArray);
			//Assert statement(s)
			assertAll("result", () -> {
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("A"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null"), atLeast(2));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameArray, "Aliases must not be null"), atLeast(2));
				verify(aliasesMock, atLeast(1)).addAll(configurationPropertyNameMock, configurationPropertyNameList);
				verify(aliasesMock, atLeast(1)).addAll(configurationPropertyNameMock, configurationPropertyNameList2);
			});
		}
	}

	//Sapient generated method id: ${0908a3eb-ee31-39d4-afd0-d5ce03bae9cd}, hash: B1C8DFDA107FB32EE8EBE4214CC8BFB7
	@Disabled()
	@Test()
	void getAliasesTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class)) {
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("A")).thenReturn(configurationPropertyNameMock);
			_assert.when(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName[] configurationPropertyNameArray = new ConfigurationPropertyName[] {};
			_assert.when(() -> Assert.notNull(configurationPropertyNameArray, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] {};
			ConfigurationPropertyNameAliases target = new ConfigurationPropertyNameAliases("A", stringArray);
			List<ConfigurationPropertyName> configurationPropertyNameList = new ArrayList<>();
			doNothing().when(aliasesMock).addAll(configurationPropertyNameMock, configurationPropertyNameList);
			List list = new ArrayList<>();
			List list2 = new ArrayList<>();
			doReturn(list).when(aliasesMock).getOrDefault(configurationPropertyNameMock2, list2);
			//Act Statement(s)
			List<ConfigurationPropertyName> result = target.getAliases(configurationPropertyNameMock2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(list));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("A"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameArray, "Aliases must not be null"), atLeast(1));
				verify(aliasesMock, atLeast(1)).addAll(configurationPropertyNameMock, configurationPropertyNameList);
				verify(aliasesMock, atLeast(1)).getOrDefault(configurationPropertyNameMock2, list2);
			});
		}
	}

	//Sapient generated method id: ${2ba754dc-302b-3b6f-9784-0e2c63277668}, hash: AC4A516EAC542CABAE38DB02429D3455
	@Disabled()
	@Test()
	void getNameForAliasWhenDefaultBranch() {
		/* Branches:
		 * (branch expression (line 72)) : true
		 */
		//Arrange Statement(s)
		ConfigurationPropertyName configurationPropertyName2Mock = mock(ConfigurationPropertyName.class);
		ConfigurationPropertyName configurationPropertyName2Mock2 = mock(ConfigurationPropertyName.class);
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class)) {
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("A")).thenReturn(configurationPropertyNameMock);
			_assert.when(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName[] configurationPropertyNameArray = new ConfigurationPropertyName[] {};
			_assert.when(() -> Assert.notNull(configurationPropertyNameArray, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] {};
			ConfigurationPropertyNameAliases target = new ConfigurationPropertyNameAliases("A", stringArray);
			List<ConfigurationPropertyName> configurationPropertyNameList = new ArrayList<>();
			doNothing().when(aliasesMock).addAll(configurationPropertyNameMock, configurationPropertyNameList);
			List list = new ArrayList<>();
			list.add(configurationPropertyName2Mock2);
			Set<Map.Entry<Object, Object>> mapEntryObjectObjectSet = new HashSet<>();
			mapEntryObjectObjectSet.add(entry(configurationPropertyName2Mock, list));
			doReturn(mapEntryObjectObjectSet).when(aliasesMock).entrySet();
			//Act Statement(s)
			ConfigurationPropertyName result = target.getNameForAlias(configurationPropertyName2Mock2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyName2Mock));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("A"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameArray, "Aliases must not be null"), atLeast(1));
				verify(aliasesMock, atLeast(1)).addAll(configurationPropertyNameMock, configurationPropertyNameList);
				verify(aliasesMock, atLeast(1)).entrySet();
			});
		}
	}

	//Sapient generated method id: ${7d45f9ca-df10-3434-98de-4f72063d0581}, hash: 9C6DA6D63383A53D3F33D11A1BB4CB8A
	@Disabled()
	@Test()
	void getNameForAliasWhenDefaultBranch2() {
		/* Branches:
		 * (branch expression (line 72)) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class)) {
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("A")).thenReturn(configurationPropertyNameMock);
			_assert.when(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName[] configurationPropertyNameArray = new ConfigurationPropertyName[] {};
			_assert.when(() -> Assert.notNull(configurationPropertyNameArray, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] {};
			ConfigurationPropertyNameAliases target = new ConfigurationPropertyNameAliases("A", stringArray);
			List<ConfigurationPropertyName> configurationPropertyNameList = new ArrayList<>();
			doNothing().when(aliasesMock).addAll(configurationPropertyNameMock, configurationPropertyNameList);
			Object object = new Object();
			List list = new ArrayList<>();
			Set<Map.Entry<Object, Object>> mapEntryObjectObjectSet = new HashSet<>();
			mapEntryObjectObjectSet.add(entry(object, list));
			doReturn(mapEntryObjectObjectSet).when(aliasesMock).entrySet();
			//Act Statement(s)
			ConfigurationPropertyName result = target.getNameForAlias(configurationPropertyNameMock2);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("A"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameArray, "Aliases must not be null"), atLeast(1));
				verify(aliasesMock, atLeast(1)).addAll(configurationPropertyNameMock, configurationPropertyNameList);
				verify(aliasesMock, atLeast(1)).entrySet();
			});
		}
	}

	//Sapient generated method id: ${78c09fb6-edcf-3ce7-9932-6ef4ffc152b3}, hash: 3F826B60354FCFD67C7D855A5273298F
	@Disabled()
	@Test()
	void iteratorTest() {
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class, CALLS_REAL_METHODS);
			 MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class)) {
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("A")).thenReturn(configurationPropertyNameMock);
			_assert.when(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName[] configurationPropertyNameArray = new ConfigurationPropertyName[] {};
			_assert.when(() -> Assert.notNull(configurationPropertyNameArray, "Aliases must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			String[] stringArray = new String[] {};
			ConfigurationPropertyNameAliases target = new ConfigurationPropertyNameAliases("A", stringArray);
			List<ConfigurationPropertyName> configurationPropertyNameList = new ArrayList<>();
			doNothing().when(aliasesMock).addAll(configurationPropertyNameMock, configurationPropertyNameList);
			Set set = new HashSet<>();
			doReturn(set).when(aliasesMock).keySet();
			//Act Statement(s)
			Iterator<ConfigurationPropertyName> result = target.iterator();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("A"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameMock, "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(configurationPropertyNameArray, "Aliases must not be null"), atLeast(1));
				verify(aliasesMock, atLeast(1)).addAll(configurationPropertyNameMock, configurationPropertyNameList);
				verify(aliasesMock, atLeast(1)).keySet();
			});
		}
	}
}
