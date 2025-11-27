package fag;

public class Movie {

	  public static final int  CHILDRENS = 2;
	  public static final int  REGULAR = 0;
	  public static final int  NEW_RELEASE = 1;

	  private String _title;
	  private Price _price; // <--- MUDANÇA 1: Substitui _priceCode por objeto Price

	  public Movie(String title, int priceCode) {
	      _title = title;
          // MUDANÇA 2: Cria o objeto Price no construtor
	      _price = new Price(priceCode); 
	  }

      // MUDANÇA 3: Delega a chamada ao objeto _price
	  public int getPriceCode() {
	      return _price.getPriceCode();
	  }

      // MUDANÇA 4: Delega a chamada ao objeto _price
	  public void setPriceCode(int arg) {
	      _price.setPriceCode(arg);
	  }

	  public String getTitle (){
	      return _title;
	  }
      
    // MÉTODO getCharge() Simples: Chama o auxiliar
    public double getCharge(int daysRented) {
        return getThisAmount(daysRented);
    }
    
    // MÉTODO getThisAmount(): Sem Alterações (usando getPriceCode())
    private double getThisAmount(int daysRented) {
        double result = 0;
        switch (getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (daysRented > 2)
                    result += (daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += daysRented * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (daysRented > 3)
                    result += (daysRented - 3) * 1.5;
                break;
        }
        return result;
    }
    
    // MÉTODO DE PONTOS INALTERADO
	  public int getFrequentRenterPoints(int daysRented) {
	      if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1) {
	          return 2;
	      }
	      return 1;
	  }
}