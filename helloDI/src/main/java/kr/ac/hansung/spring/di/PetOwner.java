package kr.ac.hansung.spring.di;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PetOwner {
	
	//@Autowired			//wired by type
	//@Qualifier(value="qf_cat")
	@Resource(name="dog")
	private AnimalType animal;

	public void play(){
		animal.sound();		
	}
	

}
