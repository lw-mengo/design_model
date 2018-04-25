package stratege;

public class CashContext {
    CashSuper cs = null;
    public CashContext(String type){
        switch (type){
            case "normal":
                CashNormal cs0 = new CashNormal();
                cs = cs0;
                break;
            case "return_cash":
                CashReturn cr = new CashReturn("300","100");
                cs = cr;
                break;
            case "rebate":
                CashRebate cr1 = new CashRebate("0.8");
                cs = cr1;
                break;
        }
    }

    public double getResult(double money){
        return cs.acceptCash(money);
    }
}
