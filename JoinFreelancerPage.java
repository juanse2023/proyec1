package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class JoinFreelancerPage {
    private WebDriver driver;
    //Localizadores
    @FindBy(how = How.XPATH,using = "//h1")
    WebElement titlePage;
    @FindBy(how = How.XPATH,using = "//*[@data-role='custom_field']")
    WebElement txtSelectTalent;
    @FindBy(how = How.XPATH,using = "//*[@data-value='developers']")
    WebElement optionDeveloper;
    @FindBy(how = How.ID,using = "talent_create_applicant_email")
    WebElement txtEmail;
    @FindBy(how = How.ID,using = "talent_create_applicant_password")
    WebElement txtPassword;
    @FindBy(how = How.ID,using = "talent_create_applicant_password_confirmation")
    WebElement txtPasswordConfirmation;
    @FindBy(how = How.ID,using = "talent_create_applicant_full_name")
    WebElement txtFullName;
    @FindBy(how = How.XPATH,using = "//span[@class='label_wrap']")
    WebElement checkConfidential;
    @FindBy(how = How.ID,using = "save_new_talent_create_applicant")
    WebElement btnJoin;
    public JoinFreelancerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void fillFormJoin(String fullName,String email,String password){
        clickOnElement(txtSelectTalent);
        clickOnElement(optionDeveloper);
        sendText(txtEmail,email);
        sendText(txtPassword,password);
        sendText(txtPasswordConfirmation,password);
        sendText(txtFullName,fullName);
        clickOnElement(checkConfidential);
        clickOnElement(btnJoin);
    }
    //Metodo generico para dar clic a un elemento
    public void clickOnElement(WebElement element){
        element.click();
    }
    //Metodo generico para enviar texto a los input
    public void sendText(WebElement element,String text){
        element.clear();
        element.sendKeys(text);
    }
    public boolean isPageOpened(String title){
        return titlePage.getText().contains(title);
    }
}