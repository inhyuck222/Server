package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.dao.Offer;
import kr.ac.hansung.service.OfferService;

@Controller
public class OfferController {
	
	private OfferService offerService;
	
	//OfferController���� ����� Service�� DI
	@Autowired	//auto-wiring by type
	public void setOfferService(OfferService offerService){
		this.offerService = offerService;
	}
	
	@RequestMapping("/offers")
	public String showOffers(Model model){
		
		List<Offer> offers = offerService.getCurrent();
		
		//view���� ����� model�� "offers"��� key������ 
		//offerService���� �޾ƿ� offers�� ���� 
		model.addAttribute("offers", offers);
		
		//offers��� view name�� return
		return "offers";
	}
	
	@RequestMapping("/createOffer")
	public String createOffer(){
		
		return "createOffer";
	}
}
