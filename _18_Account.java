// data hiding and abstraction , class and object

public class _18_Account {

    public static void main(String[] args) {
        Balance b=new Balance();
        int bal=b.getX();
        System.out.println(bal);
        b.setX(3333);
        int bal1=b.getX();
        System.out.println(bal1);
    }
}

class Balance
{
    private int x=10000;

    public int getX() {
        //validation
        return x;        //10000
    }

    public void setX(int x) {
        //validation
        this.x = x;       //3333
    }

}
