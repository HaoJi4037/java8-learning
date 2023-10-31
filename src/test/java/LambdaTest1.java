package src.test.java;

import src.main.java.User;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LambdaTest1 {


    public Set<Integer> getAgeSet(List<User> users) {
        Set<Integer> ageSet = new HashSet<>();
        for (User user : users) {
            ageSet.add(user.getAge());
        }
        return ageSet;
    }

    public Set<Integer> getAgeSet2(List<User> users) {
        return users.stream()
                .map(User::getAge)
                .collect(Collectors.toSet());
    }
}
