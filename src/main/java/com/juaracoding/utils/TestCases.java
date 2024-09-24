package com.juaracoding.utils;

public enum TestCases {
    T1("Login Valid Test"),
    T2("Search Data Sakit Berdasarkan Nama"),
    T3("Search Data Sakit Berdasarkan Tanggal"),

    T4("Search Data Lembur Berdasarkan Nama"),
    T5("Search Data Lembur Berdasarkan Tanggal"),

    T6("Search Data PerjalananDinas Berdasarkan Nama"),
    T7("Search Data PerjalananDinas Berdasarkan Tanggal"),
    T8("Approval Koreksi"),
    T9("Reject Koreksi");




    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName() {
        return testCaseName;
    }
}
