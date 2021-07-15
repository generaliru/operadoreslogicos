
public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Operadores Lógicos:
		 * a == b, a es igual a b;
		 * a > b, a es mayor que b;
		 * a < b, a es menor que b;
		 * a != b, a es diferente a b;
		 * <= >=.
		 */
		byte a = 1;
		byte b = 2;
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(saludo());
	}
	
	public static String saludo() {
		/*
		 * Public: que el acceso al método puede hacerse fuera del objeto.
		 * Static: podemos instaciarlo sin crear el objeto.
		 */
		return "Hello";
	}

}
