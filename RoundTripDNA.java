/**
 * This class uses StringDNA to determine whether the reverse-complement of the reverse-complement gives back the original DNA string
 *
 * @author Luisely Doza
 * @version September 2, 2019
 */
public class RoundTripDNA {
    /**
     * main method creates a stringDNA object to check if the original DNA strand will return by using the reverseComplement() method twice
     */
    public static void main() {
        stringDNA dna = new stringDNA();
        String reverseComplement = dna.reverseComplement("ATG");
        String originalDNA = dna.reverseComplement(reverseComplement);
        System.out.println("The reverse complement of ATG is " + reverseComplement);
        System.out.println("The reverse complement of CAT is " + originalDNA);
    }
}
