public class SimpleList<T> extends List<T>{
	//-----PROPIEDADES-----
		private int count;
	    private Node<T> start;
	    private Node<T> end;
	    
	    //-----METODOS-----
		@Override
		/**
		 * Inserta un valor al inicio
		 * @param value valor a insertar al inicio
		 */
		public void InsertAtStart(T value) {
			Node<T> newNode = new Node<T>(value);
	        if (IsEmpty()){
	            start= newNode;
	            end = newNode;
	        }
	        else{
	            newNode.setNext(start);
	            start = newNode;
	        }
	        count++;
		}

		@Override
		/**
		 * Inserta un valor al final
		 * @param value valor a insertar al final
		 */
		public void InsertAtEnd(T value) {
			Node<T> newNode = new Node<T>(value);
	        if (IsEmpty()){
	            start = newNode;
	            end = newNode;
	        }
	        else {
	            end.setNext(newNode);
	            end= newNode;
	        }
	        count++;		
		}

		@Override
		/**
	     * Inserta un valor en un indice
	     * @param value valor a ingresar
	     * @param index indice
	     */
		public void Insert(T value, int index){
			
			if (IsEmpty()) { 
	            InsertAtStart(value);
	        }
	        else {
	            if (index >= Count()){ 
	                InsertAtEnd(value);
	            } 
	            else if (index ==0) {
	                InsertAtStart(value);
	            }
	            else if ((index > 0) && (index < Count())) {
	                Node<T> newNode = new Node<T>(value);
	                Node<T> pretemp = start;
	                Node<T> temp =start.getNext();
	                int i = 1;
	                while ((temp != null) && (i < index)) {
	                    pretemp = temp;
	                    temp = temp.getNext();
	                    i++;
	                }
	                newNode.setNext(temp);
	                pretemp.setNext(newNode);
	                count++;
	            }
	        }
		}

		@Override
		/**
	     * Borra y devuelve un valor de la lista
	     * @param index indice
	     * @return valor del nodo
	     */
		public T Delete(int index) {
			
			if (index== 0){
	            return DeleteAtStart();
	        }
	        else if (index == (Count() - 1)){
	            return DeleteAtEnd();
	        }
	        else if ((index > 0) && (index <(Count() - 1))){
	            Node<T> pretemp = start;
	            Node<T> temp = start.getNext();
	            int i = 1;
	            while ((temp !=null) && (i <(Count() - 1))){
	                pretemp = temp;
	                temp =temp.getNext();
	                i++;
	            }
	            pretemp.setNext(temp.getNext());
	            count--;
	            return temp.getValue();
	        }
	        else{
	            return null;
	        }
		}

		@Override
		/**
	     * Borra el valor inicial y devuelve el valor
	     * @return valor del nodo
	     */
		public T DeleteAtStart() {
			
			if (!IsEmpty()) {
	            Node<T> temp = start;
	            start= start.getNext();
	            count--;
	            return temp.getValue();
	        }
	        return null;
		}

		@Override
		/**
	     * Borra el valor final y devuelve el valor
	     * @return valor del nodo
	     */
		public T DeleteAtEnd() {
			if (!IsEmpty()) {
	            if (Count() ==1) {
	                Node<T> temp = start;
	                start = null;
	                end =null;
	                count--;
	                return temp.getValue();
	            }
	            else {
	                Node<T> pretemp = start;
	                Node<T> temp = start.getNext();
	                while (temp!=null) {
	                    pretemp= temp;
	                    temp =temp.getNext();
	                }
	                end = pretemp;
	                end.setNext(null);
	                count--;
	                return temp.getValue();
	            }
	        }
	        return null;
		}