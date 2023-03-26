package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends TestBase{
    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
        if (app.getUser().isLogged())
        {
            app.getUser().logout();
        }
    }

    @Test
    public void login1(){
        app.getUser().initLogin();
        app.getUser().pause(2000);
        app.getUser().fillLoginForm("sokolnikovam92@gmail.com", "FF22Kseriesqq!");
        app.getUser().submitLogin();
        app.getUser().pause(2000);

        Assert.assertTrue(app.getUser().isLogged());

    }


}
