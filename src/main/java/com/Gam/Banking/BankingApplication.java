package com.Gam.Banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class BankingApplication {

	public static void main(String[] args) {

		SpringApplication.run(BankingApplication.class, args);


		/*System.out.println(("hello word"));

		List<Etudiant> etudiantList = new ArrayList<Etudiant>();
		List<Integer> integerList = new ArrayList<>();

		// Adding Products
		etudiantList.add(new Etudiant(1,"Nidhal", "Gam", 31 , 2500));
		etudiantList.add(new Etudiant(2,"fakir", "Zaoui", 34, 3500));
		etudiantList.add(new Etudiant(3,"Ahmed", "masri", 25, 1800));
		etudiantList.add(new Etudiant(4,"Iheb", "marzouk", 23, 1500));
		etudiantList.add(new Etudiant(5,"Mouhamed", "Tataouini", 27, 1300));
		etudiantList.add(new Etudiant(6,"kamel", "Tataouine", 31, 1200));

		// faire un tablkeau d'entier et appliquéee stream

		Integer[] myArray = new Integer[]{ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		Long arrayLong = Arrays.stream(myArray).filter(x -> x%2==0).count();
		System.out.println(arrayLong);
		etudiantList.forEach(System.out::println);

		*//*Predicate<Etudiant> myAgepred = (etudiant) -> {return etudiant.getAge()<30;};

		Set<Etudiant> collect = etudiantList.stream().filter(e -> e.getAge()<30).collect(Collectors.toSet());

		System.out.println(collect);*//*
		*//*Map<Integer, String> etudiantMap = etudiantList.stream()
				.collect(Collectors.toMap(p -> p.getId(), p -> p.getFirstName()));
		System.out.println(etudiantMap);
		@Deprecated

		// Converting product List into hashMap

		Map<Integer,String> listMap = new HashMap<>();
		for (Etudiant etudiant : etudiantList) {

			listMap.put(etudiant.getId() , etudiant.getLastName());
		}

		System.out.println(listMap);*/





	}

}
