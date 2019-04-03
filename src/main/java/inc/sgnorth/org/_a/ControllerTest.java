package inc.sgnorth.org._a;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

	@RequestMapping("/string")
	public String getString() {
		return "String";
	}
}
