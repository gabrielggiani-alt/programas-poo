# Java OOP Coursework — UCB

Object-oriented programming exercises in Java from the OOP course at Universidade Católica de Brasília.

The library management system that started here now lives in its own repository: [library-management-system](https://github.com/gabrielggiani-alt/library-management-system).

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)

---

## Featured: SistemaBiblioteca

A library management system with full CRUD on four modules (Author, Book, User, Loan) and an interactive CLI menu.

- Package layout: `modelo/` (domain), `controle/` (CRUD controllers), `MainBiblioteca` (CLI entry point)
- Abstract superclass `Pessoa` extended by `Autor` and `Usuario` (inheritance + abstraction)
- Polymorphic `exibirInfo()` overridden in each subclass
- In-memory storage with `ArrayList` and a borrow/return business rule that updates book availability
- Includes a slide deck (`Apresentacao_Biblioteca.pdf`)

[`SistemaBiblioteca/`](SistemaBiblioteca/) · published at [library-management-system](https://github.com/gabrielggiani-alt/library-management-system)

---

## Other projects

### SistemaAvaliacaoUniversitaria
University grading system applying inheritance, abstraction and polymorphism.
- Abstract classes `ProvaUniversidade` / `ProvaFinalUniversidade`, with subclasses per institution
- `Teste` demonstrates GPA calculation and final-exam logic across institutions

### exercicio-produto
`Produto` class modeling an item in a stock-control scenario, with a `TestaProduto` driver.

### lista-01-scanner
Introductory exercises (`ex01`–`ex06`) using the `Scanner` class for user input.
