package com.chinasoft.converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		   
		if( null != source)
		{
			//yyyy:MM-dd HH_mm-ss    yyyy-MM-dd HH:mm:ss
			DateFormat   df = new SimpleDateFormat("yyyy-MM-dd");
			try {
				return df.parse(source);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

}
