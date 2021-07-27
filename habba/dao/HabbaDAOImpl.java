package com.xworkz.habba.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.dto.Religion;
import com.xworkz.habba.HabbaDTO;
import com.xworkz.habba.search.HabbaSearch;


public class HabbaDAOImpl implements HabbaDAO {
    private Collection<HabbaDTO> collection = new ArrayList<HabbaDTO>();

	@Override
	public boolean ulisu(HabbaDTO dto) {
		boolean add = collection.add(dto);
		System.out.println(dto);
		return add;
	}

	@Override
	public HabbaDTO ondunaHuduku(HabbaSearch dto) {
		Iterator<HabbaDTO> iterator = this.collection.iterator();
		HabbaDTO temp = null;
		while(iterator.hasNext()) {
			HabbaDTO habbadto = iterator.next();
			if(dto.huduku(habbadto)) {
				temp = habbadto;
				break;
			}
		}
		return temp;
	}

	@Override
	public Collection<HabbaDTO> yellavanuHuduku(HabbaSearch search) {
    Collection<HabbaDTO> collection = new ArrayList<HabbaDTO>();
    Iterator<HabbaDTO> itr = this.collection.iterator();

    while(itr.hasNext()) {
    	HabbaDTO habbaDTO = itr.next();
    	if(search.huduku(habbaDTO)) {
    		collection.add(habbaDTO);
    	}
    }
		return collection;
	}
    


}




	




	
