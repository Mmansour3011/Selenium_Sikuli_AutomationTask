package Sikuli;

import MainHelper.Helper;
import org.apache.log4j.chainsaw.Main;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class Excel_Sheet {

    private Pattern excelFile = new Pattern(Helper.AddBasePath("screenshots/pic_excel.png"));

    private Pattern enableEditing = new Pattern(Helper.AddBasePath("screenshots/pic_enableEditing.png"));

    private Pattern joinDate = new Pattern(Helper.AddBasePath("screenshots/pic_joinDate.png"));
    private Pattern sortAndFilter = new Pattern(Helper.AddBasePath("screenshots/pic_sortAndFilter.png"));
    private Pattern sortAtoZ = new Pattern(Helper.AddBasePath("screenshots/pic_sortAtoZ.png"));
    private Pattern dataTab = new Pattern(Helper.AddBasePath("screenshots/pic_dataTab.png"));
    private Pattern removeDuplicates = new Pattern(Helper.AddBasePath("screenshots/pic_removeDuplicates.png"));
    private Pattern unselectAll = new Pattern(Helper.AddBasePath("screenshots/pic_unselectAll.png"));
    private Pattern nameSelect = new Pattern(Helper.AddBasePath("screenshots/pic_nameSelect.png"));
    private Pattern ok1 = new Pattern(Helper.AddBasePath("screenshots/pic_ok1.png"));
    private Pattern ok2 = new Pattern(Helper.AddBasePath("screenshots/pic_ok2.png"));

    private Pattern save = new Pattern(Helper.AddBasePath("screenshots/pic_save.png"));
    private Pattern close = new Pattern(Helper.AddBasePath("screenshots/pic_close.png"));


    public void excelSheetEdit() throws FindFailed, IOException, InterruptedException, AWTException {
        Screen screen = new Screen();
        Robot robot = new Robot();
        sikuliHelper.clickOnPattern(screen, joinDate, 0.6, 5);
        robot.delay(500);
        sikuliHelper.clickOnPattern(screen, sortAndFilter, 0.5, 5);
        robot.delay(500);
        sikuliHelper.clickOnPattern(screen, sortAtoZ, 0.3, 5);
        sikuliHelper.clickOnPattern(screen, dataTab, 0.5, 5);
        sikuliHelper.clickOnPattern(screen, removeDuplicates, 0.5, 5);
        sikuliHelper.clickOnPattern(screen, unselectAll, 0.5, 5);
        sikuliHelper.clickOnPattern(screen, nameSelect, 0.5, 5);
        sikuliHelper.clickOnPattern(screen, ok1, 0.5, 5);
        robot.delay(500);
        sikuliHelper.clickOnPattern(screen, ok2, 0.5, 5);
        sikuliHelper.clickOnPattern(screen, save, 0.5, 5);
        sikuliHelper.clickOnPattern(screen, close, 0.5, 5);


    }


}
