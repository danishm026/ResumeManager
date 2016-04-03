package com.arc.util.propertyeditors;

import java.beans.PropertyEditorSupport;

import org.joda.time.LocalDate;

import com.arc.util.string.StringUtil;

public class CustomJodaDateEditor extends PropertyEditorSupport{
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		LocalDate jodaDob = StringUtil.getLocalDateFromString(text, "yyyy-MM-dd");
		super.setValue(jodaDob);
	}
}
