package Momento_Pattern;

import java.util.ArrayList;

import java.util.List;

public class History{

   public List<ItemStates> itemStates = new ArrayList<>();

   public void push(ItemStates itemState){
      itemStates.add(itemState);
   }

   public ItemStates pop(){
      int lastIndex = itemStates.size() -1;
      var lasObj = itemStates.get(lastIndex);
      itemStates.remove(lasObj);

      return lasObj;
   }

    

}