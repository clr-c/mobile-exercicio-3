package com.example.myapplication.exercies

class PalindromeExercise {
    fun isPalindrome (word: String): Boolean {
        return word === word.split('').reverse().join('');
    }
}