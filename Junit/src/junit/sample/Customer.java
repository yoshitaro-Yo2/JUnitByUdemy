package junit.sample;

public class Customer {


	public Customer() {
	}

	//省略

	public boolean checkBonus(int age,String address,int count) {
		if(age>=20 && address.contentEquals("東京都") && count>=1) {
			return true;
		} else {
			return false;
		}
	}

}
