package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import pages.HomePage;
import pages.LangPage;

public class BaseTests {
    private WebDriver driver;
    protected LangPage langPage;
    protected HomePage homPage;
    protected String url = "https://www.nagwa.com/";
    @Parameters({"browser"})
    @BeforeClass
    public void setUp(String param){
        if (param.equals("Chrome")){
            System.setProperty("webdriver.chrome.driver" , "resources/chromedriver.exe");
            driver = new ChromeDriver();}

        if(param.equals("firefox")){
            System.setProperty("webdriver.gecko.driver" , "resources/geckodriver.exe");
            driver = new FirefoxDriver();}

        driver.manage().window().maximize();
        driver.get(url);
        langPage = new LangPage(driver);
        }
}
