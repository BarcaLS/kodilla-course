package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {
    int usersNumber;
    int postsNumber;
    int commentsNumber;
    float postsOnUser;
    float commentsOnUser;
    float commentsOnPost;

    void calculateAdvStatistics(Statistics statistics) {
        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();
        if (usersNumber != 0) {
            postsOnUser = (float) postsNumber / (float) usersNumber;
            commentsOnUser = (float) commentsNumber / (float) usersNumber;
        } else {
            postsOnUser = 0;
            commentsOnUser = 0;
        }
        if (postsNumber != 0)
            commentsOnPost = (float) commentsNumber / (float) postsNumber;
        else
            commentsOnPost = 0;
    }

    void showStatistics() {
        System.out.println("Number of users: " + usersNumber);
        System.out.println("Number of posts: " + postsNumber);
        System.out.println("Number of comments: " + commentsNumber);
        System.out.println("Medium quantity of posts per user: " + postsOnUser);
        System.out.println("Medium quantity of comments per user: " + commentsOnUser);
        System.out.println("Medium quantity of comments per post: " + commentsOnPost);
    }
}
