package com.arc.util.hash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import com.arc.util.hash.HashesUtil;

public class Hashes {
	public static String getSHA1(byte[] data) {
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("SHA-1");
		}
		catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return HashesUtil.byteArrayToHexString(md.digest(data));
	}
}
