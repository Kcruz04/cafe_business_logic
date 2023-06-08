import java.util.ArrayList;

class CafeUtil {
    public int getStreakGoal(){
        int[] myArray = {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10
            };
        int sum = 0;
        int i; 

        // Loop through the array elements and store the sum in the sum variable
        for (i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        System.out.println("The sum is: " + sum);
        return sum;
    }

    public double getOrderTotal(double[] prices){
        double sum = 0.0;
        int i; 

        // Loop through the array elements and store the sum in the sum variable
        for (i = 0; i < prices.length; i++) {
            sum += prices[i];
        }
        return sum;
    }

    void displayMenu(ArrayList<String> items){
        int i;
        for(i = 0; i < items.size(); i++){
            String menuItem = items.get(i);
            System.out.println(i + " " + menuItem);
            // to access an element in an ArrayList using an index
        }
    }

    void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello " + userName);
        System.out.println("There are " + customers.size() + " people in front of you.");
        customers.add(userName);
        System.out.println(customers);
    }
}
