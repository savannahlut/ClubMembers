import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        MemberInfo jane = new MemberInfo("SMITH, JANE", 2019, false);
        MemberInfo steve = new MemberInfo("FOX, STEVE", 2018, true);
        MemberInfo michael = new MemberInfo("XIN, MICHAEL", 2017, false);
        MemberInfo maria = new MemberInfo("GARCIA, MARIA", 2020, true);

        ArrayList<MemberInfo> students = new ArrayList<MemberInfo>();
        students.add(jane);
        students.add(steve);
        students.add(michael);
        students.add(maria);

        ClubMembers PoetryClub = new ClubMembers(students);
        System.out.println(PoetryClub.returnMembers());
        System.out.println(PoetryClub.removeMembers(2018));
        System.out.println(PoetryClub.returnMembers());

        //My test case for addMembers:
         ClubMembers FilmClub = new ClubMembers();
         System.out.println("\n" + FilmClub.returnMembers());
         String[] moreStudents = {"MEDINA, SAM", "TORRES, SAVANNAH-LU", "VEPREVE, VICTORIA"};
         FilmClub.addMembers(moreStudents, 2026);
         System.out.println(FilmClub.returnMembers());
    }
}