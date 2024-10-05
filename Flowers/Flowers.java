import java.io.*; 

public class Flowers {
    public static void main(String args[]) throws Exception {
        String flowerName;
		String growthCondition;;

        FileReader fr = new FileReader("flowers.dat");
        BufferedReader br = new BufferedReader(fr);

        while((flowerName = br.readLine()) != null)
		{
			    growthCondition = br.readLine(); 

            System.out.println(flowerName + " grow best with " + growthCondition);
        }
        br.close(); 
        System.exit(0);
    }
}
