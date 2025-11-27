package fag;

public class Movie {

	  // Constantes de preço (Ainda necessárias para o Price.createPrice())
	  public static final int  CHILDRENS = 2;
	  public static final int  REGULAR = 0;
	  public static final int  NEW_RELEASE = 1;

	  private String _title;
	  private Price _price; // Usa a nova classe Price

	  // Construtor: usa o setter que chama o Factory Method
	  public Movie(String title, int priceCode) {
	      _title = title;
	      setPriceCode(priceCode); 
	  }
      
      // MÉTODO getPriceCode() REMOVIDO NO COMMIT 12! (Por enquanto, deixamos um placeholder, mas o ideal é removê-lo.)
      // Para evitar quebras em Customer/Rental que possam usar este método, vamos removê-lo.
      // AQUI, assumimos que as chamadas foram removidas.

      // Setter: Usa o Factory Method da Price
	  public void setPriceCode(int arg) {
	      _price = Price.createPrice(arg);
	  }

	  public String getTitle (){
	      return _title;
	  }
      
    // DELEGA PARA _price (método abstrato em Price, implementado nas subclasses)
    public double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
    }
    
    // DELEGA PARA _price (método abstrato em Price, implementado nas subclasses)
	public int getFrequentRenterPoints(int daysRented) {
	    return _price.getFrequentRenterPoints(daysRented);
	}
}