package com.icoding.trangphuc.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encryption {

	public static final String SHA_1 = "SHA-1";
	public static final String SHA_128 = "SHA-128";
	public static final String SHA_256 = "SHA-256";
	public static final String SHA_512 = "SHA-512";

	public static String md5(String str) {
		MessageDigest md5;
		StringBuffer hashStr = new StringBuffer();
		try {
			md5 = MessageDigest.getInstance("md5");
			md5.update(str.getBytes());
			byte[] byteData = md5.digest();
			// Convert string to hex format
			for (byte b : byteData) {
				hashStr.append(Integer.toString((b & 0xff) + 0x100, 16)
						.substring(1));
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return hashStr.toString();
	}

	public static String shaEncryption(String str, String type) {
		StringBuffer hashStr = new StringBuffer();
		try {
			MessageDigest encrypt = MessageDigest.getInstance(type);
			encrypt.update(str.getBytes());
			byte[] byteData = encrypt.digest();
			// Convert string to hex format
			for (byte b : byteData) {
				hashStr.append(Integer.toString((b & 0xff) + 0x100, 16)
						.substring(1));
			}
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hashStr.toString();
	}
}
