//Lucas e João Gabriel

import java.util.Scanner;

import model.Conta;
import model.Despesa;
import model.Meta;
import model.Receita;

public class Programa {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        Conta conta_1 = new Conta(123,"Norberto", 1000.0, 500.0);
      
        Despesa despesa_1 = new Despesa("Agiota", 570.0, "Pendente");
                
        Meta meta_1 = new Meta(400.0, "Comprar um A14", 1200.0);
        
        Receita receita_1 = new Receita("Serviço", 200.0);
        
        System.out.println("=== SISTEMA DE CONTROLE FINCANCEIRO ===");
        System.out.println("Cliente: " + conta_1.getCliente() + " | Saldo inicial: " + conta_1.getSaldo());
        System.out.println("------------------------------------------");
        System.out.println("Deseja depositar o Salário Mensal no valor de R$200.0?  [1 - Sim / 2 - Não]: ");
        int respostaDeposito = sc.nextInt();
        
        if (respostaDeposito == 1) {
            
          conta_1.setSaldo(conta_1.getSaldo() + receita_1.getValor()); 
              
        }
        
        System.out.println("Salário adicionado com sucesso!"); 
        System.out.println("Saldo atual: " + conta_1.getSaldo());
        System.out.println("------------------------------------------");
        System.out.println("Deseja pagar a despesa (" + despesa_1.getDescricao() + ") no valor de R$" + despesa_1.getValor() + "? [1 - Sim / 2 - Não]: ");
        int respostaPagamento = sc.nextInt();
        
        if (respostaPagamento == 1) {
            
            if (conta_1.getSaldo() + conta_1.getLimite() >= despesa_1.getValor()) {
                
                conta_1.setSaldo(conta_1.getSaldo() - despesa_1.getValor()); 
                despesa_1.setStatus("Pago");
                System.out.println("Despesa paga com sucesso!"); 
                System.out.println("Saldo atual: " + conta_1.getSaldo());
                System.out.println("------------------------------------------");
                
            } else {
                
                System.out.println("ERRO! Saldo insuficiente para pagamento."); 
                
            } 
        }
        
         System.out.println("Deseja poupar R$200 para a meta (" + meta_1.getObjetivo() + ")? [1 - Sim / 2 - Não]: ");        
         int respostaPoupar = sc.nextInt();   
         
         if (respostaPoupar == 1) {
             
            if (conta_1.getSaldo() >= 200) {
                
                conta_1.setSaldo(conta_1.getSaldo() - 200);
                meta_1.setvalorPoupado(meta_1.getvalorPoupado() + 200);
                System.out.println("Dinheiro guardado na meta!");
                
            } else {
             
                System.out.println("ERRO! Saldo insuficiente para poupar.");  
             
            }
         
        }
       
        System.out.println(" "); 
        System.out.println(" "); 
        System.out.println("========================================="); 
        System.out.println("           RELATÓRIO FINANCEIRO"); 
        System.out.println("========================================="); 
        System.out.println("Conta: " + conta_1.getNumero() + " | Cliente: " + conta_1.getCliente()); 
        System.out.println("Saldo final: " + conta_1.getSaldo() + " | Limite: " + conta_1.getLimite());            
        System.out.println("Situação do (Agiota): " + despesa_1.getStatus()); 
        System.out.println("Meta (" + meta_1.getObjetivo() + "): R$" + meta_1.getvalorPoupado() + " poupados de R$" + meta_1.getvalorAlvo()); 
       
   




 } 

}
