package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import org.mockito.stubbing.Answer;

import org.springframework.boot.origin.Origin;
import org.springframework.boot.origin.OriginTrackedResource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.boot.env.PropertySourceLoader;

import org.mockito.MockedStatic;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StandardConfigDataLoaderSapientGeneratedTest {

	private final ConfigDataLoaderContext configDataLoaderContextMock = mock(ConfigDataLoaderContext.class);

	private final ConfigDataLocation configDataLocationMock = mock(ConfigDataLocation.class);

	private final ConfigDataLocation configDataLocationMock2 = mock(ConfigDataLocation.class, "load_configDataLocation2");

	private final Origin originMock = mock(Origin.class);

	private final OriginTrackedResource originTrackedResourceMock = mock(OriginTrackedResource.class);

	private final PropertySourceLoader propertySourceLoaderMock = mock(PropertySourceLoader.class);

	private final StandardConfigDataResource resourceMock = mock(StandardConfigDataResource.class, "load_standardConfigDataResource1");

	private final Resource resourceMock2 = mock(Resource.class);

	private final Resource resourceMock3 = mock(Resource.class);

	private final StandardConfigDataReference standardConfigDataReferenceMock = mock(StandardConfigDataReference.class);

	//Sapient generated method id: ${309763d6-5197-33fd-8789-218a32b01068}, hash: 6D5965722E9903B81672900737F0AEC8
	@Test()
	void loadWhenResourceIsEmptyDirectory() throws IOException, ConfigDataNotFoundException {
		/* Branches:
		 * (resource.isEmptyDirectory()) : true
		 */
		//Arrange Statement(s)
		StandardConfigDataResource resourceMock = mock(StandardConfigDataResource.class);
		doReturn(true).when(resourceMock).isEmptyDirectory();
		StandardConfigDataLoader target = new StandardConfigDataLoader();
		//Act Statement(s)
		ConfigData result = target.load(configDataLoaderContextMock, resourceMock);
		//Assert statement(s)
		//TODO: Please implement equals method in ConfigData for verification of the entire object or you need to adjust respective assertion statements
		assertAll("result", () -> {
			assertThat(result, is(notNullValue()));
			verify(resourceMock).isEmptyDirectory();
		});
	}

	//Sapient generated method id: ${e33a41e9-2b70-3d61-8a58-9954526f5c6b}, hash: 7B5359ED23A5941C380E5BD0B6BE6EC4
	@Disabled()
	@Test()
	void loadWhenResourceGetProfileIsNotNull() throws IOException, ConfigDataNotFoundException {
		/* Branches:
		 * (resource.isEmptyDirectory()) : false
		 * (resource.getProfile() != null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<OriginTrackedResource> originTrackedResource = mockStatic(OriginTrackedResource.class);
			 MockedStatic<Origin> origin = mockStatic(Origin.class);
			 MockedStatic<ConfigDataResourceNotFoundException> configDataResourceNotFoundException = mockStatic(ConfigDataResourceNotFoundException.class)) {
			doReturn(false).when(resourceMock).isEmptyDirectory();
			doReturn(standardConfigDataReferenceMock).when(resourceMock).getReference();
			doReturn(configDataLocationMock, configDataLocationMock2).when(standardConfigDataReferenceMock).getConfigDataLocation();
			doReturn(propertySourceLoaderMock).when(standardConfigDataReferenceMock).getPropertySourceLoader();
			List<PropertySource<?>> anyList = new ArrayList<>();
			doReturn(anyList).when(propertySourceLoaderMock).load("Config resource 'null' via location 'null'", originTrackedResourceMock);
			doReturn(resourceMock2, resourceMock3).when(resourceMock).getResource();
			doReturn("return_of_getProfile1").when(resourceMock).getProfile();
			configDataResourceNotFoundException.when(() -> ConfigDataResourceNotFoundException.throwIfDoesNotExist(resourceMock, resourceMock2)).thenAnswer((Answer<Void>) invocation -> null);
			origin.when(() -> Origin.from(configDataLocationMock)).thenReturn(originMock);
			originTrackedResource.when(() -> OriginTrackedResource.of(resourceMock3, originMock)).thenReturn(originTrackedResourceMock);
			StandardConfigDataLoader target = new StandardConfigDataLoader();
			//Act Statement(s)
			ConfigData result = target.load(configDataLoaderContextMock, resourceMock);
			//Assert statement(s)
			//TODO: Please implement equals method in ConfigData for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(resourceMock).isEmptyDirectory();
				verify(resourceMock, times(2)).getResource();
				verify(resourceMock).getReference();
				verify(standardConfigDataReferenceMock, times(2)).getConfigDataLocation();
				verify(standardConfigDataReferenceMock).getPropertySourceLoader();
				verify(propertySourceLoaderMock).load("Config resource 'null' via location 'null'", originTrackedResourceMock);
				verify(resourceMock).getProfile();
				configDataResourceNotFoundException.verify(() -> ConfigDataResourceNotFoundException.throwIfDoesNotExist(resourceMock, resourceMock2), atLeast(1));
				origin.verify(() -> Origin.from(configDataLocationMock), atLeast(1));
				originTrackedResource.verify(() -> OriginTrackedResource.of(resourceMock3, originMock), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${e1a160d5-022e-389a-903a-30984214f4a1}, hash: 93C5A9D79B2FC85B5371A0DE88217BA6
	@Disabled()
	@Test()
	void loadWhenResourceGetProfileIsNull() throws IOException, ConfigDataNotFoundException {
		/* Branches:
		 * (resource.isEmptyDirectory()) : false
		 * (resource.getProfile() != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<OriginTrackedResource> originTrackedResource = mockStatic(OriginTrackedResource.class);
			 MockedStatic<Origin> origin = mockStatic(Origin.class);
			 MockedStatic<ConfigDataResourceNotFoundException> configDataResourceNotFoundException = mockStatic(ConfigDataResourceNotFoundException.class)) {
			doReturn(false).when(resourceMock).isEmptyDirectory();
			doReturn(standardConfigDataReferenceMock).when(resourceMock).getReference();
			doReturn(configDataLocationMock, configDataLocationMock2).when(standardConfigDataReferenceMock).getConfigDataLocation();
			doReturn(propertySourceLoaderMock).when(standardConfigDataReferenceMock).getPropertySourceLoader();
			List<PropertySource<?>> anyList = new ArrayList<>();
			doReturn(anyList).when(propertySourceLoaderMock).load("Config resource 'null' via location 'null'", originTrackedResourceMock);
			doReturn(resourceMock2, resourceMock3).when(resourceMock).getResource();
			doReturn(null).when(resourceMock).getProfile();
			configDataResourceNotFoundException.when(() -> ConfigDataResourceNotFoundException.throwIfDoesNotExist(resourceMock, resourceMock2)).thenAnswer((Answer<Void>) invocation -> null);
			origin.when(() -> Origin.from(configDataLocationMock)).thenReturn(originMock);
			originTrackedResource.when(() -> OriginTrackedResource.of(resourceMock3, originMock)).thenReturn(originTrackedResourceMock);
			StandardConfigDataLoader target = new StandardConfigDataLoader();
			//Act Statement(s)
			ConfigData result = target.load(configDataLoaderContextMock, resourceMock);
			//Assert statement(s)
			//TODO: Please implement equals method in ConfigData for verification of the entire object or you need to adjust respective assertion statements
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(resourceMock).isEmptyDirectory();
				verify(resourceMock, times(2)).getResource();
				verify(resourceMock).getReference();
				verify(standardConfigDataReferenceMock, times(2)).getConfigDataLocation();
				verify(standardConfigDataReferenceMock).getPropertySourceLoader();
				verify(propertySourceLoaderMock).load("Config resource 'null' via location 'null'", originTrackedResourceMock);
				verify(resourceMock).getProfile();
				configDataResourceNotFoundException.verify(() -> ConfigDataResourceNotFoundException.throwIfDoesNotExist(resourceMock, resourceMock2), atLeast(1));
				origin.verify(() -> Origin.from(configDataLocationMock), atLeast(1));
				originTrackedResource.verify(() -> OriginTrackedResource.of(resourceMock3, originMock), atLeast(1));
			});
		}
	}
}
