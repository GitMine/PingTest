package com.xx.xx.cow;

import java.util.ArrayList;

public class Farm {
	ArrayList<Cow> cows = new ArrayList<Cow>();

	public Farm() {
		super();
		this.cows.add(new Cow(0));
	}

	public Farm(Cow c) {
		super();
		this.cows.add(c);
	}

	public Farm(ArrayList<Cow> cows) {
		super();
		this.cows = cows;
	}

	void product(final int year) {
		new Thread() {
			public void run() {
				for (int i = 0; i < year; i++) {
					for (int k = 0; k < cows.size(); k++) {

						cows.get(k).setAge(cows.get(k).getAge() + 1);
						if (cows.get(k).getAge() >= 3) {
							Cow c = cows.get(k).giveBirth();
							cows.add(c);
						}

					}
					System.out.println((i + 1)
							+ " year past and the number of cows are "
							+ cows.size());
					try {
						sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
		}.run();
	}
}