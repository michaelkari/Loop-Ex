import java.util.Scanner;

public class MichaelKarimizadehLoopStructure
{
  public static void main(String[] args)
  {
    //Exercise 1
    /*
    int num;
    for (num=10;num>=1;num--)
    {
      
      if (num==10)
        System.out.println("We are ready for launch in T minus " +10+"...");
      else if (num==8)
        System.out.println("Ignition sequence start!");
      else
        System.out.println(num+"...");
    }
    System.out.println("All engines running!");
    System.out.println("Liftoff! We have liftoff!");
    */
    
    //Exercise 2
    /*
    double sBalance;
    int cYear;
    int eYear;
    double rInterest;
    Scanner sc = new Scanner (System.in);
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    System.out.format("%-37s" , "Please enter the starting balance:");
    sBalance = sc.nextDouble();
    System.out.format("%-37s" , "Please enter the current year:");
    cYear = sc.nextInt();
    System.out.format("%-37s" , "Please enter the ending year:");
    eYear = sc.nextInt();
    System.out.format("%-37s" , "Please enter the interest rate:");
    rInterest = sc.nextDouble();
    System.out.format("%-34s %1s %n" , "\nOPENING BALANCE:",nf.format(sBalance));
    System.out.println("--------------------------------------------");
    while (cYear<=eYear)
    {
      sBalance= sBalance+sBalance*(rInterest/100.0);
      System.out.format("%-1s %-28s %1s %n" , cYear,":",nf.format(sBalance));
      cYear+=1;
    }
    */
    
    //Exercise 3
    
    String month;
    int startDay;
    int days;
    int count=0;
    Scanner sc = new Scanner (System.in);
    System.out.format("%-50s" , "Enter the name of the month:");
    month = sc.nextLine();
    System.out.format("%-50s" , "Enter the day of the week the month begins:");
    startDay = sc.nextInt();
    System.out.format("%-50s" , "Enter the number of days in the month:");
    days = sc.nextInt();
    System.out.format("%35s %n",month);
    System.out.format("\nSun\tMon\tTues\tWed\tThurs\tFri\tSat\n\n");
    for (int i=1;i<=(startDay-1);i++)
      System.out.print("\t");
    for (int j=startDay;j<=7;j++)
    {
      count++;
      if (count<=days)
      {
        System.out.print(count+"\t");
      }
      else
      {
        j=8;
      }
      if (j==7)
      {
        System.out.println("\n");
        j=0;
      }
    }
    
  }
}