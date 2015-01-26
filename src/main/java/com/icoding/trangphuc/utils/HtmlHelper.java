package com.icoding.trangphuc.utils;

import org.springframework.web.util.HtmlUtils;

public class HtmlHelper {
	public static String encode(String str) {
		return HtmlUtils.htmlEscape(str);
	}

	public static String decode(String str) {
		return HtmlUtils.htmlUnescape(str);
	}
}
