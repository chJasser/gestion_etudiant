package model;

import java.util.Scanner;

public class Test {

	public static void main(String args[]) {

		Etudiant e1 = new Etudiant();
		Etudiant e2 = new Etudiant("Chaieb", 27, 15.17, "Sousse");
		e1.info();
		e2.info();

		Scanner scanner = new Scanner(System.in);

		Etudiant e3 = new Etudiant(scanner);

		e3.info();

		scanner.close();

		Etudiant e4 = new Etudiant();
		e4.setNom("chJasser");
		e4.setAdresse("Jammel");
		e4.setMoyenne(13.56);
		e4.setAge(28);
		e4.info();

	}
}
