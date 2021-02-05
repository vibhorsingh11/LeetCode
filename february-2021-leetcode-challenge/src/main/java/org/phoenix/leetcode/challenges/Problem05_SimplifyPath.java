/*
 * Given a string path, which is an absolute path (starting with a slash '/') to a file or directory in a Unix-style
 * file system, convert it to the simplified canonical path.
 *
 * In a Unix-style file system, a period '.' refers to the current directory, a double period '..' refers to the directory
 * up a level, and any multiple consecutive slashes (i.e. '//') are treated as a single slash '/'. For this problem, any
 * other format of periods such as '...' are treated as file/directory names.
 *
 * The canonical path should have the following format:
 * The path starts with a single slash '/'.
 * Any two directories are separated by a single slash '/'.
 * The path does not end with a trailing '/'.
 * The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period '.' or double period '..')
 * Return the simplified canonical path.
 *
 * Example 1:
 * Input: path = "/home/"
 * Output: "/home"
 * Explanation: Note that there is no trailing slash after the last directory name.
 */
package org.phoenix.leetcode.challenges;

import java.util.Stack;

public class Problem05_SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] pathList = path.split("\\/");

        for (String p : pathList) {
            if (p.length() == 0 || p.equals(".")) {
                continue;
            } else if (p.equals("..")) {
                if (!st.empty()) {
                    st.pop();
                }
            } else {
                st.push(p);
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!st.empty()) {
            ans.insert(0, st.pop() + "/");
        }

        if (ans.length() == 0) {
            return "/";
        } else {
            return "/" + ans.substring(0, ans.length() - 1);
        }
    }
}
