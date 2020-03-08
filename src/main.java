import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // тесты
         drawRectangle_recursion(6,4);
        // printFromOneToX_recursion(5);
        divider(58,'=');System.out.println("\n");
        divider(10,' ');System.out.println("Вас приветствует программа GoJavaTask4\n");
        Scanner scan = new Scanner(System.in);
        String input = new String();
        boolean run = true;
        while(run){
            programControl();
            input=scan.nextLine();
            switch (input){
                case "1":
                while (true){
                    System.out.println("Введите число до которого от 1 программа выведет все числа");
                    input=scan.nextLine();
                    if(input.equals("back"))
                        break;
                       try{
                            int number = Integer.parseInt(input);
                            printFromOneToX(number);
                        }
                       catch(Exception e){
                        System.out.println("Некорректный ввод");
                       }
                    }
                    break;
                case "2":
                    while(true) {
                        System.out.println("Введите два числа, где первое - длина прямоугольника в символах,\nвторое - высота прямоугольника в символах,");
                        printInfoBack();
                        input = scan.nextLine();
                        if(input.equals("back"))
                            break;
                        try {
                            input=input.replaceAll("[^0-9]", ",");
                            input=input.replaceAll(",,", ",");
                            String strArr[] = input.split(",");
                            drawRectangle(Integer.parseInt(strArr[0]),Integer.parseInt(strArr[1]));
                        } catch (Exception e) {
                            System.out.println("Некорректный ввод");
                        }
                    }
                    break;
                case "3":
                    while(true) {
                        System.out.println("");
                        printInfoBack();
                        input = scan.nextLine();
                        if (input.equals("back"))
                            break;
                        try {
                            drawRectangle(Integer.parseInt(input));
                        }catch(Exception e) {
                            System.out.println("Некорректный ввод");
                        }
                    }
                    break;
                case "4":
                    break;
                case "5":
                    while(true) {
                        System.out.println("Введите число до которого от 1 программа выведет все числа,");
                        printInfoBack();
                        input = scan.nextLine();
                        if (input.equals("back"))
                            break;
                        try {
                            int number = Integer.parseInt(input);
                            printFromOneToX_recursion(number);
                        } catch (Exception e) {
                            System.out.println("Некорректный ввод");
                        }
                    }
                    break;
                case "6":
                    while(true) {
                        System.out.println("Введите два числа, где первое - длина прямоугольника в символах,\nвторое - высота прямоугольника в символах,");
                        printInfoBack();
                        input = scan.nextLine();
                        if(input.equals("back"))
                            break;
                        try {
                            input=input.replaceAll("[^0-9]", ",");
                            input=input.replaceAll(",,", ",");
                            String strArr[] = input.split(",");
                            drawRectangle_recursion(Integer.parseInt(strArr[0]),Integer.parseInt(strArr[1]));
                        } catch (Exception e) {
                            System.out.println("Некорректный ввод");
                        }
                    }
                    break;
                case "leave":
                    System.out.println("точно? yes - да, no - нет");
                    input=scan.nextLine();
                    if(input=="yes"){
                        run=false;
                    }
                    break;
            }

        }
    }
    //задание №1
    public static void printFromOneToX(int X){
        for(int i=1;i<=X;i++)
            System.out.println(i);
    }
    //задание №2
    public static void drawRectangle (int x,int y){
        if(x==0||y==0)
            System.out.println("Прямоугольник не может быть тоньше 1 символа в любом направлении");
        else {
            for(int i=0;i<y;i++) {
                for (int k = 0; k < x; k++)
                    System.out.print("+");
                System.out.println();
            }
        }
    }
    //задание №3
    public static void drawRectangle (int x){
        for (int i=0;i<x;i++){
            for(int k=0;k<x;k++)
                System.out.print("+");
            System.out.println();
        }
    }
    //задание №4
    public static int getMax(int a, int b){
        return a>b?a:b;
    }
    //перегрузка функции для вещественных
    public static double getMax(double a, double b){
        return a>b?a:b;
    }
    //задание №5
    public static void printFromOneToX_recursion (int X){
        if(X>0) {
            printFromOneToX_recursion(X - 1);
            System.out.println(X);
        }
    }
    //задание №6
    //нужно переносить на новую строку ручками после функции, думаю над решением
    public static void drawRectangle_recursion(int x, int y){
        if (x>0){
            drawRectangle_recursion(x-1,0);
            System.out.print("+");
        }
        if(y>1){
            System.out.println();
            drawRectangle_recursion(x,y-1);
        }
    }

    //Информация о интерфейсе программы
    public static void programControl(){
        divider(58,'=');System.out.println("\n");
        divider(8,' '); System.out.print("Выберите действие которое хотите совершить:");System.out.println("\n");
        System.out.println("1\t  - Задание №1, печать чисел от 1 до Х");
        System.out.println("2\t  - Задание №2, прямоугольник с заданными размерами");
        System.out.println("3\t  - Задание №3, квадрат с заданным размером");
        System.out.println("4\t  - Задание №4");
        System.out.println("5\t  - Задание №5, реализация задания №1 при помощи рекурсии");
        System.out.println("6\t  - Задание №6, реализация задания №2 при помощи рекурсии");
        System.out.println("leave - Выход из программы");

    }
    public static void printInfoBack(){
        System.out.println("или напишите \"back\", чтобы вернуться к выбору функций ");
    }
    public static void divider(int x,char c){
        for(int i=0;i<x;i++)
            System.out.print(c);
    }
}
