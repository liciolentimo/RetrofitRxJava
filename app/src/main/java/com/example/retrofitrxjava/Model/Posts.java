package com.example.retrofitrxjava.Model;

public class Posts {
    public int userId;
    public int id;
    public String title;
    public String body;

    public Posts() {
    }

    public Posts(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }
}
