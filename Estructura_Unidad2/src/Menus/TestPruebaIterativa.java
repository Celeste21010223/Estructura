package Menus;

import javax.swing.JOptionPane;

import Metodos.FuncionesIterativas;
import ToolsPanel.ToolsPanel;

public class TestPruebaIterativa {
	public static String listaDesplegable() {
		String valores[]= {"Funcion Iterativa","Imprime Array","Fibonacci","Tabla de multiplicar","decimalAOctal","Suma Amigos","Numero binario","Potencia de un numero","Ordena Burbuja","Factorial del 1 al 15","Octales del 1 al 20","Matrices","Multiplicacion Rusa","Funcion Akermann","Palindromo","Salir"};
		String res = (String)JOptionPane.showInputDialog(null, "M E N U", "Selecciona opcion:",JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return (res);
	}
	public static void menu3(){  
		String sel="";
		do {
			sel=TestPruebaIterativa.listaDesplegable();
			switch (sel) {
			case "Funcion Iterativa":
				FuncionesIterativas.usowhile(ToolsPanel.leerInt("Ingresa un numero"));
				break;
			case "Imprime Array":
				int a[]= {1,2,3,7,8,9,12};
			    FuncionesIterativas.imprimeArray(a);
				break;
			case "Fibonacci":
				FuncionesIterativas.fibonacci(ToolsPanel.leerInt("Ingresa un dato como tope"));
				break;
			case "Tabla de multiplicar": 
				FuncionesIterativas.multiplyTable(ToolsPanel.leerInt("Ingresa un numero"));
				break;
			case "decimalAOctal":
				ToolsPanel.imprime("NUMERO OCTAL:\n"+FuncionesIterativas.decimalAOctal(ToolsPanel.leerInt("Ingresa un dato para pasar a octal")));
				break;
			case "Suma Amigos":
				ToolsPanel.imprime("NUMEROS AMIGOS\n "+FuncionesIterativas.SumaDiviciones(ToolsPanel.leerInt("Ingresa un numero amigo")));
				break;
			case "Numero binario":
				FuncionesIterativas.decimalBin(ToolsPanel.leerInt("Ingresa un dato para pasar a binario"));
				break;
			case "Potencia de un numero":
				FuncionesIterativas.numPot(ToolsPanel.leerInt("Ingresa un numero"), ToolsPanel.leerInt("elevado a"));
				break;
			case "Ordena Burbuja":
				int dat[]= {35,8,-16,25,60,18,23};
				FuncionesIterativas.ordenaBurbuja(dat);
				ToolsPanel.imprime("Datos ordenados \n"+FuncionesIterativas.verArray(dat));
				break;
			case "Factorial del 1 al 15":
				FuncionesIterativas.factorial(ToolsPanel.leerInt("Ingresa un numero para iniciar"));
				break;
			case "Octales del 1 al 20":
				FuncionesIterativas.listaOctal(ToolsPanel.leerInt("Ingresa un dato como tope"));
				break;
			case "Matrices":
				int vec[][] = new int[4][4];
				FuncionesIterativas.leerMatriz(vec);
				FuncionesIterativas.verMatriz(vec);
				break;
			case "Multiplicacion Rusa":
				FuncionesIterativas.multiplicacionRusa(ToolsPanel.leerInt("Ingresa un dato"),ToolsPanel.leerInt("Ingresa otro dato"));
				break;
			case "Funcion Akermann":
				ToolsPanel.imprime("FUNCION AKERMANN\n"+FuncionesIterativas.akermaNN(ToolsPanel.leerInt("Ingresa un dato"),ToolsPanel.leerInt("Ingresa otro dato")));
				break;
			case "Palindromo":
				ToolsPanel.imprime("RESULTADO PALINDROMO\n" +FuncionesIterativas.espalindromo(ToolsPanel.leerString("Ingresa una frase")));
				break;
			}
		}while(!sel.equalsIgnoreCase("Salir"));
	}		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu3();
	}

}
