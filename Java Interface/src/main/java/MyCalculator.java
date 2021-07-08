class MyCalculator implements AdvancedArithmetic{

    @Override
    public int divisor_sum(int n) {
        int suma = 0;
        for (int i = 1; i < n/2 + 1; i++ ){
            if (n % i == 0)
                suma=suma+i;
        }
        return suma+n;
    }
}
