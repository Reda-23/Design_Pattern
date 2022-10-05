package Momento_Pattern;

public class Item {
    private String content;

    public ItemStates createItem(){
        return new ItemStates(content);
    }

    public void restore(ItemStates states){
        content = states.getContent();
    }



    public String getContent() {
        return content;
    }

    public void setContent(String Content){
                this.content = content;
    }
    


    
    
}
