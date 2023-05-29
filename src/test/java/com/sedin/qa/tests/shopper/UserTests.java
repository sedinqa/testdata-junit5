package com.sedin.qa.tests.shopper;

import com.sedin.qa.testdata.user.User;
import com.sedin.qa.testdata.user.UserManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class UserTests {
    static User user;
    @BeforeAll
    public static void setupUser(){
        user=UserManager.get().createUser();
    }
    @AfterAll
    public static void clearUser(){
        UserManager.get().deleteUser(user);
    }
    @Nested
    public class LoginTests {
        @Test
        public void userIsAbleToLoginWithValidCredentials(){
            System.out.println("test: check if login works");
        }
    }

    @Nested
    public class BuyProductsTests {
        @Test
        public void checkAddToCart(){
            System.out.println("test: check if add to cart works");
        }
    }

    @Nested
    public  class ProductReviewTests {
        @Nested
        public class AfterReviewWritten{
            @BeforeAll
            public static void createReview(){
                    System.out.println("test data:create review for further test");
            }
            @Test
            public void deleteReview(){
                System.out.println("test: check if user can delete review");
            }

        }

        @Test
        public void writeReview(){
            System.out.println("test: check if user can write review");
        }
    }
}
