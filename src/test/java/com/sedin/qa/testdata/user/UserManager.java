package com.sedin.qa.testdata.user;

public interface UserManager {
    User createUser();
    void deleteUser(User user);
    static <T> UserManager get(){
        return UIUserManager.get();
    }
}
