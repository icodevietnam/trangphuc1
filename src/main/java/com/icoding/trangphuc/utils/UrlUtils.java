package com.icoding.trangphuc.utils;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.regex.Pattern;

public class UrlUtils {
	public static String friendlySeoUrl(String str) {
		String temp = Normalizer.normalize(str.toLowerCase(), Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		StringBuilder sb = new StringBuilder(pattern.matcher(temp)
				.replaceAll("").replaceAll("Đ", "D").replace("đ", "d"));
		return sb.toString().replace(" ", "-").replace(".", "")
				.replace(",", "").replace(":", "").trim();
	}
}
