/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.questoesavaliacao.questao3;

/**
 *
 * @author Amanda
 */
public class Fatorial {

    //funcao que realiza o cálculo do fatorial
    public int calcular(int n) {
        if (n == 0) {
            return 1;
        } else {
            int aux = 1;
            for (int i = 1; i <= n; i++) {
                aux = aux * i;
            }
            return aux;
        }
    }



}
