Numerals Converter Module

EN:

The purpose of the project is to convert Arabic numbers to Roman numerals.
The module contains three packages:

1. simple - containing the basic version of the class (SimpRomNumConverter) which is converting Arabic numbers to Roman numerals

2. extended - containing an extended version (ExtendRomNumConverter) of a class which is converting Arabic numbers to 
Roman numerals and also two additional ones - first: to read numerals from a configuration file (NumeralsMapper) 
and second: to return a String with a date that is built using of the Roman numerals . 
The extended version (thanks to configuration files) allows you to easily replace the group of characters that we use 
while converting. The project has two configuration files that allow you to use numerals consisting: 
uppercase or lowercase letters (depending on your needs). The very last class converts numbers to a date (in the form of a String) 
and is useful when the client would be interested in formatting the date using the numeral (eg 6 XII 2019).

3. commons - the package contains an auxiliary class (NumberSeparatorImpl), which is common for both versions - 
its purpose is to divide and save the Arabic digit that we want to process. 
In addition, there are two interfaces (NumberSeparator and NumeralsConverer) that have been used 
to reduce dependencies between classes.

Also module contains test catalog and in the appropriate packages there are unit tests to check if each class works fine.

__

PL:

Celem projektu jest zamiana liczb arabskich na numerały rzymskie.
Moduł zawiera trzy pakiety:

1. simple – zawierający podstawową wersję klasy (SimpRomNumConverter) 
przliczającej liczby arabskie na numerały rzymskie

2. extended – zawierający wersję rozszerzoną (ExtendRomNumConverter) klasy przeliczającej 
liczby arabskie na numerały oraz dwie dodatkowe – jedną służącą do odczytywania numerałów 
z pliku konfiguracyjnego (NumeralsMapper) i drugą, której celem jest zwracanie Stringa z datą, 
która budowana jest w oparciu o numerały rzymskie. Rozszerzona wersja dzięki odczytywaniu 
ustawień z konfiguracji pozwala w łatwy sposób podmieniać grupę znaków, z której korzystamy. 
W projekcie znajdują się dwa pliki konfiguracyjne, które pozwalają zależnie od potrzeb 
na korzystanie z numerałów składających się z dużych lub małych liter. Sama klasa przeliczająca liczby 
na datę w postaci Stringa przydaje się gdy, klientowi zależałoby na formatowaniu daty z użyciem numerału (np. 6 XII 2019).

3. commons – pakiet zawiera  klasę pomocniczą (NumberSeparatorImpl), 
która jest wspólna dla obydwu wersji, a której celem jest podział i zapisanie do listy cyfry arabskiej, 
którą przetwarzamy. Do tego znajdują się tam dwa interfejsy (NumberSeparator i NumeralsConverer), 
które zostały wykorzystane do zmniejszenia zależności między klasami.

Dodatkowo w katalogu z testami w odpowiednich pakietach znajdują się 
testy jednostkowe sprawdzające działanie każdej z klas.
