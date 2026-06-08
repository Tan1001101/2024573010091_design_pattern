package pratikum_6.bagian_2.dengan_LSP;

public class TwitterPost implements Publishable{
    private static final int MAX_LENGHT = 200;
    private String content;

    public TwitterPost(String content){
        this.content = content;
    }

    @Override
    public void publish(){
        if(!canPublish()){
            throw new IllegalArgumentException("Tweet melebihi dari " + MAX_LENGHT + "karakter");
        }
        System.out.println("posting tweet: " + content);
    }

    @Override
    public boolean canPublish(){
        return content.length() <= MAX_LENGHT;
    }

    @Override
    public int getMaxContentLenght(){
        return MAX_LENGHT;
    }
}
