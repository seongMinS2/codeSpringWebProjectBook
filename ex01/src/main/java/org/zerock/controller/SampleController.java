package org.zerock.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.SampleDTO;

import lombok.extern.log4j.Log4j2;

@Controller
@RequestMapping("/sample/*")
@Log4j2
public class SampleController {
	
//	@RequestMapping("")
//	public void basic() {
//		log.info("basic..................");
//	}
	
//	@RequestMapping(value = "/basic", method = {RequestMethod.GET,RequestMethod.POST})
//	public void basicGet() {
//		log.info("basic get..................");
//	}
//	
//	@GetMapping("/basicOnlyGet")
//	public void basicGet2() {
//		log.info("basic get only get..................");
//	}
	
	/**
	 * DTO를 사용하면 해당 DTO의 필드값(setter존재)에 자동으로 바인딩 된다.
	 * @param dto
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/ex01")
	public String ex01(SampleDTO dto) throws Exception{
		log.info("" + dto);
		return "ex01";
	}
	
	/**
	 * RequestParam 어노테이션을 사용하면 파라미터의 타입을 설정해 줄 수 있다.
	 * RequestParma은 파라미터로 사용된 변수의 이름과 전달되는 파라미터의 이름이 다를경우 유용하게 사용됨(파라미터 매핑)
	 * @param name
	 * @param age
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/ex02")
	public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) throws Exception{
		log.info("" + name);
		log.info("" + age);
		return "ex02";
	}
	
	/**
	 * 은근 자주 쓰이고 자주 까먹음 중요!! 
	 * 같은 이름의 파라미터를 배열로 받아옴 (체크박스 값 컨트롤할때 유용)
	 * 컬렉션이 아닌 일반 배열도 가능
	 * @param ids
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/ex02List")
	public String ex02List(@RequestParam("ids") ArrayList<String> ids,String[] strIds) throws Exception{
		log.info("ids: " + ids);
		//일반 배열일시
		Arrays.toString(strIds);
		return "ex02List";
	}
	
	@GetMapping("/ex02Bean")
	public String ex02Bean(SampleDTO list) throws Exception{
		log.info("list dtos: " + list);
		return "ex02Bean";
	}
	
	
	
}
