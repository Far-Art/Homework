package decorator;

public class TestDecorator {

	public static void main(String[] args) {
		Hardware hardware = new Motherboard(new VideoCard(new SoundCard(new Pwm(new Proccessor()))));
		System.out.println(hardware.getComponents());
	}

}
