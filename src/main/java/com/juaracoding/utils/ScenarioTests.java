package com.juaracoding.utils;

import jdk.incubator.vector.VectorOperators;

public enum ScenarioTests {

    T1("Successful login with valid credentials"),
    T2("User Logged in to the Hadir Page"),
    T3("Click Import List and Click Import Cuti"),
    T4("User Should Move To Import Cuti Page"),
    T5("User Download Template Cuti"),
    T6("User Upload Flie Cuti"),
    T7("User Upload File Cuti With Invalid File"),
    T8("User Should See Error Message");


    // T1 ... T100

    private String scenarioTestName;

    ScenarioTests(String value){
        scenarioTestName = value;
    }

    public String getScenarioTestName() {
        return scenarioTestName;
    }

}
