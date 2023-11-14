package com.kodilla.testing.forum.statistics;

import java.util.List;

public class StatisticsCalculator {
    private int numberOfUsers;
    private int postsCount;
    private int commentsCount;
    private double averageNumberOfPostsPerUser;
    private double averageNumberOfCommentsPerUser;
    private double averageNumberOfCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        List<String> usersNames = statistics.usersNames();
        numberOfUsers = usersNames.size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        if (numberOfUsers > 0) {
            averageNumberOfPostsPerUser = (double) postsCount / numberOfUsers;
            averageNumberOfCommentsPerUser = (double) commentsCount / numberOfUsers;
        } else {
            averageNumberOfPostsPerUser = 0;
            averageNumberOfCommentsPerUser = 0;
        }
        if (postsCount > 0) {
            averageNumberOfCommentsPerPost = (double) commentsCount / postsCount;
        } else {
            averageNumberOfCommentsPerPost = 0;
        }
    }

    public void showStatistics() {
        System.out.println("Number of users: " + numberOfUsers);
        System.out.println("Number of posts: " + postsCount);
        System.out.println("Number of comments: " + commentsCount);
        System.out.println("Average posts per user: " + averageNumberOfPostsPerUser);
        System.out.println("Average comments per user: " + averageNumberOfCommentsPerUser);
        System.out.println("Average comments per post: " + averageNumberOfCommentsPerPost);
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }
}

