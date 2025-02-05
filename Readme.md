Opis zadania:
Celem jest stworzenie aplikacji do rejestracji użytkowników, gdzie walidacja danych (np. e-mail, hasło) będzie realizowana za pomocą wzorca Proxy. Wzorzec Łańcuch Odpowiedzialności będzie używany do przeprowadzenia walidacji krok po kroku. Aplikacja powinna obsługiwać wyjątki (np. błędne formaty danych) oraz wykorzystywać typy generyczne do przetwarzania różnych typów danych wejściowych.

Wzorce projektowe:
- Proxy: Walidacja danych wejściowych (e-mail, hasło) przed ich rejestracją.
- Łańcuch Odpowiedzialności: Przeprowadzanie walidacji krok po kroku (np. walidacja e-maila, a potem hasła).

Wejście:
- Dane użytkownika wprowadzone ręcznie z klawiatury lub z pliku JSON:
  JSON: { "username": "jdoe", "email": "jdoe@example.com", "password": "Password123" }
- Klawiatura: Wprowadzanie danych użytkownika.

Wyjście:
- Komunikat o poprawnej rejestracji lub o błędach walidacyjnych.
- Przykład: Rejestracja zakończona sukcesem lub Błąd: niepoprawny e-mail.

Zakres danych:
- Użytkownicy: login, e-mail, hasło.
- Walidacja danych (poprawność e-maila, minimalna długość hasła).

Oczekiwane działanie:
- Aplikacja powinna walidować dane użytkownika za pomocą Proxy oraz Łańcucha Odpowiedzialności.
- Obsługa wyjątków powinna zwracać komunikaty o błędach w przypadku niepoprawnych danych.

Techniki Java:
- Mechanizm wyjątków: Obsługa błędów walidacji.
- Typy generyczne: Przetwarzanie różnych typów danych wejściowych (np. e-mail, hasło).

Zadania rozszerzające:
- Zaawansowana walidacja hasła: Dodanie bardziej złożonych kryteriów walidacyjnych dla hasła (np. obecność cyfr, wielkich liter i znaków specjalnych).
- Wielowątkowość: Wprowadzenie rejestracji wielu użytkowników jednocześnie z wykorzystaniem wielowątkowości.