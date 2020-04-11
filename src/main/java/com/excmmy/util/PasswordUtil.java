package com.excmmy.util;

import java.security.MessageDigest;
import java.util.UUID;

public class PasswordUtil {

	public static String md5(String s) {
	    try {
	        MessageDigest md = MessageDigest.getInstance("MD5");
	        byte[] bytes = md.digest(s.getBytes("utf-8"));
	        return toHex(bytes);
	    }
	    catch (Exception e) {
	        throw new RuntimeException(e);
	    }
	}

	private static String toHex(byte[] bytes) {

	    final char[] HEX_DIGITS = "0123456789ABCDEF".toCharArray();
	    StringBuilder ret = new StringBuilder(bytes.length * 2);
	    for (int i=0; i<bytes.length; i++) {
	        ret.append(HEX_DIGITS[(bytes[i] >> 4) & 0x0f]);
	        ret.append(HEX_DIGITS[bytes[i] & 0x0f]);
	    }
	    return ret.toString();
	}

	public static String salt(){
		UUID uuid = UUID.randomUUID();
		String[] arr = uuid.toString().split("-");
		return arr[0];
	}


	public static void main(String[] args) {
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid);
	}

}
