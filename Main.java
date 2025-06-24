package CS201LLab5Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.ArrayList;
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
        
            //create the ArrayList of Student type
            ArrayList<Student> studentList = new ArrayList<Student>();
            String inputLine;
            boolean idValid = false, answersValid = false;

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
                    Main.Student newStudent = new Student(studentId, studentAnswers, studentScore, studentPercent, studentGrade);
                    studentList.add(newStudent);
                } else {
                    //write errors to the error file
                }
            }

            //write the output report by printint totals 
 

            //loop to print ArrayList (done for your to print Student objects)
            reportWriter.printf("%10s%10s%10s%10s\n","ID","SCORE","PERCENT","GRADE");
            for (Student s : studentList){
                reportWriter.print(s.getStudentInfo());
                reportWriter.println();
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


    //Student Class (done for you)
    public static class Student{
        //Attributes
        private int studentID;
        private String answerString;
        private int score;
        private double percent;
        private char grade;
        
        //Constructor
        public Student(int i, String a, int s, double p, char g){
            this.studentID = i;
            this.answerString = a;
            this.score = s;
            this.percent = p;
            this.grade = g;
        }

        public String getStudentInfo(){
            return String.format("%10d%10d%10.2f%10c", studentID, score, percent, grade);

        }
    }
} 