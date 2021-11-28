/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.questoesavaliacao.questao1;

import java.text.DecimalFormat;

/**
 *
 * @author Amanda
 */
public class Eleicao {

    //metodo que calcula o percentual de votos validos  
    public float verificaVotosValidos(int totalEleitores, int votosValidos) {
        float resultado;
        resultado = (float) votosValidos / totalEleitores;
        return resultado * 100;

    }

    //metodo que calcula o percentual de votos brancos
    public float verificaVotosBrancos(int totalEleitores, int votosBrancos) {
        float resultado = (float) votosBrancos / totalEleitores;
        return resultado * 100;

    }

    //metodo que calcula o percentual de votos nulos
    public float verificaVotosNulos(int totalEleitores, int votosNulos) {
        float resultado = (float) votosNulos / totalEleitores;
        return resultado * 100;
    }

    //metodo utilizado para formatar a exibicao do resultado de porcentagem
    public String formataResultado(float resultado) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(resultado);

    }

}
