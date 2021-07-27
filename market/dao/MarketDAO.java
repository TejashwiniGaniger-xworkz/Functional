package com.xworkz.market.dao;

import java.util.Collection;

import com.xworkz.dto.MarketDTO;
import com.xworkz.market.util.MarketSearch;

public interface MarketDAO {
 MarketDTO findBy(MarketSearch search);
 Collection<MarketDTO> findAll(MarketSearch search);
}
