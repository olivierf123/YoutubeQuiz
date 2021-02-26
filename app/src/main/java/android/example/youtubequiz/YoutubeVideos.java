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
    private String video151= "kbXvPs5ql68";
    private String video151= "nqE8Um9t8CU";
    private String video151= "_p1D63vj0ss";
    private String video151= "HInYeg78sMU";
    private String video151= "W_eepOSos88";
    private String video151= "g2yzdDAZBLI";
    private String video151= "hvkShLKfl54";
    private String video151= "MDO6BZs6o-k";
    private String video151= "aOXw9Vfz14I";
    private String video151= "uwh2WXbqilk";
    private String video151= "DmkM2QD8750";
    private String video151= "1JWP464tYY4";
    private String video151= "7U5ZUP36deI";
    private String video151= "nJa1t5DfAN4";
    private String video151= "Oyaa3kzfMpU";
    private String video152 = "xfcDvOzU6pQ";

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
    private String video200 = "wOBnq0Ewz5k";
    private String video201 = "m-el0pQLQE4";
    private String video202 = "Bx8Fo7WRpXg";
    private String video203 = "CMBmJ93Jqqg";
    private String video204 = "3pEsU-KYfGU";
    private String video205 = "6AsK2vGsL5Y";
    private String video206 = "ueYhI-bo-70";
    private String video207 = "sW4srCj0bvY";
    private String video208 = "jAZt6-dN4SA";
    private String video209 = "aqsgyOhrRMY";
    private String video210 = "3bY_WY4pTBE";
    private String video211 = "d4li3Bk95Co";
    private String video212 = "6BTmk4i5Vl0";

    //Bulgarian songs
    private String video213 = "3vB4gpXVtIs";
    private String video214 = "8-9aQ6eSPS8";
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
    //private String video235 = "wsl-KHGe4Kk"; pas de parole
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
    private String video244 = "7mKnLVqDCIM";
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

        //Ukranien Songs
        for (int i=48; i<=63; i++){
            videos.put("video" + i, "Ukranien" );
        }

        //Danish songs 64 to 79
        for (int i=64; i<=79; i++){
            videos.put("video" + i, "Danish" );
        }

        //Turkish songs 80 to 94
        for (int i=80; i<=94; i++){
            videos.put("video" + i, "Turkish" );
        }

        //Romanian 95 to 108
        for (int i=95; i<=108; i++){
            videos.put("video" + i, "Romanian" );
        }

    }

    public HashMap<String,String> getVideos(){
        return videos;

    }



}
