import java.util.Scanner;
class Permute {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str="abcd";
        int count=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    for(int l=0;l<4;l++){
                        if(i!=j&&i!=k&&i!=l&&j!=k&&j!=l&&k!=l){
                            System.out.print(str.charAt(i));
                            System.out.print(str.charAt(j));
                            System.out.print(str.charAt(k));
                            System.out.print(str.charAt(l));
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}
