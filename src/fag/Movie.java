package fag;

public class Movie {

	  public static final int  CHILDRENS = 2;
	  public static final int  REGULAR = 0;
	  public static final int  NEW_RELEASE = 1;

	  private String _title;
	  private int _priceCode;

	  public Movie(String title, int priceCode) {
	      _title = title;
	      _priceCode = priceCode;
	  }

	  public int getPriceCode() {
	      return _priceCode;
	  }

	  public void setPriceCode(int arg) {
	      _priceCode = arg;
	  }

	  public String getTitle (){
	      return _title;
	  }
      
    // MÉTODO getCharge() SIMPLIFICADO (MUDANÇA DO COMMIT 7)
    public double getCharge(int daysRented) {
        // Agora, ele apenas chama o novo método auxiliar
        return getThisAmount(daysRented);
    }
    
    // NOVO MÉTODO AUXILIAR getThisAmount() (ADICIONADO NO COMMIT 7)
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