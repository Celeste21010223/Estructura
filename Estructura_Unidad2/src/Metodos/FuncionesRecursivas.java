package Metodos;
import ToolsPanel.ToolsPanel;

public class FuncionesRecursivas {
public static String funcionRecursiva(int j , int n) {
	if(j<=n) {
		//System.out.println("Incremento"+j);
		return "\n"+j+funcionRecursiva(j+1,n);
	}
	else {
		return "";
	}
}
public static String imprimeArray(int a[], int j) {
	String lista="";
	if(j<a.length) {
		return lista+=j+"["+a[j]+"]\n"+imprimeArray(a, j+1);
	}
	else {
		return ""; 
		
	}
}
public static String multiplicationTable(int i, int num, int tope) {
	int res=0;
	String table = "";
	if (i <=tope) {
		res = num *i;
		table+= num + "*" + i + "=" + res + "\n" + multiplicationTable(i+1, num,tope); 
	}
	return table;
		
}
public static String fibonacci(int posicion, String res, int aux, 
		int a, int b) {
	if (posicion > 0) {
		return fibonacci(posicion-1, res=res+" ,"+a, 
				aux=a, a=b, b=aux+b);
	}
	return res;
}
public static int decimalAOctal(int decimal) {
  
	     if (decimal<=0)  
	    	 return decimal;  
	     else 
	    	 return decimal%8+decimalAOctal(decimal/8)*10;
}
public static int SumaDivi(int dato, int k) {
	int suma = 0;
	if (k < dato) {
		if (dato % k == 0)
			suma += k;
		return suma + SumaDivi(dato, (int) (k + 1));
	}
	return suma;
}
public static int numBin(int num) {
	if(num<2)return num;
	else return num%2+numBin(num/2)*10;
}
public static int numPot(int n1, int n2) {
	if(n2<=0){
        return 1;
    } else  {
    	return n1 * numPot(n1, n2-1);

    }
}
public static String verArray(int j, int datos[]) {
	
	if (j<datos.length) {
		return "\n" + j + "["+datos[j]+"]"+verArray((j+1),datos);
	}
	else {
		return "";
	}
}
public static String ordenaBurbuja(int datos[], int i) {
	if(i<datos.length-1) {
		return burbujaIntercambio(datos,i,i+1)+ordenaBurbuja(datos, i+1);
	}else return "";
	
}
public static String burbujaIntercambio(int datos[], int i, int j) {
	int aux=0;
	if (j<datos.length) {
		if(datos[i]>datos[j]) {
			aux=datos[i];
			datos[i]= datos[j];
			datos[j]= aux;
		}
		return burbujaIntercambio(datos,i,j+1);
	}
	return "";
}
public static String toOctal(int numero) {
    if (numero > 0) 
    	return numero + " en octal: " + Integer.toOctalString(numero) + "\n" + toOctal(numero -1); 
    else return "";  
}
public static String factorial(int n,long fact) {
	if (n<=20) {
		return n+"="+fact+"\n"+factorial(n+1,fact*(n+1));
	}
	return "";
}
public static String leerMatriz(int arr[][],int i,int j) {
	String cad="";
	if (i<arr.length) 
		return cad+="\n"+leerMatriz2(arr ,i,0)+leerMatriz(arr,i+1,j);	
		else return "";
}
public static String leerMatriz2(int arr[][],int i,int j) {
	if(j<arr[0].length) {
		arr[i][j]= ToolsPanel.leerInt("DATO");
		return arr[i][j]+ "  " + leerMatriz2(arr,i,j+1);
	}
	else {
		return " ";
	}
	
}
public static String verMatriz(int arr[][],int i,int j) {
		if(j<arr[0].length) {
			return "\n"+arr[i][j]+" "+verMatriz(arr,i+1,0);
		}
		else {
			return "";
		}
}	
public static int multiplicacionRusa(int n1,int n2) {
	if(n1==1) {
		return (n2);
	}
	else {
		if(n1%2!=0) return (n2+multiplicacionRusa(n1/2, n2*2));
		else return (multiplicacionRusa(n1/2, n2*2));
	}
}
public static long akermaNN(int m, long n) {
	if (m==0) {
		return n+1;
	}else if(m>0 && n==0) {
			return akermaNN(m-1,1);
		}else {
				return akermaNN(m-1,akermaNN(m,n-1));
		}
}
public static boolean esPalindrome(String texto){
	texto= texto.replaceAll(" ", " ");
  if(texto.length() <= 1)
  {
    return true;
  }else
  {
    if(texto.charAt(0) == texto.charAt(texto.length()-1))
    {
      return esPalindrome(texto.substring(1,texto.length()-1));
    }else
      {
          return false;
      }
  }
}
public static void main(String[]args) {
	//ToolsPanel.imprime("LISTA DEL ARREGLO: \n"+FuncionesRecursivas.funcionRecursiva(1, 10));
	//int a[]= {1,2,3,7,8,9,12};
	//ToolsPanel.imprime("LISTA DEL ARREGLO: \n"+FuncionesRecursivas.imprimeArray(a, 0));
	//ToolsPanel.imprime("SUCESION:\n"+FuncionesRecursivas.fibonacci(20));
	//ToolsPanel.imprime("numero octal: \n"+FuncionesRecursivas.decimalAOctal(123));
	//ToolsPanel.imprime("POTENCIA  "+FuncionesRecursivas.numPot(2, 3));
	//ToolsPanel.imprime("NUMERO BINARIO:\n"+FuncionesRecursivas.numBin(3));
	//ToolsPanel.imprime("NUMERO OCTAL:\n"+FuncionesRecursivas.decimalAOctal(12));
	//ToolsPanel.imprime("NUMEROS AMIGOS: \n"+FuncionesRecursivas.SumaDivi(220, 1));
	//int dat[]= {35,8,-16,25,60,18,23};
	//FuncionesRecursivas.ordenaBurbuja(dat, 0);
	//ToolsPanel.imprime("Datos ordenados \n"+FuncionesRecursivas.verArray(0, dat));
	//ToolsPanel.imprime("LISTA FACTORIAL DEL 1 AL 15\n"+FuncionesRecursivas.factorial(1, 1));
	//ToolsPanel.imprime("LISTA OCTALES DEL 1 AL 15:\n"+FuncionesRecursivas.toOctal(15));
	//ToolsPanel.imprime("TABLA DE MULTIPLICAR\n"+FuncionesRecursivas.multiplicationTable(1, 5,10));
	//int vec[][] = new int[4][4];
	//FuncionesRecursivas.leerMatriz(vec,0,0);
	//ToolsPanel.imprime("MATRICES DE 4 X 4 \n" +FuncionesRecursivas.leerMatriz(vec,0,0));
	//ToolsPanel.imprime("MULTIPLICACION RUSA:"+FuncionesRecursivas.multiplicacionRusa(18, 24));
	//ToolsPanel.imprime("MATRICES "+ FuncionesRecursivas.verMatriz(vec,0,0));
	//ToolsPanel.imprime("AKERMANN\n:"+FuncionesRecursivas.akermaNN(3, 4));
	//ToolsPanel.imprime(""+FuncionesRecursivas.SumaDivi(220, 1));
	ToolsPanel.imprime("PALINDROMO:\n" +FuncionesRecursivas.esPalindrome("perro"));
}
}
