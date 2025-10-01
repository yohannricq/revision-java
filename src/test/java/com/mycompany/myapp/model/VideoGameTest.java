package com.mycompany.myapp.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Arrays;

public class VideoGameTest {

    @Test
    void testGettersAndSetters() {
        VideoGame game = new VideoGame();

        game.setName("Zelda");
        game.setDeveloper("Nintendo");
        game.setEditor("Nintendo");
        game.setReleaseDate(LocalDate.of(1998, 11, 21));
        game.setTags(Arrays.asList("RPG", "Aventure"));

        assertEquals("Zelda", game.getName());
        assertEquals("Nintendo", game.getDeveloper());
        assertEquals("Nintendo", game.getEditor());
        assertEquals(LocalDate.of(1998, 11, 21), game.getReleaseDate());
        assertTrue(game.getTags().contains("RPG"));
        assertTrue(game.getTags().contains("Aventure"));
    }

}
