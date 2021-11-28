/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.questoesavaliacao.questao1;

/**
 *
 * @author Amanda
 */
public class Questao1 {

    public static void main(String[] args) {

        //Testando a Questão 1
        // Declaração de variaveis 
        Eleicao eleicao = new Eleicao();
        int totalEleitores = 1000;
        int votosValidos = 800;
        int votosBrancos = 150;
        int nulos = 50;

        try {
            //Exibição do resultado
            String resultadoBrancos = eleicao.formataResultado(eleicao.verificaVotosBrancos(totalEleitores, votosBrancos));
            String resultadoNulos = eleicao.formataResultado(eleicao.verificaVotosNulos(totalEleitores, nulos));
            String resultadoValidos = eleicao.formataResultado(eleicao.verificaVotosValidos(totalEleitores, votosValidos));
            System.out.println("Valores para o cálculo:\n");
            System.out.println("Total de Eleitores: " + totalEleitores + "\n");
            System.out.println("Votos Válidos: " + votosValidos + "\n");
            System.out.println("Votos Nulos: " + nulos + "\n");
            System.out.println("Votos Brancos: " + votosBrancos + "\n");
            System.out.println("Resultado do cálculo: \n");
            System.out.println("Percentual de votos válidos: " + resultadoValidos + "%\n");
            System.out.println("Percentual de votos nulos: " + resultadoNulos + "%\n");
            System.out.println("Percentual de votos brancos: " + resultadoBrancos + "%\n");

        } catch (ArithmeticException e) {
            System.err.println("Erro ao realizar divisão por zero");
        }
    }
}
