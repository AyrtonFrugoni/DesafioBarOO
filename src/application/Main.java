package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

 
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill bill = new Bill();
		
		System.out.print("Sexo:");
		bill.gender = sc.next().charAt(0);

		System.out.print("Quantidade de cervejas:");
		bill.beerQtt = sc.nextInt();

		System.out.print("Quantidade de refrigerantes:");
		bill.softDrinkQtt = sc.nextInt();

		System.out.print("Quantidade de espetinhos:");
		bill.barbecueQtt = sc.nextInt();
		System.out.println();
		
		
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo  = R$ %.2f%n",bill.feeding());
		if (bill.cover()==4.00) {
			System.out.println("Couvert  = R$ 4.00");
		}
		else { System.out.println("Isento de Couvert");}
		
		System.out.printf("Ingresso = R$ %.2f%n",bill.ticket()); 
		System.out.println();
		System.out.println(bill);
		
		
		
sc.close();

			}
		}


