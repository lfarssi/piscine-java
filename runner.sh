    echo "Compiling Java files..."
    /usr/bin/javac *.java -d build   # absolute path

    echo "Running the program..."
    /usr/bin/java -cp build ExerciseRunner   # absolute path

    echo "Script completed successfully!"