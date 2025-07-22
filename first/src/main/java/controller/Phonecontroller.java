package controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import service.Phoneservice;
import org.springframework.web.bind.annotation.RequestMapping;
import entity.Phone;
import entity.Advanceinfo;
import java.util.List;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
@RequestMapping("/demodb")
public class Phonecontroller {
	@Autowired
	private final Phoneservice phoneService = new Phoneservice();
	@PostMapping("/phones")
	public void createPhone(@RequestBody Phone newPhone) {
		phoneService.savePhone(newPhone);
	}
	@PostMapping("/phones/advanced")
	public void createPhoneWithAdvancedInfo(@RequestBody Phone newPhone, @RequestBody Advanceinfo advanceInfo) {
		phoneService.savePhoneWithAdvancedInfo(newPhone,advanceInfo); 	}
	@GetMapping("/phones/all")
	public List<Phone> printAllPhones() {
		return phoneService.printAllPhones();
	}
	@GetMapping("/phones/name")
	public List<Phone> printPhonesByName(@PathVariable("phname") String phname) {
		return phoneService.printPhonesByName(phname);
	}
	@GetMapping("/phones/contains")
	public List<Phone> printPhonesByFirstNameContaining() {
		return phoneService.printPhonesByFirstNameContaining();
	}
	@GetMapping("/phones/advancedinfo")
	public List<Phone> printPhonesBasedOnAdvancedInfoName() {
		return phoneService.printPhonesBasedOnAdvancedInfoName();
	}
	@GetMapping("/phones/brand")
	public List<Phone> printPhoneByBrand(@RequestBody String brand) {
		return phoneService.printPhoneByBrand();
	}
	@PutMapping("/phones/{brand}")
	public void updatePhoneByBrand(@PathVariable("brand") @RequestBody String brand) {
		phoneService.changePhoneByBrand(brand);
	}
	@GetMapping("/phones/model")
	public List<Phone> printPhoneByModel() {
		return phoneService.printPhoneByModel();
	}
}