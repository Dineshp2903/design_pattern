package IteratorPattern;
public class NameIterator {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        Iterator iter = nameRepository.getIterator();
        for(;iter.hasNext();){
            String name = iter.next();
            System.out.println(name);
        }
    }
    
}
