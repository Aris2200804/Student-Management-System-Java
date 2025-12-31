import java.util.ArrayList;
import java.util.Scanner;
class Student
{
    String name;
    int id,i,idd;
    double marks[];
    Student(String name,int id,double marks[])
    {
        this.name=name;
        this.id=id;
        this.marks=marks;
    }
void display()
{
        System.out.println("Name of The Student:"+name);
        System.out.println("ID of The Student:"+id);
        System.out.println("Marks of The Student");
        for(i=0;i<marks.length;i++)
        {
            System.out.println("Marks of Subject"+(i+1)+"="+marks[i]);
        }
} 
void averageMarks()
{
    double avg,sum=0;
    for(i=0;i<marks.length;i++)
    {
        sum=sum+marks[i];
    }
    avg=sum/marks.length;
    System.out.println("Average Marks="+avg);
}   
void searchStudent(int idd)
{
    this.idd=idd;
    if(idd==id)
    {
        System.out.println("Student Found");
        display();
    }
    else 
    {
        System.out.println("Student Not Found");
    }
}
}
class StudentManager{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String name;
        int id,i=0,x,idd;
        Student[] students=new Student[10];
        int count=0;
        do
        {
            System.out.println("Choose an Appropriate Option");
            System.out.println("1.Enter Student Details:");
            System.out.println("2.Display Student Details");
            System.out.println("3.Calculate Average of Marks");
            System.out.println("4.Search Student by ID");
            System.out.println("5.Exit");
            System.out.print("Enter Your Choice:");
            x=sc.nextInt();
            switch(x)
            {
                case 1:
                    {
                        System.out.print("Enter Student Name=");
                        name=sc.next();
                        System.out.print("Enter ID=");
                        id=sc.nextInt();
                        double marks[]=new double[3];
                        for(i=0;i<marks.length;i++)
                    {
                        System.out.print("Enter Marks for Subject"+(i+1)+"=");
                        marks[i]=sc.nextDouble();
                    }
                    students[count]=new Student(name, id, marks);
                    count++;
                    break;
                }
                case 2:
                {
                    System.out.println("Student Details");
                    for(i=0;i<count;i++)
                    {
                    students[i].display();
                    }
                break;
                }
                case 3:
                {
                    System.out.println("Average Marks of Stduent ");
                    for(i=0;i<count;i++)
                    {
                    students[i].averageMarks();
                }
                break;
                }
                case 4:
                {
                    System.out.print("Enter ID you want to Search: ");
                    idd = sc.nextInt();
                    boolean found = false;

                    for(i = 0; i < count; i++)
                    {
                        if(students[i].id == idd)
                        {
                            System.out.println("Student Found");
                            students[i].display();
                            found = true;
                            break;
                        }
                    }

                    if(!found)
                    {
                        System.out.println("Student Not Found");
                    }
                    break;
                }
                case 5:
                {
                    System.out.println("Exiting Program");
                    break;
                }
                default:
                {
                    System.out.println("Invalid Choice.Try Again");
                }
            } 
        }while(x!=5);
    }
}