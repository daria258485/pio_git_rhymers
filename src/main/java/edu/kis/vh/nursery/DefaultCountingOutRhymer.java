package edu.kis.vh.nursery;

/**
 * Bazowa implementacja wyliczanki dzialajacej na zasadzie stosu (LIFO).
 * Przechowuje zglaszane liczby w wewnetrznej tablicy o stalej pojemnosci
 * i zwraca je w odwrotnej kolejnosci wzgledem zglaszania.
 */
public class DefaultCountingOutRhymer {

    static final int CAPACITY = 12;
    static final int EMPTY_INDEX = -1;
    static final int DEFAULT_RETURN = -1;
    private final int[] numbers = new int[CAPACITY];

    private int total = EMPTY_INDEX;
    /**
     * Zwraca indeks ostatnio dodanego elementu.
     *
     * @return indeks ostatniego elementu, lub -1 jesli wyliczanka jest pusta
     */
    public int getTotal(){
        return total;
    }
    /**
     * Zglasza (dodaje) nowa liczbe do wyliczanki, o ile nie jest ona pelna.
     *
     * @param in liczba zglaszana do wyliczanki
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }
    /**
     * Sprawdza, czy wyliczanka jest pusta.
     *
     * @return true, jesli wyliczanka nie zawiera zadnych elementow
     */
    public boolean callCheck() {
        return total == EMPTY_INDEX;
    }
    /**
     * Sprawdza, czy wyliczanka osiagnela maksymalna pojemnosc.
     *
     * @return true, jesli wyliczanka jest pelna
     */
    public boolean isFull() {
        return total == CAPACITY - 1;
    }
    /**
     * Zwraca ostatnio dodana liczbe bez usuwania jej z wyliczanki.
     *
     * @return ostatnio dodana liczba, lub -1 jesli wyliczanka jest pusta
     */
    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_RETURN;
        return numbers[total];
    }
    /**
     * Usuwa i zwraca ostatnio dodana liczbe z wyliczanki.
     *
     * @return ostatnio dodana liczba, lub -1 jesli wyliczanka jest pusta
     */
    public int countOut() {
        if (callCheck())
            return DEFAULT_RETURN;
        return numbers[total--];
    }

}
