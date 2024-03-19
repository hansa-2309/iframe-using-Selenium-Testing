import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.geckodriver.driver", "D:\\MCA1140\\SoftwareTesting\\Gecko\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://www.leafground.com/frame.xhtml");

        webDriver.switchTo().frame(0);
        WebElement frame = webDriver.findElement(By.id("Click"));
        Thread.sleep(2000);
        frame.click();      
        String name=webDriver.findElement(By.id("Click")).getText();
        System.out.println(name);
        webDriver.switchTo().defaultContent();

        webDriver.switchTo().frame(2);
        webDriver.switchTo().frame("frame2");
        WebElement frame1 = webDriver.findElement(By.id("Click"));
        Thread.sleep(2000);
        frame1.click();
        webDriver.switchTo().defaultContent();

        List <WebElement> list = webDriver.findElements(By.tagName("iframe"));
        System.out.println("No of frames: "+list.size());
    }
}
