
//Java program to count the letters, spaces, numbers and other characters of an input string.
 import java.util.Scanner;
//Class name define
    public class CountCharacter {
        //within class code of main body started
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  //Scanner object is created for print the user value

        System.out.println("Enter a String value: ");   //print the statement in double qoute
        char[] s=sc.nextLine().toCharArray();   /*array is initialize using the s variable = sc is the variable name from scanner class
        . operator is called member operator in java for calling the reference ,nextLine() is a function to convert the uservalue into CharArray
         ; is the statement terminator or end the line*/

            int n=0,sp=0,ch=0,other=0,k=0;  //int type variable is intialize ,all variable is initialize 0 value
            /*
            int n=0;        //n represent number is initialize is 0.
            int sp=0;
            int ch=0;
            int other=0;
            int k=0;
            */
            //for loop condition is applay
            for(int i=0;i<=s.length-1;i++)  //for(initializeation;condition;increment operator)
            {

                if(Character.isAlphabetic(s[i])){
                    ch++ ;
                }
                else if(Character.isDigit(s[i])){
                    n++;
                }
                else if(Character.isSpaceChar(s[i])){
                    sp++;
                }
            }
          other++;

            System.out.println("the no of Digits: "+n);
            System.out.println("the no of Characters: "+ch);
            System.out.println("the no of Space: "+sp);
            System.out.println("the no of OtherSymbols: "+other);

        }

    }

