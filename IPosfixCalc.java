public interface IPosfixCalc {
	/***
     * Resuelve una operacion en postfix y devuelve su resultado
     * @param expresion Operacion a ingresar
     * @return Resultado de la operacion
     */
	int Evaluate(String expresion);
}