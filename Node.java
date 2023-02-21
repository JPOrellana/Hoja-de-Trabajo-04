public class Node<T> {
	//-----PROPIEDADES-----
	private T value;
	private Node<T> next;
	
	//-----METODOS-----
	/**
	 * Metodo constructor
	 */
	public Node(T value) {
		this.setValue(value);
	}
	/**
	 * @return Valor del nodo
	 */
	public T getValue() {
		return value;
	}
	/**
	 * @param value Valor
	 */
	public void setValue(T value) {
		this.value = value;
	}
	/**
	 * @return el siguiente nodo
	 */
	public Node<T> getNext() {
		return next;
	}
	/**
	 * @param next el siguiente nodo
	 */
	public void setNext(Node<T> next) {
		this.next = next;
	}
}