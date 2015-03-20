import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
public class Main {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(scan.readLine());
		
		
		while(cases > 0){
			//read line and split by space
			String no = scan.readLine();
			String line [] = no.split("\\s+");
			
			int pages = Integer.parseInt(line[0]);
			int currPages = Integer.parseInt(line[1]);
			int money = Integer.parseInt(line[2]);
			int books = Integer.parseInt(line[3]);
			pages = pages - currPages;
			boolean success = false;
			//loop through the possible notebooks
			for(int i = 0; i < books; i++){
				
				String hello = scan.readLine();
				String yes [] = hello.split("\\s+");
				// if pages and price satisfy 
				if(Integer.parseInt(yes[0]) >= pages && Integer.parseInt(yes[1])<= money){
					success = true;
					
					
				}
				
				
			}
			
			if(success){
				
				System.out.println("LuckyChef");
			}
			else{
				System.out.println("UnluckyChef");
			}
			
			cases--;
		}
	}
 
}
