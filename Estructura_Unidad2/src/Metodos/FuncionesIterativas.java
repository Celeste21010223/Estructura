package Metodos;
import ToolsPanel.ToolsPanel;
public class FuncionesIterativas {
public static void usowhile(int n) {
	int j=1;
	String cad="";
	while(j<=n) {
		cad+="\n"+j++;
	}
	ToolsPanel.imprime("Lista " +cad);
}
public static void usoFor(int n) {
	for (int j=1; j<=n; j++) {
		j++;
	}
}
public static void usoDoWhile(int n) {
	int j=1;
	do {
		j++;
	}while(j<=n);
}
public static void imprimeArray(int a[]) {
	String lista="";
	for(int j=0; j<a.length;j++) {
		lista+=j+"["+a[j]+"]\n";
	}
	ToolsPanel.imprime("LISTA DEL ARREGLO:\n"+lista);
}
public static void multiplyTable(int number) {
	String table = "";
	int res=0, tope=10;
	for (int i = 1; i <=tope; i++) {
		res = number *i;
		table+= number + " x " + i + " = " + res + "\n";
	}
	ToolsPanel.imprime("tabla de multiplicar\n"+table);
}
public static int SumaDiviciones(int dato) {
	int i = 1, suma = 0;
	do {
		if (dato % i == 0)
			suma += i;
			i++;
	} while (i < dato);
	return suma;
}
public static String decimalAOctal(int decimal) {
    String octal = "";
    String caracteresOctales = "01234567";
    while (decimal>0) {
        int residuo = decimal % 8;
        octal = (caracteresOctales.charAt(residuo) + octal);
        decimal /= 8;
    }
    return octal +"\n";

}


public static void fibonacci(long posicion) {
	long siguiente = 1, actual = 0, temporal = 0;
	String cad="";
	for (long x = 1; x <= posicion; x++) {
		cad+=actual + ", ";
		temporal = actual;
		actual = siguiente;
		siguiente = siguiente + temporal;
	}
	ToolsPanel.imprime("LISTA DE FIBONACCI:\n"+cad);
}
public static void decimalBin(int bin) {
	String binario = Integer.toBinaryString(bin);
	ToolsPanel.imprime("DECIMAL A BINARIO \n" +binario);
    }
   
public static void numPot(int n1, int n2) {
	int resultado=n1;	
	while(n2>1){
		resultado= resultado*n1;
		n2--;
	}
	
	ToolsPanel.imprime("la potencia del numero " +n1+" es: "+resultado);
}
public static void ordenaBurbuja(int datos[]) {
	int i,j,aux;
	for(i=0; i<datos.length-1;i++) {
		for(j=i+1; j< datos.length ; j++) {
			if (datos[i]>datos[j]) {
				aux=datos[i];
				datos[i]= datos[j];
				datos[j]= aux;
			}
			//> //<
		}
	}
}
public static String verArray(int datos[]) {
	String cad="";
	for (int k=0; k<datos.length; k++) {
		cad+=k + "["+datos[k]+"]"+"\n";
	}
	return cad;
}
public static void factorial(int dato) {
	int f = 1, c = 1;
	String cad="";
	while(c <= dato) {
		f *= c;
		cad+=f+"\n";
		c++;
	}
	ToolsPanel.imprime("LOS FACTORIALES DEL 1 AL 15 SON:\n"+cad+"\n");
}

public static void listaOctal(int dato) {
	int c;
	String cad="";
	for(c=1; c<=dato; dato-=1 ){
	    cad+=dato+" en octal: " + Integer.toOctalString(dato) + "\n"; 
	}
	ToolsPanel.imprime("LOS OCTALES DEL 1 AL 20 SON:\n"+cad+"\n");
}
public static void decimalHexa(int dato) {
		int c;
		String cad="";
		for(c=1; c<=dato; dato-=1 ){
		    cad+=dato+" en hexadecimal: " + Integer.toHexString(dato) + "\n"; 
}
	ToolsPanel.imprime("LOS HEXADECIMALES DEL 1 AL 20 SON:\n"+cad+"\n");
}
public static void leerMatriz(int arr[][]) {
	int i,j;
	for (i=0; i<arr.length; i++) {
		for(j=0; j<arr[0].length; j++) {
			arr[i][j]= ToolsPanel.leerInt("DATO");//JOptionPane.showInputDialog(parentComponent: null, message :"Dato"
		}
	}
}
public static void verMatriz(int arr[][]) {
	int i,j;
	String cad="";
	for (i=0; i<arr.length; i++) {
		for(j=0; j<arr[0].length; j++) {
			cad+=arr[i][j]+" ";
		}
		cad+=" \n ";
	}
	ToolsPanel.imprime("Array bidimensional\n " +cad);
}
public static void multiplicacionRusa(int a, int b) {
	 int c=0;
	    while(a!=0){
	        if(a % 2 != 0){
	            c = c + b;
	        }
	        a = a / 2;
	        b = b * 2;
	    }
	    ToolsPanel.imprime("RESULTADO DE MULTIPLICACION RUSA : " +c);
}
public static long akermaNN(int m, long n) {
	while (m==0) {
		return n+1;
	}while(m>0 && n==0) {
			return akermaNN(m-1,1);
		}while(m>0 && n>0){
				return akermaNN(m-1,akermaNN(m,n-1));
		}
	return n;
}
public static boolean espalindromo(String cadena){
	cadena= cadena.replaceAll(" ", " ");
	boolean valor=true;
	int i,ind;
	String cadena2="";//quitamos los espacios
	for (int x=0; x < cadena.length(); x++) {
		if (cadena.charAt(x) != ' ')
			cadena2 += cadena.charAt(x);
		}//volvemos a asignar variables
	cadena=cadena2;
	ind=cadena.length();//comparamos cadenas
	for (i= 0 ;i < (cadena.length()); i++){
		if (cadena.substring(i, i+1).equals(cadena.substring(ind -1, ind)) == false ) {//si una sola letra no corresponde no es un palindromo por tanto//sale del ciclo con valor false
			valor=false;
			break;
			}
		ind--;
			}
	return valor;
			
}

public static void main(String[]args) {
	//int a[]= {1,2,4,5,7,8};
	//FuncionesIterativas.imprimeArray(a);
	//ToolsPanel.imprime(FuncionesIterativas.decimalAOctal(183));
	//FuncionesIterativas.fibonacci(20);
	//ToolsPanel.imprime(""+FuncionesIterativas.numBin(11));
	//ToolsPanel.imprime("Convirtiendo de binario a entero el número : "  + FuncionesIterativas.numBin("10"));
	//FuncionesIterativas.numPot(2, 3);
	//int dat[]= {35,8,-16,25,60,18,23};
	//FuncionesIterativas.ordenaBurbuja(dat);
	//ToolsPanel.imprime("Datos ordenados \n"+FuncionesIterativas.verArray(dat));
	//FuncionesIterativas.listaOctal(20);
	//FuncionesIterativas.factorial(15);
	//FuncionesIterativas.decimalOctal(20);
	//FuncionesIterativas.multiplyTable(1);
	//int vec[][] = new int[4][4];
	//FuncionesIterativas.leerMatriz(vec);
	//FuncionesIterativas.verMatriz(vec);
	//FuncionesIterativas.decimalHexa(20);
	//FuncionesIterativas.multiplicacionRusa(37, 6);
	//ToolsPanel.imprime("FUNCION AKERMANN\n"+FuncionesIterativas.akermaNN(0, 4));
	//ToolsPanel.imprime("RESULTADO PALINDROMO\n" +FuncionesIterativas.espalindromo("la ruta natural"));
}
	 
}
