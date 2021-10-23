package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	private static Scanner scanner;
	public static void  main (String[] args) {

scanner = new Scanner (System.in);
	
int a, b;

System. out.println(" Wagner ");
a = scanner. nextInt();
System.out.println(" Almeida ");
b = scanner. nextInt();

	


int soma = soma (a,b);
int subtracao = subtracao (a,b);
int divisao = divisao (a,b);
int multiplicacao = multiplicacao (a,b);

System.out.println (soma);
System.out.println (subtracao);
System.out.println (divisao);
System.out.println (multiplicacao);

	}

		
		
	
public static int soma(int a, int b) {
	return a + b;
}
	
	
	public static int subtracao(int a, int b) {
		return a - b;
}
public static int divisao(int a, int b) {
	return a / b;
}
	public static int multiplicacao(int a, int b) {
	return a * b;
	
}
	

	
}