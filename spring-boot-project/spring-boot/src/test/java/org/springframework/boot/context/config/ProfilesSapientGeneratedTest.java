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

import java.util.ArrayList;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ProfilesSapientGeneratedTest {

	private final BindResult bindResultMock = mock(BindResult.class);

	private final BindResult<Set<String>> bindResultMock2 = mock(BindResult.class);

	private final BindResult<Set<String>> bindResultMock3 = mock(BindResult.class);

	private final Bindable<MultiValueMap<String, String>> bindableMock = mock(Bindable.class);

	private final Binder binderMock = mock(Binder.class);

	private final Environment environmentMock = mock(Environment.class);

	private final MultiValueMap multiValueMapMock = mock(MultiValueMap.class);

	//Sapient generated method id: ${78c09fb6-edcf-3ce7-9932-6ef4ffc152b3}, hash: BFBA15B5ADC53B59C6034837F824F1A6
	@Disabled()
	@Test()
	void iteratorTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<CollectionUtils> collectionUtils = mockStatic(CollectionUtils.class, CALLS_REAL_METHODS)) {
			doReturn("").when(environmentMock).getProperty("key1");
			doReturn(bindResultMock).when(binderMock).bind("spring.profiles.group", bindableMock);
			doReturn(multiValueMapMock).when(bindResultMock).orElseGet((Supplier) any());
			doReturn(false).when(bindResultMock2).isBound();
			doReturn(bindResultMock2, bindResultMock3).when(binderMock).bind(eq("name1"), (Bindable) any());
			doReturn(false).when(bindResultMock3).isBound();
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyCollection())).thenReturn(false);
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(true);
			Collection<String> collection = new ArrayList<>();
			Profiles target = spy(new Profiles(environmentMock, binderMock, collection));
			List<String> stringList = new ArrayList<>();
			doReturn(stringList).when(target).getAccepted();
			//Act Statement(s)
			Iterator<String> result = target.iterator();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(environmentMock, times(2)).getProperty("key1");
				verify(binderMock, atLeast(1)).bind("spring.profiles.group", bindableMock);
				verify(bindResultMock, atLeast(1)).orElseGet((Supplier) any());
				verify(binderMock, atLeast(2)).bind(eq("name1"), (Bindable) any());
				verify(bindResultMock2, atLeast(1)).isBound();
				verify(bindResultMock3, atLeast(1)).isBound();
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyCollection()), atLeast(1));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()), atLeast(2));
				verify(target, atLeast(1)).getAccepted();
			});
		}
	}

	//Sapient generated method id: ${cffbf970-a697-3296-9d13-518d7ba78eaa}, hash: C2B8FC4233A72ABC19CF7F1E007CEF3E
	@Disabled()
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
			doReturn("").when(environmentMock).getProperty("key1");
			doReturn(bindResultMock).when(binderMock).bind("spring.profiles.group", bindableMock);
			doReturn(multiValueMapMock).when(bindResultMock).orElseGet((Supplier) any());
			doReturn(false).when(bindResultMock2).isBound();
			doReturn(bindResultMock2, bindResultMock3).when(binderMock).bind(eq("name1"), (Bindable) any());
			doReturn(false).when(bindResultMock3).isBound();
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyCollection())).thenReturn(false);
			collectionUtils.when(() -> CollectionUtils.isEmpty(anyList())).thenReturn(true);
			Collection<String> collection = new ArrayList<>();
			Profiles target = new Profiles(environmentMock, binderMock, collection);
			//Act Statement(s)
			List<String> result = target.getAccepted();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result.size(), equalTo(0));
				verify(environmentMock, times(2)).getProperty("key1");
				verify(binderMock, atLeast(1)).bind("spring.profiles.group", bindableMock);
				verify(bindResultMock, atLeast(1)).orElseGet((Supplier) any());
				verify(binderMock, atLeast(2)).bind(eq("name1"), (Bindable) any());
				verify(bindResultMock2, atLeast(1)).isBound();
				verify(bindResultMock3, atLeast(1)).isBound();
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyCollection()), atLeast(1));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()), atLeast(2));
			});
		}
	}

	//Sapient generated method id: ${b99f08d2-fb50-3b52-b75b-ee013f79d6d0}, hash: 1DD0EBF05F5AF58310F40AF8F2FE5D21
	@Disabled()
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
			doReturn("B", "A").when(environmentMock).getProperty("key1");
			doReturn(bindResultMock).when(binderMock).bind("spring.profiles.group", bindableMock);
			doReturn(multiValueMapMock).when(bindResultMock).orElseGet((Supplier) any());
			doReturn(false).when(bindResultMock2).isBound();
			doReturn(bindResultMock2, bindResultMock3).when(binderMock).bind(eq("name1"), (Bindable) any());
			doReturn(false).when(bindResultMock3).isBound();
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
				verify(environmentMock, times(2)).getProperty("key1");
				verify(binderMock, atLeast(1)).bind("spring.profiles.group", bindableMock);
				verify(bindResultMock, atLeast(1)).orElseGet((Supplier) any());
				verify(binderMock, atLeast(2)).bind(eq("name1"), (Bindable) any());
				verify(bindResultMock2, atLeast(1)).isBound();
				verify(bindResultMock3, atLeast(1)).isBound();
				stringUtils.verify(() -> StringUtils.hasLength("B"), atLeast(2));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyCollection()), atLeast(1));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()), atLeast(2));
				stringUtils.verify(() -> StringUtils.hasLength("A"), atLeast(2));
				verify(target, atLeast(1)).getAccepted();
			});
		}
	}

	//Sapient generated method id: ${129ae9ad-fa43-3e97-9819-16403b42169e}, hash: A64514497E00559054E2C9780E0E9931
	@Disabled()
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
			doReturn("B", "A").when(environmentMock).getProperty("key1");
			doReturn(bindResultMock).when(binderMock).bind("spring.profiles.group", bindableMock);
			doReturn(multiValueMapMock).when(bindResultMock).orElseGet((Supplier) any());
			doReturn(false).when(bindResultMock2).isBound();
			doReturn(bindResultMock2, bindResultMock3).when(binderMock).bind(eq("name1"), (Bindable) any());
			doReturn(false).when(bindResultMock3).isBound();
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
				verify(environmentMock, times(2)).getProperty("key1");
				verify(binderMock, atLeast(1)).bind("spring.profiles.group", bindableMock);
				verify(bindResultMock, atLeast(1)).orElseGet((Supplier) any());
				verify(binderMock, atLeast(2)).bind(eq("name1"), (Bindable) any());
				verify(bindResultMock2, atLeast(1)).isBound();
				verify(bindResultMock3, atLeast(1)).isBound();
				stringUtils.verify(() -> StringUtils.hasLength("B"), atLeast(2));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyCollection()), atLeast(1));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()), atLeast(2));
				stringUtils.verify(() -> StringUtils.hasLength("A"), atLeast(2));
				verify(target, atLeast(1)).getAccepted();
			});
		}
	}

	//Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: E7E1BC2A1ED84AF3148AE4E21EAF70AF
	@Disabled()
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
			doReturn("").when(environmentMock).getProperty("key1");
			doReturn(bindResultMock).when(binderMock).bind("spring.profiles.group", bindableMock);
			doReturn(multiValueMapMock).when(bindResultMock).orElseGet((Supplier) any());
			doReturn(false).when(bindResultMock2).isBound();
			doReturn(bindResultMock2, bindResultMock3).when(binderMock).bind(eq("name1"), (Bindable) any());
			doReturn(false).when(bindResultMock3).isBound();
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
				verify(environmentMock, times(2)).getProperty("key1");
				verify(binderMock, atLeast(1)).bind("spring.profiles.group", bindableMock);
				verify(bindResultMock, atLeast(1)).orElseGet((Supplier) any());
				verify(binderMock, atLeast(2)).bind(eq("name1"), (Bindable) any());
				verify(bindResultMock2, atLeast(1)).isBound();
				verify(bindResultMock3, atLeast(1)).isBound();
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyCollection()), atLeast(1));
				collectionUtils.verify(() -> CollectionUtils.isEmpty(anyList()), atLeast(2));
				verify(target, atLeast(1)).getAccepted();
			});
		}
	}
}
