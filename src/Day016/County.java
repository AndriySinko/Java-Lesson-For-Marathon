package Day016;

public enum County {
    UKRAINE(46000000,"������"), RUSSIA(250000000,"����"),
    USA(150000000,"�������� ����� �������"), CANADA(100000000,"������"),
    SLOVAKIA(10000000,"�������");
    private int countOfPeole;
    private  String transliation;
    County(int countOfPeole, String transliation){
        this.countOfPeole = countOfPeole;
        this.transliation = transliation;
    }
    public int getCountOfPeole() {
        return countOfPeole;
    }

    public String toString() {
        return transliation;
    }
}
