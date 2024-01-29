public class MARK {
    public static void main(String[] args) {
        System.out.println("Enter the marks of 5 subjects: ");
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<5; i++){
            arr[i] = sc.nextInt();
            if((arr[i]) >= 0 && (arr[i]<=100)) continue;
            else System.out.println("Invalid range");
        }
        
        int sum=0;
        for (int i: arr){
            sum+= i;
        }
        if(400<=sum && sum<=500)
            System.out.println("O");

        else if (300<=sum && sum<400)
            System.out.println("E");

        else if (200<=sum && sum<300)
            System.out.println("A");

        else if (100<=sum && sum<200)
            System.out.println("B");

        else if (0<=sum && sum<100)
            System.out.println("F");

        else
            System.out.println("Invalid marks has been given.");

        sc.close();
    }

    
}
