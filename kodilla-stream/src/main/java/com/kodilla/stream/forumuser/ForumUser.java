package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    int userID;
    String userName;
    char userSex;
    LocalDate userBirthday;
    int userPosts;

    public ForumUser(int userID, String userName, char userSex, LocalDate userBirthday, int userPosts) {
        this.userID = userID;
        this.userName = userName;
        this.userSex = userSex;
        this.userBirthday = userBirthday;
        this.userPosts = userPosts;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getUserBirthday() {
        return userBirthday;
    }

    public int getUserPosts() {
        return userPosts;
    }

    @Override
    public String toString() {
        return "### ID: " + this.userID +
                ", name: " + this.userName +
                ", sex: " + this.userSex +
                ", birthday: " + this.userBirthday +
                ", posts: " + this.userPosts + " ###\n";
    }
}
