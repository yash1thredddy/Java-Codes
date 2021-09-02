public class Sweets {
public static void main(String []args)
{
int a = 20, b = 5;
sweets(a, b);
}
static void sweets(int a, int b)
{
int count = 0;
int index = 1;
int ar[]=new int[b];
for(int i=0;i<b;i++)
ar[i]=0;
while (a>0) {
int x1 = (index - 1) * b;
int x2 = index * b;
int sum1 = (x1 * (x1 + 1)) / 2;
int sum2 = (x2 * (x2 + 1)) / 2;
int result = sum2 - sum1;
if (result <= a) {count++;
a -= result;
index++;
}
else
{
int i = 0;
int t = ((index - 1) * b) + 1;
while (a > 0) {
if (t <= a) {
ar[i++] = t;
a -= t;
t++;
}
else
{
ar[i++] = a;
a = 0;
}
}
}
}
for (int i = 0; i < b; i++)
ar[i] += (count * (i + 1))
+ (b * (count * (count - 1)) / 2);
for (int i = 0; i < b; i++)
System.out.print( ar[i] + " ");
}
}
