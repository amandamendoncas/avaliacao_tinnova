/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.questoesavaliacao.questao2;

import br.com.questoesavaliacao.Util.QuestoesUtil;

/**
 *
 * @author Amanda
 */
public class Questao2 {

    public static void main(String[] args) {

        //Testando a Questão 2
        BubbleSort ordenacao = new BubbleSort();
        //Declaração do vetor
        int v[] = new int[8];
        v[0] = 5;
        v[1] = 3;
        v[2] = 2;
        v[3] = 4;
        v[4] = 7;
        v[5] = 1;
        v[6] = 0;
        v[7] = 6;

        //Exibição do resultado
        System.out.println("Ordenação do vetor: \n");
        System.out.println("Vetor original:");
        System.out.println(QuestoesUtil.exibeVetor(v));
        System.out.println("\nVetor ordenado:");
        ordenacao.sort(v);
        System.out.println(QuestoesUtil.exibeVetor(v));

    }

}
