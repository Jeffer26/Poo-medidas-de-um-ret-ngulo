package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Area;

public class Retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Area x;
		x = new Area();
		
		
		System.out.println("Digite as medidas do Retângulo: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		
		
		double area = x.area();
		System.out.printf("Area = %.2f\n", area);
		area = x.perimetro();
		System.out.printf("Perimetro = %.2f\n", area );
		area = x.diagonal();
		System.out.printf("Diagonal = %.2f", area);
		
		
		sc.close();

	}

	

}
