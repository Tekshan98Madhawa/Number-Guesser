import java.util.Scanner;
class guessNumber{
	public static int generateRandomInteger(int from, int to){
        return (int)(Math.random() * to + from);
    }
	public static void processMessage(){
		System.out.println("Please wait MF.");
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many Guesses do you want ?");
		int guesses =scanner.nextInt();
		
		processMessage();
		int systemNumber = generateRandomInteger(0,100);
		while(guesses > 0){
			System.out.println("Enter a number");
			int number = scanner.nextInt(); 
			if(number < systemNumber){
                System.out.println("Generated number is bigger");
            }else if(number > systemNumber){
                System.out.println("Generated number is smaller");
            }else{
                System.out.println("You won !");
                break;
            }
            guesses--;
		}
		if(guesses == 0){
			System.out.println("You lost may be next time...");
		}
				
		scanner.close();
	}
	
}
