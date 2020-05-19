package vojkan.bukumiric.fon.MyProject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String indexNumber;
	private String lastName;
	private String email;
	private String address;
	private String phone;
	@OneToOne
	@JoinColumn(name="cityNum",referencedColumnName = "number")
	private City city;
	private int currentYearOfStudy;
	
	public Student() {
		
	}

	public Student(String indexNumber, String lastName, String email, String address, String phone, City city,
			int currentYearOfStudy) {
		super();
		this.indexNumber = indexNumber;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.city = city;
		this.currentYearOfStudy = currentYearOfStudy;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIndexNumber() {
		return indexNumber;
	}

	public void setIndexNumber(String indexNumber) {
		this.indexNumber = indexNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public int getCurrentYearOfStudy() {
		return currentYearOfStudy;
	}

	public void setCurrentYearOfStudy(int currentYearOfStudy) {
		this.currentYearOfStudy = currentYearOfStudy;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", indexNumber=" + indexNumber + ", lastName=" + lastName + ", email=" + email
				+ ", address=" + address + ", phone=" + phone + ", city=" + city + ", currentYearOfStudy="
				+ currentYearOfStudy + "]";
	}
	

}
