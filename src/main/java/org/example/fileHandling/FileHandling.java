package org.example.fileHandling;

import lombok.Getter;

import java.io.*;
import java.util.Scanner;

@Getter
public class FileHandling {

    private static final String FILE_PATH= "/Users/deepakry/projects/Java/src/main/java/org/example/fileHandling/test.json";
    private static final File fileObject = new File(FILE_PATH);

    public static void main(String[] args){
//        createNewFile();
//        writeOnFile();
//        readFileUsingFileReader();
//        readFileBufferedReader();
        readFileUsingScanner();
    }


    private static void createNewFile() {
        System.out.println("createFile");

        try {
            if (fileObject.createNewFile()) {
                System.out.println("sucess");
            }
            else {
                System.out.println("failure");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeOnFile() {
        System.out.println("writeOnFile");
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH);
            fileWriter.write("{\n\t\"data\": {\n\t\t\"name\": \"Deepak\",\n\t\t\"age\": \"25\"\n\t}\n}");
            fileWriter.close();
        } catch (IOException e){
            System.out.println("error writing");
            e.printStackTrace();
        }
    }
    private static void  readFileUsingFileReader() {
        System.out.println("readFile");
        try (FileReader fileReader = new FileReader(FILE_PATH)) {
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);  // Print each character
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    private static void readFileBufferedReader() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH))){
            String line;
            while((line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void readFileUsingScanner() {
        System.out.println(fileObject.length());
        try(Scanner scanner = new Scanner(fileObject)){
            String line;
            while(scanner.hasNext()){
                line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
