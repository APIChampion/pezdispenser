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
    pezCount = MAX_PEZ;

  }
  //string.contains
  // public boolean contains()
  // below is a method which can be identified because of its return
  public String getCharacterName(){
    return characterName;

  }
  public boolean isEmpty(){
    return pezCount == 0;
  }
}
