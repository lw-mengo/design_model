/*
简单工厂方法
 */

public class Main {

    class Operation {
        public double _numberA = 0;
        public double _numberB = 0;

        public double get_numberA() {
            return _numberA;
        }

        public void set_numberA(double _numberA) {
            this._numberA = _numberA;
        }

        public double get_numberB() {
            return _numberB;
        }

        public void set_numberB(double _numberB) {
            this._numberB = _numberB;
        }

        public double GetResult() {
            double result = 0;
            return result;
        }
    }

    class OperationAdd extends Operation {
        @Override
        public double GetResult() {
            double result;
            result = _numberA + _numberB;
            return result;
        }
    }

    class OperationSub extends Operation {
        @Override
        public double GetResult() {
            double result;
            result = _numberA - _numberB;
            return result;
        }
    }

    class OperationMul extends Operation {
        @Override
        public double GetResult() {
            double result;
            result = _numberA * _numberB;
            return result;
        }
    }

    class OperationDiv extends Operation {
        @Override
        public double GetResult() {
            double result;
            if (_numberB == 0) {
                System.out.println("除数不能为0");
                return 0;
            } else {
                result = _numberA / _numberB;
                return result;
            }
        }
    }

      class OperationFactory{
        public Operation createOperate(String operate){
            Operation oper = null;
            switch (operate){
                case "+":
                    oper = new OperationAdd();
                    break;
                case "-":
                    oper = new OperationSub();
                    break;
                case "*":
                    oper = new OperationMul();
                    break;
                case "/":
                    oper = new OperationDiv();
                    break;
            }
            return oper;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Operation oper;
        Main mm = new Main();
        OperationFactory factory =mm.new OperationFactory();
        oper = factory.createOperate("*");
        oper._numberA = 5;
        oper._numberB = 3;
        double result = oper.GetResult();
        System.out.println(result);


    }
}
