package com.dashapps.nitish.flypitalpha1;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ModelClass{
    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getSlug() {
        return slug;
    }

    public String getUrl() {
        return url;
    }

    public String getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }

    public String getTitle_plain() {
        return title_plain;
    }

    public String getContent() {
        return content;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public String getDate() {
        return date;
    }

    public String getModified() {
        return modified;
    }

    public String[] getCategories() {
        return categories;
    }

    public String[] getTags() {
        return tags;
    }

    public String getAuthor() {
        return author;
    }

    public String[] getComments() {
        return comments;
    }


    public int getComment_count() {
        return comment_count;
    }

    public String getComment_status() {
        return comment_status;
    }

    public String getCustom_fields() {
        return custom_fields;
    }


    private int id;
    private String type;
    private String slug;
    private String url;
    private String status;
    private String title;
    private String title_plain;
    private String content;
    private String excerpt;
    private String date;
    private String modified;
    private String[] categories;
    private String[] tags;
    private String[] comments;
    private String author;


    public ArrayList<AttachmentClass> getAttachments() {
        return attachments;
    }

    public ArrayList<AttachmentClass> attachments = new ArrayList<AttachmentClass>();
    private int comment_count;
    private String comment_status;
    private String custom_fields;
}
