package com.arc.util.propertyeditors;

import java.beans.PropertyEditorSupport;

import com.arc.util.hash.Hashes;

public class PasswordEditor extends PropertyEditorSupport{
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String passwordHash = Hashes.getSHA1(text.trim().getBytes());
		super.setValue(passwordHash);
	}
}
