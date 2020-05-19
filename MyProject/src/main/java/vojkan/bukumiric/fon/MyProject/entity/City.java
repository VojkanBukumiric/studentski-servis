package vojkan.bukumiric.fon.MyProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="city")
public class City {
	
	@Id
	private Long number;
	private String name;
	
	public City() {
		
	}

	public City(Long number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "City [number=" + number + ", name=" + name + "]";
	}
	

}
