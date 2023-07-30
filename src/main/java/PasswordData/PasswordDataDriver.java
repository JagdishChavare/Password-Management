package PasswordData;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PasswordDataDriver {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("prasad");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		PasswordData p= new PasswordData();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter  Id : ");
		int id= sc.nextInt();
		System.out.println("Enter Name : ");
		String name=sc.next();
		System.out.println("Enter Email : ");
		String email=sc.next();
		System.out.println("Enter Password: ");
		String pass = sc.next();
		System.out.println("Enter FB Pass: ");
		String fb= sc.next();
		System.out.println("Enter Insta Pass: ");
		String insta = sc.next();
		
		System.out.println("Enter Linkdin pass: ");
		
		String linkdin = sc.next();
		System.out.println("Enter Snap Pass: ");
		String snap=sc.next();
			
			
		p.setId(id);
		p.setEmail(email);
		p.setName(name);
		p.setPassword(pass);
		p.setFb(fb);
		p.setInsta(insta);
		p.setLinkdin(linkdin);
		p.setSnap(snap);
		
		et.begin();
		em.persist(p);
		et.commit();
		System.out.println("Done !");
		
		
		
		
		
	}

}
