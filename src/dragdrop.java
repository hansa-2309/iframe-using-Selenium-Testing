import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {
        public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.geckodriver.driver", "D:\\MCA1140\\SoftwareTesting\\Gecko\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://www.leafground.com/drag.xhtml");

        WebElement drag = webDriver.findElement(By.id("form:drag"));
        WebElement drop = webDriver.findElement(By.id("form:drop"));
        Actions nActions = new Actions(webDriver);
        Thread.sleep(2000);
        nActions.dragAndDrop(drag, drop).build().perform();
        }
}
