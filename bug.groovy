```groovy
def myMethod(String str) {
  if (str == null) {
    return ""
  }
  // ... rest of the method
}

println myMethod(null) //This will print an empty string
println myMethod("Hello") //This will work as expected
```