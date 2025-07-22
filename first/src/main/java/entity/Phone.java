package entity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Embedded;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import java.util.List;
import entity.Delivery;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "phones")
public class Phone {
	@Id
	@Column(name = "phname", nullable = false, unique = true) 
	public String phname;
	@Column(name = "brand", nullable = false)
	public String brand;
	@Column(name = "model", nullable = true)
	public String model;
	@Column(name = "price", nullable = false)
	public String price;
	@Embedded
	private Advanceinfo advanceInfo;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "phone_delivery",
	           joinColumns = @JoinColumn(name = "phone", referencedColumnName = "phname"),
	           inverseJoinColumns = @JoinColumn(name = "delivery", referencedColumnName = "delseq"))
	private List<Delivery> deliveries;
	
	public void setPhname(String phname) {
		this.phname = phname;
	}
	public String getPhname() {
		return phname;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
		
	public String getModel() {
		return model;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPrice() {
		return price;
	}
	
}
