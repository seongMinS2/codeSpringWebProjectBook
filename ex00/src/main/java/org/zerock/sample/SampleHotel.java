package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@Component
@ToString
@Getter
@AllArgsConstructor
public class SampleHotel {
	/**
	 * @NonNull 이나 @RequiredArgsConstructor 어노테이션을 이용하면 특정 변수에 대해서만 생성자를
	 * 작성할 수 있다.
	 * @RequiredArgsConstructor 어노테이션은 @NonNull이나 final이 붙은 인스턴스 변수에 대한 생성자를 만들어 냅니다.
	 */
	private Chef chef;
	@NonNull
	private String str;
	
}
