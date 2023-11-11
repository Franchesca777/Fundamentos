package co.edu.sena.miscelanea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number1 = 0;
        double number2 = 0;
        double number3 = 0;
        double number4 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("/////////////////////////////////////");

        //TODO 1) CALCULAR EL ÁREA DE UN TRIÁNGULO.

        System.out.println(" OPERADORES ");

        System.out.println(" AQUÍ SE PUEDE CALCULAR EL ÁREA DE UN TRIÁNGULO ");
        System.out.println(" EMPECEMOS ");

        //ENTRADA
        System.out.println(" Ingrese la base del triángulo: ");
        number1 = scanner.nextDouble();
        System.out.println(" Ingrese la altura del triángulo: ");
        number2 = scanner.nextDouble();

        //PROCESO
        number3 = (number1 * number2 /2);

        //SALIDA
        System.out.println(" El area del tríangulo es: " + number3 );


        System.out.println("/////////////////////////////////////");

        //TODO 2) INGRESAR DOS NÚMEROS POR LA CONSOLA Y SUMARLOS.

        System.out.println(" INGRESE DOS NÚMEROS PARA OBTENER UNA SUMA ");
        System.out.println(" EMPECEMOS ");

        //ENTRADA
        System.out.println(" Ingrese el primer número: ");
        number1 = scanner.nextDouble();
        System.out.println(" Ingrese el segundo número: ");
        number2 = scanner.nextDouble();

        //PROCESO
        number3 = number1 + number2;

        //SALIDA
        System.out.println(" La suma de dos números es: " + number3);


        System.out.println("/////////////////////////////////////");

        //TODO 3) INGRESAR UN NÚMERO Y VISUALIZAR EL NÚMERO ELEVADO AL CUADRADO.

        System.out.println(" INGRESE UN NÚMERO PARA OBTENER EL NÚMERO QUE DESEA ELEVADO AL CUADRADO ");
        System.out.println(" EMPECEMOS ");

        //ENTRADA
        System.out.println(" Ingrese el número: ");
        number1 = scanner.nextDouble();

        // PROCESO
        number2 = (number1 * number1);

        // SALIDA
        System.out.println(" El número elevado al cuadrado de "+number1 + " "+" es: "+ number2 );


        System.out.println("/////////////////////////////////////");

        //TODO 4) ESCRIBIR UN PROGRAMA QUE CONVIERTA DE EUROS A DÓLARES.

        System.out.println(" AQUÍ PUEDE HACER UNA CONVERSIÓN DE EURO A DÓLAR ");
        System.out.println(" EMPECEMOS ");

        //ENTRADA
        System.out.println(" Introduzca el valor en euros acá ");
        number1 = scanner.nextDouble();
        number2 = 1.07;

        //PROCESO
       number3 = number1 * number2;

        //SALIDA
        System.out.println(" El resultado de la conversión es: "+ number3 );

        System.out.println("/////////////////////////////////////");

        //TODO 5) ESCRIBIR UN PROGRAMA QUE PIDA  EL LADO DE UN CUADRADO Y CALCULE EL VALOR DEL ÁREA Y DEL PERÍMETRO.

        System.out.println(" ESCRIBA EL LADO DE UN CUADRADO Y OBTENDRA EL VALOR DEL ÁREA Y DEL PERÍMETRO ");
        System.out.println(" EMPECEMOS ");

        //ENTRADA
        System.out.println(" Ingrese la medida de un lado del cuadrado ");
        number1 = scanner.nextDouble();

        //PROCESO
        number2 = number1 * number1;
        number3 = number1 + number1 + number1 + number1;

        //SALIDA
        System.out.println(" El área del cuadrado es: " + number2 );

        System.out.println(" El perímetro del cuadrado es: " + number3 );


        System.out.println("/////////////////////////////////////");

        //TODO 6) ESCRIBIR UN PROGRAMA QUE DETERMINE EL ÁREA Y EL VOLÚMEN DE UN CILINDRO.

        System.out.println(" AQUÍ SE PUEDE DETERMINAR EL ÁREA Y EL VOLÚMEN DE UN CILINDRO ");
        System.out.println(" EMPECEMOS ");

        //ENTRADA
        System.out.println(" Ingrese la base del cilindro: ");
        number1= scanner.nextDouble();
        System.out.println(" Ingrese la altura del cilindro: ");
        number2 = scanner.nextDouble();

        //PROCESO
        number3 = 2 * 3.1416 * number1 * (number1 + number2);
        number4 = 3.1416 * ( number1 * number1) * number2;

        //SALIDA
        System.out.println( "La área del cilindro es: " + number3 + " cm² " );
        System.out.println( "El volúmen del cilindro es: " + number4 + " cm³ " );


        System.out.println("/////////////////////////////////////");

        //TODO 7) ESCRIBIR UN PROGRAMA QUE LEA EL RADIO DE UNA CIRCUNFERENCIA
        // Y CALCULE LA LONGITUD DE LA MISMA Y EL ÁREA DEL CIRCULO INSCRITO.

        System.out.println(" AQUÍ OBTENDRAS EL RADIO DE UNA CIRCUNFERENCIA" +
                " EL CUAL CALCULARÁ LA LONGITUD DE LA MISMA Y EL ÁREA DEL CIRCULO INSCRITO ");

        System.out.println(" EMPECEMOS ");

        //ENTRADA
        System.out.println(" Ingrese el radio de una circunferencia ");
        number1 = scanner.nextDouble();

        //PROCESO
        number2 = 2 * 3.1416 * number1;
        number3 = 3.1416 * ( number1 * number1 );

        //SALIDA
        System.out.println(" La longitud de la circunferencia es: " + number2 );
        System.out.println(" El área de la circunferencia es: " + number3 );


        System.out.println("/////////////////////////////////////");

        //TODO 8) CALCULAR EL PROMEDIO DE TRES NUMEROS INGRESADOS POR TECLADO.

        System.out.println(" AQUÍ OBTENDRÁ EL PROMEDIO DE TRES NUMEROS ");
        System.out.println(" EMPECEMOS ");

        //ENTRADA
        System.out.println(" Ingrese el primer número ");
        number1 = scanner.nextDouble();

        System.out.println(" Ingrese el segundo número ");
        number2 = scanner.nextDouble();

        System.out.println(" Ingrese el tercero número ");
        number3 = scanner.nextDouble();

        //PROCESO
        number4= ( number1 + number2 + number3 ) / 3;

        //SALIDA
        System.out.println(" El promedio es: " + number4 );


    }

}








