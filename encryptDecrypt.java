public class encryptDecrypt
{
    //Scanner input=new Scanner(System.in);
//String text="";
//int number=151;
    public encryptDecrypt(String str)
    {   
    
    }
    
    public static String encrypt(String str, int a, int b, int c)
    {
      //use for loop to go through every space in string
      //shift by 1, then 5, then 1 (if not letter anymore, then start from beginning again)
      //151 should be incremented to 262, 373, 484, 595 (until a digit hits 9 then go back to 151, 
      //or where there is a digit of one present
      String returnString="";
      for(int i=0;i<=str.length()-3;i=i+3){
        int temp=(int)str.charAt(i);
        char tempA=(char)(checkLetter(temp+a));
        returnString=returnString+tempA;
        int temp2=(int)str.charAt(i+1);
        //temp2=checkLetter(temp2);
        char tempB=(char)(checkLetter(temp2+b));
        returnString+=tempB;
        int temp3=(int)str.charAt(i+2);
        //temp3=checkLetter(temp3);
        char tempC=(char)(checkLetter(temp3+c));
        returnString+=tempC;
        //add to encrypted string
        }
        //use mod, find remainder, then finish the rest of the loop
        if(str.length()%3==1){
        int temp=(int)str.charAt(str.length()-1);
        //temp=checkLetter(temp);
        char tempA=(char)(checkLetter(temp+a));
        returnString+=tempA;
        //add to encrypted string
        }else if(str.length()%3==2){
        int temp=(int)str.charAt(str.length()-2);
       // temp=checkLetter(temp);
        char tempA=(char)(checkLetter(temp+a));
        returnString+=tempA;
        int temp2=(int)str.charAt(str.length()-1);
        //temp2=checkLetter(temp2);
        char tempB=(char)(checkLetter(temp+b));
        returnString+=tempB;
        //add to encrypted string
        }
        return returnString;
    }
    
    public static int checkLetter(int ASCIIRef){
    if((ASCIIRef>=65&&ASCIIRef<=90)||(ASCIIRef>=97&&ASCIIRef<=122)){
    return ASCIIRef;
    }else{
    return ASCIIRef-26;
    }
    }
    
   public static String decrypt(String str, int a, int b, int c){
        //use for loop to go through every space in string
     //subtract by 1, then 5, then 1 (if not letter anymore then add 26)
     String returnString="";
     for(int i=0;i<=str.length()-3;i=i+3){
        int temp=(int)str.charAt(i);
        char tempA=(char)(checkLetter2(temp+26-a));
        //System.out.println(tempA);
        returnString+=tempA;
        int temp2=(int)str.charAt(i+1);
        //System.out.println(temp2);
        char tempB=(char)(checkLetter2(temp2+26-b));
        //System.out.println(tempB);
        returnString+=tempB;
        int temp3=(int)str.charAt(i+2);
        char tempC=(char)(checkLetter2(temp3+26-c));
        //System.out.println(tempC);
        returnString+=tempC;
        }
        if(str.length()%3==1){
        int temp=(int)(str.charAt(str.length()-1));
        char tempA=(char)(checkLetter2(temp+26-a));
        returnString+=tempA;
        }else if(str.length()%3==2){
        int temp=(int)(str.charAt(str.length()-2));
        char tempA=(char)(checkLetter2(temp+26-a));
        returnString+=tempA;
        int temp2=(int)(str.charAt(str.length()-1));
        char tempB=(char)(checkLetter2(temp2+26-b));
        returnString+=tempB;
        }
     return returnString;
      //shift by 1, then 5, then 1 (if not letter anymore, then start from beginning again)
      //151 should be incremented to 262, 373, 484, 595 (until a digit hits 9 then go back to 151, 
      //or where there is a digit of one present
    }
    
    public static int checkLetter2(int ASCIIRef){
    if((ASCIIRef>=65&&ASCIIRef<=90)||(ASCIIRef>=97&&ASCIIRef<=122)){
    return ASCIIRef;
    }else{
    return ASCIIRef-26;
    }
}
}
