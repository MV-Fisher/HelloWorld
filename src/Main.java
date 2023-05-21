
public class Main {
    public static void main(String[] args) {
        // Задача № 1
            var a = 8.0 ;
            var b = 3.6 ;
            var c = 763789 ;
            System.out.println("a = " + a + " " +  "b = " + b +" " + "c = " + c);
        // Задача № 2
            var ItogA = a + 4 ;
            var ItogB = b + 4 ;
            var ItogC = c + 4 ;
            System.out.println("ItogA = " + ItogA + " " +  "ItogB = " + ItogB +" " + "ItogC = " + ItogC);
        // Задача № 3
            var dog = a - 3.5 ;
            var cat = b - 1.6 ;
            var paper = c - 7639 ;
            System.out.println("dog = " + dog + " " +  "cat = " + cat +" " + "paper = " + paper);
        // Задача № 4
            var friend = 19 ;
            var d = (friend + 2) / 7 ;
            System.out.println("d = " + d);
        // Задача № 5
            var frog = 3.5 ;
            var e = ((frog * 10) / 3.5) + 4 ;
            System.out.println("e = " + e) ;
        // Задача № 6
            var wb1 = 78.2 ;
            var wb2 = 82.7 ;
            var wob = wb1 + wb2 ;
            System.out.println("Общий вес двух бойцов составил  " + wob + " килограммов") ;
            var wbr = wb2 - wb1 ;
            System.out.println("Разница в весе двух бойцов составила  " + wbr + " килограмма") ;
        // Задача № 7
            var rwb = wb2 - wb1 ;
            System.out.println("Разница в весе двух бойцов составила  " + rwb + " килограмма") ;
            var g = wb2 % wb1 ;
            System.out.println("Остаток от деления составил " + g);
        // Задача № 8
            var r = 640 ;
            var chr = 8 ;
            var vrInk = r / chr ;
            System.out.println ("Всего в компании работает " + vrInk + " человек") ;
            var newChrInk = vrInk + 94 ;
            var dogWeight = newChrInk * chr ;
            System.out.println("Если в компании работает "
                    + newChrInk + " человека, то всего " + dogWeight
                    + " часа работы может быть поделено между сотрудниками.") ;
    }
}