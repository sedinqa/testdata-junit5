package com.sedin.qa.testdata.global;

public class DBGlobalDataManager implements GlobalDataManager {
    private static DBGlobalDataManager INSTANCE=null;
    public static DBGlobalDataManager get(){
        if (INSTANCE==null){
            INSTANCE=new DBGlobalDataManager();
        }
        return INSTANCE;
    }
    private DBGlobalDataManager() {
    }

    @Override
    public void setup() {
        System.out.println("test data: Global Data Setup Via DB");
    }
    @Override
    public void teardown() {
        System.out.println("test data: Global Data Teardown Via DB");
    }
}
