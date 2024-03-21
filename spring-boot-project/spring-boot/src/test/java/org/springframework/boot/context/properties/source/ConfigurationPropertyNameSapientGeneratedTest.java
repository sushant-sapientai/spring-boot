package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import org.springframework.util.StringUtils;
import org.springframework.util.Assert;

import java.util.function.Function;

import org.mockito.MockedStatic;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigurationPropertyNameSapientGeneratedTest {

	private final ConfigurationPropertyName configurationPropertyNameMock = mock(ConfigurationPropertyName.class);

	private final Function functionMock = mock(Function.class);

	private final ConfigurationPropertyName n2Mock = mock(ConfigurationPropertyName.class);

	private final ConfigurationPropertyName nameMock = mock(ConfigurationPropertyName.class);

	//Sapient generated method id: ${f4596ad2-fcaa-3ae5-b219-deb972de5338}, hash: FE7C6A37CB2CC7D7F38A8F5A2F8A8221
	@Test()
	void isEmptyWhenThisElementsGetSizeEquals0() {
		/* Branches:
		 * (this.elements.getSize() == 0) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			boolean result = target.isEmpty();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${88fa19c8-e796-3d0d-8b27-4e5e8f3ea28c}, hash: F924A8511D0D2CDE4168C5EA60922835
	@Disabled()
	@Test()
	void isEmptyWhenThisElementsGetSizeNotEquals0() {
		/* Branches:
		 * (this.elements.getSize() == 0) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			boolean result = target.isEmpty();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${743bc64a-79ef-32bb-ae4f-d5483ab77361}, hash: 4244957C4AE41B17F8472561779446E8
	@Disabled()
	@Test()
	void isLastElementIndexedWhenIsIndexedSizeMinus1() {
		/* Branches:
		 * (size > 0) : true
		 * (isIndexed(size - 1)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("", 'A', functionMock));
			doReturn(true).when(target).isIndexed(0);
			//Act Statement(s)
			boolean result = target.isLastElementIndexed();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
				verify(target).isIndexed(0);
			});
		}
	}

	//Sapient generated method id: ${dffb566d-1c21-30a4-9f2c-92dbb1cfcf29}, hash: 50D27D1EC0F6D4140A949507AADB27CA
	@Disabled()
	@Test()
	void isLastElementIndexedWhenIsIndexedNotSizeMinus1() {
		/* Branches:
		 * (size > 0) : true
		 * (isIndexed(size - 1)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("", 'A', functionMock));
			doReturn(false).when(target).isIndexed(0);
			//Act Statement(s)
			boolean result = target.isLastElementIndexed();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
				verify(target).isIndexed(0);
			});
		}
	}

	//Sapient generated method id: ${c9915a84-d4e3-3a10-a7ef-8edaf94f1726}, hash: 1FF1013B2B6D131BDD9E8680A6223C77
	@Disabled()
	@Test()
	void hasIndexedElementWhenIsIndexedI() {
		/* Branches:
		 * (i < getNumberOfElements()) : true
		 * (isIndexed(i)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("", 'A', functionMock));
			doReturn(true).when(target).isIndexed(0);
			//Act Statement(s)
			boolean result = target.hasIndexedElement();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
				verify(target).isIndexed(0);
			});
		}
	}

	//Sapient generated method id: ${eca9dbb4-366b-32b0-86e5-571c7d615dc3}, hash: 2DD900E8BF5EF5846109FB98235A9055
	@Disabled()
	@Test()
	void hasIndexedElementWhenIsIndexedNotI() {
		/* Branches:
		 * (i < getNumberOfElements()) : true
		 * (isIndexed(i)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("", 'A', functionMock));
			doReturn(false).when(target).isIndexed(0);
			//Act Statement(s)
			boolean result = target.hasIndexedElement();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
				verify(target).isIndexed(0);
			});
		}
	}

	//Sapient generated method id: ${1524a8ad-2b9d-33ba-bc61-f917ca09bee4}, hash: EEDB7F0337A0F34441113EEF10ACE178
	@Disabled()
	@Test()
	void isIndexedWhenThisElementsGetTypeElementIndexIsIndexed() {
		/* Branches:
		 * (this.elements.getType(elementIndex).isIndexed()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			boolean result = target.isIndexed(0);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${55125aab-7291-3fd7-a424-cb5c8d9fa8fb}, hash: A4588263A8CF0AA1262C21000A55F450
	@Disabled()
	@Test()
	void isIndexedWhenThisElementsGetTypeElementIndexNotIsIndexed() {
		/* Branches:
		 * (this.elements.getType(elementIndex).isIndexed()) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			boolean result = target.isIndexed(0);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${99011359-4aa4-3047-95be-fbac1a4c4639}, hash: 695941DFFAF79A56B1A0AD6940378966
	@Disabled()
	@Test()
	void isNumericIndexWhenThisElementsGetTypeElementIndexEqualsElementTypeNUMERICALLY_INDEXED() {
		/* Branches:
		 * (this.elements.getType(elementIndex) == ElementType.NUMERICALLY_INDEXED) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			boolean result = target.isNumericIndex(0);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${13bf2442-e51c-305b-89ea-aec7a9f5a845}, hash: 0AB5E77E928715407FA4DA7246082C57
	@Disabled()
	@Test()
	void isNumericIndexWhenThisElementsGetTypeElementIndexNotEqualsElementTypeNUMERICALLY_INDEXED() {
		/* Branches:
		 * (this.elements.getType(elementIndex) == ElementType.NUMERICALLY_INDEXED) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			boolean result = target.isNumericIndex(0);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${37d3a550-5c79-3b91-8b60-8495b7ec9aab}, hash: CBD755FAC9E39AF08BF08B650EC60F8A
	@Disabled()
	@Test()
	void getLastElementWhenSizeNotEquals0() {
		/* Branches:
		 * (size != 0) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("", 'A', functionMock));
			doReturn("return_of_getElement1").when(target).getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
			//Act Statement(s)
			String result = target.getLastElement(ConfigurationPropertyName.Form.ORIGINAL);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("return_of_getElement1"));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
				verify(target).getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
			});
		}
	}

	//Sapient generated method id: ${6276f483-19d3-3bf7-9dd1-273b9e311dea}, hash: EDBD2F0CC980D498BD690B2715C36529
	@Test()
	void getLastElementWhenSizeEquals0() {
		/* Branches:
		 * (size != 0) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			String result = target.getLastElement(ConfigurationPropertyName.Form.ORIGINAL);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(""));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${606c826e-9e9e-3c25-8425-30dd5468c200}, hash: F9FFF2C3BDA1C3DA67D3374FAF1CC2E0
	@Disabled()
	@Test()
	void getElementWhenTypeIsIndexed() {
		/* Branches:
		 * (type.isIndexed()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			String result = target.getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("getElement_charSequence1"));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f2dce001-a7db-3e44-8b82-86908bb21bed}, hash: D09979D2770E00A91B49A6F338BCAE5B
	@Disabled()
	@Test()
	void getElementWhenTypeNotEqualsElementTypeNON_UNIFORM() {
		/* Branches:
		 * (type.isIndexed()) : false
		 * (form == Form.ORIGINAL) : true
		 * (type != ElementType.NON_UNIFORM) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			String result = target.getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("getElement_charSequence1"));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${b9226000-6776-3725-abd5-5fc101a55d8c}, hash: 59BC5B13BC13822D9ADA1D77CBAACAFE
	@Disabled()
	@Test()
	void getElementWhenTypeEqualsElementTypeDASHED() {
		/* Branches:
		 * (type.isIndexed()) : false
		 * (form == Form.ORIGINAL) : false
		 * (form == Form.DASHED) : true
		 * (type == ElementType.UNIFORM) : false
		 * (type == ElementType.DASHED) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			String result = target.getElement(0, ConfigurationPropertyName.Form.DASHED);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("getElement_charSequence1"));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${20f89634-1757-30ae-86fe-4c1a6982910c}, hash: 079B297EF070B728DB92A3378ACB3224
	@Disabled()
	@Test()
	void getElementWhenTypeEqualsElementTypeUNIFORM() {
		/* Branches:
		 * (type.isIndexed()) : false
		 * (form == Form.ORIGINAL) : false
		 * (form == Form.DASHED) : false
		 * (uniformElement == null) : true
		 * (type != ElementType.UNIFORM) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			String result = target.getElement(0, ConfigurationPropertyName.Form.UNIFORM);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("getElement_charSequence1"));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${cefa584d-7383-397c-a1a9-7de7a840bafb}, hash: 5DCC907EB9F3EB18D021D9F6BC2D8B5C
	@Disabled()
	@Test()
	void getElementWhenFilterTestChI() {
		/* Branches:
		 * (type.isIndexed()) : false
		 * (form == Form.ORIGINAL) : true
		 * (type != ElementType.NON_UNIFORM) : false
		 * (i < element.length()) : true  #  inside convertElement method
		 * (lowercase) : false  #  inside convertElement method
		 * (filter.test(ch, i)) : true  #  inside convertElement method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			String result = target.getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("A"));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4a51b34a-2727-3536-ae01-8c2407adbed1}, hash: 4493B3A4F2BAFCB0796015035DB9CBEA
	@Disabled()
	@Test()
	void getElementWhenLowercaseAndFilterTestChI() {
		/* Branches:
		 * (type.isIndexed()) : false
		 * (form == Form.ORIGINAL) : false
		 * (form == Form.DASHED) : true
		 * (type == ElementType.UNIFORM) : false
		 * (type == ElementType.DASHED) : false
		 * (i < element.length()) : true  #  inside convertElement method
		 * (lowercase) : true  #  inside convertElement method
		 * (filter.test(ch, i)) : true  #  inside convertElement method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			String result = target.getElement(0, ConfigurationPropertyName.Form.DASHED);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("a"));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${cea76ae0-a9dc-3714-951b-2ee2307ada23}, hash: 5E63FE591E1FB00E3478D2F68806FDB7
	@Disabled()
	@Test()
	void getElementWhenILessThanElementLengthAndLowercaseAndFilterTestChI() {
		/* Branches:
		 * (type.isIndexed()) : false
		 * (form == Form.ORIGINAL) : false
		 * (form == Form.DASHED) : false
		 * (uniformElement == null) : true
		 * (type != ElementType.UNIFORM) : true
		 * (i < element.length()) : true  #  inside convertElement method
		 * (lowercase) : true  #  inside convertElement method
		 * (filter.test(ch, i)) : true  #  inside convertElement method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			String result = target.getElement(0, ConfigurationPropertyName.Form.UNIFORM);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(""));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${2367b9e3-a480-3321-a4ae-98615f0c4845}, hash: B706E692DA30E4B296400A475D4958A2
	@Test()
	void getNumberOfElementsTest() {
		/*
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			int result = target.getNumberOfElements();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(0));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${dad83f36-7c06-367a-aa81-1455798d2513}, hash: 875373D82952044D6EC3E816D1C33F1C
	@Test()
	void appendWhenStringUtilsNotHasLengthSuffix() {
		/* Branches:
		 * (!StringUtils.hasLength(suffix)) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			ConfigurationPropertyName result = target.append("");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(target));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4b9e7357-d7ac-313b-b7ea-1086b15abebc}, hash: 4925AC4941DB6C7F9DE330A1FE3FD925
	@Disabled()
	@Test()
	void appendWhenNameIsNull() {
		/* Branches:
		 * (!StringUtils.hasLength(suffix)) : false
		 * (name == null) : true  #  inside elementsOf method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class);
			 MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.hasLength((String) null)).thenReturn(true);
			_assert.when(() -> Assert.isTrue(false, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			ConfigurationPropertyName result = target.append((String) null);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength((String) null), atLeast(1));
				_assert.verify(() -> Assert.isTrue(false, "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${32e66336-84b5-3990-99de-aa40dba2488d}, hash: FF84FD1F61F6F6485154B2F27077966E
	@Test()
	void appendWhenNameIsEmpty() {
		/* Branches:
		 * (!StringUtils.hasLength(suffix)) : false
		 * (name == null) : false  #  inside elementsOf method
		 * (name.isEmpty()) : true  #  inside elementsOf method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class);
			 MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			stringUtils.when(() -> StringUtils.hasLength("")).thenReturn(true);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			ConfigurationPropertyName result = target.append("");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
				stringUtils.verify(() -> StringUtils.hasLength(""), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c1cd3d1a-8f7e-3013-b5a8-a7637605cc58}, hash: C1B5A937CEF224516EE8D03FD754F2F9
	@Disabled()
	@Test()
	void appendWhenNotReturnNullIfInvalidThrowsInvalidConfigurationPropertyNameException() {
		/* Branches:
		 * (!StringUtils.hasLength(suffix)) : false
		 * (name == null) : false  #  inside elementsOf method
		 * (name.isEmpty()) : false  #  inside elementsOf method
		 * (name.charAt(0) == '.') : false  #  inside elementsOf method
		 * (name.charAt(name.length() - 1) == '.') : true  #  inside elementsOf method
		 * (returnNullIfInvalid) : false  #  inside elementsOf method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("name1", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("name1", 'A', functionMock);
			//Act Statement(s)
			final InvalidConfigurationPropertyNameException result = assertThrows(InvalidConfigurationPropertyNameException.class, () -> {
				target.append("suffix1");
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("name1", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c892a6d5-41c1-30ea-a488-dd758662c766}, hash: F5C7056E823078431CFEDD3D39D821CB
	@Disabled()
	@Test()
	void appendWhenElementsGetTypeINotEqualsElementTypeNON_UNIFORM() {
		/* Branches:
		 * (!StringUtils.hasLength(suffix)) : false
		 * (name == null) : false  #  inside elementsOf method
		 * (name.isEmpty()) : false  #  inside elementsOf method
		 * (name.charAt(0) == '.') : false  #  inside elementsOf method
		 * (name.charAt(name.length() - 1) == '.') : false  #  inside elementsOf method
		 * (i < elements.getSize()) : true  #  inside elementsOf method
		 * (elements.getType(i) == ElementType.NON_UNIFORM) : false  #  inside elementsOf method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			ConfigurationPropertyName result = target.append("KQ");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3e52cefe-2ddf-3c0d-a140-fbd11f3032dd}, hash: B946D27CC98EAE71E238101758EB5D31
	@Test()
	void appendWhenElementsParserNotIsValidCharChCharIndexThrowsInvalidConfigurationPropertyNameException() {
		/* Branches:
		 * (!StringUtils.hasLength(suffix)) : false
		 * (name == null) : false  #  inside elementsOf method
		 * (name.isEmpty()) : false  #  inside elementsOf method
		 * (name.charAt(0) == '.') : false  #  inside elementsOf method
		 * (name.charAt(name.length() - 1) == '.') : false  #  inside elementsOf method
		 * (i < elements.getSize()) : true  #  inside elementsOf method
		 * (elements.getType(i) == ElementType.NON_UNIFORM) : true  #  inside elementsOf method
		 * (returnNullIfInvalid) : false  #  inside elementsOf method
		 * (charIndex < elements.getLength(index)) : true  #  inside getInvalidChars method
		 * (!ElementsParser.isValidChar(ch, charIndex)) : true  #  inside getInvalidChars method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			final InvalidConfigurationPropertyNameException result = assertThrows(InvalidConfigurationPropertyNameException.class, () -> {
				target.append("DE");
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${7b65cb91-8838-33b2-a0c8-d4dd709f903f}, hash: AFBE5466AEF4037B9D53A0E793A05873
	@Test()
	void append1WhenSuffixIsNull() {
		/* Branches:
		 * (suffix == null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			ConfigurationPropertyName configurationPropertyName = null;
			//Act Statement(s)
			ConfigurationPropertyName result = target.append(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(target));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${a3ce3e9f-8901-315a-95cd-1ffffa2e31d8}, hash: FA61E797B7401816C76F3222485FE4D1
	@Disabled()
	@Test()
	void append1WhenSuffixIsNotNull() {
		/* Branches:
		 * (suffix == null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.of("append_configurationPropertyName1-name1");
			//Act Statement(s)
			ConfigurationPropertyName result = target.append(configurationPropertyName);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${8d5834e4-e251-3bb2-be8c-b1391d280df5}, hash: 0A38608900D3BB65B918F9F7098353E7
	@Test()
	void getParentWhenNumberOfElementsLessThanOrEqualsTo1() {
		/* Branches:
		 * (numberOfElements <= 1) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			ConfigurationPropertyName result = target.getParent();
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.EMPTY;
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyName));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${0c679d0a-f36e-3d5d-b93a-4b77d27252ce}, hash: 0499033C875A0F86672DDBE260270F22
	@Disabled()
	@Test()
	void getParentWhenNumberOfElementsGreaterThan1() {
		/* Branches:
		 * (numberOfElements <= 1) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("", 'A', functionMock));
			doReturn(configurationPropertyNameMock).when(target).chop(1);
			//Act Statement(s)
			ConfigurationPropertyName result = target.getParent();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyNameMock));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
				verify(target).chop(1);
			});
		}
	}

	//Sapient generated method id: ${138a5323-d04f-398a-8780-1815be54bdbe}, hash: 771476C3907330DB98563E83362FEBBC
	@Test()
	void chopWhenSizeGreaterThanOrEqualsToGetNumberOfElements() {
		/* Branches:
		 * (size >= getNumberOfElements()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			ConfigurationPropertyName result = target.chop(0);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(target));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${4fc3e13d-c0f9-396e-9c13-9b47216f0899}, hash: CF1BABBA7622E24B6748571C5776A0DC
	@Test()
	void chopWhenSizeLessThanGetNumberOfElements() {
		/* Branches:
		 * (size >= getNumberOfElements()) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			ConfigurationPropertyName result = target.chop(0);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${347ef665-0662-3396-96f8-476448a15026}, hash: 14A6B53C92F7C10A1239290A68A84D09
	@Test()
	void subNameWhenOffsetEquals0() {
		/* Branches:
		 * (offset == 0) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			ConfigurationPropertyName result = target.subName(0);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(target));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${ccf6eec0-f07d-398c-b217-c26a9a6ec34b}, hash: 4633FBB133D83C108980FC1960A04DED
	@Disabled()
	@Test()
	void subNameWhenOffsetEqualsGetNumberOfElements() {
		/* Branches:
		 * (offset == 0) : false
		 * (offset == getNumberOfElements()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			ConfigurationPropertyName result = target.subName(1);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.EMPTY;
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyName));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f0a05ff4-f4d5-34c6-a323-4109b1b22a7a}, hash: 7C09BB85CF1D8FB139478AE7F6253DA2
	@Disabled()
	@Test()
	void subNameWhenOffsetGreaterThanGetNumberOfElementsThrowsIndexOutOfBoundsException() {
		/* Branches:
		 * (offset == 0) : false
		 * (offset == getNumberOfElements()) : false
		 * (offset < 0) : false
		 * (offset > getNumberOfElements()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			final IndexOutOfBoundsException result = assertThrows(IndexOutOfBoundsException.class, () -> {
				target.subName(2);
			});
			IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Offset: 2, NumberOfElements: 2");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getMessage(), equalTo(indexOutOfBoundsException.getMessage()));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3b49b001-db6e-3346-813c-51acd4341977}, hash: 7ED12F808F4D5A1B97CD1BFAAE5ED5E8
	@Disabled()
	@Test()
	void subNameWhenOffsetNotGreaterThanGetNumberOfElements() {
		/* Branches:
		 * (offset == 0) : false
		 * (offset == getNumberOfElements()) : false
		 * (offset < 0) : false
		 * (offset > getNumberOfElements()) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			ConfigurationPropertyName result = target.subName(1);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${7393e6ef-1cdb-3d7e-a151-69c57ce7ac40}, hash: 76CC69F4C43E09BD5876F07966A5D0AD
	@Test()
	void isParentOfWhenGetNumberOfElementsNotEqualsNameGetNumberOfElementsMinus1() {
		/* Branches:
		 * (getNumberOfElements() != name.getNumberOfElements() - 1) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(0).when(nameMock).getNumberOfElements();
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			boolean result = target.isParentOf(nameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				verify(nameMock).getNumberOfElements();
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${9766f280-514d-36da-a996-214897f48da0}, hash: B599ABB6156B3B3B9B52092E0A173F8A
	@Test()
	void isParentOfWhenIsAncestorOfName() {
		/* Branches:
		 * (getNumberOfElements() != name.getNumberOfElements() - 1) : false
		 * (isAncestorOf(name)) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(1).when(nameMock).getNumberOfElements();
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("", 'A', functionMock));
			doReturn(true).when(target).isAncestorOf(nameMock);
			//Act Statement(s)
			boolean result = target.isParentOf(nameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				verify(nameMock).getNumberOfElements();
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				verify(target).isAncestorOf(nameMock);
			});
		}
	}

	//Sapient generated method id: ${d35f1b79-fd93-31df-905e-d745f15c67a3}, hash: 66947C44A2A784D860D74264A44480DF
	@Test()
	void isParentOfWhenIsAncestorOfNotName() {
		/* Branches:
		 * (getNumberOfElements() != name.getNumberOfElements() - 1) : false
		 * (isAncestorOf(name)) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(1).when(nameMock).getNumberOfElements();
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("", 'A', functionMock));
			doReturn(false).when(target).isAncestorOf(nameMock);
			//Act Statement(s)
			boolean result = target.isParentOf(nameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				verify(nameMock).getNumberOfElements();
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
				verify(target).isAncestorOf(nameMock);
			});
		}
	}

	//Sapient generated method id: ${3617a22a-65d4-36d5-89eb-fa61397e960a}, hash: 86F16DDAD66A248288280440B826C86B
	@Test()
	void isAncestorOfWhenGetNumberOfElementsGreaterThanOrEqualsToNameGetNumberOfElements() {
		/* Branches:
		 * (getNumberOfElements() >= name.getNumberOfElements()) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(0).when(nameMock).getNumberOfElements();
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			boolean result = target.isAncestorOf(nameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				verify(nameMock).getNumberOfElements();
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${6e2b95d4-f982-3a21-aaaa-1f77fab9c20b}, hash: A359F2AB21F2F8E0E91189581A9E476E
	@Disabled()
	@Test()
	void isAncestorOfWhenIGreaterThanOrEqualsTo0ThrowsNullPointerException() {
		/* Branches:
		 * (getNumberOfElements() >= name.getNumberOfElements()) : false
		 * (i >= 0) : true  #  inside elementsEqual method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(1).when(nameMock).getNumberOfElements();
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.isAncestorOf(nameMock);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(nameMock).getNumberOfElements();
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${5daae2e6-cb0f-39cf-a2e6-bbffabc4ebc9}, hash: 20942DF515AFFFC7F3680328912DFA6E
	@Test()
	void isAncestorOfWhenILessThan0() {
		/* Branches:
		 * (getNumberOfElements() >= name.getNumberOfElements()) : false
		 * (i >= 0) : false  #  inside elementsEqual method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(1).when(nameMock).getNumberOfElements();
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			_assert.when(() -> Assert.notNull(nameMock, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			boolean result = target.isAncestorOf(nameMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				verify(nameMock).getNumberOfElements();
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
				_assert.verify(() -> Assert.notNull(nameMock, "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3f99306f-7f4e-34f3-99ce-51cbd9b067bf}, hash: 89945C582A085086A254C94DD8A6556C
	@Test()
	void compareToWhenI2NotLessThanL2() {
		/* Branches:
		 * (i1 < l1) : false  #  inside compare method
		 * (i2 < l2) : false  #  inside compare method
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(0).when(n2Mock).getNumberOfElements();
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			int result = target.compareTo(n2Mock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(0));
				verify(n2Mock).getNumberOfElements();
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${f15ced91-476f-3118-9347-e6d6fe4e136a}, hash: 70C46C642CBB31C74C4B768C2F4DD3A1
	@Test()
	void compareToWhenI1NotLessThanL1AndI2LessThanL2ThrowsNullPointerException() {
		/* Branches:
		 * (i1 < l1) : false  #  inside compare method
		 * (i2 < l2) : true  #  inside compare method
		 * (i1 < l1) : false  #  inside compare method
		 * (i2 < l2) : true  #  inside compare method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(1).when(n2Mock).getNumberOfElements();
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			final NullPointerException result = assertThrows(NullPointerException.class, () -> {
				target.compareTo(n2Mock);
			});
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				verify(n2Mock).getNumberOfElements();
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${155368dd-6252-3895-854f-2166addc2cfe}, hash: 412A34BFF6E9FC339D63333D203B084E
	@Disabled()
	@Test()
	void compareToWhenResultNotEquals0() {
		/* Branches:
		 * (i1 < l1) : true  #  inside compare method
		 * (i1 < l1) : true  #  inside compare method
		 * (i2 < l2) : false  #  inside compare method
		 * (i1 < l1) : true  #  inside compare method
		 * (i2 < l2) : false  #  inside compare method
		 * (e1 == null) : true  #  inside compare method
		 * (result != 0) : true  #  inside compare method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(0).when(n2Mock).getNumberOfElements();
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			int result = target.compareTo(n2Mock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(-1));
				verify(n2Mock).getNumberOfElements();
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${c00e9222-9dde-3b2c-b737-81bbc3258b96}, hash: 783B6F27688816BA54FD5A025E1D0386
	@Disabled()
	@Test()
	void compareToWhenCaughtArrayIndexOutOfBoundsExceptionThrowsRuntimeException() {
		/* Branches:
		 * (i1 < l1) : true  #  inside compare method
		 * (i1 < l1) : true  #  inside compare method
		 * (i2 < l2) : false  #  inside compare method
		 * (i1 < l1) : true  #  inside compare method
		 * (i2 < l2) : false  #  inside compare method
		 * (e1 == null) : true  #  inside compare method
		 * (result != 0) : true  #  inside compare method
		 * (catch-exception (ArrayIndexOutOfBoundsException)) : true  #  inside compare method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(0).when(n2Mock).getNumberOfElements();
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			final RuntimeException result = assertThrows(RuntimeException.class, () -> {
				target.compareTo(n2Mock);
			});
			ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				assertThat(result.getCause(), is(instanceOf(arrayIndexOutOfBoundsException.getClass())));
				verify(n2Mock).getNumberOfElements();
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${379fb16a-9f66-3912-89c0-c923f1d04b9e}, hash: 5EEA9AAE48F538091BA74C51279ED55A
	@Disabled()
	@Test()
	void compareToWhenE2IsNullAndResultNotEquals0() {
		/* Branches:
		 * (i1 < l1) : true  #  inside compare method
		 * (i1 < l1) : true  #  inside compare method
		 * (i2 < l2) : false  #  inside compare method
		 * (i1 < l1) : true  #  inside compare method
		 * (i2 < l2) : false  #  inside compare method
		 * (e1 == null) : false  #  inside compare method
		 * (e2 == null) : true  #  inside compare method
		 * (result != 0) : true  #  inside compare method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			doReturn(0).when(n2Mock).getNumberOfElements();
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			int result = target.compareTo(n2Mock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(1));
				verify(n2Mock).getNumberOfElements();
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${763e6db3-3721-3433-8032-25809c0bd7ba}, hash: 5AAA22EE78F4B0843742C81B45589C3E
	@Disabled()
	@Test()
	void toStringWhenThisElementsCanShortcutWithSourceElementTypeUNIFORMElementTypeDASHED() {
		/* Branches:
		 * (this.string == null) : true
		 * (this.elements.canShortcutWithSource(ElementType.UNIFORM, ElementType.DASHED)) : true  #  inside buildToString method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = ConfigurationPropertyName.adapt("", 'A', functionMock);
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("buildToString_charSequence1"));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${b2b0ef0d-b14f-360e-9b74-1bedb98f169b}, hash: A96EF1A98AE7A3ADBB1323C4D975FE74
	@Disabled()
	@Test()
	void toStringWhenIndexed() {
		/* Branches:
		 * (this.string == null) : true
		 * (this.elements.canShortcutWithSource(ElementType.UNIFORM, ElementType.DASHED)) : false  #  inside buildToString method
		 * (i < elements) : true  #  inside buildToString method
		 * (!result.isEmpty()) : false  #  inside buildToString method
		 * (indexed) : true  #  inside buildToString method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("", 'A', functionMock));
			doReturn(true).when(target).isIndexed(0);
			doReturn("").when(target).getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo("[]"));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
				verify(target).isIndexed(0);
				verify(target).getElement(0, ConfigurationPropertyName.Form.ORIGINAL);
			});
		}
	}

	//Sapient generated method id: ${90c4017c-9ac9-3dc5-935d-5ef805034a7c}, hash: A2A40C00B7647685F36197C47F04B3A5
	@Disabled()
	@Test()
	void toStringWhenNotIndexed() {
		/* Branches:
		 * (this.string == null) : true
		 * (this.elements.canShortcutWithSource(ElementType.UNIFORM, ElementType.DASHED)) : false  #  inside buildToString method
		 * (i < elements) : true  #  inside buildToString method
		 * (!result.isEmpty()) : false  #  inside buildToString method
		 * (indexed) : false  #  inside buildToString method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			ConfigurationPropertyName target = spy(ConfigurationPropertyName.adapt("", 'A', functionMock));
			doReturn(false).when(target).isIndexed(0);
			doReturn("").when(target).getElement(0, ConfigurationPropertyName.Form.DASHED);
			//Act Statement(s)
			String result = target.toString();
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(""));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
				verify(target).isIndexed(0);
				verify(target).getElement(0, ConfigurationPropertyName.Form.DASHED);
			});
		}
	}

	//Sapient generated method id: ${6e61ee1e-4207-3f48-bcec-6ed4c0229294}, hash: 67F7F2F953E1B94364F8DCE639585D01
	@Test()
	void isValidWhenOfNameTrueIsNotNull() {
		/* Branches:
		 * (of(name, true) != null) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class, CALLS_REAL_METHODS)) {
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("isValid_charSequence1", true)).thenReturn(configurationPropertyNameMock);
			//Act Statement(s)
			boolean result = ConfigurationPropertyName.isValid("isValid_charSequence1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.TRUE));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("isValid_charSequence1", true), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${65dbb7f9-8067-39ca-a271-d4ddd22c74ab}, hash: 8F89D620E1775A1757EA4AD79D7155F3
	@Test()
	void isValidWhenOfNameTrueIsNull() {
		/* Branches:
		 * (of(name, true) != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class, CALLS_REAL_METHODS)) {
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("isValid_charSequence1", true)).thenReturn(null);
			//Act Statement(s)
			boolean result = ConfigurationPropertyName.isValid("isValid_charSequence1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(Boolean.FALSE));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("isValid_charSequence1", true), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${3155f475-158f-3510-8516-db6562387204}, hash: 697F0A6368585ACD0687E8A9BBCADAF4
	@Test()
	void ofTest() {
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class, CALLS_REAL_METHODS)) {
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("of_charSequence1", false)).thenReturn(configurationPropertyNameMock);
			//Act Statement(s)
			ConfigurationPropertyName result = ConfigurationPropertyName.of("of_charSequence1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyNameMock));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("of_charSequence1", false), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${43991db9-68c0-3f0d-b3e2-c8e9c3e6b36b}, hash: CC021FE18A0986EF751E599996025F5D
	@Test()
	void ofIfValidTest() {
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class, CALLS_REAL_METHODS)) {
			configurationPropertyName.when(() -> ConfigurationPropertyName.of("ofIfValid_charSequence1", true)).thenReturn(configurationPropertyNameMock);
			//Act Statement(s)
			ConfigurationPropertyName result = ConfigurationPropertyName.ofIfValid("ofIfValid_charSequence1");
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyNameMock));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.of("ofIfValid_charSequence1", true), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${253cb848-d0c8-3394-a070-ecd777efd8ab}, hash: E7200D38645C9B888E6ACBA47132B31E
	@Test()
	void of1WhenElementsIsNull() {
		/* Branches:
		 * (name == null) : true  #  inside elementsOf method
		 * (elements != null) : false
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.isTrue(false, "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			CharSequence charSequence = null;
			//Act Statement(s)
			ConfigurationPropertyName result = ConfigurationPropertyName.of(charSequence, false);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(nullValue()));
				_assert.verify(() -> Assert.isTrue(false, "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${711901d4-0ed2-36db-a259-022dbc7b914c}, hash: 15F3743A990808ED51B8700AA986D91D
	@Test()
	void of1WhenElementsIsNotNull() {
		/* Branches:
		 * (name == null) : false  #  inside elementsOf method
		 * (name.isEmpty()) : true  #  inside elementsOf method
		 * (elements != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		ConfigurationPropertyName result = ConfigurationPropertyName.of((CharSequence) "", false);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${0656251b-a4e1-3bac-b147-6eb0888bb576}, hash: 52C44414C44B89C05A4A4DBF865C1EB6
	@Disabled()
	@Test()
	void of1WhenNotReturnNullIfInvalidThrowsInvalidConfigurationPropertyNameException() {
		/* Branches:
		 * (name == null) : false  #  inside elementsOf method
		 * (name.isEmpty()) : false  #  inside elementsOf method
		 * (name.charAt(0) == '.') : false  #  inside elementsOf method
		 * (name.charAt(name.length() - 1) == '.') : true  #  inside elementsOf method
		 * (returnNullIfInvalid) : false  #  inside elementsOf method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		final InvalidConfigurationPropertyNameException result = assertThrows(InvalidConfigurationPropertyNameException.class, () -> {
			ConfigurationPropertyName.of((CharSequence) "name1", false);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${cd3ab7e9-39dc-3956-9ae9-68e1fee39e1f}, hash: 804BBCDF448FC538D098AAB0831C1DA4
	@Disabled()
	@Test()
	void of1WhenReturnNullIfInvalidAndElementsIsNull() {
		/* Branches:
		 * (name == null) : false  #  inside elementsOf method
		 * (name.isEmpty()) : false  #  inside elementsOf method
		 * (name.charAt(0) == '.') : false  #  inside elementsOf method
		 * (name.charAt(name.length() - 1) == '.') : true  #  inside elementsOf method
		 * (returnNullIfInvalid) : true  #  inside elementsOf method
		 * (elements != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		ConfigurationPropertyName result = ConfigurationPropertyName.of((CharSequence) "name1", false);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${1d28567e-e658-3797-9570-edc6c786e383}, hash: B7F6046CC9277B1F7DA8E3A377764D90
	@Disabled()
	@Test()
	void of1WhenElementsGetTypeINotEqualsElementTypeNON_UNIFORMAndElementsIsNotNull() {
		/* Branches:
		 * (name == null) : false  #  inside elementsOf method
		 * (name.isEmpty()) : false  #  inside elementsOf method
		 * (name.charAt(0) == '.') : false  #  inside elementsOf method
		 * (name.charAt(name.length() - 1) == '.') : false  #  inside elementsOf method
		 * (i < elements.getSize()) : true  #  inside elementsOf method
		 * (elements.getType(i) == ElementType.NON_UNIFORM) : false  #  inside elementsOf method
		 * (elements != null) : true
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		ConfigurationPropertyName result = ConfigurationPropertyName.of((CharSequence) "J", false);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${7a2c45a8-4736-343e-9dbb-89e219c5a22b}, hash: B3C571A861A682FDB7AB96313226BDA1
	@Test()
	void of1WhenElementsGetTypeIEqualsElementTypeNON_UNIFORMAndReturnNullIfInvalidAndElementsIsNull() {
		/* Branches:
		 * (name == null) : false  #  inside elementsOf method
		 * (name.isEmpty()) : false  #  inside elementsOf method
		 * (name.charAt(0) == '.') : false  #  inside elementsOf method
		 * (name.charAt(name.length() - 1) == '.') : false  #  inside elementsOf method
		 * (i < elements.getSize()) : true  #  inside elementsOf method
		 * (elements.getType(i) == ElementType.NON_UNIFORM) : true  #  inside elementsOf method
		 * (returnNullIfInvalid) : true  #  inside elementsOf method
		 * (elements != null) : false
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		ConfigurationPropertyName result = ConfigurationPropertyName.of((CharSequence) "C", true);
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(nullValue())));
	}

	//Sapient generated method id: ${f1260875-c4cf-394b-821d-b127960812b5}, hash: FC2368B46D5FBB27438D4FDC349CE968
	@Test()
	void of1WhenElementsParserNotIsValidCharChCharIndexThrowsInvalidConfigurationPropertyNameException() {
		/* Branches:
		 * (name == null) : false  #  inside elementsOf method
		 * (name.isEmpty()) : false  #  inside elementsOf method
		 * (name.charAt(0) == '.') : false  #  inside elementsOf method
		 * (name.charAt(name.length() - 1) == '.') : false  #  inside elementsOf method
		 * (i < elements.getSize()) : true  #  inside elementsOf method
		 * (elements.getType(i) == ElementType.NON_UNIFORM) : true  #  inside elementsOf method
		 * (returnNullIfInvalid) : false  #  inside elementsOf method
		 * (charIndex < elements.getLength(index)) : true  #  inside getInvalidChars method
		 * (!ElementsParser.isValidChar(ch, charIndex)) : true  #  inside getInvalidChars method
		 *
		 * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Act Statement(s)
		final InvalidConfigurationPropertyNameException result = assertThrows(InvalidConfigurationPropertyNameException.class, () -> {
			ConfigurationPropertyName.of((CharSequence) "C", false);
		});
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${7cb0c307-0ab8-33fc-b482-896df948fd60}, hash: 4394A27981FD50994928DB10CDF17317
	@Test()
	void adaptTest() {
		//Arrange Statement(s)
		try (MockedStatic<ConfigurationPropertyName> configurationPropertyName = mockStatic(ConfigurationPropertyName.class, CALLS_REAL_METHODS)) {
			configurationPropertyName.when(() -> ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null)).thenReturn(configurationPropertyNameMock);
			//Act Statement(s)
			ConfigurationPropertyName result = ConfigurationPropertyName.adapt("adapt_charSequence1", 'A');
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyNameMock));
				configurationPropertyName.verify(() -> ConfigurationPropertyName.adapt("adapt_charSequence1", 'A', (Function) null), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${30cbaeaa-63cc-3ba7-8954-2f85a2857f69}, hash: 7312F5CDAEF517421138887F4D0770F8
	@Test()
	void adapt1WhenNameIsEmpty() {
		/* Branches:
		 * (name.isEmpty()) : true
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			ConfigurationPropertyName result = ConfigurationPropertyName.adapt((CharSequence) "", 'A', functionMock);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.EMPTY;
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyName));
				_assert.verify(() -> Assert.notNull("", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${e3b07462-0103-35eb-8584-6b4fefee9e08}, hash: DCBB9873D1E44C091A0494E3DBC07767
	@Test()
	void adapt1WhenElementsGetSizeEquals0() {
		/* Branches:
		 * (name.isEmpty()) : false
		 * (elements.getSize() == 0) : true
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("A", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			ConfigurationPropertyName result = ConfigurationPropertyName.adapt((CharSequence) "A", 'A', functionMock);
			ConfigurationPropertyName configurationPropertyName = ConfigurationPropertyName.EMPTY;
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, equalTo(configurationPropertyName));
				_assert.verify(() -> Assert.notNull("A", "Name must not be null"), atLeast(1));
			});
		}
	}

	//Sapient generated method id: ${305b99c6-6c7c-3b43-afe8-c1aa84b706e9}, hash: 00CEF43273C3F63DAAA1F45DC32D10C7
	@Test()
	void adapt1WhenElementsGetSizeNotEquals0() {
		/* Branches:
		 * (name.isEmpty()) : false
		 * (elements.getSize() == 0) : false
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: object of type ConfigurationPropertyName.ElementsParser
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<Assert> _assert = mockStatic(Assert.class)) {
			_assert.when(() -> Assert.notNull("A", "Name must not be null")).thenAnswer((Answer<Void>) invocation -> null);
			//Act Statement(s)
			ConfigurationPropertyName result = ConfigurationPropertyName.adapt((CharSequence) "A", 'A', functionMock);
			//Assert statement(s)
			assertAll("result", () -> {
				assertThat(result, is(notNullValue()));
				_assert.verify(() -> Assert.notNull("A", "Name must not be null"), atLeast(1));
			});
		}
	}
}
