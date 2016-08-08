public class test
{
public static void main(String []args)
{
int a=123;
int b=738;

for(int i=1;i<1000;i++)
{
for(int j=1;j<1000;j++)
{
for(int m=1;j<1000;j++)
{
if(a*i*j*m==b)
{
return i,j,m;

}
}
}
}return 0;
}
  
