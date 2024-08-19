package controller;

public class TarefaEd3EX06 {
	
	public TarefaEd3EX06 () {
		super();
	}
		
	public double Ex06 (double num){
		if (num < 2) {
			return num;
//		aqui o programa returna o resultado da função "num" quando ele for menor que 2, ou seja, quando a função já tiver somado todas as sequencias ate o numero desejado
			
		}
		else {
			num = (double) 1/(Fatorial(num))+ Ex06(num -1);
		

		}
		return Ex06 (num);
//		o paremetro retorna apenas num pois o tratamento da função fatorial esta sendo feito dentro do metodo
	}
	
	public double Fatorial (double num) {
		if (num == 0 ) {
			return 1;
		}else {
			return num * Fatorial(num -1);
		}
	
	}
}
