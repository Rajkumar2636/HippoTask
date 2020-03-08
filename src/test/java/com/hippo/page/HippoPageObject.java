package com.hippo.page;


import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;


public class HippoPageObject extends PageObject {

	@FindBy(xpath="(//input[@placeholder='Enter email'])[1]")
	public WebElementFacade signUpEmail;
	
	@FindBy(xpath="(//input[@placeholder='Password'])[1]")
	public WebElementFacade signUpPassword;
	
	@FindBy(xpath="(//button[contains(text(),'SIGN UP FOR FREE')])[2]")
	public WebElementFacade signUpButton;

	@FindBy(xpath="//div[contains(@id,'Business-')]")
	public WebElementFacade businessOption;
	
	@FindBy(xpath="//div[@id='Marketing']")
	public WebElementFacade marketingOption;
	
	@FindBy(xpath="(//a[@href='/users/sign_in/'])[2]")
	public WebElementFacade login;
	
	@FindBy(xpath="//input[@placeholder='Enter your Email']")
	public WebElementFacade loginEmail;
	
	@FindBy(xpath="//input[@name='user[password]']")
	public WebElementFacade loginPassword;
	
	@FindBy(xpath="//input[@value='SIGN IN']")
	public WebElementFacade signIn;
	
	@FindBy(xpath="//a[@id='Business-next-btn']")
	public WebElementFacade businessNext;
		
	@FindBy(xpath="//input[@placeholder='First Name']")
	public WebElementFacade firstName;
			
	@FindBy(xpath="//input[@placeholder='Your company name']")
	public WebElementFacade companyName;
	
	@FindBy(xpath="//input[@placeholder='Your Phone Number']")
	public WebElementFacade phoneNumber;
	
	@FindBy(xpath="//a[@id='saveCompanyName']")
	public WebElementFacade saveCompanyName;
	
	@FindBy(xpath="//div[@class='importIcon import']")
	public WebElementFacade addIcon;
	
	@FindBy(xpath="//section[@data-name='Create video _+']")
	public WebElementFacade createVideo;
	
	@FindBy(xpath="//a[contains(@href,'/video/create')]")
	public WebElementFacade createVideoRecord;
	
	@FindBy(xpath="//div[@id='importWebTab']")
	public WebElementFacade FreeStockImages;
	
	@FindBy(xpath="//input[@id='searchFromWebTextBox']")
	public WebElementFacade searchFromWebTextBox;
	
	@FindBy(xpath="(//div[@id='importWebContent']//div)[2]")
	public WebElementFacade imageList;
	
	@FindBy(xpath="//button[@id='import']")
	public WebElementFacade importImage;
	
	@FindBy(xpath="//button[@id='saveSlideshow']")
	public WebElementFacade saveSlideshow;
	
	@FindBy(xpath="//button[@id='finishVideoCreationYesBtn']")
	public WebElementFacade saveVideoCreation;
	
	@FindBy(xpath="//input[@id='videoTitle']")
	public WebElementFacade videoTitle;

	@FindBy(xpath="//textarea[@id='videoDescription']")
	public WebElementFacade videoDesc;
	
	@FindBy(xpath="//div//ul[@id='sidebarAccordion']//li")
	public List<WebElementFacade> videoEditOptions ;
	
	@FindBy(xpath="//button[@id='thumbnailPersonalizationButton']")
	public WebElementFacade thumbnailPersonalizationButton;

	@FindBy(xpath="//div[@id='tpAddPersonalizedText']")
	public WebElementFacade addPersonalizedText;
	
	@FindBy(xpath="//div[@data-placeholder='Enter text here']")
	public WebElementFacade enterTexthere;
	
	@FindBy(xpath="//span[@class='selection']//span[@title='Montserrat']")
	public WebElementFacade txtFont;
	
//	@FindBy(xpath="(//span[contains(@class,'rendered')])[3]")
//	public WebElementFacade pixel;
//	
//	@FindBy(xpath="(//span[contains(@class,'rendered')])[4]")
//	public WebElementFacade alignment;
	
	@FindBy(xpath="//ul[@aria-expanded='true']//li")
	public List<WebElementFacade> openedDropdownText;
	
	@FindBy(xpath="//ul[@aria-expanded='true']//li")
	public List<WebElementFacade> openedDropdownPixel;
	
	@FindBy(xpath="//ul[@aria-expanded='true']//li")
	public List<WebElementFacade> openedDropdownAlignment;
	
	@FindBy(xpath="//button[@id='thumbnailEditSaveBtn']")
	public WebElementFacade editSaveBtn;
	
	//input[@placeholder='Email']
	//input[@placeholder='First Name']
	
	@FindBy(xpath="//div[contains(text(),'Send Mail')]")
	public WebElementFacade sendMail;
	
	@FindBy(xpath="//input[@name='subject']")
	public WebElementFacade subject;
	
	@FindBy(xpath="(//span[@class='add-contacts-btn'])[1]")
	public WebElementFacade addContacts;
	
	@FindBy(xpath="(//input[@name='email'])[1]")
	public WebElementFacade emailTextBox1;
	
	@FindBy(xpath="//a[@id='addContacts']")
	public WebElementFacade addContactsSubmit;
	
	@FindBy(xpath="//button[@id='sendEmailBtn']")
	public WebElementFacade sendEmailBtn;

	@FindBy(xpath="//button[contains(@class,'openStateToggle')]")
	public WebElementFacade surveyIcon;
	
}
