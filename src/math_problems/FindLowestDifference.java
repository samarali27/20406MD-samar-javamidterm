package math_problems;

public class FindLowestDifference {

    /** INSTRUCTIONS
     * Write a method to return the lowest number, that is not shared between the 2 arrays
     * HINT: The lowest number that isn't shared between these arrays is 1
     * @return
     */

    public static void main(String[] args) {


        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};

        public static int findSmallestDifference(int[] A, int[]B,
        int m, int n);
        {
            // Sort both arrays
            // using sort function
            array1.sort(A);
            array2.sort(B);

            int a = 0, b = 0;

            // Initialize result as max value
            int result = Integer.MAX_VALUE;

            // Scan Both Arrays upto
            // sizeof of the Arrays
            while (a < m && b < n)
            {
                if (Math.abs(A[a] - B[b]) < result)
                    result = Math.abs(A[a] - B[b]);

                // Move Smaller Value
                if (A[a] < B[b])
                    a++;

                else
                    b++;
            }

            // return final sma result
            return result;
        }

            // Calculate size of Both arrays
            int m = A.length;
            int n = B.length;

            // Call function to
            // print smallest result
            System.out.println(findSmallestDifference
                    (A, B, m, n));

        }
    }

    }



    }

