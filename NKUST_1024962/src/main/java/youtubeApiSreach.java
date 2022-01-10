//import org.jsoup.Jsoup;
//import org.json.*;
//
//
//public class youtubeApiSreach {
//    public static void main(String[] args) {
//
//
//        try {
//            String youtubeSearch = "巧克力";
//            String json = Jsoup.connect("https://www.googleapis.com/youtube/v3/videos?part=snippet,contentDetails,statistics,status&key=AIzaSyDUKYPZIaz4O3t5dyqClNuppGp3V9m-fPI&maxResults=3&id=EgS4A0YsIaY").ignoreContentType(true).execute().body();
//            //format json by https://jsoneditoronline.org/
//            System.out.println(json);
//
//            JSONObject resObject = new JSONObject(json);
//            var Object = resObject.getJSONArray("items");
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}