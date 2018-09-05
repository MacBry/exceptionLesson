package Human;

import java.util.ArrayList;
import java.util.List;

public class HumanApp {

	public static void main(String[] args) {
		
		Human human = new Human(1, "Maciej", "Bry");
		Human human1 = new Human(2, "Magda", "Br");
		
		List<Human> hList = new ArrayList<Human>();
		hList.add(human1);
		hList.add(human);
		HumanServiceImpl humanServiceImpl = new HumanServiceImpl(hList);

		try {
			humanServiceImpl.getHumanById(0);
			System.out.println("Found Human");
		} catch (HumanNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			humanServiceImpl.getHumanByLastName("BAA");
			System.out.println("Found Human");
		} catch (HumanNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for(Human h : humanServiceImpl.getList()) {
			System.out.println(h.toString());
		}
	}

}
