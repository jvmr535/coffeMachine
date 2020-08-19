package maquina.de.café;

import java.io.IOException;
import java.util.Scanner;

public class MaquinaDeCafé {

    public static void main(String[] args) throws InterruptedException {
        
        Scanner moeda = new Scanner(System.in);
        
        int qtd_cafe = 1;
        
       
        while(true){
        if (qtd_cafe >= 1){
            System.out.println("------------------------------------------");
            System.out.println("Precione ENTER para inserir uma moeda");
            System.out.println("------------------------------------------");
            moeda.nextLine();
            
            try{
                System.out.println("-------------------------------------------");
                System.out.println("Aguarde enquanto a maquina prepara seu café");
                System.out.println("-------------------------------------------");
                for(int i=5; i>=0; i--){
                    Thread.sleep(1000);
                    System.out.println(i+"...");
                }
                qtd_cafe--;
                System.out.println("---------------");
                System.out.println("Retire seu café");
                System.out.println("---------------");
                for(int i=5; i>=0; i--){
                    Thread.sleep(1000);
                    System.out.println(i+"...");
                }
            }
            catch(Exception e){
                System.out.println("Erro");
            }
        }
        else{
            Scanner confirm = new Scanner(System.in);
            
            System.out.println("Não há café disponível, deseja reabastecer a máquina?");
            System.out.println("1 - SIM");
            System.out.println("2 - NÃO");
            int conf;
            conf = confirm.nextInt();
            
            if(conf == 1){
                Scanner unidades_abastecer = new Scanner(System.in);
                System.out.println("Deseja reabestecer quantas unidades de café?");
                int uni = unidades_abastecer.nextInt();
                qtd_cafe = qtd_cafe + uni;
            } 
            else if(conf == 2){
                break;
            }
            else{
                System.out.println("Opção inválida");
            }
        }
    }
    }
}
