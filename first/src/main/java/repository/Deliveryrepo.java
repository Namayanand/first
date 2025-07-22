package repository;
import entity.Delivery;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.data.jpa.repository.JpaRepository;
public interface Deliveryrepo extends JpaRepository<Delivery, Integer> {;
  	public default void saveDelivery() {

  	}	
}
