import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        /*
        NiceGroup CorpDevDept = new NiceGroup();

        CorpDevDept.insert("Information", "Discover More");
        CorpDevDept.insert("Solutions", "Deliver Better");
        CorpDevDept.insert("Knowledge", "Create Further");

        CorpDevDept.printList();
        //NICE평가정보 - Leader of financial infrastructure
        */

        NiceGroup CorpDevDept = new NiceGroup();

        CorpDevDept.insert("정보", "Information");
        CorpDevDept.insert("연계", "Connection");
        CorpDevDept.insert("가공", "Processing");
        CorpDevDept.insert("연동", "Linkage");
        CorpDevDept.insert("입수", "Acquisition");
        CorpDevDept.insert("TCB", "Tech Credit Bureau");
        CorpDevDept.insert("관리자", "Administrator");
        CorpDevDept.insert("기업평가", "Corporate evaluation");

        CorpDevDept.printList();
        //NICE평가정보 - Leader of financial infrastructure
    }
}

class NiceGroup {
    private Nice first;

    //LinkList constructor
    /*public LinkList() {
        first = null;
    }*/

    //Returns true if list is empty
    public boolean isEmpty() {
        return first == null;
    }

    //Inserts a new Link at the first of the list
    public void insert(String d1, String d2) {
        Nice link = new Nice(d1, d2);
        link.nextLink = first;
        first = link;
    }

    //Deletes the link at the first of the list
    public Nice delete() {
        Nice temp = first;
        first = first.nextLink;
        return temp;
    }

    //Prints list data
    public void printList() {
        Nice currentLink = first;
        System.out.print("List: ");
        while(currentLink != null) {
            currentLink.printLink();
            currentLink = currentLink.nextLink;
        }
        System.out.println("");
    }
}

class Nice {
    public String data1;
    public String data2;
    public Nice nextLink;

    //Link constructor
    public Nice(String d1, String d2) {
        data1 = d1;
        data2 = d2;
    }

    //Print Link data
    public void printLink() {
        System.out.print("{" + data1 + ", " + data2 + "} ");
    }
}
