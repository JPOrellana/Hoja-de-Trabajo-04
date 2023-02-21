public class ArraylistStack<T> extends Stack<T> {
    private ArrayList<T> core;
        
        /***
         * Metodo constructor de Stack
         */
        public ArraylistStack() {
            core = new ArrayList<T>();
        }
        
        @Override
        /**
         * Ingresa un valor a la pila
         * @param value valor a ingresar
         */
        public void push(T value) {
            core.add(0, value);
            
        }
    
        @Override
        /**
         * Saca un valor a la pila 
         * @return Devuelve el ultimo valor de la pila
         */
        public T pull() {
            if(!isEmpty()) {
                return core.remove(0);
            }else {
                return null;
            }
            
        }
    
        @Override
        /**
         * Muestra un valor a la pila 
         * @return Muestra el ultimo valor de la pila
         */
        public T peek() {
            if(!isEmpty()) {
                return core.get(0);
            }else{
                return null;
            }
        }
    
        @Override
        /**
         * Cuenta los elementos de la pila
         * @return Devuelve el tamaño de la pila
         */
        public int count() {
            return core.size();
        }
    
        @Override
        /**
         * Verifica si la pila tiene elementos
         * @return Devuelve True si la pila esta vacia y False si no lo esta 
         */
        public boolean isEmpty() {
            return core.isEmpty();
        }
    }