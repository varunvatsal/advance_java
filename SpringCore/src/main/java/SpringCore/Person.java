package SpringCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Autowired
	@Qualifier(value = "pen")
	private Item item;
	
	void iteUsed() {
		item.used();
	}
}
