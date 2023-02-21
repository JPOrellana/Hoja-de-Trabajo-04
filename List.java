public abstract class List<T> implements IList<T>{
	//-----PROPIEDADES-----
	protected int count;
    protected Node<T> start;
    protected Node<T> end;
    
    //-----METODOS-----
	@Override
	/**
	 * Inserta un valor al inicio
	 * @param value valor a insertar al inicio
	 */
	public abstract void InsertAtStart(T value);

	@Override
	/**
	 * Inserta un valor al final
	 * @param value valor a insertar al final
	 */
	public abstract void InsertAtEnd(T value);

	@Override
	/**
     * Inserta un valor en un indice
     * @param value valor a ingresar
     * @param index indice
     */
	public abstract void Insert(T value, int index);

	@Override
	/**
     * Borra y devuelve un valor de la lista
     * @param index indice
     * @return valor del nodo
     */
	public abstract T Delete(int index);

	@Override
	/**
     * Borra el valor inicial y devuelve el valor
     * @return valor del nodo
     */
	public abstract T DeleteAtStart();

	@Override
	/**
     * Borra el valor final y devuelve el valor
     * @return valor del nodo
     */
	public abstract T DeleteAtEnd();

	@Override
	/**
     * Devuelve el valor en el indice indicado
     * @param index indice 
     * @return valor del indice
     */
	public abstract T Get(int index); 

	@Override
	/**
     * Verifica si la lista esta vacia
     * @return True si la lista esta vacia, false en caso contrario
     */
	public abstract boolean IsEmpty();

	@Override
	/**
     * Realiza el conteo de los elementos de la lista
     * @return Cantidad de elementos de la lista
     */
	public abstract int Count();
}