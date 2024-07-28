package j15_lombok;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
// @AllArgsConstructor
@RequiredArgsConstructor
public class Computer {
	
	@NonNull
	int year;
	String company;
	String cpu;
	int ram;
	String graphic;
}
