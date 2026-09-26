/* This is Electronic Voting Machine feeded Code */
import java.util.Scanner;
public class EVM{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] candidates={
            "Candidate 1",
            "Candidate 2",
            "Candidate 3",
            "Candidate 4"
        };
        int n=candidates.length;
        int[] votes=new int[n];
        int total_votes=0;
        int choice;
        do{
            System.out.println("====== ELECTRONIC VOTING MACHINE ======");
            System.out.println("1. Cast Vote");
            System.out.println("2. Display Results");
            System.out.println("0. Exit");
            System.out.print("Enter your Choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("------ Candidate List ------");
                    for(int i=0;i<n;i++){
                        System.out.println((i+1)+". "+candidates[i]);
                    }
                    System.out.print("Enter your vote: ");
                    int vote=sc.nextInt();
                    if(vote>=1 && vote<=n){
                        votes[vote-1]++;
                        total_votes++;   
                        System.out.println("Vote Cast Successfully!!");
                    }
                    else{
                        System.out.println("Wrong Choice, Please try again...");
                    }
                break;
                case 2:
                    System.out.println("------ Display Results ------");
                    System.out.println("Total Votes is "+total_votes);
                    for(int i=0;i<n;i++){
                        System.out.println(candidates[i]+" : "+votes[i]);
                    }
                    System.out.println("------ Result Time ------");
                    int max_votes=votes[0];                 //Determine candidates who is winner
                    int winner=0;                           //Winner have max. number of votes
                    for(int i=1;i<votes.length;i++){
                        if(max_votes<votes[i]){
                            max_votes=votes[i];
                            winner=i;
                        }
                    }
                    if(total_votes==0){
                        System.out.println("Total Votes is 0.");
                        System.out.println("No winner this time!!");
                    }
                    else{
                        System.out.println(candidates[winner]+" is Winner");
                        System.out.println("Votes is "+votes[winner]);
                    }
                break;
                case 0:
                    System.out.println("Exiting EVM...");
                break;
                default:
                    System.out.println("Invalid Choice! Please try again!");
                break;
            }
        }while(choice!=0);
        sc.close();
    }
}