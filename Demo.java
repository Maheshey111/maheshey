import java.util.LinkedList;
public class Demo {

	public static void main(String[] args) {

		 LinkedList<String> list1=new LinkedList<String>();  
         System.out.println("Initial list of elements: "+list1);  
         list1.add("Ravi");   
         list1.add("Ajay");  
         System.out.println("After add  method: "+list1);  
       
         LinkedList<String> list2=new LinkedList<String>();  
         list2.add("John");    
         list2.addAll(1, list1);  
         System.out.println("After  addAlist1 method: "+list1);  
         list1.addFirst("Lokesh");  
         System.out.println("After  addFirst method: "+list1);  
         list1.addLast("Harsh");  
         System.out.println("After  addLast method: "+list1);  
         list1.removeFirst();
         System.out.println("After removing First"+list1);
	}

}
