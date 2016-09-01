package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import kr.ac.hansung.dao.Offer;
import kr.ac.hansung.dao.OfferDAO;

@Service("offerService")
public class OfferService {
	private OfferDAO offerDAO;
	
	//OfferService에서 사용할 offerDAO를 DI
	@Autowired
	public void setOfferService(OfferDAO offerDAO){
		this.offerDAO = offerDAO;
	}
	
	public List<Offer> getCurrent(){
		return offerDAO.getOffers();
	}
	
	public void insert(Offer offer){
		offerDAO.insert(offer);		
	}
}