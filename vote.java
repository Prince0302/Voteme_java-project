//import java.util;
import java.util.Scanner;

public class vote{

    float prince;
    float rohit;
    float dipesh;
    float martha;

    // funcation to calculate result
    public static vote result (int TotalVoters , int arr [])
    {
        // created object
        vote v = new vote();
        float percent = 100/TotalVoters;
        v.prince = v.rohit = v.dipesh = v.martha = 0;
        
        for(int i=0; i < TotalVoters; i++)
        {
            switch (arr[i])
            {
                case 1:
                    (v.prince)++;
                    break;
                case 2:
                    (v.rohit)++;
                    break;
                case 3:
                    (v.dipesh)++;
                    break;
                case 4:
                    (v.martha)++;
            }
        }
        System.out.println("\n\n");
        System.out.println("\t Result \n");
        System.out.println("Prince\t" +(v.prince)*percent +"%");
        System.out.println("Rohit\t" +(v.rohit)*percent +"%");
        System.out.println("Dipesh\t" +(v.dipesh)*percent +"%");
        System.out.println("Martha\t" +(v.martha)*percent +"%");  
        System.out.println("\n\n");     

        return v;
    }

    public static void main(String pk[])
    {
        System.out.println("--->> Voting System <<------");
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter total numbers of voters ");
        int TotalVoters = sc.nextInt();
        int arr[] = new int[TotalVoters];

        for (int i=0; i<TotalVoters; i++)
        {
            System.out.println("\n");
            System.out.println(" Select any one candidate to vote ");
            System.out.println("1.Prince");
            System.out.println("2.Rohit");
            System.out.println("3.Dipesh");
            System.out.println("4.Martha");
            arr[i] = sc.nextInt();
        }

        vote v = result(TotalVoters,arr);
        System.out.println("\t");

        if(v.prince > v.rohit && v.prince > v.dipesh && v.prince > v.martha)
        {
            System.out.println(" The winner is ---->> Prince");
        }
        else if(v.rohit > v.prince && v.rohit > v.dipesh && v.rohit > v.martha)
        {
            System.out.println("The winner is ---->> Rohit");
        }
        else if(v.dipesh > v.prince && v.dipesh > v.rohit && v.dipesh > v.martha)
        {
            System.out.println("The winner is ---->> Dipesh");
        }
        else
        {
            System.out.println("The winner is ---->> Martha");
        }
    }
}
