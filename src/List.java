
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

    public iterativeSize(){

        /* Iterative case to return the size of the Linked List*/

        while(rest != null){



        }
    }

    public static void main(String[] args) {
        List L = new List(10,null);
         L = new List(15, L);
         L = new List(10,L);
         System.out.println(L.size());

    }


}
