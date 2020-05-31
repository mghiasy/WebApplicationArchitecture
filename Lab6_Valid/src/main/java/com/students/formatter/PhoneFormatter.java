package com.students.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.students.domain.Phone;

public class PhoneFormatter implements Formatter<Phone>{

	@Override
	public String print(Phone phone, Locale locale) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Phone parse(String phoneStr, Locale locale) throws ParseException {
		// TODO Auto-generated method stub
		String[] temp = phoneStr.split("-");
		Phone p= new Phone(Integer.parseInt(temp[0]),Integer.parseInt(temp[2]),Integer.parseInt(temp[2]));
		return p;
	}

}
