# SoftwareTestingProject

_Team members_:

1. Islam Kohil
2. Mohamad Abdelrahman,
3. Soundharya Parashuram

---

prerequisites :

- Selenium WebDriver
- Chrome driver
- Java Extention pack (VSCode Extention)

---

[Set-UP Process ] https://funnelgarden.com/setup-selenium-with-java-on-visual-studio-code/

*note:*
 Test-Files (located in the src) are the executable files "which will contain the Run|Debug option on top of the public static void main "

---

# _Description_

The project is divided into 3 main segments:

1. **Content Pages**  
   -> located insided the Pages Folder, These pages contain the functions that will hold the location data of specific elements in the page (example: log-in button, text boxes, etc.)

2. **Helper Method file**  
   -> This file will import from the Pages Folder & create instantiations for each file in the Pages Folder, for instance, {LoginPage login = new LoginPage(); } ; each instantiation will contain methods to execute the required process, for instance, {void fillUsername(WebDriver driver) {
   login.getUsername(driver).clear();
   login.getUsername(driver).sendKeys
   ("45malsi2108@gmail.com");
   }}

3. **Test Files**  
   -> Located in the src Folder, these files consist of both _Smoke-Suit_ & _Regression_ test cases. With the help of the 'Helper-Method' actions can be called from the **Helper-method**, for instance, { help.fillUsername(driver); }
