package Human;

public interface HumanService {
	public Human getHumanByLastName(String lastName) throws HumanNotFoundException;
	public Human getHumanById(int Id) throws HumanNotFoundException;
	public void addHuman (String name, String lastName);
}
