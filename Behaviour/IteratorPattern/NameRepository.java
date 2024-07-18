public class NameRepository implements Container{
    private String[] names = {"Jane","John","Julie","Jack"};

    @Override
    public Iterator getIterator()
    {
        return new NameIterator();
    }

    private class NameIterator implements Iterator{

        private int index;

    @Override
    public boolean hasNext(){
        return index < names.length;
    }

    @Override
    public Object next(){
        if(this.hasNext()){
            return names[index++];

        }
        return null;
    }
}
    
}
