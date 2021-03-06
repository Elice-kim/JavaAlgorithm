package me.elice.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortTest {
    @Test
    public void testInsertionSort() {
        //given
        Insertion insertion = new Insertion();
        //when
        int[] input = {1, 6, 2, 3, 4, 9, 5};
        //then
        int[] expected = {1, 2, 3, 4, 5, 6, 9};
        assertArrayEquals(insertion.sort(input), expected);
    }

    @Test
    public void testBubbleSort() {
        //given
        Bubble bubble = new Bubble();
        //when
        int[] input = {1, 6, 2, 3, 4, 9, 5};
        //then
        int[] expected = {1, 2, 3, 4, 5, 6, 9};
        assertArrayEquals(bubble.sort(input), expected);
    }

    @Test
    public void testSelectionSort() {
        //given
        Selection selection = new Selection();
        //when
        int[] input =  {1, 6, 2, 3, 4, 9, 5};
        //then
        int[] expected = {1, 2, 3, 4, 5, 6, 9};
        assertArrayEquals(selection.sort(input), expected);
    }

    @Test
    public void testQuickSort(){
        //given
        Quick quick = new Quick();
        //when
        int[] input =  {1, 6, 2, 3, 4, 9, 5};
        //then
        int[] expected = {1, 2, 3, 4, 5, 6, 9};
        int[] result =  quick.sort(input, 0, input.length-1);

        assertArrayEquals(result, expected);

    }
}