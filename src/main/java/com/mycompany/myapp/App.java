package com.mycompany.myapp;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.myapp.model.VideoGame;

public class App {
    public static void main(String[] args) throws Exception {

        /* VideoGame vgame = new VideoGame("Little Nightmares 3");

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

        Files.writeString(Paths.get("output.txt"), text, StandardCharsets.UTF_8); */

        // 1) Choisir la destination : argument ou défaut
        Path out = (args != null && args.length > 0)
                ? Path.of(args[0])
                : Path.of("target", "output", "output.txt");

        // 2) S'assurer que le dossier parent existe
        if (out.getParent() != null) {
            Files.createDirectories(out.getParent());
        }

        // 3) Contenu minimal (remplace par ton vrai contenu)
        List<String> lines = List.of("VideoGame{name='Test'}");

        // 4) Écrire le fichier
        Files.write(out, lines, StandardCharsets.UTF_8);

        // 5) Log utile pour débug
        System.out.println("Écrit : " + out.toAbsolutePath());

    }

}
