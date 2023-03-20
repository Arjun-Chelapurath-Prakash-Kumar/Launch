import java.util.*;

class logic{
     public static void main(String[] args){
    //     int num=2000;

    //     switch(num)
    //     {
    //         case 200: System.out.println("Case 1 matching");
    //         break;
    //         case 300: System.out.println("Case 2 matching");
    //         break;
    //         case 100: System.out.println("Case 3 matching");
    //         break;
    //         default: System.out.println("default");

    //     }

    //     for(int i=0; i<5; i++){
    //         System.out.println("sss");
        
    //     }

        // System.out.println("Enter the age");
        // Scanner sc = new Scanner(System.in);
        // int age= sc.nextInt();
        // System.out.println("Enter the percentage");
        // Double p= sc.nextDouble();
        // System.out.println("Enter the name");
        // sc.nextLine();
        // String Name= sc.nextLine();
        // System.out.println(age + "," + Name + ","+p);

        // int n=10;

        // for(int i=0;i<=n-1;i++)
        // {
        //     for(int j=0; j<=n-1; j++){
        //         if (i==0 || j==0 || i==n-1 || j==n-1){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
            
        // }

        // int n=10;

        // for(int i=0;i<=n-1;i++)
        // {
        //     for(int j=0; j<=n-1; j++){
        //         if (i==0 || j==(n-1)/2){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
            
        // }

        int n=5;

        for(int i=0;i<=n-1;i++)
        {
            for(int j=0; j<=n-1; j++){
                if ((i==0 && j>0 && j<(n-1)/2) || (j==0 && i>0 ) || (j==(n-1)/2 && i>0) || (i==(n-1)/2 && j<=(n-1)/2) ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            
        }

    }
}

