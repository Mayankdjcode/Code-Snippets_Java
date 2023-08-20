public class _18_Class {

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
        return x;
    }

    public void setX(int x) {
        //validation
        this.x = x;
    }

}
