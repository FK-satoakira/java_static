package practice;

class Main {
	public static void main(String[] args) {
		Hero.money=1;
		System.out.println(Hero.money);
		System.out.println("---");

		Hero h = new Hero();
		h.money+=1;
		System.out.println(Hero.money);
		System.out.println("---");

		SHero sh = new SHero();
		sh.money+=1;

		System.out.println(h);
		System.out.println(sh);
		System.out.println(Hero.money);
		h.attack();
		sh.attack();

	}
}