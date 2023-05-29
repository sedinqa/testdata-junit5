package com.sedin.qa.testdata.user;

public class UIUserManager implements UserManager {
    @Override
    public void deleteUser(User user) {
        System.out.println("test data: Deleting User Via UI");
    }

    private static UIUserManager INSTANCE=null;
    public static UIUserManager get(){
        if (INSTANCE==null){
            INSTANCE=new UIUserManager();
        }
        return INSTANCE;
    }
    private UIUserManager(){};

    @Override
    public User createUser() {
        System.out.println("test data: Creating User Via UI");
        return new User();
    }
}
