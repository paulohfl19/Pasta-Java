    package main.java.com.sgp.app;

    import main.java.com.sgp.model.Pessoa;

public class Main {
    
        public static void main(String[] args) {
            
            Pessoa pessoanula = null;

            //Criando um objeto da classe Pessoa usando o construtor parametrizado
            Pessoa aluno = new Pessoa("Paulo",12);
            
            Pessoa pessoaPadrao = new Pessoa();

        }
    
        public void imprimirPessoa(Pessoa pessoa) {
            if (pessoa == null) {
                System.out.println("Pessoa não inicializada");
            return;
            }   
        pessoa.saudacao();
        System.out.println(pessoa.toString());
        
    
    
    
    
    }

}
