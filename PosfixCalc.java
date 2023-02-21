import java.util.Arrays;

public class PosfixCalc implements IPosfixCalc{
	//-----PROPIEDADES-----
	private Stack<String> stack;
	private String[] numeros;
	private String[] operadores;
	private FactoryStack<String> fStack;
	static boolean flag = false;
	/***
	 * Metodo constructor de PosfixCalc
	 */
	public PosfixCalc(int typ_stack, int typ_list) {
		if (!flag) {
			numeros = new String[] {"0","1","2","3","4","5","6","7","8","9"};
			operadores = new String[] {"-","+","*","/"};
			fStack = new FactoryStack<String>();
			stack = fStack.instanceStack(typ_stack, typ_list);
		}else {
			
		}
	}
	
	@Override
	/***
	 * @param expresion this is a single expression like: 1 2 + 4 * 3 +
	 * @return the evaluation of the expression
	 */
	public int Evaluate(String expresion) {
		int finalres=0;
		boolean bandera=false;
		try {
			String[] carac = expresion.split(" ");
			for(int i=0;i<carac.length;i++) {
				if(Arrays.stream(numeros).anyMatch(carac[i]::equals)) {
					stack.push(carac[i]);
				}else if(Arrays.stream(operadores).anyMatch(carac[i]::equals)) {
					if(stack.count()>=2) {
						int n2 = Integer.parseInt(stack.pull()); 
						int n1 = Integer.parseInt(stack.pull());
						int res = 0;
						switch (carac[i]) {
						case "-": 
							res = n1-n2;
							break;
						case "+": 
							res = n1+n2;
							break;
						case "*": 
							res = n1*n2;
							break;
						case "/": 
							res = n1/n2;
							break;
						default:
							break;
						}
						stack.push(res+"");
					} else {
						System.out.println("La estructura de la operacion no es correcta, faltan operandos para realizar la operacion");
						bandera = true;
					}
				}else {
					System.out.println("La estructura de la operacion no es correcta, caracteres invalidos");
				}
			}
			if(stack.count()==1) {
				finalres = Integer.parseInt(stack.pull());
			}else {
				System.out.println("La estructura de la operacion no es correcta, faltan operadores");
			}
		}catch(Exception e) {
			System.out.println("**********");
			System.out.println("Math ERROR");
			System.out.println("**********");
		}
		if(bandera) {
			return 0;
		}else {
			return finalres;
		}
	}
}