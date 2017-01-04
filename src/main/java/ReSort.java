public class ReSort {

    public static void main(String[] args) {

        int[] massive = new int[]{1, 2, 3, 4, 5};

        ReSort rs = new ReSort();
        rs.reverse(massive);
        for (int i : massive) {
            System.out.print(i + " ");
        }
    }

    private void reverse(int[] massive) {
        for (int i = 0; i < massive.length / 2; i++) {
            int temp = massive[i];
            massive[i] = massive[massive.length - i - 1];
            massive[massive.length - i - 1] = temp;
        }
    }
}
