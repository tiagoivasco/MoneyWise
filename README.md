# MoneyWise

MoneyWise is a personal finance management application that helps users trace their expenses and income in the most effective way.
Along with an intuitive interface, MoneyWise offers advanced features like:
- Recording and categorizing expenses and income.
- Viewing detailed reports with interactive charts.
- Setting reminders for bill payments.
- Automatically syncing transactions via banking APIs (Open Banking).
- Supporting multiple currencies and conversions.
 
This project follows the best practices for Android development using Jetpack Compose, Room, Hilt, and Clean Architecture to make it more scalable and maintainable.


com.ivasco.moneywise
│
├── data
│   ├── model            // Modelos de dados
│   ├── repository       // Implementações de repositórios
│   ├── local            // Room (entidades e DAO)
│   └── remote           // Fontes de dados remotas
│
├── domain
│   ├── model            // Modelos de domínio
│   ├── repository       // Interfaces de repositórios
│   └── usecase          // Casos de uso
│
├── presentation
│   ├── navigation       // Gerenciamento de navegação
│   ├── ui               // Telas e componentes
│   └── viewmodel        // ViewModels
│
└── di                   // Configurações de injeção de dependência


com.ivasco.moneywise
│
├── ui
│   └── login
│       ├── LoginActivity.kt
│       ├── LoginViewModel.kt
│       └── LoginScreen.kt (Componente Compose)
├── di
│   └── AppModule.kt (Configuração do Koin)
└── data
└── repository (mais para frente)