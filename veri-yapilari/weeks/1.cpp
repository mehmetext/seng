#include "iostream"
using namespace std;

/* int main()
{
  int *ip, id;
  id = 21;
  ip = &id;

  printf("id degisken degeri: %d", *ip);

  return 0;
} */

/////////////////////////////////////

/* int main()
{
  int *p, q;
  q = 21;
  p = &q;

  cout << "q: " << q << endl;
  cout << "q (*p): " << *p << endl;
  cout << "q adresi: " << &q << endl;
  cout << "q adresi (p): " << p << endl;
  cout << "p adresi: " << &p << endl;

  return 0;
} */

/////////////////////////////////////

/* void arttir(int *x)
{
  (*x)++;
  cout << "x: " << *x << endl;
}

int main(int argc, char const *argv[])
{
  int x = 5;
  arttir(&x);

  cout << "x: " << x << endl;

  return 0;
}
 */

/////////////////////////////////////

/* int main(int argc, char const *argv[])
{

  char *cp, cd;
  cp = &cd;

  for (cd = 'A'; cd < 'L'; cd++)
    cout << *cp << "-";

  cout << endl;

  for (cd = 'A'; cd < 'L'; cd++)
    cout << cd << "-";

  return 0;
} */

/////////////////////////////////////

/* int main(int argc, char const *argv[])
{
  int *ip;
  ip++;    // ip içinde gösterilen adresi 4 byte arttırır.
  (*ip)++; // ip'in gösterdiği bellekteki değeribir arttırır.

  // ip = ip + (1* sizeof(int)); ile ip++; aynı şeydir.
  return 0;
} */

/////////////////////////////////////

/* int main(int argc, char const *argv[])
{
  int kutle[5], *p, *q;
  p = &kutle[0]; // 1. elemanın adresi p işaretçisine atandı
  p = kutle;     // 1. elemanın adresi p işaretçisine atandı
  q = &kutle[4]; // son elemanın adresi q işaretçisine atandı

  // int i;
  // kutle[i] ile *(p+i) aynı anlamdadır.
  *p + i;   // p'nin gösterdiği değere i sayısını ekle;
  *(p + i); // p'nin gösterdiği adresten i blok ötedeki sayıyı hesapla.

  return 0;
} */

/////////////////////////////////////

int main(int argc, char const *argv[])
{
  char cdizi[] = {'A', 'B'};
  char *cp;
  int len, id;

  cp = cdizi;
  len = sizeof(cdizi) / sizeof(char);

  for (id = 0; id < len; id++)
  {
    cout << (*cp)++ << "-";
  }

  return 0;
}
