package coursehw.pkg1;
import java.util.*;
/**
 *
 * @author Baraa
 */
public class TestClass {
    
    public static void main(String []args)
    {
        RealEstateProperty Arr[] = new RealEstateProperty[4];
        for(int i = 0;i < Arr.length;i++)
        {
            Arr[i] = new RealEstateProperty();
            Arr[i].Input();
        }
        for(int i = 0;i < Arr.length;i++)
        {
            Arr[i].print();
            System.out.println("House Price = " + Arr[i].HousePrice() + "\n------------");
        }
        System.out.println("1. The Index Of The House Which Has The Maximum Price Is: " + FindIndex(Arr,1));
        System.out.println("2. The Index Of The House Which Has The Minimum Price Is: " + FindIndex(Arr,2));
        swap(Arr,FindIndex(Arr,1),FindIndex(Arr,2));
        sort(Arr);
        for(int i = 0;i < Arr.length;i++)
        {
            Arr[i].print();
            System.out.println("House Price = " + Arr[i].HousePrice() + "\n------------");
        }
        System.out.println("1. The Index Of The House Which Has The Maximum Price Is: " + FindIndex(Arr,1));
        System.out.println("2. The Index Of The House Which Has The Minimum Price Is: " + FindIndex(Arr,2));
    }
    public static int FindIndex(RealEstateProperty arr[],int p)
    {
        double MaxPrice = arr[0].HousePrice(),MinPrice = arr[3].HousePrice();
        int index1 = 0,index2 = 0;
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i].HousePrice() >= MaxPrice)
            {
                MaxPrice = arr[i].HousePrice();
                index1 = i;
            }
            if(arr[i].HousePrice() <= MinPrice)
            {
                MinPrice = arr[i].HousePrice();
                index2 = i;
            }
        }
        
        if(p == 1)
            return index1;
        else return index2;
    }

    public static void swap(RealEstateProperty arr[],int index1,int index2)
    {
        RealEstateProperty temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        
    }
    public static void sort(RealEstateProperty arr[])
    {
        RealEstateProperty arr2[] = new RealEstateProperty[4];
        arr2 = arr;
        for(int i = 0; i < arr.length;i++)
        {
            if(i != 0)
            {
            for(int j = 0;j < arr.length;j++)
                if(arr2[j].HousePrice() >  arr[i].HousePrice() && arr2[j].HousePrice() < arr[i-1].HousePrice())
                    arr[i] = arr2[j];
            }
            else
                for(int j = 0;j < arr.length;j++)
                    if(arr2[j].HousePrice() >= arr[i].HousePrice())
                        arr[i] = arr2[j];
        } 
    }
}
