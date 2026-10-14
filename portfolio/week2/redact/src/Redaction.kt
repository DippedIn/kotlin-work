// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(document: String, textToRedact: String, redactionChar: Char = 'X'): String {
    if (textToRedact.isEmpty()) return document
    return document.replace(textToRedact, redactionChar.toString().repeat(textToRedact.length))
}