package abstractfactory.factories;

import abstractfactory.beans.HiPowHalogenLamp;
import abstractfactory.beans.HiPowLedLamp;
import abstractfactory.beans.HiPowNeonLamp;
import abstractfactory.beans.Lamp;
import abstractfactory.enums.LampType;

public class HiPowLampFactory extends AbstractLampFactory {

	@Override
	public Lamp getLamp(LampType type) {
		switch (type) {
		case NEON:
			return new HiPowNeonLamp();
		case HALOGEN:
			return new HiPowHalogenLamp();
		case LED:
			return new HiPowLedLamp();
		default:
			return null;
		}
	}

}
