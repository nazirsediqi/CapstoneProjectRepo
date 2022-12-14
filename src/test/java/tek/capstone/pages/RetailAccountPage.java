package tek.capstone.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);

	}
	@FindBy(id="accountLink")
	public WebElement accountOption; 
	
	@FindBy(id="nameInput")
	public WebElement nameInput;
	
	@FindBy(id="emailInput")
	public WebElement emailInput;
	
	@FindBy(id="personalPhoneInput")
	public WebElement phoneInput;
	
	@FindBy(xpath="//button[@id='personalUpdateBtn']")
	public WebElement updateBtn;
	
	// Scenario 4
	@FindBy(id="previousPasswordInput")
	public WebElement prePassInput;
	
	@FindBy(id="newPasswordInput")
	public WebElement newPassInput;
	
	@FindBy(id="confirmPasswordInput")
	public WebElement confirmPassInput;
	
	@FindBy(id="credentialsSubmitBtn")
	public WebElement changePassBtn;
	
	// 5. Add payment method
	@FindBy(id="accountLink")
	public WebElement ClickaccountOption;
	
	@FindBy(linkText="Add a payment method")
	public WebElement addPaymentMethod;
	
	@FindBy(id="cardNumberInput")
	public WebElement cardNumberInput;
	
	@FindBy(id="nameOnCardInput")
	public WebElement nameOnCardInput;
	
	@FindBy(id="expirationMonthInput")
	public WebElement expMonthInput;
	
	@FindBy(id="expirationYearInput")
	public WebElement expYearInput;
	
	@FindBy(id="securityCodeInput")
	public WebElement securityCodeInput;
	
	@FindBy(id="paymentSubmitBtn")
	public WebElement paymentSubmitBtn;
	
	//6. Edit Debit, Credit Card
	
	@FindBy(xpath = "//div[@Class='account__payment-sub']")
	 public WebElement masterCard;
	
	@FindBy(xpath="//button[contains(text(),'Edit')]")
	public WebElement editOption;
	
	@FindBy(id="cardNumberInput")
	public WebElement editCarNumber;
	
	@FindBy(id="nameOnCardInput")
	public WebElement editNameOnCard;
	
	@FindBy(id="expirationMonthInput")
	public WebElement expirationMonthInput;
	
	@FindBy(id="expirationYearInput")
	public WebElement expirationYearInput;
	
	@FindBy(id="securityCodeInput")
	public WebElement editSecurityCodeInput;
	
	@FindBy(id="paymentSubmitBtn")
	public WebElement upDateYourCard;
	
	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
    public WebElement paymentMethodUpdatedSuccessfully;

	
	// Scenario 7
	@FindBy(xpath="//button[contains(text(),'remove')]")
	public WebElement removeOption;
	
	// Scenario 8
	@FindBy(xpath="//div[@class='account__address-new']")
	public WebElement clickAddressOption;
	
	//@FindBy(xpath="//select[@name='country']//self::select")
	@FindBy(id="countryDropdown")
	public WebElement countryDropDown;
	
	@FindBy(id="fullNameInput")
	public WebElement fullName;
	
	@FindBy(id="phoneNumberInput")
	public WebElement phoneNumber;
	
	@FindBy(id="streetInput")
	public WebElement streetInput;
	
	@FindBy(id="apartmentInput")
	public WebElement apartmentNumber;
	
	@FindBy(id="cityInput")
	public WebElement cityInput;
	
	@FindBy(xpath="//select[@name='state']//self::select")
//	@FindBy(xpath="//select[@class='account__address-new-dropdown']")
	public WebElement stateDropDown;
	
	@FindBy(id="zipCodeInput")
	public WebElement zipCode;
	
	@FindBy(id="addressBtn")
	public WebElement addressBtn;
	
	// Scenario 9
	@FindBy(xpath="//button[contains(text(),'Edit')]")
	public WebElement editAddBtn;
	
	@FindBy(id="addressBtn")
	public WebElement updateYourAddBtn;
	
	// Scenario 10
	
	@FindBy(xpath = "//button[text()='Remove']")
	public WebElement addRemoveBtn;
	
	// Scenario 11
	
	@FindBy(id="searchInput")
	public WebElement searchInput;
	
	@FindBy(id="searchBtn")
	public WebElement searchBtn;
	
	//@FindBy(xpath="//img[@alt='Kasa Outdoor Smart Plug']")
	@FindBy(xpath="//p[text()='Kasa Outdoor Smart Plug']")
	public WebElement kasaOutDoorPlug;
	
	@FindBy(xpath="//select[@class='product__select']")
//	@FindBy(xpath="#root > div.main-container > div:nth-child(1) > div.bg-gray-100 > div > div.product__layout > div.product__cart > div > div > select > option:nth-child(4)")
	public WebElement quantity;
	
	@FindBy(xpath="//span[text()='Add to Cart']")
	public WebElement addtoCartBtn;
	
	@FindBy(xpath="//span[text()='Plugs and Outlets']")
	public WebElement plugAndOutlets;
	
	// Scenario 12
	@FindBy(xpath="//div[@id='cartBtn']")
	public WebElement cartOption;
	
	@FindBy(id="proceedBtn")
	public WebElement proceedBtn;
	
	@FindBy(id="addAddressBtn")
	public WebElement addAddressBtn;
	
	@FindBy(id="addPaymentBtn")
	public WebElement addPaymentBtn;
	
	@FindBy(id="fullNameInput")
	public WebElement fullNameInput;
	
	@FindBy(id="phoneNumberInput")
	public WebElement phoneNumberInput;
	
	@FindBy(id="streetInput")
	public WebElement streetNoInput;
	
	@FindBy(id="apartmentInput")
	public WebElement apartmentInput;
	
	@FindBy(id="cityInput")
	public WebElement cityNameInput;
	
	@FindBy(id="zipCodeInput")
	public WebElement zipCodeInput;
	
//	@FindBy(xpath = "//img[@alt='Kasa Outdoor Smart Plug']")
//    public WebElement kasaPlug;
//
//    @FindBy(xpath = ("//button[@id='closeBtn']//*[name()='svg']"))
//    public WebElement closeBtn;
//
//    @FindBy(xpath = "select[class='product__select'] option[value='2']")
//    public WebElement quantity;
//
//    @FindBy(xpath = "//button[@class='search__btn']")
//    public WebElement searchButton;
	@FindBy(xpath="//select[@name='country']/option[237]")
	public WebElement countryDropD;
	
	@FindBy(xpath="//select[@name='state']")
	public WebElement stateDropD;
	
	@FindBy(id="addressBtn")
	public WebElement addBtn;
	
	@FindBy(id="paymentSubmitBtn")
	public WebElement paymentSubmitButton;
	
	@FindBy(xpath="//button[@id='placeOrderBtn']")
	public WebElement placeOrdreBtn;
	
}
