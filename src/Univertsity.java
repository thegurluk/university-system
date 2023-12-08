import java.util.Scanner;

public class Univertsity {
    private boolean isout=true;
    private boolean isCorrect=true;
    private boolean isCorrectId=true;
    private boolean isCorrectIdStu=true;
    int password=0;

    Professors mat=new Professors("hasan","ozekes","MATH215",1234);
    Professors data=new Professors("kubra","cengiz","CENG105",12345);
    Professors algo=new Professors("kerem","par","CENG210",123456);
    Professors statistic=new Professors("meseret","tuba","MATH105",1234567);

    Students ali=new Students("ali","akca",1231,101,55,70,46,88);
    Students elif=new Students("elif","turan",1232,102,0,100,45,56);
    Students dilara=new Students("dilara","yaran",1233,103,1,85,52,63);
    Students seren=new Students("seren","zalim",1234,104,6,77,65,85);

    Students[] students={ali,elif,dilara,seren};



    public void login(){
        System.out.println("welcome to system");
        System.out.println("öğrtemen için 1 e ");
        System.out.println("öğrenci için 2 ye basın:");
        System.out.println("çıkmak için 3 e basın:");

        while (isCorrect){
            isCorrect=false;
            Scanner inp=new Scanner(System.in);
            int choose=inp.nextInt();
            switch (choose){
                case 1: loginProf();
                    break;
                case 2: loginStudent();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Not correct,try again");
                    isCorrect=true;
                    break;
            }
        }
    }
    private void loginProf(){
        System.out.println("Welcome again sir");
        System.out.print("Enter your course ID:");
        Scanner input=new Scanner(System.in);
        while (isCorrectId){
            isCorrectId=false;
         String courseId=input.nextLine();
         switch (courseId){
             case "MATH215":
                 System.out.println("hasan");
                 System.out.print("Enter your password:");
                 password= input.nextInt();
                 if(password== mat.getPassword()){
                     System.out.println("correct");
                     giveGradeProfHasan();
                 }else {
                     System.out.println("password not correct");
                     isCorrectId=true;
                 }
                 break;
             case "CENG105":
                 System.out.println("kübra");
                 System.out.print("Enter your password:");
                 password= input.nextInt();
                 if(password== data.getPassword()){
                     System.out.println("correct");
                     giveGradeProfKubra();
                 }else {
                     System.out.println("password not correct");
                     isCorrectId=true;
                 }
                 break;
             case "CENG210":
                 System.out.println("kerem");
                 System.out.print("Enter your password:");
                 password= input.nextInt();
                 if(password== algo.getPassword()){
                     System.out.println("correct");
                     giveGradeProfKerem();
                 }else {
                     System.out.println("password not correct");
                     isCorrectId=true;
                 }
                 break;
             case "MATH105":
                 System.out.println("mesret");
                 System.out.print("Enter your password:");
                 password= input.nextInt();
                 if(password== statistic.getPassword()){
                     System.out.println("correct");
                     giveGradeProfMeseret();
                 }else {
                     System.out.println("password not correct");
                     isCorrectId=true;
                 }
                 break;
             default:
                 System.out.println("not correct ID , try again");
                 isCorrectId=true;
                 break;
         }


        }
    }

    private void loginStudent(){
        System.out.println("Welcome again ");
        System.out.print("Enter your ID:");
        Scanner input=new Scanner(System.in);
        while (isCorrectIdStu){
            isCorrectIdStu=false;
            String courseId=input.nextLine();
            switch (courseId){
                case "101":
                    System.out.print("Enter your password:");
                    password= input.nextInt();
                    if(password== ali.getPassword()){
                        System.out.println("correct");
                    }else {
                        System.out.println("password not correct");
                        isCorrectIdStu=true;
                    }
                    break;
                case "102":
                    System.out.print("Enter your password:");
                    password= input.nextInt();
                    if(password== elif.getPassword()){
                        System.out.println("correct");
                    }else {
                        System.out.println("password not correct");
                        isCorrectIdStu=true;
                    }
                    break;
                case "103":
                    System.out.print("Enter your password:");
                    password= input.nextInt();
                    if(password== dilara.getPassword()){
                        System.out.println("correct");
                    }else {
                        System.out.println("password not correct");
                        isCorrectIdStu=true;
                    }
                    break;
                case "104":
                    System.out.print("Enter your password:");
                    password= input.nextInt();
                    if(password== seren.getPassword()){
                        System.out.println("correct");
                    }else {
                        System.out.println("password not correct");
                        isCorrectIdStu=true;
                    }
                    break;
                default:
                    System.out.println("not correct ID , try again");
                    isCorrectIdStu=true;
                    break;
            }


        }
    }

    private void giveGradeProfHasan(){
        System.out.println("-------------------------------------------------------");
        for (Students std:students){
            System.out.println(std.getName()+" "+std.getSurname()+" "+std.getId()+" Math note:"+std.getNoteMath());
        }
        System.out.println("-------------------------------------------------------");
        System.out.print("Choose e student with enter their ID:");
        Scanner inputt=new Scanner(System.in);
        int stdId=inputt.nextInt();
        System.out.print("Write his grade:");
        int stdNewGrade=inputt.nextInt();
        for (Students std:students){
            if (std.getId()==stdId){
                std.setNoteMath(stdNewGrade);
            }
        }
        for (Students std:students){
            System.out.println(std.getName()+" "+std.getSurname()+" "+std.getId()+" Math note:"+std.getNoteMath());
        }
    }

    private void giveGradeProfKubra(){
        System.out.println("-------------------------------------------------------");
        for (Students std:students){
            System.out.println(std.getName()+" "+std.getSurname()+" "+std.getId()+" Data note:"+std.getNoteData());
        }
        System.out.println("-------------------------------------------------------");
        System.out.print("Choose e student with enter their ID:");
        Scanner inputt=new Scanner(System.in);
        int stdId=inputt.nextInt();
        System.out.print("Write his grade:");
        int stdNewGrade=inputt.nextInt();
        for (Students std:students){
            if (std.getId()==stdId){
                std.setNoteData(stdNewGrade);
            }
        }
        for (Students std:students){
            System.out.println(std.getName()+" "+std.getSurname()+" "+std.getId()+" Data note:"+std.getNoteData());
        }
    }

    private void giveGradeProfKerem(){
        while (isout){
            System.out.println("-------------------------------------------------------");
            for (Students std:students){
                System.out.println(std.getName()+" "+std.getSurname()+" "+std.getId()+" Algo note:"+std.getNoteAlgo());
            }
            System.out.println("-------------------------------------------------------");
            System.out.print("Choose e student with enter their ID:");
            Scanner inputt=new Scanner(System.in);
            int stdId=inputt.nextInt();
            System.out.print("Write his grade:");
            int stdNewGrade=inputt.nextInt();
            for (Students std:students){
                if (std.getId()==stdId){
                    std.setNoteAlgo(stdNewGrade);
                }
            }
            for (Students std:students){
                System.out.println(std.getName()+" "+std.getSurname()+" "+std.getId()+" Algo note:"+std.getNoteAlgo());
            }

        System.out.println("press 1 to log out, press 2 to continue");
        Scanner input=new Scanner(System.in);
        int logOut=input.nextInt();
        if (logOut==1){
            isout=false;
        }
    }}

    private void giveGradeProfMeseret(){
        System.out.println("-------------------------------------------------------");
        for (Students std:students){
            System.out.println(std.getName()+" "+std.getSurname()+" "+std.getId()+" Statistic note:"+std.getNoteStatistic());
        }
        System.out.println("-------------------------------------------------------");
        System.out.print("Choose e student with enter their ID:");
        Scanner inputt=new Scanner(System.in);
        int stdId=inputt.nextInt();
        System.out.print("Write his grade:");
        int stdNewGrade=inputt.nextInt();
        for (Students std:students){
            if (std.getId()==stdId){
                std.setNoteStatistic(stdNewGrade);
            }
        }
        for (Students std:students){
            System.out.println(std.getName()+" "+std.getSurname()+" "+std.getId()+" Statistic note:"+std.getNoteStatistic());
        }
    }
}
