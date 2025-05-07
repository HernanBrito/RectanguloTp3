package ar.edu.unq.po2.tp3.expresiones;

public class expresiones {
	/*
	 * ● s.length(); retorna 3, ya que length devuelve la cantidad de caracteres de la cadena de caracteres del string
	 * ● t.length();  no puede ser ejecutada porque no la variable t no est'a inicializada con un valor.
	 * 				  Los strings no se inicializan con un valor predeterminado
	 * ● 1 + a; Se le agrega "1" al inicio de la cadena de caracteres de la variable
	 * ● a.toUpperCase(); transforma la cadena caracteres de "a" en mayusculas
	 * ● "Libertad".indexOf("r");  retorna la cuarta posicion la cadena de caracteres
	 * ● "Universidad".lastIndexOf('i'); retorna la 7ma posicion ya que es en la ultima posicion que aparece i
	 * ● "Quilmes".substring(2,4); Devuelve una nueva cadena de caracteres que comienza en la posicion 2 de la cadena
	 * 							   y termina en la posicion 4 de la cadena osea Devuelve "il"
	 * ● (a.length() + a).startsWith("a"); devuelve falso porque se agrega  se agrega abc despues de 
	 * 									   tomar la longitud de la cadena
	 * ● s == a;	devuelve verdadero porque se trata de la misma cadena de caracteres
	 * ● a.substring(1,3).equals("bc") devuelve true
	 */

	public static void main(String[] args) {
		String a = "abc";
		String s = a;
		//String t;
		
		System.out.println(s.length());
		System.out.println(1 + a);
		System.out.println(a.toUpperCase());
		//System.out.println(t.length()); t no se encuentra inicializada
		System.out.println("Libertad".indexOf("r"));
		System.out.println("Universidad".lastIndexOf('i'));
		System.out.println("Quilmes".substring(2,4));
		System.out.println((a.length() + a).startsWith("a"));
		System.out.println(s == a);
		System.out.println(a.substring(1,3).equals("bc"));
		
	}
}
