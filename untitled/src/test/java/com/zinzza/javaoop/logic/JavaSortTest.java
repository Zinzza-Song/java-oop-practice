package com.zinzza.javaoop.logic;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaSortTest {

    @Test
    void given_List_WhenExecuting_ThenReturnListedList() {
        //given
        JavaSort<Integer> javaSort = new JavaSort<>();
        //when
        List<Integer> actual = javaSort.sort(List.of(3, 2, 4, 5, 1));
        //then
        assertEquals(List.of(1, 2, 3, 4, 5), actual);

    }
}