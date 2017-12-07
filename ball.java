public class ball{
  //Properties
  private int intX = 350;
  private int intY = 350;
  private int intMSX = (int)(Math.random()*5 + 3);
  private int intMSY = (int)(Math.random()*5 + 3);
  private int intR = 20;
  
  //Methods
  public void move(){
    intX += intMSX;
    intY += intMSY;
  }
  public void boundary(){
    int intTMSX = (int)(Math.random()*5 + 3);
    int intTMSY = (int)(Math.random()*5 + 3);
    if(intMSX < 0) intMSX = intTMSX;
    else intMSX = intTMSX * -1;
    if(intMSY < 0) intMSY = intTMSY;
    else intMSY = intTMSY * -1;
    
    if(intY < 0 || intY > 700) intY = 350;
    if(intX < 0 || intX > 700) intX = 350;
  }
  public void paddle(){
    int intTMSX = (int)(Math.random()*5 + 3);
    int intTMSY = (int)(Math.random()*5 + 3);
    if(intMSX < 0) intMSX = intTMSX;
    else intMSX = intTMSX * -1;
    if(intMSY < 0) intMSY = intTMSY;
    else intMSY = intTMSY * -1;
  }
  
  public int X(){
    return intX;
  }
  public int Y(){
    return intY;
  }
  public int R(){
    return intR; 
  }
  
  //Constructor
  public ball(){
  }
}