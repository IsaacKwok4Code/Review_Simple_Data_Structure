import java.util.ArrayList;

public class Store{
   public static void main(String[] args){
   
      DoublyLinkedList inventory = new DoublyLinkedList();

      inventory.add(new InventoryItem("Ladders", 5));      
      inventory.add(new InventoryItem("Hammers", 50));
      inventory.add(new InventoryItem("Nails", 500));
      inventory.add(new InventoryItem("Washers", 500));
      inventory.add(new InventoryItem("Duct Tape", 500));
      inventory.add(new InventoryItem("Screws", 30));
    
      inventory.remove("Duct Tape");
      inventory.remove("Nails");
   }
}