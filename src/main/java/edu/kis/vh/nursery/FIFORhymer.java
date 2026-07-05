package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        // TODO: wymaga refaktoryzacji - zlozonosc O(n) przy kazdym wywolaniu countOut(),
        // rozwazyc prostsza implementacje kolejki (obecne podwojne przekladanie
        // elementow miedzy stosami przy kazdym wywolaniu jest nieefektywne)
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
