/**
AUTOR:          Juan Carlos Conde Ramírez

NOMBRE:         Herencia en Mamifereos -> Felinos -> Gatos Domésticos

DESCRIPCIÓN:    Programa que utiliza Herencia para especializar a la clase Felino y
                esta a su vez a la clase GatoDomestico

**/
#include <iostream>
#include <cstring>

using namespace std;

typedef enum{America, Africa, Europa, Oceania, Asia}continente;

class Mamifero
{
    char dieta[20];
    int anio;
    continente lugar;

    public:
        Mamifero(char *dieta, int anio, continente lugar);
        char* obtenDieta(void);
        int obtenAnio(void);
        char* obtenLugar(void);
        void muestraMamifero(void);
};

Mamifero::Mamifero(char *dieta, int anio, continente lugar)
{
    strcpy(this->dieta, dieta);
    this->anio = anio;
    this->lugar = lugar;
}

char* Mamifero::obtenDieta(void)
{
    return dieta;
}

int Mamifero::obtenAnio(void)
{
    return anio;
}

char* Mamifero::obtenLugar(void)
{
    switch(lugar)
    {
        case America:
            return "America";
        case Europa:
            return "Europa";
        case Asia:
            return "Asia";
        case Oceania:
            return "Oceania";
        case Africa:
            return "Africa";
        default:
            return "DESCONOCIDO";
    }
}

void Mamifero::muestraMamifero(void)
{
    cout << "Dieta: " << dieta << endl;
    cout << "Anio de Nacimiento: " << anio << endl;

    switch(lugar)
    {
        case America:
            cout << "Lugar de Nacimiento: America" << endl;
            break;
        case Europa:
            cout << "Lugar de Nacimiento: Europa" << endl;
            break;
        case Asia:
            cout << "Lugar de Nacimiento: Asia" << endl;
            break;
        case Oceania:
            cout << "Lugar de Nacimiento: Oceania" << endl;
            break;
        case Africa:
            cout << "Lugar de Nacimiento: Africa" << endl;
            break;
        default:
            cout << "Lugar de Nacimiento: DESCONOCIDO" << endl;
            break;
    }
}

class Felino : public Mamifero
{
    char raza[20];

    public:
        Felino(char *diet, int year, continente place, char *estirpe);
        char* obtenRaza(void);
        void muestraFelino(void);
};

Felino::Felino(char *diet, int year, continente place, char *estirpe):Mamifero(diet, year, place)
{
    strcpy(raza, estirpe);
}

char* Felino::obtenRaza(void)
{
    return raza;
}

void Felino::muestraFelino(void)
{
    Mamifero::muestraMamifero();
    cout << "Raza: " << raza << endl;
}

class GatoDomestico : public Felino
{
    char duenio[20];

    public:
        GatoDomestico(char *diet, int year, continente place, char *estirpe, char *owner);
        void ponDuenio(char* nombre);
        char* obtenDuenio(void);
        void muestraGato(void);
};

GatoDomestico::GatoDomestico(char *diet, int year, continente place, char *estirpe, char *owner):Felino(diet, year, place, estirpe)
{
    strcpy(duenio, owner);
}

void GatoDomestico::ponDuenio(char *nombre)
{
    strcpy(duenio, nombre);
}

char* GatoDomestico::obtenDuenio(void)
{
    return duenio;
}

void GatoDomestico::muestraGato(void)
{
    Felino::muestraFelino();
    cout << "Duenio: " << duenio << endl;
}

int main()
{

  /*
    AQUI VAN LAS PRUEBAS
  */
    
    return 0;
}
