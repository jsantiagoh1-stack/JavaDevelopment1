package Accessspecifiers;

public class Main {

	public static void main(String[] args) {
		
		 System.out.println("Tema: Access Specifiers");

	        User usuario1 = new User("Jose", "jose@email.com", "Normal", "12345");

	        usuario1.mostrarInformacionGeneral();

	        System.out.println();

	        PremiumUser usuario2 = new PremiumUser("Carlos", "carlos@email.com", "Premium", "abcde");
	        usuario2.mostrarBeneficios();
	    }
	}