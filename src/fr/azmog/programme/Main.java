package fr.azmog.programme;

public class Main {

	public static void main(String[] args) {
		
		int money = 1000;
		int pricephone = 800;
		boolean hasphone = false;
		
		if(money >= pricephone && !hasphone) {
			System.out.println("Tu peut acheter ce telephone");
		} else {
			System.out.println("Tu ne peut pas acheter ce telephone et en plus tu as déja un téléphone");
		}
		
		String pseudoss = "Azmog, Faiden, Voone,Neutrons, test, fromage";
		String[] pseudos = pseudoss.split(",");
		System.out.println(pseudos[1]);
	}

}
