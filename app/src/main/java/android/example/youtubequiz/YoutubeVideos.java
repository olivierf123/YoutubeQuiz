package android.example.youtubequiz;

import java.util.HashMap;
import java.util.Random;

public class YoutubeVideos {

    public static YoutubeVideos youtubevideos = new YoutubeVideos();

    private String English = "English";
    private String French = "French";
    private String Spanish = "Spanish";

    //French Songs
    private String video1 = "oiKj0Z_Xnjc";
    private String video2 = "K5KAc5CoCuk";
    private String video3 = "FndmvPkI1Ms";
    private String video4 = "VV5oVYVGfNc";
    private String video5 = "CAMWdvo71ls";
    private String video6 = "CctG_0544vU";
    private String video7 = "aU_TQcyGkvY";
    private String video8 = "H7rhMqTQ4WI";
    private String video9 = "oC_ffV";
    private String video10 = "INuD2D7R8bk";
    private String video11 = "rZz8r8ZE93I";
    private String video12 = "QLNr3_YNeJc";
    private String video13 = "Aq1PsFGssOg";
    private String video14 = "znSs7uEXCeo";
    private String video15 = "WW31GErHH";

    //Spanish songs
    private String video16 = "NUsoVlDFqZg";
    private String video17 = "YXnjy5YlDwk";
    private String video18 = "wZRWpr1G1Qw";
    private String video19 = "zZjSX01P5dE";
    private String video20 = "VMp55KH_3wo";
    private String video21 = "9xByMBYDRmY";
    private String video22 = "KdiYZie5dBk";
    private String video23 = "l9FX_H7DPo";
    private String video24 = "91VRyTvjoX4";
    private String video25 = "3qFF1mRmNAE";
    private String video26 = "W6fme7tcweQ";
    private String video27 = "IWrZpP24H8I";
    private String video28 = "tpOiWZg3a28";
    private String video29 = "UfMwMH6x0uw";
    private String video30 = "pRTSYWpCM4w";
    private String video31 = "7LLKQhwazhI";

    //English songs
    private String video32 = "JGwWNGJdvx8";
    private String video33 = "OPf0YbXqDm0";
    private String video34 = "fRh_vgS2dFE";
    private String video35 = "hT_nvWreIhg";
    private String video36 = "YQHsXMglC9A";
    private String video37 = "IcrbM1l_BoI";
    private String video38 = "yzTuBuRdAyA";
    private String video39 = "8UVNT4wvIGY";
    private String video40 = "QGJuMBdaqIw";
    private String video41 = "nfs8NYg7yQM";
    private String video42 = "vWaRiD5ym74";
    private String video43 = "cH4E_t3m3xM";
    private String video44 = "6GUm5g8SG4o";
    private String video45 = "56WBK4ZK_cw";
    private String video46 = "SlPhMPnQ58k";
    private String video47 = "igNVdlXhKcI";

    private HashMap<String,String> videos;

    public YoutubeVideos() {

        videos = new HashMap<>();

        //French songs
        videos.put(video1,French);
        videos.put(video2,French);
        videos.put(video3,French);
        videos.put(video4,French);
        videos.put(video5,French);
        videos.put(video6,French );
        videos.put(video7,French );
        videos.put(video8,French );
        videos.put(video9,French );
        videos.put(video10,French );
        videos.put(video11,French );
        videos.put(video12,French );
        videos.put(video13,French );
        videos.put(video14,French );
        videos.put(video15,French );

        //Spanish songs
        videos.put(video16,Spanish );
        videos.put(video17,Spanish );
        videos.put(video18,Spanish );
        videos.put(video19,Spanish );
        videos.put(video20,Spanish );
        videos.put(video21,Spanish );
        videos.put(video22,Spanish );
        videos.put(video23,Spanish );
        videos.put(video24,Spanish );
        videos.put(video25,Spanish );
        videos.put(video26,Spanish );
        videos.put(video27,Spanish );
        videos.put(video28,Spanish );
        videos.put(video29,Spanish );
        videos.put(video30,Spanish );
        videos.put(video31,Spanish );

        //English songs
        videos.put(video32,English );
        videos.put(video33,English );
        videos.put(video34,English );
        videos.put(video35,English );
        videos.put(video36,English );
        videos.put(video37,English );
        videos.put(video38,English );
        videos.put(video39,English );
        videos.put(video40,English );
        videos.put(video41,English );
        videos.put(video42,English );
        videos.put(video43,English );
        videos.put(video44,English );
        videos.put(video45,English );
        videos.put(video46,English );
        videos.put(video47,English );

    }

    public HashMap<String,String> getVideos(){
        return videos;

    }



}
