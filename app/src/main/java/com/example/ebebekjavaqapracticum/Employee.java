package com.example.ebebekjavaqapracticum;

public class Employee {
    String name;
    float salary;
    int workHours;
    int hireYear;

    public float tax(){
        float vergi=0;
        if (salary<1000){
            vergi=0;
            return vergi;
        }
        if(salary >999){
            vergi=(salary*3/100);
            return vergi;
        }
        return vergi;
    }

    public int bonus(){
      int bonus=0;
      if(workHours>40){
        bonus=(workHours-40)*30;
        return bonus;
      }
      return bonus;
    }

    public float raiseSalary(){
      float zamliMaas=0;
      salary=salary+bonus()-tax();

      int yilFarki=2021-hireYear;
      if (yilFarki<0){
          yilFarki=yilFarki * (-1);
      }

      if(yilFarki<10){
          zamliMaas=(salary*5/100)+salary;
          return zamliMaas;
      }
      if(9 < yilFarki && yilFarki<20){
          zamliMaas=(salary*10/100)+salary;
          return zamliMaas;
      }
      if(yilFarki>19){
          zamliMaas=(salary*15/100)+salary;
          return  zamliMaas;
      }
      return zamliMaas;
    };

    public String toString(){
        System.out.println("Adı :  "+name);
        System.out.println("Maaşı :  "+salary);
        System.out.println("Çalışma Saati :  "+workHours);
        System.out.println("Başlangıç Yılı :  "+hireYear);
        System.out.println("Vergi :  "+ tax());
        System.out.println("Bonus :  "+bonus());
        System.out.println("Maaş Artışı  :  "+raiseSalary());

        float vergilibonusluMaas=salary+bonus()-tax();
        System.out.println("Vergi ve Bonuslarla Maaş  :  "+ vergilibonusluMaas);

        float toplamMaas=salary+bonus();
        System.out.println("Toplam Maaş  :  "+ toplamMaas);
        return null;
    };
}
