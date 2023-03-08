package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class HomePage {
    private WebDriver driver;
    //LOCALIZADORES
    //Enlace "Create new account"
    @FindBy(how = How.XPATH,using = "//nav[@class='page_header_top-nav_wrapper']//child::li[2]")
    WebElwent linkApplyFreelancer;
    //Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickLinkApplyFreelancer(){
        linkApplyFreelancer.click();
    }
}