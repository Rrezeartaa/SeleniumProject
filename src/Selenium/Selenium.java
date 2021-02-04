package Selenium;

import java.io.FileInputStream;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
//import Selenium.TeDhenat.xlsx;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import Selenium.TeDhenat;
public class Selenium extends TeDhenat {

    WebDriver driver;
    String url = "https://api.bks-ks.org/policaonline";
    Map < String, Object[] > tedhenat;
    @Test(priority = 1, dataProvider = "TeDhenat")
    public void tedhenat(String Numri, String Markadhetipi, String Tabelat, String Ngjyra, String Emri_dhe_mbiemri, String Vendi, String Rruga, String Tel, String Email, String C_Email) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.findElement(By.id("nrshasis")).sendKeys(Numri);
        Thread.sleep(1000);
        driver.findElement(By.id("markatipi")).sendKeys(Markadhetipi);
        Thread.sleep(1000);
        driver.findElement(By.id("tabelat")).sendKeys(Tabelat);
        Thread.sleep(1000);
        driver.findElement(By.id("ngjyra")).sendKeys(Ngjyra);
        Thread.sleep(1000);
        driver.findElement(By.id("isiguruari_EmriMbiemri")).sendKeys(Emri_dhe_mbiemri);
        Thread.sleep(1000);
        driver.findElement(By.id("isiguruari_vendi")).sendKeys(Vendi);
        Thread.sleep(1000);
        driver.findElement(By.id("isiguruari_rruga")).sendKeys(Rruga);
        Thread.sleep(1000);
        driver.findElement(By.id("isiguruari_tel")).sendKeys(Tel);
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys(Email);
        Thread.sleep(1000);
        driver.findElement(By.id("emailConfirm")).sendKeys(C_Email);
        Thread.sleep(1000);
        driver.findElement(By.id("TermsAndConditions")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("SubmitButton")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("btnSubmit")).click();

    }

}