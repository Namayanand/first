package service;
import repository.Phonerepo;
import org.springframework.web.bind.annotation.PostMapping;
import entity.Advanceinfo;
import entity.Phone;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Phoneservice {
	
	@Autowired
	private Phonerepo phoneRepo;
	public Phone savePhone(Phone Phone) {
		return phoneRepo.save(Phone);
	}
	
	public Phone savePhoneWithAdvancedInfo( Phone Phone, Advanceinfo AdvanceInfo) {
       return phoneRepo.save(Phone);
    }
	
	public List<Phone> printAllPhones() {
        List<Phone> phoneList = phoneRepo.findAll();
        return phoneList;
    }
	
    public List<Phone> printPhonesByName(String phname) {
    	System.out.println("Fetching phone by name");
        Optional<Phone> phones = phoneRepo.findById(phname);
        return phones.isPresent() ? List.of(phones.get()) : List.of();
    }
   	
    public List<Phone> printPhonesByFirstNameContaining() {
        List<Phone> phones = phoneRepo.findByPhnameContaining("iPhone");
        return phones;
    }

    
	public List<Phone> printPhonesBasedOnAdvancedInfoName() {
        List<Phone> phones = phoneRepo.findByAdvanceInfoRAM("6GB");
        return phones;
    }
	
	public List<Phone> printPhoneByBrand() {
        List<Phone> phone = phoneRepo.findByBrand("Apple");
        return phone;
    }
	public void changePhoneByBrand(String brand) {
		List<Phone> phone = phoneRepo.findByBrand(brand);
		for (Phone p : phone) {
			p.setBrand("Samsung");
			phoneRepo.save(p);
		}
	}
	public String printPhoneNameByBrand() {
        String firstName = phoneRepo.getPhoneNameByBrand("");
        return firstName;
    }

	
	public List<Phone> printPhoneByModel() {
        List<Phone> phones = phoneRepo.findByModel("Apple");
        return phones;
    }

}
