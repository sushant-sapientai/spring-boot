package org.springframework.boot.context;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class TypeExcludeFilterSapientGeneratedTest {

	//Sapient generated method id: ${44d6d1ca-4ddc-3ca3-a2ca-e2928e2bf64b}, hash: 0C1FB9AFCCDF9CBEA74ACCC4DAA2317A
	@Test()
	void matchWhenThisBeanFactoryNotInstanceOfListableBeanFactory() throws IOException {
		/* Branches:
		 * (this.beanFactory instanceof ListableBeanFactory) : false
		 */
		//Arrange Statement(s)
		TypeExcludeFilter target = new TypeExcludeFilter();
		MetadataReader metadataReaderMock = mock(MetadataReader.class);
		MetadataReaderFactory metadataReaderFactoryMock = mock(MetadataReaderFactory.class);

		//Act Statement(s)
		boolean result = target.match(metadataReaderMock, metadataReaderFactoryMock);

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
	}
}
