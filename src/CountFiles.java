import java.io.File;

public class CountFiles {
    String path;
    public CountFiles(String path){
        path = this.path;
    }
    public int FileCount(){
        File file = new File(path);
        String[] allFiles = file.list(); //list all the files in the directory
         
        byte numberOfPdfs = 0;    

        for(String fil : allFiles){ //elephant lol 🐘
            if(fil.contains("pdf") == true){ //Check for PDFs in all Files PDFs
                numberOfPdfs++;
            }
        }

        String[] pdfFiles = new String[numberOfPdfs]; //create new area with the size of the number of PDFs found
        int position = 0;

        for(String fil : allFiles){
            if(fil.contains("pdf") == true){
                pdfFiles[position] = fil; //Add the PDF files to the new array
                position++;
            }
        }

        for(int i = 0; i < numberOfPdfs; i++){
            System.out.println(pdfFiles[i]); //print out the files in the new array
        }

        System.out.println(numberOfPdfs); //print out the number of files
        System.out.println(pdfFiles.length); //print out the length fo the new array
        System.out.println(allFiles.length); //print out the length of the old array containing all the files in the dir

        return numberOfPdfs;
    }
}
