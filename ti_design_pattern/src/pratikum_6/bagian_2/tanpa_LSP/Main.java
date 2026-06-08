package pratikum_6.bagian_2.tanpa_LSP;

public class Main {
    public static void sharePost(SocialMediaPost post){
        try{
            post.publish();
            System.out.println("maksimum karakter: " + post.calculatedMaxCharacter());
        } catch (Exception e){
            System.out.println("Gagal membagi: " + e.getMessage());
        }
    }

    public static void main(String[] args){
        SocialMediaPost tweet = new TwitterPost("Hallo Twitter");
        SocialMediaPost longTweet = new TwitterPost("Tweet ini sangat panjang dan melebihi batas karakter....".repeat(10));
        SocialMediaPost blog = new BlogSpot("Modul 6 - Liskov Subtitution Principle");

        System.out.println("memposting tweet yang valid:");
        sharePost(tweet);

        System.out.println("\nmemposting tweet yang tidak valid:");
        sharePost(longTweet);

        System.out.println("\nmemposting blog:");
        sharePost(blog);

        System.out.println("\nmemposting blog sekali lagi");
        sharePost(blog);
    }
}

