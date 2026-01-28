import pandas as pd

df = pd.read_excel("employees.xlsx",sheet_name="employees")
# df = pd.read_excel("C:\\Users\\SuryanarayanaGR\\Downloads\\Python\\employees.xlsx",sheet_name="employees")
print(df)