
public class GerenciadorDePessoas {

 private Pessoa pessoa1;
 private Pessoa pessoa2;

public void cadastrarPessoa1(Pessoa pessoa){
    this.pessoa1 = pessoa;
}
public void cadastrarPessoa2(Pessoa pessoa){
    this.pessoa2 = pessoa;
}
public void atualizarPessoa1(Pessoa pessoa){
    this.pessoa1 = pessoa;
}
public void atualizarPessoa2(Pessoa pessoa){
    this.pessoa2 = pessoa;
}
public void exibirPessoa1(){
    if (pessoa1 !=null) {
      System.out.println("Nome:" + pessoa1.getNome());  
      System.out.println("CPF:" + pessoa1.getCpf()); 
      System.out.println("Idade:" + pessoa1.getIdade()); 
    }else{
        System.out.println("Pessoa não cadastrada.");
    }
}
public void exibirPessoa2(){
    if (pessoa2 != null) {
      System.out.println("Nome:" + pessoa2.getNome());  
      System.out.println("CPF:" + pessoa2.getCpf()); 
      System.out.println("Idade:" + pessoa2.getIdade()); 
    }else{
        System.out.println("Pessoa não cadastrada.");
    }
}

}