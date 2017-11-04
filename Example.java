public class Example {

  public static void main(String[] args){
    //your amazing code goes here
    System.out.println("We are making a new PEZ Dispenser");
    System.out.printf("FUN Fact: there are %d PEZ in every PEZ dispenser", PezDispenser.MAX_PEZ);
    PezDispenser dispenser = new PezDispenser("Yoda");
    System.out.printf("The dispenser is %s %n", dispenser.getCharacterName());
    if (dispenser.isEmpty()){
      System.out.println("Dispenser is empty");
    }
    System.out.println("Filling the dispenser......with delicious PEZ");
    dispenser.fill();
    if (!dispenser.isEmpty()){
      System.out.println("Dispenser is FULL");
    }


  }
}
