package poo;

/**
 * A classe Cart�o cont�m m�todos para realizar opera��es b�sicas
 * 
 * <ul>
 * <li> retirarServico </li>
 * <li> atribuirNovoServico </li>
 * <li> promoverNovoCargo </li>
 * <li> despedirFuncionario </li>
 * </ul>
 * 
 * @author AR21PT
 *
 */
public class Cartao {
	
	private String nomeFuncionario;
	private String servico;
	private String cargo;
	
	// Construtores 
	public Cartao(String nomeFuncionario) {
		super();
		this.nomeFuncionario = nomeFuncionario;
	}

	public Cartao(String nomeFuncionario, String servico, String cargo) {
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.servico = servico;
		this.cargo = cargo;
	}

	// Acessores
	
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	// M�todos
	
	
	/**
	 * Retirar o funcion�rio do servi�o
	 */
	public void retirarServico() {
		// servico = "";
		setServico("");
	}
	
	/**
	 * Atribuir um novo servi�o ao funcion�rio;
	 * @param novoServico
	 */
	
	public void atribuirNovoServico( String novoServico ) {
		//servico = novoServico;
		setServico( novoServico );
	}
	
	/**
	 * Promover o funcion�rio a um novo cargo;
	 * @param novoCargo
	 */
	
	public void promoverNovoCargo( String novoCargo ) {
		//cargo = novoCargo;
		setCargo(novoCargo);
	}
	
	/**
	 * Despedir um funcion�rio (ficar sem servi�o e sem cargo).
	 */
	
	public void despedirFuncionario() {
		retirarServico();
		setCargo("");
	}
	
}
