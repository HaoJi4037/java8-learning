package src.test.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.java.User;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    List<User> users;

    @BeforeEach
    void setUp() {
        User user = new User(1L, "zhangsan1", 18);
        User user2 = new User(2L, "zhangsan2", 19);
        User user3 = new User(3L, "zhangsan3", 20);
        users = Arrays.asList(user, user2, user3);
    }


    @Test
    public void testAgeSet1() {
        LambdaTest1 test1 = new LambdaTest1();
        Set<Integer> actualAgeSet = test1.getAgeSet(users);
        Set<Integer> expectedAgeSet = Set.of(18, 19, 20);
        assertEquals(actualAgeSet, expectedAgeSet);
    }

    @Test
    public void testAgeSet2() {
        LambdaTest1 test1 = new LambdaTest1();
        Set<Integer> actualAgeSet = test1.getAgeSet2(users);
        Set<Integer> expectedAgeSet = Set.of(18, 19, 20);
        assertEquals(actualAgeSet, expectedAgeSet);
    }

    @Test
    public void testP() {
        int count = 10000000;
        {
            long start = System.currentTimeMillis();
            for (int i = 0; i < count; i++) {
                LambdaTest1 test1 = new LambdaTest1();
                Set<Integer> actualAgeSet = test1.getAgeSet(users);
            }
            long end = System.currentTimeMillis();
            System.out.println("testAgeSet1:" + (end - start));
        }

        {
            long start = System.currentTimeMillis();
            for (int i = 0; i < count; i++) {
                LambdaTest1 test1 = new LambdaTest1();
                Set<Integer> actualAgeSet = test1.getAgeSet2(users);
            }
            long end = System.currentTimeMillis();
            System.out.println("testAgeSet2:" + (end - start));
        }

    }
}