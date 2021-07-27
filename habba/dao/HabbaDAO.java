package com.xworkz.habba.dao;

import java.util.Collection;

import com.xworkz.habba.HabbaDTO;
import com.xworkz.habba.search.HabbaSearch;

public interface HabbaDAO {

	boolean ulisu(HabbaDTO dto);
	HabbaDTO ondunaHuduku(HabbaSearch dto);
	Collection<HabbaDTO> yellavanuHuduku(HabbaSearch search);
}
