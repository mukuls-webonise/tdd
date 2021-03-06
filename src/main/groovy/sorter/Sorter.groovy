package sorter

import strategy.SortingStrategy

/**
 * Created by mukuls-webonise on 19/8/16.
 */
class Sorter {

    SortingStrategy strategy;

    Sorter(SortingStrategy strategy) {
        if (strategy == null) throw new Exception("Strategy cannot be null")
        this.strategy = strategy
    }

    void setStrategy(SortingStrategy strategy) {
        if (strategy == null) throw new Exception("Strategy cannot be null")
        this.strategy = strategy
    }

    def sort(int[] array) {
        strategy.sort(array)
    }
}
