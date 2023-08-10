package com.leetcode.problems;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TwoSumTest {
    private TwoSum twoSum;

    @Before
    public void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    public void t1() {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] result = twoSum.solution(nums, 9);
        int[] expectedResult = new int[]{0, 1};
        assertEquals(expectedResult, result);
    }

    @Test
    public void t2() {
        int[] nums = new int[]{3, 2, 4};
        int[] result = twoSum.solution(nums, 6);
        int[] expectedResult = new int[]{1, 2};
        assertEquals(expectedResult, result);
    }

    @Test
    public void t3() {
        int[] nums = new int[]{3, 3};
        int[] result = twoSum.solution(nums, 6);
        int[] expectedResult = new int[]{0, 1};
        assertEquals(expectedResult, result);
    }
}
