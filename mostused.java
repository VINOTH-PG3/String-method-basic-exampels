package stringsExampels;

public class mostused {
	public static void main(String[] args) {
		String name="MADURAI city   ";
		
		System.out.println("1.UPPER CASE() method");
        //------- 1.UPPER CASE() change the character to capital letter
		                                  //String name="MADURAI city   ";
		System.out.println("UPPER CASE()-changing character to uppercase /MADURAI city / to :  "+name.toUpperCase());
		System.out.println();
//-----------/////NEXT/////-------------------------------------------------------------------------------------------//		
		
		//------ 2.LOWER CASE() method- change the character to smaller letter 
		System.out.println("2.LOWER CASE() method");                      
		                        //String name="MADURAI city   ";     
		System.out.println("LOWER CASE()-changing character to lowercase /MADURAI city/ to      :  "+name.toLowerCase());
		System.out.println();
//-----------/////NEXT/////-------------------------------------------------------------------------------------------//		
		
		//------3.trim() method remove spaces BEFORE AND AFTER CHARACTER
		System.out.println("3.trim() method");
		                       //String name="MADURAI city   ";
		System.out.println("TRIM()- removes space before and after  /MADURAI city  /to :  "+name.trim());
		System.out.println();
//-----------/////NEXT/////-------------------------------------------------------------------------------------------//		
		
		//------4.charat() method-SELECTING THE POSITION OF LENGTH
		System.out.println("4.charat() method");
		                String  bird= "parrot";
		System.out.println("charat()-the ZERRO POSITION OF /parrot/ is      "+bird.charAt(0));
		System.out.println("charat()-the FOURETH  POSITION OF WORD /parrot/ is   "+bird.charAt(4));
		System.out.println();
//-----------/////NEXT/////-------------------------------------------------------------------------------------------//		
		
	
		//-------startsWith() and endsWith()-the elements define by user is checked in string and print true or false
		System.out.println("5.startsWith() method and end with endsWith() method ");
		                String city="madurai-kalavasal";
		System.out.println("startsWith() - the name /MADURAI/ city Starts with  MA its true/false    "+city.startsWith("ma"));
		System.out.println("endsWith()- the name /MADURAI/ city Starts with  ity its true/false    "+city.endsWith("al"));
		System.out.println();
		//-----------/////NEXT/////-------------------------------------------------------------------------------------------//		
		
	
		//-------6).length()method
		System.out.println("6).length()method");
		                          // String city="madurai-kalavasal";
		          System.out.println("length()-The total length of string /madurai-kalavasal/ is  :"+city.length());
		          System.out.println();
//-----------/////NEXT/////-------------------------------------------------------------------------------------------//		
		
		          
		          //-------7)concat() method  is used to join two separate strings
		          System.out.println("7)concat() method");
		          String wplace="madurai";
		          String  desc = "  is a temple City";
		          
		          System.out.println("concat()- is used to join two seperate variable/madurai/,/is a temple city/ :"+wplace. concat(desc));
		          System.out.println();
//-----------/////NEXT/////-------------------------------------------------------------------------------------------//		
		
		          
		          System.out.println("8).Compare() method");
		  //8).Compare  comparing length between two letters of word if leters are same it moves with next word---------------//
		          //String wplace="madurai";
		          String bplace="sivakasi";
		          String b1place="madarai";
		         
System.out.println("compareTo()-the length between /madurai-sivakasi/ first letter m-s is "+wplace.compareTo(bplace));
System.out.println("compareTo()-the length between /madurai-madarai/ first three letters are same its moves with next u-a is "+wplace.compareTo(b1place));	          
System.out.println();
//-----------/////NEXT/////-------------------------------------------------------------------------------------------//		
		

System.out.println("9).contain()method");
//-------9).contain()- to check specified word in a variable
                 //String  desc = "  is a temple City";
System.out.println("contain()- to check specified word in a variable, check temple in /is a temple city/ is :"+desc.contains("temple"));
System.out.println("contain()- to check specified word in a variable, check tem in/is a temple city/ is :"+desc.contains("tem"));
System.out.println("contain()- to check specified word in a variable, check t in/is a temple city/ is :"+desc.contains("t"));
System.out.println();
//-----------/////NEXT/////-------------------------------------------------------------------------------------------//		



//-------10).equals()-if both values are same its print true otherwise false 

                                 String w1place="madurai";
                                 String w2place="MADURAI";
System.out.println("10).equals()");
System.out.println("equals()-if both values are same its print true otherwise false /madurai madurai/ is : "+wplace.equals(w1place));
System.out.println("equals()-if both values are same its print true otherwise false/madurai MADURAI/ is :  "+wplace.equals(w2place));
System.out.println();
//-----------/////NEXT/////-------------------------------------------------------------------------------------------//		


//-------11).equalsIgnoreCase()-if both values are same its print true otherwise false 
System.out.println("11).equalsIgnoreCase()");
                         //String w1place="madurai";
                         //String w2place="MADURAI";
System.out.println("equalsIgnoreCase()-if both values are same any upper or lower cases its print true otherwise "
		+ "false/madurai MADURAI/ is :   "+wplace.equalsIgnoreCase(w2place));
System.out.println();
//-----------/////NEXT/////-------------------------------------------------------------------------------------------//		


//-------12).indexOf()---selecting position of given Character 
System.out.println("12).indexOf()");
                         //String wplace="madurai";
System.out.println("indexOf()-selecting position length of given Character  /madurai/ position of a is :"+wplace.indexOf('a') );
System.out.println();
//-----------/////NEXT/////-------------------------------------------------------------------------------------------//		


System.out.println("13)lastindexOf()");
//-------13)lastindexOf()---selecting position of given Character
                       //String wplace="madurai";
System.out.println("lastindexOf()-selecting last position length of given Character  /madurai/ position of i is :"+wplace.indexOf('i') );
System.out.println();
//-----------/////NEXT/////-------------------------------------------------------------------------------------------//		


System.out.println("14)isEmpty()");
//-------14)isEmpty()-MEntion true or false if there is any null value in string variable
//String name="MADURAI city   ";
String withoutspace="";
String withspace="  ";
System.out.println("isEmpty()-MEntion true or false if there is any any null value in string variable  /MADURAI city/is         :"+name.isEmpty());
System.out.println("isEmpty()-MEntion true or false if there is any any null value in string variable  / null without space /is :"+withoutspace.isEmpty());
System.out.println("isEmpty()-MEntion true or false if there is any any null value in string variable  /null with space /is     :"+withspace.isEmpty());
System.out.println();
//-----------/////NEXT/////-------------------------------------------------------------------------------------------//		


System.out.println("15)join() method");
//-------15)join()---delimiter(first element) is copied and joined in each element
String date = String.join("/","01","10","1991"); /////important//////////intializing variable by creating object
String nullv=null;
System.out.println("join()---delimiter(first element) is copied and joined in each element/(/,01,10,1991)/is  :"+date );
System.out.println("join()---the null value given without double qoutes /(/null/is  :"+nullv );
System.out.println();
//-----------/////NEXT/////-------------------------------------------------------------------------------------------//		


System.out.println("16)replace()method");
//-------16)replace()-replacing a current word to new word
 String mud="madurai is a tempel town";

System.out.println("replace()-replacing a current word to new word. replace town to city in /madurai is a tempel town/ is :"+mud.replace("town" ,"city"));
System.out.println("replace()-replacing a current word to new word. replace a to A in /madurai is a tempel town/ is :"+mud.replace('a' ,'A'));
System.out.println();
//-----------/////NEXT/////-------------------------------------------------------------------------------------------//		


System.out.println("17)replaceAll()");
//-------17)replaceAll()-replacing is same as replace it can add space between character
String replace1="MADURAI CITY";
System.out.println("replaceAll()-replacing is same as replace it can add space between character"
                                   +replace1.replaceAll(""," "));
System.out.println();
//-----------/////NEXT/////-------------------------------------------------------------------------------------------//		


System.out.println("18)split()method");
//-------18)split()-spiting a group of character in a string and print separately
System.out.println("Split group of words in one string/MADURAI,TRICHY,COIMBATORE,TIRUNELVELI,THENI,CHENNAI/ :");
String district="MADURAI,TRICHY,COIMBATORE,TIRUNELVELI,THENI,CHENNAI";
String[] disArry=district.split(",");
for(String disArry1:disArry){
	
	System.out.println((disArry1));
}
System.out.println();


		
		
System.out.println("19)substring()");
//-------19)Substring()- Taking preferred element in a character
//String replace1="MADURAI CITY";
System.out.println("Substrin()-takes prefered elements from a chracter-selecting from 2nd legth to before 5th position (2,5) /MADURAI CITY/ is  :"+replace1.substring(2,5));
System.out.println("Substrin()-selecting from oth legth to total length (0,11)/MADURAI CITY/ is  :"+replace1.substring(0,11));
System.out.println("Substrin()-selecting from oth legth to OUT OF TOTAL length (0,12) /MADURAI CITY/ is  :"+replace1.substring(0,12));
System.out.println();
//-----------/////NEXT/////-------------------------------------------------------------------------------------------//		
	
	
	System.out.println("20).toCharArray()method");
//-------20). toCharArray()---TO split Separate character
String s ="ABCD";
		    System.out.println("TO split Sepaerate character of a word(string given ) /ABCD/ IS  :");
			
		    char[] ch=s.toCharArray(); 
			for(int i=0;i<ch.length;i++){
				System.out.println(ch[i]);
				                        }
			
			System.out.println("in vertical way for toCharArray()");
			for(int i=0;i<ch.length;i++){

				System.out.print(ch[i]+ "\t");
	}           System.out.println();
//-----------/////NEXT/////-------------------------------------------------------------------------------------------//		
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
