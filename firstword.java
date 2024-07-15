import java.util.*;
public class firstword {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char arr[]=s.toCharArray();
        int i;
        for( i=0;i<arr.length;i++){
        if(i==0)
        {
            System.out.println(s.charAt(i));
        }
        else if (arr[i]==' ') {
            System.out.println(s.charAt(i+1));
        } 

    }
}
}
