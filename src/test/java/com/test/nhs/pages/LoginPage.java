package com.test.nhs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//input[@name='username'] ")
    WebElement username;

    @FindBy(xpath = "//input[@type='password']")
    WebElement password;

    @FindBy(xpath = "//div[@class='huge']")//3 elements
    List<WebElement>rooms;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitButton;



  public void login(String username,String password,String location){
      this.username.sendKeys(username);
      this.password.sendKeys(password);
      for (WebElement room:rooms){
          if(BrowserUtils.getText(room).equals(location)){
              room.click();
              break;
          }
      }
      submitButton.click();
  }


}
