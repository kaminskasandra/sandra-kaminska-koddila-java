package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args) {

        Forum forum = new Forum();
        String theResultStringOfUsers = forum.getList().stream()
                .filter(u -> u.getSex() == 'M')
                .filter(u -> u.getBirthDate().getYear() < 2003)
                .filter(u -> u.getNumberOfPublishedPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, u -> u)).toString();

        System.out.println(theResultStringOfUsers);
    }
}