package model;

public class Conta {
    
    //atributos 
    private int numero;
    private String cliente;
    private double saldo;
    private double limite;
    
   
    //construtor
    public Conta (int numero, String cliente, double saldo, double limite){

        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
        this.limite = limite;
         
    }
     
     
    //getters e setters  
    public int getNumero(){
        return this.numero;
    }
     
    public void setNumero(int numero) {
        this.numero = numero;
    }
     
    public String getCliente(){
        return this.cliente;
    }
    
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
     
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double getLimite(){
        return this.limite;
    }
    
    public void setLimite(double limite) {
        this.limite = limite;
    }     
    
}