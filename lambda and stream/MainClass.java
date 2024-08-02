import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
    public static void main(String[] args) {
//        older way
//        walkable obj = new walkfast();
//        System.out.println(obj.walk(5));

//        walkable obj = (steps,  isActive) -> {
//            System.out.println("walking fast " + steps + " steps");
//            return 2*steps;
//        };
//
//        walkable obj2 = (steps,isActive) -> 2*steps;
//        obj.walk(4,  true);

        List<String> fruits = List.of("apple", "mango", "banana");

        Stream<String> stream = fruits.stream();

        Set<Integer> fruitList = fruits
                .stream()
                .map(fruit -> fruit.length())
                .collect(Collectors.toSet());

        System.out.println(fruitList);

//        stream
//                .filter(fruit -> fruit.length() <=5)
//                .sorted()
////                .map(fruit -> fruit.length())
////                .map(fruitLength -> 2*fruitLength)
//                .forEach((fruit) ->{
//            System.out.println(fruit);
//        });

    }
}

interface walkable{
    int walk(int steps, boolean isActive);
}

//class walkfast implements walkable{
//    @Override
//    public int walk (int steps){
//        System.out.println("walking fast " + steps + " steps");
//        return 2*steps;
//    }
//}