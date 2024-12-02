#!/bin/bash

for dir in */; do
    cd "$dir" || continue

    java_file=$(find . -maxdepth 1 -name "*.java" | head -n 1)

    if [ -n "$java_file" ]; then
        javac "$java_file"

        if [ $? -eq 0 ]; then
            prgtest
        else
            echo "Error al compilar en la carpeta $dir"
        fi
    else
        echo "No se encontró ningún archivo .java en la carpeta $dir"
    fi

    cd ..
done
