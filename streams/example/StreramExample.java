package com.xworkz.streams.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreramExample {

	public static void main(String[] args) {

		Collection<String> watchBrand = Arrays.asList("Sonata","FastTrack","Titan","Daniel Klein","Chumbak","DressBerry");
		System.out.println("Original BRAND" +watchBrand);
		Collection<String> watch = watchBrand.stream().filter((a) -> a.startsWith("T")).collect(Collectors.toSet());
		System.out.println(watch.size());
		System.out.println("Strat with T ->" +watch);
 
		System.out.println("#####################################################");
		Collection<String> usn = Arrays.asList("2BA16IS086","2BA16IS087","2BA16IS088","2BA16IS089","2BA16IS090");
		System.out.println("Original USN" +usn);
		
		Collection<String> usnMatch = usn.stream().filter((b) -> b.contains("CS")).collect(Collectors.toSet());
		System.out.println("USN Matching CS->" +usnMatch);
		System.out.println(usnMatch.size());
		
		System.out.println("#####################################################");
		Collection<String> pan = Arrays.asList("AAACB153F","AAABCT0022F","BBBCE1474G","CCCRDT0012R");
		System.out.println("Original PAN" +pan);
		
		Collection<String> panMatch = pan.stream().filter((a) -> a.startsWith("A")).collect(Collectors.toSet());
		System.out.println(panMatch.size());
		
		System.out.println("####################################################");
		Collection<String> panend = pan.stream().filter((a)->a.endsWith("F")).collect(Collectors.toSet());
		System.out.println("Pan ends with F ->" +panend);
		
		System.out.println("####################################################");
		List<String> brand = Arrays.asList("Sonata","Fast Track","Titan","Daniel Klein","Chumbak","DressBerry");
		List<String> brandMat = brand.stream().sorted().collect(Collectors.toList());
		System.out.println("Brand in sorted order " +brandMat);
	}

}
