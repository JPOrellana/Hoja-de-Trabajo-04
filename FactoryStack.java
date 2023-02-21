public class FactoryStack<T> {
	public Stack<T> instanceStack(int type, int type_list){
		Stack<T> stack =null;
		if (type == 1) {
			stack = new ArraylistStack<T>();
		}else if(type == 2) {
			stack = new ListStack<T>(type_list);
		} else if(type == 3) {
			stack = new VectorStack<T>();
		}
		return stack;
	}
}