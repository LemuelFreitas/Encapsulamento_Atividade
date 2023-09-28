package encapsulamento;

public class main {

	public static void main(String[] args) {
		Tema_Classe tema = new Tema_Classe (1,"anonimo",850,"cor Y");
		Endereco_Classe endereco = new Endereco_Classe(1,"???", 123, "abc", "bairrozin", "cidadezinha", "cep","uf");
		ItemTema_Classe itemTema = new ItemTema_Classe(1,"anonimo","descrevendo");
		Cliente_Classe cliente = new Cliente_Classe(1,"anonimo","1529515","68468156","98756897");
		
		System.out.println(tema.getId());
		System.out.println(tema.getNome());
		System.out.println(tema.getValorAluguel());
		System.out.println(tema.getCorToalha());
		
		System.out.println(endereco.getId());
		System.out.println(endereco.getLogradouro());
		System.out.println(endereco.getNumero());
		System.out.println(endereco.getComplemento());
		System.out.println(endereco.getBairro());
		System.out.println(endereco.getCidade());
		System.out.println(endereco.getCep());
		System.out.println(endereco.getUf());
		
		System.out.println(itemTema.getId());
		System.out.println(itemTema.getNome());
		System.out.println(itemTema.getDescricao());
		
		System.out.println(cliente.getId() );
		System.out.println(cliente.getNome());
		System.out.println(cliente.getTelefone());
		System.out.println(cliente.getCpf());
		System.out.println(cliente.getRg());
	}

}
