package practice;

public class Hero {
//	private String name;
//	private int hp;
	protected String name;
	protected int hp;

	static int money;
	public Hero() {
		this.name="HERO";
		this.hp=100;
	}
	protected void attack() {
		System.out.println(this.name+"の攻撃");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public static int getMoney() {
		return money;
	}
	public static void setMoney(int money) {
		Hero.money = money;
	}
	@Override
	public String toString() {
		return name +" "+ hp+" " + money;
	}

}
