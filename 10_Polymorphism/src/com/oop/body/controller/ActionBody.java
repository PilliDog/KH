package com.oop.body.controller;

import com.oop.body.model.Arm;
import com.oop.body.model.Body;
import com.oop.body.model.Head;
import com.oop.body.model.Leg;

public class ActionBody {

	public static void main(String[] args) {
		Body engine = new Body();
		
		engine.action(new Leg());
		engine.action(new Head());
		engine.action(new Arm());
		engine.action(new Leg());
		
		
	}

}
