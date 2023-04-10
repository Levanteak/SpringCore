package org.levanteak.springCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("citeBean")
public class Cite {
    private ActionAnime actionAnime;
    private FantasyAnime fantasyAnime;
    private LoveAnime loveAnime;
    private SchoolAnime schoolAnime;
@Autowired
    public Cite(ActionAnime actionAnime, FantasyAnime fantasyAnime, LoveAnime loveAnime, SchoolAnime schoolAnime) {
        this.actionAnime = actionAnime;
        this.fantasyAnime = fantasyAnime;
        this.loveAnime = loveAnime;
        this.schoolAnime = schoolAnime;
    }
    public String cites() {
        return "Anime : " + actionAnime.getAnime() + "\nAnime : " + fantasyAnime.getAnime()
                + "\nAnime : " + loveAnime.getAnime() + "\nAnime : " + schoolAnime.getAnime();
    }
}
