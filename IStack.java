public interface IStack<T>{
	/***
	 * Ingresa un valor a la pila
	 * @param value valor a ingresar
	 */
	void push(T value);
	
	/***
     * Saca un valor a la pila 
     * @return Devuelve el ultimo valor de la pila
     */
	T pull();
	
	/***
     * Muestra un valor a la pila 
     * @return Muestra el ultimo valor de la pila
     */
	T peek();
	
	/***
     * Cuenta los elementos de la pila
     * @return Devuelve el tamaño de la pila
     */
	int count();
	
	/***
     * Verifica si la pila tiene elementos
     * @return Devuelve True si la pila esta vacia y False si no lo esta 
     */
	boolean isEmpty();
}