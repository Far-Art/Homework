package abstractfactory.factories;

import abstractfactory.beans.Lamp;
import abstractfactory.enums.LampType;

public abstract class AbstractLampFactory {
	
	public abstract Lamp getLamp(LampType type);
}
