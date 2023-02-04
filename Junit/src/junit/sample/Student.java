package junit.sample;

public class Student {
    String name; //名前
    String country; //国籍

    public Student() {
    }

    public Student(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

	public void setName(String name) {
		this.name = name;
	}

	public void setCountry(String country) {
		this.country = country;
	}


}
