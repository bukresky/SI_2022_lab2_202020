# SI_2022_lab2_202020
2. CFG
![img_1.png](img_1.png)

   
3.Цикломатска комплексност
   Број на региони = број на рабови - број на јазли + 2раба = 27 - 20 + 2 = 9. Цикломатска комплексност е 9


4.Тест случаи според Every statement

![img_2.png](img_2.png)

За list = [] -> Кога ќе праќаме празна листа во if условот се проверува големината на таа листа. Потоа ќе се исполни и со тоа ќе се фрли IllegalArgumentException("List length should be greater than 0"). Тука завршува извршувањето на функцијата.

За list = [ "0", "0" ] -> Во овој случај немаме квадратна матрица, поради тоа што должината е 2. Добиваме 1.41.., а тоа не е цел број. Во овој случај ќе се фрли IllegalArgumentException("List length should be a perfect square").

За list = [ "0", "#", "#", "#", "0", "#", "#", "#", "#" ] -> Со овој тест пример ќе се поминат сите линии код во for циклусот.

->Node 22 и 23 е делот од кодот којшто е задолжен за справување со бомбите. Кога има # значи дека има бомба, па така треба да вратиме #.

->Вчитување на прва нула: Во овој случај нулата се наоѓа на крајот на својата редица и лево од нејзе има бомба, што значи дека ќе се исполни условот на Node 12. Поради тоа што не се наоѓа во средината нема да се исплони условот на Node 13, и ќе се изврши else-от(Node 15, Node 16). Бидејќи нулата што ја разгледуваме е во прва редица тоа значи дека нема да се проверува дали има бомби во нејзината погорна редица и само ќе се изврши кодот што проверува дали во долната редица има некоја бомба. Бидејќи ќе има, ќе се изврши Node 20.

->Вчитување на втората нула: Нула се наоѓа на средината на својата редица. Помеѓу нејзе има две бомби, што повлекува дека ќе се исполни условот кој укажува: не се наоѓа на краевите и дека е опкружена со тараби. За разлика од претходната, оваа нула има редица и горе и долу, исто така во истата колона има бомба што значи дека ќе се извршат тие делови од кодот.

5.Тест случаи според Every branch

![img_3.png](img_3.png)

-> За list = [] -> При праќање на празна листа во if условот каде што се проверува големината на таа листа следува дека ќе се исполни, а со тоа ќе се фрли IllegalArgumentException("List length should be greater than 0"). Така завршува извршувањето на функцијата.

-> За list = [ "0", "0" ] -> Немаме квадратна матрица, па поради тоа што должината е 2 и со квадратот ќе добиеме 1.41.., што не е цел број, следува дека овој случај ќе фрли IllegalArgumentException("List length should be a perfect square")
 
 