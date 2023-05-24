package org.nlt.services;

import org.nlt.controller.ParentController;
import org.springframework.stereotype.Service;

@Service
public class StateServices implements ParentInterface {
	public StateServices() {
		System.out.println("State Service Object Created");
	}
}
