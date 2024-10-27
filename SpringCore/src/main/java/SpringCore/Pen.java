package SpringCore;

import org.springframework.stereotype.Component;

@Component
public class Pen implements Item{
	
	@Override
	public void used() {
		System.out.println("used to write");
	}
}
