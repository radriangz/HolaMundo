package radrian.holamundo;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey there!");
		
		//Enteros
		byte age = 'a';
		short year = -32767;
		int id_user = 1001;
		long id_twitter = 12345678923456789L;
		
		//Punto Flotante
		float diameter = 34.25F;
		double price = 2345.2345678923456723456234;
		
		//Texto
		char genre = 'F';
		
		//Lógico
		boolean isVisible = true;
		boolean funciona = false;
		
		int variable = 2;
		int _variable = 3;
		int $variable = 4;
		int variable1 = 5;
		
		//CONSTANTES
		int VALOR = 0;
		int VALOR_MAXIMO = 1;
		
		
		//Lower Camel Case
		int minValue = 4;
		
		//UpperCamel Case
		//Solo se usa en clases.
		
		//Casting automatico
		byte b = 6;
		short s = b;
		
		//Se necesita realizar el cast manual
		b = (byte) s;
			
		int i = 1;
		double d = 2.5;
		i = (int) d;		
		
		int codigo = 97;
		char codigoASCII = (char) codigo;
		
		short numero = 300;
		byte numeroByte = (byte) numero;
		
		//Arrays
		//Declaración de Arrays
		int[] arregloInt = new int [3];
		double arregloDouble[];

		int[][] array2D = new int[2][3]; //caben 6 items
		int[][][] array3D = new int[3][3][2]; //caben 18 items
		//int[][][][] array4D = new inte[1][2][3][4];
		
		char[][] days = {{'M','T','W'}, {'M', 'T', 'W'}};
		char[][][] dayss = {{{'a','b'}, {'a','b'}, {'a','b'}}, 
				{{'a','b'}, {'a','b'}, {'a','b'}}};

		char [] names = new char[4];
		names[0] = 'h';
		names[1] = 'o';
		names[2] = 'l';
		names[3] = 'a';
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);

		char[][][][] monkey = new char [2][3][2][2];
		monkey[1][0][0][1] = 'm';
		
		System.out.println("");
		//Operadores aritméticos
		
		int a =1;
		int aa = a+a;
		System.out.println("El valor de aa: " + aa);
		
		double x = 2.56;
		int y = 9;
		
		float w = (float)x + y;
		System.out.println(w);

		System.out.println(w*2);

		double k = 4/0.00002;
		System.out.println("4/0.00002 = " + k);

		System.out.println("El residuo de 7%2 es: " + 7%2);
		
		System.out.println("");
		//Operadores de Asignación
		
		int f = 2;
		int g = 3;
		f += g;
		
		System.out.println("");
		//Operadores incrementp/decremento
		int l = 3;
		//l++;
		//1. Incrementa el valor l+1
		//2. Asigna el valor a l

		//l++;
		//1. Asigna el valor a l (l = l)
		//2. Incrementa el valor  +1 y lo asigna a l

		System.out.println("");
		//Operadores equidad
		int q = 5;
		int p = 4;
		//System.out.println(p!=q);
		//true
		
		System.out.println("");
		//Operadores Relacionales
		System.out.println("q > p -> " + (q > p));
		System.out.println("q < p -> " + (q < p));

		System.out.println("q >= p -> " + (q >= p));
		System.out.println("q <= p -> " + (q <= p));

		System.out.println("");
		//Operadores Lógicos
		boolean n = false;
		boolean m = true;
		
		System.out.println("a && b -> " + (n && m));
		System.out.println("a || b -> " + (n || m));
		System.out.println("!n -> " + (!n));
		System.out.println("!m -> " + (!m));

		System.out.println("");
		//Control de Flujo
		// if/else
		System.out.println("Control de Flujo: If/Else");
		
		if(q > p) {
			//true
			System.out.println("Si es mayor");
		} else if (q == p) {
			System.out.println("Es igual");
		} else {
			System.out.println("No es mayor, y no es igual");
		}

		System.out.println("");
		// if/else
		System.out.println("Control de Flujo: Switch");

		int mes = 8;
		switch (mes) {
			case 1:
				System.out.println("Enero");
				break;
			case 2:
				System.out.println("Febrero");
				break;
			case 3:
				System.out.println("Marzo");
				break;
			case 4:
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Mayo");
				break;
			case 6:
				System.out.println("Junio");
				break;
			case 7:
				System.out.println("Julio");
				break;
			case 8:
				System.out.println("Agosto");
				break;
			case 9:
				System.out.println("Septiembre");
				break;
			case 10:
				System.out.println("Octubre");
				break;
			case 11:
				System.out.println("Noviembre");
				break;
			case 12:
				System.out.println("Diciembre");
				break;

			default:
				System.out.println("No existe ese mes");
				break;
		}
		
		// Bucle While
			System.out.println("Control de Flujo: Bucle While");
		int e = 1;
		while (e <= 5) {
			System.out.println("e es igual a " + e);
			e++;
		}
		
		System.out.println("");

		// Bucle For
		
		System.out.println("Bucle for");

		int[] numeros = new int[5];
		for (int c =0; c < 5; c++) {
			numeros[c] = c;
			System.out.println("numeros[" + c + "]: " + numeros[c]);

		}
		
		
		System.out.println("Continuamos con el flujo");

		// Bucle Foreach
		System.out.println("");
		System.out.println("Bucle Foreach");
		
		for (int j : numeros) {
			System.out.println(j);

		}
		
		System.out.println("");
		System.out.println("_________________________________");
	}

}