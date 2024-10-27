package SpringCore;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bike implements Item{
	
	@Override
	public void used() {
		System.out.println("Used to ride");
	}
}
