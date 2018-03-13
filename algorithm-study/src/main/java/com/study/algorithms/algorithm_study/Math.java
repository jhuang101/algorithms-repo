package com.study.algorithms.algorithm_study;

public class Math {
    /**
     * Greatest Common Divisor: 
     * for example, gcd(54, 24) = 6
     * @param n
     * @param m
     * @return
     */
    public static long gcd(long n, long m){return m>0? gcd(m,n%m) : n;}
    
    /**
     * Least Common Multiple
     * for example, lcm(4,6) = 12
     * @param n
     * @param m
     * @return
     */
    public static long lcm(long n, long m){return n / gcd(n,m) * m;}
    
}
