package com.lalalala.s2.robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	
	@Autowired
	@Qualifier("al")
	private Arm arm_Left;		// al로 바꿔도 상관없음
	
	@Autowired					
	@Qualifier("ar")			// annotation 두개 대신 @Resource("ar")로 해도 됨
	private Arm arm_Right;

	public Arm getArm_Left() {
		return arm_Left;
	}

	public void setArm_Left(Arm arm_Left) {
		this.arm_Left = arm_Left;
	}

	public Arm getArm_Right() {
		return arm_Right;
	}

	public void setArm_Right(Arm arm_Right) {
		this.arm_Right = arm_Right;
	}
	
	
	
	
//	@Autowired		// type으로 찾아감, 이름이 같은걸 찾아감
//	private Arm arm_Left;
//	@Autowired
//	private Arm arm_Right;
//	
//	
//	public Arm getArm_Left() {
//		return arm_Left;
//	}
//	public void setArm_Left(Arm arm_Left) {
//		this.arm_Left = arm_Left;
//	}
//	public Arm getArm_Right() {
//		return arm_Right;
//	}
//	public void setArm_Right(Arm arm_Right) {
//		this.arm_Right = arm_Right;
//	}
	
	

//	@Autowired
//	private Arm_Left lf;
//	@Autowired
//	private Arm_Right arm_Right;
//	
//	
//	public Arm_Left getArm_Left() {
//		return lf;
//	}
//	public void setArm_Left(Arm_Left arm_Left) {
//		this.lf = arm_Left;
//	}
//	public Arm_Right getArm_Right() {
//		return arm_Right;
//	}
//	public void setArm_Right(Arm_Right arm_Right) {
//		this.arm_Right = arm_Right;
//	}
	
	

}
