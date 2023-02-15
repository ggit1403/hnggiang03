// Objects may be passed to methods.
class Test {
    int a, b;
    Test(int i, int j) {
    a = i;
    b = j;
    }
    // return true if o is equal to the invoking object
    boolean equalTo(Test o) { // o là 1 kiểu đối tượng
    if(o.a == this.a && o.b == this.b) return true; // o.a là thuộc tính của a, a là thuộc tính của cấu tử 1
    else return false;
    }
   }
   class PassOb {
    public static void main(String[] args) {
    Test ob1 = new Test(100, 22);
    Test ob2 = new Test(100, 22);
    Test ob3 = new Test(-1, -1);
    System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
    System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));

    System.out.println(ob1);
    System.out.println(ob2);
    
    System.out.println(ob1==ob2);
    }
   }