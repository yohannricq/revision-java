package com.mycompany.myapp;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.myapp.model.VideoGame;

public class App {
    public static void main(String[] args) throws Exception {

        VideoGame vgame = new VideoGame("Little Nightmares 3");

        vgame.setDeveloper("Supermassive Games");
        vgame.setEditor("Bandai Namco Entertainment");

        List<String> tags = new ArrayList<>();
        tags.add("Aventure");
        tags.add("Horreur");
        tags.add("Coop");
        tags.add("Casse-tête");
        tags.add("Jeu solo");

        vgame.setTags(tags);

        String text = vgame.toString();

        System.out.println(text);

        Files.writeString(Paths.get("output.txt"), text, StandardCharsets.UTF_8);

    }
}
