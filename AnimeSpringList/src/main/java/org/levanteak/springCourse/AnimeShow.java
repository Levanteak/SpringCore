package org.levanteak.springCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class AnimeShow {
    private ActionAnime actionAnime;
    private FantasyAnime fantasyAnime;
    private SchoolAnime schoolAnime;
    private LoveAnime loveAnime;
@Autowired
    public AnimeShow(ActionAnime actionAnime, FantasyAnime fantasyAnime, SchoolAnime schoolAnime, LoveAnime loveAnime) {
        this.actionAnime = actionAnime;
        this.fantasyAnime = fantasyAnime;
        this.schoolAnime = schoolAnime;
        this.loveAnime = loveAnime;
    }
    public void showAnime(Play play) {

        Random random1 = new Random();
        int randomNumber = random1.nextInt(3);
        switch (play) {
            case ACTION -> System.out.println("Action anime : " + actionAnime.getAnime().get(randomNumber));
            case FANTASY ->  System.out.println("Fantasy anime : " + fantasyAnime.getAnime().get(randomNumber));
            case SCHOOL ->  System.out.println("Schools anime : " + schoolAnime.getAnime().get(randomNumber));
            case LOVE -> System.out.println("Love anime : " + loveAnime.getAnime().get(randomNumber));
        }

//        if (randomNumber == 1)
//            System.out.println("Action anime : " + actionAnime.getAnime().get(randomNumber));
//        else if (randomNumber == 2)
//            System.out.println("Fantasy anime : " + fantasyAnime.getAnime().get(randomNumber));
//        else if (randomNumber == 3)
//           c
//        else
//            System.out.println("Love anime : " + loveAnime.getAnime().get(randomNumber));
    }


}
