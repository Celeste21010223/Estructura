package Actualizacion;

import EntradaSalida.toolsList;

public class DatoSimple {
    
            private Object datos[];
	    private byte p;

	    public DatoSimple(byte tam){

	        datos= new Object[tam];
	        p=-1;
	    }
	    public byte buscarSecuencial(Object dat)
	    {
	    	byte i=0;
	    while (i<=p && !dat.equals (datos[i]))
	    i++;
	    return (dat.equals(datos[i]))? i:-2;
	    }

	    public boolean validaVacio(){
	        return(p==-1);
	    }

	    public void almacenarDato(){
	        if(p<datos.length){
	            datos[p+1]= toolsList.leerString("Escribe un nombre de persona");
	            p++;
	        }
	        else toolsList.imprimeErrorMsg("Array lleno");
	    }

	    public void imprimeDatos(){
	        String cad="";
	        for (int i = 0; i<=p; i++){
	            cad+=i+"[" + datos[i]+"]" +"\n";
	        }
                toolsList.imprimeMsg("Datos del array: \n "+ cad);
	    }
	    }