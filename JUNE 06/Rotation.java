import java.util.*;
class Rotation  
{  
    public static void main(String[] args) 
    {  
        Scanner sc= new Scanner(Sysftem.in);
        System.out.println(" ENter the strings ");
        String str1=sc.nextLine();
        String str2=sc.nextLine();

      
          
        if(str1.length()!= str2.length())
        {  
            System.out.println("String are not rotation of each other");  
        }  
        else 
        {  
            str1 = str1.concat(str1);  
            if(str1.indexOf(str2) != -1)
            {  
                System.out.println("String are rotation of each other");  
            }
        }  
    }  
}