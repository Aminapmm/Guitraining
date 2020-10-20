package BubbleSort;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    public static void sort(String path)throws Exception{

        ArrayList<Integer> data = new ArrayList<Integer>();

        File file = new File("C:\\Users\\datacomputer\\Desktop\\test.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String st;
        while((st = reader.readLine()) != null){
            data.add(Integer.parseInt(st));
        }

        for(int i=0;i<data.size();i++){
            for(int j=0; j<data.size()-i-1;j++){

                if(data.get(j)>data.get(j+1)){

                    int tmp = data.get(j);
                    data.set(j,data.get(j+1));
                    data.set(j+1,tmp);
                }
            }
        }

        System.out.println(data);

    }

    public static void main(String[] args) {
        try {

            sort("amin");


        }

        catch (Exception e){
            e.printStackTrace();
        }
    }
}

