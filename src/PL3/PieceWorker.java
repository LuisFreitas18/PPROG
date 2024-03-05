package PL3;
public class PieceWorker extends Worker {

    private int numberOfPiecesType1;
    private int numberOfPiecesType2;

    private static final int DEFAULT_NUMBER_OF_PIECES_TYPE1=0;
    private static final int DEFAULT_NUMBER_OF_PIECES_TYPE2=0;

    private static float pieceType1Payment = 6.5f;
    private static float pieceType2Payment = 9.5f;

    public PieceWorker(String name, int numberOfPiecesType1, int numberOfPiecesType2) {
        super(name);
        this.numberOfPiecesType1 = numberOfPiecesType1;
        this.numberOfPiecesType2 = numberOfPiecesType2;
    }

    public PieceWorker(String name) {
        super(name);
        numberOfPiecesType1 = DEFAULT_NUMBER_OF_PIECES_TYPE1;
        numberOfPiecesType2 = DEFAULT_NUMBER_OF_PIECES_TYPE2;
    }

    public PieceWorker() {
        super();
        numberOfPiecesType1 = DEFAULT_NUMBER_OF_PIECES_TYPE1;
        numberOfPiecesType2 = DEFAULT_NUMBER_OF_PIECES_TYPE2;
    }

    public int getNumberOfPiecesType1() {
        return numberOfPiecesType1;
    }

    public int getNumberOfPiecesType2() {
        return numberOfPiecesType2;
    }

    public void setNumberOfPiecesType1(int numberOfPiecesType1) {
        this.numberOfPiecesType1 = numberOfPiecesType1;
    }

    public void setNumberOfPiecesType2(int numberOfPiecesType2) {
        this.numberOfPiecesType2 = numberOfPiecesType2;
    }

    @Override
    public String toString() {
        return String.format("Piece worker: %s %nNumber of pieces from type 1: "
                        + "%d %nNumber of pieces from type 2: %d",
                super.toString(), numberOfPiecesType1, numberOfPiecesType2);
    }

    @Override
    public float calculateSalary() {
        return this.numberOfPiecesType1 * PieceWorker.pieceType1Payment
                + this.numberOfPiecesType2 * PieceWorker.pieceType2Payment;
    }

    public static float getPieceType1Payment() {
        return pieceType1Payment;
    }

    public static float getPieceType2Payment() {
        return pieceType2Payment;
    }

    public static void setPieceType1Payment(float pieceType1Payment) {
        PieceWorker.pieceType1Payment = pieceType1Payment;
    }

    public static void setPieceType2Payment(float pieceType2Payment) {
        PieceWorker.pieceType2Payment = pieceType2Payment;
    }

}
