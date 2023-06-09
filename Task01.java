// 1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого) 

import java.util.ArrayList; 
import java.util.Arrays; 
import java.util.List; 
import java.util.Map; 
import java.util.stream.Collectors; 
 
public class Task01{ 
    public static void main(String[] args){ 
        showMap(); 
        remove(); 
    } 
    public static void showMap() { 
        List <Integer> ourList = Arrays.asList(1, 2, 3, 4, 5); 
        Map <Boolean, List<Integer>> map = ourList.stream() 
        .collect(Collectors.partitioningBy(e -> e % 2 == 1)); 
 
System.out.println(map); 
List<Integer> newlist = map.get(map.get(false).size() % 2 == 0); 
 
List<List<Integer>> lists = new ArrayList<>(map.values()); 
 
System.out.println("Список с чётными значениями который удаляем " + lists.get(0)); 
System.out.println("Список с нечётными значениями который возвращаем " + lists.get(1)); 
System.out.println(newlist); 
 
} 
public static void remove(){ 
List<Integer> ourList_ = Arrays.asList(1, 2, 3, 4, 5); 
ourList_.removeIf(i -> (i % 2==0)); 
System.out.println(ourList_); 
} 
}