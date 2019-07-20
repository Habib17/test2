package com.picodiploma.mhabib.submission2made;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class MoviesData extends AppCompatActivity {
    public static String[][] arrayMovies = new String[][]{
            {"https://image.tmdb.org/t/p/w185_and_h278_bestv2/xRWht48C2V8XNfzvPehyClOvDni.jpg", "Alita", "Action, Science Fiction, Thriller, Adventure", "Rating : 67%", "January 31, 2019",
                    "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past."},
            {"https://image.tmdb.org/t/p/w185_and_h278_bestv2/5Kg76ldv7VxeX9YlcQXiowHgdX6.jpg", "Aquaman", "Action, Adventure, Fantasy", "Rating : 68%", "December 7, 2018",
                    "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne"},
            {"https://image.tmdb.org/t/p/w185_and_h278_bestv2/hXgmWPd1SuujRZ4QnKLzrj79PAw.jpg", "Cold Pursuit", "Action, Drama, Thriller, Crime", "Rating : 54%", "February 7, 2019",
                    "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution."},
            {"https://image.tmdb.org/t/p/w185_and_h278_bestv2/v3QyboWRoA4O9RbcsqH8tJMe8EB.jpg", "Creed II", "Drama", "Rating : 67%", "November 21, 2018",
                    "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life."},
            {"https://image.tmdb.org/t/p/w185_and_h278_bestv2/xvx4Yhf0DVH8G4LzNISpMfFBDy2.jpg", "How to Train Your Dragon: The Hidden World", "Animation, Family, Adventure", "Rating : 76%", "January 3, 2019",
                    "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind."},
            {"https://image.tmdb.org/t/p/w185_and_h278_bestv2/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg", "Avengers: Infinity War", "Action, Fantasy, Adventure", "Rating : 83%", "April 25, 2018",
                    "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain."},
            {"https://image.tmdb.org/t/p/w185_and_h278_bestv2/6VxEvOF7QDovsG6ro9OVyjH07LF.jpg", "Master Z: Ip Man Legacy", "Action", "Rating : 52%", "December 20, 2018",
                    "After being defeated by Ip Man, Cheung Tin Chi is attempting to keep a low profile. While going about his business, he gets into a fight with a foreigner by the name of Davidson, who is a big boss behind the bar district. Tin Chi fights hard with Wing Chun and earns respect."},
            {"https://image.tmdb.org/t/p/w185_and_h278_bestv2/qEnH5meR381iMpmCumAIMswcQw2.jpg", "Ralph Breaks the Internet", "Family, Animation, Comedy, Adventure", "Rating : 72%", "November 20, 2018",
                    "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, \\\"Sugar Rush.\\\" In way over their heads, Ralph and Vanellope rely on the citizens of the internet -- the netizens -- to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube."},
            {"https://image.tmdb.org/t/p/w185_and_h278_bestv2/AiRfixFcfTkNbn2A73qVJPlpkUo.jpg", "Robin Hood", "Adventure, Action, Thriller", "Rating : 72%", "November 20, 2018",
                    "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown."},
            {"https://image.tmdb.org/t/p/w185_and_h278_bestv2/iiZZdoQBEYBv6id8su7ImL0oCbD.jpg", "Spider-Man: Into the Spider-Verse", "Adventure, Action, Animation, Science Fiction", "Rating : 58%", "December 6, 2018",
                    "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson Kingpin Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension."},
    };

    public static ArrayList<Movies> getListMovies(){
        ArrayList<Movies> listMovie = new ArrayList<>();
        for (String[] aData :arrayMovies){
            Movies movies = new Movies(  );
            movies.setTitleMovie( aData[1] );
            movies.setGenreMovie( aData[2] );
            movies.setRatingMovie( aData[3] );
            movies.setDescMovie( aData[5] );
            movies.setReleaseDateMovie( aData[4] );
            movies.setImgMovie( aData[0] );

            listMovie.add( movies );

        }
        return listMovie;
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

    }

}
