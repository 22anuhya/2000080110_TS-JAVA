class A{  
  int money;
private int pocketMoney;
void fill(int money, int pocketMoney)
{
this.money = money;  
this.pocketMoney = pocketMoney;
}
public int getPocketMoney(){  
  return pocketMoney;
}
}
class B extends A{  
  int total;
void sum( ){
total = money + getPocketMoney();
}
}
class privateinheritance{
public static void main(String args[]){
B s1=new B();
s1.fill(1000,500);
s1.sum();
System.out.println(s1.total);
}}