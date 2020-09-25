package practice;

class Outer {
	int outerField; static int outerStaticField;
	static class Inner {
		void innerMethod() {
			outerStaticField += 10;
			om2(); /*om()が非staticでもom内に非staticフィールドがあると不可*/

		}
	}
	void outerMethod() {
		Inner ic = new Inner();
	}
	static void om2() {
		System.out.println("hello");
	}
}

class Main {
	public static void main(String[] args) {
		Outer.Inner ic = new Outer.Inner();
		Outer o = new Outer();
//		Outer.Inner oi = o.new Inner();

		for (int i = 0; i < 11; i++) {
			ic.innerMethod();
			o.outerField+=1;

		}
		System.out.println(o.outerField+""+o.outerStaticField);
				/* 無関係なクラスからはOuter.Innerで利用 */
	}
}