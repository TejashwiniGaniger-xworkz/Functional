package com.xworkz.features.functional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class FishTester {

	public static void main(String[] args) {
		FishDTO dto1 = new FishDTO("catfish", "blue", "blueCatFish", "60", "1500", "male");

		FishDTO dto2 = new FishDTO("oscar", "red", "ciclidae", "20", "1000", "female");

		FishDTO dto3 = new FishDTO("flounder", "ash", "summerFlouder", "10", "500", "male");

		List<FishDTO> collection = new ArrayList<FishDTO>();
		collection.add(dto3);
		collection.add(dto1);
		collection.add(dto2);

		System.out.println("sorted by name");
		Comparator<FishDTO> fishname = new Comparator<FishDTO>() {
			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(collection, fishname);
		Iterator<FishDTO> itr = collection.iterator();
		while (itr.hasNext()) {
			FishDTO fishdto = (FishDTO) itr.next();
			System.out.println(fishdto.getName());
		}
		System.out.println("sort by color");
		Comparator<FishDTO> fishcolor = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				return o1.getColor().compareTo(o2.getColor());

			}

		};
		Collections.sort(collection, fishcolor);
		Iterator<FishDTO> itr1 = collection.iterator();
		while (itr1.hasNext()) {
			FishDTO fishdto1 = (FishDTO) itr1.next();
			System.out.println(fishdto1.getColor());
		}
		System.out.println("sort by lifespan");
		Comparator<FishDTO> fishLifeSpan = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {

				return o1.getLifeSpan().compareTo(o2.getLifeSpan());
			}

		};
		Collections.sort(collection, fishLifeSpan);
		Iterator<FishDTO> itr2 = collection.iterator();
		while (itr2.hasNext()) {
			FishDTO fishdto3 = (FishDTO) itr2.next();
			System.out.println(fishdto3.getLifeSpan());

		}
		System.out.println("sort by lifespan desc");
		Comparator<FishDTO> fishlife = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {

				return o2.getLifeSpan().compareTo(o1.getLifeSpan());
			}

		};
		Collections.sort(collection, fishlife);
		Iterator<FishDTO> itr3 = collection.iterator();
		while (itr3.hasNext()) {
			FishDTO fishdto4 = (FishDTO) itr3.next();
			System.out.println(fishdto4.getLifeSpan());
		}
		System.out.println("sort by name desc");
		Comparator<FishDTO> namedesc = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {

				return o2.getName().compareTo(o1.getName());
			}
		};
		Collections.sort(collection, namedesc);
		Iterator<FishDTO> itr4 = collection.iterator();
		while (itr4.hasNext()) {
			FishDTO fishdto5 = (FishDTO) itr4.next();
			System.out.println(fishdto5.getName());
		}

		System.out.println("sort by cost desc");
		Comparator<FishDTO> costdesc = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {

				return o2.getCost().compareTo(o1.getCost());
			}

		};
		Collections.sort(collection, costdesc);
		Iterator<FishDTO> itr5 = collection.iterator();
		while (itr5.hasNext()) {
			FishDTO fishdto6 = (FishDTO) itr5.next();
			System.out.println(fishdto6.getCost());
		}
	}
}
