package com.avi.javachat.Model;

public class User {
    private String id;
    private String username;
    private String imageURL;
    private String Status;
    private String search;


    public User(String id, String username, String imageURL,String Status,String search) {
        this.id = id;
        this.username = username;
        this.imageURL = imageURL;
        this.Status = Status;
        this.search = search;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getStatus() { return Status; }

    public void setStatus(String status) { Status = status; }

    public String getSearch() { return search; }

    public void setSearch(String search) { this.search = search; }
}
