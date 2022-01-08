
import java.io.*;
class Matrix
{
	int a[][]=new int[5][5];
	int r,c;

	void read()throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\n Enter the row size    ");
		r=Integer.parseInt(br.readLine());
		System.out.print("\n Enter the Column size ");
		c=Integer.parseInt(br.readLine());
		System.out.print("\n Enter Matrix\n");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				a[i][j]=Integer.parseInt(br.readLine());
			}
		}
	}
	void show()
	{
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print("\t "+a[i][j]);
			}
			System.out.print("\n");
		}
	}
	static Matrix add(Matrix f, Matrix s)
	{
		Matrix t=new Matrix();
		for(int i=0; i<f.r; i++)
			for(int j=0; j<f.c; j++)
				t.a[i][j]=f.a[i][j]+s.a[i][j];
		t.r=f.r;
		t.c=f.c;
		return t;
	}
	static Matrix sub(Matrix f, Matrix s)
	{
		Matrix t=new Matrix();
		for(int i=0; i<f.r; i++)
			for(int j=0; j<f.c; j++)
				t.a[i][j]=f.a[i][j]-s.a[i][j];
		t.r=f.r;
		t.c=f.c;
		return t;
	}
	static boolean equals(Matrix f, Matrix s)
	{
		if(f.r== s.r && f.c==s.c)
			return true;
		else
			return false;
	}

	public static void main(String args[])throws IOException
	{
		Matrix m1= new Matrix();
		Matrix m2= new Matrix();
		m1.read();
		m2.read();
		System.out.print("\nFirst Matrix\n");
		m1.show();
		System.out.print("\nSecond Matrix\n");
		m2.show();

		if(equals(m1,m2))
		{
			Matrix m3=new Matrix();
			m3=add(m1,m2);
			System.out.print("\nAdded Matrix\n");
			m3.show();

			Matrix m4=new Matrix();;
			m4=sub(m1,m2);
			System.out.print("\nSubstracted Matrix\n");
			m4.show();
		}
		else
			System.out.print("\nIncompactible  Matrices\n");
			System.out.print("\n");
	}
}