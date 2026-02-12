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
    
    //Get (Métodos de acesso para nome)
    public String getNome(){
        return nome;
    }




}


