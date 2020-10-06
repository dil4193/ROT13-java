import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    System.out.println("enter your String:");
    //scan string
    String data=in.nextLine();

    //put string in array
    char[] ch=new char[data.length()];
    for(int i=0;i<data.length();i++){

      //convert string to character
      ch[i]=data.charAt(i);
      char let =ch[i];
      if(let >='a'&& let<='z')
      {
        if (let >'m')
        {
          let-=13;
        }
        else 
        {
          let+=13;
        }
      } else if (let>='A'&& let<='Z')
      {
        if (let>'M')
        {
          let-=13;
        }
        else
        {
          let+=13;
        }
      }
      char c=let;
      String str= Character.toString(c);
       System.out.print(str);
     }
  }
}
