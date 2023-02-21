import java.util.ArrayList;

public abstract class Stack<T> implements IStack<T>{
	//-----PROPIEDADES-----
protected ArrayList<T> core;
	
	
	@Override
	/**
	 * Ingresa un valor a la pila
	 * @param value valor a ingresar
	 */
	public abstract void push(T value);

	@Override
	/**
     * Saca un valor a la pila 
     * @return Devuelve el ultimo valor de la pila
     */
	public abstract T pull();

	@Override
	/**
     * Muestra un valor a la pila 
     * @return Muestra el ultimo valor de la pila
     */
	public abstract T peek();

	@Override
	/**
     * Cuenta los elementos de la pila
     * @return Devuelve el tamaño de la pila
     */
	public abstract int count();

	@Override
	/**
     * Verifica si la pila tiene elementos
     * @return Devuelve True si la pila esta vacia y False si no lo esta 
     */
	public abstract boolean isEmpty();
	
}