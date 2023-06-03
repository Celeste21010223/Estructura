package TestMenuOrdenamientos;

import javax.swing.JOptionPane;

import Ordenamientos.OrdenamientosM;
import ToolsPanel.Tools;

public class MenuOrdenamientos {
	 public static void menu3(String menu)
	    {
		 OrdenamientosM <Integer> ordena = new OrdenamientosM<Integer>((byte)10);
	        
	        String sel="";
	      
	        do {
	            sel=desplegable(menu);
	            switch(sel){
	                case "Insertar":
	                	if(!ordena.espacioArray()) Tools.imprimeErrorMsje("Esta lleno el arreglo!!");
	                    else ordena.almacenaAleatorios();
                        Tools.imprime("DATOS ALEATORIOS DEL ARREGLO\n"+ordena.imprimeDatos());
	                    break;
	                case "Inserta Prueba":
	                	if(!ordena.espacioArray()) Tools.imprimeErrorMsje("Esta lleno el arreglo!!");
	                    else ordena.almacenaDatos();
                        Tools.imprime("DATOS ALEATORIOS DEL ARREGLO\n"+ordena.imprimeDatos());
	                    break;
	                case "Imprimir":
	                	if(ordena.arrayVacio()) Tools.imprimeErrorMsje("Arreglo vacio!!");
	                    else Tools.imprime("DATOS ALEATORIOS DEL ARREGLO\n"+ordena.imprimeDatos());
	                    break;
	                case "Vaciar":
	                    if(ordena.arrayVacio())Tools.imprimeErrorMsje("Arreglo vacio!!");
	                    else ordena.vaciarArray();
	                break;
	                
	                case "Seleccion Directa":
	                    if(ordena.arrayVacio())Tools.imprimeErrorMsje("Arreglo vacio!!");
	                    else {ordena.seleDirecta();Tools.imprime("DATOS ALEATORIOS ORDENADOS DEL ARREGLO\n"+ordena.imprimeDatos());}
	                break;
	                
	                case "HeapSort":
	                    if(ordena.arrayVacio())Tools.imprimeErrorMsje("Arreglo vacio!!");
	                    else {ordena.heapSort();
	                    Tools.imprime("DATOS ALEATORIOS ORDENADOS DEL ARREGLO\n"+ordena.imprimeDatos());
	                    }
	                break;
	                case "Insercion Directa":
	                    if(ordena.arrayVacio())Tools.imprimeErrorMsje("Arreglo vacio!!");
	                    else {ordena.inserDirecta();
	                    Tools.imprime("DATOS ALEATORIOS ORDENADOS DEL ARREGLO\n"+ordena.imprimeDatos());}   
	                break;
	                case "Binaria":
	                    if(ordena.arrayVacio())Tools.imprimeErrorMsje("Arreglo vacio!!");
	                    else {ordena.binaria();Tools.imprime("DATOS ALEATORIOS ORDENADOS DEL ARREGLO\n"+ordena.imprimeDatos());  } 
	                break;
	                case "QuickSortRecursivo":
	                    if(ordena.arrayVacio())Tools.imprimeErrorMsje("Arreglo vacio!!");
	                    else {ordena.quicksortRecursivo();
	                        Tools.imprime("DATOS ALEATORIOS ORDENADOS DEL ARREGLO\n"+ordena.imprimeDatos());
	                    }
	                break;
	                case "Radix":
	                    if(ordena.arrayVacio())Tools.imprimeErrorMsje("Arreglo vacio!!");
	                    else { 
	                    	ordena.radix();
	                        Tools.imprime("DATOS ALEATORIOS ORDENADOS DEL ARREGLO\n"+ordena.imprimeDatos());
	                    }
	                break;
	                case "Mezcla Natural":
	                	if(ordena.arrayVacio())Tools.imprimeErrorMsje("Arreglo vacio!!");
	                    else { 
	                    	ordena.mezclaNatural();
	                        Tools.imprime("DATOS ALEATORIOS ORDENADOS DEL ARREGLO\n"+ordena.imprimeDatos());
	                    }
	                break;
	                case "Intercalacion":
	                	if(ordena.arrayVacio())Tools.imprimeErrorMsje("Arreglo vacio!!");
	                    else { 
	                    	ordena.intercalacion();
	                        Tools.imprime("DATOS ALEATORIOS ORDENADOS DEL ARREGLO\n"+ordena.imprimeDatos());
	                    }
	                break; 
	                case "Burbuja Señal":
	                	if(ordena.arrayVacio())Tools.imprimeErrorMsje("Arreglo vacio!!");
	                    else { 
                        ordena.burbujaSeñal();
                        Tools.imprime("DATOS ORDENADOS DEL ARREGLO:\n"+ordena.imprimeDatos());
	                    }
                    break;
                    case "Doble Burbuja": 
                    	if(ordena.arrayVacio())Tools.imprimeErrorMsje("Arreglo vacio!!");
	                    else { 
                    	ordena.dobleBurbuja();
                    	Tools.imprime("DATOS ORDENADOS DEL ARREGLO:\n"+ordena.imprimeDatos());
	                    }
                    break;
                    case "Mezcla Directa":
                    	if(ordena.arrayVacio())Tools.imprimeErrorMsje("Arreglo vacio!!");
	                    else { 
	                    	ordena.mezclaDirecta();
	                        Tools.imprime("DATOS ALEATORIOS ORDENADOS DEL ARREGLO\n"+ordena.imprimeDatos());
	                    }
	                break;    
                    case "Shell": 
	                    if(ordena.arrayVacio())Tools.imprimeErrorMsje("Arreglo vacio!!");
	                    else {ordena.shellIncreDecre(); Tools.imprime("DATOS ALEATORIOS ORDENADOS DEL ARREGLO\n"+ordena.imprimeDatos());}
	                break;
	                case "Salir": 
	                	Tools.imprime("Fin del programa");  
	                break;
	            }
	        }while(!sel.equalsIgnoreCase("Salir"));
	    }
	    public static void main(String[] args) {
	        String menu = "Insertar,Inserta Prueba,Imprimir,Vaciar,Seleccion Directa,HeapSort,Insercion Directa,Binaria,QuickSortRecursivo,Radix,Mezcla Natural,Intercalacion,Burbuja Señal,Doble Burbuja,Mezcla Directa,Shell,Salir";
	        menu3(menu);
	    }
	    public static String boton(String menu) {
	        String valores[]=menu.split(",");
	        int n;
	        n = JOptionPane.showOptionDialog(null," SELECCIONA DANDO CLICK ", " M E N U",
	                JOptionPane.NO_OPTION,
	                JOptionPane.QUESTION_MESSAGE,null,
	                valores,valores[0]);
	        return ( valores[n]);
	    }      
	    public static String desplegable(String menu) {
	        String valores[]=menu.split(",");
	        String res=
	                (String)JOptionPane.showInputDialog(null,"M E N U","Selecciona opcion:",
	                        JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
	        return(res);
	    }
	    
}
