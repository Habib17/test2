package com.picodiploma.mhabib.submission2made;

import java.util.ArrayList;

public class TvShowData {
    public static String [][] arrayTvShow = new String[][]{
            {"https://image.tmdb.org/t/p/w185_and_h278_bestv2/bda9my9vSL78zO40hcHLzb0Ae4t.jpg", "Isekai Cheat Magician", "Action, Adventure, Sci-Fi, Fantasy", "Rating :  80%", "July 10, 2019",
                    "As regular high school students Taichi and Rin disappeared in a beam of light. When they came to, the two of them were already in a world of swords and magic. Finally getting away after experiencing an attack by monsters, following the suggestion of adventurers they headed on the path towards the guild. In the guild, the two of them found out that they possessed unbelievably powerful magic. Thus the regular high school students transformed into the strongest cheats"},
            {"https://image.tmdb.org/t/p/w185_and_h278_bestv2/fki3kBlwJzFp8QohL43g9ReV455.jpg", "The Flash", "Drama, Sci-Fi, Fantasy", "Rating : 67%", "October 7, 2014",
                    "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash."},
            {"https://image.tmdb.org/t/p/w185_and_h278_bestv2/3wx3EAMtqnbSLhGG8NrqXriCUIQ.jpg", "Dragon Ball", "Comedy, Sci-Fi , Fantasy, Animation, Action, Adventure", "Rating : 71%", "February 26, 1986",
                    "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the dragon balls brought her to Goku's home. Together, they set off to find all seven dragon balls in an adventure."},
            {"https://image.tmdb.org/t/p/w185_and_h278_bestv2/iE3s0lG5QVdEHOEZnoAxjmMtvne.jpg", "One-Punch Man", "Action, Adventure, Animation, Comedy", "Rating : 80%", "October 4, 2015",
                    "Saitama is a hero who only became a hero for fun. After three years of “special” training, though, he’s become so strong that he’s practically invincible. In fact, he’s too strong—even his mightiest opponents are taken out with a single punch, and it turns out that being devastatingly powerful is actually kind of a bore. With his passion for being a hero lost along with his hair, yet still faced with new enemies every day, how much longer can he keep it going?"},
            {"https://image.tmdb.org/t/p/w185_and_h278_bestv2/yTZQkSsxUFJZJe67IenRM0AEklc.jpg", "The Simpsons", "Animation, Comedy", "Rating : 71%", "December 17, 1989",
                    "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general."},
            {"https://image.tmdb.org/t/p/w185_and_h278_bestv2/64DIVpWiGlvvJczMnyu8jojSYKm.jpg", "Dr. Stone", "Action, Adventure, Animation", "Rating : 80%", "July 5, 2019",
                    "The science-fiction adventure follows two boys struggle to revive humanity after a mysterious crisis has left everyone in the world turned to stone for several millennia."},
            {"https://image.tmdb.org/t/p/w185_and_h278_bestv2/vqBsgL9nd2v04ZvCqPzwtckDdFD.jpg", "Supergirl", "Action, Adventure, Drama, Science Fiction", "Rating : 58%", "October 26, 2015",
                    "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism."},
            {"https://image.tmdb.org/t/p/w185_and_h278_bestv2/u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg", "Game of Thrones", "Sci-Fi, Fantasy, Drama, Action , Adventure", "Rating : 81%", "April 17, 2011",
                    "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond."},
            {"https://image.tmdb.org/t/p/w185_and_h278_bestv2/gBGUL1UTUNmdRQT8gA1LUV4yg39.jpg", "Family Guy", "Animation, Comedy", "Rating : 65%", "January 31, 1999",
                    "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues."},
            {"https://image.tmdb.org/t/p/w185_and_h278_bestv2/gEbD5od43txhKQ7BaNCjN7q4txR.jpg", "Hawaii Five-0", "Action, Crime, Drama", "Rating : 64%", "September 20, 2010",
                    "Steve McGarrett returns home to Oahu, in order to find his father's killer. The governor offers him the chance to run his own task force (Five-0). Steve's team is joined by Chin Ho Kelly, Danny \"Danno\" Williams, and Kono Kalakaua."},


    };

    public static ArrayList <TvShow> getListTvShow(){
        ArrayList<TvShow> listTvShow = new ArrayList<>();
        for (String[] aDataTv :arrayTvShow){
            TvShow tvShow = new TvShow(  );
            tvShow.setTitleTvShow( aDataTv[1] );
            tvShow.setGenreTvShow( aDataTv[2] );
            tvShow.setRatingTvShow( aDataTv[3] );
            tvShow.setDescTvShow( aDataTv[5] );
            tvShow.setReleaseDateTvShow( aDataTv[4] );
            tvShow.setImgTvShow( aDataTv[0] );

            listTvShow.add( tvShow );

        }
        return listTvShow;
    }
}
