package com.juaracoding.utils;

public enum ScenarioTest {
    T1("Successful Input Jadwal"),
    T2("Edit Jadwal Recently Added"),
    T3("Delete Jadwal Recently Added"),
    T4("Unsuccessful Input Jadwal with empty hari kerja"),
    T5("Successful Input Kalender"),
    T6("Unsuccessful Input Kalender with Empty Field"),
    T7("Successful Input Aturan Cuti");

    // T1 ... T100

    private String scenarioTestName;

    ScenarioTest(String value){
        scenarioTestName = value;
    }

    public String getScenarioTestName() {
        return scenarioTestName;
    }
}
