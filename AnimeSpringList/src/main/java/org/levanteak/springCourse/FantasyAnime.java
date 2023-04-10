package org.levanteak.springCourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FantasyAnime implements Anime{
    private List<String> fantasyAnimes = new ArrayList<>();
    {
        fantasyAnimes.add("Record of Ragnarok");
        fantasyAnimes.add("Hunter X Hunter");
        fantasyAnimes.add("About my rebirth into slime");
    }
    @Override
    public List<String> getAnime() {
        return fantasyAnimes;
    }
}
