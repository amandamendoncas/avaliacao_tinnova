/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.questoesavaliacao.questao4;

import br.com.questoesavaliacao.Util.QuestoesUtil;
import java.util.Scanner;

/**
 *
 * @author Amanda
 */
public class Questao4 {

    public static void main(String[] args) {

        //Testando a Questão 4
        // declaração das variaveis
        Scanner scanner = new Scanner(System.in);
        Multiplos multiplos = new Multiplos();
        int n;

        // recebe o valor informado pelo usuário 
        do {
            System.out.println("Digite um número(positivo): ");
            n = scanner.nextInt();
        } while (!QuestoesUtil.validarEntradaPositiva(n));

        //exibe o resultado do cálculo
        System.out.println("A soma dos múltiplos de 3 e 5 é: " + multiplos.calcularMultiplos(n));

    }
}
