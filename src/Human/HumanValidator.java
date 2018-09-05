package Human;

public class HumanValidator {
	public static boolean NameValidator(String name) throws HumanNameWrongFormatException {
		boolean isValidate = false;
		if(name.length() > 3) {
			isValidate = true;
			return isValidate;
		}
		throw new HumanNameWrongFormatException("To Short Name");
	}
	
	public static boolean LastNameValidator(String LastName) throws HumanLastNameWrongFormatException {
		boolean isValidate = false;
		if(LastName.length() > 5) {
			isValidate = true;
			return isValidate;
		}
		throw new HumanLastNameWrongFormatException("To short last Name");
	}
	
}
