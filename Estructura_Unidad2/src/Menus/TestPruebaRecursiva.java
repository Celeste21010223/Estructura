package Menus;

import javax.swing.JOptionPane;
import Metodos.FuncionesRecursivas;
import ToolsPanel.ToolsPanel;

public class TestPruebaRecursiva {
	public static void menu3(){  
		String sel="";
		do {
			sel=TestPruebaRecursiva.listaDesplegable();
			switch (sel) {
			case "Funcion Recursiva":
				ToolsPanel.imprime("LISTA DEL ARREGLO: \n"+FuncionesRecursivas.funcionRecursiva(ToolsPanel.leerInt("Ingresa un dato"), ToolsPanel.leerInt("Ingresa un dato")));
				break;
			case "Imprime Array":
				int a[]= {1,2,3,7,8,9,12};
				ToolsPanel.imprime("LISTA DEL ARREGLO: \n"+FuncionesRecursivas.imprimeArray(a, 0));
				break;
			case "Fibonacci":
				ToolsPanel.imprime("SUCESION:\n"+FuncionesRecursivas.fibonacci(20, sel, 0,0 , 1));
				break;
			case "Tabla de multiplicar": 
				ToolsPanel.imprime("TABLA DE MULTIPLICAR\n"+FuncionesRecursivas.multiplicationTable(ToolsPanel.leerInt("Ingresa un numero a multiplicar"),ToolsPanel.leerInt("Ingresa otro numero para multiplicar el primero"),10));
				break;
			case "decimalAOctal":
				ToolsPanel.imprime("NUMERO OCTAL:\n"+FuncionesRecursivas.decimalAOctal(ToolsPanel.leerInt("Ingresa un dato para pasar a octal")));
				break;
			case "Suma Amigos":
				ToolsPanel.imprime("NUMEROS AMIGOS: \n"+FuncionesRecursivas.SumaDivi(ToolsPanel.leerInt("Ingresa tu numero amigo"), 1));
				break;
			case "Numero binario":
				ToolsPanel.imprime("NUMERO BINARIO:\n"+FuncionesRecursivas.numBin(ToolsPanel.leerInt("Ingresa un dato para pasar a binario")));
				break;
			case "Potencia de un numero":
				ToolsPanel.imprime("POTENCIA  "+FuncionesRecursivas.numPot(ToolsPanel.leerInt("Ingresa un numero"), ToolsPanel.leerInt("Ingresa tu numero a elevar")));
				break;
			case "Ordena Burbuja":
				int dat[]= {35,8,-16,25,60,18,23};
				FuncionesRecursivas.ordenaBurbuja(dat, 0);
				ToolsPanel.imprime("Datos ordenados \n"+FuncionesRecursivas.verArray(0, dat));
				break;
			case "Factorial del 1 al 15":
				ToolsPanel.imprime("LISTA FACTORIAL DEL 1 AL 15\n"+FuncionesRecursivas.factorial(ToolsPanel.leerInt("Ingresa un numero para iniciar"), 1));
				break;
			case "Octales del 1 al 20":
				ToolsPanel.imprime("LISTA OCTALES DEL 1 AL 20:\n"+FuncionesRecursivas.toOctal(ToolsPanel.leerInt("Ingresa un numero como tope")));
				break;
			case "Matrices":
				int vec[][] = new int[4][4];
				ToolsPanel.imprime("MATRICES DE 4 X 4 \n" +FuncionesRecursivas.leerMatriz(vec,0,0));
				break;
			case "Multiplicacion Rusa":
				ToolsPanel.imprime("MULTIPLICACION RUSA:"+FuncionesRecursivas.multiplicacionRusa(ToolsPanel.leerInt("Ingresa un dato"),ToolsPanel.leerInt("Ingresa otro dato")));
				break;
			case "Funcion Akermann":
				ToolsPanel.imprime("FUNCION AKERMANN\n"+FuncionesRecursivas.akermaNN(ToolsPanel.leerInt("Ingresa un dato"),ToolsPanel.leerInt("Ingresa otro dato")));
				break;
			case "Palindromo":
				ToolsPanel.imprime("RESULTADO PALINDROMO\n" +FuncionesRecursivas.esPalindrome(ToolsPanel.leerString("Ingresa una frase")));
				break;
			}
		}while(!sel.equalsIgnoreCase("Salir"));
	}		

	public static String listaDesplegable() {
		String valores[]= {"Funcion Recursiva","Imprime Array","Fibonacci","Tabla de multiplicar","decimalAOctal","Suma Amigos","Numero binario","Potencia de un numero","Ordena Burbuja","Factorial del 1 al 15","Octales del 1 al 20","Matrices","Multiplicacion Rusa","Funcion Akermann","Palindromo","Salir"};
		String res = (String)JOptionPane.showInputDialog(null, "M E N U", "Selecciona opcion:",JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return (res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestPruebaRecursiva.menu3();
	}

}
