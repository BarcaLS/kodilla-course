package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "Asterix", 'M', LocalDate.of(1915, 05, 13), 17));
        userList.add(new ForumUser(2, "Fiona", 'F', LocalDate.of(2015, 03, 10), 137));
        userList.add(new ForumUser(3, "Alice", 'F', LocalDate.of(2002, 01, 28), 0));
        userList.add(new ForumUser(4, "Shrek", 'M', LocalDate.of(2018, 05, 2), 5));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
