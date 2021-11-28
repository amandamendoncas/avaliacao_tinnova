/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.questoesavaliacao.questao3;

import br.com.questoesavaliacao.Util.QuestoesUtil;
import java.util.Scanner;

/**
 *
 * @author Amanda
 */
public class Questao3 {

    public static void main(String[] args) {

        //Testando a Questão 3
        // declaração das variaveis
        Scanner scanner = new Scanner(System.in);
        Fatorial fatorial = new Fatorial();
        int n;

        // recebe o valor informado pelo usuário 
        do {
            System.out.println("Digite um número(positivo) para o cálculo do fatorial: ");
            n = scanner.nextInt();
        } while (!QuestoesUtil.validarEntradaPositiva(n));

        //exibe o resultado do cálculo
        System.out.println("Resultado:");
        System.out.println(n + "! = " + fatorial.calcular(n));

    }
}
