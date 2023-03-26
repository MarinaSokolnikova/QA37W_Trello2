package tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardCreation extends TestBase{

    @BeforeMethod
    public void preCondition(){
        app.getUser().initLogin();
        app.getUser().pause(2000);
        app.getUser().fillLoginForm("sokolnikovam92@gmail.com", "FF22Kseriesqq!");
        app.getUser().submitLogin();
        app.getUser().pause(2000);
    }

    @Test
    public void boardCreation1(){
        app.getBoard().initBoardCreationFromHeder();
        app.getBoard().fillInBoardCreationForm();
        app.scrollDownTheForm();
        app.getBoard().pause(2000);
        app.getBoard().submitBoardCreation();
        app.getBoard().pause(2000);
        app.getBoard().isCreated();
    }
}
