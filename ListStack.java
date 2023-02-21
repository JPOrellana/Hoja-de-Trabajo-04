public class ListStack<T> extends Stack<T> {
	private FactoryList<T> fList;
	private List<T> listaInterna;
	public ListStack(int typ_list)
	{
		fList = new FactoryList<T>();
		listaInterna = fList.instanceList(typ_list);
	}
	
	@Override
	public int count() {
		return listaInterna.Count();
	}

	@Override
	public boolean isEmpty() {
		return listaInterna.IsEmpty();
	}

	@Override
	public void push(T value) {
		listaInterna.InsertAtStart(value);
	}

	@Override
	public T pull() {
		return listaInterna.DeleteAtStart();
	}

	@Override
	public T peek() {
		return listaInterna.Get(0);
	}
}