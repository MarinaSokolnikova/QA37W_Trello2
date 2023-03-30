package tests;

import models.User;
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

        User user = new User().setEmail("sokolnikovam92@gmail.com").setPassword("FF22Kseriesqq!");
        app.getUser().initLogin();
        app.getUser().pause(2000);
        app.getUser().fillLoginForm(user);
        app.getUser().submitLogin();
        app.getUser().pause(2000);

        Assert.assertTrue(app.getUser().isLogged());

    }

    @Test
    public void login2(){

        app.getUser().initLogin();
        app.getUser().pause(2000);
        app.getUser().fillLoginForm("sokolnikovam92@gmail.com", "FF22Kseriesqq!");
        app.getUser().submitLogin();
        app.getUser().pause(2000);

        Assert.assertTrue(app.getUser().isLogged());

    }


}
