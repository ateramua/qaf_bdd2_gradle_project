package com.qmetry.qaf.automation.steps;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.qmetry.qaf.automation.pages.GooglePage;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;
import com.qmetry.qaf.automation.utility.TestBase;



import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.hamcrest.Matchers;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.util.ClassUtil;
import com.qmetry.qaf.automation.util.Validator;

@QAFTestStepProvider()
public class GoogleSearchSteps extends WebDriverTestCase{
	
	
	    QAFExtendedWebDriver objDriver = getDriver();
		GooglePage googlepage = new GooglePage();
	
		static final Log logger = LogFactory.getLog(GoogleSearchSteps.class);
	
		@QAFTestStep(description = "user is on google Web Page")
		public void searchForText(String strText) {
			
			TestBase.initialization();
			/*
			googlepage.openPage(null, "");
			googlepage.invoke();
			googlepage.waitForPageToLoad();
			*/
			
		}
	


		@QAFTestStep(description = "user enters text in google search box")
		public void enterTextInSearchFeild(String strText) {
			
		}
		
		
		@QAFTestStep(description = "click on Google Search Button")
		public void clickOnSearchButton(String strText) {
			
		}
		
		@QAFTestStep(description = "search result page should generate")
		public void verifySearchResultGenerates(String strText) {
			
		}
}
