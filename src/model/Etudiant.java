package model;

import java.util.Scanner;

public class Etudiant {

	private String nom;
	private int age;
	private double moyenne;
	private String adresse;

	public Etudiant() {

	}

	public Etudiant(Scanner scanner) {
		System.out.print("Entrez votre nom : ");
		this.nom = scanner.nextLine();

		System.out.print("Entrez votre âge : ");
		this.age = scanner.nextInt();

		System.out.print("Entrez votre moyenne : ");
		this.moyenne = scanner.nextDouble();

		// Clear buffer after reading a numeric input
		scanner.nextLine();

		System.out.print("Entrez votre adresse : ");
		this.adresse = scanner.nextLine();
	}

	public Etudiant(String nom, int age, double moyenne, String adresse) {
		this.nom = nom;
		this.age = age;
		this.moyenne = moyenne;
		this.adresse = adresse;
	}

	public void info() {
		System.out.println("nom = " + this.nom + " age = " + age + " moyenne = " + moyenne + " adresse = " + adresse);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		if (nom != null && nom.length() >= 8 && nom.length() <= 30) {
			this.nom = nom;
		} else {
			throw new IllegalArgumentException("Le nom doit contenir entre 8 et 30 caractères.");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 18 && age <= 28) {
			this.age = age;
		} else {
			throw new IllegalArgumentException("L'âge doit entre 18 et 28.");
		}

	}

	public double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(double moyenne) {
		if (moyenne >= 0 && moyenne <= 20) {
			this.moyenne = moyenne;
		} else {
			throw new IllegalArgumentException("La moyenne doit entre 0 et 20.");
		}
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
