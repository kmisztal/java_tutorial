package enums;

public enum Calc {
    ADD{
        public double calc(double a, double b){
            return a + b;
        }
    },
    SUB{
        public double calc(double a, double b){
            return a - b;
        }
    };

    public double calc(double a, double b){
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(Calc.ADD.calc(1, 2));
        System.out.println(Calc.SUB.calc(1, 2));
    }
}
