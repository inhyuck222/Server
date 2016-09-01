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
	
	//OfferController에서 사용할 Service를 DI
	@Autowired	//auto-wiring by type
	public void setOfferService(OfferService offerService){
		this.offerService = offerService;
	}
	
	@RequestMapping("/offers")
	public String showOffers(Model model){
		
		List<Offer> offers = offerService.getCurrent();
		
		//view에서 사용할 model에 "offers"라는 key값으로 
		//offerService에서 받아온 offers를 전달 
		model.addAttribute("offers", offers);
		
		//offers라는 view name을 return
		return "offers";
	}
	
	@RequestMapping("/createOffer")
	public String createOffer(){
		
		return "createOffer";
	}
}
