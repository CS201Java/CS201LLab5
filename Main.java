package CS201LLab5Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inputFile = "student.txt";
        String reportFile = "report.txt";
        String errorFile = "error.txt";

        try {
            //create the IO files
            File file = new File(inputFile);
            Scanner input = new Scanner(file);
            PrintWriter reportWriter = new PrintWriter(new FileWriter(reportFile));
            PrintWriter errorWriter = new PrintWriter(new FileWriter(errorFile));
        
            String inputLine;
            boolean idValid = false, answersValid = false;
            //print header to reportWriter before continuing

            while (input.hasNextLine()) {
                inputLine = input.nextLine();

                //if this is the first line - this contains the answers
 
                //use substring to get the 2 parts of each input line
                //validate each part
 
                //if valid, calculate student values
                //create the student object (done for you)
                if (idValid && answersValid) {
                    //score student record
                    int studentId = 0;
                    String studentAnswers = " ";
                    int studentScore = 0;
                    double studentPercent = 0;
                    char studentGrade = ' ';

                    //once all is calculated, use reportWriter.printf command to print student information
                } else {
                    //write errors to the error file
                }
            }

           
            System.out.println("Processing complete. Check 'report.txt' and 'error.txt'.");

            input.close();
            errorWriter.close();
            reportWriter.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
            return;
        }
        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            return;
        }
    }

    //include at least 3 functions 


} 