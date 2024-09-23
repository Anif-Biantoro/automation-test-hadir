package com.juaracoding.utils;

public enum ScenarioTest {
    Test1("Successful download file template"),
    Test2("Successful import file template"),
    Test3("UnSuccessful import file template"),
    Test4("Add new division name"),
    Test5("Cancel add new division name"),
    Test6("Search for available divisions in the list"),
    Test7("Searching for a division that is not available in the list"),
    Test8("Reset name division on search field"),
    Test9("Edit name division"),
    Test10("Delete name division"),
    Test11("Successful login with valid credentials"),
    Test12("Login attempt with unregistered account"),
    Test13("Login attempt with empty username and password"),
    Test14("Login attempt with wrong email format"),
    Test15("Login attempt with wrong password"),
    Test16("Login attempt with wrong email"),
    Test17("Successful logout attempt"),
    Test18("Return to previous page after logout");

    private String scenarioTestName;

    ScenarioTest(String value){
        scenarioTestName = value;
    }

    public String getScenarioTestName() {
        return scenarioTestName;
    }
}
