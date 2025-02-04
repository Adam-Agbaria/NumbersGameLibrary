# Numbers Game - Android Library

This **Android Library** provides an easy way to integrate the Numbers Game backend into any Android app.

## 📦 Features
- **Encapsulated API Calls:** Connects to the Flask server seamlessly.
- **Simple Integration:** Works with any Android project.
- **Reusable Logic:** Can be used in multiple apps.

## 🔧 Setup & Installation
1. Clone the repository:
   git clone https://github.com/YourUsername/NumbersGame-Library.git
   cd NumbersGame-Library

2. Add the library to your Android project:
   Open your project's `settings.gradle` and include:
   include ':numbers-game-library'

3. Add the dependency in your `build.gradle`:
   dependencies {
       implementation project(':numbers-game-library')
   }

## 📡 Usage Example
   GameClient client = new GameClient("https://your-vercel-backend.com");
   client.createGame();
   client.joinGame("PlayerName", gameId);
   client.submitNumber(42);

## 📜 License
This project is licensed under the **MIT License**.
