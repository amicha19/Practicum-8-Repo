# Instructions

## Practicum 8 - Strings in Java

### BACKGROUND<br>
**Comparison and Assignment of Strings**<br><br>
Strings in Java are objects. Variables that store objects contain
the *location* of the object in memory, and not the object
itself. Primitive type variables, on the other hand (such as int, double, char, and boolean) hold the actual value.<br><br>
For example,<br>
`int n = 10`;<br><br>
Here, integer variable `n` has stored in it the value `10`.<br><br>
`String name = "John Jones";`<br><br>
Here, variable `name` contains in it the `memory location` of the
String object "John Jones". Knowing this allows one to understand the results of the comparison and assignment of primitve type vs object-type variables.
<br><br>
Suppose we have the following variable,<br><br>
`int n1 = 10;`<br>
`int n2 = 20;`
<br><br>
What is the result of the Boolean expression `n1 == n1`? If
the contents of the two variables contain `10` and `20`, the result would be `false` since they are not equal.<br><br>
Now what if we had this,<br><br>
`String name1 = "John Jones";`<br>
`String name2 = "John Jones";`
<br><br>
The result of comparison `name1 == name2` would be `false` because `name1` and `name2` have stored in them the location of *each*
of their own string "John Jones", stored in different
memory locations. Thus the contents of variable `name1` and `name2`
(which store locations) are not the same. What *is* the same is the 
contents of the object
that each points to. So how do we compare the contents of an
objects vs. what is in the object variables. We use the `equals`
method,<br><br>
`if(name1.equals(name2)) ...`
<br><br>
There are times when we do want to compare the memory locations
of two object varaibles (we will see the use of this when we
cover linked lists), but generally we mean to compare the two
object values, and therefore we use the `equals` method.
<br><br>
**The Modification of Strings**
<br><br>
String objects (values) are *immutable*. That means that their
values cannot be changed. However, there are methods like
`replace` for String types that allows the replacement of
one character a the String with another, e.g.,
<br><br>
`String name = "John";`<br>
`name.replace('h','a');`
<br><br>
However, if you checked the value of variable `name` after the
replace, it would still be "John" (and not "Joan"). So what does
the replace do? It returns a NEW string with the desired
replacement, with the original string remaining unchanged. So
to change what varaible `name` is equal to, it need to be
**reassigned**,<br><br>
`name = name.replace('h','a');`<br><br>
This updaing of a variable is similar to when we update
an integer variable by 1,<br><br>
`i = i + 1;`
The current value of `i` is used to created the new 
value of `i`.
<br><br>
There is also another String type in Java of StringBuffer.
This string type is *mutable*, that is, its value can be
updated. Therefore, the `replace` method for StringBuffer
type objects actually changes the string,<br><br>
`String name = "John";`<br>
`name.replace(2,3,"a");  // don't worry about the details here`<br>
<br>
This replace does not return a value, but changes the string
the name refers to. Thus, the new value of name would be
`Joan`.
<br>
### WHAT TO DO<br>
Make changes ONLY in lines 19-24 so that you get the results
indicated in lines 26-30. NOTE: We are not going to be making
use of StringBuffer string types. So don't worry about the
difference in the assignment (i.e, `str4 = new ...`) and the use 
of the replace method in this code (i.e., `str4.replace(0,1,"J");`)
If you are interested in the StringBuffer type, you can always
look up the StringBuffer class in the Java API posted online.
