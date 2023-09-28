package encapsulamento;

public class Cliente_Classe {
private int id;
private String nome;
private String telefone;
private String cpf;
private String rg;
public Cliente_Classe(int id, String nome, String telefone, String cpf, String rg) {
	super();
	this.id = id;
	this.nome = nome;
	this.telefone = telefone;
	this.cpf = cpf;
	this.rg = rg;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
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

}
