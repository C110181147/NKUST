import org.jsoup.Jsoup;
import org.json.*;

import java.net.MalformedURLException;
import java.net.URL;


/**
 * https://medium.com/%E5%BD%BC%E5%BE%97%E6%BD%98%E7%9A%84-swift-ios-app-%E9%96%8B%E7%99%BC%E5%95%8F%E9%A1%8C%E8%A7%A3%E7%AD%94%E9%9B%86/%E7%AC%AC%E4%B8%89%E6%96%B9-api-%E6%95%B4%E7%90%86-115868a56959
 * https://apilist.fun/
 * https://any-api.com/
 * https://rapidapi.com/hub
 * https://blog.jiatool.com/posts/dcard_api_v2/
 * https://www.postman.com/explore
 */


public class APICrawler {
    public static void main(String[] args) throws MalformedURLException {

        String[] apple = new String[3];
        String[] banana = new String[9];
        String[] cat = new String[9];
        String[] dog = new String[3];
        String[] element = new String[3];
        try {
            String youtubeSearch = "阿神";
            String json = Jsoup.connect("https://www.googleapis.com/youtube/v3/search?part=snippet&q=" + youtubeSearch + "&key=AIzaSyDUKYPZIaz4O3t5dyqClNuppGp3V9m-fPI&type=video&maxResults=3").ignoreContentType(true).execute().body();
            //format json by https://jsoneditoronline.org/
            System.out.println(json);

            JSONObject resObject = new JSONObject(json);
            var Object = resObject.getJSONArray("items");

            for (int i = 0; i < 3; i++) {
                var items = Object.getJSONObject(i);
//                System.out.println(items);
                var id = items.getJSONObject("id");
//                System.out.println(id);
                var videoID = id.getString("videoId");
//                System.out.println(videoID);
                apple[i] = videoID;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
//        for(int i = 0 ; i <3 ; i++){
//        System.out.println(apple[i]);
//        }

        try {
            for (int i = 0; i < 3; i++) {
                String json = Jsoup.connect("https://www.googleapis.com/youtube/v3/commentThreads?part=snippet&key=AIzaSyDUKYPZIaz4O3t5dyqClNuppGp3V9m-fPI&videoId=" + apple[i] + "&maxResults=3&order=relevance&textFormat=plainText ").ignoreContentType(true).execute().body();
//          System.out.println(json);

                JSONObject Object = new JSONObject(json);
                var items = Object.getJSONArray("items");
//            System.out.println(items);
                for (int j = 0; j < 3; j++) {
                    var array = items.getJSONObject(j);
//                    System.out.println(array);
                    var snippet = array.getJSONObject("snippet");
//                    System.out.println(snippet);
                    var topLevelComment = snippet.getJSONObject("topLevelComment");
//                    System.out.println(topLevelComment);
                    var snippet2 = topLevelComment.getJSONObject("snippet");
//                    System.out.println(snippet2);

                    var Comment = snippet2.getString("textDisplay");
//                    System.out.println(Comment);
                    banana[j] = Comment;
                    var commentTime = snippet2.getString("publishedAt");
//                    System.out.println(commentTime);
                    cat[j] = commentTime;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }


        try {
            for (int i = 0; i < 3; i++){
//                System.out.println(apple[i]);
                String json = Jsoup.connect("https://www.googleapis.com/youtube/v3/videos?part=snippet&key=AIzaSyDUKYPZIaz4O3t5dyqClNuppGp3V9m-fPI&id=" + apple[i] + "&maxResults=3").ignoreContentType(true).execute().body();
//                  System.out.println(json);

                JSONObject Object = new JSONObject(json);
                var items = Object.getJSONArray("items");
//                System.out.println(items);
                var array = items.getJSONObject(0);
//              System.out.println(array);
                var snippet = array.getJSONObject("snippet");
//                   System.out.println(snippet);
                var publishedAt = snippet.getString("publishedAt");
//                  System.out.println(publishedAt);
                dog[i] = publishedAt;
                var title = snippet.getString("title");
                System.out.println(title);
                element[i]=title;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

//        for(int i = 0 ; i <3 ; i++){
//        System.out.println(element[i]);
//        }

        for (int i = 0; i < 3; i++) {
            URL channel = new URL("https://www.youtube.com/watch?v="+apple[i]);
            System.out.println("網址:"+channel);
            System.out.println("標題:"+element[i]);
            System.out.println("發布時間:"+dog[i]);
            for(int j=0;j<3;j++) {
                System.out.println("評論" + j + ":" + banana[i + j]);
                System.out.println("留言時間:" + cat[i + j]);
            }
            System.out.println("--------------------------------------------");
        }
    }
}



