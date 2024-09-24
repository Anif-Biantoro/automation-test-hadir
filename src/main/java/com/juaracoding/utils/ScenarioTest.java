package com.juaracoding.utils;

public enum ScenarioTest {

    T1("Successful import with the required file"),
    T2("Unsuccessful import because not choosing the file"),
    T3("Unsuccessful import with the wrong file format"),
    T4("Add new schedule"),
    T5("Search schedule name"),
    T6("View schedule details"),
    T7("Edit schedule"),
    T8("Delete schedule"),
    T9("Reset search"),
    T10("Page options functionality"),
    T11("Successfully applied for overtime"),
    T12("Function reset button"),
    T13("Unsuccessful to apply for overtime without fill jam masuk"),
    T14("Unsuccessful to apply for overtime without fill jam keluar"),
    T15("Unsuccessful to apply for overtime without fill notes");

    private String scenarioTestName;

    ScenarioTest(String value){
        scenarioTestName = value;
    }

    public String getScenarioTestName() {
        return scenarioTestName;
    }
}
