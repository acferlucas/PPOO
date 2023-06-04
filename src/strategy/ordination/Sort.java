package strategy.ordination;

public class Sort {
    SortStrategy sortStrategy;

    public void setSortStrategy(SortStrategy  sortStrategy) {
        this.sortStrategy = sortStrategy;
    };
    public void performSort(int[] array) {
        this.sortStrategy.sort(array);
    };
}

