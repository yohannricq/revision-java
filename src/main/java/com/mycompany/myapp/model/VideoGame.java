package com.mycompany.myapp.model;

import java.time.LocalDate;
import java.util.List;

public class VideoGame {
    
    private String name;
    private LocalDate releaseDate;
    private String developer;
    private String editor;
    private List<String> tags;


    public VideoGame() {
    }    
    
    public VideoGame(String name) {
        this.name = name;
    }

    public VideoGame(String name, String developer) {
        this.name = name;
        this.developer = developer;
    }

    public VideoGame(String name, String developer, String editor) {
        this.name = name;
        this.developer = developer;
        this.editor = editor;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeveloper() {
        return this.developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getEditor() {
        return this.editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString(){

        return "VideoGame{name='" + name + '\'' +
           ", releaseDate=" + releaseDate +
           ", developer='" + developer + '\'' +
           ", editor='" + editor + '\'' +
           ", tags=" + tags +
           '}';

    }

    

}
