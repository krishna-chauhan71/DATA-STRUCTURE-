package DSA_METHOD;

public class Return_type {
    public static int krish(int a){
        System.out.println("krishna");
        System.out.println("nanda");
        if (a>0)
        return 5;  //yadi return hit hua to khatam ho jayege is ke baad ka code execute nhi hoga
        else return 10;
    }
    public static void main(String[] args){
//        krish();  // stand alone bas call lagaye hai
//        System.out.println(krish());  // krish khud ek value store kr raha hai jo ki return me 5 de rah hai
//        System.out.println(3+krish());  // krish me jo 5 return aa raha hai usme 3 + kra raha hai
        int x = krish(7);
       System.out.println(3+x);
    }
}
