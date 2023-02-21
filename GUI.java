import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GUI {

	/**
	 * Main: ejecucion del programa
	 * @param args
	 */
	static Infix_to_postfix conv;
	static PosfixCalc calc;
	public static void main(String[] args) {
		//-----PROPIEDADES-----
		Scanner scan = new Scanner(System.in);
		boolean bandera1 = true;
		boolean bandera2 = true;
		int type_stack=0;
		int type_list=0;
		while(bandera1) {
			System.out.println("Ingrese el tipo de stack a utilizar:");
			System.out.println("1. Arraylist");
			System.out.println("2. List");
			System.out.println("3. Vector");
			type_stack = Integer.parseInt(scan.nextLine());
			if (type_stack==1 || type_stack == 2 || type_stack == 3) {
				bandera1 = false;
			}
		}
		while(bandera2) {
			System.out.println("Ingrese el tipo de lista a utilizar:");
			System.out.println("1. Simple");
			System.out.println("2. Doble");
			type_list = Integer.parseInt(scan.nextLine());
			if (type_list ==1 || type_list == 2) {
				bandera2 = false;
			}
		}
		conv = new Infix_to_postfix(type_stack, type_list);		
		calc = new PosfixCalc(type_stack, type_list);
		//Se solicita la expresion Infix
		
		ArrayList<String> operaciones = new ArrayList<String>();
		try {
			FileReader r = new FileReader("datos.txt");
			BufferedReader br = new BufferedReader(r);
			String line;
			while((line=br.readLine())!=null){
				operaciones.add(line);
			}
			br.close();
		}catch(IOException e) {
			System.out.println("Ha ocurrido una excepcion de tipo IO: "+e);
		}
		for(int i=0;i<operaciones.size();i++) {
			System.out.println("Infix: "+ operaciones.get(i));
			String postfixString = conv.converter(operaciones.get(i));
			System.out.println("Postfix: "+ postfixString);
			System.out.println("Resultado: "+calc.Evaluate(postfixString)+"\n"); 
		}
		
	}

}