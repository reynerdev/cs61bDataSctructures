
/*
* Reyner Loza
*
* Learning CS61B Week 1
*
* Creating a Linked List. (NAKED VERSION. THIS MEANS THAT THE PERSON WHO'S GOING TO USE THIS CLASS , IS GOING TO NEED TO
* KNOW THE RECURSION PART TO USE THIS LINKED LIST)
*
* */
package src;

public class List {

    public int first;
    public List rest;

    public List(int f, List r){
        first = f;
        rest = r ;
    }

    public int size(){

        /*Recursive to find the size of the Linked List*/

        if (rest == null){
            return 1;
        } else
        {
            return 1 + this.rest.size();
        }



    }

    public int iterativeSize(){

        /* Iterative case to return the size of the Linked List*/
        int totalSize = 0;
        List p = this;
        while(p != null){

            totalSize += 1 ;
            p = p.rest ;


        }
        return  totalSize;
    }

    public int iterativeGet(int i ){

        List p = this ;
        int count = 0 ;
        int value ;
        while(p != null){

            if (count == i){
                System.out.println(p.first);
                return p.first;
            }else{
                count += 1 ;
                p = p.rest;
            }


        }

        return -1;
    }


    public int get(int i ){

        if(i == 0){
            return  first;
        }

        return rest.get(i-1);

    }

    public static void main(String[] args) {
        List L = new List(10,null);
         L = new List(15, L);
         L = new List(13,L);
         System.out.println(L.size());
        System.out.println(L.iterativeSize());

        System.out.println(L.iterativeGet(0));
        System.out.println(L.get(0));

    }


}
