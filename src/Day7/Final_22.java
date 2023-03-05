package Day7;

public class Final_22 {
    /**
     *
     * final - модификатор который обозначает константу которая не может изменятся никак и никем.
     * final - можно присваивать методам, классам и переменным и аргумантам методав.
     * Константу final называем только большими буквами
     * Обычто модификатор final бывает типа static, и он присвается тогда всем а не копируется на каждый другой обьект
     * те самым мы экономим память.
     */
    public static void main(String[] args) {
        Instruments.numberOfTools = 2;
    Instruments tool = new Instruments(4);
    tool.coutTools();
        System.out.println();

    Instruments tool1 = new Instruments(5);
        System.out.println();

        //==========================================================

        Instruments.numberOfTools = 3;
    Instruments tool2 = new Instruments(6);
    tool1.coutTools();
    tool2.coutTools();
        System.out.println();

        //===========================================================

        Instruments.numberOfTools = 5;
        Instruments tool4 = new Instruments(2);
        tool4.coutTools();
    }
}
class Instruments{
    public static final String TOOLS = "молоток";
    public static int numberOfTools;
    public static int valueNumberOfTools;
    public Instruments(int valueNumberOfTools){
        System.out.println("У мене є "+numberOfTools+" инструмента под названием - "+this.TOOLS);
        this.valueNumberOfTools++;
    }
    public void coutTools(){
        System.out.println("Всего людей с инструментами - "+valueNumberOfTools);
    }
}