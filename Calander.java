import java.util.Scanner;
//import java.util.Hashtable;

public class Calander {

    public static class date{

        public int day, month, year;

        date(int d, int m, int y){
            this.setdate(d, m, y);
        }

        public void setdate(int d, int m, int y){
            this.day = d;
            this.month = m;
            this.year = y;
        }

        public int getday(){
            return this.day;
        }
        public int getmonth(){
            return this.month;
        }
        public int getyear(){
            return this.year;
        }

        /*public void NextDate(Hashtable date, int day){
            int cday = (int) date.get("day");
            int cmonth = (int) date.get("month");
            int cyear = (int) date.get("year");


            System.out.println(cday+" - "+cmonth+" - "+cyear);
        }*/

        public void Update(){
            this.day = this.day + 1;
            int ud = this.day;
            if (this.month == 2){
              if (ud == 29){
                  if (this.year % 4 != 0){
                      this.month = this.month + 1;
                      this.day = 1;
                  }
              }
              else if (ud == 30){
                  this.month = this.month + 1;
                  this.day = 1;
              }
            }else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11){
                if (ud == 31){
                this.month = this.month + 1;
                    this.day = 1;
                }
            }
            else if(this.month == 12){
                if (ud == 32){
                    this.year = this.year + 1;
                    this.month = 1;
                    this.day = 1;
                }
            }
            else if (ud == 32){
                this.month = this.month + 1;
                this.day = 1;
            }

        }

        public boolean dateValidation(int d, int m, int y){
            boolean validity = true;
            if (d > 31 || d < 1){
                System.out.println("Invalid date.\nThe day should be 1 to 31");
                validity = false;
            }else if (m > 12 || m < 1){
                System.out.println("Invalid date.\nMonth should be 1 to 12");
                validity = false;
            }else if(m == 2){
                if(d == 29){
                    if (y % 4 != 0){
                        System.out.println("Invalid date.\n"+y+" is not a leap year");
                        validity = false;
                    }
                }
                else if (d > 29){
                    System.out.println("Invalid date.\n February has only 28 or 29 days.");
                    validity = false;
                }
            }
            else if (m == 4){
                if (d > 30){
                    System.out.println("Invalid date.\n April has only 30 days");
                    validity = false;
                }
            }
            else if (m == 6){
                if (d > 30){
                    System.out.println("Invalid date.\n June has only 30 days");
                    validity = false;
                }
            }
            else if(m == 9){
                if (d > 30){
                    System.out.println("Invalid date.\n September has only 30 days");
                    validity = false;
                }
            }
            else if (m == 11){
                if (d > 30){
                    System.out.println("Invalid date.\n November has only 30 days");
                    validity = false;
                }
            }
            return validity;
        }

        public void printdate(int d, int m, int y){
            switch (m){
                case 1:
                    System.out.println("January "+d+", "+y);
                    break;
                case 2:
                    System.out.println("February "+d+", "+y);
                    break;
                case 3:
                    System.out.println("March "+d+", "+y);
                    break;
                case 4:
                    System.out.println("April "+d+", "+y);
                    break;
                case 5:
                    System.out.println("May "+d+", "+y);
                    break;
                case 6:
                    System.out.println("June "+d+", "+y);
                    break;
                case 7:
                    System.out.println("July "+d+", "+y);
                    break;
                case 8:
                    System.out.println("August "+d+", "+y);
                    break;
                case 9:
                    System.out.println("September "+d+", "+y);
                    break;
                case 10:
                    System.out.println("October "+d+", "+y);
                    break;
                case 11:
                    System.out.println("November "+d+", "+y);
                    break;
                case 12:
                    System.out.println("December "+d+", "+y);
                    break;
            }
        }

    }

    static int inputint(){
        int value_n;
        while (true){
            try{
                Scanner n = new Scanner(System.in);
                value_n = n.nextInt();
            }catch (Exception e){
                System.out.println("Sorry I didn't Understand that");
                continue;
            }
            break;
        }
        return value_n;
    }

    public static void main(String[] args){

        System.out.println("Having a date.");
        System.out.print("Enter day: ");
        int day = inputint();
        System.out.print("Enter a month: ");
        int month = inputint();
        System.out.print("Enter a year: ");
        int year = inputint();
        //reading data
        date time = new date(day, month, year);

        //System.out.println("Your date is: "+time.getday()+" - "+time.getmonth()+" - "+time.getyear());

        //date validation
        boolean validity = time.dateValidation(time.getday(), time.getmonth(), time.getyear());

        //date print
        if (validity) {
            time.printdate(day, month, year);

            System.out.println("Date Operation menu:\n1. Update Date(Go to next day)\n2. Jump Date()\n3. Skip Operations");
            System.out.println("Enter your choice: ");
            int menu = inputint();

            switch (menu){
                case 1:
                    //date update
                    time.Update();
                    System.out.print("Updated Date: ");
                    time.printdate(time.getday(), time.getmonth(), time.getyear());
                    break;

                case 2:
                    //next date
                    System.out.print("Enter number of days to be added with current date: ");
                    int num = inputint();

                    for (int i = 0; i < num; i++){
                        time.Update();
                    }
                    System.out.print("Your Desired Date is: ");
                    time.printdate(time.getday(), time.getmonth(), time.getyear());
                    break;

                default:
                    break;
            }

            /*Hashtable cdate = new Hashtable();
            cdate.put("day", time.getday());
            cdate.put("month", time.getmonth());
            cdate.put("year", time.getyear());

            time.NextDate(cdate, num);*/



        }





    }
}
