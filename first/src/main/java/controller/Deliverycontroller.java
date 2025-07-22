package controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import service.Deliveryservice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import entity.Delivery;





@RestController
@RequestMapping("/demodb")
public class Deliverycontroller {
    @Autowired
    private Deliveryservice deliveryService = new Deliveryservice();
    @PostMapping("/deliveries")
    public void createDelivery(@RequestBody Delivery newDelivery) {
		deliveryService.saveDelivery(newDelivery);
	}
	@PostMapping("/deliveries/details")
	public void createDeliveryWithDetails(@RequestBody Delivery newDelivery) {
		deliveryService.saveDeliveryWithDetails(newDelivery);
	}
}
