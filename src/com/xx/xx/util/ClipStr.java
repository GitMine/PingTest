package com.xx.xx.util;

public class ClipStr {
	private static String str = "https://dev.wifiin.cn/v4/testSpeed/list.do";

	public static void main(String[] args) {
		clip();
	}

	public static void clip() {
		byte[] bs = str.getBytes();

		for (int i = 0; i < bs.length; i++) {
			System.out.print("'" + (char) bs[i]);
			if (i == bs.length - 1) {
				System.out.print("','\\0'");
			} else {
				System.out.print("',");
			}
		}
	}
}
