package fag;

public class Movie {

	  // Constantes de preço necessárias aqui para que a classe Price possa usá-las
	  public static final int  CHILDRENS = 2;
	  public static final int  REGULAR = 0;
	  public static final int  NEW_RELEASE = 1;

	  private String _title;
	  private Price _price;

	  public Movie(String title, int priceCode) {
	      _title = title;
	      _price = new Price(priceCode); 
	  }

	  public int getPriceCode() {
	      return _price.getPriceCode();
	  }

	  public void setPriceCode(int arg) {
	      _price.setPriceCode(arg);
	  }

	  public String getTitle (){
	      return _title;
	  }
      
    // MÉTODO getCharge() AGORA DELEGA a chamada a _price (MUDANÇA DO COMMIT 9)
    public double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
    }
    
    // MÉTODO getThisAmount() FOI REMOVIDO! (MUDANÇA DO COMMIT 9)
    
    // MÉTODO DE PONTOS INALTERADO
	  public int getFrequentRenterPoints(int daysRented) {
	      if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1) {
	          return 2;
	      }
	      return 1;
	  }
}