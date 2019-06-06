package Agenda;
import java.util.Scanner;
public class Agenda {	
	//Atributos
	Contacto[] lista;	
	
	//Metodos Constructores
	public Agenda(int tamanio_agenda){
		this.lista= new Contacto[tamanio_agenda]; 
	}
	
	public Agenda(){
		this.lista= new Contacto[10]; 
	}	
	

	
	//Metodo insertar contactos
	public void setContacto(Contacto c){		
		int indice=buscar_indice_vacio();
		
		if(indice<0){
			System.out.println("");
			System.out.println("Importante: Agenda llena!");
		}else{
			this.lista[indice]=c;	
		}								
	}
	
	private int buscar_indice_vacio() {		
		int indice=0;		
		while(this.lista[indice]!=null){			
			indice++;
			if(indice > (this.lista).length-1){
				return -1;
			}				
		}		
		return indice;				
	}
	
	public void listarContactos(){
		System.out.println("");
		System.out.println("Lista de contactos");
		for(int i=0;i<(this.lista).length;i++){
			if(this.lista[i]==null){
				
			}else{
				System.out.println("");
				System.out.println("Contacto: "+(i+1));
				(this.lista[i]).DatosContacto();
			}
		}
	}
	public void buscarpornombre(String nombre) {
		@SuppressWarnings("resource")
		Scanner reader=new Scanner(System.in);
		nombre=reader.nextLine();
		boolean encontrado =false;
		for(int i=0;i<(this.lista).length && !encontrado;i++){
			if(this.lista[i]==null && this.lista[i].getNombre().equalsIgnoreCase(nombre)){
				System.out.println("su número es " +this.lista[i].getTelefono());
				encontrado=true;
				
				
		}
	}
	if(!encontrado) {
		
		System.out.println("no se encontró contacto");
	}
		
	}
	
	public boolean agendallena() {
		
		for(int i=0;i<(this.lista).length;i++){
			if(this.lista[i]==null){
			return false;
			}
		}
		return true;
		
	}
	public void eliminarcontacto(Contacto c) {
		 boolean encontrado = false;
	        for (int i = 0; i < this.lista.length && !encontrado; i++) {
	            if (this.lista[i] != null && this.lista[i].equals(c)) {
	                this.lista[i] = null; //Controlo nulos
	                encontrado = true; //Indico que lo he encontrado
	            }
	        }

	        if (encontrado) {
	            System.out.println("Se ha eliminado el contacto");
	        } else {
	            System.out.println("No se ha eliminado el contacto");

	        }

	    }

	   
	    public int posiciónLibre() {

	        int contadorLibres = 0;
	        for (int i = 0; i < this.lista.length; i++) {
	            if (this.lista[i] == null) { //Controlo nulos
	                contadorLibres++; //Acumulo
	            }
	        }

	        return contadorLibres;

	    }
	    
	
	    
	    
	    

	}
	
