package com.example.RestAPIStartDay2.Controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("course")
public class CourseConfiguration {
    private String name;
    private int chapterCount;
    private int rating ;
    private String author;

    public CourseConfiguration() {
    }

    public CourseConfiguration(String name, int chapterCount, int rating, String author) {
        this.name = name;
        this.chapterCount = chapterCount;
        this.rating = rating;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChapterCount() {
        return chapterCount;
    }

    public void setChapterCount(int chapterCount) {
        this.chapterCount = chapterCount;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "CourseConfiguration{" +
                "name='" + name + '\'' +
                ", chapterCount=" + chapterCount +
                ", rating=" + rating +
                ", author='" + author + '\'' +
                '}';
    }
}
