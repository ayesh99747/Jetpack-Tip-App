# JetpackTipApp: A Tip Calculator Android App

This Android application, built using Jetpack Compose, allows users to calculate the total bill, split the bill among multiple people, and add a tip percentage. The total amount per person is clearly displayed. This project was created following a course from O'Reilly Learning.

## Key Features

- **Bill Calculation:** Calculates the total bill amount, including tip.
- **Tip Percentage Adjustment:** Allows users to adjust the tip percentage using a slider.
- **Bill Splitting:** Enables users to split the bill among a specified number of people.
- **Total Per Person Display:** Clearly shows the total amount each person owes.
- **Intuitive User Interface:** Provides a clean and user-friendly interface built with Jetpack Compose.

## Technologies Used

- **Kotlin:** The primary programming language.
- **Jetpack Compose:** Android's modern toolkit for building native UI.
- **Android SDK (API 34):** The Android software development kit.
- **Gradle:** The build system.

## Prerequisites

- **Android Studio:** The official IDE for Android development. [Download Android Studio](https://developer.android.com/studio)
- **JDK 8 or higher:** The Java Development Kit.
- **Android SDK Platform-Tools:** Ensure you have the appropriate platform tools installed for API level 31 (or higher) in your Android Studio SDK Manager.
- **Kotlin Plugin for Android Studio:** This should be automatically installed with Android Studio, but verify it's enabled.

## Installation

1. **Clone the repository:**
   ```bash
   git clone <repository_url>
   ```
2. **Open the project in Android Studio:** Open the cloned `JetpackTipApp` folder in Android Studio.
3. **Sync the project:** Android Studio will automatically sync the project with Gradle. If it doesn't, manually sync by clicking the "Sync Project with Gradle Files" button (usually an elephant icon) in the toolbar.
4. **Install dependencies:** Android Studio will automatically download the required dependencies listed in `app/build.gradle.kts`. This may take some time depending on your internet connection.

## Usage Examples

1. **Enter the bill amount:** In the "Enter Bill" field, enter the total amount of the bill.
2. **Adjust the tip percentage:** Use the slider to set the desired tip percentage.
3. **Specify the number of people:** Use the "+" and "-" buttons to adjust the number of people splitting the bill.
4. **View the results:** The app will automatically calculate and display the total amount per person at the top.

## Project Structure

```
JetpackTipApp/
├── app/                  // Main application module
│   ├── src/
│   │   ├── main/          // Main source code
│   │   │   ├── java/      // Kotlin code
│   │   │   │   └── ...
│   │   │   └── res/       // Resources (layouts, images, etc.)
│   │   │       └── ...
│   │   ├── androidTest/   // Android instrumentation tests
│   │   └── test/          // Unit tests
│   └── ...
├── gradle/               // Gradle scripts and wrapper
│   └── ...
├── settings.gradle.kts   // Gradle settings file
├── build.gradle.kts      // Top-level Gradle build file
└── ...
```

## Scripts

- **`gradlew` (Linux/macOS) and `gradlew.bat` (Windows):** These are wrapper scripts that download and execute the Gradle build system. Use these scripts to build and run the application from the command line. For example: `./gradlew build` (Linux/macOS) or `gradlew build` (Windows).

## Configuration Files

- **`gradle.properties`:** This file contains project-wide Gradle settings, including JVM arguments and Android-specific configurations. You can adjust memory settings (`org.gradle.jvmargs`) here if needed.
- **`app/build.gradle.kts`:** This file configures the app module's build settings, including dependencies, build types, and other build-related options.
- **`app/proguard-rules.pro`:** This file contains ProGuard rules for code obfuscation (used in the release build).

## License

### Disclaimer

This repository contains code created while following the course  
**"Android Jetpack Compose - Build Android Native UIs Fast"** by **Paulo Dichone**,  
available at: [O’Reilly Learning Platform](https://learning.oreilly.com/course/android-jetpack-compose/9781803237718/)

The content is intended for educational purposes only and closely follows the structure and lessons from the original course.

All rights to the course content and materials belong to **Paulo Dichone**.  
This repository is not affiliated with or endorsed by Paulo Dichone or O’Reilly.

If you are the content owner and would like this repository modified or removed, please contact me directly.

## Error Messages

Refer to the Android Studio error messages and logs for debugging help. If you encounter issues, ensure your environment is correctly setup, including Java, Android SDK, and Android Studio. Check the Gradle sync to confirm all dependencies are correctly resolved.

## Screenshots

<p align="center">
<img src="Screenshots/Picture 01.png" width="300" height="550">
<br>
<em>Figure 1: Home screen of the app.</em>
</p>

<p align="center">
<img src="Screenshots/Picture 02.png" width="300" height="550">
<br>
<em>Figure 2: Screenshot before the tip is calculated.</em>
</p>

<p align="center">
<img src="Screenshots/Picture 03.png" width="300" height="550">
<br>
<em>Figure 3: Screenshot after the tip is calculated.</em>
</p>



