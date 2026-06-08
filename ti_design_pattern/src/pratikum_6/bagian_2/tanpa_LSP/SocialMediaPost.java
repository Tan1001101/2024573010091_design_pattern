package pratikum_6.bagian_2.tanpa_LSP;

public class SocialMediaPost {
    protected String content;

    public SocialMediaPost(String content){
        this.content = content;
    }

    public void publish(){
        System.out.println("Publishing post " + content);
    }

    public int calculatedMaxCharacter(){
        return 1000;
    }
}
