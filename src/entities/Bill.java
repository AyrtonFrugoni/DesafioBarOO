package entities;

public class Bill {

	public char gender, F, M;
	public double  beer=5.00, barbecue=7.00, softDrink=3.00;
	public int beerQtt, barbecueQtt, softDrinkQtt;

	public double feeding() {
		return (beer * beerQtt) + (barbecue * barbecueQtt) 
				+ (softDrink * softDrinkQtt);}

	public double cover() {
		if (feeding() <= 30.00) {
			return 4.00;
		}
		else  {
			return 0.00;
		}
	}

	public double ticket () {
		if (gender == 'F') {
			return  8.00;}
		else {
			return 10.00;}
		}
	
	public double total() {
		return feeding() + cover() + ticket();
	}
	
	
	public String toString(){
		return "Valor a pagar = R$ " 
				+ String.format("%.2f",total());
		}
	
}
