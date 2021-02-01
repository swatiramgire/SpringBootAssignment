package com.SpringBootAssignment.SpringBootRestApp.service;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import com.SpringBootAssignment.SpringBootRestApp.entities.FoodMenu;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class FoodMenuServiceImplTest {
	@InjectMocks
	FoodMenuServiceImpl fsi=new FoodMenuServiceImpl();
	
	@Test
	@Rollback(false)
	public void testAddFood() {
		FoodMenu fm=new FoodMenu(3,"Pulao","veg");
		fsi.addFood(fm);
	}
	
}