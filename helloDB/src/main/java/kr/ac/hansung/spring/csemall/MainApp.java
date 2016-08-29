package kr.ac.hansung.spring.csemall;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("kr/ac/hansung/spring/csemall/beans/beans.xml");
		
		OfferDAO offerDAO = (OfferDAO)context.getBean("offerDAO");
		System.out.println( offerDAO.getRowCount());
		
		//SELECT
		List<Offer> offerList = offerDAO.getOffers();
		
		for(Offer offer: offerList){
			System.out.println(offer);			
		}
		
		Offer offer = offerDAO.getOffer("A");
		System.out.println(offer);
		
		//INSERT
		/*
		Offer offerForInsert = new Offer("inor", "inor@in.com", "인혁");
		if(offerDAO.insert(offerForInsert)){
			System.out.println("SUCCESS TO INSERT");			
		}
		else{
			System.out.println("FAIL TO INSERT");
		}
		*/
		
		//UPDATE
		offer = offerDAO.getOffer("inhyuck");
		System.out.println(offer);
		
		offer.setName("inhyuck");
		if(offerDAO.update(offer)){
			System.out.println("OBJECT IS UPDATED");
		}
		else {
			System.out.println("OBJECT ISN'T UPDATED");			
		}
		
		//DELETE
		if(offerDAO.delete(offer.getId())){
			System.out.println("OBJECT IS DELETED");			
		}
		else{
			System.out.println("OBEJCT ISN'T DELETED");
		}
		
		context.close();
	}
	
}
