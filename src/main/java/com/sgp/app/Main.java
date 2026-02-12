    package main.java.com.sgp.app;    
    
    
    
    
    public class Main {
    
        public static void main(String[] args) {
            //Criando um objeto da classe Pessoa usando o construtor parametrizado
            Pessoa aluno = new Pessoa(nome: "Paulo", idade: 16);
            aluno.saudacao(); // Saída: Olá, Paulo! Você tem 16 anos

            //Criando um objeto da classe Pessoa usando o construtor padrão
            Pessoa aluno2 = new Pessoa();
            aluno2.saudacao(); // Saída: Olá, Paulo! Você tem 16 anos

            //Modificando os atributos do objeto pessoa2 usando os setters
            aluno2.setNome("João");
            aluno2.setIdade(30);
            aluno2.saudacao(); // Saída: Olá, João! Você tem 30 anos

            //Exibindo as informações dos objetos usando o método toString
            System.out.println(aluno2); // Saída: Pessoa{nome='Maria', idade=25}
            System.out.println(aluno2); // Saída: Pessoa{nome='João', idade=30}
        }
    }


