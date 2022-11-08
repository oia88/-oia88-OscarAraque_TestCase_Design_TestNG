package com.globant;

import org.testng.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Root {
    protected static Logger log = LoggerFactory.getLogger(Root.class);
    @BeforeSuite
    public void associatedAccount(){
        log.info("Open the respective browser");
        log.info("Go to https://www.espnqa.com/?_adbock=true&src=com&espn=cloud");
        log.info("Find the log in icon and the click it");
        log.info("Entry your credentials if you have an account");
        log.info("If you haven't an account click on create account");
        log.info("Close the browser");
        System.out.println();
    }
    @DataProvider(name = "usersData")
    public Object [][] getUsersDataLogin() {
        return new Object[][] {
                {"user1@espn.com", "password1"},
                {"user2@espn.com", "password2"},
                {"user3@espn.com", "password3"},
                {"user4@espn.com", "password4"}
        };
    }
    @BeforeClass
    public void openWebsite(){
        log.info("Open the browser");
        log.info("Go to https://www.espnqa.com/?_adbock=true&src=com&espn=cloud");
        System.out.println();
    }
    @AfterClass
    public void closeWebsite(){
        log.info("Close the browser");
        System.out.println();
    }
}
