/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicobasico;

import javax.swing.JOptionPane;

/**
 *
 * @author Meu Computador
 */
public class Basicobasico {

    /**
     * @param args th;e command line arguments
     */
    public static void main(String[] args) {
        double valor,numero = 0,caculo1,caculo2,caculo4;
        valor = 0;
        
        
        while(valor==0){
        JOptionPane.showMessageDialog(null,"1:À vista em dinheiro ou cheque  recebe 15% de" +
"desconto\n 2:À vista no cartão de crédito  recebe 10% de desconto\n "
                + "3:Em duas vezes preço normal de etiqueta sem juros\n"
                + "4:Em três vezes  preço normal de etiqueta mais juros\n" +
"de 10% ");
        valor=Integer.parseInt(JOptionPane.showInputDialog("Informe um numero 1,2,3,4"));
         numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da compra"));
        
        }
        if(valor==1){
        caculo1=numero*0.85;
        JOptionPane.showMessageDialog(null,"preço R$:"+caculo1);
        
        }
        if(valor==2){
        caculo2=numero*0.9;
        JOptionPane.showMessageDialog(null,"preço R$:"+caculo2);
        }
        if(valor==3){
        JOptionPane.showMessageDialog(null,"preço R$:"+numero);
        
        }
        if(valor==4){
        caculo4=numero*1.1;
        JOptionPane.showMessageDialog(null,"preço R$:"+caculo4);
        }
        if(valor>=5){
        
        JOptionPane.showMessageDialog(null,"numero envalido");
        
       }
        if(valor<=0){
        
         JOptionPane.showMessageDialog(null,"numero envalido");
        }
        
        
        
        
        
    }
    
}
