public class Ejercicio31{
	public static void main (String[] args) {
	
  
    int altura;
    
		System.out.print("Introduzca la altura de la letra L que vamos a dibujar:");
    altura=Integer.parseInt(System.console().readLine());
    
    for (int i=1;i<=altura-1;i++) {
      System.out.println("*");
     } 
    for (int j=1;j<=((altura/2)+1);j++) {
      System.out.print("*");  
    }
        
       
        
  }
}    
