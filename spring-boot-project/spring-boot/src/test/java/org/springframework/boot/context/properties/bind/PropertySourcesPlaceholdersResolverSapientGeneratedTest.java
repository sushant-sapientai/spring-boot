package org.springframework.boot.context.properties.bind;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.util.PropertyPlaceholderHelper;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PropertySourcesPlaceholdersResolverSapientGeneratedTest {

	private final PropertyPlaceholderHelper helperMock = mock(PropertyPlaceholderHelper.class, "helper");

	private final Iterable iterableMock = mock(Iterable.class);

	//Sapient generated method id: ${92f654c1-59d0-3f5f-8724-669bbd7eff5a}, hash: 9B08745D59DFD8E9E1806A0D2EF20C16
	@Disabled()
	@Test()
	void resolvePlaceholdersWhenValueInstanceOfString() {
		/* Branches:
		 * (value instanceof String string) : true
		 */
		//Arrange Statement(s)
		PropertySourcesPlaceholdersResolver target = spy(new PropertySourcesPlaceholdersResolver(iterableMock, helperMock));
		doReturn("return_of_resolvePlaceholder1").when(target).resolvePlaceholder("placeholder1");
		doReturn("return_of_replacePlaceholders1").when(helperMock).replacePlaceholders(eq("value1"), (PropertyPlaceholderHelper.PlaceholderResolver) any());
		//Act Statement(s)
		Object result = target.resolvePlaceholders("value1");
		//Assert statement(s)
		assertAll("result", () -> {
			assertThat(result, equalTo("return_of_replacePlaceholders1"));
			verify(target).resolvePlaceholder("placeholder1");
			verify(helperMock).replacePlaceholders(eq("value1"), (PropertyPlaceholderHelper.PlaceholderResolver) any());
		});
	}

	//Sapient generated method id: ${2e755de7-a01c-3580-9542-15932e99692f}, hash: DDA8D9A29AB8C873032DAF28A51D437D
	@Test()
	void resolvePlaceholdersWhenValueNotInstanceOfString() {
		/* Branches:
		 * (value instanceof String string) : false
		 */
		//Arrange Statement(s)
		PropertySourcesPlaceholdersResolver target = new PropertySourcesPlaceholdersResolver(iterableMock, helperMock);
		Object object = new Object();
		//Act Statement(s)
		Object result = target.resolvePlaceholders(object);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo(object)));
	}

	//Sapient generated method id: ${f55b244d-d45e-37b8-b852-86b4d940632d}, hash: E32D426D6ACB26C23AE6CE3CACC453A4
	@Disabled()
	@Test()
	void resolvePlaceholderWhenValueIsNotNull() {
		/* Branches:
		 * (this.sources != null) : true
		 * (for-each(this.sources)) : true
		 * (value != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		PropertySourcesPlaceholdersResolver target = new PropertySourcesPlaceholdersResolver(iterableMock, helperMock);
		//Act Statement(s)
		String result = target.resolvePlaceholder("placeholder1");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("resolvePlaceholder_object2")));
	}

	//Sapient generated method id: ${2e40d513-19be-3dae-9d54-18bd4c132e8b}, hash: 837FC3DF520B515F0967457F57CC3D2A
	@Disabled()
	@Test()
	void resolvePlaceholderWhenValueIsNull() {
		/* Branches:
		 * (this.sources != null) : true
		 * (for-each(this.sources)) : true
		 * (value != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		PropertySourcesPlaceholdersResolver target = new PropertySourcesPlaceholdersResolver(iterableMock, helperMock);
		//Act Statement(s)
		String result = target.resolvePlaceholder("placeholder1");
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}
}
