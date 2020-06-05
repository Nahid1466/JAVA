public class MergeArray {

        public static void mergeArrays(int[] arr1, int[] arr2, int n1,
                                       int n2, int[] arr3)
        {
            int i = 0, j = 0, k = 0;

            // Traverse both array
            while (i<n1 && j <n2)
            {
                if (arr1[i] < arr2[j])
                    arr3[k++] = arr1[i++];
                else
                    arr3[k++] = arr2[j++];
            }

            // Store remaining elements of first array
            while (i < n1)
                arr3[k++] = arr1[i++];

            // Store remaining elements of second array
            while (j < n2)
                arr3[k++] = arr2[j++];
        }

        public static void main (String[] args)
        {
            int[] A = {1, 3, 5, 8, 9, 11};
            int n1 = A.length;

            int[] B = {2, 4, 6, 7, 9, 10};
            int n2 = B.length;

            int[] C = new int[n1+n2];

            mergeArrays(A, B, n1, n2, C);

            System.out.println("Array after merging");
            for (int i=0; i < n1+n2; i++)
                System.out.print(C[i] + " ");
        }
    }


