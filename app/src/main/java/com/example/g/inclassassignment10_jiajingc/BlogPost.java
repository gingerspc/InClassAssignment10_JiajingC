package com.example.g.inclassassignment10_jiajingc;

import java.util.Calendar;

/**
 * Created by g on 4/5/17.
 */

public class BlogPost {
    String title;
    String body;
    String time;

    public BlogPost(String title, String body, String time) {
        this.title = title;
        this.body = body;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    private String toReadableTime(){
        long postTime = Long.valueOf(time);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(postTime);
        return calendar.getTime().toString();
    }

    @Override
    public String toString(){
        return "Title: " + title + "\n"
                + "Time: " + toReadableTime() + "\n"
                + "Body: " + body + "\n";
    }
}

