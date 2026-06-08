package pratikum_6.bagian_2.dengan_LSP;

public class SocialPost implements Publishable{
    protected String content;

    public SocialPost(String content){
        this.content = content;
    }

    @Override
    public void publish(){
        System.out.println("publishing: " + content);
    }

    @Override
    public boolean canPublish(){
        return content.length() <= getMaxContentLenght();
    }

    @Override
    public int getMaxContentLenght(){
        return 1000;
    }
}
