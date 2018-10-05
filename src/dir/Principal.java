package dir;

import java.io.File;
import java.io.FileNotFoundException;




public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			comparar();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public static void localizar(){
		
	}
	
	public static void comparar() throws FileNotFoundException{
		
		File file = new File("C:\\Users\\crgomo01\\eclipse-workspace\\Actividad1c\\libros");
		File file2 = new File("C:\\Users\\crgomo01\\eclipse-workspace\\Actividad1c\\libros2");
		
		if (!file.isDirectory() && !file.isDirectory()) { //comprobación del directorio
			
			System.out.println("Error. Se ha encontrado "
					+ file.getAbsolutePath()
					+ " pero se esperaba un directorio");
		}else {
			System.out.println("Ha entrado dentro del directorio");
		}
		
		
		StringBuilder constr=new StringBuilder();
		StringBuilder constr2=new StringBuilder();
		
	     if (file.isDirectory()) {
	         String listaString[]=file.list();
	         System.out.println("hola3");
	         constr.append("Listado de los directorios RUTA1: ");
	         for(int i=0;i<listaString.length;i++){
	         	
	         	constr.append(listaString[i]+"\n"); //Aquí estoy mostrando los directorios que hay dentro.
	         }
	  
	         constr.append("TOTAL DE DIRECTORIOS DENTRO RUTA1: ");
	         constr.append(file.list().length);
	         constr.append("\n");
	         constr.append("\n");
	         System.out.println(constr.toString());
	         }
	     if (file2.isDirectory()) {
	         String listaString2[]=file2.list();
	         constr.append("Listado de los directorios RUTA2: ");
	         for(int i=0;i<listaString2.length;i++){
	         	
	         	constr.append(listaString2[i]+"\n"); //Aquí estoy mostrando los directorios que hay dentro.
	         }
	  
	         constr2.append("TOTAL DE DIRECTORIOS DENTRO RUTA2: ");
	         constr2.append(file2.list().length);
	         constr2.append("\n");
	         constr2.append("\n");
	         System.out.println(constr2.toString());
	         }
	     
	     if (file2.list().length==file.list().length) {
	    	 
	    	 System.out.println("Tienen los mismos números de directorios/ficheros");
	     }else {
	    	 System.out.println("Tienen diferentes números de directorios/ficheros");
	     }
		
		
	}

}
