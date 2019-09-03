/**
 * This class can take any DNA strand and manipulate it by creating the reverse, complement, or reverse complement
 * 
 * @author Luisely Doza
 * @version September 2, 2019
 */
public class stringDNA {
    /**
     * This method reverses a DNA strand using a for loop
     * 
     * @param String s being a DNA strand
     * @return reverseDNA returns the reversed DNA String
     */
    public String reverse(String s) {
        String reverseDNA = "";
        for (int i = s.length()-1; i >= 0 ; i--){
            reverseDNA = reverseDNA + s.charAt(i);
        }
        return reverseDNA;
    }
    /**
     * This method will take a DNA strand and return the complement using a for loop,
     * where A(Adenine) matches with T(Thymine) and G(Guanine) matches with C(Cytosine)
     * 
     * @param String s being a DNA strand
     * @return complementDNA returns the complemented DNA String
     */
    public String complement(String s) {
        String complementDNA = "";
        for (int i = 0; i < s.length(); i++) {
            char letter;
            if (s.charAt(i) == 'T') {
                letter = 'A';
            } else if (s.charAt(i) == 'A') {
                letter = 'T';
            } else if (s.charAt(i) == 'C') {
                letter = 'G';
            } else {
                letter = 'C';
            }
            complementDNA = complementDNA + letter;
        }
        return complementDNA;
    }
    /**
     * This method will create the reverse complement of a DNA strand by using the complement() and reverse() methods created
     * 
     * @param String s being a DNA strand
     * @return reverseComplementDNA returns the reverse complemented DNA String
     */
    public String reverseComplement(String s) {
        String complementDNA = complement(s);
        String reverseComplementDNA = reverse(complementDNA);
        return reverseComplementDNA;
    }
    /**
     * main method is being used to run tests on reverse, complement, and reverseComplement methods
     */
    public static void main(String[] args) {
        stringDNA dna = new stringDNA();
        System.out.println("The reverse of ATG is " + dna.reverse("ATG"));
        System.out.println("The complement of ATG is " + dna.complement("ATG"));
        System.out.println("The reverse complement of ATG is " + dna.reverseComplement("ATG"));
    }
}
