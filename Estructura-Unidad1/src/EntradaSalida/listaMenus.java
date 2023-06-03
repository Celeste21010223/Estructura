package EntradaSalida;

public class listaMenus {
	
	    public static void menu3(String menu) {
	        int sel;
	        do {
	            sel=toolsList.leerInt(menu+"Selección opcion");
	            switch(sel){
	                case 1: break;
	                case 2: break;
	                case 3:toolsList.imprimeMsg("Fin del programa");break;
	                default: toolsList.imprimeErrorMsg("Opcion no definida, intenta de nuevo");
	            }//switch
	        }while(sel!=3);
	    }


	}

