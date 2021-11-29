package br.com.questaocadastroveiculo.questao5.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static Date buscaUltimoSabado() { //funcao que busca pelo sabado da ultima semana
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_WEEK, -(cal.get(Calendar.DAY_OF_WEEK) - 1));
		cal.add(Calendar.DATE, -1);
		return cal.getTime();
	}
	
	public static Date buscaUltimoDomingo() { //funcao que busca pelo domingo da ultima semana
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_WEEK, -(cal.get(Calendar.DAY_OF_WEEK) - 1));
		cal.add(Calendar.DATE, -8);
		return cal.getTime();
	}

}
