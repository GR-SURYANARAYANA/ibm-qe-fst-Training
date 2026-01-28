a = 50
print(type(a))
b = "string"
print(type(b))
c = 5.5
print(type(c))
d = True
print(type(d))
e = [1, 2, 3]
print(type(e))
f = (1, 2, 3)
print(type(f))

g = {1, 2, 3}
print(type(g))
h = {"name": "Alice", "age": 25}
print(type(h))
i = None
print(type(i))

j = b'Hello'
print(type(j))
k = bytearray(5)
print(type(k))
l = memoryview(b'Hello')
print(type(l))

a = "string"
a = a[:2] + 'a' + a[3:]
print(a)