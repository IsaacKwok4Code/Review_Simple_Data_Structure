public class DoublyLinkedList{
   
   private InventoryItem first;
   private int size;
   
   public DoublyLinkedList(){
      first = null;
      size = 0;
   }
   
   public boolean isEmpty(){
      return first == null;   
   }
   
   public void add(InventoryItem item){
      size ++;
      if(!isEmpty()){
         item.setNext(first);
         first.setPrev(item);
      }
      first = item;
   }
   
   public void remove(String n){
   
      InventoryItem temp = first;
      
      while(temp != null){
         
         if(temp.getName().equals(n)){
            //found match. set prev's next to temp's next
            if(temp.getPrev() == null){
               //object we're removing is at the front
               first = first.getNext();
               first.setPrev(null);
            }else{
               temp.getPrev().setNext( temp.getNext() );
               if(temp.getNext() != null){
                  temp.getNext().setPrev( temp.getPrev() );
               }
            } 
         }
         temp = temp.getNext();
      }
   }
   
   public InventoryItem find (String n){
   
      InventoryItem temp = first;
      while(temp != null){
         if(temp.getName().equals(n)){
            //found a match
            return temp;
         }else{
            temp = temp.getNext();
         }
      }
      System.out.println("Didn't find it");
      return null;
   }
}