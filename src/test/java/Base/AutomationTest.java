package Base;

//import Selenium.EmailPage;

import MainHelper.Helper;
import Selenium.NewMailPage;
import Sikuli.Excel_Sheet;
import Sikuli.sikuliHelper;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class AutomationTest extends BaseTest {
    private WebDriver driver;

    @Test(priority = 0)
    public void excelSheetEditTest() throws FindFailed, IOException, InterruptedException, AWTException {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        Screen screen = new Screen();
        sikuliHelper.minimizeAll(screen);
        sikuliHelper.openFile(screen, "attachments/Data.xlsx");
        Excel_Sheet myTest = new Excel_Sheet();
        myTest.excelSheetEdit();
    }

    @Test(priority = 1)
    public void emailSendingTest() throws InterruptedException {
        setUp();
        homePage.enterEmail("mohamedmansour3011@proton.me");
        homePage.enterPassword("Momans30111994");
        NewMailPage newMailPage = homePage.clickSignIn();
        newMailPage.clickNewMessage();
        newMailPage.enterMailReceiver("momans3011@gmail.com");
        newMailPage.enterMailSubject("Test Message");
        newMailPage.enterMailContent("Hii kindly find the attached mail");
        newMailPage.setAttachment(Helper.AddBasePath("attachments/Data.xlsx"));
        Thread.sleep(5000);
        newMailPage.clickSendEmail();


    }
}
