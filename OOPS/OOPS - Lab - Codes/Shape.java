import java.lang.*;
import java.io.*;
import java.util.*;


public abstract class Shape
{

protected String _type;

// Constructor of the shape
protected double _area;

// Return type of shape
public Shape()
{
_type = "Shape";
}

//Return String type
public String type()
{
return _type;
}

//Return the area
public abstract double area();
{
return area;
}
}
