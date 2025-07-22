package service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import repository.Deliveryrepo;
import entity.Delivery;




@Service
public class Deliveryservice {
	@Autowired
	private Deliveryrepo deliveryRepo;
	public Delivery saveDelivery(Delivery delivery) {
		return deliveryRepo.save(delivery);
	}
	public Delivery saveDeliveryWithDetails(Delivery delivery) {
		return deliveryRepo.save(delivery);
	}
	
}
