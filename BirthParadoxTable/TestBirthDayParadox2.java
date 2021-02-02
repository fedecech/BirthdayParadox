public class TestBirthDayParadox2 {
  public static void main(String[] args){
    BirthParadoxTable bpt = new BirthParadoxTable(100);
    String table = bpt.createTable();

    System.out.println(table);
  }
}
