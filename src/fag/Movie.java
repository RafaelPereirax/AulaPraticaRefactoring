package fag;

public class Movie {

	  public static final int  CHILDRENS = 2;
	  public static final int  REGULAR = 0;
	  public static final int  NEW_RELEASE = 1;

	  private String _title;
	  private Price _price; // Usa a nova classe Price

	  // Construtor: usa o setter que chama o Factory Method
	  public Movie(String title, int priceCode) {
	      _title = title;
	      setPriceCode(priceCode); // Chama o setter (que usa createPrice)
	  }
      
      // getPriceCode() FOI REMOVIDO! (Será removido no Commit 12, mas agora o mantemos para compilar)
      // Como o método foi removido de Price, o melhor é removê-lo de Movie também.
      // Neste estágio, o getPriceCode() deve ser removido ou o código que o chama deve ser removido.
      
      // MANTEMOS SOMENTE setPriceCode
	  public void setPriceCode(int arg) {
	      _price = Price.createPrice(arg);
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