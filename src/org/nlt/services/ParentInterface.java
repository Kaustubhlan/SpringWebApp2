package org.nlt.services;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;

public interface ParentInterface {
	
	public final SessionFactory sf = getSessionFactory();
	public final Session ses = sf.openSession();

	public static SessionFactory getSessionFactory() {
		return new Configuration().configure("org/nlt/services/hibernate.cfg.xml").buildSessionFactory();
		
	}	
	
	public static void closeDatabase()
	{
		if(ses!=null)
		{
			ses.close();
		}
		if(sf!=null)
		{
			sf.close();
		}
	}
}