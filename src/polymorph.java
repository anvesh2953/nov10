/**
 * Created by anves on 12/20/2016.
 * Animal Shelter has dogs at cats. Create a data structure with methods enqueue, dequeueany, dequeuedos, dequeuecats
 */
import java.util.LinkedList;
public class polymorph{
    public class Animal{
        private String name;
        private int order;
        public Animal(String name){this.name = name;}
        public void setorder(int ord){ this.order = ord;}
        public int getorder(){ return order;}
        public boolean isolderthan(Animal a){
            return this.order>=a.getorder();
        }
    }
    public class cat extends Animal{
        public cat(String n) {super(n);}
    }
    public class dog extends Animal{
        public dog(String n) {super(n);}
    }
    public class AnimalQueue{
        LinkedList <cat> cats = new LinkedList<cat>();
        LinkedList<dog> dogs = new LinkedList<dog>();
        int order =0;
    public void Enqueue(Animal a){
        a.setorder(order);
        order++;
        if(a instanceof cat){
            cats.addLast((cat) a);
        }
        else{
            dogs.addLast((dog) a);
        }
    }
    public Animal DequeueAny(){
        if(cats.size()==0) return DequeueCats();
        if(dogs.size()==0) return DequeueDogs();
        cat a = cats.peek();
        dog b = dogs.peek();
        if(a.isolderthan(b)) return DequeueCats();
else return DequeueDogs();
    }
    public Animal DequeueCats(){
        return cats.poll();
    }
    public Animal DequeueDogs(){
        return dogs.poll();
    }
}
    public static void main(String[] args){


    }
}
