package ro.sda.bianca.inputoutput.ex1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {


        File file = new File("C:\\Users\\user\\Desktop\\SDA\\newfile.txt"); //referinta catre fisier

        StringBuffer fileContent = new StringBuffer();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String fileLine;
            while ((fileLine = bufferedReader.readLine()) != null) {
                fileContent.append(fileLine);
                fileContent.append("\n");
            }
        }

        String newFileContent = fileContent.toString().replace("LALA","BUNA");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file)))
        {
            bufferedWriter.write(newFileContent);
        }
    }

}