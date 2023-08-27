package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Numbers {
    WebDriver driver;
    String screenOutput;
    public  Numbers(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(id = "com.google.android.calculator:id/digit_1")
    WebElement N1;
    @FindBy(id = "com.google.android.calculator:id/digit_2")
    WebElement N2;
    @FindBy(id = "com.google.android.calculator:id/digit_3")
    WebElement N3;
    @FindBy(id = "com.google.android.calculator:id/digit_4")
    WebElement N4;
    @FindBy(id = "com.google.android.calculator:id/digit_5")
    WebElement N5;
    @FindBy(id = "com.google.android.calculator:id/digit_6")
    WebElement N6;
    @FindBy(id = "com.google.android.calculator:id/digit_7")
    WebElement N7;
    @FindBy(id = "com.google.android.calculator:id/digit_8")
    WebElement N8;
    @FindBy(id = "com.google.android.calculator:id/digit_9")
    WebElement N9;
    @FindBy(id = " com.google.android.calculator:id/digit_0")
    WebElement N0;
    @FindBy(id = "com.google.android.calculator:id/dec_point")
    WebElement point;

    public void clickNumber_1(){
        N1.click();
    }
    public void clickNumber_2(){
        N2.click();
    }
    public void clickNumber_3(){
        N3.click();
    }
    public void clickNumber_4(){
        N4.click();
    }
    public void clickNumber_5(){
        N5.click();
    }
    public void clickNumber_6(){
        N6.click();
    }
    public void clickNumber_7(){
        N7.click();
    }
    public void clickNumber_8(){
        N8.click();
    }
    public void clickNumber_9(){
        N9.click();
    }
    public void clickNumber_0(){
        N0.click();
    }
    public void clickDot(){
        point.click();
    }


}
