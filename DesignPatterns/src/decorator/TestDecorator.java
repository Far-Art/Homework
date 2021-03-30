package decorator;

import decorator.classes.Component;
import decorator.classes.Motherboard;
import decorator.classes.Proccessor;
import decorator.classes.Pwm;
import decorator.classes.SoundCard;
import decorator.classes.VideoCard;

public class TestDecorator {

	public static void main(String[] args) {
		Component component = new Motherboard(new VideoCard(new SoundCard(new Pwm(new Proccessor()))));
		System.out.println(component.getComponents());
	}

}
