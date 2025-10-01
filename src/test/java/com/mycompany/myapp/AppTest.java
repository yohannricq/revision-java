package com.mycompany.myapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;

// import org.junit.Test; --> JUnit 4

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @TempDir
    Path tempDir;

    @Test
    void testAppGeneratesOutputFile() throws Exception {
        // On définit le chemin du fichier dans le dossier temporaire
        Path output = tempDir.resolve("output.txt");

        // On exécute App avec le chemin en argument
        App.main(new String[]{output.toString()});

        // Vérifie que le fichier existe
        assertTrue(Files.exists(output), "Le fichier de sortie devrait exister");

        // Vérifie que le contenu contient au moins le mot "VideoGame" ou un champ attendu
        String content = Files.readString(output);
        assertTrue(content.contains("VideoGame") || content.contains("name"),
                "Le contenu doit contenir des infos sur le jeu vidéo");
    }
}
