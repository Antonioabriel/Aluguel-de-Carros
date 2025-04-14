package br.com.criandoapi.projeto.model;

import java.sql.Date;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Integer id;
	
	@Column(name = "nome", length = 200,nullable = true)
	private String nome;
	
	@Column(name = "email", length = 50,nullable = true)
	private String email;
	
	@Column(name = "senha", columnDefinition = "TEXT",nullable = true)
	private String senha;
	
	@Column(name = "telefone", length = 15,nullable = true)
	private String telefone;
	
	@Column(name = "cpf", length = 11, unique = true, nullable = false)
    private String cpf;

    @Column(name = "logradouro", length = 255, nullable = false)
    private String logradouro;



    @Column(name = "cep", length = 8, nullable = false)
    private String cep;

    @Column(name = "municipio", length = 100, nullable = false)
    private String municipio;
    
    @Column(name = "numero_casa", length = 100, nullable = false)
    private String numero_casa;

    
	@Column(name = "estado", length = 2, nullable = false)
    private String estado;

	@Column(name = "cnh_numero", length = 20, nullable = false)
    private String cnh_numero;
	
	@Column(name = "cnh_categoria", length = 2, nullable = false)
    private String cnh_categoria;
	
	@Column(name = "cnh_validade", nullable = false)
    private Date cnh_validade;
	
	@Column(name = "data_nascimento", nullable = false)
    private Date data_nascimento;
	
	public Date getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public Date getCnh_validade() {
		return cnh_validade;
	}
	public void setCnh_validade(Date cnh_validade) {
		this.cnh_validade = cnh_validade;
	}
	public String getCnh_categoria() {
		return cnh_categoria;
	}
	public void setCnh_categoria(String cnh_categoria) {
		this.cnh_categoria = cnh_categoria;
	}
	
	public String getCnh_numero() {
		return cnh_numero;
	}
	public void setCnh_numero(String cnh_numero) {
		this.cnh_numero = cnh_numero;
	}
	
	public String getNumero_casa() {
		return numero_casa;
	}
	public void setNumero_casa(String municipio2) {
		this.numero_casa = municipio2;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
