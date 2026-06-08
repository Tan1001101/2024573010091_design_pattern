package pratikum_6.bagian_2.dengan_LSP;

public class Main {
    public static void sharePost(Publishable post) {
        if (post.canPublish()) {
            post.publish();
            System.out.println("max lenght: " + post.getMaxContentLenght());
        } else {
            System.out.println("tidak bisa publish ini sekarang");
        }
    }

    public static void main(String[] args) {
        Publishable tweet = new TwitterPost("hello twitter");
        Publishable longTweet = new TwitterPost("ini kepanjangan...".repeat(20));
        Publishable blog = new BlogPost("saya rasa ini kode yang bersih");

        System.out.println("memposting tweet yang valid:");
        sharePost(tweet);

        System.out.println("\nmemposting tweet yang tidak valid:");
        sharePost(longTweet);

        System.out.println("\nmemposting blog:");
        sharePost(blog);

        System.out.println("\nmemposting blog sekali lagi");
        sharePost(blog);

        System.out.println("\nmengedit blog yang sudah di publish:");
        ((BlogPost) blog).editContent("Blog diupdate agar lebih rapi");
    }
}
