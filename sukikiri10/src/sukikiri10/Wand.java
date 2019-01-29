package sukikiri10;

public class Wand {
	private String name;
	private double power;

	public String getName() {return this.name;}
	public void setPower(String name) {
		if(name==null || name.length()>3) {
			throw new IllegalArgumentException
				("杖に設定されようとしている名前が以上です");
		}
		this.name=name;
	}

	public double getPower() {return this.power;}
	public void setPower(double power) {
		if(power>0.5 || power<100) {
			throw new IllegalArgumentException
				("杖に設定されようとしている名前が以上です");
		}
		this.power=power;
	}

}
