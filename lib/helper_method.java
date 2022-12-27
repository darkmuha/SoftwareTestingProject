
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import pages.*;

public class helper_method {

  Homepage home = new Homepage();
  Search_Bar search = new Search_Bar();
  LoginPage login = new LoginPage();
  FirstProductpage firstProductPage = new FirstProductpage();
  SecondProductPage secondProductPage = new SecondProductPage();
  NavBarItems nav = new NavBarItems();
  CheckOutPage checkout = new CheckOutPage();
  ShippingPage shipping = new ShippingPage();
  LoginShippingPage Loginshipping = new LoginShippingPage();
  PaymentPage pay = new PaymentPage();
  AddressBook addressBook = new AddressBook();
  MyAccountPage myPage = new MyAccountPage();
  EditAddress editAddress = new EditAddress();
  ReviewPage review = new ReviewPage();
  AddressVerification addressVerification = new AddressVerification();
  ScrollDown scrollDown = new ScrollDown();
  ChangePassword changePassword = new ChangePassword();
  CreateAccountpage createAccountpage = new CreateAccountpage();


  void clickFirstAddToCart(WebDriver driver) {
    home.getFirstAddToCart(driver).click();
  }

  void clickSecondAddToCart(WebDriver driver) {
    home.getSecondAddToCart(driver).click();
  }

  void Searchbar(WebDriver driver) {
    search.getSearchbar(driver).click();
  }

  void SearchbarTxt(WebDriver driver) {
    search.getSearchbarTxt(driver).sendKeys("swimsuit");

  }

  void SearchbarColourTxt(WebDriver driver) {
    search.getSearchbarColourTxt(driver).sendKeys("teal");
  }

  void SearchXBtn(WebDriver driver) {
    search.getSearchXBtn(driver).click();
  }

  void SearchbarRecomendation(WebDriver driver) {
    search.getSearchbarRecomendation(driver).click();
  }

  void SearchBarClear(WebDriver driver) {
    search.getSearchbarClear(driver).clear();
  }

  void scrollToHomePageProducts(WebDriver driver) {
    JavascriptExecutor js = (JavascriptExecutor) driver;

    js.executeScript("window.scrollBy(0, 540)");
  }

  void generalScroll(WebDriver driver) {
    JavascriptExecutor js1 = (JavascriptExecutor) driver;

    js1.executeScript("window.scroll(0,150)");
  }

  void selectFirstProductFirstSize(WebDriver driver) {
    firstProductPage.getFirstSize(driver).click();
  }

  void clickFirstProductAddToCart(WebDriver driver) {
    firstProductPage.getAddToCart(driver).click();
  }

  void increaseFirstProductQuanitiy(WebDriver driver) {
    firstProductPage.getQuantityPlus(driver).click();
  }

  void selectSecondProductFirstSize(WebDriver driver) {
    secondProductPage.getFirstSize(driver).click();
  }

  void clickSecondProductAddToCart(WebDriver driver) {
    secondProductPage.getAddToCart(driver).click();
  }

  void increaseSecondProductQuanitiy(WebDriver driver) {
    secondProductPage.getQuantityPlus(driver).click();
  }

  void clickOnTheLogo(WebDriver driver) {
    nav.getLogo(driver).click();
  }

  void clickOnTheLogin(WebDriver driver) {
    nav.getLogin(driver).click();
  }

  void clickOnTheMiniCart(WebDriver driver) {
    nav.getMiniCart(driver).click();
  }

  void clickOnMiniCartTrash(WebDriver driver) {
    nav.getTrashBinButtonInMiniCart(driver).click();
  }

  void clickOkToRemoveItemPopUp(WebDriver driver) {
    nav.getOkForRemoveItemPopUp(driver).click();
  }

  void fillUsername(WebDriver driver) {
    login.getUsername(driver).clear();
    login.getUsername(driver).sendKeys("45malsi2108@gmail.com");
  }

  void fillPassword(WebDriver driver) {
    login.getPassword(driver).clear();
    login.getPassword(driver).sendKeys("62282152Ik?");
  }

  void clickOnSignIn(WebDriver driver) {
    login.getSignin(driver).click();
  }

  void clickProceedToCheckOut(WebDriver driver) {
    checkout.getProceedCheckOut(driver).click();
  }

  void clickTrashBinOfSecondItem(WebDriver driver) {
    checkout.getTrashBinOfSecondItem(driver).click();
  }

  void changeFirstItemQuantityToTwo(WebDriver driver) {
    checkout.getItemQuantityOfFirstItem(driver).clear();
    checkout.getItemQuantityOfFirstItem(driver).sendKeys("2");
  }

  void clickUpdateShoppingCart(WebDriver driver) {
    checkout.getUpdateShoppingCart(driver).click();
  }

  double calculateOrderTotal(WebDriver driver) {
    double CalculatedOrderTotal = 0.0;
    for (int i = 0; i < checkout.getItemsQuantity(driver).size(); i++) {
      CalculatedOrderTotal += Double.parseDouble(
          checkout.getItemsQuantity(driver).get(i).getAttribute("value")) *
          Double.parseDouble(
              checkout
                  .getSubTotals(driver)
                  .get(i)
                  .getText()
                  .substring(
                      1,
                      checkout.getSubTotals(driver).get(i).getText().length()));
    }
    return CalculatedOrderTotal;
  }

  void clickEstimateShippingAndTax(WebDriver driver) {
    checkout.getEstimateShippingAndTax(driver).click();
  }

  void selectTaxCountryDropDown(WebDriver driver) {
    checkout
        .getDropDownForCountry(driver)
        .selectByVisibleText("Bosnia & Herzegovina");
  }

  void fillTaxState(WebDriver driver) {
    checkout.getState(driver).sendKeys("Sarajevo");
  }

  void fillTaxPostalCode(WebDriver driver) {
    checkout.getPostalCode(driver).sendKeys("71000");
  }

  void clickFirstRadioButtonTaxShipping(WebDriver driver) {
    checkout.getFirstRadioButtonTaxShipping(driver).click();
  }

  double getShippingAndTaxesDouble(WebDriver driver) {
    return Double.parseDouble(
        checkout
            .getShippingAndTaxes(driver)
            .getText()
            .substring(1, checkout.getShippingAndTaxes(driver).getText().length()));
  }

  double getOrderTotalDouble(WebDriver driver) {
    return Double.parseDouble(
        checkout
            .getOrderTotal(driver)
            .getText()
            .substring(1, checkout.getOrderTotal(driver).getText().length()));
  }

  void fillEmail(WebDriver driver) {
    shipping.getInputForEmail(driver).sendKeys("kohil.islam45@gmail.com");
  }

  void fillFirstName(WebDriver driver) {
    shipping.getInputForFirstName(driver).sendKeys("Moha");
  }

  void fillLastName(WebDriver driver) {
    shipping.getInputForLastName(driver).sendKeys("koh");
  }

  void fillStreetAddress(WebDriver driver) {
    shipping.getInputForStreetAddress(driver).sendKeys("Address 123");
  }

  void selectDropDownForCountry(WebDriver driver) {
    shipping.getDropDownForCountry(driver).selectByVisibleText("Austria");
  }

  void fillCity(WebDriver driver) {
    shipping.getInputForCity(driver).sendKeys("SomeAustrianCity");
  }

  void fillPostalCode(WebDriver driver) {
    shipping.getInputForPostalCode(driver).sendKeys("12344");
  }

  void fillPhoneNumber(WebDriver driver) {
    shipping.getInputForPhoneNumber(driver).sendKeys("06442143512");
  }

  void clickNextInShipping(WebDriver driver) {
    shipping.getNextButton(driver).click();
  }

  void LoginfillStreetAddress(WebDriver driver) {
    Loginshipping.getInputForStreetAddress(driver).sendKeys("Address 123");
  }

  void LoginselectDropDownForCountry(WebDriver driver) {
    Loginshipping.getDropDownForCountry(driver).selectByVisibleText("Austria");
  }

  void LoginfillCity(WebDriver driver) {
    Loginshipping.getInputForCity(driver).sendKeys("SomeAustrianCity");
  }

  void LoginfillPostalCode(WebDriver driver) {
    Loginshipping.getInputForPostalCode(driver).sendKeys("12344");
  }

  void LoginfillPhoneNumber(WebDriver driver) {
    Loginshipping.getInputForPhoneNumber(driver).sendKeys("06442143512");
  }

  void LoginclickNextInShipping(WebDriver driver) {
    Loginshipping.getNextButton(driver).click();
  }

  void selectPaypal(WebDriver driver) {
    pay.getPaypal(driver).click();
  }

  void selectCredit(WebDriver driver) {
    pay.getCredit(driver).click();
  }

  void selectAlipay(WebDriver driver) {
    pay.getAlipay(driver).click();
  }

  void clickAddressBook(WebDriver driver) {
    myPage.getAddressBook(driver).click();
  }

  void clickChangeBillingAddress(WebDriver driver) {
    addressBook.getChangeBillingAddress(driver).click();
  }

  void fillNewFirstName(WebDriver driver) {
    // editAddress.getInputForFirstName(driver).clear();
    editAddress.getInputForFirstName(driver).sendKeys("NewName");
  }

  void fillNewLastName(WebDriver driver) {
    editAddress.getInputForLastName(driver).clear();
    editAddress.getInputForLastName(driver).sendKeys("NewLastName");
  }

  void fillNewStreetAddress(WebDriver driver) {

    editAddress.getInputForStreetAddress(driver).click();
    editAddress.getInputForStreetAddress(driver).clear();
    editAddress.getInputForStreetAddress(driver).sendKeys("Address321");
  }

  void selectNewDropDownForCountry(WebDriver driver) {
    editAddress.getDropDownForCountry(driver).selectByVisibleText("Austria");
  }

  void selectNewDropDownForState(WebDriver driver) {
    editAddress.getDropDownForState(driver).selectByVisibleText("Burgenland");
  }

  void fillNewCity(WebDriver driver) {
    editAddress.getInputForCity(driver).clear();
    editAddress.getInputForCity(driver).sendKeys("SomeNewAustrianCity");
  }

  void fillNewPostalCode(WebDriver driver) {
    editAddress.getInputForPostalCode(driver).clear();
    editAddress.getInputForPostalCode(driver).sendKeys("321");
  }

  void fillNewPhoneNumber(WebDriver driver) {
    editAddress.getInputForPhoneNumber(driver).clear();
    editAddress.getInputForPhoneNumber(driver).sendKeys("06440000000");
  }

  void clickSaveAddress(WebDriver driver) {
    editAddress.getSaveAddress(driver).click();
  }

  void getItemsInShoppingCart(WebDriver driver) throws InterruptedException {
    scrollToHomePageProducts(driver);

    clickSecondAddToCart(driver);
    Thread.sleep(1000);

    increaseSecondProductQuanitiy(driver);
    increaseSecondProductQuanitiy(driver);
    selectSecondProductFirstSize(driver);
    clickSecondProductAddToCart(driver);
    Thread.sleep(10000);

    clickOnTheLogo(driver);

    scrollToHomePageProducts(driver);

    clickFirstAddToCart(driver);
    Thread.sleep(1000);

    selectFirstProductFirstSize(driver);
    clickFirstProductAddToCart(driver);
    Thread.sleep(10000);
  }

  void loginToAccount(WebDriver driver) {
    clickOnTheLogin(driver);
    fillUsername(driver);
    fillPassword(driver);
    clickOnSignIn(driver);
  }

  public void ReviewBtn(WebDriver driver) {
    review.getReviewBtn(driver).click();
  }

  public void Quality(WebDriver driver) {
    review.getQuality(driver).click();
  }

  public void NickNameTxt(WebDriver driver) {
    review.getNickName(driver).sendKeys("koh");
  }

  public void SummaryTxt(WebDriver driver) {
    review.getSummary(driver).sendKeys("good product");
  }

  public void ReviewTxt(WebDriver driver) {
    review.getReview(driver).sendKeys("product is well designed for all levels of swimmers");
  }

  public void SubmitReviewBtn(WebDriver driver) {
    review.getSubmitReviewBtn(driver).click();
  }
  
  //Address Verification
  void sizeBox(WebDriver driver) {
    addressVerification.getsizeBox(driver).click();
  }

  void ProceedToCheckout(WebDriver driver) {
    addressVerification.getProceedToCheckout(driver).click();
  }

  void emailAddressElement(WebDriver driver) {
    addressVerification.getemailAddressElement(driver).click();
  }

  void firstNameField(WebDriver driver) {
    addressVerification.getfirstNameField(driver).sendKeys("Chinnu");
  }

  void lastNameField(WebDriver driver) {
    addressVerification.getlastNameField(driver).sendKeys("P");
  }

  void streetAddress(WebDriver driver) {
    addressVerification.getstreetAddress(driver).click();
  }

  void countrySelect(WebDriver driver) {
    ((Select) addressVerification.getcountrySelect(driver)).selectByVisibleText("United States");
  }

  void cityField(WebDriver driver) {
    addressVerification.getcityField(driver).sendKeys("New York");
  }

  void stateField(WebDriver driver) {
    addressVerification.getstateField(driver).sendKeys("NY");
  }

  void zipCodeField(WebDriver driver) {
    addressVerification.getzipCodeField(driver).sendKeys("10001");
  }

  void radioButton(WebDriver driver) {
    addressVerification.getradioButton(driver).click();
  }

  void phoneNumberField(WebDriver driver) {
    addressVerification.getphoneNumberField(driver).sendKeys("+123 456 789");
  }
  
  void nextButton(WebDriver driver) {
    addressVerification.getnextButton(driver).click();
  }

//Change Password
  void emailField(WebDriver driver) {
    changePassword.getemailField(driver).sendKeys("chinnu@gmail.com");
  }
  void passwordField(WebDriver driver) {
    changePassword.getpasswordField(driver).sendKeys("riya!123");
  }
  void SaveButton(WebDriver driver) {
    changePassword.getsaveButton(driver).click();
  }
  void currentPasswordField(WebDriver driver) {
    changePassword.getcurrentPasswordField(driver).sendKeys("riya!123");
  }
  void newPasswordField(WebDriver driver) {
    changePassword.getnewPasswordField(driver).sendKeys("Riya@123");
  }
  void confirmPassword(WebDriver driver) {
    changePassword.getconfirmPassword(driver).sendKeys("Riya@123");
  }
  void saveButton(WebDriver driver) {
    changePassword.getsaveButton(driver).click();
  }

  //Create Account Page
  void FirstnameField(WebDriver driver) {
    createAccountpage.getFirstnameField(driver).sendKeys("Chinnu");
  }
  void LastnameField(WebDriver driver) {
    createAccountpage.getLastnameField(driver).sendKeys("P");
  }
  void confirmPasswordField(WebDriver driver) {
    createAccountpage.getconfirmPasswordField(driver).sendKeys("riya!123");
  }
  void password(WebDriver driver) {
    createAccountpage.getpassword(driver).sendKeys("riya!123");
  }
  void email(WebDriver driver) {
    createAccountpage.getemail(driver).sendKeys("chinnu@gmail.com");
  }
  void createAccountButton(WebDriver driver) {
    createAccountpage.getcreateAccountButton(driver).click();
  }

}


