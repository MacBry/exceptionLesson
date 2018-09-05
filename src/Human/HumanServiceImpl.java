package Human;

import java.util.ArrayList;
import java.util.List;

public class HumanServiceImpl implements HumanService {

	private List<Human> list;
	
	public HumanServiceImpl(List<Human> list) {
		super();
		this.list = list;
	}
	
	public HumanServiceImpl() {
		super();
		this.list = new ArrayList<Human>();
	}

	
	
	public List<Human> getList() {
		return list;
	}

	@Override
	public Human getHumanByLastName(String lastName) throws HumanNotFoundException {
		Human human = null;
		for(Human h : list) {
			if(h.getLastName().equals(lastName)) {
				human = h;
				return human;
			}
		}
		throw new HumanNotFoundException( "Last Name " + lastName  + " not FOUND");
	}
	@Override
	public Human getHumanById(int Id) throws HumanNotFoundException {
		Human  human = null;
		for (Human h : list) {
			if(h.getId() == Id) {
				human = h;
				return human;
			}
		}
		throw new HumanNotFoundException ( "Id: " + Id + " not FOUND");
	}

	@Override
	public void addHuman(String name, String lastName) {
		try {
			if(HumanValidator.NameValidator(name) && HumanValidator.LastNameValidator(lastName)) {
				list.add(new Human(100, name, lastName));
			}
		} catch (HumanNameWrongFormatException | HumanLastNameWrongFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
