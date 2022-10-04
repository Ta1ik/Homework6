public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
    }
    public static void Task1(){
        System.out.println("\n" + "Задача 1");
        /*
        С помощью цикла for выведите в консоль все числа от 1 до 10.
         */
        for (int a = 1; a <= 10; a++) // Увеличиваем значение "a" для следующего шага на 1
        System.out.print(" " + a); //выводим a в строку
    }
    public static void Task2(){
        System.out.println("\n" + "Задача 2");
        /*
        С помощью цикла for выведите в консоль все числа от 10 до 1.
         */
        for (int b = 10; b >= 1; b--) // Уменьшаем значение "b" для следующего шага на 1
        System.out.print(" " + b); //выводим b в строку
    }
    public static void Task3(){
        System.out.println("\n" + "Задача 3");
        /*
        Выведите в консоль все четные числа от 0 до 17.
         */
        for (int a = 0; a <= 17; a += 2) // Считаем все четные числа
        System.out.print(" " + a); //выводим a
    }
    public static void Task4(){
        System.out.println("\n" + "Задача 4");
        /*
        Выведите в консоль все числа от 10 до - 10 от большего числа к меньшему.
         */
        for (int a = 10; a >= -10; a--) // Считаем все четные числа
        System.out.print(" " + a); //выводим a
    }


}