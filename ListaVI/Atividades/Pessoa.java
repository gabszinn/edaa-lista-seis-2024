public class Pessoa {

    String nome;
    int idade;
  
    public String getNome() {
      return nome;
    }
  
    public void setNome(String nome) {
      this.nome = nome;
    }
  
    public Pessoa(String nome) {
      this.nome = nome;
    }
  
    public int getIdade() {
      return idade;
    }
  
    public void setIdade(int idade) {
      this.idade = idade;
    }
  
    public Pessoa(String nome, int idade) {
      this.nome = nome;
      this.idade = idade;
    }
    
  }
