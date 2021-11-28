/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.questoesavaliacao.questao4;

/**
 *
 * @author Amanda
 */
public class Multiplos {

    // método que calcula os multiplos de 3 e 5 
    // o método considera para cálculo os números menores do que o valor informado pelo usuário
    public int calcularMultiplos(int n) {
        int soma = 0;
        for (int i = n-1; i > 0; i--) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i;
            }
        }
        return soma;
    }

}
