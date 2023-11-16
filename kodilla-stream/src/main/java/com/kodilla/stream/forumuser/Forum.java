package com.kodilla.stream.forumuser;


import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theUsersList = new ArrayList<>();

    public Forum() {
        theUsersList.add(new ForumUser(1001, "John", 'M', 2005, 5, 12, 3));
        theUsersList.add(new ForumUser(1002, "Matt", 'M', 1981, 8, 22, 0));
        theUsersList.add(new ForumUser(1003, "Sarah", 'K', 1999, 10, 30, 1));
        theUsersList.add(new ForumUser(1004, "Lucas", 'M', 1972, 11, 16, 14));
        theUsersList.add(new ForumUser(1005, "Amy", 'K', 1993, 1, 14, 7));
        theUsersList.add(new ForumUser(1006, "Jonnatan", 'M', 1995, 3, 18, 2));
        theUsersList.add(new ForumUser(1007, "Edd", 'M', 1980, 5, 18, 22));
    }
    public List<ForumUser> getList() {
        return new ArrayList<>(theUsersList);
    }
}
