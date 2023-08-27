package Pages;
import Util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class CalculatorScreen extends Numbers {
    WebDriver driver;
    String screenOutput;
    public  CalculatorScreen(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(id = "com.google.android.calculator:id/formula")
    WebElement screen;
    @FindBy(id ="com.google.android.calculator:id/result_final")
    WebElement screenResult;
    @FindBy(id = "com.google.android.calculator:id/op_add")
    WebElement plus;
    @FindBy(id = "com.google.android.calculator:id/op_sub")
    WebElement  minus;
    @FindBy(id = "com.google.android.calculator:id/op_mul")
    WebElement multiplication;
    @FindBy(id = "com.google.android.calculator:id/op_div")
    WebElement division;
    @FindBy(id = "com.google.android.calculator:id/eq")
    WebElement equalResult;

public String GetScreen(){
    screenOutput = screen.getText();

    return screenOutput;
}
public void PlusClick(){
    plus.click();

}
public void MinusClick(){
    minus.click();

}
public void MultiplicationClick(){
    multiplication.click();

}
public void DivisionClick(){
    division.click();

    }
public void ClickEqual(){
    equalResult.click();

}
public String getResult(){
    String result =screenResult.getText();
    return result;


}
public void Clear(){
    screenResult.clear();
}
public void GiveNumber(int value){
        int number = value;
        String numberString = String.valueOf(number);
        for (int i = 0; i < numberString.length(); i++) {
            char digit  = numberString.charAt(i);
//            int digit = Character.getNumericValue(digitChar);
            if ( digit =='1'){
                clickNumber_1();

            } else if (digit =='2') {
                clickNumber_2();
            }
            else if (digit =='3') {
                clickNumber_3();
            }
            else if (digit =='4') {
                clickNumber_4();
            }
            else if (digit =='5') {
                clickNumber_5();
            }
            else if (digit =='6') {
                clickNumber_6();
            }
            else if (digit =='7') {
                clickNumber_7();
            }
            else if (digit =='8') {
                clickNumber_8();
            }
            else if (digit =='9') {
                clickNumber_9();
            }
            else if (digit =='0') {
                clickNumber_0();
            }
            else if (digit =='.') {
                clickDot();
            }
        }

    }

}
