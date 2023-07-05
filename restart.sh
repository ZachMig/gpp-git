#!/bin/bash

pkill -f "java"

sleep 15

java -jar /home/ubuntu/build/libs/gpp-0.0.1-SNAPSHOT.jar & disown
