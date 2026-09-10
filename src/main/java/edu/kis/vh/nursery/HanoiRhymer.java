package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }
    @Override
    public void countIn(int in) {
        // TODO: metoda po cichu odrzuca niepoprawne wartosci - warto rozwazyc
        // zwracanie informacji o odrzuceniu (np. boolean) albo rzucenie wyjatku,
        // zamiast tylko zwiekszac licznik totalRejected
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
