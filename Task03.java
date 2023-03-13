import java.util.ArrayList; 
import java.util.Iterator; 
 
 public class Task03{ 
    public static void main(String[] args){
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Hello"); 
        myList.add("Seminar"); 
        myList.add(String.valueOf(1)); //valueOf возвращает строковое представление аргумента 
        myList.add(String.valueOf(3)); 
 
        System.out.println("Первичный список " + myList); 
        Iterator<String> iterator = myList.iterator(); 
        while (iterator.hasNext()) { 
            if (iterator.next().matches("-?\\d+(\\.\\d+)?$")) { 
                iterator.remove(); 
            } 
        } 
        System.out.println(myList); 
    } 
} 
