package controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import service.Phoneservice;
import org.springframework.web.bind.annotation.RequestMapping;
import entity.Phone;
@RestController
@RequestMapping("/demodb")
public class Phonecontroller {
	@Autowired
	private final Phoneservice phoneService = new Phoneservice();
	@PostMapping("/phones")
	public void createPhone(@RequestBody Phone newPhone) {
		phoneService.savePhone(newPhone);
	}
//	@PostMapping("/phones/advanced")
//	public void createPhoneWithAdvancedInfo(@RequestBody Phone newPhone, @RequestBody Advanceinfo advanceInfo) {
//		phoneService.savePhoneWithAdvancedInfo(newPhone,advanceInfo); 	}
	@GetMapping("/phones/all")
	public void printAllPhones() {
		phoneService.printAllPhones();
	}
	@GetMapping("/phones/name")
	public void printPhonesByName() {
		phoneService.printPhonesByName();
	}
	@GetMapping("/phones/contains")
	public void printPhonesByFirstNameContaining() {
		phoneService.printPhonesByFirstNameContaining();
	}
	@GetMapping("/phones/advancedinfo")
	public void printPhonesBasedOnAdvancedInfoName() {
		phoneService.printPhonesBasedOnAdvancedInfoName();
	}
	@GetMapping("/phones/brand")
	public void printPhoneByBrand() {
		phoneService.printPhoneByBrand();
	}
	@GetMapping("/phones/brandname")
	public void printPhoneNameByBrand() {
		phoneService.printPhoneNameByBrand();
	}
	@GetMapping("/phones/model")
	public void printPhoneByModel() {
		phoneService.printPhoneByModel();
	}
}