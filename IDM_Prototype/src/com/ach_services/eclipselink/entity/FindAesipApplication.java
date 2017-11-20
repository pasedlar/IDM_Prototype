package com.ach_services.eclipselink.entity;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class FindAesipApplication {

	public FindAesipApplication() {

	}

	public static void main(String[] args) {

      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "IDM_Prototype" );
      EntityManager entitymanager = emfactory.createEntityManager();

      Aesip_application aesip_app = entitymanager.find( Aesip_application.class, "0001" );
      
      System.out.println("id  is: " + aesip_app.getAesip_app_id() );
      System.out.println("name  is: " + aesip_app.getAesip_app_name() );
      System.out.println("name  is: " + aesip_app.getAesip_app_description() );

      
      Aesip_application aesip_app2 = entitymanager.find( Aesip_application.class, "0002" );
      
      System.out.println("id  is: " + aesip_app2.getAesip_app_id() );
      System.out.println("name  is: " + aesip_app2.getAesip_app_name() );
      System.out.println("name  is: " + aesip_app2.getAesip_app_description() );

      Query selectAllAesipApps = entitymanager.createNamedQuery( "findAllAesipApplications" );
      Collection allApps = selectAllAesipApps.getResultList();
      
      entitymanager.close();
      emfactory.close();
      
	}

}
