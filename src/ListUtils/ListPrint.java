package ListUtils;

import java.util.List;

public class ListPrint {

    public static <T extends List> void printList(T list, String sep){

        for(int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + sep);
    }

    public static <T extends List> void printList(T list){

        printList(list, " ");
    }

    public static <T extends List> void printLnList(T list, String sep){

        for(int i = 0; i < list.size(); i++)
            System.out.println(list.get(i) + sep);
    }

    public static <T extends List> void printLnList(T list){

        printLnList(list, "");
    }
}
