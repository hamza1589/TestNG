package TestNG;

import org.testng.annotations.Test;

public class Day4 {
    @Test//(timeOut = 10)
    public void webLoginHomeLoan(){
        System.out.println("Webloginhome ");
    }
    @Test(groups = {"Smoke"})
    public void mobileHomeLogin(){
        System.out.println("Mobileloginhome ");


    }
    @Test
    public void loginAPIHomeLoan(){
        System.out.println("APIloginhome ");

    }
}
