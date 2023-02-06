package ciclosycondiciones;

import java.util.Scanner;

public class Ciclosycondiciones {

    public static void main(String[] args) {
        menu();
    }

    public static void condicionswitch() {
        Scanner leer = new Scanner(System.in);
        int dia = 0;
        System.out.println("Digite el dia");
        dia = leer.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.out.println("Dia invalido");
        }

    }

    public static void ciclodowhile() {

        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Salir");
            System.out.println("Digite una opcion");
            opcion = leer.nextInt();

        } while (opcion != 3);
    }

    public static void ciclowhile() {
        int x = 0;
        while (x <= 20) {
            if ((x > 5) && (x < 10)) {

                System.out.println("valor" + x);
            }
            x = x + 1;

        }

    }

    public static void menu() {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("-------------------------");
            
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");
            System.out.println("-------------------------");
            System.out.println("Digite una opcion");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    sumar();
                    break;
                    
                case 2:
                    restar(); 
                    break;
                    
                case 3:
                    multiplicar(); 
                    break;
                    
                case 4:
                    dividir();
                    break;
                default:
                    System.out.println("----------------------");
                    System.out.println("Gracias por usar este programa");
            }

        } while (opcion != 5);

    }

    public static void sumar() {

        Scanner leer = new Scanner(System.in);
        float num1 = 0;
        float num2 = 0;
        System.out.println("---------------------------------");
        System.out.println("Digite 2 numeros para la operacion");
        System.out.println("Digite el primer numero");
        num1 = leer.nextFloat();
        System.out.println("Digite el segundo numero");
        num2 = leer.nextFloat();
        System.out.println("El total de la suma es: " + (num1 + num2));

    }

    public static void restar() {
        Scanner leer = new Scanner(System.in);
        float num1 = 0;
        float num2 = 0;
        System.out.println("--------------------------------------");
        System.out.println("Digite 2 numeros para la operacion");
        System.out.println("Digite el primer numero");
        num1 = leer.nextFloat();
        System.out.println("Digite el segundo numero");
        num2 = leer.nextFloat();
        System.out.println("El total de la resta es: " + (num1 - num2));

    }

    public static void multiplicar() {
        Scanner leer = new Scanner(System.in);
        float num1 = 0;
        float num2 = 0;
        System.out.println("--------------------------------------");
        System.out.println("Digite 2 numeros para la operacion");
        System.out.println("Digite el primer numero");
        num1 = leer.nextFloat();
        System.out.println("Digite el segundo numero");
        num2 = leer.nextFloat();
        System.out.println("El total de la multiplicacion es: " + (num1 * num2));
    }

    public static void dividir() {
        Scanner leer = new Scanner(System.in);
        float num1 = 0;
        float num2 = 0;
        System.out.println("-----------------------------------");
        System.out.println("Digite 2 numeros para la operacion");
        System.out.println("Digite el primer numero");
        num1 = leer.nextFloat();
        System.out.println("Digite el segundo numero");
        num2 = leer.nextFloat();
        System.out.println("El total de la division es: " + (num1 / num2));
    }

    public static void condicionIF() {
        int num1, num2, num3;
        num1 = 6;
        num2 = 7;
        num3 = 9;
        if ((num1 > num2) && (num1 > num3)) {
            System.out.println(num1 + "es mayor que" + num2);
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println(num2 + "es mayor");
        } else if ((num3 > num1) && (num3 > num2)) {
            System.out.println(num3 + " es mayor ");
        } else if ((num1 == num2) && (num2 == num3)) {
            System.out.println("Los 3 numeros son iguales ");
        }

    }

}
