import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] arrInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] arrStr = {"A", "B", "C", "D", "E", "G", "H"};

        System.out.println("Создаем массив из чисел: " + Arrays.toString(arrInt));
        System.out.println("Создаем массив из строк: " + Arrays.toString(arrStr));


        changeIndexValue(arrInt, 3, 6);
        System.out.println("Реализуем метод, который меняет местами 2 (два) выбранных элемента массива из чисел " + Arrays.toString(arrInt));
        changeIndexValue(arrStr, 0, 5);
        System.out.println("Реализуем метод, который меняет местами 2 (два) выбранных элемента массива из строк " + Arrays.toString(arrStr));

        System.out.println("Реализуем метод, который преобразует массив в ArrayList " + arrToArrayList(arrInt));
        System.out.println("Реализуем метод, который преобразует массив в ArrayList " + arrToArrayList(arrStr));


        System.out.println("\nЗадача с фруктами:");
        Apple apple = new Apple();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange = new Orange();
        Orange orange1 = new Orange();

        Box<Orange> orangeBox = new Box<>(orange);
        orangeBox.addFruitInBox(orange1);

        Box<Apple> appleBox1 = new Box<>(apple);
        Box<Apple> appleBox2 = new Box<>(apple1, apple2, apple3);

        System.out.println(appleBox1.getFruit());
        System.out.println(appleBox2.getFruit());
        System.out.println(orangeBox.getFruit());

        System.out.println(appleBox1.getWeightBox());
        System.out.println(appleBox2.getWeightBox());
        System.out.println(orangeBox.getWeightBox());

        System.out.println(orangeBox.compare(appleBox2));

        appleBox1.getEmpty(appleBox2);

        System.out.println(appleBox1.getWeightBox());
        System.out.println(appleBox2.getWeightBox());

        System.out.println(appleBox1.getFruit());
        System.out.println(appleBox2.getFruit());

        System.out.println(appleBox2.compare(orangeBox));
    }

// Метод, который меняет местами 2 (два) выбранных элемента массива любого ссылочного типа:
    public static void changeIndexValue(Object[] arr, int firstIndex, int secondIndex) {
        Object a = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = a;
    }

// Метод, который преобразует массив в ArrayList:
    public static <T> ArrayList arrToArrayList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }
}
