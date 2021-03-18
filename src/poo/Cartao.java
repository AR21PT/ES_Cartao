package poo;

/**
 * A classe Cartão contém métodos para realizar operações básicas
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
	
	// Métodos
	
	
	/**
	 * Retirar o funcionário do serviço
	 */
	public void retirarServico() {
		// servico = "";
		setServico("");
	}
	
	/**
	 * Atribuir um novo serviço ao funcionário;
	 * @param novoServico
	 */
	
	public void atribuirNovoServico( String novoServico ) {
		//servico = novoServico;
		setServico( novoServico );
	}
	
	/**
	 * Promover o funcionário a um novo cargo;
	 * @param novoCargo
	 */
	
	public void promoverNovoCargo( String novoCargo ) {
		//cargo = novoCargo;
		setCargo(novoCargo);
	}
	
	/**
	 * Despedir um funcionário (ficar sem serviço e sem cargo).
	 */
	
	public void despedirFuncionario() {
		retirarServico();
		setCargo("");
	}
	
}
