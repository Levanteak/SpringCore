package org.levanteak.springCourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LoveAnime implements Anime{
    private List<String> loveAnime = new ArrayList<>();
    {
        loveAnime.add("Love or lies");
        loveAnime.add("The Angel next door");
        loveAnime.add("This stupid pig does not understand the dream of a bunny girl");
    }
    @Override
    public List<String> getAnime() {
        return loveAnime;
    }
}
