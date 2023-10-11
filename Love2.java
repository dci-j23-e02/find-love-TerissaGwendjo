public class Love2 {
    /*static if it will be invoked by the class*/  /*returned datatype*/
    public static String findLoveName(String[] stringArray, int[]indexes){
        /*
         * stringArray = ["living zebras", "juicy oranges" ,"do the victory dance", "tusk of an elephant"
         *                    0                  1                   3                      4
         * indexes = [0, 6, 7, 11]
         *            1  2  3   4
         * c1 = "living zebras".charAt(0)
         *
         * c1= stringArray[0].charAt(indexes[1])                 location [index:0] = 0
         * c2= stringArray[6].charAt(indexes[2])
         * c3= stringArray[7].charAt(indexes[3])
         * c4= stringArray[11].charAt(indexes[4])*/

        String c1, c2, c3, c4;
        c1 = Character.toString(stringArray[0].charAt(indexes[0]));
        c2= Character.toString(stringArray[1].charAt(indexes[1]));
        c3= Character.toString(stringArray[2].charAt(indexes[2]));
        c4= Character.toString(stringArray[3].charAt(indexes[3]));
        String loveName = c1+c2+c3+c4;

        return loveName;
    }

}
