package com.example.h071191019;

import java.util.ArrayList;

public class MoviesData {
    private static String Judul [] = {
            "One Punch Man",
            "Kimi No Nawa",
            "One Piece",
            "Detective Conan",
            "Jujutsu Kaisen",
            "Sword Art Online",
            "Naruto",
            "Yuru Camp",
            "Gintama",
            "Code Geass",
    };

    private static String Genre [] = {

            "Action, Sci-Fi, Comedy, Parody, Super Power, Supernatural",
            "Romance, Supernatural, School, Drama",
            "Action, Adventure, Comedy, Super Power, Drama, Fantasy, Shounen",
            "Adventure, Mystery, Comedy, Police, Shounen",
            "Action, Demons, Fantasy, Shounen, Supernatural",
            "Action, Game, Adventure, Romance, Fantasy",
            "Action, Adventure, Comedy, Super Power, Martial Arts, Shounen",
            "Slice of Life, Comedy",
            "Action, Comedy, Historical, Parody, Samurai, Sci-Fi, Shounen",
            "Action, Military, Sci-Fi, Super Power, Drama, Mecha",
    };

    private static String Descrition [] = {
            "The seemingly ordinary and unimpressive Saitama has a rather unique hobby: being a hero. In order to pursue his childhood dream, he trained relentlessly for three years—and lost all of his hair in the process. Now, Saitama is incredibly powerful, so much so that no enemy is able to defeat him in battle. In fact, all it takes to defeat evildoers with just one punch has led to an unexpected problem—he is no longer able to enjoy the thrill of battling and has become quite bored.",
            "Mitsuha Miyamizu, a high school girl, yearns to live the life of a boy in the bustling city of Tokyo—a dream that stands in stark contrast to her present life in the countryside. Meanwhile in the city, Taki Tachibana lives a busy life as a high school student while juggling his part-time job and hopes for a future in architecture.",
            "Gol D. Roger was known as the \"Pirate King,\" the strongest and most infamous being to have sailed the Grand Line. The capture and execution of Roger by the World Government brought a change throughout the world. His last words before his death revealed the existence of the greatest treasure in the world, One Piece. It was this revelation that brought about the Grand Age of Pirates, men who dreamed of finding One Piece—which promises an unlimited amount of riches and fame—and quite possibly the pinnacle of glory and the title of the Pirate King.",
            "Shinichi Kudou, a high school student of astounding talent in detective work, is well known for having solved several challenging cases. One day, when Shinichi spots two suspicious men and decides to follow them, he inadvertently becomes witness to a disturbing illegal activity. Unfortunately, he is caught in the act, so the men dose him with an experimental drug formulated by their criminal organization, leaving him to his death. However, to his own astonishment, Shinichi lives to see another day, but now in the body of a seven-year-old child.",
            "Hidden in plain sight, an age-old conflict rages on. Supernatural monsters known as \"Curses\" terrorize humanity from the shadows, and powerful humans known as \"Jujutsu\" sorcerers use mystical arts to exterminate them. When high school student Yuuji Itadori finds a dried-up finger of the legendary Curse Sukuna Ryoumen, he suddenly finds himself joining this bloody conflict.",
            "In the year 2022, virtual reality has progressed by leaps and bounds, and a massive online role-playing game called Sword Art Online (SAO) is launched. With the aid of \"NerveGear\" technology, players can control their avatars within the game using nothing but their own thoughts. \n Kazuto Kirigaya, nicknamed \"Kirito,\" is among the lucky few enthusiasts who get their hands on the first shipment of the game. He logs in to find himself, with ten-thousand others, in the scenic and elaborate world of Aincrad, one full of fantastic medieval weapons and gruesome monsters. However, in a cruel turn of events, the players soon realize they cannot log out; the game's creator has trapped them in his new world until they complete all one hundred levels of the game.",
            "Moments prior to Naruto Uzumaki's birth, a huge demon known as the Kyuubi, the Nine-Tailed Fox, attacked Konohagakure, the Hidden Leaf Village, and wreaked havoc. In order to put an end to the Kyuubi's rampage, the leader of the village, the Fourth Hokage, sacrificed his life and sealed the monstrous beast inside the newborn Naruto.",
            "While the perfect getaway for most girls her age might be a fancy vacation with their loved ones, Rin Shima's ideal way of spending her days off is camping alone at the base of Mount Fuji. From pitching her tent to gathering firewood, she has always done everything by herself, and has no plans of leaving her little solitary world.",
            "After joining the resistance against the bakufu, Gintoki and the gang are in hiding, along with Katsura and his Joui rebels. The Yorozuya is soon approached by Nobume Imai and two members of the Kiheitai, who explain that the Harusame pirates have turned against 7th Division Captain Kamui and their former ally Takasugi. The Kiheitai present Gintoki with a job: find Takasugi, who has been missing since his ship was ambushed in a Harusame raid. Nobume also makes a stunning revelation regarding the Tendoushuu, a secret organization pulling the strings of numerous factions, and their leader Utsuro, the shadowy figure with an uncanny resemblance to Gintoki's former teacher",
            "Since the demise of the man believed to be Britannia's most wicked emperor one year ago, the world has enjoyed an unprecedented peace under the guidance of the United Federation of Nations. However, this fragile calm is shattered when armed militants successfully kidnap former princess Nunnally vi Britannia and Suzaku Kururugi, the chief advisor of the Black Knights, sparking an international crisis.",

    };

    private  static  int HeroImages[] = {
            R.drawable.opm,
            R.drawable.kimi_no_nawa,
            R.drawable.one_piece,
            R.drawable.conan,
            R.drawable.jujutsu,
            R.drawable.sao,
            R.drawable.naruto,
            R.drawable.yuru_camp,
            R.drawable.gintama,
            R.drawable.codegeass,


    };

    public static ArrayList<Movie> getListData(){
        ArrayList<Movie> list = new ArrayList<Movie>();
        for (int position = 0; position < Judul.length; position++){
            Movie movie = new Movie();
            movie.setGenre(Genre[position]);
            movie.setDetail(Descrition[position]);
            movie.setName(Judul[position]);
            movie.setPhoto(HeroImages[position]);
            list.add(movie);
        }
        return list;
    };
}
