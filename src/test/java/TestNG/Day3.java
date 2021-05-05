package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
    @Parameters({"URL"})
    @Test
    public void webLoginCarLoan(String urlName){
        System.out.println("Weblogincar ");
        System.out.println(urlName);
    }
   // @Test(enabled = false)
    @Test(dataProvider = "getData")
    public void mobileCarLogin(String username,String password){
        System.out.println("Mobilelogincar ");
        System.out.println(username);
        System.out.println(password);


    }
    @Test(groups = {"Smoke"})
    public void mobileCarSignIn(){
        System.out.println("Mobilecar sign in ");


    }
    @Test(groups = {"Smoke"})
    public void mobileCarSignOut(){
        System.out.println("Mobilecar sign out ");


    }
    @Test(dependsOnMethods= {"webLoginCarLoan"})
    public void loginAPICarLoan(){
        System.out.println("APIlogincar ");

    }
    @DataProvider
    public Object[][] getData(){
        Object[][] data=new Object[0][2];
        data[0][0]="username";
        data[0][1]="password";
        return data;

    }
}
