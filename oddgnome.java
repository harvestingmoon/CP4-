import java.util.*;
public class oddgnome {
    
    private void run()  {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        sc.nextLine();
        while (cases-- > 0) {
            ArrayList<Integer> gnomes = new ArrayList<>();
            String[] nums = sc.nextLine().split(" ");
            for (int x = 0; x < nums.length; x++)
                gnomes.add(Integer.parseInt(nums[x]));
            gnomes.remove(0);
            gnomes.remove(gnomes.size() - 1);
            for (int x = 0; x < gnomes.size(); x++)
                if (gnomes.get(x + 1) - gnomes.get(x) != 1) {
                    System.out.println(x + 2);
                    break;
                }
        }
        sc.close();
        // Insert wtv code you want here
    }

    public static void main(String args[]) {
        oddgnome obj = new oddgnome();
        obj.run();
    }
}
