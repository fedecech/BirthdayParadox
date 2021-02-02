import java.util.*;
public class BirthdayParadox {

  // args[0] == numPeople
  // args[1] == numTrials
  public static void main(String[] args){
    int numPeople = Integer.parseInt(args[0]);
    int numTrials = Integer.parseInt(args[1]);

    int counter = 0;
    for(int i = 0; i<numTrials; i++){
      int prob = checkTwoBirthdays(numPeople);
      counter += prob;
    }

    double res = (double) ((double)counter/(double)numTrials);
    System.out.println(res);
  }

  public static int checkTwoBirthdays(int numPeople){
    //double comps = (double) (numPeople * ((numPeople - 1) / 2));
    //double ind = (double) 364/365;
    //double prob = (double) (1 - (Math.pow(ind, comps)));
    Set<String> bdaysSet = new HashSet<String>();

    for (int i = 0; i<numPeople; i++){
      int rnd = (int)(Math.random() * 365 + 1); 
      bdaysSet.add("" + rnd); 
    }
    
    // if set size is < numpeople (means double values => 2 people have the same bday)
    if(bdaysSet.size() < numPeople){
      return 1;
    }

    return 0;
  }
}
