import java.util.ArrayList;

public class Any {
	private ArrayList<String> any;


	Any() {
		int posicio =0;
		any = new ArrayList<String>();
		while(posicio<12 ) {
			any.add(monthToNumber(posicio));
			posicio++;
		}
	}

	public String mes(int num) {
		return any.get(num-1);
	}

	public int tamany() {
		return any.size();
	}

	private static String monthToNumber(int i) {
		String resultado = "";
		switch(i) {
		case 0:
			resultado = "Gener";
			break;
		case 1:
			resultado = "Febrer";
			break;
		case 2:
			resultado = "Març";
			break;
		case 3:
			resultado = "Abril";
			break;
		case 4:
			resultado = "Maig";
			break;
		case 5:
			resultado = "Juny";
			break;
		case 6:
			resultado = "Juliol";
			break;
		case 7:
			resultado = "Agost";
			break;
		case 8:
			resultado = "Setembre";
			break;
		case 9:
			resultado = "Octubre";
			break;
		case 10:
			resultado = "Novembre";
			break;
		case 11:
			resultado = "Desembre";
			break;
		default:
			System.out.print("Operació no suportada.");
		}
		return resultado;
	}
}
