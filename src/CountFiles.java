import java.io.File;

public class CountFiles {
    String path;
    public CountFiles(String path){
        path = this.path;
    }
    public int FileCount(){
        File file = new File(path);
        String[] allFiles = file.list();
         
        byte numberOfPdfs = 0;    

        for(String fil : allFiles){ //elephant lol 🐘
            //Check for PDFs in all Files PDFs
            if(fil.contains("pdf") == true){
                numberOfPdfs++;
            }
        }

        String[] pdfFiles = new String[numberOfPdfs];
        int position = 0;

        for(String fil : allFiles){
            if(fil.contains("pdf") == true){
                pdfFiles[position] = fil;
                position++;
            }
        }

        for(int i = 0; i < numberOfPdfs; i++){
            System.out.println(pdfFiles[i]);
        }

        System.out.println(numberOfPdfs);
        System.out.println(pdfFiles.length);
        System.out.println(allFiles.length);

        return numberOfPdfs;
    }
}
