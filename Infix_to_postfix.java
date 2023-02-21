
import java.util.Arrays;


public class Infix_to_postfix {
	//-----PROPIEDADES-----
	private List<String> lst;
	private Stack<String> stk;
	private FactoryList<String> fList;
	private FactoryStack<String> fStack;
	private String[] numeros;
	private int listtype=0;
	private int stacktype=0;
	static boolean flag = false;
	//-----METODOS-----
	/**
	 * Metodo constructor de Infix_to_postfix
	 */
	public Infix_to_postfix(int typ_stack, int typ_list){
		if (!flag) {
			numeros = new String[] {"0","1","2","3","4","5","6","7","8","9"};
			fList = new FactoryList<String>();
			fStack = new FactoryStack<String>();
			lst = fList.instanceList(typ_list);
			stk = fStack.instanceStack(typ_stack, typ_list);
			listtype = typ_list;
			stacktype = typ_stack;
			flag = true;
		}else {
			
		}
		
	}
	
	/**
	 * Realiza el orden de prioridad de las operaciones
	 * @param String sign: signo operador
	 */
	private static int precedence(String sign){
        if(sign.equals("*") || sign.equals("/")){
            return 2;
        }
        else if(sign.equals("+") || sign.equals("-")){
            return 1;
        }
        return -1;
    }
	
	/**
	 * Realiza la conversion de infix a postfix
	 * @param String exp: expresion infix
	 */
	public String converter(String exp) {
		String result = "";
		boolean valid = false;
		lst = fList.instanceList(listtype);
		stk = fStack.instanceStack(stacktype, listtype);
		//Validacion de parejas completas de parentesis ()
		int incomplete_pairs=0;
		for(int i=0; i<exp.length();i++) {
			if(exp.charAt(i)=='(') {
				incomplete_pairs++;
			}else if(exp.charAt(i)==')'){
				incomplete_pairs--;
			}
		}
		if(incomplete_pairs==0) {//pairs are complete
			valid = true;
		}else if (incomplete_pairs>0) {
			valid = false;
		}else if (incomplete_pairs<0) {
			valid = false;
		}
		
		//Se guardan los tokens de la expresion original
		String[] tokens = exp.split(" ");
		
		//Si se cumple la validacion
		if(valid) {
			for(int i = 0; i < tokens.length ; i++) {
				
				//Numeros del 0 al 9
	            if(Arrays.stream(numeros).anyMatch(tokens[i]::equals)){
	                lst.InsertAtEnd(tokens[i]);
	            }
	            //Parentesis (
	            else if(tokens[i].equals("(")) {
	            	stk.push(tokens[i]);
	            }
	            //Parentesis )
	            else if(tokens[i].equals(")")) {
	            	//Hasta encontrar a su pareja
	            	while(!stk.isEmpty() && !stk.peek().equals("(")) {
	            			lst.InsertAtEnd(stk.pull());
	            	}
        			stk.pull();
	            }
	            //Operadores
	            else {
	            	while(!stk.isEmpty() && precedence(stk.peek()) >= precedence(tokens[i])) {
	            		lst.InsertAtEnd(stk.pull());
	            	}
	            	stk.push(tokens[i]);
	            }
			}
			
			while(!stk.isEmpty()){
	            lst.InsertAtEnd(stk.pull());
	        }
			
			//Se pasa de array al String resultado
			for(int i = 0; i < lst.Count() ; i++) {
				result += lst.Get(i) + " ";
			}
			
		}else {
			result = null;
		}
		return result;
	}
	
}