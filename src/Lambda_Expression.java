interface fazilLamdaInterface{
    String add(String str);
}

public class Lambda_Expression {

    public static void main(String[] args) {

        fazilLamdaInterface fazilLamdaExpression = (s) -> s+" Shaikh";

        addLamdaExpression("Fazil",fazilLamdaExpression);
    }

    public static void addLamdaExpression(String str, fazilLamdaInterface value){

        String printingResult = value.add(str);

        System.out.println("Result after Expression addding is: "+printingResult);

    }
}
