package com.company;

public class Class {
    private int nomer;
    private String word;
    private int [] array;
    public Class(int nomer, String word, int [] array) {
        this.nomer = nomer;
        this.word = word;
        System.out.print("Array: ");
        for (int a : array) {
            System.out.print(a + ",");;
        }
        System.out.println();
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
