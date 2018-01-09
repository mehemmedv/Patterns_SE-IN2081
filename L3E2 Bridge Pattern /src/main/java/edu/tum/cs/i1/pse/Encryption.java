package edu.tum.cs.i1.pse;

public abstract class Encryption {
	protected Cipher imp;
	
	public abstract String encrypt(String string, byte key);
	public abstract String decrypt(String string, byte key);
}
