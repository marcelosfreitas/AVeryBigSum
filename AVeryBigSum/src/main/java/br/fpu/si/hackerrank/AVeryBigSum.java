package br.fpu.si.hackerrank;

public class AVeryBigSum {
	public Long bigSum(Long... entradas) {
		
		Long soma = 0l;
		
		for(Long entrada : entradas){
			soma += entrada;
		}
		
		return soma;
	}
}
