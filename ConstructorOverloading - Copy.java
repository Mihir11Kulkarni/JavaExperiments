class student
{
	 int id;
	 String name;
	 int age;

	 student (int i,String n)
	 {
		 id=i;
		 name=n;
	 }
	 student (int i,String n,int a)
	 {
		 id=i;
		 name=n;
		 age=a;
	 }
	 void show()
	 {
		 System.out.println("id"+id+"name"+name+"age"+age);
	 }
}
class ConstructorOverloding
{
	public static void main (String args[])
	{
		student ob=new student(22,"d");
		student obj=new student (21,"P",12);
		ob.show();
		obj.show();
	}
}









