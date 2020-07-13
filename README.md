# Hello World OOP

## Story

Making friends on a new neighbourhood is tough, first, learning all of that
names, then say hello to all of them!

[´Hello Janice!´](https://www.youtube.com/watch?v=FrBFfjdRGeA) ...doesn't it
sound better than 'Hello World!'?

## What are you going to learn?

- setup the IDE of your choice,
- creating new `class`,
- instantiate and use `object`,
- `build` and `run`
- and also, running your script from command line with arguments!

## Tasks

1. Create your own class in the project folder with name `App` using the chosen IDE. Make sure you put the class into the proper folder.
    - New `App` class is in `com/codecool/helloworld/app` folder
    - `App` is in package `com.codecool.helloworld.app`

2. Create a main method (entry point) in the `App` class and in the method initialize your own instance of `HelloWorld` and call its welcome method. The app should pass its first command line argument to this method.
    - In class `App` there is a main method as the entry point of your program
    - There is a `HelloWorld` instance created in the main method
    - The welcome method in the `HelloWorld` instance is called with the first command line argument

3. Compile your source files and run `App` with a command line argument using the terminal.
    - Class files are generated from source files
    - Running the `App` from the terminal with a command line argument, it displays `Hello <argument>!` (Example: argument `"Andrew"` prints `Hello Andrew!` to the output)

4. Write the commands used for compiling and running your program into the `make.sh` / `make.ps1` file you can do both actions with one command. Make sure that you can run this file with a command line argument as well.
    - Previously used commands are saved in script file in separated lines
    - Executing `make.sh` with an argument compiles the source code and calls `App` with the given argument to do the `Compile and run` task in one step

5. Compile your source files and run `App` with a command line argument using your chosen IDE.
    - Class files are generated from source files
    - Running the `App` from the IDE with a command line argument, it displays `Hello <argument>!` (Example: argument `"Andrew"` prints `Hello Andrew!` to the output)

## General requirements

None

## Hints

- You can set command line arguments (parameters) in IDEs usually in project
  settings/configuration dialogs.
- Running your `App` class without command line arguments will result in an
  exception (and that's fine). Try to find out why it is happening.

## Starting your project

To start your project click [this link](https://journey.code.cool/v2/project/solo/blueprint/hello-world-oop/java).

## Background materials

- :exclamation: [Interpreted vs. Compiled](https://learn.code.cool/full-stack/#/../pages/csharp/interpreted-vs-compiled.md)
- :exclamation: [Open project in IntelliJ IDEA](https://learn.code.cool/full-stack/#/../pages/tools/open-project-in-intellij-idea.md)
- :exclamation: [How to compile and run Java](https://learn.code.cool/full-stack/#/../pages/java/how-to-compile-and-run-java.md)
- :exclamation: [Introduction to shell scripting](https://www.guru99.com/introduction-to-shell-scripting.html)
- :exclamation: [Positional parameters in shell scripts](http://linuxcommand.org/lc3_wss0120.php)
