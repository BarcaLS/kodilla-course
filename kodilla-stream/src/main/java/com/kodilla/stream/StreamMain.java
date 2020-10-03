package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

import static java.time.LocalDate.now;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfForumUser = theForum.getUserList().stream()
                .filter(ForumUser -> ForumUser.getUserSex() == 'M')
                .filter(ForumUser -> Period.between(ForumUser.getUserBirthday(), now()).getYears() >= 20)
                .filter(ForumUser -> ForumUser.getUserPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID,ForumUser -> ForumUser));
        System.out.println("Number of users: " + theResultMapOfForumUser.size());
        theResultMapOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}