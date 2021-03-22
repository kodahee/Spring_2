package com.lalalala.s2.robot;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
public class RobotTest {
	
	@Autowired
	private Robot robot;
//	private Arm_Left arm_Left;
	
	@Test
	public void test() {
		assertNotNull(robot.getArm_Right());// true
		
//		assertNotNull(robot.getArm_Left());	// true
//		assertNull(robot.getArm_Left());	// true
//		assertNotNull(robot);				// true
//		assertNull(arm_Left);				// fail, null이기를 희망했는데 null이 아닌게 와서
//		assertNotNull(arm_Left);			// true
	}

}
