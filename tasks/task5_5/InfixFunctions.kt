fun String.longerThan(str: String) = this.length > str.length
if (a.longerThan(b)) {
    ...
}

infix fun String.longerThan(str: String) = this.length > str.length
if (a longerThan b) {
    ...
}
