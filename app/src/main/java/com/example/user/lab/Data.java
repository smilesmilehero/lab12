package com.example.user.lab;

class Data {
    Result result;

    class Result {
        Results[] results;

        class Results {
            String Station;
            String Destination;
        }
    }
}