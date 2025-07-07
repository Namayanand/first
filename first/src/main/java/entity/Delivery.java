package entity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.SequenceGenerator;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "deliverydb")
public class Delivery {
	@Id
	@SequenceGenerator(name = "delseq", sequenceName = "delivery_sequence", allocationSize = 1)
	public int delseq;
	public int pincode;
//	@ManyToMany(mappedBy = "deliveries")
//	private List<phone> phones;
}
