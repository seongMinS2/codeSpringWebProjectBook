package org.zerock.sample;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j2
public class HotelTests {
	
	
	@Setter(onMethod_ = {@Inject} )
	private SampleHotel hotel;
	
	@Test
	public void testExist() {
		log.info(hotel);
		log.info("------------------");
		log.info(hotel.getChef());
	}

}
