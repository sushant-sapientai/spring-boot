package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.boot.context.properties.bind.Binder;

import java.util.Spliterator;

import org.springframework.core.env.PropertySource;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

import org.springframework.boot.context.properties.source.ConfigurationPropertySource;

import java.util.Iterator;
import java.util.stream.Stream;

import org.mockito.MockedStatic;

import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigDataEnvironmentContributorSapientGeneratedTest {

	private final ConfigDataProperties propertiesMock = mock(ConfigDataProperties.class, "properties");

	private final ConfigData.Options configDataOptionsMock = mock(ConfigData.Options.class, "<init>_configData.Options1");

	private final ConfigDataActivationContext configDataActivationContextMock = mock(ConfigDataActivationContext.class);

	private final ConfigDataEnvironmentContributor configDataEnvironmentContributorMock = mock(ConfigDataEnvironmentContributor.class);

	private final ConfigDataEnvironmentContributor configDataEnvironmentContributorMock2 = mock(ConfigDataEnvironmentContributor.class);

	private final ConfigDataEnvironmentContributor configDataEnvironmentContributorMock3 = mock(ConfigDataEnvironmentContributor.class);

	private final ConfigDataLocation configDataLocationMock = mock(ConfigDataLocation.class);

	private final ConfigDataLocation configDataLocationMock2 = mock(ConfigDataLocation.class);

	private final ConfigData configDataMock = mock(ConfigData.class);

	private final ConfigData.Options configDataOptionsMock2 = mock(ConfigData.Options.class);

	private final ConfigDataResource configDataResourceMock = mock(ConfigDataResource.class);

	private final ConfigurationPropertySource configurationPropertySourceMock = mock(ConfigurationPropertySource.class);

	private final ConfigDataEnvironmentContributor contributorMock = mock(ConfigDataEnvironmentContributor.class);

	private final Iterable iterableMock = mock(Iterable.class);

	private final PropertySource propertySourceMock = mock(PropertySource.class);

	//Sapient generated method id: ${b82dc6ae-4476-3489-a96f-4da2ea20c9cb}, hash: 940B2C3EFCF1F4728C786FBAB7B88FC0
	@Test()
	void isActiveWhenThisKindEqualsKindUNBOUND_IMPORT() {
		/* Branches:
		 * (this.kind == Kind.UNBOUND_IMPORT) : true
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.UNBOUND_IMPORT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		//Act Statement(s)
		boolean result = target.isActive(configDataActivationContextMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}

	//Sapient generated method id: ${b86b554b-94f2-3468-8a27-64a0a2add7f5}, hash: 762B88C53F162C8D2F90ACA15AD5BCC9
	@Test()
	void isActiveWhenThisPropertiesIsActiveActivationContext() {
		/* Branches:
		 * (this.kind == Kind.UNBOUND_IMPORT) : false
		 * (this.properties == null) : false
		 * (this.properties.isActive(activationContext)) : true
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.EMPTY_LOCATION, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		doReturn(true).when(propertiesMock).isActive(configDataActivationContextMock);
		//Act Statement(s)
		boolean result = target.isActive(configDataActivationContextMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.TRUE));
			verify(propertiesMock).isActive(configDataActivationContextMock);
		});
	}

	//Sapient generated method id: ${9c24c612-1d61-373e-a5cd-99400a882c18}, hash: BC3F908D52EB1FC3B59BE5FA469ADB1B
	@Test()
	void isActiveWhenThisPropertiesNotIsActiveActivationContext() {
		/* Branches:
		 * (this.kind == Kind.UNBOUND_IMPORT) : false
		 * (this.properties == null) : false
		 * (this.properties.isActive(activationContext)) : false
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.EMPTY_LOCATION, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		doReturn(false).when(propertiesMock).isActive(configDataActivationContextMock);
		//Act Statement(s)
		boolean result = target.isActive(configDataActivationContextMock);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(propertiesMock).isActive(configDataActivationContextMock);
		});
	}

	//Sapient generated method id: ${668e06d3-b2e9-3b44-8e3e-b2ecd79641b4}, hash: 5243100BCBBAAC55FB1E99B66E411FA0
	@Test()
	void hasConfigDataOptionWhenThisConfigDataOptionsContainsOption() {
		/* Branches:
		 * (this.configDataOptions.contains(option)) : true
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		doReturn(true).when(configDataOptionsMock).contains(ConfigData.Option.IGNORE_IMPORTS);
		//Act Statement(s)
		boolean result = target.hasConfigDataOption(ConfigData.Option.IGNORE_IMPORTS);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.TRUE));
			verify(configDataOptionsMock).contains(ConfigData.Option.IGNORE_IMPORTS);
		});
	}

	//Sapient generated method id: ${a8840295-580a-3107-95a5-62e7b9e7a2fe}, hash: 3E62902359E5BFE9806AFE6BD50E993F
	@Test()
	void hasConfigDataOptionWhenThisConfigDataOptionsNotContainsOption() {
		/* Branches:
		 * (this.configDataOptions.contains(option)) : false
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		doReturn(false).when(configDataOptionsMock).contains(ConfigData.Option.IGNORE_IMPORTS);
		//Act Statement(s)
		boolean result = target.hasConfigDataOption(ConfigData.Option.IGNORE_IMPORTS);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(configDataOptionsMock).contains(ConfigData.Option.IGNORE_IMPORTS);
		});
	}

	//Sapient generated method id: ${913de6d1-b789-3f7d-b856-a91cf6080846}, hash: 43E93299643386522F1BA3BD0EB665D0
	@Test()
	void withoutConfigDataOptionWhenDefaultBranch() {
		/* Branches:
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		doReturn(configDataOptionsMock2).when(configDataOptionsMock).without(ConfigData.Option.IGNORE_IMPORTS);
		//Act Statement(s)
		ConfigDataEnvironmentContributor result = target.withoutConfigDataOption(ConfigData.Option.IGNORE_IMPORTS);
		//Assert statement(s)
		//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(configDataOptionsMock).without(ConfigData.Option.IGNORE_IMPORTS);
		});
	}

	//Sapient generated method id: ${3eb8ae14-246b-3884-a02b-627cbfcbf3e0}, hash: F9C4CBFAAC8534C0B6C9499C80D02BB2
	@Test()
	void withoutConfigDataOptionWhenDefaultBranchAndDefaultBranch() {
		/* Branches:
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 */
		//Arrange Statement(s)
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, (Map) null);
		doReturn(null).when(configDataOptionsMock).without(ConfigData.Option.IGNORE_IMPORTS);
		//Act Statement(s)
		ConfigDataEnvironmentContributor result = target.withoutConfigDataOption(ConfigData.Option.IGNORE_IMPORTS);
		//Assert statement(s)
		//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(configDataOptionsMock).without(ConfigData.Option.IGNORE_IMPORTS);
		});
	}

	//Sapient generated method id: ${f66955bf-846c-3890-a5a8-4f98933ac516}, hash: 565818CDA735B8BC5B3C49D9B72F2CC6
	@Test()
	void getImportsWhenThisPropertiesIsNotNull() {
		/* Branches:
		 * (this.properties != null) : true
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		List<ConfigDataLocation> configDataLocationList = new ArrayList<>();
		doReturn(configDataLocationList).when(propertiesMock).getImports();
		//Act Statement(s)
		List<ConfigDataLocation> result = target.getImports();
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(configDataLocationList));
			verify(propertiesMock).getImports();
		});
	}

	//Sapient generated method id: ${cef93e79-e2d5-3030-a6e2-c8787f016917}, hash: 8521DCF6B529E53AA623B271F28698D9
	@Test()
	void getImportsWhenThisPropertiesIsNull() {
		/* Branches:
		 * (this.properties != null) : false
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, (ConfigDataProperties) null, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		//Act Statement(s)
		List<ConfigDataLocation> result = target.getImports();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}

	//Sapient generated method id: ${1838affe-e765-3059-be77-1c45c8a0abb5}, hash: E17A48A0A1C50F8A48850208BA2758A7
	@Test()
	void hasUnprocessedImportsWhenGetImportsIsEmpty() {
		/* Branches:
		 * (getImports().isEmpty()) : true
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = spy(new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap));
		List<ConfigDataLocation> configDataLocationList = new ArrayList<>();
		doReturn(configDataLocationList).when(target).getImports();
		//Act Statement(s)
		boolean result = target.hasUnprocessedImports(ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(target).getImports();
		});
	}

	//Sapient generated method id: ${6ef93f2d-8c86-30ff-815d-8ce177c115db}, hash: CF1E1FC113B54C0403D9A70DC2B6DA9B
	@Test()
	void hasUnprocessedImportsWhenThisChildrenNotContainsKeyImportPhase() {
		/* Branches:
		 * (getImports().isEmpty()) : false
		 * (!this.children.containsKey(importPhase)) : true
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = spy(new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap));
		List<ConfigDataLocation> configDataLocationList = new ArrayList<>();
		configDataLocationList.add(configDataLocationMock2);
		doReturn(configDataLocationList).when(target).getImports();
		//Act Statement(s)
		boolean result = target.hasUnprocessedImports(ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.TRUE));
			verify(target).getImports();
		});
	}

	//Sapient generated method id: ${a1b9e28c-35e0-360d-a36d-8c9593efae85}, hash: 8142236F0BD84B03F7E4035E995DAAB1
	@Test()
	void hasUnprocessedImportsWhenThisChildrenContainsKeyImportPhase() {
		/* Branches:
		 * (getImports().isEmpty()) : false
		 * (!this.children.containsKey(importPhase)) : false
		 */
		//Arrange Statement(s)
		List<ConfigDataEnvironmentContributor> configDataEnvironmentContributorList = new ArrayList<>();
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap.put(ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION, configDataEnvironmentContributorList);
		ConfigDataEnvironmentContributor target = spy(new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap));
		List<ConfigDataLocation> configDataLocationList = new ArrayList<>();
		configDataLocationList.add(configDataLocationMock2);
		doReturn(configDataLocationList).when(target).getImports();
		//Act Statement(s)
		boolean result = target.hasUnprocessedImports(ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION);
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo(Boolean.FALSE));
			verify(target).getImports();
		});
	}

	//Sapient generated method id: ${a8397c57-384b-3d57-8cc8-8aa49c1f61dd}, hash: 05F4745F49F7A966671188C5850EE89C
	@Test()
	void getChildrenTest() {
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		//Act Statement(s)
		List<ConfigDataEnvironmentContributor> result = target.getChildren(ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result.size(), equalTo(0)));
	}

	//Sapient generated method id: ${b4af2388-e781-3800-820a-b8ede09bd914}, hash: E59ECF7554ACD41D617B8DDF8ED024B3
	@Test()
	void streamTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = spy(new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap));
		Spliterator spliteratorMock = mock(Spliterator.class);
		doReturn(spliteratorMock).when(target).spliterator();
		//Act Statement(s)
		Stream<ConfigDataEnvironmentContributor> result = target.stream();
		//Assert statement(s)
		//TODO: Please implement equals method in Stream for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(target).spliterator();
		});
	}

	//Sapient generated method id: ${78c09fb6-edcf-3ce7-9932-6ef4ffc152b3}, hash: D2B556A9835E51269E56D7608FC15299
	@Test()
	void iteratorTest() {
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		//Act Statement(s)
		Iterator<ConfigDataEnvironmentContributor> result = target.iterator();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${39d8d987-8ae8-34f4-9542-0c62340c8800}, hash: 7BC343EBFAAFE29BB43B4355FE548E39
	@Test()
	void withBoundPropertiesWhenDefaultBranchAndDefaultBranch() {
		/* Branches:
		 * (properties != null) : false
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.context.properties.bind.Binder
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigDataProperties> configDataProperties = mockStatic(ConfigDataProperties.class)) {
			configDataProperties.when(() -> ConfigDataProperties.get((Binder) any())).thenReturn(null);
			Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
			ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, (ConfigData.Options) null, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
			//Act Statement(s)
			ConfigDataEnvironmentContributor result = target.withBoundProperties(iterableMock, configDataActivationContextMock);
			//Assert statement(s)
			//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				configDataProperties.verify(() -> ConfigDataProperties.get((Binder) any()));
			});
		}
	}

	//Sapient generated method id: ${54ebdb6c-4004-3202-8032-07d8930855ae}, hash: B857CD5FE0F37AD057E8C1052F2FC0FF
	@Test()
	void withBoundPropertiesWhenThisConfigDataOptionsContainsConfigDataOptionIGNORE_IMPORTSAndDefaultBranchAndDefaultBranch() {
		/* Branches:
		 * (properties != null) : true
		 * (this.configDataOptions.contains(ConfigData.Option.IGNORE_IMPORTS)) : true
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  No constructor found to create an object without any exception for class org.springframework.boot.context.properties.bind.Binder
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigDataProperties configDataPropertiesMock = mock(ConfigDataProperties.class);
		ConfigDataProperties configDataPropertiesMock2 = mock(ConfigDataProperties.class);
		try (MockedStatic<ConfigDataProperties> configDataProperties = mockStatic(ConfigDataProperties.class)) {
			configDataProperties.when(() -> ConfigDataProperties.get((Binder) any())).thenReturn(configDataPropertiesMock);
			doReturn(configDataPropertiesMock2).when(configDataPropertiesMock).withoutImports();
			Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
			ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
			doReturn(true).when(configDataOptionsMock).contains(ConfigData.Option.IGNORE_IMPORTS);
			//Act Statement(s)
			ConfigDataEnvironmentContributor result = target.withBoundProperties(iterableMock, configDataActivationContextMock);
			//Assert statement(s)
			//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				configDataProperties.verify(() -> ConfigDataProperties.get((Binder) any()));
				verify(configDataPropertiesMock).withoutImports();
				verify(configDataOptionsMock, atLeast(1)).contains(ConfigData.Option.IGNORE_IMPORTS);
			});
		}
	}

	//Sapient generated method id: ${7f195377-6e5a-3f00-8510-1486f1d78813}, hash: 20BA0CD7F9CABAAE1BE0656C9A4BE874
	@Test()
	void withChildrenWhenDefaultBranchAndDefaultBranch() {
		/* Branches:
		 * (importPhase == ImportPhase.AFTER_PROFILE_ACTIVATION) : true
		 * (CollectionUtils.isEmpty(contributors)) : true  #  inside hasAnyProfileSpecificChildren method
		 * (!hasAnyProfileSpecificChildren(before)) : true  #  inside moveProfileSpecific method
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		List<ConfigDataEnvironmentContributor> configDataEnvironmentContributorList = new ArrayList<>();
		//Act Statement(s)
		ConfigDataEnvironmentContributor result = target.withChildren(ConfigDataEnvironmentContributor.ImportPhase.AFTER_PROFILE_ACTIVATION, configDataEnvironmentContributorList);
		//Assert statement(s)
		//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${395e5e51-3b18-3916-85d3-20ad3a325456}, hash: C64666A21C4F0032F85C00CF8FC1A926
	@Test()
	void withChildrenWhenHasAnyProfileSpecificChildrenNotBeforeAndDefaultBranchAndDefaultBranch() {
		/* Branches:
		 * (importPhase == ImportPhase.AFTER_PROFILE_ACTIVATION) : true
		 * (CollectionUtils.isEmpty(contributors)) : true  #  inside hasAnyProfileSpecificChildren method
		 * (!hasAnyProfileSpecificChildren(before)) : true  #  inside moveProfileSpecific method
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, (ConfigData.Options) null, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		List<ConfigDataEnvironmentContributor> configDataEnvironmentContributorList = new ArrayList<>();
		//Act Statement(s)
		ConfigDataEnvironmentContributor result = target.withChildren(ConfigDataEnvironmentContributor.ImportPhase.AFTER_PROFILE_ACTIVATION, configDataEnvironmentContributorList);
		//Assert statement(s)
		//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${3ebab24a-8ca0-37bb-946f-abeb0886c8dc}, hash: 738B7028607D19B60427896B7EE3994C
	@Test()
	void withReplacementWhenThisEqualsExisting() {
		/* Branches:
		 * (this == existing) : true
		 */
		//Arrange Statement(s)
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		//Act Statement(s)
		ConfigDataEnvironmentContributor result = target.withReplacement(target, configDataEnvironmentContributorMock);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(configDataEnvironmentContributorMock)));
	}

	//Sapient generated method id: ${6e1d0279-7698-3802-a61e-e60df88068c8}, hash: DCD76EE7AE6135E3784E97176B076C14
	@Test()
	void withReplacementWhenDefaultBranch() {
		/* Branches:
		 * (this == existing) : false
		 * (for-each(contributors)) : true  #  inside lambda$withReplacement$1 method
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 */
		//Arrange Statement(s)
		doReturn(configDataEnvironmentContributorMock).when(contributorMock).withReplacement(configDataEnvironmentContributorMock2, configDataEnvironmentContributorMock3);
		List<ConfigDataEnvironmentContributor> configDataEnvironmentContributorList = new ArrayList<>();
		configDataEnvironmentContributorList.add(contributorMock);
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap.put(ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION, configDataEnvironmentContributorList);
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		//Act Statement(s)
		ConfigDataEnvironmentContributor result = target.withReplacement(configDataEnvironmentContributorMock2, configDataEnvironmentContributorMock3);
		//Assert statement(s)
		//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(contributorMock).withReplacement(configDataEnvironmentContributorMock2, configDataEnvironmentContributorMock3);
		});
	}

	//Sapient generated method id: ${38d5fd0d-4e45-3edb-a0cd-634967433db2}, hash: CFA0EEB723AF7310E92B6DF54169B749
	@Test()
	void withReplacementWhenDefaultBranchAndDefaultBranch() {
		/* Branches:
		 * (this == existing) : false
		 * (for-each(contributors)) : true  #  inside lambda$withReplacement$1 method
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 */
		//Arrange Statement(s)
		doReturn(configDataEnvironmentContributorMock).when(contributorMock).withReplacement(configDataEnvironmentContributorMock2, configDataEnvironmentContributorMock3);
		List<ConfigDataEnvironmentContributor> configDataEnvironmentContributorList = new ArrayList<>();
		configDataEnvironmentContributorList.add(contributorMock);
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap.put(ConfigDataEnvironmentContributor.ImportPhase.BEFORE_PROFILE_ACTIVATION, configDataEnvironmentContributorList);
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.ROOT, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, (ConfigData.Options) null, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		//Act Statement(s)
		ConfigDataEnvironmentContributor result = target.withReplacement(configDataEnvironmentContributorMock2, configDataEnvironmentContributorMock3);
		//Assert statement(s)
		//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(contributorMock).withReplacement(configDataEnvironmentContributorMock2, configDataEnvironmentContributorMock3);
		});
	}

	//Sapient generated method id: ${f19e42ad-5ced-3742-8a45-a043b752aca3}, hash: 81DB3973E2D286213094D3DEECCCA2CA
	@Test()
	void toStringWhenThisChildrenGetOrDefaultImportPhaseAFTER_PROFILE_ACTIVATIONCollectionsEmptyListIsNotEmpty() {
		/* Branches:
		 * (for-each(this.children.getOrDefault(ImportPhase.BEFORE_PROFILE_ACTIVATION, Collections.emptyList()))) : true  #  inside buildToString method
		 * (for-each(this.children.getOrDefault(ImportPhase.AFTER_PROFILE_ACTIVATION, Collections.emptyList()))) : true  #  inside buildToString method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		ConfigDataLocation configDataLocationMock = mock(ConfigDataLocation.class, "<init>_configDataLocation1");
		ConfigDataResource configDataResourceMock = mock(ConfigDataResource.class, "<init>_configDataResource1");
		Map<ConfigDataEnvironmentContributor.ImportPhase, List<ConfigDataEnvironmentContributor>> configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap = new HashMap<>();
		ConfigDataEnvironmentContributor target = new ConfigDataEnvironmentContributor(ConfigDataEnvironmentContributor.Kind.EMPTY_LOCATION, configDataLocationMock, configDataResourceMock, false, propertySourceMock, configurationPropertySourceMock, propertiesMock, configDataOptionsMock, configDataEnvironmentContributorImportPhaseListConfigDataEnvironmentContributorMap);
		//Act Statement(s)
		String result = target.toString();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("EMPTY_LOCATION <init>_configDataLocation1 <init>_configDataResource1 <init>_configData.Options1\n")));
	}

	//Sapient generated method id: ${2e242bfc-9175-3742-b63c-1cb781c17d38}, hash: 8A0DE58AA3995AE579253A1CE15004C6
	@Test()
	void ofWhenDefaultBranch() {
		/* Branches:
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 */
		//Arrange Statement(s)
		List<ConfigDataEnvironmentContributor> configDataEnvironmentContributorList = new ArrayList<>();
		//Act Statement(s)
		ConfigDataEnvironmentContributor result = ConfigDataEnvironmentContributor.of(configDataEnvironmentContributorList);
		//Assert statement(s)
		//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${fb11a407-c270-352d-8aa0-eeda419d163d}, hash: 08A2B6D1D1A357CD3F45B119469BB013
	@Test()
	void ofWhenDefaultBranchAndDefaultBranch() {
		/* Branches:
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 */
		//Arrange Statement(s)
		List<ConfigDataEnvironmentContributor> configDataEnvironmentContributorList = new ArrayList<>();
		//Act Statement(s)
		ConfigDataEnvironmentContributor result = ConfigDataEnvironmentContributor.of(configDataEnvironmentContributorList);
		//Assert statement(s)
		//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${999886da-74d8-302b-a930-55a7c613f3f3}, hash: 23782B2211ABC5CD741BBC4384C53ACA
	@Test()
	void ofInitialImportWhenDefaultBranch() {
		/* Branches:
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 */
		//Act Statement(s)
		ConfigDataEnvironmentContributor result = ConfigDataEnvironmentContributor.ofInitialImport(configDataLocationMock);
		//Assert statement(s)
		//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${ff960e32-6e03-306c-8df1-e813dce5d525}, hash: 7311E67631C11D30F345BDCDE31AC275
	@Test()
	void ofExistingWhenDefaultBranch() {
		/* Branches:
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertySource> configurationPropertySource = mockStatic(ConfigurationPropertySource.class)) {
			configurationPropertySource.when(() -> ConfigurationPropertySource.from(propertySourceMock)).thenReturn(configurationPropertySourceMock);
			//Act Statement(s)
			ConfigDataEnvironmentContributor result = ConfigDataEnvironmentContributor.ofExisting(propertySourceMock);
			//Assert statement(s)
			//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				configurationPropertySource.verify(() -> ConfigurationPropertySource.from(propertySourceMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${eabf8d2b-d77d-319d-a54b-42349cdbb0d0}, hash: 6257BF200A2BEFE561967BF63507266C
	@Test()
	void ofUnboundImportWhenDefaultBranch() {
		/* Branches:
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertySource> configurationPropertySource = mockStatic(ConfigurationPropertySource.class)) {
			List<PropertySource<?>> anyList = new ArrayList<>();
			anyList.add(propertySourceMock);
			doReturn(anyList).when(configDataMock).getPropertySources();
			doReturn(configDataOptionsMock2).when(configDataMock).getOptions(propertySourceMock);
			configurationPropertySource.when(() -> ConfigurationPropertySource.from(propertySourceMock)).thenReturn(configurationPropertySourceMock);
			//Act Statement(s)
			ConfigDataEnvironmentContributor result = ConfigDataEnvironmentContributor.ofUnboundImport(configDataLocationMock, configDataResourceMock, false, configDataMock, 0);
			//Assert statement(s)
			//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(configDataMock).getPropertySources();
				verify(configDataMock).getOptions(propertySourceMock);
				configurationPropertySource.verify(() -> ConfigurationPropertySource.from(propertySourceMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${ef3f8731-a6ec-3742-abf3-33184d3075f6}, hash: E9D65E8B7FB09BDDED38EF6F430C0B9D
	@Test()
	void ofUnboundImportWhenDefaultBranchAndDefaultBranch() {
		/* Branches:
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertySource> configurationPropertySource = mockStatic(ConfigurationPropertySource.class)) {
			List<PropertySource<?>> anyList = new ArrayList<>();
			anyList.add(propertySourceMock);
			doReturn(anyList).when(configDataMock).getPropertySources();
			doReturn(null).when(configDataMock).getOptions(propertySourceMock);
			configurationPropertySource.when(() -> ConfigurationPropertySource.from(propertySourceMock)).thenReturn(configurationPropertySourceMock);
			//Act Statement(s)
			ConfigDataEnvironmentContributor result = ConfigDataEnvironmentContributor.ofUnboundImport(configDataLocationMock, configDataResourceMock, false, configDataMock, 0);
			//Assert statement(s)
			//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(configDataMock).getPropertySources();
				verify(configDataMock).getOptions(propertySourceMock);
				configurationPropertySource.verify(() -> ConfigurationPropertySource.from(propertySourceMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${1684446f-5b2d-324e-932e-a26ca6fc5dae}, hash: 4506CE94DB0B8BA0D91CD6511FE187B4
	@Test()
	void ofEmptyLocationWhenDefaultBranch() {
		/* Branches:
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 */
		//Act Statement(s)
		ConfigDataEnvironmentContributor result = ConfigDataEnvironmentContributor.ofEmptyLocation(configDataLocationMock, false);
		//Assert statement(s)
		//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${4a009397-7a64-3271-86dd-b7f5144771b8}, hash: 09A21D2C6DB306DFBE0FCC5F8FDBC025
	@Test()
	void ofEmptyLocationWhenDefaultBranchAndDefaultBranch() {
		/* Branches:
		 * (branch expression (line 102)) : false  #  inside <init> method
		 * (branch expression (line 103)) : false  #  inside <init> method
		 */
		//Act Statement(s)
		ConfigDataEnvironmentContributor result = ConfigDataEnvironmentContributor.ofEmptyLocation(configDataLocationMock, false);
		//Assert statement(s)
		//TODO: Please implement equals method in ConfigDataEnvironmentContributor for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}
}
