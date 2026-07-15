package com.biet.dsa.dataStructures.collections.queue;
import java.util.ArrayDeque;
import java.util.Deque; // Policemen Catch Thieves
public class ArrayDequeForUndoRedo {
    public static void main(String[] args) {
        Deque<String> actions = new ArrayDeque<>();
        actions.addLast("Amit types A");
        actions.addLast("Amit Types M");
        actions.addLast("Amit types I");
        actions.addLast("Amit types N");
        System.out.println(actions);
        System.out.println("Undo [Ctrl+z]: " +
                actions.removeLast());
        System.out.println("Remaining Actions: " +
                actions);
    }
}
