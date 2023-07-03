package design.pattern.strategy;
public class Client {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2};

        SortingStrategy quicksort = new QuickSort();
        SortingStrategy mergesort = new MergeSort();
        SortingContext context = new SortingContext(quicksort);
        context.sortArray(array);

        context.setStrategy(mergesort);
        context.sortArray(array);
    }
}
