import java.util.ArrayList;
/*Exercici 2. Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre el número com a
 * paràmetre. Crea una classe jUnit que verifiqui el seu correcte funcionament, parametritzant-la perquè el
 * test rebi un espectre de dades ampli i
 * validi si el càlcul és correcte per a 10 números de DNI predefinits*/
public class CalculoDni {
	
	public static boolean  test(ArrayList<String> dnis){
		boolean correcte = true;
		int c = 0;
		while(correcte && c<10 && c<dnis.size()){
			correcte = dniValid(dnis.get(c));
			c++;
		}
		return correcte;
	}
	
	
	public static boolean dniValid(String frase){
		boolean valid = false;
		char c = frase.charAt(frase.length()-1);
		int dni = Integer.valueOf(frase.substring(0, frase.length()-1));
		char cr = letraDni(dni);//solo mayusculas
		if(cr == c ) {
			valid = true;
		}
		return valid;
	}
	
	public static char letraDni(int num) {
		char c;
		switch(num%23) {
			case 0:
				c='T';
				break;
			case 1:
				c='R';
				break;
			case 2:
				c='W';
				break;
			case 3:
				c='A';
				break;
			case 4:
				c='G';
				break;
			case 5:
				c='M';
				break;
			case 6:
				c='Y';
				break;
			case 7:
				c='F';
				break;
			case 8:
				c='P';
				break;
			case 9:
				c='D';
				break;
			case 10:
				c='X';
				break;
			case 11:
				c='B';
				break;
			case 12:
				c='N';
				break;
			case 13:
				c='J';
				break;
			case 14:
				c='Z';
				break;
			case 15:
				c='S';
				break;
			case 16:
				c='Q';
				break;
			case 17:
				c='V';
				break;
			case 18:
				c='H';
				break;
			case 19:
				c='L';
				break;
			case 20:
				c='C';
				break;
			case 21:
				c='K';
				break;
			case 22:
				c='E';
				break;
			default:
				c='0';
				System.out.print("error");
		}
		return c;
	}
}
