package com.hippo.stepdef;

import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.json.JSONException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.hippo.mailvalidation.NadaEMailService;
import com.hippo.page.HippoPageObject;
import com.mashape.unirest.http.exceptions.UnirestException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class HippoStepDef extends PageObject{
	HippoPageObject hippoPageObject;
	private NadaEMailService nada;
	
	/**
	 * Scroll to specific element
	 * 
	 */
	public void ScrolltoElementJS(WebElementFacade element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	@Given("^Go to this URL \"([^\"]*)\"$")
	public void go_to_this_URL(String URL) {
	    
		getDriver().get("https://www.hippovideo.io");
	}


	@Given("^Click on Sign Up button and enter valid email and password in that field$")
	public void click_on_Sign_Up_button_and_enter_valid_email_and_password_in_that_field() {
		String generatedString = RandomStringUtils.randomAlphabetic(10);
	    System.out.println(generatedString);
	    hippoPageObject.closeWebinarVideo.click();
	    hippoPageObject.signUpEmail.sendKeys("hippo" + generatedString + "@gmail.com");
	    hippoPageObject.signUpPassword.sendKeys("NoPassword@123");
	    waitABit(2000);
	    hippoPageObject.signUpButton.click();
	    
	}

	@Given("^Then Click on Business plan$")
	public void then_Click_on_Business_plan() {
	    
		 hippoPageObject.businessOption.click();
	}

	@Given("^Then Select Personalized marketing campaigns to boost conversions\\.Then click on Next button$")
	public void then_Select_Personalized_marketing_campaigns_to_boost_conversions_Then_click_on_Next_button() {
		hippoPageObject.marketingOption.click();
	    hippoPageObject.businessNext.click();
	    
	}

	@Given("^Enter First Name,Company Name and Phone number$")
	public void enter_First_Name_Company_Name_and_Phone_number() {
		hippoPageObject.firstName.sendKeys("Test");
	    hippoPageObject.companyName.sendKeys("Automation");
	    hippoPageObject.phoneNumber.sendKeys("91234567896");
	    
	    
	}

	@Then("^click on Get Started button it will redirect to inside product$")
	public void click_on_Get_Started_button_it_will_redirect_to_inside_product() {
		hippoPageObject.saveCompanyName.click();
	    waitABit(10000);
	    
	}

	@Given("^Create the video using Stock Images$")
	public void create_the_video_using_Stock_Images() {
	    
		hippoPageObject.login.click();
		hippoPageObject.loginEmail.sendKeys("rajkumar.regalia@gmail.com");
		hippoPageObject.loginPassword.sendKeys("Alone@123");
		hippoPageObject.signIn.click();
		waitFor(hippoPageObject.addIcon);
		hippoPageObject.addIcon.click();
		waitABit(2000);
		hippoPageObject.createVideo.click();
		waitABit(10000);
		waitFor(hippoPageObject.createVideoRecord);
		hippoPageObject.createVideoRecord.click();
		waitFor(hippoPageObject.FreeStockImages);
		hippoPageObject.FreeStockImages.click();
		hippoPageObject.searchFromWebTextBox.sendKeys("Cars");
		hippoPageObject.searchFromWebTextBox.sendKeys(Keys.ENTER);
		hippoPageObject.imageList.click();
		hippoPageObject.importImage.click();
		waitABit(5000);
		hippoPageObject.saveSlideshow.click();
		hippoPageObject.saveVideoCreation.click();
		waitABit(15000);
	}

	@Given("^Personalize the video that created$")
	public void personalize_the_video_that_created() {
		waitFor(hippoPageObject.videoTitle);
		hippoPageObject.videoTitle.clear();
		hippoPageObject.videoTitle.sendKeys("Hippo Task");
		hippoPageObject.videoDesc.clear();
		hippoPageObject.videoDesc.sendKeys("This is my video creation in Hippo");
		listElementClick(hippoPageObject.videoEditOptions, "Personalize Video");
		waitFor(hippoPageObject.thumbnailPersonalizationButton);
		hippoPageObject.thumbnailPersonalizationButton.click();
		waitABit(5000);
		hippoPageObject.addPersonalizedText.click();
		hippoPageObject.enterTexthere.sendKeys("Car Related Video Creation");
		waitABit(3000);
		ScrolltoElementJS(hippoPageObject.txtFont);
		hippoPageObject.txtFont.click();
		waitABit(3000);
		listElementClick(hippoPageObject.openedDropdownText, "Coda");
		hippoPageObject.editSaveBtn.click();
		waitABit(15000);
	    
	}

	@Given("^Send the video through mail$")
	public void send_the_video_through_mail() {
		listElementClick(hippoPageObject.videoEditOptions, "Video Campaigns");
		hippoPageObject.sendMail.click();
		hippoPageObject.addContacts.click();
		hippoPageObject.emailTextBox1.sendKeys("lomox@getnada.com");
		waitABit(2000);
		hippoPageObject.addContactsSubmit.click();
		waitABit(3000);
		hippoPageObject.subject.sendKeys("Hippo Video Creation");
		waitABit(2000);
		hippoPageObject.surveyIcon.click();
		ScrolltoElementJS(hippoPageObject.sendEmailBtn);
		hippoPageObject.sendEmailBtn.click();
		waitABit(20000);
		Serenity.takeScreenshot();
	    
	}

	@Then("^Verify the video in mail$")
	public void verify_the_video_in_mail() throws JsonMappingException, IllegalArgumentException, JSONException, JsonProcessingException, UnirestException {
		getDriver().get("https://getnada.com/");
		nada.getEmailId();
		System.out.println(nada.getEmailId());
		String msg = nada.getMessageWithSubjectStartsWith("Hippo Video").getText();
		System.out.println(msg); 
	}

	public void listElementClick(List<WebElementFacade> element, String text) {
		for (int i = 0; i < element.size(); i++) {
			if (element.get(i).getText().trim().equalsIgnoreCase(text.trim())) {
				ScrolltoElementJS(element.get(i));
				element.get(i).click();
			}
		}
	}
}
