/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package raiodeumcirculo;

import java.util.Scanner;

/**
 *
 * @author OK
 */
public class RaioDeUmCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double raio, area;
        double PI=3.1416;
        
        System.out.print("Insira o valor do raio:");
        Scanner ler=new Scanner(System.in);
        raio=ler.nextDouble();
        
        area=PI*(raio*raio);
        System.out.print("O valor da área é:"+area);

    }
    
}
