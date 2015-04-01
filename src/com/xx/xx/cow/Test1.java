package com.xx.xx.cow;

import java.util.ArrayList;

public class Test1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 为农场添加初始的小牛
		ArrayList<Cow> c = new ArrayList<Cow>();
		c.add(new Cow(0));
		// c.add(new Cow(1));
		Farm f = new Farm(c);
		// f.product(20);

		System.out.println(GetCount(10));
	}

	public static int GetCount(int age) {
		if (age == 0) {
			return 0;
		} else {
			if (age < 3) {
				return 1;
			}

			return (GetCount(age - 1) + GetCount(age - 2));
		}
	}
}
