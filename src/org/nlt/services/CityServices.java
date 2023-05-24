package org.nlt.services;

import org.nlt.controller.ParentController;
import org.springframework.stereotype.Service;

import com.sun.xml.internal.ws.api.addressing.AddressingPropertySet;

@Service
public class CityServices implements ParentInterface{
	public CityServices() {
		System.out.println("Home Services Object Created");
		
	}
}
