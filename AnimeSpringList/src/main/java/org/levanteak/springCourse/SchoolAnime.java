package org.levanteak.springCourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SchoolAnime implements Anime{
    private List<String> schoolAnime = new ArrayList<>();
    {
        schoolAnime.add("Classroom of the elite");
        schoolAnime.add("Horimia");
        schoolAnime.add("Oresuki: Are you the only one who loves me?");
    }
    @Override
    public List<String> getAnime() {
        return schoolAnime;
    }
}
