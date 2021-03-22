package com.lalalala.s2.robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	
	@Autowired
	private Arm_Left arm_Left;
	@Autowired
	private Arm_Right arm_Right;
	
	
	public Arm_Left getArm_Left() {
		return arm_Left;
	}
	public void setArm_Left(Arm_Left arm_Left) {
		this.arm_Left = arm_Left;
	}
	public Arm_Right getArm_Right() {
		return arm_Right;
	}
	public void setArm_Right(Arm_Right arm_Right) {
		this.arm_Right = arm_Right;
	}
	
	

}
