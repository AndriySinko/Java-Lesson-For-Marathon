package Day016;

public class Test {
    public static void main(String[] args) {
        County county = County.SLOVAKIA;
        County county1 = County.CANADA;
        County county2 = County.RUSSIA;
        County county3 = County.UKRAINE;
        County county4 = County.USA;

        System.out.println("����� "+county1.toString()+" ��������� - "+county1.getCountOfPeole()+" "+county1.name());
        System.out.println("����� "+county2.toString()+" ��������� - "+county2.getCountOfPeole()+" "+county2.name());
        System.out.println("����� "+county3.toString()+" ��������� - "+county3.getCountOfPeole()+" "+county3.name());
        System.out.println("����� "+county4.toString()+" ��������� - "+county4.getCountOfPeole()+" "+county4.name());
        System.out.println("����� "+county.toString()+" ��������� - "+county.getCountOfPeole()+" "+county.name());
    }
}
