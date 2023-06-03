package TestPrueba;

import javax.swing.*;
import Actualizacion.DatoSimple;
import EntradaSalida.toolsList;
public class TestDatos {
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
                String menu = "Agregar,buscar,Imprimir,Salir";
		menu3(menu);
                
    }
        public static String boton(String menu) {
            String valores[]=menu.split(",");
            int n;
            n = JOptionPane.showOptionDialog(null," SELECCIONA DANDO CLICK ", " M E N U",JOptionPane.NO_OPTION,JOptionPane.QUESTION_MESSAGE,null, // utilizaicono predeterminado
                    valores,valores[0]); // botón determinado
            return ( valores[n]);
        }
        public static void menu3(String menu)
        {
            byte alt = toolsList.leerByte("ingresa el tamaño del arreglo");
            DatoSimple obj = new DatoSimple(alt);
            String sel="";
            do {
                sel=boton(menu);
                switch(sel){
                    case "Agregar": obj.almacenarDato();   ;break;
                    case "Imprimir": obj.imprimeDatos();break;
                    case "Salir": break;
                    case "buscar":
                    	if (obj.validaVacio())
                    		toolsList.imprimeErrorMsg("Array vacio");
                    	else {
                    		byte pos=obj.buscarSecuencial(toolsList.leerString("Nombre a buscar"));
                    		if (pos !=-2)
                    			toolsList.imprimeMsg("Se encuentra en la posicion " + pos);
                    			else toolsList.imprimeErrorMsg("Dato no encontrado");
                    	}
                    	break;
                }//switch
            }while(!sel.equalsIgnoreCase("Salir"));
        }
}