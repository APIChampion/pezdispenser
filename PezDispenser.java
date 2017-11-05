class PezDispenser{
  //class scope
  //final means that the value can only be used once
  final private String characterName;
  //constant example is below
  //constants
  //static allows me to call the variable from the class level versus the instance level. we would us
  //use this here because the max pez of 12 will always be the same.
  public static final int MAX_PEZ = 12;
  private int pezCount;

  //below is a constructor
  //this is refers to this instance
  public PezDispenser(String characterName){
    this.characterName = characterName;
    pezCount = 0;

  }
  //we use void when nothing is returned. we use a method when something needs to be built
  //in this we using a variable from the class to the instance.
  // to say this another way this is called abstractions. we use this as a basis for a
  //object orieted programming
  public void fill(){
    fill(MAX_PEZ);

  }

  public void fill(int pezAmount){
    int newAmount = pezCount + pezAmount;
    if (newAmount > MAX_PEZ){
      throw new IllegalArgumentException("Too many Pez");
    }

  }






//the below boolean method is reducing by 1
//each time the a pez is dispensed
//first we set a local boolean variable called
// wasDispensed to false then we validate if
// if the value is actually false
//if isEmpty method returns a false which means
//the pez has candy then we reduce by one and set
//the value of boolean to true. if the isEmpty is true
//meaning that the pez is empty then we do reduce the value
//of the pezcount


  public boolean dispense(){
    boolean wasDispensed = false;
    if (!isEmpty()){
      pezCount--;
      wasDispensed = true;
    }
    return wasDispensed;

  }
  //string.contains
  // public boolean contains()
  // below is a method which can be identified because of its return
  public String getCharacterName(){
    return characterName;

  }
  //below returns true of if pezcount is 0 but if pez isn't zero then the method will
  //return false
  public boolean isEmpty(){
    return pezCount == 0;
  }
}
