package src;

/*
* We're going to give more easy-use to the List by creating a new class cal SSList.
*  This is the first version of the SSList
*
* */

public class SSList {

    List first;


    public SSList(int x){
        first = new List(x,null);
    }

    public void addFirst(int x){

        this.first = new List(x,this.first);


    }


    public static void main(String[] args) {

        SSList list = new SSList(1);
        list.addFirst(2);
        System.out.println();
    }
}
