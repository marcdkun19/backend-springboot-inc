package inc.sgnorth.org._a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import inc.sgnorth.org.security.IUserRepository;

@RestController
public class ControllerTest {
	
	@Autowired
	private IUserRepository userRepo;

	@RequestMapping("/string")
	public String getString() {
		Integer cnt = userRepo.getCount();
		return "Total User: " + cnt;
	}
}
