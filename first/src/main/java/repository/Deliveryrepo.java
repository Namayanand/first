package repository;
import entity.Delivery;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
public interface Deliveryrepo extends org.springframework.data.jpa.repository.JpaRepository<Delivery, Integer> {
	public static final Deliveryrepo deliveryRepo = null;
	@GetMapping("/saveDelivery")
  	public default void saveDelivery() {
		Delivery delivery1 = Delivery.builder()
				.delseq(1)
				.pincode(1234)
				.build();
		deliveryRepo.save(delivery1);
		Delivery Delivery2 = Delivery.builder()
				.delseq(2)
				.pincode(4213)
				.build();
		deliveryRepo.save(Delivery2);
	}
	@GetMapping("/saveDelivery")
	public default void printAllDeliveries() {
		List<Delivery> deliveryList = deliveryRepo.findAll();
		System.out.println("deliveryList = " + deliveryList);
	}
	
}
