# Overview
Java is a statically-typed, object-oriented programming language. It's also a platform independent.


# Data Types
There are two broad categories of data types in java:

    * Primitive Types
        Are the basic types that store simple data and form the foundation of data manipulation. 
	We have eight(8) primitive data type defined in Java:
		* int(32 bits), byte(8 bits), short(16 bits), long(64 bits), float(32 bits), double(64 bits), boolean (1 bit), char(16 bits)

	Note: This aren't considered objects are represented raw values.
	      They are stored directly on the stack.

    * Object/Reference Types (Non-primitive types)
        Are objects that contain reference to values and/or other objects or 
        To the special value null to denote the absence of the value.

# Declaring Variables in Java
    To declare a variable in Java, We must specify its name (also called an idetifier) and type. 

    An identifier is a name of any length, consisting of letter, digits, underscore and dollar sign, That conform to the following rules:
        * Starts with a letter, an underscore(_) or a dollar sign($)
        * can't be a reserved keyword
        * can't be true, false (Boolean) or null

# Arrays 
    An array is a reference type that can store a collection of values of a specific type.
    General Syntax of declaring an array in java is:
        type[] identifier = new type[length];
        * The type can be any primitive or Object/Reference type
    To refer to a specific element of an array, or to assign a value to an element, we use the variable name and its index.
    In Java, array index start at zero. The first element of an array is at index 0, the second element is at index 1 and so on.
    Additionally we can get the length of an array by calling the lenght property, By using the identifier

# Java keywords
    Keywords are reserved words that have special meaning in Java.
    For example: public, final, private, class, new, instanceof and so on, We can't use them as identifiers (Variable names).

# Operators in Java
    Opertors are special symbols that perform specific operations on one, two or three operands, and then return the result.
        # Arithmetic Operators 
            * Java supports the following arithmetic operators that can be used for writing mathematical, computational logic
                + (Addition or plus), - (Subtraction), * (Multiplication), / (Division), % (Modulus or remainder)
                Note: Another use of plus(+) is for concatenation(Joining) of Strings to form a whole new String
        # Logical Operators 
            * The Logical Opertors are used for evaluating boolean expressions:
                && (AND), || (OR), !(NOT)
        # Comparison Operators
            * When we need to compare the value of one variable to that of another, we can use Java's comparison operators:
                < (Less than), > (Greater than), >= (Greater than or equal to), <= (Less than or equal to), == (equal to), != (NOT equal to)

# Java Program Structure 
    The basic unit of a Java program is a Class: A class can have one or more fields (sometimes called properties), methods, and even other class members called innter classes.

    For a class to be executable, it must have a main method. The main method signifies the entry point of the program.
    
    The source code for a Java program is stored in a file with an extension of .java

# Compiling and Executing a Program
    To execute the Java source code, We first need to compile it. This process will generate a byte code with the .class file extension.
    We can execute the byte code on any machine that has a Java Runtime Environment (JRE) installed.
    Example: 
        * javac "FileName.java" to Byte code
        * java "ClassFile" to Execute the Byte code to the JRE
