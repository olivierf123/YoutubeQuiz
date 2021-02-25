package android.example.youtubequiz;

public class YoutubeConfig {

    public YoutubeConfig() {
    }
    private static final String API_KEY = "AIzaSyCxPx5mjDs8o1vLEU1BOQPL3sBjqYXT5k0";

    public static String getApiKey() {
        return API_KEY;
    }
}


//TODO pour avoir le titre ce request la :
// https://www.googleapis.com/youtube/v3/videos?part=snippet&id={ID DU VIDEO}&fields=items(id%2Csnippet)&key={API_KEY}
// {API KEY} = AIzaSyCI4iw9u8yyHPEAhgDKWQ6gRFFZ0a1KNOE

