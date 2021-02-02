public class BirthParadoxTable{
  private int maxPeople;

  public BirthParadoxTable(int maxPeople){
    this.maxPeople = maxPeople;
  } 

  public String createTable(){
    String table = "****************************************************\n"
      +"# PEOPLE\t\t| RATE 2 PPL WITH SAME BDAY\n" +
      "****************************************************\n\n";
    double last = 1.0;
    for(int i=1; i<=maxPeople; i++){
      //double comps = (double) (i * ((i - 1) / 2));
      //double ind = (double) (364-1)/(365);
      //double prob = (double) (1 - (Math.pow(ind, comps)));
      double x = (double) i / 356;
      double ind = (double) 1.0 - x;
      System.out.println(ind);
      double prob = (double) (last * ind);
      last = prob;
      table += (i+1) + "\t\t\t| " + (1.0 - prob) + "\n";  
    }

    return table;
  }
}
