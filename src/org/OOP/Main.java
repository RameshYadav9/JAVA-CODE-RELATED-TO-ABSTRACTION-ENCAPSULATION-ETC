package org.OOP;

public class Main {
    public static void main(String[] args) {
        BitwiseOperator bitwiseOperator = new BitwiseOperator();
        System.out.println(bitwiseOperator.bitwiseAnd(11,12));
        //------------------------------------------------------------
// EXPLANATION OF ABOVE STATEMENT HOW IT WILL WORKS AND ITS GIVE OUTPUT
        //---------------------------------------------------------------
//        1. AND Operator
//
//        11 --->in binary  -      1011
//        12 ---> --->in binary  - 1100
//                                 1000 = 8   OUTPUT OF ABOV STATEMENT
//        If both values are 1 -> return 1 otherwise return 0

        System.out.println(bitwiseOperator.bitiwseInclusiveOR(11,12));

//        2. Inclusive OR(|)
//
//        11   - 1011
//        12   - 1100
//               1111  =15
//
//        If any bit is 1 , then return 1 otherwise 0

        System.out.println(bitwiseOperator.bitiwseExclusiveOR(11,12));

//        3. Exclusive OR (^)
//
//
//        11   - 1011
//        12   - 1100
//               0111  = 7
//
//
//        If both bits are same -> return 0 otherwise return 1

        System.out.println(bitwiseOperator.bitwiseLeftshift(11));
//        5. Left shift <<
//
//
//
//        11   - 1011
//        1011 <<2 --> 101100.
        //101100--IN BAINARY IT IS 44


        System.out.println(bitwiseOperator.bitwiseRightshift(11));

//        6. Right shift >>
//
//
//
//        11   - 1011
//        1011 >> 2 --> 10.11

    }

    }

