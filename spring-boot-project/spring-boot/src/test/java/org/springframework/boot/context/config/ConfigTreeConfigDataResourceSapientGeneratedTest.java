package org.springframework.boot.context.config;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ConfigTreeConfigDataResourceSapientGeneratedTest {

	//Sapient generated method id: ${363d3698-f34c-39ad-914f-376a19498023}, hash: 509A2F165EF72837565CE31EBD575552
	@Disabled()
	@Test()
	void toStringTest() {
		//Arrange Statement(s)
		ConfigTreeConfigDataResource target = new ConfigTreeConfigDataResource("A");
		//Act Statement(s)
		String result = target.toString();
		//Assert statement(s)
		assertAll("result", () -> assertThat(result, equalTo("config tree [/A]")));
	}
}
