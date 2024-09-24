package com.juaracoding.utils;

public enum ScenarioTest {

    T1("Search With Calendar"),
    T2("Search With Input Name"),
    T3("Test Button Reset Calendar"),
    T4("Valid Add Unit/Department"),
    T5("Successful download file template struktur user"),
    T6("Successful import file template struktur user"),
    T7("UnSuccessful import file template struktur user"),
    T8("Valid Input and Search Unit"),
    T9("Valid Reset Unit");

    private String scenarioTestName;

    ScenarioTest(String value){
        scenarioTestName = value;
    }

    public String getScenarioTestName(){
        return scenarioTestName;
    }

}
