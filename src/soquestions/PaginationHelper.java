package soquestions;

import java.util.Arrays;
import java.util.List;
import java.lang.Math;

// TODO: complete this object/class

public class PaginationHelper<I> {

    static PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);

    public static void main(String[] args) {
        helper.pageItemCount(2);
    }

    private final int itemsPerPage;
    private final List<I> collection;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
        this.collection = collection;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return (int) Math.ceil(itemCount() / (float) itemsPerPage);
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        if (pageIndex >= pageCount() || pageIndex < 0)
            return -1;
        else if (pageIndex < pageCount() - 1)
            return itemsPerPage;
        else
            return itemCount() % itemsPerPage;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if (itemIndex >= itemCount() || itemIndex < 0)
            return -1;
        else
            return itemIndex / itemsPerPage;
    }
}