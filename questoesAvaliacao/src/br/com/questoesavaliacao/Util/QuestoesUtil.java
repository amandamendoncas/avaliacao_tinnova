/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.questoesavaliacao.Util;

/**
 *
 * @author Amanda
 */
public class QuestoesUtil {

    // método utilizado para printar um vetor passado como parametro
    public static String exibeVetor(int[] vetor) {
        String vetorExibicao = "v = {";

        for (int i = 0; i < vetor.length - 1; i++) {
            vetorExibicao += vetor[i] + ", ";
        }
        vetorExibicao += vetor[vetor.length - 1];
        vetorExibicao += "}";
        return vetorExibicao;

    }

    // função que valida se número informado pelo usuário é positivo
    public static boolean validarEntradaPositiva(int n) {
        if (n < 0) {
            return false;
        }
        return true;

    }

}
