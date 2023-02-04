package junit.sample;

import java.util.Date;

public class DateExample {
	public Date date = new Date();
	public String message;

	public void setMessage(){
		this.date = new Date();
		this.message = "現在時刻:" + date;
	}

}
