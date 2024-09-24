package com.juaracoding.utils;

public enum ScenarioTest {

    T1("Display employee attendance list based on date input"),
    T2("Display employee attendance list based on employee name"),
    T3("Unable to display employee attendance list due to empty date input"),
    T4("Download the attendance report file"),
    T5("Successfully registering a new user"),
    T6("Failing to register a new user due to invalid email format"),
    T7("Failing to register a new user due to password not meeting complexity requirements"),
    T8("Failing to register a new user due to missing required fields"),
    T9("Successfully adding a department in unit management settings"),
    T10("Successfully deleting a department in unit management settings");

    private String scenarioTestName;

    ScenarioTest(String value){
        scenarioTestName = value;
    }

    public String getScenarioTestName() {
        return scenarioTestName;
    }
}
