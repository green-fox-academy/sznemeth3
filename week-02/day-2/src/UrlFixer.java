public class UrlFixer {
    public static void main(String... args){
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!
        String str = url;
        url = url.substring(0,5) + ":" + url.substring(5,url.length()).replace("bots", "odds");
        str = new StringBuilder(str).insert(5, ":").toString().replace("bots", "odds");
        System.out.println(url);
        System.out.println(str);

    }
}
