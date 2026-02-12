package main.java.com.sgp.model;

public class Pessoa { 
    //Atributos
    //Características / Tipo / Apelido
    private String nome;
    private int idade;

    //Construtores
    //Exemplos de Polimorfismo
    
    //Construtor parametrizado
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    
    }

    //Construtor padrão
    public Pessoa(){
        this.nome = "Paulo";
        this.idade = 16;
    }

    //Métodos específicos

    public void saudacao(){
        System.out.println("Olá, " + nome + "!" + " Você tem " + idade + "anos");
    }


    //Getters e Setters
    //Métodos de acesso e modificação para os atributos privados
    
    //Get (Métodos de acesso para nome)
    public String getNome(){
        return nome;
    }

    //Get (Métodos de acesso para idade)
    public int getIdade(){  
        return idade;
    }     

    //Set (Métodos de modificação para nome)
    public void setNome(String nome){
        this.nome = nome;
    }       

    //Set (Métodos de modificação para idade)  
    public void setIdade(int idade){
        this.idade = idade;
    }


    //Métodos de Sobrescrita (Override)
    //Exemplo de sobrescrita do método toString para exibir informações da pessoa
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }








}


