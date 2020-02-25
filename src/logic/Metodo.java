package logic;

public class Metodo {

	public String metodo() {
		String result = "mario";
		boolean eventoCritico = false;
		
		if(eventoCritico) {
			System.out.println("evento critico criptaggio informazioni");
			result.replace("mario", "*****");
		}
		
		return result;
	}
}
