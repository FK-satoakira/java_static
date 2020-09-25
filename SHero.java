package practice;

public class SHero extends Hero {

	public SHero() {
		super();

		this.setName("SHero");
		this.name="SHero";

	}
	@Override
	protected void attack() {

		super.attack();
		System.out.println(this.name+"パワーアップしている");
	}
//	staticフィールドはstaticメソッドでないと使えない。が、staticメソッドでも普通フィールドは使える
//	staticメソッドをオーバーライドしたメソッド内ではsuperは使えない。

}
