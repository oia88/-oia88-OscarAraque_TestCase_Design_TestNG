package com.globant;

import org.testng.annotations.Test;

public class ESPN_LoginTest extends Root {
    @Test(dataProvider = "usersData", priority = 1)
    public void logIn(String username_email, String password){
        log.info("Find the person icon and hover the cursor over it");
        log.info("Choose the log in option");
        log.info("Entry your " + username_email + " address");
        log.info("Entry your " + password);
        log.info("Click on the Log In button");
        System.out.println();
    }
}
