package SpringCore;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component//to tell IOc container to create object for this particular 
@Primary
public class Lion implements Animal{
	
	@Override
	public void sound() {
		System.out.println("sound is roar...");
	}
}
