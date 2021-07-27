package com.xworkz.market.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.dto.MarketDTO;
import com.xworkz.market.util.MarketSearch;

public class MarketDAOImpl implements MarketDAO {

	private Collection<MarketDTO> collection = new ArrayList<MarketDTO>();

	public MarketDAOImpl() {
		MarketDTO marketDTO = new MarketDTO("KR Market", "Bangalore", 20, "Vegetables");
		MarketDTO marketDTO1 = new MarketDTO("Maleshwaram", "Bangalore", 40, "Books");
		MarketDTO marketDTO2 = new MarketDTO("Yelahank", "Bangalore", 30, "Fruits");
		MarketDTO marketDTO3 = new MarketDTO("Yeshwantpur", "Bangalore", 70, "Cloths");

		this.collection.add(marketDTO3);
		this.collection.add(marketDTO2);
		this.collection.add(marketDTO);
		this.collection.add(marketDTO1);

	}

	@Override
	public MarketDTO findBy(MarketSearch search) {
		Iterator<MarketDTO> iterator = this.collection.iterator();
		MarketDTO temp = null;
		while (iterator.hasNext()) {
			MarketDTO marketDTO = iterator.next();
			if (search.test(marketDTO)) {
				temp = marketDTO;

				break;
			}
		}
		return temp;
	}

	@Override
	public Collection<MarketDTO> findAll(MarketSearch search) {
		Iterator<MarketDTO> itr = this.collection.iterator();
		Collection<MarketDTO> temp = new ArrayList<MarketDTO>();
		while(itr.hasNext()) {
			MarketDTO marketDTO = itr.next();
			if(search.test(marketDTO)) {
				temp.add(marketDTO);
			}
		}
		return temp;
	}

}
