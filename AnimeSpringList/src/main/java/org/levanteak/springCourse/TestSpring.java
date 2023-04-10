package org.levanteak.springCourse;
import org.levanteak.Config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * @author Levanteak
 */
public class TestSpring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
        AnimeShow animeShow = context.getBean("animeShow", AnimeShow.class);
//        ActionAnime actionAnime = context.getBean("actionAnime", ActionAnime.class);
//        System.out.println(actionAnime.getAuthor());
//        System.out.println(actionAnime.getRating());
//        System.out.println(actionAnime.isHaveYouWatched());
        int change;
        do {
            System.out.println("1.Action anime \n2.Love anime \n3.School anime \n4.Fantasy anime \n5.Exit");
            change = scanner.nextInt();
            switch (change) {
                case 1 -> animeShow.showAnime(Play.ACTION);
                case 2 -> animeShow.showAnime(Play.LOVE);
                case 3 -> animeShow.showAnime(Play.SCHOOL);
                case 4 -> animeShow.showAnime(Play.FANTASY);
                case 5 -> System.out.println("Buy buy!!!");
            }
        }while (change != 5);


//        Cite cite = context.getBean("citeBean", Cite.class);
//        System.out.println(cite.cites());

        context.close();
    }
}
