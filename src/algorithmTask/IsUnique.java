package algorithmTask;

public class IsUnique {
    public static boolean checkIsUnique(String name) {
        for (int i = 0; i < name.length(); i++) {
            for (int j = i + 1; j < name.length(); j++) {
                if ((name.charAt(i)) == (name.charAt(j))) {
                    return false;
                }

//            if ((name.charAt(i)) (name.charAt(i + 1 ))){
//                System.out.println("yes");
            }
//            System.out.println((name.charAt(i)));
//            System.out.println((name.charAt(i + 1 )));
//            {
////                return true;
//            }
        }
        return true;
    }

////        return false;
//}

    public static void main(String[] args) {
        System.out.println(  checkIsUnique("love"));
        System.out.println(  checkIsUnique("adaba"));

//        System.out.println(checkIsUnique("Adalowo"));
    }
}
