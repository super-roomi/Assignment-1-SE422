import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

     
        //#region User Input and storing of directory path
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your folder path please: ");
        String directoryPath = sc.nextLine();

        System.out.println(directoryPath);
        sc.close();
        //#endregion

        /*
        Creates an object of Type CountFile which counts the number of pdfs,
        the FileCount() method returns an integer that represents the number of
        PDF files found. 
        */
        CountFiles cf = new CountFiles(directoryPath);
        cf.FileCount();
        
    }
}
