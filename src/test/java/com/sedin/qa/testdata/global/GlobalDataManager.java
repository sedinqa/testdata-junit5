package com.sedin.qa.testdata.global;

public interface GlobalDataManager {
    void setup();
    void teardown();
    static <T> GlobalDataManager get(){
        return DBGlobalDataManager.get();
    }
}
