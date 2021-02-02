import java.io.*; 
import java.util.Arrays;

public class RunSolution{

	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_RESET = "\u001B[0m";

	public static void main(String[] args) throws Exception{

		//input parsing and reading
		File input00File = new File("../../test-cases/input/input00.txt");
		BufferedReader brInput00 = new BufferedReader(new FileReader(input00File));

		File input01File = new File("../../test-cases/input/input01.txt");
		BufferedReader brInput01 = new BufferedReader(new FileReader(input01File));

		File input02File = new File("../../test-cases/input/input02.txt");
		BufferedReader brInput02 = new BufferedReader(new FileReader(input02File));

		String st;
		int currentLine = 0;
		String lineSplit[];

		int s00[] = null;
		int m00 = 0;
		int d00 = 0;

		int s01[] = null;
		int m01 = 0;
		int d01 = 0;

		int s02[] = null;
		int m02 = 0;
		int d02 = 0;

		while((st = brInput00.readLine()) != null){
			if(currentLine == 1){
				s00 = Arrays
						.stream(st.split(" "))
						.mapToInt(Integer::parseInt)
						.toArray();

			}else if(currentLine == 2){
				lineSplit = st.split(" ");
				d00 = Integer.parseInt(lineSplit[0]);
				m00 = Integer.parseInt(lineSplit[1]);
			}
			currentLine++;
		}

		currentLine = 0;

		while((st = brInput01.readLine()) != null){
			if(currentLine == 1){
				s01 = Arrays
						.stream(st.split(" "))
						.mapToInt(Integer::parseInt)
						.toArray();
						
			}else if(currentLine == 2){
				lineSplit = st.split(" ");
				d01 = Integer.parseInt(lineSplit[0]);
				m01 = Integer.parseInt(lineSplit[1]);
			}
			currentLine++;
		}

		currentLine = 0;

		while((st = brInput02.readLine()) != null){
			if(currentLine == 1){
				s02 = Arrays.stream(st.split(" ")).mapToInt(Integer::parseInt).toArray();
			}else if(currentLine == 2){
				lineSplit = st.split(" ");
				d02 = Integer.parseInt(lineSplit[0]);
				m02 = Integer.parseInt(lineSplit[1]);
			}
			currentLine++;
		}

		// problem application

		int response00 = Birthday.run(s00, d00, m00);
		int response01 = Birthday.run(s01, d01, m01);
		int response02 = Birthday.run(s02, d02, m02);
		

		// expected outputs

		File output00File = new File("../../test-cases/output/output00.txt");
		BufferedReader brOutput00 = new BufferedReader(new FileReader(output00File));

		File output01File = new File("../../test-cases/output/output01.txt");
		BufferedReader brOutput01 = new BufferedReader(new FileReader(output01File));

		File output02File = new File("../../test-cases/output/output02.txt");
		BufferedReader brOutput02 = new BufferedReader(new FileReader(output02File));

		int output00 = 0;
		int output01 = 0;
		int output02 = 0;

		while((st = brOutput00.readLine()) != null){
			output00 = Integer.parseInt(st.trim());
		}

		while((st = brOutput01.readLine()) != null){
			output01 = Integer.parseInt(st.trim());
		}

		while((st = brOutput02.readLine()) != null){
			output02 = Integer.parseInt(st.trim());
		}


		System.out.println(((response00 == output00) ? ANSI_GREEN : ANSI_RED) + "INPUT 00");
		System.out.println(((response01 == output01) ? ANSI_GREEN : ANSI_RED) + "INPUT 01");
		System.out.println(((response02 == output02) ? ANSI_GREEN : ANSI_RED) + "INPUT 02" + ANSI_RESET);
	}
}