package br.com.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Funcionarios implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	private String sobrenome;
	private String idade;
	private String sexo;
	private String cpf;
	private String rg;
	private String email;
	private String login;
	private String senha;
	private String funcao;
	private Double salario;
	private Boolean ativo;
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String numeroCasa;
	private String localidade;
	private String uf;
	private String telefoneFixo;
	private String celular;
	
	@Transient
	private Integer clientesCadastrados;
	
	@Transient
	private Integer pedidosCadastrados;
	
	@Transient
	private Integer orcamentosCotados;
	
	@Transient
	private Integer pedidosEntregues;
	
	@Transient
	private Integer totalFuncionariosAtivos;
	
	@Transient
	private Integer totalEstoque;
	
	
	
	

	
	@Column(columnDefinition = "text") // tipo text grava arquivos em base 64
	private String fotoIconBase64;

	private String extensao; // Extensao jpg, png, jpg, etc

	@Lob // Gravar arquivos no banco de dados
	@Basic(fetch = FetchType.LAZY)
	private byte[] fotoIconbase64original;
	
	
	@OneToMany(mappedBy = "funcionarios", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<Clientes> clientes = new ArrayList<Clientes>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	
	
	
	
	
	public Integer getTotalEstoque() {
		return totalEstoque;
	}
	public void setTotalEstoque(Integer totalEstoque) {
		this.totalEstoque = totalEstoque;
	}
	public Integer getTotalFuncionariosAtivos() {
		return totalFuncionariosAtivos;
	}
	public void setTotalFuncionariosAtivos(Integer totalFuncionariosAtivos) {
		this.totalFuncionariosAtivos = totalFuncionariosAtivos;
	}
	public Integer getClientesCadastrados() {
		return clientesCadastrados;
	}
	public void setClientesCadastrados(Integer clientesCadastrados) {
		this.clientesCadastrados = clientesCadastrados;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	
	
	
	
	public Integer getPedidosCadastrados() {
		return pedidosCadastrados;
	}
	public void setPedidosCadastrados(Integer pedidosCadastrados) {
		this.pedidosCadastrados = pedidosCadastrados;
	}
	public Integer getOrcamentosCotados() {
		return orcamentosCotados;
	}
	public void setOrcamentosCotados(Integer orcamentosCotados) {
		this.orcamentosCotados = orcamentosCotados;
	}
	public Integer getPedidosEntregues() {
		return pedidosEntregues;
	}
	public void setPedidosEntregues(Integer pedidosEntregues) {
		this.pedidosEntregues = pedidosEntregues;
	}
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getTelefoneFixo() {
		return telefoneFixo;
	}
	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
	
	
	
	
	
	
	public String getFotoIconBase64() {
		return fotoIconBase64;
	}
	public void setFotoIconBase64(String fotoIconBase64) {
		this.fotoIconBase64 = fotoIconBase64;
	}
	public String getExtensao() {
		return extensao;
	}
	public void setExtensao(String extensao) {
		this.extensao = extensao;
	}
	public byte[] getFotoIconbase64original() {
		return fotoIconbase64original;
	}
	public void setFotoIconbase64original(byte[] fotoIconbase64original) {
		this.fotoIconbase64original = fotoIconbase64original;
	}
	public List<Clientes> getClientes() {
		return clientes;
	}
	public void setClientes(List<Clientes> clientes) {
		this.clientes = clientes;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionarios other = (Funcionarios) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Funcionarios [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", idade=" + idade + ", sexo="
				+ sexo + ", cpf=" + cpf + ", rg=" + rg + ", email=" + email + ", login=" + login + ", senha=" + senha
				+ ", funcao=" + funcao + ", salario=" + salario + ", ativo=" + ativo + ", cep=" + cep + ", logradouro="
				+ logradouro + ", complemento=" + complemento + ", bairro=" + bairro + ", numeroCasa=" + numeroCasa
				+ ", localidade=" + localidade + ", uf=" + uf + ", telefoneFixo=" + telefoneFixo + ", celular="
				+ celular + "]";
	}
	
	
	
	
	
	
}
