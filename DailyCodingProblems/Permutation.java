package DailyCodingProblems;

/**
 * Permutation
 */
public class Permutation {

    public static void main(String[] args) {

        char[] p = { 'a', 'b', 'c' };
        int[] index = { 2, 1, 0 };

        System.out.println(permutate(p, index));

    } // end main method

    // A permutation can be specified by an array P, where P[i] represents the
    // location of the element at i in the permutation. For example, [2, 1, 0]
    // represents the permutation where elements at the index 0 and 2 are swapped.
    // Given an array and a permutation, apply the permutation to the array.
    // For example, given the array ["a", "b", "c"] and the permutation [2, 1, 0],

    // return ["c", "b", "a"].

    public static char[] permutate(char[] p, int[] index) {
        char[] result = new char[p.length];

        for (int i = 0; i < p.length; i++) {
            result[i] = p[index[i]];
        }

        return result;
    } // end purmutate method
} // end class