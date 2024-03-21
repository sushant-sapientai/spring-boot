package org.springframework.boot.context.properties.source;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class InvalidConfigurationPropertyNameExceptionSapientGeneratedTest {

	//Sapient generated method id: ${ff60e760-c0f2-32b5-847a-d545e0e1d084}, hash: 9EC40D99399C7CAB01BA45D89897EA15
	@Test()
	void throwIfHasInvalidCharsWhenInvalidCharactersNotIsEmptyThrowsInvalidConfigurationPropertyNameException() {
		/* Branches:
		 * (!invalidCharacters.isEmpty()) : true
		 */
		//Arrange Statement(s)
		List<Character> characterList = new ArrayList<>();
		characterList.add('A');
		//Act Statement(s)
		final InvalidConfigurationPropertyNameException result = assertThrows(InvalidConfigurationPropertyNameException.class, () -> {
			InvalidConfigurationPropertyNameException.throwIfHasInvalidChars("throwIfHasInvalidChars_charSequence1", characterList);
		});

		//Assert statement(s)
		assertAll("result", () -> assertThat(result, is(notNullValue())));
	}

	//Sapient generated method id: ${90e5c96f-2449-37e4-96a1-29dbbf36350f}, hash: 71F15C6FA6215AD3330F1F5B9FA564EB
	@Test()
	void throwIfHasInvalidCharsWhenInvalidCharactersIsEmpty() {
		/* Branches:
		 * (!invalidCharacters.isEmpty()) : false
		 */
		//Arrange Statement(s)
		List<Character> characterList = new ArrayList<>();

		//Act Statement(s)
		InvalidConfigurationPropertyNameException.throwIfHasInvalidChars("throwIfHasInvalidChars_charSequence1", characterList);
	}
}
