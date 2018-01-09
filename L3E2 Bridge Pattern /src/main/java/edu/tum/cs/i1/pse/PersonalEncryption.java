package edu.tum.cs.i1.pse;

import java.util.StringTokenizer;

public class PersonalEncryption extends Encryption {
	
	public PersonalEncryption() {
		imp = new Transpose();
	}
	
	@Override
	public String encrypt(String string, byte key) {
		String result = new	String("");
		StringTokenizer	words = new	StringTokenizer(string, " ");
		while(words.hasMoreElements()) {
			result = result + " " + this.imp.encryptWord(words.nextToken(), key);
		}
		return result.toString();
	}
	
	@Override
	public String decrypt(String string, byte key) {
		String result = new	String("");
		StringTokenizer	words = new	StringTokenizer(string, " ");
		while(words.hasMoreElements()) {	
			result = result + " " + this.imp.decryptWord(words.nextToken(), key);
		}
		return result.toString();
	}
}
