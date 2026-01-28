def count(n):
    ls = [i for i in range(n)]
    yield from ls
