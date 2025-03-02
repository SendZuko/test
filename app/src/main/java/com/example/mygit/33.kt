package com.example.mygit

fun caesarCipherEncrypt(text: String, key: Int): String {
    val shift = key % 26
    return text.map { char ->
        when (char) {
            in 'A'..'Z' -> 'A' + (char - 'A' + shift) % 26
            in 'a'..'z' -> 'a' + (char - 'a' + shift) % 26
            else -> char // Інші символи не змінюємо
        }
    }.joinToString("")
}

fun main() {
    val text = "HELLO"
    val key = 3
    val encryptedText = caesarCipherEncrypt(text, key)
    println("Encrypted text: $encryptedText")
}
