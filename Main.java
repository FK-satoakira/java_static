package practice;

import java.util.ArrayList;
import java.util.List;

class Outer {
	int outmember;
//	List<Object> list1 = new ArrayList<>();

	String outMethod(int s) {
		int a = 10; /*非finalなのにアクセス出来るのはなぜか？*/
		final int b = 10;
		final int rsult = 10;
//		final int rsult2 = 1;

		class Inner{
			private String name ;
//			int s = s; /*フィールド定義前には参照不可*/
			public Inner(String s) {
				this.name=s;
			}
//			public void innerMethod() {
//				System.out.println("innerMethodで計算をする");
//				Random r = new Random();
//				int n =2;
//				int rr = r.nextInt(10);
//				System.out.println(a*b*rr*rsult+n);
////				rsult2 = (a * b * rr * rsult); /*この記述は無理。finalのrsultを再定義してるから(基本的なこと)*/
//
//			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}

		}
//		List<Inner> list2 = new ArrayList<>();
		Inner i = new Inner("www");
		System.out.println(i.name);
		return i.name;
//		i.innerMethod();
//		list2.add(i);
//		list1.add(list2.get(0));
//		System.out.println(list1.get(0));
	}
}

class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		Outer o = new Outer();
		o.outMethod(2);
		list.add(o.outMethod(2));
		System.out.println(list.get(0)+"aaa");
//		こんなんもできた。
//		ローカルクラスを囲むメソッド内でそのローカルクラスインスタンスを生成し、外クラス(Main)で
//		Listに入れるのも可能。

	}
}