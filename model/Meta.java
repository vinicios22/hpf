package model;

public class Meta {
    
    //atributos 
    private String objetivo;
    private double valorAlvo;
    private double valorPoupado;
    
    //construtor
    public Meta() {
        
    }
    public Meta (double valorPoupado, String objetivo, double valorAlvo){

        this.valorPoupado = valorPoupado;
        this.objetivo = objetivo;
        this.valorAlvo = valorAlvo;
        
    }

    //getters e setters  
    public String getObjetivo(){
        return this.objetivo;
    }
    
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
     
    public double getValorAlvo(){
        return this.valorAlvo;
    }
     
    public void setvalorAlvo(double valoralvo) {
        this.valorAlvo = valoralvo;
    }
     
    public double getValorPoupado(){
        return this.valorPoupado;
    }
    
    public void setValorPoupado(double valorPoupado) {
        this.valorPoupado = valorpoupado;
    }
    
}
