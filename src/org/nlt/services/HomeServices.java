package org.nlt.services;

import java.util.ArrayList;

import org.nlt.model.Persons;
import org.springframework.stereotype.Service;

@Service
public class HomeServices implements ParentInterface {

	public HomeServices() {
		System.out.println(ses);
		System.out.println(sf);
		System.out.println("Home Services Object Created");
	}
}
