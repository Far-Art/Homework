package abstractfactory;

import abstractfactory.beans.Lamp;
import abstractfactory.enums.LampPowerRating;
import abstractfactory.enums.LampType;
import abstractfactory.factories.AbstractLampFactory;
import abstractfactory.factories.LampFactory;

public class TestAbstractFactory {

	public static void main(String[] args) {
		
		// regular lamp factory
		AbstractLampFactory factory = new LampFactory().getFactory(LampPowerRating.REGULAR);
		
		Lamp lamp = factory.getLamp(LampType.NEON);
		lamp.printLamp();
		
		lamp = factory.getLamp(LampType.LED);
		lamp.printLamp();
		
		// switch to high power lamp factory
		factory = new LampFactory().getFactory(LampPowerRating.HI_POWER);
		
		lamp = factory.getLamp(LampType.LED);
		lamp.printLamp();
		
		lamp = factory.getLamp(LampType.HALOGEN);
		lamp.printLamp();

	}

}
