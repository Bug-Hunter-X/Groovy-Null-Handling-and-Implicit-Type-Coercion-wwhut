```groovy
def myMethod(String str) {
  if (str == null) {
    return ""
  } else {
    // ... rest of the method, explicitly using String methods
    return str.toUpperCase()
  }
}

println myMethod(null) //Prints an empty string
println myMethod("Hello") //Prints "HELLO"

//or even better using the elvis operator
def myMethodImproved(String str) {
  return str?.toUpperCase() ?: ""
}

println myMethodImproved(null) //Prints an empty string
println myMethodImproved("Hello") //Prints "HELLO"
```