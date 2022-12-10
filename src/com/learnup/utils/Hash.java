package com.learnup.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {
    private static String hash;
    // converting password to hexa first takes bytes for input
    private static String toHexa(byte[] md5hash){
        StringBuilder sb = new StringBuilder();
        for (byte i : md5hash){ // adding every byte to the string builder variable
            String toAppend = String.format("%2X", i).replace(" ","0"); // converting to hexa
            sb.append(toAppend);
        }
        return sb.toString();
    }
    public static String toMd5Hash(String pass) throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("MD5"); // gets instance for the md5 hash
        md.update(pass.getBytes()); // converts the passowrd to bytes;
        byte [] md5Hash = md.digest(); // hashes the password
        
        hash = toHexa(md5Hash); // returns the final md5 form for the password
        
        return hash;
    }
}
