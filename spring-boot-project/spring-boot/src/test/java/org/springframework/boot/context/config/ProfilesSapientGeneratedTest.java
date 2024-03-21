package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.util.MultiValueMap;
import org.springframework.core.env.Environment;
import org.springframework.boot.context.properties.bind.BindResult;

import java.util.Iterator;
import java.util.Set;

import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.boot.context.properties.bind.Bindable;

import java.util.Collection;
import java.util.function.Supplier;

import org.mockito.MockedStatic;

import java.util.Spliterators;
import java.util.ArrayList;
import java.util.stream.StreamSupport;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ProfilesSapientGeneratedTest {

	private final BindResult bindResultMock = mock(BindResult.class);

	private final BindResult<Set<String>> bindResultMock2 = mock(BindResult.class);

	private final BindResult<Set<String>> bindResultMock3 = mock(BindResult.class);

	private final Bindable<MultiValueMap<String, String>> bindableMock = mock(Bindable.class);

	private final Binder binderMock = mock(Binder.class);

	private final Environment environmentMock = mock(Environment.class);

	private final MultiValueMap multiValueMapMock = mock(MultiValueMap.class);

	//Sapient generated method id: ${78c09fb6-edcf-3ce7-9932-6ef4ffc152b3}, hash: 6BA629F492BC8E93E9F2CA3058826CAB
	@Test()
	void iteratorTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class, CALLS_REAL_METHODS)) {
			doReturn("").when(environmentMock).getProperty("arg0");
			doReturn(bindResultMock).when(binderMock).bind("spring.profiles.group", bindableMock);
			doReturn(multiValueMapMock).when(bindResultMock).orElseGet((Supplier) any());
			doReturn(bindResultMock2).when(binderMock).bind(eq("name1"), (Bindable) any());
			doReturn(false).when(bindResultMock2).isBound();
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyCollection())).thenReturn(false);
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(true);
			Collection<String> collection = new ArrayList<>();
			Profiles target = spy(new Profiles(environmentMock, binderMock, collection));
			List<String> stringList = new ArrayList<>();
			doReturn(stringList).when(target).getAccepted();
			//Act Statement(s)
			Iterator<String> result = target.iterator();
			List<String> stringList2 = new ArrayList<>();
			Iterator<String> iteratorResult = stringList2.iterator();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(StreamSupport.stream(Spliterators.spliteratorUnknownSize(result, 0), false).toArray(), equalTo(StreamSupport.stream(Spliterators.spliteratorUnknownSize(iteratorResult, 0), false).toArray()));
				verify(environmentMock, times(2)).getProperty("arg0");
				verify(binderMock, atLeast(1)).bind("spring.profiles.group", bindableMock);
				verify(bindResultMock, atLeast(1)).orElseGet((Supplier) any());
				verify(binderMock, atLeast(2)).bind(eq("name1"), (Bindable) any());
				verify(bindResultMock2, times(2)).isBound();
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyCollection()), atLeast(1));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()), atLeast(2));
				verify(target, atLeast(1)).getAccepted();
			});
		}
	}

	//Sapient generated method id: ${cffbf970-a697-3296-9d13-518d7ba78eaa}, hash: D55AAD51E38CF191AC5E32D7EF95E0B0
	@Test()
	void getAcceptedWhenThisActiveProfilesIsEmpty() {
		/* Branches:
		 * (!this.activeProfiles.isEmpty()) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class, CALLS_REAL_METHODS)) {
			doReturn("").when(environmentMock).getProperty("arg0");
			doReturn(bindResultMock).when(binderMock).bind("spring.profiles.group", bindableMock);
			doReturn(multiValueMapMock).when(bindResultMock).orElseGet((Supplier) any());
			doReturn(bindResultMock2).when(binderMock).bind(eq("name1"), (Bindable) any());
			doReturn(false).when(bindResultMock2).isBound();
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyCollection())).thenReturn(false);
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(true);
			Collection<String> collection = new ArrayList<>();
			Profiles target = new Profiles(environmentMock, binderMock, collection);
			//Act Statement(s)
			List<String> result = target.getAccepted();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				verify(environmentMock, times(2)).getProperty("arg0");
				verify(binderMock, atLeast(1)).bind("spring.profiles.group", bindableMock);
				verify(bindResultMock, atLeast(1)).orElseGet((Supplier) any());
				verify(binderMock, atLeast(2)).bind(eq("name1"), (Bindable) any());
				verify(bindResultMock2, times(2)).isBound();
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyCollection()), atLeast(1));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()), atLeast(2));
			});
		}
	}

	//Sapient generated method id: ${b99f08d2-fb50-3b52-b75b-ee013f79d6d0}, hash: D18B7849E28B84F07CBDF884B9511A98
	@Test()
	void isAcceptedWhenGetAcceptedContainsProfile() {
		/* Branches:
		 * (getAccepted().contains(profile)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class, CALLS_REAL_METHODS);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			doReturn("B", "A").when(environmentMock).getProperty("arg0");
			doReturn(bindResultMock).when(binderMock).bind("spring.profiles.group", bindableMock);
			doReturn(multiValueMapMock).when(bindResultMock).orElseGet((Supplier) any());
			doReturn(bindResultMock2).when(binderMock).bind(eq("name1"), (Bindable) any());
			doReturn(false).when(bindResultMock2).isBound();
			stringUtils.when(() -> StringUtils.hasLength("B")).thenReturn(false);
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyCollection())).thenReturn(false);
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(true);
			stringUtils.when(() -> StringUtils.hasLength("A")).thenReturn(false);
			Collection<String> collection = new ArrayList<>();
			Profiles target = spy(new Profiles(environmentMock, binderMock, collection));
			List<String> stringList = new ArrayList<>();
			stringList.add("profile1");
			doReturn(stringList).when(target).getAccepted();
			//Act Statement(s)
			boolean result = target.isAccepted("profile1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				verify(environmentMock, times(2)).getProperty("arg0");
				verify(binderMock, atLeast(1)).bind("spring.profiles.group", bindableMock);
				verify(bindResultMock, atLeast(1)).orElseGet((Supplier) any());
				verify(binderMock, atLeast(2)).bind(eq("name1"), (Bindable) any());
				verify(bindResultMock2, times(2)).isBound();
				stringUtils.verify(() -> StringUtils.hasLength("B"), atLeast(2));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyCollection()), atLeast(1));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()), atLeast(2));
				stringUtils.verify(() -> StringUtils.hasLength("A"), atLeast(2));
				verify(target, atLeast(1)).getAccepted();
			});
		}
	}

	//Sapient generated method id: ${129ae9ad-fa43-3e97-9819-16403b42169e}, hash: 929AE8E96A1A70842CA7B99E3519135E
	@Test()
	void isAcceptedWhenGetAcceptedNotContainsProfile() {
		/* Branches:
		 * (getAccepted().contains(profile)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class, CALLS_REAL_METHODS);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			doReturn("B", "A").when(environmentMock).getProperty("arg0");
			doReturn(bindResultMock).when(binderMock).bind("spring.profiles.group", bindableMock);
			doReturn(multiValueMapMock).when(bindResultMock).orElseGet((Supplier) any());
			doReturn(bindResultMock2).when(binderMock).bind(eq("name1"), (Bindable) any());
			doReturn(false).when(bindResultMock2).isBound();
			stringUtils.when(() -> StringUtils.hasLength("B")).thenReturn(false);
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyCollection())).thenReturn(false);
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(true);
			stringUtils.when(() -> StringUtils.hasLength("A")).thenReturn(false);
			Collection<String> collection = new ArrayList<>();
			Profiles target = spy(new Profiles(environmentMock, binderMock, collection));
			List<String> stringList = new ArrayList<>();
			doReturn(stringList).when(target).getAccepted();
			//Act Statement(s)
			boolean result = target.isAccepted("profile1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				verify(environmentMock, times(2)).getProperty("arg0");
				verify(binderMock, atLeast(1)).bind("spring.profiles.group", bindableMock);
				verify(bindResultMock, atLeast(1)).orElseGet((Supplier) any());
				verify(binderMock, atLeast(2)).bind(eq("name1"), (Bindable) any());
				verify(bindResultMock2, times(2)).isBound();
				stringUtils.verify(() -> StringUtils.hasLength("B"), atLeast(2));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyCollection()), atLeast(1));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()), atLeast(2));
				stringUtils.verify(() -> StringUtils.hasLength("A"), atLeast(2));
				verify(target, atLeast(1)).getAccepted();
			});
		}
	}

	//Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 9BBC4B9AFAA37A7B0138547359770635
	@Test()
	void toStringTest() {
		/*
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: creator
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class, CALLS_REAL_METHODS)) {
			doReturn("").when(environmentMock).getProperty("arg0");
			doReturn(bindResultMock).when(binderMock).bind("spring.profiles.group", bindableMock);
			doReturn(multiValueMapMock).when(bindResultMock).orElseGet((Supplier) any());
			doReturn(bindResultMock2).when(binderMock).bind(eq("name1"), (Bindable) any());
			doReturn(false).when(bindResultMock2).isBound();
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyCollection())).thenReturn(false);
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(true);
			Collection<String> collection = new ArrayList<>();
			Profiles target = spy(new Profiles(environmentMock, binderMock, collection));
			List<String> stringList = new ArrayList<>();
			doReturn(stringList).when(target).getAccepted();
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("result1"));
				verify(environmentMock, times(2)).getProperty("arg0");
				verify(binderMock, atLeast(1)).bind("spring.profiles.group", bindableMock);
				verify(bindResultMock, atLeast(1)).orElseGet((Supplier) any());
				verify(binderMock, atLeast(2)).bind(eq("name1"), (Bindable) any());
				verify(bindResultMock2, times(2)).isBound();
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyCollection()), atLeast(1));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()), atLeast(2));
				verify(target, atLeast(1)).getAccepted();
			});
		}
	}
}
