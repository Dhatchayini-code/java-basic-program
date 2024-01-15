//calling a method by passing a value,original value not changed
//actual value is not modified
class CallByValue{
    int marks=99;
    void Subject(int marks){//argue
        marks=marks-16;
        //s.o.println(marks);-->72
    }
    public static void main(String args[]){
       CallByValue s1=new CallByValue();//obj create
       System.out.println("before passing"+ s1.marks);//99//72
       s1.Subject(88);//param//method passing value
       System.out.println("after passing"+ s1.marks);//whatever change this value is 99
    }
}


