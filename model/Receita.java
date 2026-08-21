package model;

public class Receita {
    
    //atributos 
    private String origem;
    private double valor;
    
    //construtor
    public Receita (String origem, double valor){

        this.origem = origem;
        this.valor = valor;
         
    }

    //getters e setters
    public String getOrigem(){
        return this.origem;
    }
     
    public void setOrigem(String origem){
        this.origem = origem;
    }
     
    public double getValor(){
        return this.valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
}