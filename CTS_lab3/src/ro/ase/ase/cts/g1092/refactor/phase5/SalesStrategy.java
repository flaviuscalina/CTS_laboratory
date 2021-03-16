package ro.ase.cts.g1092.refactor.phase5;

import ro.ase.cts.g1092.refactor.exceptions.InvalidValueException;
import ro.ase.cts.g1092.refactor.exceptions.InvalidYearsSinceRegistrationException;
import ro.ase.cts.g1092.refactor.exceptions.InvlaidPriceException;
import ro.ase.cts.g1092.refactor.phase5.marketing.MarketingStrategyInterface;

public class SalesStrategy {
	
	
	private MarketingStrategyInterface mkStrategy = null;
	private SalesValidatorInterface validator = null;
	
	public SalesStrategy(MarketingStrategyInterface mkStrategy, SalesValidatorInterface validator) {
		
		if(mkStrategy==null | validator==null) {
			throw new NullPointerException();
		}
		
		this.mkStrategy=mkStrategy;
		this.validator=validator;
	}
	
	//optional
	//allowing the change at runtime of the marketing strategy
	
	public void setMarketingStrategy(MarketingStrategyInterface mkStrategy) {
		if(mkStrategy==null) {
			throw new NullPointerException();
		}
		this.mkStrategy=mkStrategy;
	}
	
	
	public static float getPriceWithDiscount(
			float initialPrice, float discount, float fidelityDiscount) {
		
		float initialDiscount = initialPrice - (discount * initialPrice);
		return( 1 - fidelityDiscount) * initialDiscount;
	
	}
	
	public float computeFinalPrice(
			ProductType productType, float initialPrice, int yearsSinceRegistration) throws InvalidYearsSinceRegistrationException, InvlaidPriceException
	  {
		
		validator.validatePrice(initialPrice);
		validator.validateYearsSinceRegistration(yearsSinceRegistration);
		
	    float finalPrice = 0;
	    
	    float fidelityDiscount =
	    		(productType != ProductType.NEW) ? mkStrategy.getFidelityDiscount(yearsSinceRegistration):0;
	    		
	    finalPrice = getPriceWithDiscount(initialPrice,productType.getDiscount(), fidelityDiscount);
	 
	    
	    return finalPrice;
	  }
}