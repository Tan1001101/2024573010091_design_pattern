package pratikum_6.bagian_2.tanpa_LSP;

public class BlogSpot extends SocialMediaPost{
    private boolean isDraft;

    public BlogSpot(String content){
        super(content);
    }

    @Override
    public void publish(){
        if(!isDraft){
            throw new IllegalArgumentException("Blog ini sudah dipublish");
        }
        isDraft = false;
        super.publish();
    }

    public void editContent(String newContent){
        if(!isDraft){
            throw new IllegalArgumentException("Blog yang sudah dipublish tidak bisa diedit!");
        }
        this.content = newContent;
    }
}
