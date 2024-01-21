package org.OOP;

public class BitwiseOperator {
    public int bitwiseAnd(int a , int b){
        return a & b;
    }
    public int bitiwseInclusiveOR(int a,int b){
        return a | b;
    }
    public int bitiwseExclusiveOR(int a,int b){
        return a ^ b;
    }
    public int complement(int a){
        return (~a);
    }

    public int bitwiseLeftshift(int a){
        return a<<2;
    }

    public int bitwiseRightshift(int a) {
        return a>>2;
    }
}

