package RegraNegocio;

/**
 * Exceção a ser lançada quando a idade de um possível novo cliente não for aceita.
 * 
 * @author Leandro Amorim Viersberg
 */
public class IdadeNaoPermitidaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1708909775247647298L;
	public static String MSG_IDADE_INVALIDA = "A idade do cliente precisa estar entre 18 e 65 anos.";
	
	public IdadeNaoPermitidaException(String msg) {
		super(msg);
	}

}
