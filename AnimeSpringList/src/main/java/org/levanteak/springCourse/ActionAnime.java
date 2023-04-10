package org.levanteak.springCourse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ActionAnime implements Anime{
    private List<String> actionAnimes = new ArrayList<>();
    {
        actionAnimes.add("One Piece");
        actionAnimes.add("Naruto");
        actionAnimes.add("Fairy tail");
    }
    @Value("${ActionAnime.author}")
    private String author;
    @Value("${ActionAnime.isHaveYouWatched}")
    private boolean isHaveYouWatched;
    @Value("${ActionAnime.rating}")
    private double rating;
    @Override
    public List<String> getAnime() {
        return actionAnimes;
    }
    public String getAuthor() {
        return author;
    }

    public boolean isHaveYouWatched() {
        return isHaveYouWatched;
    }

    public double getRating() {
        return rating;
    }
}
