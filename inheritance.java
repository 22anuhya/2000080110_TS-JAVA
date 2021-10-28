class Employee
  {
     int Salary;
     Employee(){
      Salary=1000;}
  }
class Programmer extends Employee
  {
     int bonus=0;
     Programmer(int sal,int bon)
       {
	 Salary = sal;
	 bonus=bon;  
       }
  }
class inheritance
  {
    public static void main(String args[])
      {
	Programmer pg=new Programmer(2000,200);
	Employee emp=new Employee();
	System.out.println(pg.Salary);
	System.out.println(pg.bonus);
	System.out.println(emp.Salary);
	//System.out.println(emp.bonus);
      }
  }
