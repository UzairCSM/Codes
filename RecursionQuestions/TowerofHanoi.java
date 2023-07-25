package RecursionQuestions;

public class TowerofHanoi {
    public static void toh(int n,String src ,String help,String dest){
        if(n==0){
            return;
        }
        toh(n-1,src,dest,help);
        System.out.println("Move disk"+" "+n+" "+"From"+" "+src+" "+"to"+" "+dest);
        toh(n-1,help,dest,src);
    }

    public static void main(String[] args) {
        String src="Source";
        String help="helper";
        String dest="destination";
        int n=3;
        toh(n,src,help,dest);
    }
}
