import java.util.*;
class pattern5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<2*n-1;i++)
        {
            for(int j=1;j<2*n-1;j++)
            {
                int top=i;
                int buttom=j;
                 int right=(2*n-1)-i;
                 int left=(2*n-1)-j ;               
                
                System.out.print(n-Math.min(Math.min(top, buttom),Math.min(left,right)));
                
            }
            System.out.println();
        }
    
    }
}
