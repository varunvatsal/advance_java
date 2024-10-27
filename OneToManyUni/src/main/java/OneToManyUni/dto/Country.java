package OneToManyUni.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String name;
	private String capital;
	
	@OneToMany
	private List<States> list;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public List<States> getList() {
		return list;
	}

	public void setList(List<States> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Country [cid=" + cid + ", name=" + name + ", capital=" + capital + ", list=" + list + "]";
	}
	
}
