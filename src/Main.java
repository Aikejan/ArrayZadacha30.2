import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //System.out.println(getSum(a));
     /*   myMethod();
    }

        public static void myMethod(int a, int b){

            System.out.println(a-b);
        }/*





        //   GIT  SISTEMA UPRAVLENIE VERSIAMI
//        M-> MINIMUM;
//        V-> VALUES;
//        P-> PROJOECKT;




        /// TODO 1 SIMVOL KAYTARAT CHARAT STRING METODU  ///


   //     String word = "Asman";
//        System.out.println(word.charAt(1));  // INDEKSTEGI SIMVOLDU KAYTARYP BERET
//        System.out.println(word.substring(1,3));// 1 den 3 ko   cheyinki  sandardy chygarat
//        System.out.println(word.contains("M"));  // COZDO USHUL SIMVOL BARBY JE JOKPU TEKSHERIP BERET
//        System.out.println(word.toUpperCase(Locale.ROOT)); // CHON TAMGA MENEN JAZAT
//        System.out.println(word.toLowerCase(Locale.ROOT));  // KICHINEKEY TAMGA MENEN JAZYP CHYGARAT
      //  System.out.println(word);  //ASCT PROBEL KOUCHU SIMVOL
//        System.out.println(word.equals("Asman"));  // SRAVNIVAET
//        System.out.println(word.replace("Asman","Jer")); // ZAMENYAT
//        System.out.println(word.length()); // UZUNDUGU
//        System.out.println(word.concat("Jyldyz")); //  cozdu koshup chygaruu




      //myMethod(" Vrach", "shofer", "Povar");
        //}


//        int[] nums = {1, 2, 3, 4};
//        getSum(nums);
//        getSum(new String[]{"Daniel", "Alina", "Asan"});
//    }
        // System.out.println(myMethod(2, 34, 6, 7, 8, 9));


        //  TODO RANDOM SANDARDY KOBOYTUU   ///
//        Scanner in = new Scanner (System.in);
//
//        int x, sum = 0, count = 0;
//
//        for (int i = 1; i <= 20; i++){
//            x =(int) (30 +  Math.random() * 19);
//            System.out.println(i +  ": " + x);
//
//            if (i > x)
//                System.out.print("- " + x);
//
//            if (i < x)
//                System.out.print(" +" + x);
//
//
//

//        }


//     /*   1. Напишите класс, который создает 20 случайных чисел диапазона 1 - 99. Следует
//        вывести в консоль только те числа которые делятся на 1-ое рандомное число без
//        остатка. - Нельзя использовать массив.*/
//

//        Random random = new Random();
//        int g = random.nextInt(1,99);
//        int counter =0;
//        System.out.println("Sluchaynuy random: " +g);
//        for (int i = 1; i < 20 ; i++) {
//            if(g%2==1){
//                System.out.println(g);
//            }
//                int r = random.nextInt(1, 99);
//                int n = g%r;
//                counter++;
//            System.out.println(n);
//            }
//        System.out.println("Sandardyn esebi: " + counter);




      /*  Массивтин ичин рандом сандар менен толтурунуз(100 санга чейин),

        андан кийин консольдон бир сан алыныз,

        эгер консольдон алынган сан массивдин ичинде бар болсо,

        анда ошол сан турган индекси консольго чыгарыныз.

                Эгер жок болсо анда “Мындай сан массивтин ичинде жок” деген жазууну чыгарыныз.*/

        Scanner sc = new Scanner(System.in);
        int nam = sc.nextInt();
        Random random = new Random();
        int [] number = new int[50];
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(1, 100);
            if (nam == number[i] || nam!=number[i] ) {
                System.out.println(number[i]);
            }else {
                System.out.println("Myndai san massivde jok");
            }
        }






    }
}



        /// TODO  METHOD  ///

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write your name");
//        String name = scanner.nextLine();
//        System.out.println("Write your birth year");
//        int year = scanner.nextInt();
//        System.out.println("When did you start working?");
//        int yearWork = scanner.nextInt();
//
//
//        System.out.println("Name:" + name);
//        System.out.println("Age"  + getSum(2023,year));
//        System.out.println("Work experlance " + getSum(yearWork));
//        }
//        public static int getSum(int a){
//        return  2023-a;


        /// TODO VARARGS  FOREACH  STRING METHOD GIT  ///
//     public static int myMethod(int ... nambers ){ // 1,2,3,4,5
//        int sum = 0;
//         for (int i = 0; i < nambers.length; i++) {// 0<5 1<5 2<5 3<5 4<5
//             sum += nambers[i]; //0=0+1 1+1 2+2 4+3 7+4 11+5
//         }return sum;
//
//
        // }


        ///   TODO FOREACH 24.04. 2023  ///


//    public  static  void getSum(int[] nambers){ // 1 2 3 4
//        for (int i = 0; i < nambers.length; i++) {
//            System.out.println(nambers[i]);// [0]=1 [1]=2 [2]=3; [3]=4
//
//        }
//        for(int j: nambers){
//            System.out.println(j);
//        }


//    }
//    public  static  void getSum(String [] names){
//       //  String[] names;//  Dniel Alina Asan
//        String n = null;
//        System.out.println(n);
//        for(String name: names){
//            System.out.println(name);
//        }
//    }



//        public  static void  myMethod(String ... jobs){
//
//        for(String job: jobs){
//            System.out.println("My jobs:" + job);
//        }
//        }












