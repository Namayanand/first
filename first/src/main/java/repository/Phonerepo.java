package repository;
import entity.Phone;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Phonerepo extends JpaRepository<Phone, String> {

	List<Phone> findByBrand(String brand);
	List<Phone> findByModel(String model);
	List<Phone> findByPhnameContaining(String phname);
	Optional<Phone> findByPhname(String phname);

	String getPhoneNameByBrand(String string);
	List<Phone> findByAdvanceInfoRAM(String string);
}



