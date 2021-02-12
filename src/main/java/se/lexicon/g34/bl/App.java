package se.lexicon.g34.bl;

import se.lexicon.g34.bl.model.Name;
import se.lexicon.g34.bl.util.ReadWriteCollectionWithBuffering;

import java.util.ArrayList;
import java.util.List;

/**
 * Java I/O and Serialization practices
 * 2.Create a textfile (.txt) and fill it with lines of names.
 * a. In Java create a method that read in the lines into a Collection
 * of your choice using BufferedReader. One line for each element in the Collection.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String[] names={"Björn","Evert","Eva","Gösta","Harriet","Josef","Sven","Harriet","Ernst","Alma","Johan","Johanna","Ida","Matilda","Stefan","Mona","Gunilla"};

        ReadWriteCollectionWithBuffering.writeList("names.txt",names);

        List<Name> nameList=new ArrayList<>();
        nameList=ReadWriteCollectionWithBuffering.readList("names.txt");
        nameList.stream().forEach(System.out::println);
    }
}
