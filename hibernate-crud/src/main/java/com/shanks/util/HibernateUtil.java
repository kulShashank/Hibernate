package com.shanks.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	private static StandardServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;

	static {
		if (sessionFactory == null) {
			// Create Standard Service registry
			// create metadata sources
			// create metadata
			// get session factory builder from metadata
			serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
			MetadataSources metadataSources = new MetadataSources(serviceRegistry);
			Metadata metadata = metadataSources.getMetadataBuilder().build();
			sessionFactory = metadata.getSessionFactoryBuilder().build();
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
