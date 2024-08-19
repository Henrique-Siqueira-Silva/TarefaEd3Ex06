package view;
import javax.swing.JOptionPane;
import controller.TarefaEd3EX06;

public class Main {
		public static void main(String[] args) {
		TarefaEd3EX06 m = new TarefaEd3EX06();
		double num = 0;

		num = Integer.parseInt(JOptionPane.showInputDialog("um numero da sequencia "));
		
		
		
		num = m.Ex06(num);
		System.out.println(num);
	}
}