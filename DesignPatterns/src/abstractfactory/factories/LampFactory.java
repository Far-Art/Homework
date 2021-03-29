package abstractfactory.factories;

import abstractfactory.enums.LampPowerRating;

public class LampFactory  {

	public AbstractLampFactory getFactory(LampPowerRating powerRating) {
		if(powerRating == LampPowerRating.REGULAR) {
			return new RegularLampFactory();
		}
		return new HiPowLampFactory();
	}

}
