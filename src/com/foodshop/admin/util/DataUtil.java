package com.foodshop.admin.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DataUtil {
	public static String JohnMd(String source,String mdType){
		MessageDigest digest=null;
		try {
			digest = MessageDigest.getInstance(mdType);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] md=digest.digest(source.getBytes());
		StringBuilder sb=new StringBuilder();
		for(byte b:md){
			String stemp=Integer.toHexString(b);
			int len=stemp.length();
			if(len>2){
				stemp=stemp.substring(len-2);
				
			}
			else if(len<2){
				stemp+="0";
			}
			sb.append(stemp);
			
			
			
		}
		
		return sb.toString();
	}
}
