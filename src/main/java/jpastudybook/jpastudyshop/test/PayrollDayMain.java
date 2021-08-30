import jpastudybook.jpastudyshop.test.PayrollDay;

public class PayrollDayMain {
    public static void main(String[] args) {
        for (PayrollDay payrollDay : PayrollDay.values()) {
            System.out.println(payrollDay);
            System.out.println(payrollDay.pay(400, 50));
        }
    }
}
