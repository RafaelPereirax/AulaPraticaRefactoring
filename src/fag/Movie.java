package fag;

public class Movie {

	  // Constantes de preço (ainda necessárias para o Price.createPrice())
	  public static final int  CHILDRENS = 2;
	  public static final int  REGULAR = 0;
	  public static final int  NEW_RELEASE = 1;

	  private String _title;
	  private Price _price; // Usa a nova classe Price

	  // Construtor: AGORA CHAMA O FACTORY METHOD DIRETAMENTE (MUDANÇA DO COMMIT 12)
	  public Movie(String title, int priceCode) {
	      _title = title;
	      _price = Price.createPrice(priceCode); 
	  }
      
      // getPriceCode() e setPriceCode() FORAM REMOVIDOS! (MUDANÇA DO COMMIT 12)

	  public String getTitle (){
	      return _title;
	  }
      
    // DELEGA PARA _price
    public double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
    }
    
    // DELEGA PARA _price
	public int getFrequentRenterPoints(int daysRented) {
	    return _price.getFrequentRenterPoints(daysRented);
	}
}