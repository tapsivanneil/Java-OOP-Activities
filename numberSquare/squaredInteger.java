package numberSquare;
    import java.util.*;
public class squaredInteger {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        for(int i=1; i<= num; i++){
            int pickedNum = 0;
            int sum = 0;
  
            ArrayList<Integer> square = new ArrayList<>();

            if (i<=num){
                System.out.print("Enter a number: ");
                pickedNum = sc.nextInt();
                square.add(pickedNum);

                num-=1; //removing the gap

                while(i>=1 && i<= num){
                    pickedNum = sc.nextInt();
                    square.add(pickedNum);
                    i++;

                }
            }
            
            for(int j = 0; j<=num; j++){
                System.out.println("The square for "+ square.get(j)+ " is " + square.get(j) * square.get(j));
                sum += square.get(j)*square.get(j);
            }

            System.out.println("The sum is: " + sum);

            
            
        }

    

    }

}
