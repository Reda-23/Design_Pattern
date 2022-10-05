package Momento_Pattern;

public class Main {


    public static void main(String[] args) {
        var his = new History();
        var item = new Item();

        item.setContent("Driss");
        his.push(item.createItem());
        item.setContent("Reda");
        his.push(item.createItem());
        item.setContent("Hatim");
        his.push(item.createItem());

    }
    
    
}
