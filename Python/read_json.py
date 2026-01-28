import json as js

with open('currency.json','r') as fp:
    data = fp.read()

obj = js.loads(data)
print(f"usd :  {str(obj['usd'])} ")
print(f"Inr :  {str(obj['Inr'])} ")
print(f"eur :  {str(obj['eur'])} ")