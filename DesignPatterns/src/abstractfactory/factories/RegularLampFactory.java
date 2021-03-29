package abstractfactory.factories;

import abstractfactory.beans.HalogenLamp;
import abstractfactory.beans.Lamp;
import abstractfactory.beans.LedLamp;
import abstractfactory.beans.NeonLamp;
import abstractfactory.enums.LampType;

public class RegularLampFactory extends AbstractLampFactory {

	@Override
	public Lamp getLamp(LampType type) {
		switch (type) {
		case NEON:
			return new NeonLamp();
		case HALOGEN:
			return new HalogenLamp();
		case LED:
			return new LedLamp();
		default:
			return null;
		}
	}

}
