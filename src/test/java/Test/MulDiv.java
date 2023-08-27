package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.*;
import Util.*;

import java.util.Random;


public class MulDiv extends SetUp {
    CalculatorScreen screen;
    int number1,number2;

    @BeforeTest
    public void Objects(){
        screen = new CalculatorScreen(driver);

    }

    @Test
    public void TestMultiplication() throws InterruptedException {
        number1 = RandomNumber();
        screen.GiveNumber(number1);
        screen.MultiplicationClick();
        number2 = RandomNumber();
        screen.GiveNumber(number2);
        screen.ClickEqual();
        String actualResult = screen.getResult();
        screen.Clear();
        Thread.sleep(5);
        System.out.println(actualResult);
        String expectedResult=Integer.toString(number1*number2);
        CheckResultString(actualResult,expectedResult);

    }
    @Test
    public void TestDivision() throws InterruptedException {
        number1 = RandomNumber();
        screen.GiveNumber(number1);
        System.out.println(number1);
        screen.DivisionClick();
        number2 = RandomNumber();
        screen.GiveNumber(number2);
        System.out.println(number2);
        ZeroCheck(number2);
        screen.ClickEqual();
        String actualResult = screen.getResult();
        screen.Clear();
        Thread.sleep(5);
        System.out.println(actualResult);
//        double result=(double)number1/number2;
//        System.out.println(result);
//        String expectedResult=String.format("%.9f", result);
//
//        CheckResultString(actualResult+.000000001,expectedResult);

    }
    public int RandomNumber(){
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        return randomNumber;
    }
    public  int ZeroCheck(int number){
        if(number ==0){
            number= RandomNumber();
            ZeroCheck(number);
        }else{
            return number;
        }
        return number;
    }


}
