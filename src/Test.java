import products.Products;
import products.Recipe;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Иванов Иван", "891235235252");
        Person person2 = new Person("Петров Иван", "891235235252");
        Person person3 = new Person("Сидоров Иван", "891235235252");
        Person person4 = new Person("Богданов> Иван", "891235235252");
        Person person5 = new Person("Огневой Иван", "891235235252");
        Person person6 = new Person("Корин Иван", "891235235252");
        Person person7 = new Person("Немыгин Иван", "891235235252");
        Person person8 = new Person("Левишин Иван", "891235235252");
        Person person9 = new Person("Котов Иван", "891235235252");
        Person person10 = new Person("Котрус Иван", "891235235252");
        Person person11 = new Person("Лебедев Иван", "891235235252");
        Person person12 = new Person("Смирнов Иван", "891235235252");
        Person person13 = new Person("Тетюев Иван", "891235235252");
        Person person14 = new Person("Хейфец Иван", "891235235252");
        Person person15 = new Person("Львов Иван", "891235235252");
        Person person16 = new Person("Тихонов Иван", "891235235252");
        Person person17 = new Person("Попов Иван", "891235235252");
        Person person18 = new Person("Морев Иван", "891235235252");
        Person person19 = new Person("Варданян Иван", "891235235252");
        Person person20 = new Person("Синицин Иван", "891235235252");

        HashMap<String, String> listOfNumbers = new HashMap<>();

        listOfNumbers.put(person1.getNameAndSurname(), person1.getNumber());
        listOfNumbers.put(person2.getNameAndSurname(), person2.getNumber());
        listOfNumbers.put(person3.getNameAndSurname(), person3.getNumber());
        listOfNumbers.put(person4.getNameAndSurname(), person4.getNumber());
        listOfNumbers.put(person5.getNameAndSurname(), person5.getNumber());
        listOfNumbers.put(person6.getNameAndSurname(), person6.getNumber());
        listOfNumbers.put(person7.getNameAndSurname(), person7.getNumber());
        listOfNumbers.put(person8.getNameAndSurname(), person8.getNumber());
        listOfNumbers.put(person9.getNameAndSurname(), person9.getNumber());
        listOfNumbers.put(person10.getNameAndSurname(), person10.getNumber());
        listOfNumbers.put(person11.getNameAndSurname(), person11.getNumber());
        listOfNumbers.put(person12.getNameAndSurname(), person12.getNumber());
        listOfNumbers.put(person13.getNameAndSurname(), person13.getNumber());
        listOfNumbers.put(person14.getNameAndSurname(), person14.getNumber());
        listOfNumbers.put(person15.getNameAndSurname(), person15.getNumber());
        listOfNumbers.put(person16.getNameAndSurname(), person16.getNumber());
        listOfNumbers.put(person17.getNameAndSurname(), person17.getNumber());
        listOfNumbers.put(person18.getNameAndSurname(), person18.getNumber());
        listOfNumbers.put(person19.getNameAndSurname(), person19.getNumber());
        listOfNumbers.put(person20.getNameAndSurname(), person20.getNumber());

        System.out.println(listOfNumbers);

        System.out.println("==========================================================");

        Products banana = new Products("Банан", 2, 2);
        Products apple = new Products("Яблоко", 2, 2);
        Products orange = new Products("Апельсин", 2, 2);

        Recipe salad = new Recipe("Салат");

        salad.addProductInRecipe(apple, 0);
        salad.addProductInRecipe(banana, 2);
        salad.addProductInRecipe(orange, 0);

        System.out.println(salad);

        System.out.println("==========================================================");

        Task3 task3 = new Task3();
        task3.add("Один", 1);
        System.out.println(task3.taskMap);
        task3.add("Один", 13);
        System.out.println(task3.taskMap);

        System.out.println("==========================================================");

        Map<String, List<Integer>> map = new HashMap<>();
        map.put("String1", List.of(123, 132, 412));
        map.put("String2", List.of(321, 434, 12));
        map.put("String3", List.of(921, 421, 764));
        map.put("String4", List.of(472, 742, 146));
        map.put("String5", List.of(632, 931, 843));


        Map<String, Integer> map1 = new HashMap<>();
        for (Map.Entry<String, List<Integer>> stringListEntry : map.entrySet()) {
            map1.put(stringListEntry.getKey(), sumElem(stringListEntry.getValue()));
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : map1.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " : " + stringIntegerEntry.getValue());
        }

        System.out.println("==========================================================");

        Map<Integer, String> map2 = new LinkedHashMap<>();
        int capacity = 10;
        for (int i = 0; i < capacity; i++) {
            map2.put((int) (Math.random() * 100), "string " + i);
        }
        System.out.println(map2);
    }

    public static Integer sumElem(List<Integer> list) {
        Integer sum = 0;
        for (Integer element : list) {
            sum += element;
        }
        return sum;
    }
}
