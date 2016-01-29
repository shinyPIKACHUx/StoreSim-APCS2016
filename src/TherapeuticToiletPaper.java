package interface.food;

public class TherapeuticToiletPaper extends Food{
	
	public TherapeuticToiletPaper {
		setCost(1.0);
		changeCost(.75, 1);
		setStoreCost(.5);
		setExpiration(3);
		setDesirability(3);
		setName("Therapeutic Toilet Paper");
		setQuantity(100);
	}
}
