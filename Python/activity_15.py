
def function():
    print(d)

try:
    print(function())
except NameError:
    print("Variable is not yet defined")
finally:
    global d
    d = None
    print("Now defined With Final Blaock")
    function()
    print("Done with execution")