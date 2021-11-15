package HW13;

public class Main {

    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator();
        FileData file1 = new FileData("first", 16, "first/path");
        FileData file2 = new FileData("second", 32, "second/path");
        FileData file3 = new FileData("first2", 64, "first/path");
        FileData file4 = new FileData("second2", 128, "second/path");
        FileData file5 = new FileData("test", 64, "test/path");

        fileNavigator.add(file1);
        fileNavigator.add(file2);
        fileNavigator.add(file3);
        fileNavigator.add(file4);
        fileNavigator.add(file5);

        System.out.println("first/path");
        System.out.println(fileNavigator.find("first/path"));
        System.out.println("Find second/path");
        System.out.println(fileNavigator.find("second/path"));

        System.out.println("FilterBySize 64:");
        System.out.println(fileNavigator.filterBySize(64));
        System.out.println("FilterBySize 63:");
        System.out.println(fileNavigator.filterBySize(63));

        System.out.println("FileNavigator before delete:");
        System.out.println(fileNavigator);
        System.out.println("FileNavigator after delete:");
        fileNavigator.remove("second/path");
        System.out.println(fileNavigator);
    }
}
