package tablica;

public class tablicaApp {

	public static void main(String[] args) {
		int [] tab = {1, 5, 4, 2, 9, 10, 24, 23};
		
		try {
			for(int i = 0 ;i<=tab.length + 1; i++) {
				System.out.println(tab[i]);
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}


	}

}
