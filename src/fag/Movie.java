package fag;

public class Movie {

	  // CONSTANTES DE PREÇO REMOVIDAS! (MUDANÇA DO COMMIT 13)

	  private String _title;
	  private Price _price; // Usa a nova classe Price

	  // Construtor: AGORA CHAMA O FACTORY METHOD DIRETAMENTE
	  public Movie(String title, int priceCode) {
	      _title = title;
          // O createPrice() agora usa as constantes de Price.java
	      _price = Price.createPrice(priceCode); 
	  }
      
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