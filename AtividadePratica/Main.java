

public class Main {
private static String nome;
private static String cpf;
private static int idade;


public static void main(String[] args) {

    Pessoa p1 = new Pessoa(nome,cpf,idade);
    GerenciadorDePessoas gerenciador = new GerenciadorDePessoas();

    p1.setNome("Maria"); 
    p1.setCpf("123.456.789-12"); 
    p1.setIdade(35);
    System.out.println("Nome: " + p1.getNome() + " Cpf: " + p1.getCpf() + " Idade: " + p1.getIdade());

    gerenciador.cadastrarPessoa1(new Pessoa("Pedro Sousa","5555",32));
    gerenciador.cadastrarPessoa2(new Pessoa("Ana Silva","334.344-56",25));

    System.out.println("Informações da pessoa1");
    gerenciador.exibirPessoa1();
    System.out.println("Informações da pessoa2");
    gerenciador.exibirPessoa2();

    gerenciador.atualizarPessoa1(new Pessoa("Marcos Silva", "555.000.111-22",42));
    System.out.println("\nInformações da Pessoa1 (atualizadas):");
    gerenciador.exibirPessoa1();

}
}
