package com.xworkz.habba;

import java.util.Collection;

import com.xworkz.dto.Religion;
import com.xworkz.habba.dao.HabbaDAO;
import com.xworkz.habba.dao.HabbaDAOImpl;

public class HabbaTester {

	public static void main(String[] args) {
		
		HabbaDTO habbaDTO = new HabbaDTO("Deepavali","South-Indian",5,"Holige",true,true,Religion.HINDU);
		HabbaDTO habbaDTO1 = new HabbaDTO("Dasara","South-Indian",9,"Holige",true,true,Religion.HINDU);
		HabbaDTO habbaDTO2 = new HabbaDTO("Ramjan","North-Indian",1,"Surkurma",true,true,Religion.MUSLIM);
		HabbaDTO habbaDTO3 = new HabbaDTO("Crisimas","South-Indian",1,"Cake",true,true,Religion.CHRISTIAN);
		
		HabbaDAO dao = new HabbaDAOImpl();
		dao.ulisu(habbaDTO);
		dao.ulisu(habbaDTO2);
		dao.ulisu(habbaDTO1);
		dao.ulisu(habbaDTO3);
		
		System.out.println("***********************");
		HabbaDTO dto = dao.ondunaHuduku((a) -> a.getName().equals("Deepavali"));
		System.out.println(dto);
		
		System.out.println("***************************");
		Collection<HabbaDTO> coll = dao.yellavanuHuduku((b)->b.getNoOfDays()>1);
		
		for(HabbaDTO habba : coll) {
			System.out.println(habba);
		}
		
	}

}
