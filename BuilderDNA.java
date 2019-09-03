/**
 * BuilderDNA provides the same functionality as StringDNA but it uses the Java StringBuilder class instead of String
 * wasn't able to finish, still working on complement, had to create reverseComplement, and finish test in main
 *
 * @author Luisely Doza
 * @version September 2, 2019
 */
public class BuilderDNA {
    /**
     * This method will take a DNA strand and return the complement using a for loop,
     * where A(Adenine) matches with T(Thymine) and G(Guanine) matches with C(Cytosine)
     * (not finished)
     * 
     * @param String s being a DNA strand
     * @return complementDNA returns the complemented DNA String
     */
    public static StringBuilder complement(StringBuilder s) {
        StringBuilder b = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'T') {
                b.append('A');
            } else if (s.charAt(i) == 'A') {
                b.append('T');
            } else if (s.charAt(i) == 'C') {
                b.append('G');
            } else {
                b.append('C');
            }
        }
        return b;
    }
    /**
     * main method is being used as a test(not finished)
     */
    public static void main() {
        StringBuilder dna = new StringBuilder("ATG");
        StringBuilder reversed = dna.reverse();
        System.out.println("The reverse of ATG is " + reversed);
        System.out.println("The complement of ATG is " + complement(dna));
    }
}
