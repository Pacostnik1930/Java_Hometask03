import java.util.Collections;
import java.util.ArrayList ;

// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. 

 
public class Task02 { 
    public static void main(String[] args) { 
        ArrayList<Integer> list = new ArrayList<>(); 
        list.add(15); 
        list.add(25); 
        list.add(40); 
        System.out.println("Максимальное число :" + Collections.max(list)); 
        System.out.println("Минимальное число :" + Collections.min(list)); 
        System.out.println(average(list)); 
 
    } 
 
    public static double average(ArrayList<Integer> list) { 
 
        double sum = 0; 
 
        for (int i = 0; i < list.size(); i++) { 
            sum += list.get(i); 
        } 
 
        return sum / list.size(); 
    } 
 
}
