public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 2, 7, 8, 0, 4, 3, 9, 2, 8, 1, 0, 5, 7, 4, 6, 9, 3, 2, 1, 8, 4, 0, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0};
        new Thread(() -> {
            Integer highestNum = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > highestNum) {
                    highestNum = numbers[i];
                }
            }
            System.out.println("Phần tử lớn nhất trong mảng là: " + highestNum);
        }).start();
        new Thread(() -> {
            Integer sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            System.out.println("Tổng của các phần tử trong mảng là: " + sum);
        }).start();




    }
}
