package janTwentySix.HashMapPrbm;

public class MajorityElmtBoyerMooreVotingAlgo {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 2};
        int candidate = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                candidate = arr[i];
            }
            if (candidate == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        int candidateCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == candidate) {
                candidateCount++;
            }
        }
        if (candidateCount > arr.length / 2) {
            System.out.println("Majority elmt =" + candidate );
        }
    }
}
