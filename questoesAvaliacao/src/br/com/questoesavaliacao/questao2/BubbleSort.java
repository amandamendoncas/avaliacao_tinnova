/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.questoesavaliacao.questao2;

/**
 *
 * @author Amanda
 */
public class BubbleSort {

    //método que realiza a ordenação de um vetor passado como parametro
    public void sort(int[] vetor) {
        int marcacao = vetor.length - 1;
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < marcacao; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
            marcacao--;
        }

    }

}
