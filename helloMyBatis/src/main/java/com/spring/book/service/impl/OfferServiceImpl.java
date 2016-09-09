package com.spring.book.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.book.dao.OfferDao;
import com.spring.book.model.Offer;
import com.spring.book.service.OfferService;

@Service
public class OfferServiceImpl implements OfferService {

	@Resource(name = "offerDao")
	private OfferDao offerDao;
	
	@Override
	public List<Offer> getOfferList() {
		return offerDao.getOfferList();
	}

}
