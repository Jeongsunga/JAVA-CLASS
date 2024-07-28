package j15_lombok;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString // 밑에 4개는 data로 통합 가능
public class Student {

	private int studentCode;
	private String name;
	private int studentYear;
	private int age;
	
	/*
	 * 1) 기본생성자
	 * 2) 전체생성자
	 * 3) 겟터 셋터
	 * 4) 해쉬코드
	 * 5) equals
	 * 6) toString
	 */
}
