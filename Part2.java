import java.util.*;
public class Part2
{
    int findSimpleGene(String dna)
        {
            int ind = dna.indexOf("ATG");
            return ind;
        }
    public static void main(String[] args)
        {
            String dna;
            Scanner input = new Scanner(System.in);
            dna = input.next();
            int inx = findSimpleGene(dna);
            System.out.println(inx);
        }
}
