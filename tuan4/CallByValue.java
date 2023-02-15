class Test {
    int a;
    int b;
    void meth(int i, int j) {
    i *= 2;
    j /= 2;
    }

    void meth(Test o){
        o.a *=2;
        o.b /=2;
    }
   }
   // test
   class CallByValue {
    public static void main(String[] args) {
    Test ob = new Test();
    int a = 15, b = 20;
    System.out.println("a and b before call: " + a + " " + b);
    ob.meth(a, b);
    System.out.println("a and b after call: " + a + " " + b);
    }
   }