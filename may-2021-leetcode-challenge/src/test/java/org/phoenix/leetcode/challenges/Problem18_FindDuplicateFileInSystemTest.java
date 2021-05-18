package org.phoenix.leetcode.challenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem18_FindDuplicateFileInSystemTest {

    private final Problem18_FindDuplicateFileInSystem test = new Problem18_FindDuplicateFileInSystem();

    @Test
    void findDuplicate() {
        String[] paths = new String[]{"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("root/a/2.txt", "root/c/d/4.txt", "root/4.txt"));
        expected.add(Arrays.asList("root/a/1.txt", "root/c/3.txt"));
        assertEquals(expected, test.findDuplicate(paths));
    }

}