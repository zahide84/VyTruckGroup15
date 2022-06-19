package com.vytrack.test_features;

import com.google.common.base.Verify;
import com.vytrack.base.TestBase;
import com.vytrack.utilities.VyTrack_Utilities;
import org.apache.hc.core5.annotation.Contract;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TS_08_Test extends TestBase {
    @Test
    public void TS_08_Test() throws InterruptedException {


         // 1.Use on the https://qa2.vytrack.com/ pace.
        VyTrack_Utilities.vyTrackLogin(driver, getTRUCK_DRIVER_1_LOGIN(), getPASSWORD());
        Thread.sleep(3000);
           // 2.navigate and click on the "Fleet" bottom dropdown module.
        driver.findElement(By.xpath("//span[@class='title title-level-1'][contains(.,'Fleet')]")).click();
        Thread.sleep(3000);
           //3. in  the "Fleet" dropdownmodule navigate and click on the "Vehicle Contract ".
        driver.findElement(By.linkText("Vehicle Contracts")).click();
        Thread.sleep(3000);

        // 4.Verify to see all "Vehicle contract " on the grid.

        //Thread.sleep(5000);
        //WebElement entitySaved =   driver.findElement(By.partialLinkText("Vehicle Contract"));

       // String actualMessage = entitySaved.getText();
        //String expectedMessage = "Vehicle contract";
        //Assert.assertEquals(actualMessage,expectedMessage,"Messages do not match!");

        //5. Click the " create Vahicle Contract " .


        //6.Verify the users "Create Contract"  button.
            //7.Verify the click "Cancel" button .
           // 8.Verify the click "edit or delete "button.
            //9.Verify the click on "Grid Setting " and than verify  " click and  reset" button

    }



}
