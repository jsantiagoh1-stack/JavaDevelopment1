package exception.handling;

public class TryCatchEjemplo {

	public static void main(String[] args) {
		 try {
			 // CODIGO QUE GENERA UNA EXCEPCIÓN
			 int dividePorCero = 5 / 0;
		      System.out.println("REST OF CODE IN TRY BLOCK");
		      System.out.println(dividePorCero);	      }
		 catch (ArithmeticException e) { //CREA UN OBJETO Y SE GUARDA EN LA VARIABLE "E"
			 System.out.println("ARITHMETICEXCEPTION => " + e.getMessage().toUpperCase()); //GETMESSAGE ES UN METODO QUE DEVUELVE EL MENSAJE DEL ERROR.
			 e.printStackTrace();
		    }
		  }
}