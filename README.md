# programas-poo

Object-oriented programming exercises developed during the OOP course at UCB.

## Exercises

### exercicio-produto
`Produto.java` class representing a product in a stock control system.
Includes `Produto.java` and `TestaProduto.java`.

### src/main/java — Lista 01
Exercises using the `Scanner` class for user input.
Files: `ex01.java` through `ex06.java`.

### SistemaAvaliacaoUniversitaria
University grading system applying inheritance, abstraction and polymorphism.

- Abstract classes: `ProvaUniversidade`, `ProvaFinalUniversidade`
- Subclasses: `ProvaUCB`, `ProvaFafifo`, `ProvaAV3UCB`, `ProvaFinalFafifo`
- Main class `Teste` demonstrates GPA calculation and final exam logic across institutions

### SistemaBiblioteca
Library management system with full CRUD on 4 modules (Autor, Livro, Usuario, Emprestimo) and an interactive CLI menu. Final project for the OOP course.

- Package layout: `modelo/` (domain), `controle/` (CRUD controllers), `MainBiblioteca` (CLI)
- Abstract superclass `Pessoa` extended by `Autor` and `Usuario` (inheritance + abstraction)
- Polymorphic `exibirInfo()` overridden in each subclass
- In-memory storage with `ArrayList`, business rule for borrow/return updating book availability
- Includes `Apresentacao_Biblioteca.pptx` (10-slide presentation)
- Team: Gabriel, Arthur, Maurício, Paulo Henrique, Letícia

## Tech
![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
