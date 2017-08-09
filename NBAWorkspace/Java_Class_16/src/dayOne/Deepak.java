package dayOne;

public class Deepak implements GoaTrip{

	public static void main(String[] args) {
		
		Deepak deepak = new Deepak();
		deepak.getBusTicket();
		deepak.getHotelVoucher();
		deepak.getMedicine();
		deepak.getSwimSuit();
		deepak.getTicket();
		
	}

	@Override
	public void getTicket() {
		// TODO Auto-generated method stub
		System.out.println("got ticket");
		
	}

	@Override
	public void getSwimSuit() {
		// TODO Auto-generated method stub
		System.out.println("got swimsuit");
		
	}

	@Override
	public void getHotelVoucher() {
		// TODO Auto-generated method stub
		System.out.println("got HotelVoucher");
		
	}

	@Override
	public void getBusTicket() {
		// TODO Auto-generated method stub
		System.out.println("got Busticket");
		
	}

	@Override
	public void getMedicine() {
		System.out.println("got medicine");
		
	}

	

	

}
