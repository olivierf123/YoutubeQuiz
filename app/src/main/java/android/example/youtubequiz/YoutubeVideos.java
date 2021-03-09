package android.example.youtubequiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

//TODO mettre un language selector dans le menu pour que le joueur choisse quel langue y veux jouer

//TODO enlever le jeux de test et audio et mettre famille de langues as la place


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
    private String video6 = "DTM8sTTfnLc";
    private String video7 = "aU_TQcyGkvY";
    private String video8 = "H7rhMqTQ4WI";
    private String video9 = "Yy6AG-Vu094";
    private String video10 = "INuD2D7R8bk";
    private String video11 = "rZz8r8ZE93I";
    private String video12 = "QLNr3_YNeJc";
    private String video13 = "Aq1PsFGssOg";
    private String video14 = "znSs7uEXCeo";
    private String video15 = "CiC2jTwGmIc";
    
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
    private String video47 = "gGdGFtwCNBE";


    //Ukranien:

    private String video48 = "jRR0-H3nEIk";
    private String video49 = "K6QkbIdKkRw";
    private String video50 = "eUQaqUUQwQE";
    private String video51 = "tvaU1_TN19Y";
    private String video52 = "iTvpl07M45o";
    private String video53 = "0xFrRMle7nk";
    private String video54 = "jc3HmcQcN4c";
    private String video55 = "5R2pZTwE6fg";
    private String video56 = "yU5E7ahf1Q4";
    private String video57 = "adzOwkpyWDQ";
    private String video58 = "AVu5wl8U_a4";
    private String video59 = "MdnjXyrjG28";
    private String video60 = "AF0Mitd05_A";
    private String video61 = "u9rG7hOZbdQ";
    private String video62 = "NAH5zKsGu";
    private String video63 = "_JyTolNxJ5I";

    // Danish:

    private String video64 = "_xAjt64AoD0";
    private String video65 = "dP6EkoXM";
    private String video66 = "dEDGex2J_fs";
    private String video67 = "OqGBJRKcvFM";
    private String video68 = "KlV-xGTV1P0";
    private String video69 = "MY2TH9xnqLs";
    private String video70 = "CF-MP02GYK0";
    private String video71 = "NiiY71uixj0";
    private String video72 = "3kb2l8SJS1Y";
    private String video73 = "bBX6VOYzcwA";
    private String video74 = "A2s74NKkPl8";
    private String video75 = "dlCLdGKrx58";
    private String video76 = "qbU8N10IheI";
    private String video77 = "ioYAdC4Vjjc";
    private String video78 = "2ONj1qljNtM";
    private String video79 = "JGDZt0zEKgU";

    //Turkish

    private String video80 = "zVDCvFmt7nA";
    private String video81 = "HvuLecJdefo";
    private String video82 = "DnB162O1AYo";
    private String video83 = "YS0IGCSh3xU";
    private String video84 = "eMlIhNIZHio";
    private String video85 = "OR6MUPxtFEI";
    private String video86 = "t2XE5hoC7iQ";
    private String video87 = "9ZfGOEFIwko";
    private String video88 = "UpwoNAi5qd0";
    private String video89 = "jPy5A0RxXh0";
    private String video90 = "q-gOKBwcRTI";
    private String video91 = "IPmzyvylUBo";
    private String video92 = "TMVKuBh8lSU";
    private String video93 = "PBbyBqyQhQM";
    private String video94 = "cPAM0TnkpO8";

    //Romanian
    private String video95 = "o8_jPaXfxWY";
    private String video96 = "3KmfcD0JHrA";
    private String video97 = "GwNj_uIskTQ";
    private String video98 = "6HCnT_NqrQI";
    private String video99 = "ppFIcp4jfMw";
    private String video100 = "q_ljUC2AqtE";
    private String video101= "y94MmUhq0g4";
    private String video102= "TofHjcNwP2M";
    private String video103= "zNl00mOSnJI";
    private String video104= "Geyg_F5pfHE";
    private String video105= "9zizhzT3VtM";
    private String video106= "OGQtZ-3mXqE";
    private String video107= "Vl4shT2grec";
    private String video108= "ngBpfwT-YDw";

    //Mandarian(chinese) songs
    private String video110= "ngBpfwT-YDw";
    private String video111= "ngBpfwT-YDw";
    private String video112= "ngBpfwT-YDw";
    private String video113= "ngBpfwT-YDw";
    private String video114= "ngBpfwT-YDw";
    private String video115= "ngBpfwT-YDw";
    private String video116= "ngBpfwT-YDw";
    private String video117= "ngBpfwT-YDw";
    private String video118= "ngBpfwT-YDw";
    private String video119= "ngBpfwT-YDw";
    private String video120= "ngBpfwT-YDw";
    private String video121= "ngBpfwT-YDw";
    private String video122= "ngBpfwT-YDw";
    private String video123= "ngBpfwT-YDw";
    private String video124= "ngBpfwT-YDw";

    //German songs

    private String video125= "hln61FaG-8";
    private String video126= "--HCZzQHrDA";
    private String video127= "sAalOFYwmjE";
    private String video128= "N_pdZwGfjzY";
    private String video129= "_tu4h5gk30k";
    private String video130= "1tD41isys1o";
    private String video131= "mu-LuHbl4zI";
    private String video132= "-7se45WYvGk";
    private String video133= "HGQFKoObkGA";
    private String video134= "6g8wrXoHAXY";
    private String video135= "DnXW8a8GEvU";
    private String video136= "nUenUqBsTCE";
    private String video137= "J1G4DWHPBVI";
    private String video138= "hCueVlAom3Q";
    private String video139= "xFx-4TcRHJE";

    //Icelandic songs

    private String video140= "dskXLtVxLdY";
    private String video141= "2H8HthXMWQg";
    private String video142= "aNKoQ-82xI8";
    private String video143= "v9gIwBq2Wgw";
    private String video144= "MuGCua0IqlM";
    private String video145= "Ea0Hhtpm5G4";
    private String video146= "ABx6Zdl1aIQ";
    private String video147= "tc9i9TEh_hQ";
    private String video148= "pDHotAaNeEM";
    private String video149= "vecbLV0nlX4";
    private String video150= "A6j7mUxGz20";
    private String video151= "zm3wa2LtJQM";

    //Swedish songs
    private String video492= "kbXvPs5ql68";
    private String video493= "nqE8Um9t8CU";
    private String video494= "_p1D63vj0ss";
    private String video495= "HInYeg78sMU";
    private String video496= "W_eepOSos88";
    private String video497= "g2yzdDAZBLI";
    private String video498= "hvkShLKfl54";
    private String video499= "MDO6BZs6o-k";
    private String video500= "aOXw9Vfz14I";
    private String video501= "uwh2WXbqilk";
    private String video502= "DmkM2QD8750";
    private String video503= "1JWP464tYY4";
    private String video504= "7U5ZUP36deI";
    private String video505= "nJa1t5DfAN4";
    private String video506= "Oyaa3kzfMpU";
    private String video507= "xfcDvOzU6pQ";

    //Norwegian songs

    private String video153 = "ri5_fzndMBg";
    private String video154 = "3fnPwj1AMpo";
    private String video155 = "BRjJN8JLDdM";
    private String video156 = "Hu8c_yYfOPc";
    private String video157 = "WG2cwFx-3TM";
    private String video158 = "s18WNRo_7Xw";
    private String video159 = "_nOOScpHYd0";
    private String video160 = "8ZkFXnm-RNQ";
    private String video161 = "O1cnzaTQUqI";
    private String video162 = "qYOU3D3Bjvo";
    private String video163 = "US_N8x5JOwE";
    private String video164 = "hauXNybVGJ4";
    private String video165 = "wCXrSCuEfeU";
    private String video166 = "XmJc_k-l0pY";
    private String video167 = "wNYkub8nvk0";

    //Dutch songs
    private String video168 = "su5mSoREoso";
    private String video169 = "s3pbxQakKIc";
    private String video170 = "fZJo2270JHU";
    private String video171 = "osujHfmze_Y";
    private String video172 = "oAZU5UCqdo8";
    private String video173 = "ICM2sYAVXGc";
    private String video174 = "Q0NzqAXcZZM";
    private String video175 = "IlnorWv4rMo";
    private String video176 = "9Ycl5xtHzxo";
    private String video177 = "xNy-5SqRUXo";
    private String video178 = "sof8Y6htHXo";
    private String video179 = "hkMqWM3LpHY";
    private String video180 = "BUQxCGZWFAw";
    private String video181 = "d1Rh80xM7_8";
    private String video182 = "rzMlfJ1F8Ck";

    //Polish songs
    private String video183 = "hp4endJMu1E";
    private String video184 = "7zHIJtFRrEg";
    private String video185 = "n2hJA78YuWw";
    private String video186 = "cxtnot8lY4U";
    private String video187 = "LCcIx6bCcr8";
    private String video188 = "D0o6GsYoMak";
    private String video189 = "pImrABc4s58";
    private String video190 = "M5UqFj-uk78";
    private String video191 = "iAc6Qr_sAXw";
    private String video192 = "JvxG3zl_WhU";
    private String video193 = "tgw1yEcWpTU";
    private String video194 = "6BnT_wkuMBA";
    private String video195 = "ngj0Gi_yy3M";
    private String video196 = "PdxCZOCwtGk";
    private String video197 = "GzjOboh588Y";

    //Russian songs
    private String video198 = "9knYNjp95bs";
    private String video199 = "nidQCt_HEsY";
    private String video200 = "FUdteCBRX9c";
    private String video201 = "m-el0pQLQE4";
    private String video202 = "Odbn1pIIpdw";
    private String video203 = "CMBmJ93Jqqg";
    private String video204 = "3pEsU-KYfGU";
    private String video205 = "6AsK2vGsL5Y";
    private String video206 = "ueYhI-bo-70";
    private String video207 = "E-H3Vxm7p80";
    private String video208 = "jAZt6-dN4SA";
    private String video209 = "vvRJkjD7Ixg";
    private String video210 = "a-GQDCtt1Vk";
    private String video211 = "_TazBWWgOeQ";
    private String video212 = "MBG3Gdt5OGs";

    //Bulgarian songs
    private String video213 = "P_Y7abspLSA";
    private String video214 = "3kcT3g_u9oU";
    private String video215 = "0OqAd7hPr9E";
    private String video216 = "3SoJbrKbstc";
    private String video217 = "zUz9OBIuFrs";
    private String video218 = "1hquWtswX88";
    private String video219 = "aj1PT3yp6HY";
    private String video220 = "tQ5oMD5QDX4";
    private String video221 = "UPvJD0_t2Zs";
    private String video222 = "xFpW8Iaidbc";
    private String video223 = "yybcghuOUBg";
    private String video224 = "Lez48XNEViM";
    private String video225 = "RqqCk7QTuHc";
    private String video226 = "brzwIdMSpDY";
    private String video227 = "ig5Hl6Nbv3g";

    //Faroese songs

    private String video228 = "l09_xtWRXnU";
    private String video229 = "Qy4ma_P0Is0";
    private String video230 = "WMlUhLRaV5o";
    private String video231 = "7pMoFmAj_Wk";
    private String video232 = "bd3-DRZurNY";
    private String video233 = "9E6sP8znfwM";
    private String video234 = "Mq_QHBNz_hk";
    private String video235 = "9E6sP8znfwM";
    private String video236 = "pqnMkUcTmys";
    private String video237 = "LpiFmZLICgM";
    private String video238 = "NOsFQ-VUeMw";
    private String video239 = "jD10QBgVc3o";
    private String video240 = "MTeRBNprvTo";
    private String video241 = "_aNjKtuy_x8";


    //Serbian songs

    private String video242 = "Txip4rYPXcg";
    private String video243 = "1halUd8asmk";
    private String video244 = "91CGA_Js7SU";
    private String video245 = "nuw6TLOEm7Q";
    private String video246 = "bWd6vNaAGYI";
    private String video247 = "-d4LvSDuHsQ";
    private String video248 = "WcE8Rrzfeio";
    private String video249 = "17LhH2IkZns";
    private String video250 = "fRaR2ksbBlM";
    private String video251 = "C_jWhU93Zg8";
    private String video252 = "l1GgyzCyJ6Y";
    private String video253 = "JO3ZHx9GYDI";
    private String video254 = "ghsdCODQj7c";
    private String video255 = "eFJKfvRjDzY";
    private String video256 = "SI3UltfEWhA";
    private String video257 = "yXW5hfUEmtU";
    private String video258 = "XoMGYa_vRhs";

    //Korean songs

    private String video259 = "mH0_XpSHkZo";
    private String video260 = "6ZUPsl0EVuk";
    private String video261 = "_waD9YW8Pa8";
    private String video262 = "_yXEnhyOTQo";
    private String video263 = "CQ0Dzz2VF3k";
    private String video264 = "CM4CkVFmTds";
    private String video265 = "dyRsYk0LyA8";
    private String video266 = "ePpPVE-GGJw";
    private String video267 = "F8c8f2nK82w";
    private String video268 = "wTowEKjDGkU";
    private String video269 = "G8GaQdW2wHc";
    private String video270 = "FKG48r9Wl8o";
    private String video271 = "-Bf_BB9iTNI";
    private String video272 = "LmBYPXGqtss";
    private String video273 = "TgOu00Mf3kI";

    //Mongolian songs
    private String video274 = "NenhLnh2hXk";
    private String video275 = "-xXCt3kmifs";
    private String video276 = "wmNBuHsUtB4";
    private String video277 = "BhqW6kUm6nQ";
    private String video278 = "h1Ig4A-XJ3Q";
    private String video279 = "JUuMF8Y_-Ig";
    private String video280 = "kY0XWCNBjLg";
    private String video281 = "mLc-szo0e_U";
    private String video282 = "uowvCBAx3g0";
    private String video283 = "KGwIX2vfL94";
    private String video284 = "ZtUIoogLgpI";
    private String video285 = "6yz-rb53L-4";
    private String video286 = "0_XDaKfX5v0";
    private String video287 = "Y5OBLlyyk78";
    private String video288 = "5JQ7Fcm3eAo";

    //Japenese songs
    private String video299 = "UyxiuC3zle0";
    private String video300 = "L2dKjnmWRkk";
    private String video301 = "ir5cF-EvBig";
    private String video302 = "QA772MHy794";
    private String video303 = "c2y8Ba3WwPY";
    private String video304 = "DwTinTO0o9I";
    private String video305 = "bOnJTM--wgM";
    private String video306 = "vYV-XJdzupY";
    private String video307 = "1ShMw7WGFx0";
    private String video308 = "K_xTet06SUo";
    private String video309 = "nhuNb0XtRhQ";
    private String video310 = "dlFA0Zq1k2A";
    private String video311 = "BvYuf4r-8xk";
    private String video312 = "eLPs_w-FepA";
    private String video313 = "wOJCxNCiVjE";

    //Vietnamese songs
    private String video314= "rS_Lkxtkc1c";
    private String video315= "kMJ2j0t2icE";
    private String video316 = "__kGJZ-kPno";
    private String video317 = "HPL74s4VPdk";
    private String video318 = "ioHp2iGUwyg";
    private String video319= "gZKkD3edFaE";
    private String video320 = "5l9YHy28jpk";
    private String video321 = "bu2FBl_GzEA";
    private String video322 = "nBADFUDapmk";
    private String video323 = "b1UtffzfG64";
    private String video324 = "cBClD7jylos";
    private String video325 = "BwN3NiZt-PU";
    private String video326 = "j8U06veqxdU";
    private String video327 = "8x2NjwwHUbQ";
    private String video328 = "qGRU3sRbaYw";

    //Cantonese (chinese) songs
    private String video329 = "YBV9OIjNlWU";
    private String video330 = "2Taj_Hc8ltU";
    private String video331 = "yBctNUyCLZc";
    private String video332 = "I3NFPlSmNu8";
    private String video333 = "kTzUwhPuIwg";
    private String video334 = "Jot0ev7VPMs";
    private String video335 = "8QKWJlNq4Hk";
    private String video336 = "DiiUBW2piwA";
    private String video337 = "sg8V5BLMEhE";
    private String video338 = "VYVJlEwDTZ8";
    private String video339 = "TnC9SodBq-8";
    private String video340 = "rcOweqYYX1U";
    private String video341 = "SXx-rFjFxts";
    private String video342 = "dZQYIjaUT_o";
    private String video343 = "EnguPjSw1Eo";

    //Sanghainese songs

    private String video344 = "_3kgRVVUTyI";
    private String video345 = "rUY7YJCFUwo";
    private String video346 = "m0X-qrN-nHQ";
    private String video347 = "Eo6LExOhZcI";
    private String video348 = "6gYX6VsZEIE";
    private String video349 = "wI-Ncr4EK8s";
    private String video350 = "haTAD9fUCoQ";
    private String video351 = "8ONDC9BZIoI";
    private String video352 = "Gg9pB5rM1YY";
    private String video353 = "u80BdvS4sKI";
    private String video354 = "wJCGuZtLXp8";
    private String video355 = "6Dsay7QHccI";
    private String video356 = "EnguPjSw1Eo";

    //Thai songs
    private String video357 = "jVMpdSv8IDM";
    private String video358 = "-jfAE4U4p3o";
    private String video359 = "q1w2qM0K9TE";
    private String video360 = "yGf-CrhbUBM";
    private String video361 = "YREDMoGRgoQ";
    private String video362 = "O-QWKCcbRFg";
    private String video363 = "oPnjEiwH0Vk";
    private String video364 = "34O7ZSVod0Y";
    private String video365 = "6yzSlm2Qpzs";
    private String video366 = "tm2N4gntigI";
    private String video367 = "JBAuRoIRAs8";
    private String video368 = "KkxQSC1c6v4";
    private String video369 = "AZ_t9iAJRDw";
    private String video370 = "E0IfcXBxyic";
    private String video371 = "dytvU-Z-H1k";

    //Laotian songs

    private String video372 = "Dzko3n_AFLE";
    private String video373 = "CLGhcWyTftU";
    private String video374 = "70XiYM87DQg";
    private String video375 = "mCTn0AwxtHI";
    private String video376 = "S33g4vdWc1Y";
    private String video377 = "HL_R8DIwErM";
    private String video378 = "cM4XTpj9aEo";
    private String video379 = "Hwyxvb1J5Ls";
    private String video380 = "AepKOTc5PRY";
    private String video381 = "9Riz84j74l8";
    private String video382 = "3V2K8zBPxgA";
    private String video383 = "re50wnmp-fE";
    private String video384 = "-H4fXSbAuN8";
    private String video385 = "xkuDQKqdV0I";
    private String video386 = "mklEbLY9feU";

    //Persian songs

    private String video387 = "bC3WAxiLnDY";
    private String video388 = "rjBsQ9SygnE";
    private String video389 = "6dKQR2m-Xfs";
    private String video390 = "qaImFO_DgAM";
    private String video391 = "smro3V05XtE";
    private String video392 = "d_VZpvoUYo4";
    private String video393 = "oGRKDPj69js";
    private String video394 = "w_bJLCcOmhU";
    private String video395 = "mPeuOi8G9Yg";
    private String video396 = "sqrcojDjiGA";
    private String video397 = "Ehd3zeMKX-E";
    private String video398 = "DUi9uYUeX9I";
    private String video399 = "Vaued8Z52ok";
    private String video400 = "LcrF6njYNgo";
    private String video401 = "d8lyn1XTOHE";

    //Turkmen songs

    private String video402 = "kAY1gBvBPIs";
    private String video403 = "WPolg-1kzRc";
    private String video404 = "ZU1lxO1lRtQ";
    private String video405 = "oGWlngTTKz8";
    private String video406 = "H3vJkdP9I5E";
    private String video407 = "BJ-3Hx-GfAU";
    private String video408 = "HYAcytJl9jM";
    private String video409 = "1d8tmlo8aF0";
    private String video410 = "ORFLO0ihWm0";
    private String video411 = "h-I0P8C4Dqk";
    private String video412 = "8IlqJVMsjAQ";
    private String video413 = "ETTr-2DuocQ";
    private String video414 = "Uy8LOpoMh10";
    private String video415 = "heRFckzijtU";
    private String video416 = "d2M1JgPTVZM";

    //Kazakh songs
    private String video417= "YPufRvMNw14";
    private String video418 = "yxGg0EiUAKo";
    private String video419 = "T4vbuev3WIQ";
    private String video420 = "nIPfuhIzpzM";
    private String video421 = "0AgGBEhLyB0";
    private String video422 = "NYXryXO6oPc";
    private String video423 = "6bx4p86Ta0U";
    private String video424 = "P-F88_oGn30";
    private String video425 = "QQgH4IRbMSs";
    private String video426 = "_RrCc-CbCPY";
    private String video427 = "i2QBoWQzvIU";
    private String video428 = "mUfgacvZte4";
    private String video429 = "hwCDU0zXUKo";
    private String video430 = "3WlI5RsQeSo";
    private String video431 = "UVIz5vJcCk8";

    //Arabic songs

    private String video432 = "_Fwf45pIAtM";
    private String video433 = "IJHPpTYtIqk";
    private String video434 = "ejvpVhvKesM";
    private String video435 = "PUUvj9CxUYU";
    private String video436 = "vEfW9sm70tg";
    private String video437 = "ucNF2GHhk2k";
    private String video438 = "lhnmVSB-Rxc";
    private String video439 = "Pma_IwydPmw";
    private String video440 = "7YVydzZHU6U";
    private String video441 = "6Q8e8tmKWMI";
    private String video442 = "fbK2ySlxAW4";
    private String video443 = "vgDkghvqwdA";
    private String video444 = "Bt20plcDBcg";
    private String video445 = "wbpGJm8lHP8";
    private String video446 = "O5mlFvk3b5o";

    //Amharic songs

    private String video447 = "3PJSmjnVbsE";
    private String video448 = "LHqX737oMtA";
    private String video449 = "GaLfl3PuPA4";
    private String video450 = "aFy0MrKbuAM";
    private String video451 = "Tu8FA2OArbw";
    private String video452 = "HJilWfXgDKU";
    private String video453 = "eWdXVQaI3kM";
    private String video454 = "BjugBLIKbYo";
    private String video455 = "t8t0zFgtQtM";
    private String video456 = "OPoeRmTEqgc";
    private String video457 = "ubRzPh0E1Mk";
    private String video458 = "7ivEkKuJUzw";
    private String video459 = "U8Ni_zBoJqA";
    private String video460 = "fdJI2PhdzvU";
    private String video461 = "nVZH_twyijM";

    //Hebrew songs
    private String video462 = "cRGrIn2VHTE";
    private String video463 = "t2fakms1QWo";
    private String video464 = "tjnR0fy1gKg";
    private String video465 = "oHriLjXsw2Y";
    private String video466 = "oHriLjXsw2Y";
    private String video467 = "jsPonxryRY0";
    private String video468 = "ZRXyDTvrpTw";
    private String video469 = "E_hzOuAK5gY";
    private String video470 = "uBGLEZCCH7U";
    private String video471 = "94BIxqTYJzU";
    private String video472 = "gUl5M9QVXrA";
    private String video473 = "EXSe-vixsiE";
    private String video474 = "Dpu0Cc1ZQ1g";
    private String video475 = "egtOB8arAN0";
    private String video476 = "FPKnq8vWHkc";

    //Azerbaijani (azeri) songs

    private String video477 = "uVUklqNr2vg";
    private String video478 = "YP6zXZn5_Xg";
    private String video479 = "TnQPr1ANN8w";
    private String video480 = "KogS4hBRWzs";
    private String video481 = "5TcW7MYdC4M";
    private String video482 = "fOu-_0-gL0w";
    private String video483 = "a5GzAmDiEME";
    private String video484 = "OT-IcNeKfyg";
    private String video485 = "nEI31HnfAfk";
    private String video486 = "sWcNN6y8EqQ";
    private String video487 = "_wv1sE_yc8Q";
    private String video488 = "T8de-31Hu7g";
    private String video489 = "tRDgNUiJxS0";
    private String video490 = "IfNZi3LjNAU";
    private String video491 = "JJmexDKCklY";

    private ArrayList<String> langFamily1;
    private ArrayList<String> langFamily2;
    private ArrayList<String> langFamily3;
    private ArrayList<String> langFamily4;
    private ArrayList<String> allLanguages;

    private HashMap<String,String> videos;

    public YoutubeVideos() {

        videos = new HashMap<>();
        langFamily1 = new ArrayList<>();
        langFamily2 = new ArrayList<>();
        langFamily3 = new ArrayList<>();
        langFamily4 = new ArrayList<>();
        allLanguages = new ArrayList<>();

        //Add family 1 language
        langFamily1.add(Spanish);
        langFamily1.add("Catalan");
        langFamily1.add("Galician");
        langFamily1.add("Romanian");
        langFamily1.add("Italian");
        langFamily1.add("Portuguese");
        langFamily1.add("Occitan");
        langFamily1.add("Sicilian");
        langFamily1.add("Neapolitan");
        langFamily1.add("Greek");
        langFamily1.add("Basque");

        //Add family 2 language
        langFamily2.add("Arabic");
        langFamily2.add("Amharic");
        langFamily2.add("Hebrew");
        langFamily2.add("Turkish");
        langFamily2.add("Uzbek");
        langFamily2.add("Azerbaijani");
        langFamily2.add("Tajik");
        langFamily2.add("Kazakh");
        langFamily2.add("Turkmen");
        langFamily2.add("Persian");

        //Add family 3 language
        langFamily3.add("Korean");
        langFamily3.add("Mongolian");
        langFamily3.add("Japanese");
        langFamily3.add("Japanese");
        langFamily3.add("Mandarin");
        langFamily3.add("Vietnamese");
        langFamily3.add("Cantonese");
        langFamily3.add("Sanghainese");
        langFamily3.add("Thai");
        langFamily3.add("Laotian");
        langFamily3.add("Hakka");


        //Add family 4 language
        langFamily4.add("Danish");
        langFamily4.add("German");
        langFamily4.add("Icelandic");
        langFamily4.add("Swedish");
        langFamily4.add("Faroese");
        langFamily4.add("Norwegian");
        langFamily4.add("Serbian");
        langFamily4.add("Bulgarian");
        langFamily4.add("Russian");
        langFamily4.add("Polish");
        langFamily4.add("Dutch");
        langFamily4.add("Ukrainian");


        //Add all langauges to allLanguages ArrayList
        allLanguages.add(Spanish);
        allLanguages.add("Catalan");
        allLanguages.add("Galician");
        allLanguages.add("Romanian");
        allLanguages.add("Italian");
        allLanguages.add("Portuguese");
        allLanguages.add("Occitan");
        allLanguages.add("Sicilian");
        allLanguages.add("Sicilian");
        allLanguages.add("Neapolitan");
        allLanguages.add("Greek");
        allLanguages.add("Basque");
        allLanguages.add("Arabic");
        allLanguages.add("Amharic");
        allLanguages.add("Hebrew");
        allLanguages.add("Turkish");
        allLanguages.add("Uzbek");
        allLanguages.add("Azerbaijani");
        allLanguages.add("Tajik");
        allLanguages.add("Kazakh");
        allLanguages.add("Turkmen");
        allLanguages.add("Persian");
        allLanguages.add("Korean");
        allLanguages.add("Mongolian");
        allLanguages.add("Japanese");
        allLanguages.add("Japanese");
        allLanguages.add("Mandarin");
        allLanguages.add("Vietnamese");
        allLanguages.add("Cantonese");
        allLanguages.add("Sanghainese");
        allLanguages.add("Thai");
        allLanguages.add("Laotian");
        allLanguages.add("Hakka");
        allLanguages.add("Danish");
        allLanguages.add("German");
        allLanguages.add("Icelandic");
        allLanguages.add("Swedish");
        allLanguages.add("Faroese");
        allLanguages.add("Norwegian");
        allLanguages.add("Serbian");
        allLanguages.add("Bulgarian");
        allLanguages.add("Russian");
        allLanguages.add("Polish");
        allLanguages.add("Dutch");
        allLanguages.add("Ukrainian");







        //French songs
        videos.put(video1, French );
        videos.put(video2, French );
        videos.put(video3, French );
        videos.put(video4, French );
        videos.put(video5, French );
        videos.put(video6, French );
        videos.put(video7, French );
        videos.put(video8, French );
        videos.put(video9, French );
        videos.put(video10, French );
        videos.put(video11, French );
        videos.put(video12, French );
        videos.put(video13, French );
        videos.put(video14, French );
        videos.put(video15, French );
        videos.put("CiC2jTwGmIc", French);

        //Spanish songs

        videos.put(video16, Spanish );
        videos.put(video17, Spanish );
        videos.put(video18, Spanish );
        videos.put(video19, Spanish );
        videos.put(video20, Spanish );
        videos.put(video21, Spanish );
        videos.put(video22, Spanish );
        videos.put(video23, Spanish );
        videos.put(video24, Spanish );
        videos.put(video25, Spanish );
        videos.put(video26, Spanish );
        videos.put(video27, Spanish );
        videos.put(video28, Spanish );
        videos.put(video29, Spanish );
        videos.put(video30, Spanish );
        videos.put(video31, Spanish );

        //English songs

        videos.put(video32, English );
        videos.put(video33, English );
        videos.put(video34, English );
        videos.put(video35, English );
        videos.put(video36, English );
        videos.put(video37, English );
        videos.put(video38, English );
        videos.put(video39, English );
        videos.put(video40, English );
        videos.put(video41, English );
        videos.put(video42, English );
        videos.put(video43, English );
        videos.put(video44, English );
        videos.put(video45, English );
        videos.put(video46, English );
        videos.put(video47, English );


        //Ukranien Songs

        videos.put(video48,"Ukrainian");
        videos.put(video49,"Ukrainian");
        videos.put(video50,"Ukrainian");
        videos.put(video51,"Ukrainian");
        videos.put(video52,"Ukrainian");
        videos.put(video53,"Ukrainian");
        videos.put(video54,"Ukrainian");
        videos.put(video55,"Ukrainian");
        videos.put(video56,"Ukrainian");
        videos.put(video57,"Ukrainian");
        videos.put(video58,"Ukrainian");
        videos.put(video59,"Ukrainian");
        videos.put(video60,"Ukrainian");
        videos.put(video61,"Ukrainian");
        videos.put(video62,"Ukrainian");
        videos.put(video63,"Ukrainian");

        //Danish songs 64 to 79
        videos.put(video64,"Danish");
        videos.put(video65,"Danish");
        videos.put(video66,"Danish");
        videos.put(video67,"Danish");
        videos.put(video68,"Danish");
        videos.put(video69,"Danish");
        videos.put(video70,"Danish");
        videos.put(video71,"Danish");
        videos.put(video72,"Danish");
        videos.put(video73,"Danish");
        videos.put(video74,"Danish");
        videos.put(video75,"Danish");
        videos.put(video76,"Danish");
        videos.put(video77,"Danish");
        videos.put(video78,"Danish");
        videos.put(video79,"Danish");

        //Turkish songs 80 to 94
        videos.put(video80,"Turkish");
        videos.put(video81,"Turkish");
        videos.put(video82,"Turkish");
        videos.put(video83,"Turkish");
        videos.put(video84,"Turkish");
        videos.put(video85,"Turkish");
        videos.put(video86,"Turkish");
        videos.put(video87,"Turkish");
        videos.put(video88,"Turkish");
        videos.put(video89,"Turkish");
        videos.put(video90,"Turkish");
        videos.put(video91,"Turkish");
        videos.put(video92,"Turkish");
        videos.put(video93,"Turkish");
        videos.put(video94,"Turkish");

        //Romanian 95 to 108

        videos.put(video95,"Romanian");
        videos.put(video96,"Romanian");
        videos.put(video97,"Romanian");
        videos.put(video98,"Romanian");
        videos.put(video99,"Romanian");
        videos.put(video100,"Romanian");
        videos.put(video101,"Romanian");
        videos.put(video102,"Romanian");
        videos.put(video103,"Romanian");
        videos.put(video104,"Romanian");
        videos.put(video105,"Romanian");
        videos.put(video106,"Romanian");
        videos.put(video107,"Romanian");
        videos.put(video108,"Romanian");

        //Mandarin 110 to 124
        videos.put(video110,"Mandarin");
        videos.put(video111,"Mandarin");
        videos.put(video112,"Mandarin");
        videos.put(video113,"Mandarin");
        videos.put(video114,"Mandarin");
        videos.put(video115,"Mandarin");
        videos.put(video116,"Mandarin");
        videos.put(video117,"Mandarin");
        videos.put(video118,"Mandarin");
        videos.put(video119,"Mandarin");
        videos.put(video120,"Mandarin");
        videos.put(video121,"Mandarin");
        videos.put(video122,"Mandarin");
        videos.put(video123,"Mandarin");
        videos.put(video124,"Mandarin");

        //German 125 to 139

        videos.put(video125,"German");
        videos.put(video126,"German");
        videos.put(video127,"German");
        videos.put(video128,"German");
        videos.put(video129,"German");
        videos.put(video130,"German");
        videos.put(video131,"German");
        videos.put(video132,"German");
        videos.put(video133,"German");
        videos.put(video134,"German");
        videos.put(video135,"German");
        videos.put(video136,"German");
        videos.put(video137,"German");
        videos.put(video138,"German");
        videos.put(video139,"German");

        //Icelandic 140 to 151

        videos.put(video140,"Icelandic");
        videos.put(video141,"Icelandic");
        videos.put(video142,"Icelandic");
        videos.put(video143,"Icelandic");
        videos.put(video144,"Icelandic");
        videos.put(video145,"Icelandic");
        videos.put(video146,"Icelandic");
        videos.put(video147,"Icelandic");
        videos.put(video148,"Icelandic");
        videos.put(video149,"Icelandic");
        videos.put(video150,"Icelandic");
        videos.put(video151,"Icelandic");


        //Swedish 492 to 507

        videos.put(video492,"Swedish");
        videos.put(video493,"Swedish");
        videos.put(video494,"Swedish");
        videos.put(video495,"Swedish");
        videos.put(video496,"Swedish");
        videos.put(video497,"Swedish");
        videos.put(video498,"Swedish");
        videos.put(video499,"Swedish");
        videos.put(video500,"Swedish");
        videos.put(video501,"Swedish");
        videos.put(video502,"Swedish");
        videos.put(video503,"Swedish");
        videos.put(video504,"Swedish");
        videos.put(video505,"Swedish");
        videos.put(video506,"Swedish");
        videos.put(video507,"Swedish");

        //Norwegian 153 to 167

        videos.put(video153,"Norwegian");
        videos.put(video154,"Norwegian");
        videos.put(video155,"Norwegian");
        videos.put(video156,"Norwegian");
        videos.put(video157,"Norwegian");
        videos.put(video158,"Norwegian");
        videos.put(video159,"Norwegian");
        videos.put(video160,"Norwegian");
        videos.put(video161,"Norwegian");
        videos.put(video162,"Norwegian");
        videos.put(video163,"Norwegian");
        videos.put(video164,"Norwegian");
        videos.put(video165,"Norwegian");
        videos.put(video166,"Norwegian");
        videos.put(video167,"Norwegian");

        //Dutch 168 to 182

        videos.put(video168,"Dutch");
        videos.put(video169,"Dutch");
        videos.put(video170,"Dutch");
        videos.put(video171,"Dutch");
        videos.put(video172,"Dutch");
        videos.put(video173,"Dutch");
        videos.put(video174,"Dutch");
        videos.put(video175,"Dutch");
        videos.put(video176,"Dutch");
        videos.put(video177,"Dutch");
        videos.put(video178,"Dutch");
        videos.put(video179,"Dutch");
        videos.put(video180,"Dutch");
        videos.put(video181,"Dutch");
        videos.put(video182,"Dutch");


        //Polish 183 to 197

        videos.put(video184,"Polish");
        videos.put(video185,"Polish");
        videos.put(video186,"Polish");
        videos.put(video187,"Polish");
        videos.put(video188,"Polish");
        videos.put(video189,"Polish");
        videos.put(video190,"Polish");
        videos.put(video191,"Polish");
        videos.put(video192,"Polish");
        videos.put(video193,"Polish");
        videos.put(video194,"Polish");
        videos.put(video195,"Polish");
        videos.put(video196,"Polish");
        videos.put(video197,"Polish");

        //Russian 198 to 212
        videos.put(video198,"Russian");
        videos.put(video199,"Russian");
        videos.put(video200,"Russian");
        videos.put(video201,"Russian");
        videos.put(video202,"Russian");
        videos.put(video203,"Russian");
        videos.put(video204,"Russian");
        videos.put(video205,"Russian");
        videos.put(video206,"Russian");
        videos.put(video207,"Russian");
        videos.put(video208,"Russian");
        videos.put(video209,"Russian");
        videos.put(video210,"Russian");
        videos.put(video211,"Russian");
        videos.put(video212,"Russian");


        //Bulgarian 213 to 227
        videos.put(video213,"Bulgarian");
        videos.put(video214,"Bulgarian");
        videos.put(video215,"Bulgarian");
        videos.put(video216,"Bulgarian");
        videos.put(video217,"Bulgarian");
        videos.put(video218,"Bulgarian");
        videos.put(video219,"Bulgarian");
        videos.put(video220,"Bulgarian");
        videos.put(video221,"Bulgarian");
        videos.put(video222,"Bulgarian");
        videos.put(video223,"Bulgarian");
        videos.put(video224,"Bulgarian");
        videos.put(video225,"Bulgarian");
        videos.put(video226,"Bulgarian");
        videos.put(video227,"Bulgarian");


        //Faroese 228 to 241

        videos.put(video228,"Faroese");
        videos.put(video229,"Faroese");
        videos.put(video230,"Faroese");
        videos.put(video231,"Faroese");
        videos.put(video232,"Faroese");
        videos.put(video233,"Faroese");
        videos.put(video234,"Faroese");
        videos.put(video235,"Faroese");
        videos.put(video236,"Faroese");
        videos.put(video237,"Faroese");
        videos.put(video238,"Faroese");
        videos.put(video239,"Faroese");
        videos.put(video240,"Faroese");
        videos.put(video241,"Faroese");


        //Serbian 242 to 258
        videos.put(video242,"Serbian");
        videos.put(video243,"Serbian");
        videos.put(video244,"Serbian");
        videos.put(video245,"Serbian");
        videos.put(video246,"Serbian");
        videos.put(video247,"Serbian");
        videos.put(video248,"Serbian");
        videos.put(video249,"Serbian");
        videos.put(video250,"Serbian");
        videos.put(video251,"Serbian");
        videos.put(video252,"Serbian");
        videos.put(video253,"Serbian");
        videos.put(video254,"Serbian");
        videos.put(video255,"Serbian");
        videos.put(video256,"Serbian");
        videos.put(video257,"Serbian");
        videos.put(video258,"Serbian");
        videos.put("yx1fiU2vgN0", "Serbian");

        //Korean 259 to 273
        videos.put(video259,"Korean");
        videos.put(video260,"Korean");
        videos.put(video261,"Korean");
        videos.put(video262,"Korean");
        videos.put(video263,"Korean");
        videos.put(video264,"Korean");
        videos.put(video265,"Korean");
        videos.put(video266,"Korean");
        videos.put(video267,"Korean");
        videos.put(video268,"Korean");
        videos.put(video269,"Korean");
        videos.put(video270,"Korean");
        videos.put(video271,"Korean");
        videos.put(video272,"Korean");
        videos.put(video273,"Korean");
        videos.put("-mtlIhSY9W8", "Korean");

        //Mongolian 274 to 288
        videos.put(video274,"Mongolian");
        videos.put(video275,"Mongolian");
        videos.put(video276,"Mongolian");
        videos.put(video277,"Mongolian");
        videos.put(video278,"Mongolian");
        videos.put(video279,"Mongolian");
        videos.put(video280,"Mongolian");
        videos.put(video281,"Mongolian");
        videos.put(video282,"Mongolian");
        videos.put(video283,"Mongolian");
        videos.put(video284,"Mongolian");
        videos.put(video285,"Mongolian");
        videos.put(video286,"Mongolian");
        videos.put(video287,"Mongolian");
        videos.put(video288,"Mongolian");

        //Japenese 299 to 313
        videos.put(video299,"Japanese");
        videos.put(video300,"Japanese");
        videos.put(video301,"Japanese");
        videos.put(video302,"Japanese");
        videos.put(video303,"Japanese");
        videos.put(video304,"Japanese");
        videos.put(video305,"Japanese");
        videos.put(video306,"Japanese");
        videos.put(video307,"Japanese");
        videos.put(video308,"Japanese");
        videos.put(video309,"Japanese");
        videos.put(video310,"Japanese");
        videos.put(video311,"Japanese");
        videos.put(video312,"Japanese");
        videos.put(video313,"Japanese");

        //Vietnamese 314 to 328

        videos.put(video314,"Vietnamese");
        videos.put(video315,"Vietnamese");
        videos.put(video316,"Vietnamese");
        videos.put(video317,"Vietnamese");
        videos.put(video318,"Vietnamese");
        videos.put(video319,"Vietnamese");
        videos.put(video320,"Vietnamese");
        videos.put(video321,"Vietnamese");
        videos.put(video322,"Vietnamese");
        videos.put(video323,"Vietnamese");
        videos.put(video324,"Vietnamese");
        videos.put(video325,"Vietnamese");
        videos.put(video326,"Vietnamese");
        videos.put(video327,"Vietnamese");
        videos.put(video328,"Vietnamese");

        //Cantonese 329 to 343
        videos.put(video329,"Cantonese");
        videos.put(video330,"Cantonese");
        videos.put(video331,"Cantonese");
        videos.put(video332,"Cantonese");
        videos.put(video333,"Cantonese");
        videos.put(video334,"Cantonese");
        videos.put(video335,"Cantonese");
        videos.put(video336,"Cantonese");
        videos.put(video337,"Cantonese");
        videos.put(video338,"Cantonese");
        videos.put(video339,"Cantonese");
        videos.put(video340,"Cantonese");
        videos.put(video341,"Cantonese");
        videos.put(video342,"Cantonese");
        videos.put(video343,"Cantonese");


        //Sanghainese 344 to 356
        videos.put(video344,"Sanghainese");
        videos.put(video345,"Sanghainese");
        videos.put(video346,"Sanghainese");
        videos.put(video347,"Sanghainese");
        videos.put(video348,"Sanghainese");
        videos.put(video349,"Sanghainese");
        videos.put(video350,"Sanghainese");
        videos.put(video351,"Sanghainese");
        videos.put(video352,"Sanghainese");
        videos.put(video353,"Sanghainese");
        videos.put(video354,"Sanghainese");
        videos.put(video355,"Sanghainese");
        videos.put(video356,"Sanghainese");


        //Thai 357 to 371

        videos.put(video357,"Thai");
        videos.put(video358,"Thai");
        videos.put(video359,"Thai");
        videos.put(video360,"Thai");
        videos.put(video361,"Thai");
        videos.put(video362,"Thai");
        videos.put(video363,"Thai");
        videos.put(video364,"Thai");
        videos.put(video365,"Thai");
        videos.put(video366,"Thai");
        videos.put(video367,"Thai");
        videos.put(video368,"Thai");
        videos.put(video369,"Thai");
        videos.put(video370,"Thai");
        videos.put(video371,"Thai");


        //Laotian 372 to 386
        videos.put(video372,"Laotian");
        videos.put(video373,"Laotian");
        videos.put(video374,"Laotian");
        videos.put(video375,"Laotian");
        videos.put(video376,"Laotian");
        videos.put(video377,"Laotian");
        videos.put(video378,"Laotian");
        videos.put(video379,"Laotian");
        videos.put(video380,"Laotian");
        videos.put(video381,"Laotian");
        videos.put(video382,"Laotian");
        videos.put(video383,"Laotian");
        videos.put(video384,"Laotian");
        videos.put(video385,"Laotian");
        videos.put(video386,"Laotian");


        //Persian 387 to 401

        videos.put(video387,"Persian");
        videos.put(video388,"Persian");
        videos.put(video389,"Persian");
        videos.put(video390,"Persian");
        videos.put(video391,"Persian");
        videos.put(video392,"Persian");
        videos.put(video393,"Persian");
        videos.put(video394,"Persian");
        videos.put(video395,"Persian");
        videos.put(video396,"Persian");
        videos.put(video397,"Persian");
        videos.put(video398,"Persian");
        videos.put(video399,"Persian");
        videos.put(video400,"Persian");
        videos.put(video401,"Persian");

        //Turkmen 402 to 416
        videos.put(video402,"Turkmen");
        videos.put(video403,"Turkmen");
        videos.put(video404,"Turkmen");
        videos.put(video405,"Turkmen");
        videos.put(video406,"Turkmen");
        videos.put(video407,"Turkmen");
        videos.put(video408,"Turkmen");
        videos.put(video409,"Turkmen");
        videos.put(video410,"Turkmen");
        videos.put(video411,"Turkmen");
        videos.put(video412,"Turkmen");
        videos.put(video413,"Turkmen");
        videos.put(video414,"Turkmen");
        videos.put(video415,"Turkmen");
        videos.put(video416,"Turkmen");


        //Kazakh 417 to 431

        videos.put(video417,"Kazakh");
        videos.put(video418,"Kazakh");
        videos.put(video419,"Kazakh");
        videos.put(video420,"Kazakh");
        videos.put(video421,"Kazakh");
        videos.put(video422,"Kazakh");
        videos.put(video423,"Kazakh");
        videos.put(video424,"Kazakh");
        videos.put(video425,"Kazakh");
        videos.put(video426,"Kazakh");
        videos.put(video427,"Kazakh");
        videos.put(video428,"Kazakh");
        videos.put(video429,"Kazakh");
        videos.put(video430,"Kazakh");
        videos.put(video431,"Kazakh");


        //Arabic 432 to 446

        videos.put(video432,"Arabic");
        videos.put(video433,"Arabic");
        videos.put(video434,"Arabic");
        videos.put(video435,"Arabic");
        videos.put(video436,"Arabic");
        videos.put(video437,"Arabic");
        videos.put(video438,"Arabic");
        videos.put(video439,"Arabic");
        videos.put(video440,"Arabic");
        videos.put(video441,"Arabic");
        videos.put(video442,"Arabic");
        videos.put(video443,"Arabic");
        videos.put(video444,"Arabic");
        videos.put(video445,"Arabic");
        videos.put(video446,"Arabic");

        //Amharic 447 to 461
        videos.put(video447,"Amharic");
        videos.put(video448,"Amharic");
        videos.put(video449,"Amharic");
        videos.put(video450,"Amharic");
        videos.put(video451,"Amharic");
        videos.put(video452,"Amharic");
        videos.put(video453,"Amharic");
        videos.put(video454,"Amharic");
        videos.put(video455,"Amharic");
        videos.put(video456,"Amharic");
        videos.put(video457,"Amharic");
        videos.put(video458,"Amharic");
        videos.put(video459,"Amharic");
        videos.put(video460,"Amharic");
        videos.put(video461,"Amharic");
        videos.put("VsrL9Rz-A5A", "Amharic");
        videos.put("rRC6C8bRkQQ", "Amharic");
        videos.put("-GoUKBHIKu4", "Amharic");


        //Hebrew 462 to 476
        videos.put(video462,"Hebrew");
        videos.put(video463,"Hebrew");
        videos.put(video464,"Hebrew");
        videos.put(video465,"Hebrew");
        videos.put(video466,"Hebrew");
        videos.put(video467,"Hebrew");
        videos.put(video468,"Hebrew");
        videos.put(video469,"Hebrew");
        videos.put(video470,"Hebrew");
        videos.put(video471,"Hebrew");
        videos.put(video472,"Hebrew");
        videos.put(video473,"Hebrew");
        videos.put(video474,"Hebrew");
        videos.put(video475,"Hebrew");
        videos.put(video476,"Hebrew");


        //Azerbaijani 477 to 491

        videos.put(video477,"Azerbaijani");
        videos.put(video478,"Azerbaijani");
        videos.put(video479,"Azerbaijani");
        videos.put(video480,"Azerbaijani");
        videos.put(video481,"Azerbaijani");
        videos.put(video482,"Azerbaijani");
        videos.put(video483,"Azerbaijani");
        videos.put(video484,"Azerbaijani");
        videos.put(video485,"Azerbaijani");
        videos.put(video486,"Azerbaijani");
        videos.put(video487,"Azerbaijani");
        videos.put(video488,"Azerbaijani");
        videos.put(video489,"Azerbaijani");
        videos.put(video490,"Azerbaijani");
        videos.put(video491,"Azerbaijani");


        //Greek songs
        videos.put("g36aAJAN5yg","Greek");
        videos.put("SoGdeg2K81c","Greek");
        videos.put("_sNzoHd2GnE","Greek");
        videos.put("umzN2ujyARY","Greek");
        videos.put("zg3JB07HV3k","Greek");
        videos.put("Fr3CUyz2sVs","Greek");
        videos.put("niqrjP1VDeY","Greek");
        videos.put("-5pDGH9ktNo","Greek");
        videos.put("fysw1kQKw_w","Greek");
        videos.put("MKY7IK8heQk","Greek");
        videos.put("jW5z-rZEQVI","Greek");
        videos.put("daGLoE-6oB8","Greek");
        videos.put("TICiufr2IEU","Greek");
        videos.put("c0l5eFgUoqc","Greek");
        videos.put("WCMTYQxbppk","Greek");

        //Portuguese songs
        videos.put("tdcK5D-SClk","Portuguese");
        videos.put("wk4HK6f3ibk","Portuguese");
        videos.put("o4QkUh1Lpso","Portuguese");
        videos.put("Qxv9s3PTIzY","Portuguese");
        videos.put("l_fNv8k5ZnA","Portuguese");
        videos.put("3cTiDTedAkk","Portuguese");
        videos.put("D-q3jaELQeo","Portuguese");
        videos.put("__iql3TRlhw","Portuguese");
        videos.put("KpFEn24TyuA","Portuguese");
        videos.put("u_pTxVY3s60","Portuguese");
        videos.put("bzhLamrxacE","Portuguese");
        videos.put("3-uPAP30NuU","Portuguese");
        videos.put("Q86lCtj1BYs","Portuguese");
        videos.put("iiwEwbxXN74","Portuguese");
        videos.put("OpdlQTOMzeM","Portuguese");
        videos.put("V2vGc2GsH-A","Portuguese");

        //Uzbek songs
        videos.put("dA_V22Bk5_g","Uzbek");
        videos.put("dnBUJJ7RUIs","Uzbek");
        videos.put("0Yzit7B4Eck","Uzbek");
        videos.put("gehDc1sJh5M","Uzbek");
        videos.put("c_uaA5wUbig","Uzbek");
        videos.put("C4vq7JK7pxs","Uzbek");
        videos.put("XZacpp38fBQ","Uzbek");
        videos.put("o_9jOI89gW4","Uzbek");
        videos.put("YDqt4NmpurE","Uzbek");
        videos.put("jykarC07Cbs","Uzbek");
        videos.put("IdEr8xTCL4E","Uzbek");
        videos.put("OrfK6R8hgsI","Uzbek");
        videos.put("5Bkeil0ejP8","Uzbek");
        videos.put("ectM1UkKNuw","Uzbek");
        videos.put("cM0L1EpOyP8","Uzbek");

        //Tajik songs
        videos.put("jd1jUOCU428","Tajik");
        videos.put("kxbwfrtN3DE","Tajik");
        videos.put("4T9a9Jfuu8U","Tajik");
        videos.put("Zhimvhxk9dA","Tajik");
        videos.put("Ot4sJo-zte4","Tajik");
        videos.put("w6KESF6OACA","Tajik");
        videos.put("33_oTItuCn0","Tajik");
        videos.put("6dnQwPIH-Wo","Tajik");
        videos.put("BUOp9K3ulT4","Tajik");
        videos.put("w3m5tSThEmc","Tajik");
        videos.put("LreiGotE0tE","Tajik");
        videos.put("W5GDH4lc5no","Tajik");
        videos.put("M5Ux7vF2BSM","Tajik");
        videos.put("AfJsiMK6rUQ","Tajik");

        //Basque songs
        videos.put("CFQ_gcNHu7c","Basque");
        videos.put("LRaeakNECr8","Basque");
        videos.put("0wc-_ClMNGs","Basque");
        videos.put("c88TBQKiImg","Basque");
        videos.put("f1BQsyitRDE","Basque");
        videos.put("mnBK1CFGDrU","Basque");
        videos.put("3HnIpcAoEUQ","Basque");
        videos.put("Ej2XLHbfF-s","Basque");
        videos.put("kG0kC83qfR8","Basque");
        videos.put("lqb-rvrWYZo","Basque");
        videos.put("0j_nv0Z6BFk","Basque");
        videos.put("nJQmOx3RxDw","Basque");
        videos.put("SRCeAGf-4-A","Basque");
        videos.put("pHIxYlmAQAs","Basque");
        videos.put("gHcllrUYqs8","Basque");

        //Sicilian songs
        videos.put("dvV8TaLOV-Y","Sicilian");
        videos.put("oNpxosJFbfw","Sicilian");
        videos.put("sqFncGFhKp0","Sicilian");
        videos.put("4cG6pbwx_dw","Sicilian");
        videos.put("JYbTbF2yVYI","Sicilian");
        videos.put("TcmGYF6c9M","Sicilian");
        videos.put("si5Supq4u7w","Sicilian");
        videos.put("gnvLKoSqY3k","Sicilian");
        videos.put("CQh8EG-_OWo","Sicilian");
        videos.put("YJbFtppBy2c","Sicilian");
        videos.put("ErKViyqRWQM","Sicilian");
        videos.put("-xKXmv8rkbA","Sicilian");
        videos.put("RtFAN0_pjXg","Sicilian");
        videos.put("6xZS8YZpnO8","Sicilian");
        videos.put("0oaTOFsbjtk","Sicilian");

        //Occitan songs
        videos.put("Wr2v_s7hvAU","Occitan");
        videos.put("Ym3lcspbr-4","Occitan");
        videos.put("gkmbuzekO8g","Occitan");
        videos.put("cRL_WmBy2Uw","Occitan");
        videos.put("OHz1cLTkpQI","Occitan");
        videos.put("TpR72S21BZU","Occitan");
        videos.put("rpzbtdZjHVc","Occitan");
        videos.put("iTXQ5kmaOx4","Occitan");
        videos.put("l6gT_YSH7oo","Occitan");
        videos.put("nRykQMzNcmE","Occitan");
        videos.put("cIUHL9bWYcE","Occitan");
        videos.put("9dOETzAYEI4","Occitan");
        videos.put("icglGvqqR6A","Occitan");

        //Italian songs
        videos.put("ARqpqyA49y0","Italian");
        videos.put("RELQXv8m_cc","Italian");
        videos.put("UEgwLD5OYAw","Italian");
        videos.put("DoASbjgzQDI","Italian");
        videos.put("FSea1YPxK1c","Italian");
        videos.put("4R5mDpIgwUs","Italian");
        videos.put("7Fmpz-wIkPY","Italian");
        videos.put("4QhyYngmW0I","Italian");
        videos.put("4m_eblAB-fs","Italian");
        videos.put("zO802boBh_M","Italian");
        videos.put("a05CoMDB7Ak","Italian");
        videos.put("eKjMDrHU0HU","Italian");
        videos.put("gPTUbz_uQlI","Italian");
        videos.put("ohwFbV-6-2M","Italian");
        videos.put("ORKJVgdw7Qo","Italian");

        //Galician songs
        videos.put("5iRW95P1LRY","Galician");
        videos.put("7pB0fKhimBI","Galician");
        videos.put("EFHsKPsuMY4","Galician");
        videos.put("5iaUSxCHR1c","Galician");
        videos.put("QroCGJ6oSis","Galician");
        videos.put("Xnx73C7n5xk","Galician");
        videos.put("fZ83671VzbM","Galician");
        videos.put("Fne8OAa19Qg","Galician");
        videos.put("jif6bg-t7bU","Galician");
        videos.put("ItWND7U1FG4","Galician");
        videos.put("EZU3XqtrwG0","Galician");
        videos.put("dI_xTdHKPY8","Galician");
        videos.put("A6XybeZnn5I","Galician");
        videos.put("DviI2zrdtJ0","Galician");

        //Catalan  songs
        videos.put("P5rYVt5e5OM","Catalan");
        videos.put("3LEOkTgs3oo","Catalan");
        videos.put("i_MBNLqkztg","Catalan");
        videos.put("TDZmoOJUMPw","Catalan");
        videos.put("3Uqzy44mxLc","Catalan");
        videos.put("xeha5FAJq38","Catalan");
        videos.put("z_KKamyi_rw","Catalan");
        videos.put("aX4eZ1fpYwA","Catalan");
        videos.put("H3BUfpZuuLg","Catalan");
        videos.put("BeH2eH9iPw4","Catalan");
        videos.put("Z5LVw2abUlw","Catalan");
        videos.put("aYVsvRN6J-w","Catalan");
        videos.put("uFidI51D-ko","Catalan");
        videos.put("MI19iKuNeHg","Catalan");
        videos.put("VL3SUJjIcSI","Catalan");
        videos.put("bqrGpS_Mbp4","Catalan");

        //Neapolitan songs
        videos.put("gfdxy41dUUg","Neapolitan");
        videos.put("Zv_n0X1nkTo","Neapolitan");
        videos.put("AWQcDlHoE4o","Neapolitan");
        videos.put("wwyvwnzD7LY","Neapolitan");
        videos.put("jXfBn3q6fd0","Neapolitan");
        videos.put("j1ewwkIApUE","Neapolitan");
        videos.put("HvmB_3V1u44","Neapolitan");
        videos.put("A4nmmrwvBj8","Neapolitan");
        videos.put("OpLIPTC0uC4","Neapolitan");
        videos.put("zeLb-G8GXfk","Neapolitan");
        videos.put("BNHJ9SPc-Js","Neapolitan");
        videos.put("zRV7RAg5iyA","Neapolitan");
        videos.put("5mc1BAxFbXY","Neapolitan");
        videos.put("0-LKz0H1Te8","Neapolitan");

        //Hakka songs
        videos.put("vCqNyg-5TXY","Hakka");
        videos.put("zVJb4zEYous","Hakka");
        videos.put("73Ctje_SGg4","Hakka");
        videos.put("5QnQBMdEdu8","Hakka");
        videos.put("A-PbyPjIkZg","Hakka");
        videos.put("bhcj5gApSd4","Hakka");
        videos.put("-9S4UWdXo8E","Hakka");
        videos.put("tH-AZNBL63o","Hakka");
        videos.put("5Tl87kZAzwc","Hakka");

    }

    public HashMap<String,String> getVideos(){
        return videos;

    }

    public ArrayList<String> getFamily1(){
        return langFamily1;
    }

    public ArrayList<String> getFamily2(){
        return langFamily2;
    }

    public ArrayList<String> getFamily3(){
        return langFamily3;
    }
    public ArrayList<String> getFamily4(){
        return langFamily4;
    }

    public ArrayList<String> getAllLanguages(){
        return allLanguages;
    }



}
