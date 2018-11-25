## install java skd on ubuntu
1. sudo add-apt-repository ppa:linuxuprising/java
2. sudo apt update
3. sudo apt install oracle-java11-installer
4. java --version #verify version 11

## create ssh key and add it to git

1. ssh-keygencat ~/.ssh/id_rsa.pub
2. enter enter enter to the end
3. cat ~/.ssh/id_rsa.pub
4. add key to user setting in git hub



## getting the repo
1. mkdir <name of develop folder>
2.  cd <name of develop folder>
3. git clone git@github.com:jmose27/dice-java.git


## install and setup javac
1. Download and install [[jdk-11.1]] ( https://download.oracle.com/otn-pub/java/jdk/11.0.1+13/90cf5d8f270a4347a95050320eef3fb7/jdk-11.0.1_windows-x64_bin.exe)
2. set the PATH variable on windows:
3. Select Control Panel and then System.
4. Click Advanced and then Environment Variables.
5. Select PATH
6. Edit
7. New
8. Value <C:\Program Files\Java\jdk-11.0.1\bin>
9. Close and reopen git bash
10. Test javac `javac --version`
11. Expected output `javac 11.0.1`



## TO DO:
1. what's the diff between public private protected
2. what is a class
3. How to create and call a class


## Classes and Objects
1. Found this helpful: # Classes and Objects https://www.geeksforgeeks.org/classes-objects-java/
