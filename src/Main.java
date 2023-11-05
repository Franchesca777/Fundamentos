import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("1) CALCULAR EL ÁREA DE UN TRIÁNGULO");
        //ENTRADA
        System.out.println("Ingrese la base del triángulo: ");
        double base = entrada.nextDouble();
        System.out.println("Ingrese la altura del triángulo: ");
        double altura = entrada.nextDouble();

        //PROCESO
        double area = (base * altura) / 2;

        //SALIDA
        System.out.println("El area es " + area);


        System.out.println("/////////////////////////////////////");


        System.out.println("2) INGRESAR DOS NÚMEROS POR LA CONSOLA Y SUMARLOS");

        //ENTRADA
        System.out.println("Ingrese el primer número: ");
        double number1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        double number2 = entrada.nextDouble();

        //PROCESO
        double suma = number1 + number2;

        //SALIDA
        System.out.println("La suma es " + suma);


        System.out.println("/////////////////////////////////////");

        System.out.println("3) INGRESAR UN NÚMERO Y VISUALIZAR EL NÚMERO ELEVADO AL CUADRADO");

        Scanner scanner = new Scanner(System.in);

        //ENTRADA
        System.out.println("Ingrese el número: ");
        double number = scanner.nextDouble();

        // PROCESO
        double result = (number * number);

        // SALIDA
        System.out.println("El cuadrado de "+number+ " "+"es: "+result);


        System.out.println("/////////////////////////////////////");

        System.out.println("4) ESCRIBIR UN PROGRAMA QUE CONVIERTA DE EUROS A DÓLARES");


        //ENTRADA
        System.out.println("Introduzca una cantidad de euros");
        double euro = entrada.nextDouble();
        double dolar = 1.07;

        //PROCESO
        double cambio = euro * dolar;

        //SALIDA
        System.out.println("El resultado de la conversión es: "+ cambio);

        System.out.println("/////////////////////////////////////");

        System.out.println("5) ESCRIBIR UN PROGRAMA QUE PIDA EL LADO DE UN CUADRADO Y CALCULE EL VALOR DEL ÁREA Y DEL PERIMETRO");


        //ENTRADA
        System.out.println("Ingrese la medida de un lado del cuadrado");
        double lado = entrada.nextDouble();

        //PROCESO
        double area2 = lado * lado;
        double perimetro = lado + lado + lado + lado;

        //SALIDA
        System.out.println("El area del cuadrado es: " + area2);

        System.out.println("El perimetro del cuadrado es: " + perimetro);


        System.out.println("/////////////////////////////////////");


        System.out.println("6) ESCRIBIR UN PROGRAMA QUE DETERMINE EL ÁREA Y EL VOLÚMEN DE UN CILINDRO ");

        //ENTRADA
        System.out.println("Ingrese la base del cuadrado: ");
        double base2 = entrada.nextDouble();
        System.out.println("Ingrese la altura del cuadrado: ");
        double altura2 = entrada.nextDouble();

        //PROCESO
        double area3 = 2 * 3.1416 * base2 * (base2 + altura2);
        double volumen = 3.1416 * (base2 * base2) * altura2;

        //SALIDA
        System.out.println("LA ÁREA DEL CILINDRO ES: " + area3 + " cm² ");
        System.out.println("LA VOLÚMEN DEL CILINDRO ES: " + volumen + " cm³ ");


        System.out.println("/////////////////////////////////////");


        System.out.println("7) ESCRIBIR UN PROGRAMA QUE LEA EL RADIO DE UNA CIRCUNFERENCIA Y CALCULE LA LONGITUD DE LA MISMA Y EL ÁREA DEL CIRCULO INSCRITO ");

        //ENTRADA
        System.out.println("Ingrese el radio de una circunferencia");
        double radio = entrada.nextDouble();

        //PROCESO
        double longitud = 2 * 3.1416 * radio;
        double area4 = 3.1416 * (radio * radio);

        //SALIDA
        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área de la circunferencia es: " + area4);


        System.out.println("/////////////////////////////////////");


        System.out.println("8) CALCULAR EL PROMEDIO DE TRES NUMEROS INGRESADOS POR TECLADO ");
        //ENTRADA
        System.out.println("Ingrese el primer número");
        double numero1 = entrada.nextDouble();

        System.out.println("Ingrese el segundo número");
        double numero2 = entrada.nextDouble();

        System.out.println("Ingrese el tercero número");
        double numero3 = entrada.nextDouble();

        //PROCESO
        double promedio = (numero1 + numero2 + numero3) / 3;

        //SALIDA
        System.out.println("El promedio es: " + promedio );




    }
}











