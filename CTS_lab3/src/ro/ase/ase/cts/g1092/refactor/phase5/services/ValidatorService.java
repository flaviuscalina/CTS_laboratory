package ro.ase.cts.g1092.refactor.phase5.services;

import ro.ase.cts.g1092.refactor.exceptions.InvalidYearsSinceRegistrationException;
import ro.ase.cts.g1092.refactor.exceptions.InvlaidPriceException;
import ro.ase.cts.g1092.refactor.phase5.SalesValidatorInterface;

public class ValidatorService implements SalesValidatorInterface{

	@Override
	public void validatePrice(float initialPrice) throws InvlaidPriceException {
		if(initialPrice<=0) {
			throw new InvlaidPriceException();
			
		}
	}

	@Override
	public void validateYearsSinceRegistration(int accountAge) throws InvalidYearsSinceRegistrationException {
		if(accountAge < 0) {
			throw new InvalidYearsSinceRegistrationException();
		}
	}

}
