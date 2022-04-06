public class AdvanceCalc {
    public void pow(double x, double y) {
        System.out.println("power: " + x + "*" + y + " = " + Math.pow(x, y));
    }

    public void sqrt(double x) {
        System.out.println("square root: " + "√" + x + " = "  + Math.sqrt(x));
    }

    public static void main(String[] args) {
        AdvanceCalc calc = new AdvanceCalc();
        calc.pow(4, 4); // 256
        calc.sqrt(9); // 3
    }

    //Calculator calc = new Calculator();

    //calc.add(1,2); // 3
    //calc.subtract(4,2); // 2
    //calc.multiply(5,5); // 25
    //calc.divide(100,10); // 10
    //calc.clear(); // 0
//}

}


