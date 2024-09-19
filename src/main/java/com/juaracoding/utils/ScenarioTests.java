package com.juaracoding.utils;

public enum ScenarioTests {

    T1("Successful login with valid credentials"),
    T2("Unsuccessful login with invalid email"),
    T3("Unsuccessful login with email without @"),
    T4("Unsuccessful login with invalid password"),
    T5("Unsuccessful login with empty email and valid password"),
    T6("Unsuccessful login with valid email and empty password"),
    T7("Unsuccessful login with empty email and empty password"),
    T8("Direct access to dashboard without login");


    // T1 ... T100

    private String scenarioTestName;

    ScenarioTests(String value){
        scenarioTestName = value;
    }

    public String getScenarioTestName() {
        return scenarioTestName;
    }

}
