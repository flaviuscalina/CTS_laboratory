package ro.ase.cts.g1092.refactor.phase5;

import ro.ase.cts.g1092.refactor.exceptions.InvalidValueException;
import ro.ase.cts.g1092.refactor.exceptions.InvalidYearsSinceRegistrationException;
import ro.ase.cts.g1092.refactor.exceptions.InvlaidPriceException;

public interface SalesValidatorInterface {

	public abstract void validatePrice(float initialPrice) throws InvlaidPriceException;
	public abstract void validateYearsSinceRegistration(int accountAge)throws InvalidYearsSinceRegistrationException;
	
}
