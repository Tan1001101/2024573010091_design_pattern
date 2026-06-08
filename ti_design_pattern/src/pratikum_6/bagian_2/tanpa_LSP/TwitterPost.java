package pratikum_6.bagian_2.tanpa_LSP;

public class TwitterPost extends SocialMediaPost{
    public TwitterPost(String content){
        super(content);
    }

    @Override
    public int calculatedMaxCharacter() {
        return 280;
    }

    @Override
    public void publish() {
        if(content.length() > calculatedMaxCharacter()){
            throw new IllegalArgumentException("Tweer melebibi batas karakter!");
        }
        System.out.println("Posting Tweet: " + content);
    }
}
