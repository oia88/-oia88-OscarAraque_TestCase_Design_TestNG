package com.globant;

import org.testng.annotations.Test;

public class ESPN_LogoutTest extends Root {
    @Test(dataProvider = "usersData", priority = 2)
    public void logOut(String username_email, String password){
        log.info("Find the person icon and hover the cursor over it");
        log.info("Choose the log in option");
        log.info("Entry your " + username_email + " address");
        log.info("Entry your " + password);
        log.info("Click on the Log In button");
        log.info("Find the person icon and click it");
        log.info("Click the log out button");
        log.info("Find again the person icon and hover the cursor over it");
        log.info("Verify that your session is over");
        System.out.println();
    }
}
