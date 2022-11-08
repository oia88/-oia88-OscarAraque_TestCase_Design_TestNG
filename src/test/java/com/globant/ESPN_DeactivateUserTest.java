package com.globant;

import org.testng.annotations.Test;

public class ESPN_DeactivateUserTest extends Root {
    @Test(dataProvider = "usersData", priority = 3)
    public void deactivateUser(String username_email, String password){
        log.info("Find the person icon and hover the cursor over it");
        log.info("Choose the log in option");
        log.info("Entry your " + username_email + " address");
        log.info("Entry your " + password);
        log.info("Click on the Log In button");
        log.info("Find the person icon and hover the cursor over it");
        log.info("Choose delete account option");
        log.info("Confirm clicking on the 'Yes, I want to delete the account' button");
        log.info("Click on the person icon and choose de log in option");
        log.info("Entry your " + username_email + " address");
        log.info("Entry your " + password);
        log.info("A modal tab will appear: Your account doesn't exist, please sign up");
        System.out.println();
    }
}
