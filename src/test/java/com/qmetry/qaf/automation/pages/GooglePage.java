package com.qmetry.qaf.automation.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class GooglePage extends WebDriverBaseTestPage<WebDriverTestPage>  {

	@FindBy(locator = "{'locator':'name=q';'desc':'Google Search TextBox'}")
	public QAFWebElement googleSearchTextBox;
	//input[@name="q"]
	
	
	@FindBy(locator = "{'locator':'name=btnK';'desc':'Google Search Button'}")
	public QAFWebElement googleSearchButton;
	
	
	
	public void invoke() {
		launchPage(null);
	}
	
	public void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		driver.get("/");
		driver.manage().window().maximize();
	}

}
