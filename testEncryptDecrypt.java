import java.util.Scanner;

public class testEncryptDecrypt
{
    public static void main(String args[]){
        //encryptDecrypt encryptObject=new encryptDecrypt();
        String intro="Hi! This is a string encryptor/decryptor. To encrypt, press 1. To decrypt, press 2.";
        System.out.println(intro);
        intro=intro.toUpperCase();
        System.out.println(intro);
        String intro2=intro.substring(42,intro.length());
        System.out.println(intro2);
        intro2=intro2.replace("E","e");
        System.out.println(intro2);
        intro2=intro2.toLowerCase();
        System.out.println(intro2);
        intro2=" "+intro2+" ";
        System.out.println(intro2);
        intro2=intro2.trim();
        System.out.println(intro2);
        
Scanner input = new Scanner(System.in);
String selector=input.nextLine();
System.out.println("Please input your string");
String text=input.nextLine();
System.out.println("Please input a 3 digit number for encryption/decryption");
int number=input.nextInt();
//int number=input.nextInt();
   //String text="abcdefghza";
//String text=input.next();
//System.out.println(text);
//int number=input.nextInt();
   //String text2="bgdejghmab";
   //int number=151;
   String numberConvert=Integer.toString(number);
   char numberConvert1=numberConvert.charAt(0);
   char numberConvert2=numberConvert.charAt(1);
   char numberConvert3=numberConvert.charAt(2);
//int numberConvertA=Character.getNumericalValue(numberConvert1);
   int numberConvertA=Integer.parseInt(Character.toString(numberConvert1));
   int numberConvertB=Integer.parseInt(Character.toString(numberConvert2));
   int numberConvertC=Integer.parseInt(Character.toString(numberConvert3));
if(selector.equals("1")){
System.out.println(encryptDecrypt.encrypt(text,numberConvertA,numberConvertB,numberConvertC));
}else if(selector.equals("2")){
System.out.println(encryptDecrypt.decrypt(text,numberConvertA, numberConvertB, numberConvertC));
}
}
/*
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
*/
}
