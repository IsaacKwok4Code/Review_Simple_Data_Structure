public class InventoryItem{
   
   private String name;
   private int quantity;
   private InventoryItem next, prev;
   
   public InventoryItem(String n, int q){
      name = n;
      quantity = q;
      next = null;
      prev = null;
   }
   
   public void setNext(InventoryItem item){
      next = item;
   }
   public void setPrev(InventoryItem item){
      prev = item;
   }
   public InventoryItem getNext(){
      return next;
   }
   public InventoryItem getPrev(){
      return prev;
   }
   
   public String getName(){
      return name;
   }
   
   public String toString(){
      return "Name: " + name + "\nQuantity: " + quantity;
   }

}