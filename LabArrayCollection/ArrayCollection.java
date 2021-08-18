public class ArrayCollection
{
    int size; //field
    Object[] elements; //field
    int times = 0; //field

    public ArrayCollection(int size) //constructer
    {
        this.size = size;
        elements = new Object[size];
    }

    public int size()
    {
        return times;
    }

    public void add(Object input)
    {
        elements[times] = input;
        times++;
    }

    public boolean isEmpty()
    { // Task4
     return size==0;
   }

    public boolean contains(Object input)
    { //Task5
        for (int a = 0; a < times; a++)
        {
            if (input.getClass() == String.class)
            {
                if (elements[a].equals(input))
                {
                    return true;
                }
            }
            else
            {
                if (input == elements[a])
                {
                    return true;
                }
            }
        }
        return false;
    }
    public int search(Object input)
    { // Task6
        for (int a = 0; a < times; a++)
        {
            if (input.getClass() == String.class)
            {
                if (elements[a].equals(input))
                {
                    return a;
                }
            }
            else
            {
                if (input == elements[a])
                {
                    return a;
                }
            }
        }
        return -1;
    }
    public void remove(Object input)
    { //Task7
        times -= 1;
        for (int a = 0; a < times + 1; a++)
        {
            if (input.getClass() == String.class)
            {
                if (input.equals(elements[a]))
                {
                    for (int b = a; b <= times - 1; b++)
                    {
                        elements[b] = elements[b + 1];
                    }
                }
            }
            else
            {
                if (input == elements[a])
                {
                    for (int b = a; b <= times - 1; b++)
                    {
                        elements[b] = elements[b + 1];
                    }
                }
            }
        }
    }

    public String toString()
    {
       //Task8
        String toRe = "";
        for (int a = 0; a < times; a++)
        {
              toRe += elements[a] + ", ";
        }
        return toRe;
    }
}