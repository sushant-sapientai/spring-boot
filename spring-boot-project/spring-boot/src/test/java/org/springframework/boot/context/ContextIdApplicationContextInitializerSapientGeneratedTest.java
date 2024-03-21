package org.springframework.boot.context;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import org.springframework.beans.BeansException;
import org.springframework.core.env.ConfigurableEnvironment;

import org.mockito.MockedStatic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.StringUtils;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ContextIdApplicationContextInitializerSapientGeneratedTest {

	private final ConfigurableApplicationContext applicationContextMock = mock(ConfigurableApplicationContext.class);

	private final ApplicationContext applicationContextMock2 = mock(ApplicationContext.class);

	private final ConfigurableEnvironment configurableEnvironmentMock = mock(ConfigurableEnvironment.class);

	private final ConfigurableListableBeanFactory configurableListableBeanFactoryMock = mock(ConfigurableListableBeanFactory.class);

	//Sapient generated method id: ${a8006fdc-e5d3-367c-869b-634e542e5867}, hash: B61C3DC11B0BF1F889E2F53CC5502492
	@Test()
	void initializeWhenParentContainsBeanContextIdGetName() throws BeansException, IllegalStateException {
		/* Branches:
		 * (parent != null) : true  #  inside getContextId method
		 * (parent.containsBean(ContextId.class.getName())) : true  #  inside getContextId method
		 */
		//Arrange Statement(s)
		doReturn(applicationContextMock2).when(applicationContextMock).getParent();
		doReturn(true).when(applicationContextMock2).containsBean("org.springframework.boot.context.ContextIdApplicationContextInitializer$ContextId");
		ContextIdApplicationContextInitializer.ContextId contextIdApplicationContextInitializerContextIdMock = mock(ContextIdApplicationContextInitializer.ContextId.class);
		doReturn(contextIdApplicationContextInitializerContextIdMock).when(applicationContextMock2).getBean(ContextIdApplicationContextInitializer.ContextId.class);
		ContextIdApplicationContextInitializer.ContextId contextIdApplicationContextInitializerContextIdMock2 = mock(ContextIdApplicationContextInitializer.ContextId.class);
		doReturn(contextIdApplicationContextInitializerContextIdMock2).when(contextIdApplicationContextInitializerContextIdMock).createChildId();
		doReturn("return_of_getId1").when(contextIdApplicationContextInitializerContextIdMock2).getId();
		doNothing().when(applicationContextMock).setId("return_of_getId1");
		doReturn(configurableListableBeanFactoryMock).when(applicationContextMock).getBeanFactory();
		doNothing().when(configurableListableBeanFactoryMock).registerSingleton("org.springframework.boot.context.ContextIdApplicationContextInitializer$ContextId", contextIdApplicationContextInitializerContextIdMock2);
		ContextIdApplicationContextInitializer target = new ContextIdApplicationContextInitializer();
		//Act Statement(s)
		target.initialize(applicationContextMock);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(applicationContextMock).getParent();
			verify(applicationContextMock2).containsBean("org.springframework.boot.context.ContextIdApplicationContextInitializer$ContextId");
			verify(applicationContextMock2).getBean(ContextIdApplicationContextInitializer.ContextId.class);
			verify(contextIdApplicationContextInitializerContextIdMock).createChildId();
			verify(contextIdApplicationContextInitializerContextIdMock2).getId();
			verify(applicationContextMock).setId("return_of_getId1");
			verify(applicationContextMock).getBeanFactory();
			verify(configurableListableBeanFactoryMock).registerSingleton("org.springframework.boot.context.ContextIdApplicationContextInitializer$ContextId", contextIdApplicationContextInitializerContextIdMock2);
		});
	}

	//Sapient generated method id: ${c9214af2-c356-3b67-aa39-5cf69748e8a1}, hash: 6DC0A7C2849B8505D1B9C34D0795C815
	@Disabled()
	@Test()
	void initializeWhenStringUtilsHasTextName() throws IllegalStateException {
		/* Branches:
		 * (parent != null) : true  #  inside getContextId method
		 * (parent.containsBean(ContextId.class.getName())) : false  #  inside getContextId method
		 * (StringUtils.hasText(name)) : true  #  inside getApplicationId method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: contextId
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		doReturn(applicationContextMock2).when(applicationContextMock).getParent();
		doReturn(false).when(applicationContextMock2).containsBean("org.springframework.boot.context.ContextIdApplicationContextInitializer$ContextId");
		doReturn(configurableEnvironmentMock).when(applicationContextMock).getEnvironment();
		doReturn("A").when(configurableEnvironmentMock).getProperty("spring.application.name");
		doNothing().when(applicationContextMock).setId("return_of_getId1");
		doReturn(configurableListableBeanFactoryMock).when(applicationContextMock).getBeanFactory();
		doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("org.springframework.boot.context.ContextIdApplicationContextInitializer$ContextId"), (ContextIdApplicationContextInitializer.ContextId) any());
		ContextIdApplicationContextInitializer target = new ContextIdApplicationContextInitializer();
		//Act Statement(s)
		target.initialize(applicationContextMock);
		//Assert statement(s)
		assertAll("result", () -> {
			verify(applicationContextMock).getParent();
			verify(applicationContextMock2).containsBean("org.springframework.boot.context.ContextIdApplicationContextInitializer$ContextId");
			verify(applicationContextMock).getEnvironment();
			verify(configurableEnvironmentMock).getProperty("spring.application.name");
			verify(applicationContextMock).setId("return_of_getId1");
			verify(applicationContextMock).getBeanFactory();
			verify(configurableListableBeanFactoryMock).registerSingleton(eq("org.springframework.boot.context.ContextIdApplicationContextInitializer$ContextId"), (ContextIdApplicationContextInitializer.ContextId) any());
		});
	}

	//Sapient generated method id: ${a70a1706-b9e8-3079-9212-e6f202c5b3eb}, hash: 9855F54539A89522B75DA8F373F936D7
	@Disabled()
	@Test()
	void initializeWhenParentNotContainsBeanContextIdGetNameAndStringUtilsNotHasTextName() throws IllegalStateException {
		/* Branches:
		 * (parent != null) : true  #  inside getContextId method
		 * (parent.containsBean(ContextId.class.getName())) : false  #  inside getContextId method
		 * (StringUtils.hasText(name)) : false  #  inside getApplicationId method
		 *
		 * TODO: Help needed! This method is not unit testable!
		 *  Following variables could not be isolated/mocked: contextId
		 *  Suggestions:
		 *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
		 *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
		 *  The test code, including the assertion statements, has been successfully generated.
		 */
		//Arrange Statement(s)
		try (MockedStatic<StringUtils> stringUtils = mockStatic(StringUtils.class)) {
			doReturn(applicationContextMock2).when(applicationContextMock).getParent();
			doReturn(false).when(applicationContextMock2).containsBean("org.springframework.boot.context.ContextIdApplicationContextInitializer$ContextId");
			doReturn(configurableEnvironmentMock).when(applicationContextMock).getEnvironment();
			doReturn("A").when(configurableEnvironmentMock).getProperty("spring.application.name");
			doNothing().when(applicationContextMock).setId("return_of_getId1");
			doReturn(configurableListableBeanFactoryMock).when(applicationContextMock).getBeanFactory();
			doNothing().when(configurableListableBeanFactoryMock).registerSingleton(eq("org.springframework.boot.context.ContextIdApplicationContextInitializer$ContextId"), (ContextIdApplicationContextInitializer.ContextId) any());
			stringUtils.when(() -> StringUtils.hasText("A")).thenReturn(false);
			ContextIdApplicationContextInitializer target = new ContextIdApplicationContextInitializer();
			//Act Statement(s)
			target.initialize(applicationContextMock);
			//Assert statement(s)
			assertAll("result", () -> {
				verify(applicationContextMock).getParent();
				verify(applicationContextMock2).containsBean("org.springframework.boot.context.ContextIdApplicationContextInitializer$ContextId");
				verify(applicationContextMock).getEnvironment();
				verify(configurableEnvironmentMock).getProperty("spring.application.name");
				verify(applicationContextMock).setId("return_of_getId1");
				verify(applicationContextMock).getBeanFactory();
				verify(configurableListableBeanFactoryMock).registerSingleton(eq("org.springframework.boot.context.ContextIdApplicationContextInitializer$ContextId"), (ContextIdApplicationContextInitializer.ContextId) any());
				stringUtils.verify(() -> StringUtils.hasText("A"), atLeast(1));
			});
		}
	}
}
