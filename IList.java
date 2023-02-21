public interface IList<T> {
	/**
	 * Inserta un valor al inicio
	 * @param value valor a insertar al inicio
	 */
	void InsertAtStart(T value);
	
	/**
	 * Inserta un valor al final
	 * @param value valor a insertar al final
	 */
    void InsertAtEnd(T value);

    /**
     * Inserta un valor en un indice
     * @param value valor a ingresar
     * @param index indice
     */
    void Insert(T value, int index);
    
    /**
     * Borra y devuelve un valor de la lista
     * @param index indice
     * @return valor del nodo
     */
    T Delete(int index);

    /**
     * Borra el valor inicial y devuelve el valor
     * @return valor del nodo
     */
    T DeleteAtStart();
    
    /**
     * Borra el valor final y devuelve el valor
     * @return valor del nodo
     */
    T DeleteAtEnd();
    
    /**
     * Devuelve el valor en el indice indicado
     * @param index indice 
     * @return valor del indice
     */
    T Get(int index);
    
    /**
     * Verifica si la lista esta vacia
     * @return True si la lista esta vacia, false en caso contrario
     */
    boolean IsEmpty();
    
    /**
     * Realiza el conteo de los elementos de la lista
     * @return Cantidad de elementos de la lista
     */
    int Count();
}