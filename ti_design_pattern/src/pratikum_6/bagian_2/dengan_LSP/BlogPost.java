package pratikum_6.bagian_2.dengan_LSP;

public class BlogPost implements Publishable{
        private String content;
        private boolean isPublished;

        public BlogPost(String content){
            this.content = content;
        }

    @Override
    public void publish() {
        if(isPublished){
            return;
        }
        isPublished = true;
        System.out.println("publishing blog: " + content);
    }

    @Override
    public boolean canPublish() {
        return !isPublished;
    }

    @Override
    public int getMaxContentLenght(){
            return Integer.MAX_VALUE;
    }

    public void editContent(String newContent){
            if(isPublished){
                System.out.println("menambah update untuk blog yang sudah dipublish");
            }
            this.content = newContent;
    }
}
