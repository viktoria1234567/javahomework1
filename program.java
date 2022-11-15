//1.Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

// import java.util.Scanner;
//     public class program{
//         public static void main(String[] args) {
//             Scanner iScanner = new Scanner(System.in);
//             //System.out.printf("n: ");
//             Integer n = iScanner.nextInt();
//             // System.out.printf("Привет. %s!", name);
//             // iScanner.close();
//             method(n);
//             method2(n); 
//         }   
        
//         private static void method(int x) {
//             int i = 1;
//             int sum = 0;
//             while (i <= x){
//                 sum+=i;
//                 i+=1;   
//             }
//             System.out.println(sum);
//         }   
//         private static void method2(int y) {
//             int i = 1;
//             int fact = 1;
//             while (i <= y){
//                 fact*=i;
//                 i+=1;   
//             }
//             System.out.println(fact);
//         }   

//     }
//2.Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.

// public class program{
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         Integer n = iScanner.nextInt();
//         Integer m = iScanner.nextInt();

//         boolean result = method(n,m);
//         System.out.println(result);
//     }  
        
//     private static boolean method(int x, int y) {
//         int sum = x+y;
//         if (sum<=20 && sum >= 10){
//             // System.out.println(true);
//             return true;
//         }
//         else{
//             // System.out.println(false);
//             return false;
//         }   
//     }   
// }    
// 3.Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, 
// положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

// public class program{
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         Integer n = iScanner.nextInt();
//         method(n);  
//     } 
//     private static void method(int x) {
//         if (x>=0){
//             System.out.println("число положительное"); 
//          }   
//         else{
//              System.out.println("число отрицательное");
//         }                     
//     }      
// }

// 4.Написать метод, которому в качестве параметра передается целое число. 
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

// public class program{
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         Integer n = iScanner.nextInt();
                
    
//         boolean result = method(n);
//         System.out.println(result); 
//     } 
//     private static boolean method(int x) {
//         if (x>=0){
//                 return false; 
//         }   
//         else{
//             return true; 
//         }                     
//     }      
// }
// 5.Написать метод, которому в качестве аргументов передается строка и число, 
// метод должен отпечатать в консоль указанную строку, указанное количество раз;

// public class program{
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.println("Строка: ");
//         String m = iScanner.nextLine();
//         System.out.println("Число: ");
//         Integer n = iScanner.nextInt();
        
//         method(m,n);
        
//     }
//     private static void method(String str, int x) {
//         int i = 0;
//         while (i < x){
//              System.out.println(str);
//              i++;
//         }
        
//     }   
// }
// 6.Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). 
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный

// public class program{
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         Integer n = iScanner.nextInt();
                    
        
//         boolean result = method(n);
//         System.out.println(result); 
//     } 
//     private static boolean method(int x) {
//         if (x%400==0){
//             return true;
//         }
//         else{
//             if (x%100==0){
//                 return false;
//             }
//             else{
//                 if (x%4==0){
//                     return true;
//                 }
//                 else{
//                     return false;
//                 }
//             }             
//         }                    
//     }      
// }
// 7.Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//  С помощью цикла и условия заменить 0 на 1, 1 на 0;
// public class program{
//     public static void main(String[] args) {
//         int [] array = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
//         int[] result = method(array);
//         System.out.println(result);   
//     }
//     private static int[] method(int[] array) {
//         for (int i = 0; i<array.length; i++){
//             if (array[i] == 0){
//                 array[i] = 1;
//             }
//             else{
//                 array[i] = 0;
//             }
//         }
//     return array;           
//     }   
// }
// 8.Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
// public class program{
//     public static void main(String[] args) {
//         int [] array = new int[100];

//         int[] result = method(array);
//         System.out.println(result);   
//     }
//     private static int[] method(int[] array) {
//         int a = 1;
//         for (int i = 0; i<array.length; i++){
//             array[i]=a;
//             a++;
//         }
//     return array;           
//     }       
// }
// 9.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2


